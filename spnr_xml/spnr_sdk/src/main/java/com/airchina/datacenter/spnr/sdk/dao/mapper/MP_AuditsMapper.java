package com.airchina.datacenter.spnr.sdk.dao.mapper;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AuditsPo;
import java.util.List;
import org.apache.ibatis.annotations.Insert;
import org.apache.ibatis.annotations.Result;
import org.apache.ibatis.annotations.Results;
import org.apache.ibatis.annotations.Select;
import org.apache.ibatis.type.JdbcType;

public interface MP_AuditsMapper {
    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Audits
     *
     * @mbg.generated
     */
    @Insert({
        "insert into MP_Audits (super_pnr_id, search_id, ",
        "product_number, pnr, ",
        "audit_id, requestor_id, ",
        "channel, version, ",
        "in_timestamp, source_address, ",
        "`action`, agent, agent_url, ",
        "agency, event_context, ",
        "event_id, event_oj_super_pnr_rph, ",
        "event_orig_value, event_ref_id, ",
        "event_path, event_type, ",
        "event_flt_seg_rph, event_ref_path)",
        "values (#{superPnrId,jdbcType=VARCHAR}, #{searchId,jdbcType=VARCHAR}, ",
        "#{productNumber,jdbcType=VARCHAR}, #{pnr,jdbcType=VARCHAR}, ",
        "#{auditId,jdbcType=VARCHAR}, #{requestorId,jdbcType=VARCHAR}, ",
        "#{channel,jdbcType=VARCHAR}, #{version,jdbcType=VARCHAR}, ",
        "#{inTimestamp,jdbcType=VARCHAR}, #{sourceAddress,jdbcType=VARCHAR}, ",
        "#{action,jdbcType=VARCHAR}, #{agent,jdbcType=VARCHAR}, #{agentUrl,jdbcType=VARCHAR}, ",
        "#{agency,jdbcType=VARCHAR}, #{eventContext,jdbcType=VARCHAR}, ",
        "#{eventId,jdbcType=VARCHAR}, #{eventOjSuperPnrRph,jdbcType=VARCHAR}, ",
        "#{eventOrigValue,jdbcType=VARCHAR}, #{eventRefId,jdbcType=VARCHAR}, ",
        "#{eventPath,jdbcType=VARCHAR}, #{eventType,jdbcType=VARCHAR}, ",
        "#{eventFltSegRph,jdbcType=VARCHAR}, #{eventRefPath,jdbcType=VARCHAR})"
    })
    int insert(MP_AuditsPo row);

    /**
     * This method was generated by MyBatis Generator.
     * This method corresponds to the database table MP_Audits
     *
     * @mbg.generated
     */
    @Select({
        "select",
        "super_pnr_id, search_id, product_number, pnr, audit_id, requestor_id, channel, ",
        "version, in_timestamp, source_address, `action`, agent, agent_url, agency, event_context, ",
        "event_id, event_oj_super_pnr_rph, event_orig_value, event_ref_id, event_path, ",
        "event_type, event_flt_seg_rph, event_ref_path",
        "from MP_Audits"
    })
    @Results({
        @Result(column="super_pnr_id", property="superPnrId", jdbcType=JdbcType.VARCHAR),
        @Result(column="search_id", property="searchId", jdbcType=JdbcType.VARCHAR),
        @Result(column="product_number", property="productNumber", jdbcType=JdbcType.VARCHAR),
        @Result(column="pnr", property="pnr", jdbcType=JdbcType.VARCHAR),
        @Result(column="audit_id", property="auditId", jdbcType=JdbcType.VARCHAR),
        @Result(column="requestor_id", property="requestorId", jdbcType=JdbcType.VARCHAR),
        @Result(column="channel", property="channel", jdbcType=JdbcType.VARCHAR),
        @Result(column="version", property="version", jdbcType=JdbcType.VARCHAR),
        @Result(column="in_timestamp", property="inTimestamp", jdbcType=JdbcType.VARCHAR),
        @Result(column="source_address", property="sourceAddress", jdbcType=JdbcType.VARCHAR),
        @Result(column="action", property="action", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent", property="agent", jdbcType=JdbcType.VARCHAR),
        @Result(column="agent_url", property="agentUrl", jdbcType=JdbcType.VARCHAR),
        @Result(column="agency", property="agency", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_context", property="eventContext", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_id", property="eventId", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_oj_super_pnr_rph", property="eventOjSuperPnrRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_orig_value", property="eventOrigValue", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_ref_id", property="eventRefId", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_path", property="eventPath", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_type", property="eventType", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_flt_seg_rph", property="eventFltSegRph", jdbcType=JdbcType.VARCHAR),
        @Result(column="event_ref_path", property="eventRefPath", jdbcType=JdbcType.VARCHAR)
    })
    List<MP_AuditsPo> selectAll();
}