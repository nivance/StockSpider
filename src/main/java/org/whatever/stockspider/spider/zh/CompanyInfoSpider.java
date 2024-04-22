package org.whatever.stockspider.spider.zh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.constants.StockPrefix;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.pipeline.zh.CompanyInfoPipeline;
import org.whatever.stockspider.processor.zh.CompanyInfoProcessor;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 公司信息爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class CompanyInfoSpider implements Spiderable {

    /**
     * 公司概况api获取页面：https://emweb.securities.eastmoney.com/pc_hsf10/pages/index.html?type=web&code=SZ002552&color=b#/gsgk
     * 进入途径：随便一个股票页面(如：https://quote.eastmoney.com/sz300059.html) -->> 公司概况
     */
    private static String COMPANY_INFO_API_URL = "https://datacenter.eastmoney.com/securities/api/data/v1/get?reportName=RPT_F10_BASIC_ORGINFO&columns=SECUCODE%2CSECURITY_CODE%2CSECURITY_NAME_ABBR%2CORG_CODE%2CORG_NAME%2CORG_NAME_EN%2CFORMERNAME%2CSTR_CODEA%2CSTR_NAMEA%2CSTR_CODEB%2CSTR_NAMEB%2CSTR_CODEH%2CSTR_NAMEH%2CSECURITY_TYPE%2CEM2016%2CTRADE_MARKET%2CINDUSTRYCSRC1%2CPRESIDENT%2CLEGAL_PERSON%2CSECRETARY%2CCHAIRMAN%2CSECPRESENT%2CINDEDIRECTORS%2CORG_TEL%2CORG_EMAIL%2CORG_FAX%2CORG_WEB%2CADDRESS%2CREG_ADDRESS%2CPROVINCE%2CADDRESS_POSTCODE%2CREG_CAPITAL%2CREG_NUM%2CEMP_NUM%2CTATOLNUMBER%2CLAW_FIRM%2CACCOUNTFIRM_NAME%2CORG_PROFILE%2CBUSINESS_SCOPE%2CTRADE_MARKETT%2CTRADE_MARKET_CODE%2CSECURITY_TYPEE%2CSECURITY_TYPE_CODE%2CEXPAND_NAME_ABBR%2CEXPAND_NAME_PINYIN&quoteColumns=&filter=(SECUCODE%3D%22UNICODE%22)&pageNumber=1&pageSize=1&sortTypes=&sortColumns=&source=HSF10&client=PC&v=013715561987724723";

    @Autowired
    private StockService stockService;
    @Autowired
    private CompanyInfoProcessor companyInfoProcessor;
    @Autowired
    private CompanyInfoPipeline companyInfoPipeline;

    @Override
    public void run(boolean retry) {
        new Spider(companyInfoProcessor).addPipeline(companyInfoPipeline).addUrl(getUrls(retry)).thread(4).run();
    }

    @Override
    public String[] getUrls(boolean retry) {
        List<CompanyInfo> companyInfos = stockService.getUpupdateCompany();
        if (CollectionUtils.isEmpty(companyInfos)) {
            return new String[]{};
        }
        return companyInfos.stream().map(c -> COMPANY_INFO_API_URL.replace("UNICODE", StockPrefix.toCodeAfter(c.getCode()))).toArray(String[]::new);
    }

}
