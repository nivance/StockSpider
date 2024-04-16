package org.whatever.stockspider.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import org.springframework.transaction.annotation.Transactional;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;
import org.whatever.stockspider.db.mapper.CompanyInfoMapper;

/**
 * StockService
 *
 * @author limingjian
 */
@Service
public class StockService {

    @Autowired
    private CompanyInfoMapper companyInfoMapper;

    @Transactional(rollbackFor = Exception.class)
    public void batchInsertCompanyInfo(List<CompanyInfo> companyInfos) {
        companyInfos.forEach(companyInfo -> companyInfoMapper.insertSelective((CompanyInfoWithBLOBs) companyInfo));
    }

}