package org.whatever.stockspider.db.entity;

import java.util.Date;

public class FailRetryRecord extends FailRetryRecordKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.CODE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private String code;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.NAME
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private String name;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.TRADING_DATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private String tradingDate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.FAIL_TYPE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private String failType;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.RETRY_SUCCES
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private Integer retrySucces;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.GMT_CREATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private Date gmtCreate;

    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column fail_retry_record.GMT_MODIFIED
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    private Date gmtModified;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.CODE
     *
     * @return the value of fail_retry_record.CODE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public String getCode() {
        return code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.CODE
     *
     * @param code the value for fail_retry_record.CODE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setCode(String code) {
        this.code = code;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.NAME
     *
     * @return the value of fail_retry_record.NAME
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public String getName() {
        return name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.NAME
     *
     * @param name the value for fail_retry_record.NAME
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setName(String name) {
        this.name = name;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.TRADING_DATE
     *
     * @return the value of fail_retry_record.TRADING_DATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public String getTradingDate() {
        return tradingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.TRADING_DATE
     *
     * @param tradingDate the value for fail_retry_record.TRADING_DATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setTradingDate(String tradingDate) {
        this.tradingDate = tradingDate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.FAIL_TYPE
     *
     * @return the value of fail_retry_record.FAIL_TYPE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public String getFailType() {
        return failType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.FAIL_TYPE
     *
     * @param failType the value for fail_retry_record.FAIL_TYPE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setFailType(String failType) {
        this.failType = failType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.RETRY_SUCCES
     *
     * @return the value of fail_retry_record.RETRY_SUCCES
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public Integer getRetrySucces() {
        return retrySucces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.RETRY_SUCCES
     *
     * @param retrySucces the value for fail_retry_record.RETRY_SUCCES
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setRetrySucces(Integer retrySucces) {
        this.retrySucces = retrySucces;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.GMT_CREATE
     *
     * @return the value of fail_retry_record.GMT_CREATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public Date getGmtCreate() {
        return gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.GMT_CREATE
     *
     * @param gmtCreate the value for fail_retry_record.GMT_CREATE
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setGmtCreate(Date gmtCreate) {
        this.gmtCreate = gmtCreate;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column fail_retry_record.GMT_MODIFIED
     *
     * @return the value of fail_retry_record.GMT_MODIFIED
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public Date getGmtModified() {
        return gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column fail_retry_record.GMT_MODIFIED
     *
     * @param gmtModified the value for fail_retry_record.GMT_MODIFIED
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    public void setGmtModified(Date gmtModified) {
        this.gmtModified = gmtModified;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
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
        FailRetryRecord other = (FailRetryRecord) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()))
            && (this.getCode() == null ? other.getCode() == null : this.getCode().equals(other.getCode()))
            && (this.getName() == null ? other.getName() == null : this.getName().equals(other.getName()))
            && (this.getTradingDate() == null ? other.getTradingDate() == null : this.getTradingDate().equals(other.getTradingDate()))
            && (this.getFailType() == null ? other.getFailType() == null : this.getFailType().equals(other.getFailType()))
            && (this.getRetrySucces() == null ? other.getRetrySucces() == null : this.getRetrySucces().equals(other.getRetrySucces()))
            && (this.getGmtCreate() == null ? other.getGmtCreate() == null : this.getGmtCreate().equals(other.getGmtCreate()))
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Override
    public int hashCode() {
        final int prime = 31;
        int result = 1;
        result = prime * result + ((getId() == null) ? 0 : getId().hashCode());
        result = prime * result + ((getCode() == null) ? 0 : getCode().hashCode());
        result = prime * result + ((getName() == null) ? 0 : getName().hashCode());
        result = prime * result + ((getTradingDate() == null) ? 0 : getTradingDate().hashCode());
        result = prime * result + ((getFailType() == null) ? 0 : getFailType().hashCode());
        result = prime * result + ((getRetrySucces() == null) ? 0 : getRetrySucces().hashCode());
        result = prime * result + ((getGmtCreate() == null) ? 0 : getGmtCreate().hashCode());
        result = prime * result + ((getGmtModified() == null) ? 0 : getGmtModified().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", code=").append(code);
        sb.append(", name=").append(name);
        sb.append(", tradingDate=").append(tradingDate);
        sb.append(", failType=").append(failType);
        sb.append(", retrySucces=").append(retrySucces);
        sb.append(", gmtCreate=").append(gmtCreate);
        sb.append(", gmtModified=").append(gmtModified);
        sb.append("]");
        return sb.toString();
    }
}