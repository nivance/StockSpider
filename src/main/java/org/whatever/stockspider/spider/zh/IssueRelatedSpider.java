package org.whatever.stockspider.spider.zh;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.constants.StockPrefix;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.pipeline.zh.IssueRelatedPipeline;
import org.whatever.stockspider.processor.zh.IssueRelatedProcessor;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 公司发行相关爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class IssueRelatedSpider implements Spiderable {

    /**
     * 公司概况api获取页面：https://emweb.securities.eastmoney.com/pc_hsf10/pages/index.html?type=web&code=SZ300059&color=b#/gsgk
     * 进入途径：随便一个股票页面(如：https://quote.eastmoney.com/sz300059.html) -->> 公司概况
     */
    private static String ISSUE_INFO_API_URL = "https://datacenter.eastmoney.com/securities/api/data/v1/get?reportName=RPT_PCF10_ORG_ISSUEINFO&columns=SECUCODE%2CSECURITY_CODE%2CFOUND_DATE%2CLISTING_DATE%2CAFTER_ISSUE_PE%2CONLINE_ISSUE_DATE%2CISSUE_WAY%2CPAR_VALUE%2CTOTAL_ISSUE_NUM%2CISSUE_PRICE%2CDEC_SUMISSUEFEE%2CTOTAL_FUNDS%2CNET_RAISE_FUNDS%2COPEN_PRICE%2CCLOSE_PRICE%2CTURNOVERRATE%2CHIGH_PRICE%2COFFLINE_VAP_RATIO%2CONLINE_ISSUE_LWR&quoteColumns=&filter=(SECUCODE%3D%22{0}%22)&pageNumber=1&pageSize=1&sortTypes=&sortColumns=&source=HSF10&client=PC";

    @Autowired
    private StockService stockService;
    @Autowired
    private IssueRelatedProcessor issueRelatedProcessor;
    @Autowired
    private IssueRelatedPipeline issueRelatedPipeline;

    @Override
    public void run(boolean retry) {
        new Spider(issueRelatedProcessor).addPipeline(issueRelatedPipeline).addUrl(getUrls(retry)).thread(4).run();
    }

    @Override
    public String[] getUrls(boolean retry) {
        List<CompanyInfo> companyInfos = stockService.getEmptyListingDate();
        if (CollectionUtils.isEmpty(companyInfos)) {
            return new String[]{};
        }
        return companyInfos.stream().map(c -> MessageFormat.format(ISSUE_INFO_API_URL, StockPrefix.reverseMartetCode(c.getCode()))).toArray(String[]::new);
    }

}
