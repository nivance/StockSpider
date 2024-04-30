package org.whatever.stockspider.processor.zh;

import java.util.Arrays;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.processor.MyPageProcessor;
import org.whatever.stockspider.util.CommonUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;

/**
 * 股票当天价格Processor
 *
 * @author limingjian
 */
@Slf4j
@Component
public class StockTodayPriceProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String url = page.getRequest().getUrl();
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("(");
        int endIndex = pageString.lastIndexOf(")");
        String jsonString = pageString.substring(startIndex + 1, endIndex);
        JSONObject pageJson = JSONObject.parseObject(jsonString);
        JSONObject dataJson = pageJson.getJSONObject("data");
        log.info("爬取url={} ===>>> 结果数据={}", url, dataJson);
        String code = dataJson.getString("code");
        String name = dataJson.getString("name");
        JSONArray klinesArray = dataJson.getJSONArray("klines");
        if (Objects.isNull(klinesArray) || klinesArray.size() == 0) {
            return;
        }
        // 最后那条数据是当天的
        DayPrice dayPrice = CommonUtil.toObject(code, name, klinesArray.getString(klinesArray.size() - 1));
        page.putField("dataList", Arrays.asList(dayPrice));
    }

}
