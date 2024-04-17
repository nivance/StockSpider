package org.whatever.stockspider.util;

import java.io.UnsupportedEncodingException;
import java.net.URLDecoder;
import java.util.HashMap;
import java.util.Map;

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

}
