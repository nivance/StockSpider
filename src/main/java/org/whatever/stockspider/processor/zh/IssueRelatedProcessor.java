package org.whatever.stockspider.processor.zh;

import java.util.Objects;

import org.springframework.stereotype.Component;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.processor.MyPageProcessor;

import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import us.codecraft.webmagic.Page;

/**
 * 公司发行相关Processor
 *
 * @author limingjian
 */
@Component
public class IssueRelatedProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        JSONObject pageJson = JSONObject.parseObject(pageString);
        JSONObject dataJson = pageJson.getJSONObject("result");
        if (Objects.isNull(dataJson)) {
            return;
        }
        JSONArray issueArray = dataJson.getJSONArray("data");
        if (Objects.isNull(issueArray)) {
            return;
        }
        page.putField("dataList", toIssueInfo(issueArray.getJSONObject(0)));
    }

    private CompanyInfo toIssueInfo(JSONObject j) {
        CompanyInfo companyInfo = new CompanyInfoWithBLOBs();
        companyInfo.setCode(j.getString("SECURITY_CODE"));
        companyInfo.setListingDate(j.getDate("LISTING_DATE"));
        companyInfo.setEstablishDate(j.getDate("FOUND_DATE"));
        return companyInfo;
    }

}
