package org.whatever.stockspider.db.custom;

import java.util.List;

import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;
import org.whatever.stockspider.db.entity.CompanyInfo;

/**
 * 定制mapper
 *
 * @author limingjian
 */
public interface CustomMapper {

    @Select({
            "select CODE from company_info where length(ORG_NAME) = 0 AND OPEN_STATUS = 1"
    })
    @Results({
            @Result(column = "CODE", property = "code", jdbcType = JdbcType.VARCHAR),
    })
    List<CompanyInfo> selectUnupdateCompanys();


}
