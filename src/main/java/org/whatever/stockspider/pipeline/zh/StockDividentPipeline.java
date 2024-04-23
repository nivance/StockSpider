package org.whatever.stockspider.pipeline.zh;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.StockDividend;
import org.whatever.stockspider.service.StockService;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 股票分红Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockDividentPipeline implements Pipeline {
    @Autowired
    private StockService stockService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        List<StockDividend> stockDividends = resultItems.get("dataList");
        stockDividends.forEach(s -> {
            try {
                stockService.insertStockDividend(s);
            } catch (Exception e) {
                log.error("", e);
            }
        });
    }

}
