package org.whatever.stockspider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.springframework.util.CollectionUtils;
import org.whatever.stockspider.constants.FailType;
import org.whatever.stockspider.db.custom.CustomMapper;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoExample;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.db.entity.FailRetryRecord;
import org.whatever.stockspider.db.entity.FailRetryRecordExample;
import org.whatever.stockspider.db.mapper.CompanyInfoMapper;
import org.whatever.stockspider.db.mapper.DayPriceMapper;
import org.whatever.stockspider.db.mapper.FailRetryRecordMapper;

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
    @Autowired
    private FailRetryRecordMapper failRetryRecordMapper;

    @Transactional(rollbackFor = Exception.class)
    public void batchInsertCompanyInfo(List<CompanyInfo> companyInfos) {
        companyInfos.forEach(companyInfo -> companyInfoMapper.insertSelective((CompanyInfoWithBLOBs) companyInfo));
    }

    public void batchInsertDayPrice(List<DayPrice> dayPrices) {
        dayPrices.forEach(dayPrice -> dayPriceMapper.insertSelective(dayPrice));
    }

    public void insertFailRetryRecord(FailRetryRecord record) {
        failRetryRecordMapper.insertSelective(record);
    }

    public void updateCompanyInfo(CompanyInfo companyInfo) {
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andCodeEqualTo(companyInfo.getCode());
        companyInfoMapper.updateByExampleSelective((CompanyInfoWithBLOBs) companyInfo, example);
    }

    public void updateFailRetryRecord(FailRetryRecord failRetryRecord) {
        failRetryRecordMapper.updateByPrimaryKeySelective(failRetryRecord);
    }

    public List<CompanyInfo> getAllCompany() {
        CompanyInfoExample example = new CompanyInfoExample();
        example.createCriteria().andOpenStatusEqualTo(1);
        return companyInfoMapper.selectByExample(example);
    }

    public List<CompanyInfo> getUpupdateCompany() {
        return customMapper.selectUnupdateCompanys();
    }

    public List<FailRetryRecord> getFailRecord(FailType failType) {
        FailRetryRecordExample example = new FailRetryRecordExample();
        example.createCriteria().andFailTypeEqualTo(failType.name()).andRetrySuccesEqualTo(0);
        return failRetryRecordMapper.selectByExample(example);
    }

    public FailRetryRecord getFailRecord(String code, FailType failType, int succes) {
        FailRetryRecordExample example = new FailRetryRecordExample();
        example.createCriteria().andCodeEqualTo(code).andFailTypeEqualTo(failType.name()).andRetrySuccesEqualTo(succes);
        List<FailRetryRecord> failRetryRecords = failRetryRecordMapper.selectByExample(example);
        return CollectionUtils.isEmpty(failRetryRecords) ? null : failRetryRecords.get(0);
    }

}
