package org.whatever.stockspider.pipeline.zh;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 全部股票Pipeline
 * @author limingjian
 */
@Slf4j
@Component
public class StockCodePipeline implements Pipeline {
    @Override
    public void process(ResultItems resultItems, Task task) {
        log.info(String.valueOf(resultItems));
//        List<StockInfo> stockInfoList = resultItems.get("dataList");
    }
}
