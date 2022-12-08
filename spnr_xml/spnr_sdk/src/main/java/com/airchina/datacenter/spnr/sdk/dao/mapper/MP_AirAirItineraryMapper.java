package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirAirItineraryPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_AirAirItineraryMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirAirItinerary
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_AirAirItinerary (super_pnr_id, search_id, ",
        "product_number, pnr, ",
        "direction_ind, doc_required, ",
        "od_rph, od_majority_carrier, ",
        "booking_channel, od_openjaw, ",
        "od_duration, infant_avail_quantity, ",
        "marketing_flight_num)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{pnr,jdbcType=VARCHAR}, ",
        "#{directionInd,jdbcType=VARCHAR}, #{docRequired,jdbcType=VARCHAR}, ",
        "#{odRph,jdbcType=VARCHAR}, #{odMajorityCarrier,jdbcType=VARCHAR}, ",
        "#{bookingChannel,jdbcType=VARCHAR}, #{odOpenjaw,jdbcType=VARCHAR}, ",
        "#{odDuration,jdbcType=VARCHAR}, #{infantAvailQuantity,jdbcType=INTEGER}, ",
        "#{marketingFlightNum,jdbcType=VARCHAR})"
    })
    int insert(MP_AirAirItineraryPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_AirAirItinerary
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, pnr, direction_ind, doc_required, od_rph, ",
        "od_majority_carrier, booking_channel, od_openjaw, od_duration, infant_avail_quantity, ",
        "marketing_flight_num",
        "from MP_AirAirItinerary"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="pnr", property="pnr", jdbcType=JdbcType.VARCHAR),
        @Result(column="direction_ind", property="directionInd", jdbcType=JdbcType.VARCHAR),
        @Result(column="doc_required", property="docRequired", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_rph", property="odRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_majority_carrier", property="odMajorityCarrier", jdbcType=JdbcType.VARCHAR),
        @Result(column="booking_channel", property="bookingChannel", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_openjaw", property="odOpenjaw", jdbcType=JdbcType.VARCHAR),
        @Result(column="od_duration", property="odDuration", jdbcType=JdbcType.VARCHAR),
        @Result(column="infant_avail_quantity", property="infantAvailQuantity", jdbcType=JdbcType.INTEGER),
        @Result(column="marketing_flight_num", property="marketingFlightNum", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_AirAirItineraryPo> selectAll();
}