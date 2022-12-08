package com.airchina.datacenter.spnr.sdk.dao.mapper;


import com.airchina.datacenter.spnr.sdk.dao.entity.SuperPNRPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface SuperPNRMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SuperPNR
     *
     * @mbg.generated
     */
    @Insert({
        "insert into SuperPNR (super_pnr_id, booking_date, ",
        "processing_status, booking_status, ",
        "ts_booking_status, start_date, ",
        "end_date, destination, ",
        "summary, tk_cancel_type, ",
        "cancellation_date, full_history, ",
        "last_audit_id, last_modified, ",
        "schema_version, source_address, ",
        "cancel_time_limit)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{bookingDate,jdbcType=VARCHAR}, ",
        "#{processingStatus,jdbcType=VARCHAR}, #{bookingStatus,jdbcType=VARCHAR}, ",
        "#{tsBookingStatus,jdbcType=VARCHAR}, #{startDate,jdbcType=VARCHAR}, ",
        "#{endDate,jdbcType=VARCHAR}, #{destination,jdbcType=VARCHAR}, ",
        "#{summary,jdbcType=VARCHAR}, #{tkCancelType,jdbcType=VARCHAR}, ",
        "#{cancellationDate,jdbcType=VARCHAR}, #{fullHistory,jdbcType=VARCHAR}, ",
        "#{lastAuditId,jdbcType=INTEGER}, #{lastModified,jdbcType=VARCHAR}, ",
        "#{schemaVersion,jdbcType=VARCHAR}, #{sourceAddress,jdbcType=VARCHAR}, ",
        "#{cancelTimeLimit,jdbcType=VARCHAR})"
    })
    int insert(SuperPNRPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table SuperPNR
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, booking_date, processing_status, booking_status, ts_booking_status, ",
        "start_date, end_date, destination, summary, tk_cancel_type, cancellation_date, ",
        "full_history, last_audit_id, last_modified, schema_version, source_address, ",
        "cancel_time_limit",
        "from SuperPNR"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="booking_date", property="bookingDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="processing_status", property="processingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="booking_status", property="bookingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="ts_booking_status", property="tsBookingStatus", jdbcType=JdbcType.VARCHAR),
        @Result(column="start_date", property="startDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="end_date", property="endDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="destination", property="destination", jdbcType=JdbcType.VARCHAR),
        @Result(column="summary", property="summary", jdbcType=JdbcType.VARCHAR),
        @Result(column="tk_cancel_type", property="tkCancelType", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancellation_date", property="cancellationDate", jdbcType=JdbcType.VARCHAR),
        @Result(column="full_history", property="fullHistory", jdbcType=JdbcType.VARCHAR),
        @Result(column="last_audit_id", property="lastAuditId", jdbcType=JdbcType.INTEGER),
        @Result(column="last_modified", property="lastModified", jdbcType=JdbcType.VARCHAR),
        @Result(column="schema_version", property="schemaVersion", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_address", property="sourceAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="cancel_time_limit", property="cancelTimeLimit", jdbcType=JdbcType.VARCHAR)
    })
    List<SuperPNRPo> selectAll();
}