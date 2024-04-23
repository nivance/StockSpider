package org.whatever.stockspider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.spider.zh.CompanyInfoSpider;
import org.whatever.stockspider.spider.zh.NewStockSpider;
import org.whatever.stockspider.spider.zh.StockCodeSpider;
import org.whatever.stockspider.spider.zh.StockDividentSpider;
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
    @Autowired
    private StockDividentSpider stockDividentSpider;

    @Override
    public void run(ApplicationArguments args) {
        // 初始化数据的时候使用
        // stockCodeSpider.run(false);
        // stockHisPriceSpider.run(false);
        // retryStockPrice();
        // updateStockPrice();
        stockDividentSpider.run(false);
    }


    @Autowired
    private NewStockSpider newStockSpider;

    /**
     * 每天 10:00 执行 【爬取新股】
     */
    @Scheduled(cron = "0 0 10 * * ?")
    public void newStock() {
        log.info("----开始爬取新股");
        newStockSpider.run(false);
    }

    @Autowired
    private CompanyInfoSpider companyInfoSpider;

    /**
     * 每天 12:00 执行 【更新公司信息】
     */
    @Scheduled(cron = "0 0 12 * * ?")
    public void updateCompanyInfo() {
        log.info("----开始更新公司信息");
        companyInfoSpider.run(false);
    }

    @Autowired
    private StockTodayPriceSpider stockTodayPriceSpider;

    /**
     * 每天 15:30 执行 【行情数据爬取】
     */
    @Scheduled(cron = "0 30 15 * * ?")
    public void updateStockPrice() {
        log.info("----开始更新今天行情数据");
        if (!DateUtil.isWeekend(System.currentTimeMillis())) {
            stockTodayPriceSpider.run(false);
        }
    }

    /**
     * 每天 6:30, 18:30, 23:30 执行 【每天行情数据失败重查】
     */
    @Scheduled(cron = "0 30 6,18,23 * * ?")
    public void retryStockPrice() {
        log.info("----开始重试查询今天更新失败的行情数据");
        if (!DateUtil.isWeekend(System.currentTimeMillis())) {
            stockHisPriceSpider.run(true);
        }
    }

    /**
     * 每个月第1天执行 【分红数据爬取】
     */
    @Scheduled(cron = "0 0 0 1 * *")
    public void updateStockDivident() {
        log.info("----开始更新分红数据");
        stockDividentSpider.run(false);
    }

}
