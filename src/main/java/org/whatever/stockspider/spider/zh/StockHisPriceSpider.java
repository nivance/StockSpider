package org.whatever.stockspider.spider.zh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.pipeline.zh.StockCodePipeline;
import org.whatever.stockspider.processor.zh.StockCodeProcessor;
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
    private static String STOCK_HIS_PRICE_API_URL = "https://push2his.eastmoney.com/api/qt/stock/kline/get?cb=jQuery351030916149493861744_%s&secid=%s&ut=fa5fd1943c7b386f172d6893dbfba10b&fields1=f1%2Cf2%2Cf3%2Cf4%2Cf5%2Cf6&fields2=f51%2Cf52%2Cf53%2Cf54%2Cf55%2Cf56%2Cf57%2Cf58%2Cf59%2Cf60%2Cf61&klt=101&fqt=1&beg=0&start=19900101&end=20500101&smplmt=460&lmt=1000000&_=%s";

    @Autowired
    private StockCodeProcessor stockCodeProcessor;
    @Autowired
    private StockCodePipeline stockCodePipeline;
    @Autowired
    private StockService stockService;

    @Override
    public void run() {
        new Spider(stockCodeProcessor).addPipeline(stockCodePipeline).addUrl(getUrls()).run();
    }

    @Override
    public String[] getUrls() {
        List<CompanyInfo> companyInfos = stockService.getAllCompany();
        if (CollectionUtils.isEmpty(companyInfos)) {
            return new String[]{};
        }
        long millis = System.currentTimeMillis();
        return companyInfos.stream().map(c -> String.format(STOCK_HIS_PRICE_API_URL, millis, toMartetCode(c), millis)).toArray(String[]::new);
    }

    private String toMartetCode(CompanyInfo companyInfo) {
        return companyInfo.getMarket() + "." + companyInfo.getCode();
    }
}
