package org.whatever.stockspider.db.entity;

import java.util.Date;

public class CompanyInfo extends CompanyInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.CODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ORG_NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String orgName;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ORG_NAME_EN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String orgNameEn;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.INDUSTRY
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String industry;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ORG_TEL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String orgTel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ORG_WEB
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String orgWeb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.PROVINCE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String province;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.REG_ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String regAddress;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String address;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ADDRESS_POSTCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String addressPostcode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.BUSINESS_SCOPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String businessScope;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.CHAIRMAN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String chairman;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.INDEDIRECTORS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String indedirectors;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.LEGAL_PERSON
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String legalPerson;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.REG_NUM
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String regNum;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.REG_CAPITAL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Integer regCapital;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.SECUCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String secucode;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.SECURITY_TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String securityType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.MARKET
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Integer market;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.OPEN_STATUS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Integer openStatus;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Integer type;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.LISTING_DATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Date listingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.NATION
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private String nation;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.GMT_CREATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.CODE
     *
     * @return the value of company_info.CODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.CODE
     *
     * @param code the value for company_info.CODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.NAME
     *
     * @return the value of company_info.NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.NAME
     *
     * @param name the value for company_info.NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ORG_NAME
     *
     * @return the value of company_info.ORG_NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getOrgName() {
        return orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ORG_NAME
     *
     * @param orgName the value for company_info.ORG_NAME
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setOrgName(String orgName) {
        this.orgName = orgName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ORG_NAME_EN
     *
     * @return the value of company_info.ORG_NAME_EN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getOrgNameEn() {
        return orgNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ORG_NAME_EN
     *
     * @param orgNameEn the value for company_info.ORG_NAME_EN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setOrgNameEn(String orgNameEn) {
        this.orgNameEn = orgNameEn;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.INDUSTRY
     *
     * @return the value of company_info.INDUSTRY
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getIndustry() {
        return industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.INDUSTRY
     *
     * @param industry the value for company_info.INDUSTRY
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setIndustry(String industry) {
        this.industry = industry;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ORG_TEL
     *
     * @return the value of company_info.ORG_TEL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getOrgTel() {
        return orgTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ORG_TEL
     *
     * @param orgTel the value for company_info.ORG_TEL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setOrgTel(String orgTel) {
        this.orgTel = orgTel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ORG_WEB
     *
     * @return the value of company_info.ORG_WEB
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getOrgWeb() {
        return orgWeb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ORG_WEB
     *
     * @param orgWeb the value for company_info.ORG_WEB
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setOrgWeb(String orgWeb) {
        this.orgWeb = orgWeb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.PROVINCE
     *
     * @return the value of company_info.PROVINCE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getProvince() {
        return province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.PROVINCE
     *
     * @param province the value for company_info.PROVINCE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setProvince(String province) {
        this.province = province;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.REG_ADDRESS
     *
     * @return the value of company_info.REG_ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getRegAddress() {
        return regAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.REG_ADDRESS
     *
     * @param regAddress the value for company_info.REG_ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setRegAddress(String regAddress) {
        this.regAddress = regAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ADDRESS
     *
     * @return the value of company_info.ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getAddress() {
        return address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ADDRESS
     *
     * @param address the value for company_info.ADDRESS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setAddress(String address) {
        this.address = address;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ADDRESS_POSTCODE
     *
     * @return the value of company_info.ADDRESS_POSTCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getAddressPostcode() {
        return addressPostcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ADDRESS_POSTCODE
     *
     * @param addressPostcode the value for company_info.ADDRESS_POSTCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setAddressPostcode(String addressPostcode) {
        this.addressPostcode = addressPostcode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.BUSINESS_SCOPE
     *
     * @return the value of company_info.BUSINESS_SCOPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getBusinessScope() {
        return businessScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.BUSINESS_SCOPE
     *
     * @param businessScope the value for company_info.BUSINESS_SCOPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setBusinessScope(String businessScope) {
        this.businessScope = businessScope;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.CHAIRMAN
     *
     * @return the value of company_info.CHAIRMAN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getChairman() {
        return chairman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.CHAIRMAN
     *
     * @param chairman the value for company_info.CHAIRMAN
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setChairman(String chairman) {
        this.chairman = chairman;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.INDEDIRECTORS
     *
     * @return the value of company_info.INDEDIRECTORS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getIndedirectors() {
        return indedirectors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.INDEDIRECTORS
     *
     * @param indedirectors the value for company_info.INDEDIRECTORS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setIndedirectors(String indedirectors) {
        this.indedirectors = indedirectors;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.LEGAL_PERSON
     *
     * @return the value of company_info.LEGAL_PERSON
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getLegalPerson() {
        return legalPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.LEGAL_PERSON
     *
     * @param legalPerson the value for company_info.LEGAL_PERSON
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setLegalPerson(String legalPerson) {
        this.legalPerson = legalPerson;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.REG_NUM
     *
     * @return the value of company_info.REG_NUM
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getRegNum() {
        return regNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.REG_NUM
     *
     * @param regNum the value for company_info.REG_NUM
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setRegNum(String regNum) {
        this.regNum = regNum;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.REG_CAPITAL
     *
     * @return the value of company_info.REG_CAPITAL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Integer getRegCapital() {
        return regCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.REG_CAPITAL
     *
     * @param regCapital the value for company_info.REG_CAPITAL
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setRegCapital(Integer regCapital) {
        this.regCapital = regCapital;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.SECUCODE
     *
     * @return the value of company_info.SECUCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getSecucode() {
        return secucode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.SECUCODE
     *
     * @param secucode the value for company_info.SECUCODE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setSecucode(String secucode) {
        this.secucode = secucode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.SECURITY_TYPE
     *
     * @return the value of company_info.SECURITY_TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getSecurityType() {
        return securityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.SECURITY_TYPE
     *
     * @param securityType the value for company_info.SECURITY_TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setSecurityType(String securityType) {
        this.securityType = securityType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.MARKET
     *
     * @return the value of company_info.MARKET
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Integer getMarket() {
        return market;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.MARKET
     *
     * @param market the value for company_info.MARKET
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setMarket(Integer market) {
        this.market = market;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.OPEN_STATUS
     *
     * @return the value of company_info.OPEN_STATUS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Integer getOpenStatus() {
        return openStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.OPEN_STATUS
     *
     * @param openStatus the value for company_info.OPEN_STATUS
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setOpenStatus(Integer openStatus) {
        this.openStatus = openStatus;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.TYPE
     *
     * @return the value of company_info.TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Integer getType() {
        return type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.TYPE
     *
     * @param type the value for company_info.TYPE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setType(Integer type) {
        this.type = type;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.LISTING_DATE
     *
     * @return the value of company_info.LISTING_DATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Date getListingDate() {
        return listingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.LISTING_DATE
     *
     * @param listingDate the value for company_info.LISTING_DATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setListingDate(Date listingDate) {
        this.listingDate = listingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.NATION
     *
     * @return the value of company_info.NATION
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public String getNation() {
        return nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.NATION
     *
     * @param nation the value for company_info.NATION
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setNation(String nation) {
        this.nation = nation;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.GMT_CREATE
     *
     * @return the value of company_info.GMT_CREATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.GMT_CREATE
     *
     * @param gmtCreate the value for company_info.GMT_CREATE
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.GMT_MODIFIED
     *
     * @return the value of company_info.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.GMT_MODIFIED
     *
     * @param gmtModified the value for company_info.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Override
    public boolean equals(Object that) {
        if (this == that) {
            return true;
        }
        if (that == null) {
            return false;
        }
        if (getClass() != that.getClass()) {
            return false;
        }
        CompanyInfo other = (CompanyInfo) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getOrgName() == null ? other.getOrgName() == null : this.getOrgName().equals(other.getOrgName()))
            && (this.getOrgNameEn() == null ? other.getOrgNameEn() == null : this.getOrgNameEn().equals(other.getOrgNameEn()))
            && (this.getIndustry() == null ? other.getIndustry() == null : this.getIndustry().equals(other.getIndustry()))
            && (this.getOrgTel() == null ? other.getOrgTel() == null : this.getOrgTel().equals(other.getOrgTel()))
            && (this.getOrgWeb() == null ? other.getOrgWeb() == null : this.getOrgWeb().equals(other.getOrgWeb()))
            && (this.getProvince() == null ? other.getProvince() == null : this.getProvince().equals(other.getProvince()))
            && (this.getRegAddress() == null ? other.getRegAddress() == null : this.getRegAddress().equals(other.getRegAddress()))
            && (this.getAddress() == null ? other.getAddress() == null : this.getAddress().equals(other.getAddress()))
            && (this.getAddressPostcode() == null ? other.getAddressPostcode() == null : this.getAddressPostcode().equals(other.getAddressPostcode()))
            && (this.getBusinessScope() == null ? other.getBusinessScope() == null : this.getBusinessScope().equals(other.getBusinessScope()))
            && (this.getChairman() == null ? other.getChairman() == null : this.getChairman().equals(other.getChairman()))
            && (this.getIndedirectors() == null ? other.getIndedirectors() == null : this.getIndedirectors().equals(other.getIndedirectors()))
            && (this.getLegalPerson() == null ? other.getLegalPerson() == null : this.getLegalPerson().equals(other.getLegalPerson()))
            && (this.getRegNum() == null ? other.getRegNum() == null : this.getRegNum().equals(other.getRegNum()))
            && (this.getRegCapital() == null ? other.getRegCapital() == null : this.getRegCapital().equals(other.getRegCapital()))
            && (this.getSecucode() == null ? other.getSecucode() == null : this.getSecucode().equals(other.getSecucode()))
            && (this.getSecurityType() == null ? other.getSecurityType() == null : this.getSecurityType().equals(other.getSecurityType()))
            && (this.getMarket() == null ? other.getMarket() == null : this.getMarket().equals(other.getMarket()))
            && (this.getOpenStatus() == null ? other.getOpenStatus() == null : this.getOpenStatus().equals(other.getOpenStatus()))
            && (this.getType() == null ? other.getType() == null : this.getType().equals(other.getType()))
            && (this.getListingDate() == null ? other.getListingDate() == null : this.getListingDate().equals(other.getListingDate()))
            && (this.getNation() == null ? other.getNation() == null : this.getNation().equals(other.getNation()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getOrgName() == null) ? 0 : getOrgName().hashCode());
        result = prime * result + ((getOrgNameEn() == null) ? 0 : getOrgNameEn().hashCode());
        result = prime * result + ((getIndustry() == null) ? 0 : getIndustry().hashCode());
        result = prime * result + ((getOrgTel() == null) ? 0 : getOrgTel().hashCode());
        result = prime * result + ((getOrgWeb() == null) ? 0 : getOrgWeb().hashCode());
        result = prime * result + ((getProvince() == null) ? 0 : getProvince().hashCode());
        result = prime * result + ((getRegAddress() == null) ? 0 : getRegAddress().hashCode());
        result = prime * result + ((getAddress() == null) ? 0 : getAddress().hashCode());
        result = prime * result + ((getAddressPostcode() == null) ? 0 : getAddressPostcode().hashCode());
        result = prime * result + ((getBusinessScope() == null) ? 0 : getBusinessScope().hashCode());
        result = prime * result + ((getChairman() == null) ? 0 : getChairman().hashCode());
        result = prime * result + ((getIndedirectors() == null) ? 0 : getIndedirectors().hashCode());
        result = prime * result + ((getLegalPerson() == null) ? 0 : getLegalPerson().hashCode());
        result = prime * result + ((getRegNum() == null) ? 0 : getRegNum().hashCode());
        result = prime * result + ((getRegCapital() == null) ? 0 : getRegCapital().hashCode());
        result = prime * result + ((getSecucode() == null) ? 0 : getSecucode().hashCode());
        result = prime * result + ((getSecurityType() == null) ? 0 : getSecurityType().hashCode());
        result = prime * result + ((getMarket() == null) ? 0 : getMarket().hashCode());
        result = prime * result + ((getOpenStatus() == null) ? 0 : getOpenStatus().hashCode());
        result = prime * result + ((getType() == null) ? 0 : getType().hashCode());
        result = prime * result + ((getListingDate() == null) ? 0 : getListingDate().hashCode());
        result = prime * result + ((getNation() == null) ? 0 : getNation().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", orgName=").append(orgName);
        sb.append(", orgNameEn=").append(orgNameEn);
        sb.append(", industry=").append(industry);
        sb.append(", orgTel=").append(orgTel);
        sb.append(", orgWeb=").append(orgWeb);
        sb.append(", province=").append(province);
        sb.append(", regAddress=").append(regAddress);
        sb.append(", address=").append(address);
        sb.append(", addressPostcode=").append(addressPostcode);
        sb.append(", businessScope=").append(businessScope);
        sb.append(", chairman=").append(chairman);
        sb.append(", indedirectors=").append(indedirectors);
        sb.append(", legalPerson=").append(legalPerson);
        sb.append(", regNum=").append(regNum);
        sb.append(", regCapital=").append(regCapital);
        sb.append(", secucode=").append(secucode);
        sb.append(", securityType=").append(securityType);
        sb.append(", market=").append(market);
        sb.append(", openStatus=").append(openStatus);
        sb.append(", type=").append(type);
        sb.append(", listingDate=").append(listingDate);
        sb.append(", nation=").append(nation);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}