package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_CancellationRefundsPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_Pricing_CancellationRefundsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Pricing_CancellationRefunds
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_Pricing_CancellationRefunds (super_pnr_id, search_id, ",
        "product_number, allow_auto, ",
        "amt, currency_code, ",
        "audit_id, flight_segment_rph, ",
        "master_product_number, oj_super_pnr_rph, ",
        "cancel_rfd_product_number, product_type, ",
        "e_ticket_number, base_fare_amt, ",
        "base_fare_refund_amt, taxes_refund, ",
        "agent, agent_url, ",
        "agency)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{allowAuto,jdbcType=VARCHAR}, ",
        "#{amt,jdbcType=VARCHAR}, #{currencyCode,jdbcType=VARCHAR}, ",
        "#{auditId,jdbcType=VARCHAR}, #{flightSegmentRph,jdbcType=VARCHAR}, ",
        "#{masterProductNumber,jdbcType=VARCHAR}, #{ojSuperPnrRph,jdbcType=VARCHAR}, ",
        "#{cancelRfdProductNumber,jdbcType=VARCHAR}, #{productType,jdbcType=VARCHAR}, ",
        "#{eTicketNumber,jdbcType=VARCHAR}, #{baseFareAmt,jdbcType=VARCHAR}, ",
        "#{baseFareRefundAmt,jdbcType=VARCHAR}, #{taxesRefund,jdbcType=VARCHAR}, ",
        "#{agent,jdbcType=VARCHAR}, #{agentUrl,jdbcType=VARCHAR}, ",
        "#{agency,jdbcType=VARCHAR})"
    })
    int insert(MP_Pricing_CancellationRefundsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Pricing_CancellationRefunds
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, allow_auto, amt, currency_code, audit_id, ",
        "flight_segment_rph, master_product_number, oj_super_pnr_rph, cancel_rfd_product_number, ",
        "product_type, e_ticket_number, base_fare_amt, base_fare_refund_amt, taxes_refund, ",
        "agent, agent_url, agency",
        "from MP_Pricing_CancellationRefunds"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="allow_auto", property="allowAuto", jdbcType=JdbcType.VARCHAR),
        @Result(column="amt", property="amt", jdbcType=JdbcType.VARCHAR),
        @Result(column="currency_code", property="currencyCode", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_id", property="auditId", jdbcType=JdbcType.VARCHAR),
        @Result(column="flight_segment_rph", property="flightSegmentRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="master_product_number", property="masterProductNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="oj_super_pnr_rph", property="ojSuperPnrRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancel_rfd_product_number", property="cancelRfdProductNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_type", property="productType", jdbcType=JdbcType.VARCHAR),
        @Result(column="e_ticket_number", property="eTicketNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="base_fare_amt", property="baseFareAmt", jdbcType=JdbcType.VARCHAR),
        @Result(column="base_fare_refund_amt", property="baseFareRefundAmt", jdbcType=JdbcType.VARCHAR),
        @Result(column="taxes_refund", property="taxesRefund", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent", property="agent", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_url", property="agentUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="agency", property="agency", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_Pricing_CancellationRefundsPo> selectAll();
}