package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_POSPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface Spnr_POSMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_POS
     *
     * @mbg.generated
     */
    @Insert({
        "insert into Spnr_POS (super_pnr_id, airline_vendor_id, ",
        "channel, iso_country, ",
        "iso_currency, `locale`, ",
        "entry_point, requestor_id, ",
        "company_short_name, company_name_code)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{airlineVendorId,jdbcType=VARCHAR}, ",
        "#{channel,jdbcType=VARCHAR}, #{isoCountry,jdbcType=VARCHAR}, ",
        "#{isoCurrency,jdbcType=VARCHAR}, #{locale,jdbcType=VARCHAR}, ",
        "#{entryPoint,jdbcType=VARCHAR}, #{requestorId,jdbcType=VARCHAR}, ",
        "#{companyShortName,jdbcType=VARCHAR}, #{companyNameCode,jdbcType=VARCHAR})"
    })
    int insert(Spnr_POSPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table Spnr_POS
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, airline_vendor_id, channel, iso_country, iso_currency, `locale`, ",
        "entry_point, requestor_id, company_short_name, company_name_code",
        "from Spnr_POS"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="airline_vendor_id", property="airlineVendorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="iso_country", property="isoCountry", jdbcType=JdbcType.VARCHAR),
        @Result(column="iso_currency", property="isoCurrency", jdbcType=JdbcType.VARCHAR),
        @Result(column="locale", property="locale", jdbcType=JdbcType.VARCHAR),
        @Result(column="entry_point", property="entryPoint", jdbcType=JdbcType.VARCHAR),
        @Result(column="requestor_id", property="requestorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_short_name", property="companyShortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="company_name_code", property="companyNameCode", jdbcType=JdbcType.VARCHAR)
    })
    List<Spnr_POSPo> selectAll();
}