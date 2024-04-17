package org.whatever.stockspider.processor.zh;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import java.util.Objects;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.processor.MyPageProcessor;
import org.whatever.stockspider.util.DateUtil;

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
            dayPrices.add(toObject(code, name, klinesArray.getString(i)));
        }
        page.putField("dataList", dayPrices);
    }

    /**
     * 将字符串转换为Kline对象
     *
     * @param data 示例数据：2000-11-27,7.38,7.61,7.73,7.28,49762,37562000.00,6.06,2.56,0.19,0.00
     * @return
     */
    private DayPrice toObject(String code, String name, String data) {
        String[] split = data.split(",");
        DayPrice dayPrice = new DayPrice();
        dayPrice.setCode(code);
        dayPrice.setName(name);
        dayPrice.setTradingDate(DateUtil.formatDate(split[0], DateUtil.FORMAT_3).toDate());
        dayPrice.setOpeningPrice(new BigDecimal(split[1]));
        dayPrice.setClosingPrice(new BigDecimal(split[2]));
        dayPrice.setPeakPrice(new BigDecimal(split[3]));
        dayPrice.setBottomPrice(new BigDecimal(split[4]));
        dayPrice.setTradingVolume(Integer.valueOf(split[5]));
        dayPrice.setTradingAmount(new BigDecimal(split[6]));
        dayPrice.setAmplitudeRate(new BigDecimal(split[7]));
        dayPrice.setChangeRate(new BigDecimal(split[8]));
        dayPrice.setChangeAmount(new BigDecimal(split[9]));
        dayPrice.setTurnoverRate(new BigDecimal(split[10]));
        return dayPrice;
    }

}
