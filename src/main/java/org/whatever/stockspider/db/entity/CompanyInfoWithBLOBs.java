package org.whatever.stockspider.db.entity;

public class CompanyInfoWithBLOBs extends CompanyInfo {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ORG_PROFILE
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    private String orgProfile;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ORG_PROFILE
     *
     * @return the value of company_info.ORG_PROFILE
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public String getOrgProfile() {
        return orgProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ORG_PROFILE
     *
     * @param orgProfile the value for company_info.ORG_PROFILE
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    public void setOrgProfile(String orgProfile) {
        this.orgProfile = orgProfile;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
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
        CompanyInfoWithBLOBs other = (CompanyInfoWithBLOBs) that;
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
            && (this.getGmtModified() == null ? other.getGmtModified() == null : this.getGmtModified().equals(other.getGmtModified()))
            && (this.getEstablishDate() == null ? other.getEstablishDate() == null : this.getEstablishDate().equals(other.getEstablishDate()))
            && (this.getOrgProfile() == null ? other.getOrgProfile() == null : this.getOrgProfile().equals(other.getOrgProfile()));
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
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
        result = prime * result + ((getEstablishDate() == null) ? 0 : getEstablishDate().hashCode());
        result = prime * result + ((getOrgProfile() == null) ? 0 : getOrgProfile().hashCode());
        return result;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Override
    public String toString() {
        StringBuilder sb = new StringBuilder();
        sb.append(getClass().getSimpleName());
        sb.append(" [");
        sb.append("Hash = ").append(hashCode());
        sb.append(", orgProfile=").append(orgProfile);
        sb.append("]");
        return sb.toString();
    }
}