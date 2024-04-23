package org.whatever.stockspider.db.entity;

import java.math.BigDecimal;
import java.util.Date;

public class StockDividend extends StockDividendKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.CODE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.NAME
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.IMPL_PLAN_PROFILE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private String implPlanProfile;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.EQUITY_RECORD_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date equityRecordDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.EX_DIVIDEND_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date exDividendDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date noticeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.PLAN_NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date planNoticeDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.PRETAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private BigDecimal pretaxBonusRmb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.AFTERTAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private BigDecimal aftertaxBonusRmb;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.BASE_SHARE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Integer baseShare;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.HANDSEL
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private BigDecimal handsel;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.TRANSFER
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private BigDecimal transfer;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.GMT_CREATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column stock_dividend.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.CODE
     *
     * @return the value of stock_dividend.CODE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.CODE
     *
     * @param code the value for stock_dividend.CODE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.NAME
     *
     * @return the value of stock_dividend.NAME
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.NAME
     *
     * @param name the value for stock_dividend.NAME
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.IMPL_PLAN_PROFILE
     *
     * @return the value of stock_dividend.IMPL_PLAN_PROFILE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public String getImplPlanProfile() {
        return implPlanProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.IMPL_PLAN_PROFILE
     *
     * @param implPlanProfile the value for stock_dividend.IMPL_PLAN_PROFILE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setImplPlanProfile(String implPlanProfile) {
        this.implPlanProfile = implPlanProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.EQUITY_RECORD_DATE
     *
     * @return the value of stock_dividend.EQUITY_RECORD_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getEquityRecordDate() {
        return equityRecordDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.EQUITY_RECORD_DATE
     *
     * @param equityRecordDate the value for stock_dividend.EQUITY_RECORD_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setEquityRecordDate(Date equityRecordDate) {
        this.equityRecordDate = equityRecordDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.EX_DIVIDEND_DATE
     *
     * @return the value of stock_dividend.EX_DIVIDEND_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getExDividendDate() {
        return exDividendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.EX_DIVIDEND_DATE
     *
     * @param exDividendDate the value for stock_dividend.EX_DIVIDEND_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setExDividendDate(Date exDividendDate) {
        this.exDividendDate = exDividendDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.NOTICE_DATE
     *
     * @return the value of stock_dividend.NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getNoticeDate() {
        return noticeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.NOTICE_DATE
     *
     * @param noticeDate the value for stock_dividend.NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setNoticeDate(Date noticeDate) {
        this.noticeDate = noticeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.PLAN_NOTICE_DATE
     *
     * @return the value of stock_dividend.PLAN_NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getPlanNoticeDate() {
        return planNoticeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.PLAN_NOTICE_DATE
     *
     * @param planNoticeDate the value for stock_dividend.PLAN_NOTICE_DATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setPlanNoticeDate(Date planNoticeDate) {
        this.planNoticeDate = planNoticeDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.PRETAX_BONUS_RMB
     *
     * @return the value of stock_dividend.PRETAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public BigDecimal getPretaxBonusRmb() {
        return pretaxBonusRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.PRETAX_BONUS_RMB
     *
     * @param pretaxBonusRmb the value for stock_dividend.PRETAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setPretaxBonusRmb(BigDecimal pretaxBonusRmb) {
        this.pretaxBonusRmb = pretaxBonusRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.AFTERTAX_BONUS_RMB
     *
     * @return the value of stock_dividend.AFTERTAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public BigDecimal getAftertaxBonusRmb() {
        return aftertaxBonusRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.AFTERTAX_BONUS_RMB
     *
     * @param aftertaxBonusRmb the value for stock_dividend.AFTERTAX_BONUS_RMB
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setAftertaxBonusRmb(BigDecimal aftertaxBonusRmb) {
        this.aftertaxBonusRmb = aftertaxBonusRmb;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.BASE_SHARE
     *
     * @return the value of stock_dividend.BASE_SHARE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Integer getBaseShare() {
        return baseShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.BASE_SHARE
     *
     * @param baseShare the value for stock_dividend.BASE_SHARE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setBaseShare(Integer baseShare) {
        this.baseShare = baseShare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.HANDSEL
     *
     * @return the value of stock_dividend.HANDSEL
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public BigDecimal getHandsel() {
        return handsel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.HANDSEL
     *
     * @param handsel the value for stock_dividend.HANDSEL
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setHandsel(BigDecimal handsel) {
        this.handsel = handsel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.TRANSFER
     *
     * @return the value of stock_dividend.TRANSFER
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public BigDecimal getTransfer() {
        return transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.TRANSFER
     *
     * @param transfer the value for stock_dividend.TRANSFER
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setTransfer(BigDecimal transfer) {
        this.transfer = transfer;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.GMT_CREATE
     *
     * @return the value of stock_dividend.GMT_CREATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.GMT_CREATE
     *
     * @param gmtCreate the value for stock_dividend.GMT_CREATE
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column stock_dividend.GMT_MODIFIED
     *
     * @return the value of stock_dividend.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column stock_dividend.GMT_MODIFIED
     *
     * @param gmtModified the value for stock_dividend.GMT_MODIFIED
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_dividend
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
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
        StockDividend other = (StockDividend) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getImplPlanProfile() == null ? other.getImplPlanProfile() == null : this.getImplPlanProfile().equals(other.getImplPlanProfile()))
            && (this.getEquityRecordDate() == null ? other.getEquityRecordDate() == null : this.getEquityRecordDate().equals(other.getEquityRecordDate()))
            && (this.getExDividendDate() == null ? other.getExDividendDate() == null : this.getExDividendDate().equals(other.getExDividendDate()))
            && (this.getNoticeDate() == null ? other.getNoticeDate() == null : this.getNoticeDate().equals(other.getNoticeDate()))
            && (this.getPlanNoticeDate() == null ? other.getPlanNoticeDate() == null : this.getPlanNoticeDate().equals(other.getPlanNoticeDate()))
            && (this.getPretaxBonusRmb() == null ? other.getPretaxBonusRmb() == null : this.getPretaxBonusRmb().equals(other.getPretaxBonusRmb()))
            && (this.getAftertaxBonusRmb() == null ? other.getAftertaxBonusRmb() == null : this.getAftertaxBonusRmb().equals(other.getAftertaxBonusRmb()))
            && (this.getBaseShare() == null ? other.getBaseShare() == null : this.getBaseShare().equals(other.getBaseShare()))
            && (this.getHandsel() == null ? other.getHandsel() == null : this.getHandsel().equals(other.getHandsel()))
            && (this.getTransfer() == null ? other.getTransfer() == null : this.getTransfer().equals(other.getTransfer()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_dividend
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getImplPlanProfile() == null) ? 0 : getImplPlanProfile().hashCode());
        result = prime * result + ((getEquityRecordDate() == null) ? 0 : getEquityRecordDate().hashCode());
        result = prime * result + ((getExDividendDate() == null) ? 0 : getExDividendDate().hashCode());
        result = prime * result + ((getNoticeDate() == null) ? 0 : getNoticeDate().hashCode());
        result = prime * result + ((getPlanNoticeDate() == null) ? 0 : getPlanNoticeDate().hashCode());
        result = prime * result + ((getPretaxBonusRmb() == null) ? 0 : getPretaxBonusRmb().hashCode());
        result = prime * result + ((getAftertaxBonusRmb() == null) ? 0 : getAftertaxBonusRmb().hashCode());
        result = prime * result + ((getBaseShare() == null) ? 0 : getBaseShare().hashCode());
        result = prime * result + ((getHandsel() == null) ? 0 : getHandsel().hashCode());
        result = prime * result + ((getTransfer() == null) ? 0 : getTransfer().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table stock_dividend
     *
     * @mbggenerated Tue Apr 23 11:18:21 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", implPlanProfile=").append(implPlanProfile);
        sb.append(", equityRecordDate=").append(equityRecordDate);
        sb.append(", exDividendDate=").append(exDividendDate);
        sb.append(", noticeDate=").append(noticeDate);
        sb.append(", planNoticeDate=").append(planNoticeDate);
        sb.append(", pretaxBonusRmb=").append(pretaxBonusRmb);
        sb.append(", aftertaxBonusRmb=").append(aftertaxBonusRmb);
        sb.append(", baseShare=").append(baseShare);
        sb.append(", handsel=").append(handsel);
        sb.append(", transfer=").append(transfer);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}