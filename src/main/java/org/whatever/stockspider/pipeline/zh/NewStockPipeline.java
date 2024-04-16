package org.whatever.stockspider.pipeline.zh;

import org.springframework.stereotype.Component;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 新股Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class NewStockPipeline implements Pipeline {
    @Override
    public void process(ResultItems resultItems, Task task) {
//        List<StockInfo> stockInfoList = resultItems.get("dataList");
    }
}
