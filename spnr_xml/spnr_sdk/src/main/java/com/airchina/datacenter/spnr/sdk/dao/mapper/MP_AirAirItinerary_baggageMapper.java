package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItinerary_BaggagePo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_AirAirItinerary_baggageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirAirItinerary_baggage
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_AirAirItinerary_baggage (super_pnr_id, search_id, ",
        "product_number, pnr, ",
        "od_rph, baggage_rph, ",
        "fligh_segment_rph, pieces, ",
        "traveler_rph, pricing_rph, ",
        "weight, weight_count, ",
        "weight_unit, size_code, ",
        "size_description, size_height, ",
        "size_length, width, ",
        "special_item_code, special_item_context, ",
        "special_item_uri, is_fpc, ",
        "passage_type_code)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{pnr,jdbcType=VARCHAR}, ",
        "#{odRph,jdbcType=VARCHAR}, #{baggageRph,jdbcType=VARCHAR}, ",
        "#{flighSegmentRph,jdbcType=VARCHAR}, #{pieces,jdbcType=INTEGER}, ",
        "#{travelerRph,jdbcType=VARCHAR}, #{pricingRph,jdbcType=VARCHAR}, ",
        "#{weight,jdbcType=VARCHAR}, #{weightCount,jdbcType=INTEGER}, ",
        "#{weightUnit,jdbcType=VARCHAR}, #{sizeCode,jdbcType=VARCHAR}, ",
        "#{sizeDescription,jdbcType=VARCHAR}, #{sizeHeight,jdbcType=VARCHAR}, ",
        "#{sizeLength,jdbcType=VARCHAR}, #{width,jdbcType=VARCHAR}, ",
        "#{specialItemCode,jdbcType=VARCHAR}, #{specialItemContext,jdbcType=VARCHAR}, ",
        "#{specialItemUri,jdbcType=VARCHAR}, #{isFpc,jdbcType=VARCHAR}, ",
        "#{passageTypeCode,jdbcType=VARCHAR})"
    })
    int insert(MP_AirAirItinerary_BaggagePo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirAirItinerary_baggage
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, pnr, od_rph, baggage_rph, fligh_segment_rph, ",
        "pieces, traveler_rph, pricing_rph, weight, weight_count, weight_unit, size_code, ",
        "size_description, size_height, size_length, width, special_item_code, special_item_context, ",
        "special_item_uri, is_fpc, passage_type_code",
        "from MP_AirAirItinerary_baggage"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="pnr", property="pnr", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_rph", property="odRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="baggage_rph", property="baggageRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="fligh_segment_rph", property="flighSegmentRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="pieces", property="pieces", jdbcType=JdbcType.INTEGER),
        @Result(column="traveler_rph", property="travelerRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="pricing_rph", property="pricingRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight", property="weight", jdbcType=JdbcType.VARCHAR),
        @Result(column="weight_count", property="weightCount", jdbcType=JdbcType.INTEGER),
        @Result(column="weight_unit", property="weightUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="size_code", property="sizeCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="size_description", property="sizeDescription", jdbcType=JdbcType.VARCHAR),
        @Result(column="size_height", property="sizeHeight", jdbcType=JdbcType.VARCHAR),
        @Result(column="size_length", property="sizeLength", jdbcType=JdbcType.VARCHAR),
        @Result(column="width", property="width", jdbcType=JdbcType.VARCHAR),
        @Result(column="special_item_code", property="specialItemCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="special_item_context", property="specialItemContext", jdbcType=JdbcType.VARCHAR),
        @Result(column="special_item_uri", property="specialItemUri", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_fpc", property="isFpc", jdbcType=JdbcType.VARCHAR),
        @Result(column="passage_type_code", property="passageTypeCode", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_AirAirItinerary_BaggagePo> selectAll();
}