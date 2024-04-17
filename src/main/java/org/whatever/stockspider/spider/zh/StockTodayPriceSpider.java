package org.whatever.stockspider.spider.zh;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.util.DateUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 股票当天价格爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockTodayPriceSpider extends StockHisPriceSpider {
    /**
     * 股票历史价格api获取页面：https://quote.eastmoney.com/sz000063.html
     */
    private static String STOCK_PRICE_API_URL = "https://push2his.eastmoney.com/api/qt/stock/kline/get?cb=jQuery351030916149493861744_%s&secid=%s&ut=fa5fd1943c7b386f172d6893dbfba10b&fields1=f1%2Cf2%2Cf3%2Cf4%2Cf5%2Cf6&fields2=f51%2Cf52%2Cf53%2Cf54%2Cf55%2Cf56%2Cf57%2Cf58%2Cf59%2Cf60%2Cf61&klt=101&fqt=1&beg=0&start=%s&end=20500101&smplmt=460&lmt=1000000&_=%s";


    public String getStockPriceApiUrl(CompanyInfo companyInfo) {
        long millis = System.currentTimeMillis();
        String today = DateUtil.formatDate(millis, DateUtil.FORMAT_4);
        return String.format(STOCK_PRICE_API_URL, millis, toMartetCode(companyInfo), today, millis);
    }

}
