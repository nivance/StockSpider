package org.whatever.stockspider.spider.zh;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.constants.FailType;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.FailRetryRecord;
import org.whatever.stockspider.listener.StockHisPriceSpiderListener;
import org.whatever.stockspider.pipeline.zh.StockDividentPipeline;
import org.whatever.stockspider.processor.zh.StockDividentProcessor;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 股票分红数据爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockDividentSpider implements Spiderable {
    /**
     * 股票分红数据api获取页面：https://data.eastmoney.com/stockdata/000001.html
     * 页面获取路径：东方财富网 > 数据中心 > 分红送配 > 平安银行 > 平安银行-分红送配
     */
    private static String DIVIDENT_API_URL = "https://datacenter-web.eastmoney.com/api/data/v1/get?callback=jQuery11230440672633803195_{0}&sortColumns=REPORT_DATE&sortTypes=-1&pageSize={1}&pageNumber=1&reportName=RPT_SHAREBONUS_DET&columns=ALL&quoteColumns=&js=%7B%22data%22%3A(x)%2C%22pages%22%3A(tp)%7D&source=WEB&client=WEB&filter=(SECURITY_CODE%3D%22{2}%22)";

    @Autowired
    private StockDividentProcessor stockDividentProcessor;
    @Autowired
    private StockDividentPipeline stockDividentPipeline;
    @Autowired
    private StockHisPriceSpiderListener stockHisPriceSpiderListener;
    @Autowired
    private StockService stockService;

    @Override
    public void run(boolean update) {
        new Spider(stockDividentProcessor).addPipeline(stockDividentPipeline).addUrl(getUrls(update)).thread(4).run();
    }

    @Override
    public String[] getUrls(boolean update) {
        if (update) {
            List<FailRetryRecord> failRetryRecords = stockService.getFailRecord(FailType.DIVIDENT);
            if (CollectionUtils.isEmpty(failRetryRecords)) {
                return new String[]{};
            }
            return failRetryRecords.stream().map(f -> getStockPriceApiUrl(true, f.getCode())).toArray(String[]::new);
        } else {
            List<CompanyInfo> companyInfos = stockService.getAllCompany();
            if (CollectionUtils.isEmpty(companyInfos)) {
                return new String[]{};
            }
            return companyInfos.stream().map(c -> getStockPriceApiUrl(false, c.getCode())).toArray(String[]::new);
        }
    }

    public String getStockPriceApiUrl(boolean update, String code) {
        Long millis = System.currentTimeMillis();
        int pageSize = update ? 2 : 100;
        return MessageFormat.format(DIVIDENT_API_URL, millis.toString(), pageSize, code);
    }
}
