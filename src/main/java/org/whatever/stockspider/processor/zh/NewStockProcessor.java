package org.whatever.stockspider.processor.zh;

import java.util.ArrayList;
import java.util.Date;
import java.util.List;

import org.apache.commons.lang3.StringUtils;
import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.processor.MyPageProcessor;
import org.whatever.stockspider.util.DateUtil;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import lombok.extern.slf4j.Slf4j;
import us.codecraft.webmagic.Page;

/**
 * 新股Processor
 *
 * @author limingjian
 */
@Slf4j
@Component
public class NewStockProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String url = page.getRequest().getUrl();
        log.info("爬取url={}", url);
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("[");
        int endIndex = pageString.lastIndexOf("]");
        String jsonString = pageString.substring(startIndex, endIndex + 1);
        log.info("新股爬取结果={}", jsonString);
        JSONArray dataList = JSONArray.parseArray(jsonString);
        List<CompanyInfo> companyInfos = new ArrayList<>();
        Date date = new Date();
        String today = DateUtil.formatDate(System.currentTimeMillis(), DateUtil.FORMAT_4);
        for (int i = 0; i < dataList.size(); i++) {
            JSONObject data = dataList.getJSONObject(i);
            String day = data.getString("f26");
            if (StringUtils.equals(today, day)) {
                CompanyInfoWithBLOBs companyInfo = new CompanyInfoWithBLOBs();
                companyInfo.setCode(data.getString("f12"));
                companyInfo.setName(data.getString("f14"));
                companyInfo.setListingDate(date);
                companyInfos.add(companyInfo);
            }
        }
        page.putField("dataList", companyInfos);
    }

}
