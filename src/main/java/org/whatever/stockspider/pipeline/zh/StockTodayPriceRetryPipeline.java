package org.whatever.stockspider.pipeline.zh;

import java.util.List;
import java.util.Objects;
import java.util.stream.Collectors;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.springframework.transaction.annotation.Transactional;
import org.whatever.stockspider.constants.FailType;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.db.entity.FailRetryRecord;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.util.DateUtil;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 重新查询今天股票价格Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockTodayPriceRetryPipeline implements Pipeline {
    @Autowired
    private StockService stockService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        List<DayPrice> dayPrices = resultItems.get("dataList");
        String code = dayPrices.get(0).getCode();
        FailRetryRecord failRetryRecord = stockService.getFailRecord(code, FailType.DAY_PRICE, 0);
        if (Objects.isNull(failRetryRecord)) {
            return;
        }
        dayPrices = dayPrices.stream().filter(d -> failRetryRecord.getTradingDate().contains(DateUtil.formatDate(d.getTradingDate().getTime()))).collect(Collectors.toList());
        try {
            updateData(dayPrices, failRetryRecord);
        } catch (Exception e) {
            log.error("", e);
        }
    }

    @Transactional(rollbackFor = Exception.class)
    void updateData(List<DayPrice> dayPrices, FailRetryRecord failRetryRecord) {
        failRetryRecord.setCode(null);
        failRetryRecord.setName(null);
        failRetryRecord.setGmtModified(null);
        failRetryRecord.setRetrySucces(1);
        failRetryRecord.setFailType(null);
        failRetryRecord.setTradingDate(null);
        stockService.batchInsertDayPrice(dayPrices);
        stockService.updateFailRetryRecord(failRetryRecord);
    }
}
