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
 * 公司信息Processor
 *
 * @author limingjian
 */
@Component
public class CompanyInfoProcessor extends MyPageProcessor {

    @Override
    public void process(Page page) {
        String pageString = page.getRawText();
        int startIndex = pageString.indexOf("[");
        int endIndex = pageString.lastIndexOf("]");
        String jsonString = pageString.substring(startIndex, endIndex + 1);
        JSONArray dataList = JSONArray.parseArray(jsonString);
        JSONObject data = dataList.getJSONObject(0);
        CompanyInfoWithBLOBs companyInfo = new CompanyInfoWithBLOBs();
        companyInfo.setAddress(data.getString("ADDRESS"));
        companyInfo.setAddressPostcode(data.getString("ADDRESS_POSTCODE"));
        companyInfo.setChairman(data.getString("CHAIRMAN"));
        companyInfo.setLegalPerson(data.getString("LEGAL_PERSON"));
        companyInfo.setBusinessScope(data.getString("BUSINESS_SCOPE"));
        companyInfo.setCode(data.getString("STR_CODEA"));
        companyInfo.setOrgProfile(data.getString("ORG_PROFILE").trim());
        companyInfo.setIndedirectors(data.getString("INDEDIRECTORS"));
        companyInfo.setIndustry(data.getString("EM2016"));
        companyInfo.setNation("CHN");
        companyInfo.setOrgName(data.getString("ORG_NAME"));
        companyInfo.setOrgNameEn(data.getString("ORG_NAME_EN"));
        companyInfo.setOrgTel(data.getString("ORG_TEL"));
        companyInfo.setOrgWeb(data.getString("ORG_WEB"));
        companyInfo.setProvince(data.getString("PROVINCE"));
        companyInfo.setRegAddress(data.getString("PROVINCE"));
        companyInfo.setRegCapital(data.getInteger("REG_CAPITAL"));
        companyInfo.setRegNum(data.getString("REG_NUM"));
        companyInfo.setSecucode(data.getString("SECUCODE"));
        companyInfo.setSecurityType(data.getString("SECURITY_TYPE"));
        page.putField("companyInfo", companyInfo);
    }

}
