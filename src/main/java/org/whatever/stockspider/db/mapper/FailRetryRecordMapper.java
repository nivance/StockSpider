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
import org.whatever.stockspider.db.entity.FailRetryRecord;
import org.whatever.stockspider.db.entity.FailRetryRecordExample;
import org.whatever.stockspider.db.entity.FailRetryRecordKey;

public interface FailRetryRecordMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @SelectProvider(type=FailRetryRecordSqlProvider.class, method="countByExample")
    int countByExample(FailRetryRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @DeleteProvider(type=FailRetryRecordSqlProvider.class, method="deleteByExample")
    int deleteByExample(FailRetryRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Delete({
        "delete from fail_retry_record",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(FailRetryRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Insert({
        "insert into fail_retry_record (ID, CODE, ",
        "NAME, TRADING_DATE, ",
        "FAIL_TYPE, RETRY_SUCCES, ",
        "GMT_CREATE, GMT_MODIFIED)",
        "values (#{id,jdbcType=BIGINT}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{tradingDate,jdbcType=VARCHAR}, ",
        "#{failType,jdbcType=VARCHAR}, #{retrySucces,jdbcType=INTEGER}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP})"
    })
    int insert(FailRetryRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @InsertProvider(type=FailRetryRecordSqlProvider.class, method="insertSelective")
    int insertSelective(FailRetryRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @SelectProvider(type=FailRetryRecordSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRADING_DATE", property="tradingDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="FAIL_TYPE", property="failType", jdbcType=JdbcType.VARCHAR),
        @Result(column="RETRY_SUCCES", property="retrySucces", jdbcType=JdbcType.INTEGER),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<FailRetryRecord> selectByExample(FailRetryRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Select({
        "select",
        "ID, CODE, NAME, TRADING_DATE, FAIL_TYPE, RETRY_SUCCES, GMT_CREATE, GMT_MODIFIED",
        "from fail_retry_record",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRADING_DATE", property="tradingDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="FAIL_TYPE", property="failType", jdbcType=JdbcType.VARCHAR),
        @Result(column="RETRY_SUCCES", property="retrySucces", jdbcType=JdbcType.INTEGER),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    FailRetryRecord selectByPrimaryKey(FailRetryRecordKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @UpdateProvider(type=FailRetryRecordSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") FailRetryRecord record, @Param("example") FailRetryRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @UpdateProvider(type=FailRetryRecordSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") FailRetryRecord record, @Param("example") FailRetryRecordExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @UpdateProvider(type=FailRetryRecordSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(FailRetryRecord record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table fail_retry_record
     *
     * @mbggenerated Mon Apr 22 10:21:38 CST 2024
     */
    @Update({
        "update fail_retry_record",
        "set CODE = #{code,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TRADING_DATE = #{tradingDate,jdbcType=VARCHAR},",
          "FAIL_TYPE = #{failType,jdbcType=VARCHAR},",
          "RETRY_SUCCES = #{retrySucces,jdbcType=INTEGER},",
          "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
          "GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(FailRetryRecord record);
}