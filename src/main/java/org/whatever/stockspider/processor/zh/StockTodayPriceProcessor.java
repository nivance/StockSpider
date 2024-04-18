package org.whatever.stockspider.processor.zh;

import java.util.Arrays;
import java.util.Date;
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
//        String code = dataJson.getString("f57");
//        String name = dataJson.getString("f58");
        String code = dataJson.getString("code");
        String name = dataJson.getString("name");
        JSONArray klinesArray = dataJson.getJSONArray("klines");
        if (Objects.isNull(klinesArray)) {
            return;
        }
        // 最后那条数据是当天的
        DayPrice dayPrice = CommonUtil.toObject(code, name, klinesArray.getString(klinesArray.size() - 1));
        page.putField("dataList", Arrays.asList(dayPrice));
    }

    /**
     * 将字符串转换为Kline对象
     * 解析数据
     * f43: 26.9,	实时价格
     * f44: 27.23,	最高
     * f45: 26.72,	最底
     * f46: 27.09,	今开
     * f47: 1672064,    成交量
     * f48: 4509427200,	成交额
     * f50: 0.81,	量比
     * f51: 32.77,	涨停
     * f52: 21.85,	跌停
     * f57: "300059",
     * f58: "东方财富",
     * f60: 27.31,		昨收
     * f86: 1608276843,	时间戳（秒）
     * f127: "电子信息",
     * f128: "上海板块",
     * f292: 5,			股票状态，2 交易中，5 已收盘
     *
     * @return
     */
    private DayPrice toObject(String code, String name, JSONObject dataJson) {
        DayPrice dayPrice = new DayPrice();
        dayPrice.setCode(code);
        dayPrice.setName(name);
        dayPrice.setTradingDate(new Date());
        dayPrice.setOpeningPrice(dataJson.getBigDecimal("f46"));
        dayPrice.setClosingPrice(dataJson.getBigDecimal("f43"));
        dayPrice.setPeakPrice(dataJson.getBigDecimal("f44"));
        dayPrice.setBottomPrice(dataJson.getBigDecimal("f45"));
        dayPrice.setTradingVolume(dataJson.getInteger("f47"));
        dayPrice.setTradingAmount(dataJson.getBigDecimal("f48"));
        dayPrice.setAmplitudeRate(dataJson.getBigDecimal(""));  // TODO
        dayPrice.setChangeRate(dataJson.getBigDecimal(""));      // TODO
        dayPrice.setChangeAmount(dataJson.getBigDecimal(""));     // TODO
        dayPrice.setTurnoverRate(dataJson.getBigDecimal(""));   // TODO
        return dayPrice;
    }

}
