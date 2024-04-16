package org.whatever.stockspider.spider.zh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.pipeline.zh.StockCodePipeline;
import org.whatever.stockspider.processor.zh.StockCodeProcessor;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 股票代码
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockCodeSpider implements Spiderable {
    /**
     * 全部股票api获取页面：https://quote.eastmoney.com/center/gridlist.html#hs_a_board
     */
    private static String ALL_STOCK_API_URL = "https://push2.eastmoney.com/api/qt/clist/get?cb=jQuery112407401737954072696_%s&pn=1&pz=%d&po=1&np=1&ut=bd1d9ddb04089700cf9c27f6f7426281&fltt=2&invt=2&fid=f3&fs=m:0+t:6,m:0+t:80,m:1+t:2,m:1+t:23,m:0+t:81+s:2048&fields=f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18,f20,f21,f23,f24,f25,f22,f11,f62,f128,f136,f115,f152&_=%s";

    @Autowired
    private StockCodeProcessor stockCodeProcessor;
    @Autowired
    private StockCodePipeline stockCodePipeline;

    @Override
    public void run() {
        new Spider(stockCodeProcessor).addPipeline(stockCodePipeline).addUrl(getUrls()).run();
    }

    @Override
    public String[] getUrls() {
        long millis = System.currentTimeMillis();
        // 股票数
        int stockSize = 10000;
        String url = String.format(ALL_STOCK_API_URL, millis, stockSize, millis);
        log.info("全部股票api url={}", url);
        return new String[]{url};
    }
}
