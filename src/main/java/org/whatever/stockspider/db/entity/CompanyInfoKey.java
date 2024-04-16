package org.whatever.stockspider.db.entity;

import lombok.NonNull;

public class CompanyInfoKey {
    /**
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column company_info.ID
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @NonNull
    private Long id;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column company_info.ID
     *
     * @return the value of company_info.ID
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public Long getId() {
        return id;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column company_info.ID
     *
     * @param id the value for company_info.ID
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    public void setId(Long id) {
        this.id = id;
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
        CompanyInfoKey other = (CompanyInfoKey) that;
        return (this.getId() == null ? other.getId() == null : this.getId().equals(other.getId()));
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
        sb.append(", id=").append(id);
        sb.append("]");
        return sb.toString();
    }
}