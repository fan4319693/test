package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AmendmentFeePo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Spnr_AmendmentFeeMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_AmendmentFee
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Spnr_AmendmentFee (super_pnr_id, product_number, ",
        "amt, currency_code, ",
        "ops_date, audit_id, ",
        "manual, master_product_number, ",
        "replaced_by)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{productNumber,jdbcType=VARCHAR}, ",
        "#{amt,jdbcType=DOUBLE}, #{currencyCode,jdbcType=VARCHAR}, ",
        "#{opsDate,jdbcType=VARCHAR}, #{auditId,jdbcType=VARCHAR}, ",
        "#{manual,jdbcType=VARCHAR}, #{masterProductNumber,jdbcType=VARCHAR}, ",
        "#{replacedBy,jdbcType=VARCHAR})"
    })
    int insert(Spnr_AmendmentFeePo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_AmendmentFee
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, product_number, amt, currency_code, ops_date, audit_id, manual, ",
        "master_product_number, replaced_by",
        "from Spnr_AmendmentFee"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="amt", property="amt", jdbcType=JdbcType.DOUBLE),
        @Result(column="currency_code", property="currencyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="ops_date", property="opsDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_id", property="auditId", jdbcType=JdbcType.VARCHAR),
        @Result(column="manual", property="manual", jdbcType=JdbcType.VARCHAR),
        @Result(column="master_product_number", property="masterProductNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="replaced_by", property="replacedBy", jdbcType=JdbcType.VARCHAR)
    })
    List<Spnr_AmendmentFeePo> selectAll();
}