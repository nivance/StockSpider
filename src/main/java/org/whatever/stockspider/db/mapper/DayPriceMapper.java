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
import org.whatever.stockspider.db.entity.DayPrice;
import org.whatever.stockspider.db.entity.DayPriceExample;
import org.whatever.stockspider.db.entity.DayPriceKey;

public interface DayPriceMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @SelectProvider(type=DayPriceSqlProvider.class, method="countByExample")
    int countByExample(DayPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @DeleteProvider(type=DayPriceSqlProvider.class, method="deleteByExample")
    int deleteByExample(DayPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Delete({
        "delete from day_price",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int deleteByPrimaryKey(DayPriceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Insert({
        "insert into day_price (ID, CODE, ",
        "NAME, TRADING_DATE, ",
        "OPENING_PRICE, CLOSING_PRICE, ",
        "PEAK_PRICE, BOTTOM_PRICE, ",
        "CHANGE_RATE, CHANGE_AMOUNT, ",
        "TRADING_VOLUME, TRADING_AMOUNT, ",
        "AMPLITUDE_RATE, TURNOVER_RATE, ",
        "GMT_CREATE, GMT_MODIFIED)",
        "values (#{id,jdbcType=BIGINT}, #{code,jdbcType=VARCHAR}, ",
        "#{name,jdbcType=VARCHAR}, #{tradingDate,jdbcType=DATE}, ",
        "#{openingPrice,jdbcType=DECIMAL}, #{closingPrice,jdbcType=DECIMAL}, ",
        "#{peakPrice,jdbcType=DECIMAL}, #{bottomPrice,jdbcType=DECIMAL}, ",
        "#{changeRate,jdbcType=DECIMAL}, #{changeAmount,jdbcType=DECIMAL}, ",
        "#{tradingVolume,jdbcType=INTEGER}, #{tradingAmount,jdbcType=DECIMAL}, ",
        "#{amplitudeRate,jdbcType=DECIMAL}, #{turnoverRate,jdbcType=DECIMAL}, ",
        "#{gmtCreate,jdbcType=TIMESTAMP}, #{gmtModified,jdbcType=TIMESTAMP})"
    })
    int insert(DayPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @InsertProvider(type=DayPriceSqlProvider.class, method="insertSelective")
    int insertSelective(DayPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @SelectProvider(type=DayPriceSqlProvider.class, method="selectByExample")
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRADING_DATE", property="tradingDate", jdbcType=JdbcType.DATE),
        @Result(column="OPENING_PRICE", property="openingPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CLOSING_PRICE", property="closingPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="PEAK_PRICE", property="peakPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="BOTTOM_PRICE", property="bottomPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHANGE_RATE", property="changeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHANGE_AMOUNT", property="changeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRADING_VOLUME", property="tradingVolume", jdbcType=JdbcType.INTEGER),
        @Result(column="TRADING_AMOUNT", property="tradingAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="AMPLITUDE_RATE", property="amplitudeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="TURNOVER_RATE", property="turnoverRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    List<DayPrice> selectByExample(DayPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Select({
        "select",
        "ID, CODE, NAME, TRADING_DATE, OPENING_PRICE, CLOSING_PRICE, PEAK_PRICE, BOTTOM_PRICE, ",
        "CHANGE_RATE, CHANGE_AMOUNT, TRADING_VOLUME, TRADING_AMOUNT, AMPLITUDE_RATE, ",
        "TURNOVER_RATE, GMT_CREATE, GMT_MODIFIED",
        "from day_price",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    @Results({
        @Result(column="ID", property="id", jdbcType=JdbcType.BIGINT, id=true),
        @Result(column="CODE", property="code", jdbcType=JdbcType.VARCHAR),
        @Result(column="NAME", property="name", jdbcType=JdbcType.VARCHAR),
        @Result(column="TRADING_DATE", property="tradingDate", jdbcType=JdbcType.DATE),
        @Result(column="OPENING_PRICE", property="openingPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CLOSING_PRICE", property="closingPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="PEAK_PRICE", property="peakPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="BOTTOM_PRICE", property="bottomPrice", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHANGE_RATE", property="changeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="CHANGE_AMOUNT", property="changeAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="TRADING_VOLUME", property="tradingVolume", jdbcType=JdbcType.INTEGER),
        @Result(column="TRADING_AMOUNT", property="tradingAmount", jdbcType=JdbcType.DECIMAL),
        @Result(column="AMPLITUDE_RATE", property="amplitudeRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="TURNOVER_RATE", property="turnoverRate", jdbcType=JdbcType.DECIMAL),
        @Result(column="GMT_CREATE", property="gmtCreate", jdbcType=JdbcType.TIMESTAMP),
        @Result(column="GMT_MODIFIED", property="gmtModified", jdbcType=JdbcType.TIMESTAMP)
    })
    DayPrice selectByPrimaryKey(DayPriceKey key);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @UpdateProvider(type=DayPriceSqlProvider.class, method="updateByExampleSelective")
    int updateByExampleSelective(@Param("record") DayPrice record, @Param("example") DayPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @UpdateProvider(type=DayPriceSqlProvider.class, method="updateByExample")
    int updateByExample(@Param("record") DayPrice record, @Param("example") DayPriceExample example);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @UpdateProvider(type=DayPriceSqlProvider.class, method="updateByPrimaryKeySelective")
    int updateByPrimaryKeySelective(DayPrice record);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table day_price
     *
     * @mbggenerated Tue Apr 16 19:42:04 CST 2024
     */
    @Update({
        "update day_price",
        "set CODE = #{code,jdbcType=VARCHAR},",
          "NAME = #{name,jdbcType=VARCHAR},",
          "TRADING_DATE = #{tradingDate,jdbcType=DATE},",
          "OPENING_PRICE = #{openingPrice,jdbcType=DECIMAL},",
          "CLOSING_PRICE = #{closingPrice,jdbcType=DECIMAL},",
          "PEAK_PRICE = #{peakPrice,jdbcType=DECIMAL},",
          "BOTTOM_PRICE = #{bottomPrice,jdbcType=DECIMAL},",
          "CHANGE_RATE = #{changeRate,jdbcType=DECIMAL},",
          "CHANGE_AMOUNT = #{changeAmount,jdbcType=DECIMAL},",
          "TRADING_VOLUME = #{tradingVolume,jdbcType=INTEGER},",
          "TRADING_AMOUNT = #{tradingAmount,jdbcType=DECIMAL},",
          "AMPLITUDE_RATE = #{amplitudeRate,jdbcType=DECIMAL},",
          "TURNOVER_RATE = #{turnoverRate,jdbcType=DECIMAL},",
          "GMT_CREATE = #{gmtCreate,jdbcType=TIMESTAMP},",
          "GMT_MODIFIED = #{gmtModified,jdbcType=TIMESTAMP}",
        "where ID = #{id,jdbcType=BIGINT}"
    })
    int updateByPrimaryKey(DayPrice record);
}