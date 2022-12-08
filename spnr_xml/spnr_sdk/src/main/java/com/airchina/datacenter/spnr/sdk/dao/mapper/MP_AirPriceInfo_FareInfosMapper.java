package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirPriceInfo_FareInfosPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_AirPriceInfo_FareInfosMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirPriceInfo_FareInfos
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_AirPriceInfo_FareInfos (super_pnr_id, search_id, ",
        "product_number, pnr, ",
        "flight_segment_rph, od_rph, ",
        "cabin_code, subclass, ",
        "filing_airline_code, dport, ",
        "aport, fare_basis, ",
        "dis_count, fc_price_ind, ",
        "fc_rph, orig_pub_amt, ",
        "fare_basis_code, base_amt, ",
        "differ_fare, price_type, ",
        "reissue_amt, reissue_fee, ",
        "taxes_amt, total_fare, ",
        "tax_deatils, ptc_sub_type, ",
        "ptc_psg_type, ptc_quantity, ",
        "lowest_fare, lowest_fare_subclass, ",
        "earn_quantity, fare_family_code, ",
        "fare_family_name, add_on_sort, ",
        "add_on_sort_name, add_on_char_set)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{pnr,jdbcType=VARCHAR}, ",
        "#{flightSegmentRph,jdbcType=VARCHAR}, #{odRph,jdbcType=VARCHAR}, ",
        "#{cabinCode,jdbcType=VARCHAR}, #{subclass,jdbcType=VARCHAR}, ",
        "#{filingAirlineCode,jdbcType=VARCHAR}, #{dport,jdbcType=VARCHAR}, ",
        "#{aport,jdbcType=VARCHAR}, #{fareBasis,jdbcType=VARCHAR}, ",
        "#{disCount,jdbcType=DOUBLE}, #{fcPriceInd,jdbcType=VARCHAR}, ",
        "#{fcRph,jdbcType=VARCHAR}, #{origPubAmt,jdbcType=VARCHAR}, ",
        "#{fareBasisCode,jdbcType=VARCHAR}, #{baseAmt,jdbcType=VARCHAR}, ",
        "#{differFare,jdbcType=DOUBLE}, #{priceType,jdbcType=VARCHAR}, ",
        "#{reissueAmt,jdbcType=DOUBLE}, #{reissueFee,jdbcType=DOUBLE}, ",
        "#{taxesAmt,jdbcType=DOUBLE}, #{totalFare,jdbcType=DOUBLE}, ",
        "#{taxDeatils,jdbcType=VARCHAR}, #{ptcSubType,jdbcType=VARCHAR}, ",
        "#{ptcPsgType,jdbcType=VARCHAR}, #{ptcQuantity,jdbcType=INTEGER}, ",
        "#{lowestFare,jdbcType=VARCHAR}, #{lowestFareSubclass,jdbcType=VARCHAR}, ",
        "#{earnQuantity,jdbcType=VARCHAR}, #{fareFamilyCode,jdbcType=VARCHAR}, ",
        "#{fareFamilyName,jdbcType=VARCHAR}, #{addOnSort,jdbcType=VARCHAR}, ",
        "#{addOnSortName,jdbcType=VARCHAR}, #{addOnCharSet,jdbcType=VARCHAR})"
    })
    int insert(MP_AirPriceInfo_FareInfosPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirPriceInfo_FareInfos
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, pnr, flight_segment_rph, od_rph, cabin_code, ",
        "subclass, filing_airline_code, dport, aport, fare_basis, dis_count, fc_price_ind, ",
        "fc_rph, orig_pub_amt, fare_basis_code, base_amt, differ_fare, price_type, reissue_amt, ",
        "reissue_fee, taxes_amt, total_fare, tax_deatils, ptc_sub_type, ptc_psg_type, ",
        "ptc_quantity, lowest_fare, lowest_fare_subclass, earn_quantity, fare_family_code, ",
        "fare_family_name, add_on_sort, add_on_sort_name, add_on_char_set",
        "from MP_AirPriceInfo_FareInfos"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="pnr", property="pnr", jdbcType=JdbcType.VARCHAR),
        @Result(column="flight_segment_rph", property="flightSegmentRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_rph", property="odRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="cabin_code", property="cabinCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="subclass", property="subclass", jdbcType=JdbcType.VARCHAR),
        @Result(column="filing_airline_code", property="filingAirlineCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="dport", property="dport", jdbcType=JdbcType.VARCHAR),
        @Result(column="aport", property="aport", jdbcType=JdbcType.VARCHAR),
        @Result(column="fare_basis", property="fareBasis", jdbcType=JdbcType.VARCHAR),
        @Result(column="dis_count", property="disCount", jdbcType=JdbcType.DOUBLE),
        @Result(column="fc_price_ind", property="fcPriceInd", jdbcType=JdbcType.VARCHAR),
        @Result(column="fc_rph", property="fcRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="orig_pub_amt", property="origPubAmt", jdbcType=JdbcType.VARCHAR),
        @Result(column="fare_basis_code", property="fareBasisCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="base_amt", property="baseAmt", jdbcType=JdbcType.VARCHAR),
        @Result(column="differ_fare", property="differFare", jdbcType=JdbcType.DOUBLE),
        @Result(column="price_type", property="priceType", jdbcType=JdbcType.VARCHAR),
        @Result(column="reissue_amt", property="reissueAmt", jdbcType=JdbcType.DOUBLE),
        @Result(column="reissue_fee", property="reissueFee", jdbcType=JdbcType.DOUBLE),
        @Result(column="taxes_amt", property="taxesAmt", jdbcType=JdbcType.DOUBLE),
        @Result(column="total_fare", property="totalFare", jdbcType=JdbcType.DOUBLE),
        @Result(column="tax_deatils", property="taxDeatils", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptc_sub_type", property="ptcSubType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptc_psg_type", property="ptcPsgType", jdbcType=JdbcType.VARCHAR),
        @Result(column="ptc_quantity", property="ptcQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="lowest_fare", property="lowestFare", jdbcType=JdbcType.VARCHAR),
        @Result(column="lowest_fare_subclass", property="lowestFareSubclass", jdbcType=JdbcType.VARCHAR),
        @Result(column="earn_quantity", property="earnQuantity", jdbcType=JdbcType.VARCHAR),
        @Result(column="fare_family_code", property="fareFamilyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="fare_family_name", property="fareFamilyName", jdbcType=JdbcType.VARCHAR),
        @Result(column="add_on_sort", property="addOnSort", jdbcType=JdbcType.VARCHAR),
        @Result(column="add_on_sort_name", property="addOnSortName", jdbcType=JdbcType.VARCHAR),
        @Result(column="add_on_char_set", property="addOnCharSet", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_AirPriceInfo_FareInfosPo> selectAll();
}