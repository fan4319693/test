package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_BaggagePo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_BaggageMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Baggage
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_Baggage (super_pnr_id, search_id, ",
        "product_number, pnr, ",
        "cancelable, quantity, ",
        "refundable, is_seg_bind, ",
        "departure_code, arrival_code, ",
        "max_weight_unit, max_dimensionsl_cm, ",
        "max_dimensions_units, adjusted, ",
        "amt, amt_before_tax, ",
        "currency_code, decimal_places, ",
        "ori_amt_after_tax, ori_currency_code, ",
        "flight_segment_number, segment_id_ref, ",
        "traveler_id_ref, flight_segment_ref_number, ",
        "geo_indicator, sale_model, ",
        "ticket_time, ticketing_status, ",
        "e_ticket_number, ticket_advisory, ",
        "cancel_amount)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{pnr,jdbcType=VARCHAR}, ",
        "#{cancelable,jdbcType=VARCHAR}, #{quantity,jdbcType=INTEGER}, ",
        "#{refundable,jdbcType=VARCHAR}, #{isSegBind,jdbcType=VARCHAR}, ",
        "#{departureCode,jdbcType=VARCHAR}, #{arrivalCode,jdbcType=VARCHAR}, ",
        "#{maxWeightUnit,jdbcType=VARCHAR}, #{maxDimensionslCm,jdbcType=VARCHAR}, ",
        "#{maxDimensionsUnits,jdbcType=VARCHAR}, #{adjusted,jdbcType=VARCHAR}, ",
        "#{amt,jdbcType=VARCHAR}, #{amtBeforeTax,jdbcType=VARCHAR}, ",
        "#{currencyCode,jdbcType=VARCHAR}, #{decimalPlaces,jdbcType=VARCHAR}, ",
        "#{oriAmtAfterTax,jdbcType=VARCHAR}, #{oriCurrencyCode,jdbcType=VARCHAR}, ",
        "#{flightSegmentNumber,jdbcType=VARCHAR}, #{segmentIdRef,jdbcType=VARCHAR}, ",
        "#{travelerIdRef,jdbcType=VARCHAR}, #{flightSegmentRefNumber,jdbcType=VARCHAR}, ",
        "#{geoIndicator,jdbcType=VARCHAR}, #{saleModel,jdbcType=VARCHAR}, ",
        "#{ticketTime,jdbcType=VARCHAR}, #{ticketingStatus,jdbcType=VARCHAR}, ",
        "#{eTicketNumber,jdbcType=VARCHAR}, #{ticketAdvisory,jdbcType=VARCHAR}, ",
        "#{cancelAmount,jdbcType=VARCHAR})"
    })
    int insert(MP_BaggagePo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Baggage
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, pnr, cancelable, quantity, refundable, ",
        "is_seg_bind, departure_code, arrival_code, max_weight_unit, max_dimensionsl_cm, ",
        "max_dimensions_units, adjusted, amt, amt_before_tax, currency_code, decimal_places, ",
        "ori_amt_after_tax, ori_currency_code, flight_segment_number, segment_id_ref, ",
        "traveler_id_ref, flight_segment_ref_number, geo_indicator, sale_model, ticket_time, ",
        "ticketing_status, e_ticket_number, ticket_advisory, cancel_amount",
        "from MP_Baggage"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="pnr", property="pnr", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancelable", property="cancelable", jdbcType=JdbcType.VARCHAR),
        @Result(column="quantity", property="quantity", jdbcType=JdbcType.INTEGER),
        @Result(column="refundable", property="refundable", jdbcType=JdbcType.VARCHAR),
        @Result(column="is_seg_bind", property="isSegBind", jdbcType=JdbcType.VARCHAR),
        @Result(column="departure_code", property="departureCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="arrival_code", property="arrivalCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_weight_unit", property="maxWeightUnit", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_dimensionsl_cm", property="maxDimensionslCm", jdbcType=JdbcType.VARCHAR),
        @Result(column="max_dimensions_units", property="maxDimensionsUnits", jdbcType=JdbcType.VARCHAR),
        @Result(column="adjusted", property="adjusted", jdbcType=JdbcType.VARCHAR),
        @Result(column="amt", property="amt", jdbcType=JdbcType.VARCHAR),
        @Result(column="amt_before_tax", property="amtBeforeTax", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency_code", property="currencyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="decimal_places", property="decimalPlaces", jdbcType=JdbcType.VARCHAR),
        @Result(column="ori_amt_after_tax", property="oriAmtAfterTax", jdbcType=JdbcType.VARCHAR),
        @Result(column="ori_currency_code", property="oriCurrencyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="flight_segment_number", property="flightSegmentNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="segment_id_ref", property="segmentIdRef", jdbcType=JdbcType.VARCHAR),
        @Result(column="traveler_id_ref", property="travelerIdRef", jdbcType=JdbcType.VARCHAR),
        @Result(column="flight_segment_ref_number", property="flightSegmentRefNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="geo_indicator", property="geoIndicator", jdbcType=JdbcType.VARCHAR),
        @Result(column="sale_model", property="saleModel", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_time", property="ticketTime", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticketing_status", property="ticketingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="e_ticket_number", property="eTicketNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="ticket_advisory", property="ticketAdvisory", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancel_amount", property="cancelAmount", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_BaggagePo> selectAll();
}