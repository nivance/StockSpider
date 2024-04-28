package org.whatever.stockspider.db.mapper;

import java.util.List;
import org.apache.ibatis.annotations.Delete;
import org.apache.ibatis.annotations.DeleteProvider;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.InsertProvider;
import org.apache.ibatis.annotations.Param;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.annotations.SelectProvider;
import org.apache.ibatis.annotations.Update;
import org.apache.ibatis.annotations.UpdateProvider;
import org.apache.ibatis.type.JdbcType;
import org.whatever.stockspider.db.entity.CompanyInfo;
import org.whatever.stockspider.db.entity.CompanyInfoExample;
import org.whatever.stockspider.db.entity.CompanyInfoKey;
import org.whatever.stockspider.db.entity.CompanyInfoWithBLOBs;

public interface CompanyInfoMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @SelectProvider(type=CompanyInfoSqlProvider.class, method="countByExample")
    int countByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @DeleteProvider(type=CompanyInfoSqlProvider.class, method="deleteByExample")
    int deleteByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Delete({
        "delete from company_info",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(CompanyInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Insert({
        "insert into company_info (ID, CODE, ",
        "NAME, ORG_NAME, ORG_NAME_EN, ",
        "INDUSTRY, ORG_TEL, ",
        "ORG_WEB, PROVINCE, ",
        "REG_ADDRESS, ADDRESS, ",
        "ADDRESS_POSTCODE, BUSINESS_SCOPE, ",
        "CHAIRMAN, INDEDIRECTORS, ",
        "LEGAL_PERSON, REG_NUM, ",
        "REG_CAPITAL, SECUCODE, ",
        "SECURITY_TYPE, MARKET, ",
        "OPEN_STATUS, TYPE, ",
        "LISTING_DATE, NATION, ",
        "GMT_CREATE, GMT_MODIFIED, ",
        "ESTABLISH_DATE, ORG_PROFILE)",
        "values (#{id,jdbcType=BIGINT}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{orgName,jdbcType=VARCHAR}, #{orgNameEn,jdbcType=VARCHAR}, ",
        "#{industry,jdbcType=VARCHAR}, #{orgTel,jdbcType=VARCHAR}, ",
        "#{orgWeb,jdbcType=VARCHAR}, #{province,jdbcType=VARCHAR}, ",
        "#{regAddress,jdbcType=VARCHAR}, #{address,jdbcType=VARCHAR}, ",
        "#{addressPostcode,jdbcType=VARCHAR}, #{businessScope,jdbcType=VARCHAR}, ",
        "#{chairman,jdbcType=VARCHAR}, #{indedirectors,jdbcType=VARCHAR}, ",
        "#{legalPerson,jdbcType=VARCHAR}, #{regNum,jdbcType=VARCHAR}, ",
        "#{regCapital,jdbcType=INTEGER}, #{secucode,jdbcType=VARCHAR}, ",
        "#{securityType,jdbcType=VARCHAR}, #{market,jdbcType=INTEGER}, ",
        "#{openStatus,jdbcType=INTEGER}, #{type,jdbcType=INTEGER}, ",
        "#{listingDate,jdbcType=DATE}, #{nation,jdbcType=VARCHAR}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP}, ",
        "#{establishDate,jdbcType=DATE}, #{orgProfile,jdbcType=LONGVARCHAR})"
    })
    int insert(CompanyInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @InsertProvider(type=CompanyInfoSqlProvider.class, method="insertSelective")
    int insertSelective(CompanyInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @SelectProvider(type=CompanyInfoSqlProvider.class, method="selectByExampleWithBLOBs")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME_EN", property="orgNameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDUSTRY", property="industry", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_TEL", property="orgTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_WEB", property="orgWeb", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_ADDRESS", property="regAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS_POSTCODE", property="addressPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESS_SCOPE", property="businessScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHAIRMAN", property="chairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEDIRECTORS", property="indedirectors", jdbcType=JdbcType.VARCHAR),
        @Result(column="LEGAL_PERSON", property="legalPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_NUM", property="regNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_CAPITAL", property="regCapital", jdbcType=JdbcType.INTEGER),
        @Result(column="SECUCODE", property="secucode", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="MARKET", property="market", jdbcType=JdbcType.INTEGER),
        @Result(column="OPEN_STATUS", property="openStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="LISTING_DATE", property="listingDate", jdbcType=JdbcType.DATE),
        @Result(column="NATION", property="nation", jdbcType=JdbcType.VARCHAR),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ESTABLISH_DATE", property="establishDate", jdbcType=JdbcType.DATE),
        @Result(column="ORG_PROFILE", property="orgProfile", jdbcType=JdbcType.LONGVARCHAR)
    })
    List<CompanyInfoWithBLOBs> selectByExampleWithBLOBs(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @SelectProvider(type=CompanyInfoSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME_EN", property="orgNameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDUSTRY", property="industry", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_TEL", property="orgTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_WEB", property="orgWeb", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_ADDRESS", property="regAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS_POSTCODE", property="addressPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESS_SCOPE", property="businessScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHAIRMAN", property="chairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEDIRECTORS", property="indedirectors", jdbcType=JdbcType.VARCHAR),
        @Result(column="LEGAL_PERSON", property="legalPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_NUM", property="regNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_CAPITAL", property="regCapital", jdbcType=JdbcType.INTEGER),
        @Result(column="SECUCODE", property="secucode", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="MARKET", property="market", jdbcType=JdbcType.INTEGER),
        @Result(column="OPEN_STATUS", property="openStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="LISTING_DATE", property="listingDate", jdbcType=JdbcType.DATE),
        @Result(column="NATION", property="nation", jdbcType=JdbcType.VARCHAR),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ESTABLISH_DATE", property="establishDate", jdbcType=JdbcType.DATE)
    })
    List<CompanyInfo> selectByExample(CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Select({
        "select",
        "ID, CODE, NAME, ORG_NAME, ORG_NAME_EN, INDUSTRY, ORG_TEL, ORG_WEB, PROVINCE, ",
        "REG_ADDRESS, ADDRESS, ADDRESS_POSTCODE, BUSINESS_SCOPE, CHAIRMAN, INDEDIRECTORS, ",
        "LEGAL_PERSON, REG_NUM, REG_CAPITAL, SECUCODE, SECURITY_TYPE, MARKET, OPEN_STATUS, ",
        "TYPE, LISTING_DATE, NATION, GMT_CREATE, GMT_MODIFIED, ESTABLISH_DATE, ORG_PROFILE",
        "from company_info",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME", property="orgName", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_NAME_EN", property="orgNameEn", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDUSTRY", property="industry", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_TEL", property="orgTel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ORG_WEB", property="orgWeb", jdbcType=JdbcType.VARCHAR),
        @Result(column="PROVINCE", property="province", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_ADDRESS", property="regAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS", property="address", jdbcType=JdbcType.VARCHAR),
        @Result(column="ADDRESS_POSTCODE", property="addressPostcode", jdbcType=JdbcType.VARCHAR),
        @Result(column="BUSINESS_SCOPE", property="businessScope", jdbcType=JdbcType.VARCHAR),
        @Result(column="CHAIRMAN", property="chairman", jdbcType=JdbcType.VARCHAR),
        @Result(column="INDEDIRECTORS", property="indedirectors", jdbcType=JdbcType.VARCHAR),
        @Result(column="LEGAL_PERSON", property="legalPerson", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_NUM", property="regNum", jdbcType=JdbcType.VARCHAR),
        @Result(column="REG_CAPITAL", property="regCapital", jdbcType=JdbcType.INTEGER),
        @Result(column="SECUCODE", property="secucode", jdbcType=JdbcType.VARCHAR),
        @Result(column="SECURITY_TYPE", property="securityType", jdbcType=JdbcType.VARCHAR),
        @Result(column="MARKET", property="market", jdbcType=JdbcType.INTEGER),
        @Result(column="OPEN_STATUS", property="openStatus", jdbcType=JdbcType.INTEGER),
        @Result(column="TYPE", property="type", jdbcType=JdbcType.INTEGER),
        @Result(column="LISTING_DATE", property="listingDate", jdbcType=JdbcType.DATE),
        @Result(column="NATION", property="nation", jdbcType=JdbcType.VARCHAR),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="ESTABLISH_DATE", property="establishDate", jdbcType=JdbcType.DATE),
        @Result(column="ORG_PROFILE", property="orgProfile", jdbcType=JdbcType.LONGVARCHAR)
    })
    CompanyInfoWithBLOBs selectByPrimaryKey(CompanyInfoKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @UpdateProvider(type=CompanyInfoSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") CompanyInfoWithBLOBs record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @UpdateProvider(type=CompanyInfoSqlProvider.class, method="updateByExampleWithBLOBs")
    int updateByExampleWithBLOBs(@Param("record") CompanyInfoWithBLOBs record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @UpdateProvider(type=CompanyInfoSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") CompanyInfo record, @Param("example") CompanyInfoExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @UpdateProvider(type=CompanyInfoSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(CompanyInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Update({
        "update company_info",
        "set CODE = #{code,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "ORG_NAME = #{orgName,jdbcType=VARCHAR},",
          "ORG_NAME_EN = #{orgNameEn,jdbcType=VARCHAR},",
          "INDUSTRY = #{industry,jdbcType=VARCHAR},",
          "ORG_TEL = #{orgTel,jdbcType=VARCHAR},",
          "ORG_WEB = #{orgWeb,jdbcType=VARCHAR},",
          "PROVINCE = #{province,jdbcType=VARCHAR},",
          "REG_ADDRESS = #{regAddress,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "ADDRESS_POSTCODE = #{addressPostcode,jdbcType=VARCHAR},",
          "BUSINESS_SCOPE = #{businessScope,jdbcType=VARCHAR},",
          "CHAIRMAN = #{chairman,jdbcType=VARCHAR},",
          "INDEDIRECTORS = #{indedirectors,jdbcType=VARCHAR},",
          "LEGAL_PERSON = #{legalPerson,jdbcType=VARCHAR},",
          "REG_NUM = #{regNum,jdbcType=VARCHAR},",
          "REG_CAPITAL = #{regCapital,jdbcType=INTEGER},",
          "SECUCODE = #{secucode,jdbcType=VARCHAR},",
          "SECURITY_TYPE = #{securityType,jdbcType=VARCHAR},",
          "MARKET = #{market,jdbcType=INTEGER},",
          "OPEN_STATUS = #{openStatus,jdbcType=INTEGER},",
          "TYPE = #{type,jdbcType=INTEGER},",
          "LISTING_DATE = #{listingDate,jdbcType=DATE},",
          "NATION = #{nation,jdbcType=VARCHAR},",
          "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
          "GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP},",
          "ESTABLISH_DATE = #{establishDate,jdbcType=DATE},",
          "ORG_PROFILE = #{orgProfile,jdbcType=LONGVARCHAR}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKeyWithBLOBs(CompanyInfoWithBLOBs record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table company_info
     *
     * @mbggenerated Sun Apr 28 08:09:45 CST 2024
     */
    @Update({
        "update company_info",
        "set CODE = #{code,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "ORG_NAME = #{orgName,jdbcType=VARCHAR},",
          "ORG_NAME_EN = #{orgNameEn,jdbcType=VARCHAR},",
          "INDUSTRY = #{industry,jdbcType=VARCHAR},",
          "ORG_TEL = #{orgTel,jdbcType=VARCHAR},",
          "ORG_WEB = #{orgWeb,jdbcType=VARCHAR},",
          "PROVINCE = #{province,jdbcType=VARCHAR},",
          "REG_ADDRESS = #{regAddress,jdbcType=VARCHAR},",
          "ADDRESS = #{address,jdbcType=VARCHAR},",
          "ADDRESS_POSTCODE = #{addressPostcode,jdbcType=VARCHAR},",
          "BUSINESS_SCOPE = #{businessScope,jdbcType=VARCHAR},",
          "CHAIRMAN = #{chairman,jdbcType=VARCHAR},",
          "INDEDIRECTORS = #{indedirectors,jdbcType=VARCHAR},",
          "LEGAL_PERSON = #{legalPerson,jdbcType=VARCHAR},",
          "REG_NUM = #{regNum,jdbcType=VARCHAR},",
          "REG_CAPITAL = #{regCapital,jdbcType=INTEGER},",
          "SECUCODE = #{secucode,jdbcType=VARCHAR},",
          "SECURITY_TYPE = #{securityType,jdbcType=VARCHAR},",
          "MARKET = #{market,jdbcType=INTEGER},",
          "OPEN_STATUS = #{openStatus,jdbcType=INTEGER},",
          "TYPE = #{type,jdbcType=INTEGER},",
          "LISTING_DATE = #{listingDate,jdbcType=DATE},",
          "NATION = #{nation,jdbcType=VARCHAR},",
          "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
          "GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP},",
          "ESTABLISH_DATE = #{establishDate,jdbcType=DATE}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(CompanyInfo record);
}