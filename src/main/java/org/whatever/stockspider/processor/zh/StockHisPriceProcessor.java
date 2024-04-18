package org.whatever.stockspider.processor.zh;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.processor.MyPageProcessor;
import org.whatever.stockspider.util.CommonUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import us.codecraft.webmagic.Page;

/**
 * 股票历史价格Processor
 *
 * @author limingjian
 */
@Component
public class StockHisPriceProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("(");
        int endIndex = pageString.lastIndexOf(")");
        String jsonString = pageString.substring(startIndex + 1, endIndex);
        JSONObject pageJson = JSONObject.parseObject(jsonString);
        JSONObject dataJson = pageJson.getJSONObject("data");
        String code = dataJson.getString("code");
        String name = dataJson.getString("name");
        JSONArray klinesArray = dataJson.getJSONArray("klines");
        if (Objects.isNull(klinesArray)) {
            return;
        }
        List<DayPrice> dayPrices = new ArrayList<>();
        for (int i = 0; i < klinesArray.size(); i++) {
            dayPrices.add(CommonUtil.toObject(code, name, klinesArray.getString(i)));
        }
        page.putField("dataList", dayPrices);
    }


}
