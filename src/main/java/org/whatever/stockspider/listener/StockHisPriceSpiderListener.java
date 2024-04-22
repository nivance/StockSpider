package org.whatever.stockspider.listener;

import java.util.Map;
import java.util.Objects;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.constants.FailType;
import org.whatever.stockspider.db.entity.FailRetryRecord;
import org.whatever.stockspider.service.StockService;
import org.whatever.stockspider.util.CommonUtil;
import org.whatever.stockspider.util.DateUtil;

import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Request;
import us.codecraft.webmagic.SpiderListener;

/**
 * SpiderListener
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockHisPriceSpiderListener implements SpiderListener {

    @Autowired
    private StockService stockService;

    @Override
    public void onSuccess(Request request) {

    }

    @Override
    public void onError(Request request) {
        String url = request.getUrl();
        Map<String, String> parameterMap = CommonUtil.parseURLParameters(url);
        String secid = parameterMap.get("secid");
        String code = secid.substring(2, 8);
        String today = DateUtil.formatDate(System.currentTimeMillis());
        FailRetryRecord failRetryRecord = stockService.getFailRecord(code, FailType.DAY_PRICE, 0);
        if (Objects.isNull(failRetryRecord)) {
            failRetryRecord = new FailRetryRecord();
            failRetryRecord.setCode(code);
            failRetryRecord.setTradingDate(today);
            failRetryRecord.setFailType(FailType.DAY_PRICE.name());
            stockService.insertFailRetryRecord(failRetryRecord);
        } else {
            failRetryRecord.setTradingDate(String.join(",", failRetryRecord.getTradingDate(), today));
            failRetryRecord.setCode(null);
            failRetryRecord.setName(null);
            failRetryRecord.setFailType(null);
            failRetryRecord.setRetrySucces(null);
            failRetryRecord.setGmtModified(null);
            failRetryRecord.setGmtCreate(null);
            stockService.updateFailRetryRecord(failRetryRecord);
        }
    }
}


