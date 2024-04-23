package org.whatever.stockspider.processor.zh;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Map;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.StockDividend;
import org.whatever.stockspider.processor.MyPageProcessor;
import org.whatever.stockspider.util.CommonUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import us.codecraft.webmagic.Page;

/**
 * 股票分红Processor
 *
 * @author limingjian
 */
@Component
public class StockDividentProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("(");
        int endIndex = pageString.lastIndexOf(")");
        String jsonString = pageString.substring(startIndex + 1, endIndex);
        JSONObject pageJson = JSONObject.parseObject(jsonString);
        JSONObject dataJson = pageJson.getJSONObject("result");
        JSONArray dividentArray = dataJson.getJSONArray("data");
        if (Objects.isNull(dividentArray)) {
            return;
        }
        List<StockDividend> stockDividends = new ArrayList<>();
        for (int i = 0; i < dividentArray.size(); i++) {
            StockDividend d = toStockDividend(dividentArray.getJSONObject(i));
            if (Objects.nonNull(d)) {
                stockDividends.add(d);
            }
        }
        page.putField("dataList", stockDividends);
    }

    private StockDividend toStockDividend(JSONObject j) {
        StockDividend stockDividend = new StockDividend();
        stockDividend.setCode(j.getString("SECURITY_CODE"));
        stockDividend.setName(j.getString("SECURITY_NAME_ABBR"));
        String implPlan = j.getString("IMPL_PLAN_PROFILE");
        stockDividend.setImplPlanProfile(implPlan);
        // 股权登记日
        if (Objects.isNull(j.getDate("EQUITY_RECORD_DATE"))) {
            return null;
        }
        stockDividend.setEquityRecordDate(j.getDate("EQUITY_RECORD_DATE"));
        // 除权除息日
        stockDividend.setExDividendDate(j.getDate("EX_DIVIDEND_DATE"));
        // 预案公告日
        stockDividend.setPlanNoticeDate(j.getDate("PLAN_NOTICE_DATE"));
        // 最新公告日期
        stockDividend.setNoticeDate(j.getDate("NOTICE_DATE"));
        Map<String, BigDecimal> decimalMap = CommonUtil.extractNumbers(implPlan);
        stockDividend.setBaseShare(decimalMap.get("股").intValue());
        stockDividend.setPretaxBonusRmb(decimalMap.get("派"));
        stockDividend.setAftertaxBonusRmb(decimalMap.get("税后"));
        stockDividend.setHandsel(decimalMap.get("送"));
        stockDividend.setTransfer(decimalMap.get("转"));
        return stockDividend;
    }

}
