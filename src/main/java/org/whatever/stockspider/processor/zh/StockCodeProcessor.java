package org.whatever.stockspider.processor.zh;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.processor.MyPageProcessor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import us.codecraft.webmagic.Page;

/**
 * 全部股票Processor
 *
 * @author limingjian
 */
@Component
public class StockCodeProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("[");
        int endIndex = pageString.lastIndexOf("]");
        String jsonString = pageString.substring(startIndex, endIndex + 1);
        JSONArray dataList = JSONArray.parseArray(jsonString);
        List<CompanyInfo> companyInfos = new ArrayList<>();
        for (int i = 0; i < dataList.size(); i++) {
            JSONObject data = dataList.getJSONObject(i);
            CompanyInfoWithBLOBs companyInfo = new CompanyInfoWithBLOBs();
            String code = data.getString("f12");
            companyInfo.setCode(code);
            String name = data.getString("f14");
            companyInfo.setName(name);
            companyInfos.add(companyInfo);
        }
        page.putField("dataList", companyInfos);
    }

}
