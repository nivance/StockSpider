package org.whatever.stockspider.db.mapper;

import static org.apache.ibatis.jdbc.SqlBuilder.BEGIN;
import static org.apache.ibatis.jdbc.SqlBuilder.DELETE_FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.FROM;
import static org.apache.ibatis.jdbc.SqlBuilder.INSERT_INTO;
import static org.apache.ibatis.jdbc.SqlBuilder.ORDER_BY;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT;
import static org.apache.ibatis.jdbc.SqlBuilder.SELECT_DISTINCT;
import static org.apache.ibatis.jdbc.SqlBuilder.SET;
import static org.apache.ibatis.jdbc.SqlBuilder.SQL;
import static org.apache.ibatis.jdbc.SqlBuilder.UPDATE;
import static org.apache.ibatis.jdbc.SqlBuilder.VALUES;
import static org.apache.ibatis.jdbc.SqlBuilder.WHERE;

import java.util.List;
import java.util.Map;
import org.whatever.stockspider.db.entity.CompanyInfoExample.Criteria;
import org.whatever.stockspider.db.entity.CompanyInfoExample.Criterion;
import org.whatever.stockspider.db.entity.CompanyInfoExample;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;

public class CompanyInfoSqlProvider {

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String countByExample(CompanyInfoExample example) {
        BEGIN();
        SELECT("count(*)");
        FROM("company_info");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String deleteByExample(CompanyInfoExample example) {
        BEGIN();
        DELETE_FROM("company_info");
        applyWhere(example, false);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String insertSelective(CompanyInfoWithBLOBs record) {
        BEGIN();
        INSERT_INTO("company_info");
        
        if (record.getId() != null) {
            VALUES("ID", "#{id,jdbcType=BIGINT}");
        }
        
        if (record.getCode() != null) {
            VALUES("CODE", "#{code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            VALUES("NAME", "#{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            VALUES("ORG_NAME", "#{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgNameEn() != null) {
            VALUES("ORG_NAME_EN", "#{orgNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustry() != null) {
            VALUES("INDUSTRY", "#{industry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgTel() != null) {
            VALUES("ORG_TEL", "#{orgTel,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgWeb() != null) {
            VALUES("ORG_WEB", "#{orgWeb,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            VALUES("PROVINCE", "#{province,jdbcType=VARCHAR}");
        }
        
        if (record.getRegAddress() != null) {
            VALUES("REG_ADDRESS", "#{regAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            VALUES("ADDRESS", "#{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressPostcode() != null) {
            VALUES("ADDRESS_POSTCODE", "#{addressPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessScope() != null) {
            VALUES("BUSINESS_SCOPE", "#{businessScope,jdbcType=VARCHAR}");
        }
        
        if (record.getChairman() != null) {
            VALUES("CHAIRMAN", "#{chairman,jdbcType=VARCHAR}");
        }
        
        if (record.getIndedirectors() != null) {
            VALUES("INDEDIRECTORS", "#{indedirectors,jdbcType=VARCHAR}");
        }
        
        if (record.getLegalPerson() != null) {
            VALUES("LEGAL_PERSON", "#{legalPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getRegNum() != null) {
            VALUES("REG_NUM", "#{regNum,jdbcType=VARCHAR}");
        }
        
        if (record.getRegCapital() != null) {
            VALUES("REG_CAPITAL", "#{regCapital,jdbcType=INTEGER}");
        }
        
        if (record.getSecucode() != null) {
            VALUES("SECUCODE", "#{secucode,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            VALUES("SECURITY_TYPE", "#{securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getMarket() != null) {
            VALUES("MARKET", "#{market,jdbcType=INTEGER}");
        }
        
        if (record.getOpenStatus() != null) {
            VALUES("OPEN_STATUS", "#{openStatus,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            VALUES("TYPE", "#{type,jdbcType=INTEGER}");
        }
        
        if (record.getListingDate() != null) {
            VALUES("LISTING_DATE", "#{listingDate,jdbcType=DATE}");
        }
        
        if (record.getNation() != null) {
            VALUES("NATION", "#{nation,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            VALUES("GMT_CREATE", "#{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            VALUES("GMT_MODIFIED", "#{gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEstablishDate() != null) {
            VALUES("ESTABLISH_DATE", "#{establishDate,jdbcType=DATE}");
        }
        
        if (record.getOrgProfile() != null) {
            VALUES("ORG_PROFILE", "#{orgProfile,jdbcType=LONGVARCHAR}");
        }
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String selectByExampleWithBLOBs(CompanyInfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("CODE");
        SELECT("NAME");
        SELECT("ORG_NAME");
        SELECT("ORG_NAME_EN");
        SELECT("INDUSTRY");
        SELECT("ORG_TEL");
        SELECT("ORG_WEB");
        SELECT("PROVINCE");
        SELECT("REG_ADDRESS");
        SELECT("ADDRESS");
        SELECT("ADDRESS_POSTCODE");
        SELECT("BUSINESS_SCOPE");
        SELECT("CHAIRMAN");
        SELECT("INDEDIRECTORS");
        SELECT("LEGAL_PERSON");
        SELECT("REG_NUM");
        SELECT("REG_CAPITAL");
        SELECT("SECUCODE");
        SELECT("SECURITY_TYPE");
        SELECT("MARKET");
        SELECT("OPEN_STATUS");
        SELECT("TYPE");
        SELECT("LISTING_DATE");
        SELECT("NATION");
        SELECT("GMT_CREATE");
        SELECT("GMT_MODIFIED");
        SELECT("ESTABLISH_DATE");
        SELECT("ORG_PROFILE");
        FROM("company_info");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example != null){
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String selectByExample(CompanyInfoExample example) {
        BEGIN();
        if (example != null && example.isDistinct()) {
            SELECT_DISTINCT("ID");
        } else {
            SELECT("ID");
        }
        SELECT("CODE");
        SELECT("NAME");
        SELECT("ORG_NAME");
        SELECT("ORG_NAME_EN");
        SELECT("INDUSTRY");
        SELECT("ORG_TEL");
        SELECT("ORG_WEB");
        SELECT("PROVINCE");
        SELECT("REG_ADDRESS");
        SELECT("ADDRESS");
        SELECT("ADDRESS_POSTCODE");
        SELECT("BUSINESS_SCOPE");
        SELECT("CHAIRMAN");
        SELECT("INDEDIRECTORS");
        SELECT("LEGAL_PERSON");
        SELECT("REG_NUM");
        SELECT("REG_CAPITAL");
        SELECT("SECUCODE");
        SELECT("SECURITY_TYPE");
        SELECT("MARKET");
        SELECT("OPEN_STATUS");
        SELECT("TYPE");
        SELECT("LISTING_DATE");
        SELECT("NATION");
        SELECT("GMT_CREATE");
        SELECT("GMT_MODIFIED");
        SELECT("ESTABLISH_DATE");
        FROM("company_info");
        applyWhere(example, false);
        
        if (example != null && example.getOrderByClause() != null) {
            ORDER_BY(example.getOrderByClause());
        }
        
        if(example != null){
            return SQL().concat(" limit "+example.getOffset()+","+example.getLimit());
        }
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String updateByExampleSelective(Map<String, Object> parameter) {
        CompanyInfoWithBLOBs record = (CompanyInfoWithBLOBs) parameter.get("record");
        CompanyInfoExample example = (CompanyInfoExample) parameter.get("example");
        
        BEGIN();
        UPDATE("company_info");
        
        if (record.getId() != null) {
            SET("ID = #{record.id,jdbcType=BIGINT}");
        }
        
        if (record.getCode() != null) {
            SET("CODE = #{record.code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("NAME = #{record.name,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            SET("ORG_NAME = #{record.orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgNameEn() != null) {
            SET("ORG_NAME_EN = #{record.orgNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustry() != null) {
            SET("INDUSTRY = #{record.industry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgTel() != null) {
            SET("ORG_TEL = #{record.orgTel,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgWeb() != null) {
            SET("ORG_WEB = #{record.orgWeb,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("PROVINCE = #{record.province,jdbcType=VARCHAR}");
        }
        
        if (record.getRegAddress() != null) {
            SET("REG_ADDRESS = #{record.regAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressPostcode() != null) {
            SET("ADDRESS_POSTCODE = #{record.addressPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessScope() != null) {
            SET("BUSINESS_SCOPE = #{record.businessScope,jdbcType=VARCHAR}");
        }
        
        if (record.getChairman() != null) {
            SET("CHAIRMAN = #{record.chairman,jdbcType=VARCHAR}");
        }
        
        if (record.getIndedirectors() != null) {
            SET("INDEDIRECTORS = #{record.indedirectors,jdbcType=VARCHAR}");
        }
        
        if (record.getLegalPerson() != null) {
            SET("LEGAL_PERSON = #{record.legalPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getRegNum() != null) {
            SET("REG_NUM = #{record.regNum,jdbcType=VARCHAR}");
        }
        
        if (record.getRegCapital() != null) {
            SET("REG_CAPITAL = #{record.regCapital,jdbcType=INTEGER}");
        }
        
        if (record.getSecucode() != null) {
            SET("SECUCODE = #{record.secucode,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getMarket() != null) {
            SET("MARKET = #{record.market,jdbcType=INTEGER}");
        }
        
        if (record.getOpenStatus() != null) {
            SET("OPEN_STATUS = #{record.openStatus,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            SET("TYPE = #{record.type,jdbcType=INTEGER}");
        }
        
        if (record.getListingDate() != null) {
            SET("LISTING_DATE = #{record.listingDate,jdbcType=DATE}");
        }
        
        if (record.getNation() != null) {
            SET("NATION = #{record.nation,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            SET("GMT_CREATE = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            SET("GMT_MODIFIED = #{record.gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEstablishDate() != null) {
            SET("ESTABLISH_DATE = #{record.establishDate,jdbcType=DATE}");
        }
        
        if (record.getOrgProfile() != null) {
            SET("ORG_PROFILE = #{record.orgProfile,jdbcType=LONGVARCHAR}");
        }
        
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String updateByExampleWithBLOBs(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("company_info");
        
        SET("ID = #{record.id,jdbcType=BIGINT}");
        SET("CODE = #{record.code,jdbcType=VARCHAR}");
        SET("NAME = #{record.name,jdbcType=VARCHAR}");
        SET("ORG_NAME = #{record.orgName,jdbcType=VARCHAR}");
        SET("ORG_NAME_EN = #{record.orgNameEn,jdbcType=VARCHAR}");
        SET("INDUSTRY = #{record.industry,jdbcType=VARCHAR}");
        SET("ORG_TEL = #{record.orgTel,jdbcType=VARCHAR}");
        SET("ORG_WEB = #{record.orgWeb,jdbcType=VARCHAR}");
        SET("PROVINCE = #{record.province,jdbcType=VARCHAR}");
        SET("REG_ADDRESS = #{record.regAddress,jdbcType=VARCHAR}");
        SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        SET("ADDRESS_POSTCODE = #{record.addressPostcode,jdbcType=VARCHAR}");
        SET("BUSINESS_SCOPE = #{record.businessScope,jdbcType=VARCHAR}");
        SET("CHAIRMAN = #{record.chairman,jdbcType=VARCHAR}");
        SET("INDEDIRECTORS = #{record.indedirectors,jdbcType=VARCHAR}");
        SET("LEGAL_PERSON = #{record.legalPerson,jdbcType=VARCHAR}");
        SET("REG_NUM = #{record.regNum,jdbcType=VARCHAR}");
        SET("REG_CAPITAL = #{record.regCapital,jdbcType=INTEGER}");
        SET("SECUCODE = #{record.secucode,jdbcType=VARCHAR}");
        SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        SET("MARKET = #{record.market,jdbcType=INTEGER}");
        SET("OPEN_STATUS = #{record.openStatus,jdbcType=INTEGER}");
        SET("TYPE = #{record.type,jdbcType=INTEGER}");
        SET("LISTING_DATE = #{record.listingDate,jdbcType=DATE}");
        SET("NATION = #{record.nation,jdbcType=VARCHAR}");
        SET("GMT_CREATE = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        SET("GMT_MODIFIED = #{record.gmtModified,jdbcType=TIMESTAMP}");
        SET("ESTABLISH_DATE = #{record.establishDate,jdbcType=DATE}");
        SET("ORG_PROFILE = #{record.orgProfile,jdbcType=LONGVARCHAR}");
        
        CompanyInfoExample example = (CompanyInfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String updateByExample(Map<String, Object> parameter) {
        BEGIN();
        UPDATE("company_info");
        
        SET("ID = #{record.id,jdbcType=BIGINT}");
        SET("CODE = #{record.code,jdbcType=VARCHAR}");
        SET("NAME = #{record.name,jdbcType=VARCHAR}");
        SET("ORG_NAME = #{record.orgName,jdbcType=VARCHAR}");
        SET("ORG_NAME_EN = #{record.orgNameEn,jdbcType=VARCHAR}");
        SET("INDUSTRY = #{record.industry,jdbcType=VARCHAR}");
        SET("ORG_TEL = #{record.orgTel,jdbcType=VARCHAR}");
        SET("ORG_WEB = #{record.orgWeb,jdbcType=VARCHAR}");
        SET("PROVINCE = #{record.province,jdbcType=VARCHAR}");
        SET("REG_ADDRESS = #{record.regAddress,jdbcType=VARCHAR}");
        SET("ADDRESS = #{record.address,jdbcType=VARCHAR}");
        SET("ADDRESS_POSTCODE = #{record.addressPostcode,jdbcType=VARCHAR}");
        SET("BUSINESS_SCOPE = #{record.businessScope,jdbcType=VARCHAR}");
        SET("CHAIRMAN = #{record.chairman,jdbcType=VARCHAR}");
        SET("INDEDIRECTORS = #{record.indedirectors,jdbcType=VARCHAR}");
        SET("LEGAL_PERSON = #{record.legalPerson,jdbcType=VARCHAR}");
        SET("REG_NUM = #{record.regNum,jdbcType=VARCHAR}");
        SET("REG_CAPITAL = #{record.regCapital,jdbcType=INTEGER}");
        SET("SECUCODE = #{record.secucode,jdbcType=VARCHAR}");
        SET("SECURITY_TYPE = #{record.securityType,jdbcType=VARCHAR}");
        SET("MARKET = #{record.market,jdbcType=INTEGER}");
        SET("OPEN_STATUS = #{record.openStatus,jdbcType=INTEGER}");
        SET("TYPE = #{record.type,jdbcType=INTEGER}");
        SET("LISTING_DATE = #{record.listingDate,jdbcType=DATE}");
        SET("NATION = #{record.nation,jdbcType=VARCHAR}");
        SET("GMT_CREATE = #{record.gmtCreate,jdbcType=TIMESTAMP}");
        SET("GMT_MODIFIED = #{record.gmtModified,jdbcType=TIMESTAMP}");
        SET("ESTABLISH_DATE = #{record.establishDate,jdbcType=DATE}");
        
        CompanyInfoExample example = (CompanyInfoExample) parameter.get("example");
        applyWhere(example, true);
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String updateByPrimaryKeySelective(CompanyInfoWithBLOBs record) {
        BEGIN();
        UPDATE("company_info");
        
        if (record.getCode() != null) {
            SET("CODE = #{code,jdbcType=VARCHAR}");
        }
        
        if (record.getName() != null) {
            SET("NAME = #{name,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgName() != null) {
            SET("ORG_NAME = #{orgName,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgNameEn() != null) {
            SET("ORG_NAME_EN = #{orgNameEn,jdbcType=VARCHAR}");
        }
        
        if (record.getIndustry() != null) {
            SET("INDUSTRY = #{industry,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgTel() != null) {
            SET("ORG_TEL = #{orgTel,jdbcType=VARCHAR}");
        }
        
        if (record.getOrgWeb() != null) {
            SET("ORG_WEB = #{orgWeb,jdbcType=VARCHAR}");
        }
        
        if (record.getProvince() != null) {
            SET("PROVINCE = #{province,jdbcType=VARCHAR}");
        }
        
        if (record.getRegAddress() != null) {
            SET("REG_ADDRESS = #{regAddress,jdbcType=VARCHAR}");
        }
        
        if (record.getAddress() != null) {
            SET("ADDRESS = #{address,jdbcType=VARCHAR}");
        }
        
        if (record.getAddressPostcode() != null) {
            SET("ADDRESS_POSTCODE = #{addressPostcode,jdbcType=VARCHAR}");
        }
        
        if (record.getBusinessScope() != null) {
            SET("BUSINESS_SCOPE = #{businessScope,jdbcType=VARCHAR}");
        }
        
        if (record.getChairman() != null) {
            SET("CHAIRMAN = #{chairman,jdbcType=VARCHAR}");
        }
        
        if (record.getIndedirectors() != null) {
            SET("INDEDIRECTORS = #{indedirectors,jdbcType=VARCHAR}");
        }
        
        if (record.getLegalPerson() != null) {
            SET("LEGAL_PERSON = #{legalPerson,jdbcType=VARCHAR}");
        }
        
        if (record.getRegNum() != null) {
            SET("REG_NUM = #{regNum,jdbcType=VARCHAR}");
        }
        
        if (record.getRegCapital() != null) {
            SET("REG_CAPITAL = #{regCapital,jdbcType=INTEGER}");
        }
        
        if (record.getSecucode() != null) {
            SET("SECUCODE = #{secucode,jdbcType=VARCHAR}");
        }
        
        if (record.getSecurityType() != null) {
            SET("SECURITY_TYPE = #{securityType,jdbcType=VARCHAR}");
        }
        
        if (record.getMarket() != null) {
            SET("MARKET = #{market,jdbcType=INTEGER}");
        }
        
        if (record.getOpenStatus() != null) {
            SET("OPEN_STATUS = #{openStatus,jdbcType=INTEGER}");
        }
        
        if (record.getType() != null) {
            SET("TYPE = #{type,jdbcType=INTEGER}");
        }
        
        if (record.getListingDate() != null) {
            SET("LISTING_DATE = #{listingDate,jdbcType=DATE}");
        }
        
        if (record.getNation() != null) {
            SET("NATION = #{nation,jdbcType=VARCHAR}");
        }
        
        if (record.getGmtCreate() != null) {
            SET("GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP}");
        }
        
        if (record.getGmtModified() != null) {
            SET("GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP}");
        }
        
        if (record.getEstablishDate() != null) {
            SET("ESTABLISH_DATE = #{establishDate,jdbcType=DATE}");
        }
        
        if (record.getOrgProfile() != null) {
            SET("ORG_PROFILE = #{orgProfile,jdbcType=LONGVARCHAR}");
        }
        
        WHERE("ID = #{id,jdbcType=BIGINT}");
        
        return SQL();
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    protected void applyWhere(CompanyInfoExample example, boolean includeExamplePhrase) {
        if (example == null) {
            return;
        }
        
        String parmPhrase1;
        String parmPhrase1_th;
        String parmPhrase2;
        String parmPhrase2_th;
        String parmPhrase3;
        String parmPhrase3_th;
        if (includeExamplePhrase) {
            parmPhrase1 = "%s #{example.oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{example.oredCriteria[%d].allCriteria[%d].value} and #{example.oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{example.oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{example.oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{example.oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{example.oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        } else {
            parmPhrase1 = "%s #{oredCriteria[%d].allCriteria[%d].value}";
            parmPhrase1_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s}";
            parmPhrase2 = "%s #{oredCriteria[%d].allCriteria[%d].value} and #{oredCriteria[%d].criteria[%d].secondValue}";
            parmPhrase2_th = "%s #{oredCriteria[%d].allCriteria[%d].value,typeHandler=%s} and #{oredCriteria[%d].criteria[%d].secondValue,typeHandler=%s}";
            parmPhrase3 = "#{oredCriteria[%d].allCriteria[%d].value[%d]}";
            parmPhrase3_th = "#{oredCriteria[%d].allCriteria[%d].value[%d],typeHandler=%s}";
        }
        
        StringBuilder sb = new StringBuilder();
        List<Criteria> oredCriteria = example.getOredCriteria();
        boolean firstCriteria = true;
        for (int i = 0; i < oredCriteria.size(); i++) {
            Criteria criteria = oredCriteria.get(i);
            if (criteria.isValid()) {
                if (firstCriteria) {
                    firstCriteria = false;
                } else {
                    sb.append(" or ");
                }
                
                sb.append('(');
                List<Criterion> criterions = criteria.getAllCriteria();
                boolean firstCriterion = true;
                for (int j = 0; j < criterions.size(); j++) {
                    Criterion criterion = criterions.get(j);
                    if (firstCriterion) {
                        firstCriterion = false;
                    } else {
                        sb.append(" and ");
                    }
                    
                    if (criterion.isNoValue()) {
                        sb.append(criterion.getCondition());
                    } else if (criterion.isSingleValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase1, criterion.getCondition(), i, j));
                        } else {
                            sb.append(String.format(parmPhrase1_th, criterion.getCondition(), i, j,criterion.getTypeHandler()));
                        }
                    } else if (criterion.isBetweenValue()) {
                        if (criterion.getTypeHandler() == null) {
                            sb.append(String.format(parmPhrase2, criterion.getCondition(), i, j, i, j));
                        } else {
                            sb.append(String.format(parmPhrase2_th, criterion.getCondition(), i, j, criterion.getTypeHandler(), i, j, criterion.getTypeHandler()));
                        }
                    } else if (criterion.isListValue()) {
                        sb.append(criterion.getCondition());
                        sb.append(" (");
                        List<?> listItems = (List<?>) criterion.getValue();
                        boolean comma = false;
                        for (int k = 0; k < listItems.size(); k++) {
                            if (comma) {
                                sb.append(", ");
                            } else {
                                comma = true;
                            }
                            if (criterion.getTypeHandler() == null) {
                                sb.append(String.format(parmPhrase3, i, j, k));
                            } else {
                                sb.append(String.format(parmPhrase3_th, i, j, k, criterion.getTypeHandler()));
                            }
                        }
                        sb.append(')');
                    }
                }
                sb.append(')');
            }
        }
        
        if (sb.length() > 0) {
            WHERE(sb.toString());
        }
    }
}