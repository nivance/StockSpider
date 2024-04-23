package org.whatever.stockspider.util;

import java.io.UnsupportedEncodingException;
import java.math.BigDecimal;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

import org.whatever.stockspider.db.entity.DayPrice;

import lombok.extern.slf4j.Slf4j;

/**
 * @author limingjian
 */
@Slf4j
public class CommonUtil {

    /**
     * 读取url中的参数
     *
     * @param url
     * @return
     */
    public static Map<String, String> parseURLParameters(String url) {
        try {
            url = URLDecoder.decode(url, "UTF-8");
        } catch (UnsupportedEncodingException e) {
        }

        Map<String, String> paramsMap = new HashMap<>();

        // 判断URL中是否包含参数部分
        int index = url.indexOf("?");
        if (index != -1) {
            String queryString = url.substring(index + 1);
            String[] params = queryString.split("&");

            for (String param : params) {
                String[] keyValue = param.split("=", 2);
                String key = keyValue[0];
                String value = keyValue.length > 1 ? keyValue[1] : "";

                // 将参数存储在Map中
                paramsMap.put(key, value);
            }
        }
        return paramsMap;
    }

    /**
     * 将字符串转换为Kline对象
     *
     * @param data 示例数据：2000-11-27,7.38,7.61,7.73,7.28,49762,37562000.00,6.06,2.56,0.19,0.00
     * @return
     */
    public static DayPrice toObject(String code, String name, String data) {
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

    private static Pattern pattern = Pattern.compile("(?<key>[\u4e00-\u9fa5]{0,2}?)(?<value>\\d+(?:\\.\\d{1,2})?)");

    /**
     * 提取分红数值
     * 分红表达式：10送3.50转5.00派3.00元(含税,扣税后2.40元)
     *
     * @param expression
     * @return
     */
    public static Map<String, BigDecimal> extractNumbers(String expression) {
        Map<String, BigDecimal> numbers = new HashMap<>();
        // 定义正则表达式模式
        Matcher matcher = pattern.matcher(expression);
        int keyIndex = 1;
        // 匹配并提取数字
        while (matcher.find()) {
            String key = matcher.group("key").isEmpty() ? "股" : matcher.group("key");
            BigDecimal value = BigDecimal.valueOf(Float.valueOf(matcher.group("value")));
            numbers.put(key, value);
        }
        return numbers;
    }

}
