package org.whatever.stockspider.pipeline.zh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.dao.DuplicateKeyException;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.service.StockService;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 股票历史价格Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockHisPricePipeline implements Pipeline {
    @Autowired
    private StockService stockService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        List<DayPrice> dayPrices = resultItems.get("dataList");
        try {
            batchInsert(dayPrices);
        } catch (DuplicateKeyException e) {
            log.info("{}", e.getCause(), e);
        } catch (Exception e) {
            log.error("", e);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    void batchInsert(List<DayPrice> dayPrices) {
        stockService.batchInsertDayPrice(dayPrices);
    }
}
