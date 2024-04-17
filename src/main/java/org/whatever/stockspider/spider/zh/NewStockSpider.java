package org.whatever.stockspider.spider.zh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.pipeline.zh.StockCodePipeline;
import org.whatever.stockspider.processor.zh.NewStockProcessor;
import org.whatever.stockspider.spider.Spiderable;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Spider;

/**
 * 新股爬虫
 *
 * @author limingjian
 */
@Slf4j
@Component
public class NewStockSpider implements Spiderable {
    /**
     * 新股api获取页面：https://quote.eastmoney.com/center/gridlist.html#newshares
     */
    private static String NEW_STOCK_API_URL = "https://push2.eastmoney.com/api/qt/clist/get?cb=jQuery112404074260180250808_%s&pn=1&pz=20&po=1&np=1&ut=bd1d9ddb04089700cf9c27f6f7426281&fltt=2&invt=2&fid=f26&fs=m:0+f:8,m:1+f:8&fields=f1,f2,f3,f4,f5,f6,f7,f8,f9,f10,f12,f13,f14,f15,f16,f17,f18,f20,f21,f23,f24,f25,f26,f22,f11,f62,f128,f136,f115,f152&_=%s";

    @Autowired
    private NewStockProcessor newStockProcessor;
    @Autowired
    private StockCodePipeline stockCodePipeline;

    public void run() {
        new Spider(newStockProcessor).addPipeline(stockCodePipeline).addUrl(getUrls()).run();
    }

    public String[] getUrls() {
        long millis = System.currentTimeMillis();
        String url = String.format(NEW_STOCK_API_URL, millis, millis);
        log.info("获取新股api url={}", url);
        return new String[]{url};
    }

}
