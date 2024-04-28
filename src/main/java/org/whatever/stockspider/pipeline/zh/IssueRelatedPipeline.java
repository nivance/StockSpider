package org.whatever.stockspider.pipeline.zh;

import java.util.Map;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.util.CommonUtil;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.ResultItems;
import us.codecraft.webmagic.Task;
import us.codecraft.webmagic.pipeline.Pipeline;


/**
 * 公司发行信息Pipeline
 *
 * @author limingjian
 */
@Slf4j
@Component
public class IssueRelatedPipeline implements Pipeline {
    @Autowired
    private StockService stockService;

    @Override
    public void process(ResultItems resultItems, Task task) {
        CompanyInfo companyInfo = resultItems.get("dataList");
        String url = resultItems.getRequest().getUrl();
        Map<String, String> paramMap = CommonUtil.parseURLParameters(url);
        // filter=(SECUCODE="601299.SH")
        String code = paramMap.get("filter").split("\"")[1];
        if (!code.contains(companyInfo.getCode())) {
            log.error("【公司发行信息】读取code={}的发行信息页面返回的信息不一致. result={}", code, companyInfo);
            return;
        }
        try {
            stockService.updateCompanyInfo(companyInfo);
            log.info("更新【公司发行信息】 companyInfo={}", companyInfo);
        } catch (Exception e) {
            log.error("{}", companyInfo, e);
        }
    }
}
