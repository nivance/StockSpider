package org.whatever.stockspider.pipeline.zh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.service.StockService;

import lombok.extern.slf4j.Slf4j;


/**
 * 股票当天价格Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockTodayPricePipeline extends StockHisPricePipeline {

    @Autowired
    private StockService stockService;

    @Transactional(rollbackFor = Exception.class)
    void batchInsert(List<DayPrice> dayPrices) {
        stockService.batchInsertDayPrice(dayPrices);
    }


}
