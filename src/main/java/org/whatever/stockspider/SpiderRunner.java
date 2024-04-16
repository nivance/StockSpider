package org.whatever.stockspider;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.boot.ApplicationArguments;
import org.springframework.boot.ApplicationRunner;
import org.springframework.scheduling.annotation.Scheduled;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.spider.zh.StockCodeSpider;

import lombok.extern.slf4j.Slf4j;

/**
 * 爬虫程序启动入口
 */
@Slf4j
@Component
public class SpiderRunner implements ApplicationRunner {

    @Autowired
    private StockCodeSpider stockCodeSpider;

    @Override
    public void run(ApplicationArguments args) {
        stockCodeSpider.run();
    }

    /**
     * 定时执行器，程序启动后立刻执行一次
     */
//    @Scheduled(cron = "${box.spider.cron}")
    public void processNewsSpiderSchedule() {
//        log.info("---------- SpiderSchedule start ----------");
//        simpleSpiderService.runAllSimpleSpider();
//        log.info("---------- SpiderSchedule finished ----------");
    }


    /**
     * 每天 10:00 执行
     */
    @Scheduled(cron = "0 0 10 * * ?")
    public void processCheckTradingDateSchedule() {
        // 检查交易日并记录
//        stockRealTimeSpider.checkAndUpdateTradingDate();
        // 爬取新股
//        newStockSpider.crawNewStockInfo();
    }

    /**
     * 每天 15:30 执行
     */
    @Scheduled(cron = "0 30 15 1/1 * ?")
    public void processStockSpiderSchedule() {
        // 如果当天为交易日，则执行行情数据爬取
//        if (stockSpiderService.checkTradingDate(LocalDate.now())) {
//            stockSpiderService.runKlineSpider(1);
//        }
    }


}
