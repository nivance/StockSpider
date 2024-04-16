package org.whatever.stockspider.processor.zh;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.processor.MyPageProcessor;

import com.alibaba.fastjson.JSONArray;
import us.codecraft.webmagic.Page;

/**
 * 新股Processor
 *
 * @author limingjian
 */
@Component
public class NewStockProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("[");
        int endIndex = pageString.lastIndexOf("]");
        String jsonString = pageString.substring(startIndex, endIndex + 1);
        JSONArray dataList = JSONArray.parseArray(jsonString);
//        List<StockInfo> stockInfoList = new ArrayList<>();
//        Date today = new Date(System.currentTimeMillis());
//        for (int i = 0; i < dataList.size(); i++) {
//            JSONObject data = dataList.getJSONObject(i);
//            Date listingdate = data.getDate("listingdate");
//            if (DateUtil.isSameDate(today, listingdate)) {
//                StockInfo stockInfo = new StockInfo();
//                String code = data.getString("securitycode");
//                stockInfo.setCode(data.getString("companycode"));
//                stockInfo.setName(code);
//                stockInfo.setIndustry(data.getString("INDUSTRY"));
//                stockInfo.setMarket(getMarket(code));
//                stockInfoList.add(stockInfo);
//            }
//        }
//        page.putField("dataList", stockInfoList);
    }

}
