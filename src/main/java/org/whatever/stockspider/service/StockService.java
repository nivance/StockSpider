package org.whatever.stockspider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.whatever.stockspider.db.custom.CustomMapper;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoExample;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.db.mapper.CompanyInfoMapper;
import org.whatever.stockspider.db.mapper.DayPriceMapper;

/**
 * StockService
 *
 * @author limingjian
 */
@Service
public class StockService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;
    @Autowired
    private CustomMapper customMapper;
    @Autowired
    private DayPriceMapper dayPriceMapper;

    @Transactional(rollbackFor = Exception.class)
    public void batchInsertCompanyInfo(List<CompanyInfo> companyInfos) {
        companyInfos.forEach(companyInfo -> companyInfoMapper.insertSelective((CompanyInfoWithBLOBs) companyInfo));
    }

    @Transactional(rollbackFor = Exception.class)
    public void batchInsertDayPrice(List<DayPrice> dayPrices) {
        dayPrices.forEach(dayPrice -> dayPriceMapper.insertSelective(dayPrice));
    }

    public void updateCompanyInfo(CompanyInfo companyInfo) {
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andCodeEqualTo(companyInfo.getCode());
        companyInfoMapper.updateByExampleSelective((CompanyInfoWithBLOBs) companyInfo, example);
    }

    public List<CompanyInfo> getAllCompany() {
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andOpenStatusEqualTo(1);
        return companyInfoMapper.selectByExample(example);
    }

    public List<CompanyInfo> getUpupdateCompany() {
        return customMapper.selectUnupdateCompanys();
    }

}
