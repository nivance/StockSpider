package org.whatever.stockspider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.spider.zh.CompanyInfoSpider;
import org.whatever.stockspider.spider.zh.NewStockSpider;
import org.whatever.stockspider.spider.zh.StockCodeSpider;
import org.whatever.stockspider.spider.zh.StockHisPriceSpider;
import org.whatever.stockspider.spider.zh.StockTodayPriceSpider;
import org.whatever.stockspider.util.DateUtil;

import lombok.extern.slf4j.Slf4j;

/**
 * 爬虫程序启动入口
 */
@Slf4j
@Component
public class SpiderRunner implements ApplicationRunner {

    @Autowired
    private StockCodeSpider stockCodeSpider;
    @Autowired
    private StockHisPriceSpider stockHisPriceSpider;

    @Override
    public void run(ApplicationArguments args) {
        // 初始化数据的时候使用
        // stockCodeSpider.run();
        // stockHisPriceSpider.run();
    }


    @Autowired
    private NewStockSpider newStockSpider;

    /**
     * 每天 10:00 执行 【爬取新股】
     */
    @Scheduled(cron = "0 0 10 * * ?")
    public void newStock() {
        newStockSpider.run();
    }

    @Autowired
    private CompanyInfoSpider companyInfoSpider;

    /**
     * 每天 12:00 执行 【更新公司信息】
     */
    @Scheduled(cron = "0 0 12 * * ?")
    public void updateCompanyInfo() {
        companyInfoSpider.run();
    }

    @Autowired
    private StockTodayPriceSpider stockTodayPriceSpider;

    /**
     * 每天 15:30 执行 【行情数据爬取】
     */
    @Scheduled(cron = "0 30 15 * * ?")
    public void updateStockPrice() {
        if (!DateUtil.isWeekend(System.currentTimeMillis())) {
            stockTodayPriceSpider.run();
        }
    }


}
