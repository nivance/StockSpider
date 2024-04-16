package org.whatever.stockspider.pipeline.zh;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.service.StockService;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 公司信息Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class CompanyInfoPipeline implements Pipeline {
    @Autowired
    private StockService stockService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        CompanyInfo companyInfo = resultItems.get("companyInfo");
        stockService.updateCompanyInfo(companyInfo);
    }
}
