package org.whatever.stockspider.spider.zh;

import java.text.MessageFormat;
import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.constants.StockPrefix;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.pipeline.zh.StockHisPricePipeline;
import org.whatever.stockspider.processor.zh.StockHisPriceProcessor;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 股票历史价格爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockHisPriceSpider implements Spiderable {
    /**
     * 股票历史价格api获取页面：https://quote.eastmoney.com/sz000063.html
     */
    private static String STOCK_HIS_PRICE_API_URL = "https://push2his.eastmoney.com/api/qt/stock/kline/get?cb=jQuery351030916149493861744_{0}&secid={1}&ut=fa5fd1943c7b386f172d6893dbfba10b&fields1=f1%2Cf2%2Cf3%2Cf4%2Cf5%2Cf6&fields2=f51%2Cf52%2Cf53%2Cf54%2Cf55%2Cf56%2Cf57%2Cf58%2Cf59%2Cf60%2Cf61&klt=101&fqt=1&beg=0&start=19900101&end=20500101&smplmt=460&lmt=1000000&_={2}";

    @Autowired
    private StockHisPriceProcessor stockHisPriceProcessor;
    @Autowired
    private StockHisPricePipeline stockHisPricePipeline;
    @Autowired
    private StockService stockService;

    @Override
    public void run() {
        new Spider(stockHisPriceProcessor).addPipeline(stockHisPricePipeline).addUrl(getUrls()).thread(8).run();
    }

    @Override
    public String[] getUrls() {
        List<CompanyInfo> companyInfos = stockService.getAllCompany();
        if (CollectionUtils.isEmpty(companyInfos)) {
            return new String[]{};
        }
        return companyInfos.stream().map(c -> getStockPriceApiUrl(c)).toArray(String[]::new);
    }

    protected String getStockPriceApiUrl(CompanyInfo companyInfo) {
        Long millis = System.currentTimeMillis();
        return MessageFormat.format(STOCK_HIS_PRICE_API_URL, millis.toString(), StockPrefix.toMartetCode(companyInfo.getCode()), millis.toString());
    }

}
