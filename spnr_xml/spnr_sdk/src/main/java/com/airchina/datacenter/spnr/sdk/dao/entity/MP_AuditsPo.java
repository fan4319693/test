package com.airchina.datacenter.spnr.sdk.dao.entity;

/**
 * Database Table Remarks:
 *   存储MP发生修改时所关联的Audit ID
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table MP_Audits
 */
public class MP_AuditsPo {
    /**
     * Database Column Remarks:
     *   SPNR ID，唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.super_pnr_id
     *
     * @mbg.generated
     */
    private String superPnrId;

    /**
     * Database Column Remarks:
     *   最终用户进行的搜索的 ID的唯一标识。
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.search_id
     *
     * @mbg.generated
     */
    private String searchId;

    /**
     * Database Column Remarks:
     *   该SPNR内MP唯一序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.product_number
     *
     * @mbg.generated
     */
    private String productNumber;

    /**
     * Database Column Remarks:
     *   PNR号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.pnr
     *
     * @mbg.generated
     */
    private String pnr;

    /**
     * Database Column Remarks:
     *   该Audit节点的唯一标识，每次操作都递
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.audit_id
     *
     * @mbg.generated
     */
    private String auditId;

    /**
     * Database Column Remarks:
     *   发起此次操作请求的渠道ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.requestor_id
     *
     * @mbg.generated
     */
    private String requestorId;

    /**
     * Database Column Remarks:
     *   发起此次操作的渠道
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.channel
     *
     * @mbg.generated
     */
    private String channel;

    /**
     * Database Column Remarks:
     *   版本号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.version
     *
     * @mbg.generated
     */
    private String version;

    /**
     * Database Column Remarks:
     *   发起此次操作请求的时间 注：非北京时间，
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.in_timestamp
     *
     * @mbg.generated
     */
    private String inTimestamp;

    /**
     * Database Column Remarks:
     *   发起此次操作请求的IP地址
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.source_address
     *
     * @mbg.generated
     */
    private String sourceAddress;

    /**
     * Database Column Remarks:
     *   记录此次操作类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.action
     *
     * @mbg.generated
     */
    private String action;

    /**
     * Database Column Remarks:
     *   渠道名或ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.agent
     *
     * @mbg.generated
     */
    private String agent;

    /**
     * Database Column Remarks:
     *   处理该次请求的服务器IP
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.agent_url
     *
     * @mbg.generated
     */
    private String agentUrl;

    /**
     * Database Column Remarks:
     *   渠道名或ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.agency
     *
     * @mbg.generated
     */
    private String agency;

    /**
     * Database Column Remarks:
     *   记录操作的产品类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_context
     *
     * @mbg.generated
     */
    private String eventContext;

    /**
     * Database Column Remarks:
     *   该产品的Product ID
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_id
     *
     * @mbg.generated
     */
    private String eventId;

    /**
     * Database Column Remarks:
     *   导致改变的Traveler
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_oj_super_pnr_rph
     *
     * @mbg.generated
     */
    private String eventOjSuperPnrRph;

    /**
     * Database Column Remarks:
     *   改变之前的值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_orig_value
     *
     * @mbg.generated
     */
    private String eventOrigValue;

    /**
     * Database Column Remarks:
     *   改变之后的值
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_ref_id
     *
     * @mbg.generated
     */
    private String eventRefId;

    /**
     * Database Column Remarks:
     *   涉及的信息路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_path
     *
     * @mbg.generated
     */
    private String eventPath;

    /**
     * Database Column Remarks:
     *   改变值的类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_type
     *
     * @mbg.generated
     */
    private String eventType;

    /**
     * Database Column Remarks:
     *   导致改变的FlightSegment
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_flt_seg_rph
     *
     * @mbg.generated
     */
    private String eventFltSegRph;

    /**
     * Database Column Remarks:
     *   值的路径
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_Audits.event_ref_path
     *
     * @mbg.generated
     */
    private String eventRefPath;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.super_pnr_id
     *
     * @return the value of MP_Audits.super_pnr_id
     *
     * @mbg.generated
     */
    public String getSuperPnrId() {
        return superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.super_pnr_id
     *
     * @param superPnrId the value for MP_Audits.super_pnr_id
     *
     * @mbg.generated
     */
    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.search_id
     *
     * @return the value of MP_Audits.search_id
     *
     * @mbg.generated
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.search_id
     *
     * @param searchId the value for MP_Audits.search_id
     *
     * @mbg.generated
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.product_number
     *
     * @return the value of MP_Audits.product_number
     *
     * @mbg.generated
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.product_number
     *
     * @param productNumber the value for MP_Audits.product_number
     *
     * @mbg.generated
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.pnr
     *
     * @return the value of MP_Audits.pnr
     *
     * @mbg.generated
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.pnr
     *
     * @param pnr the value for MP_Audits.pnr
     *
     * @mbg.generated
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.audit_id
     *
     * @return the value of MP_Audits.audit_id
     *
     * @mbg.generated
     */
    public String getAuditId() {
        return auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.audit_id
     *
     * @param auditId the value for MP_Audits.audit_id
     *
     * @mbg.generated
     */
    public void setAuditId(String auditId) {
        this.auditId = auditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.requestor_id
     *
     * @return the value of MP_Audits.requestor_id
     *
     * @mbg.generated
     */
    public String getRequestorId() {
        return requestorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.requestor_id
     *
     * @param requestorId the value for MP_Audits.requestor_id
     *
     * @mbg.generated
     */
    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.channel
     *
     * @return the value of MP_Audits.channel
     *
     * @mbg.generated
     */
    public String getChannel() {
        return channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.channel
     *
     * @param channel the value for MP_Audits.channel
     *
     * @mbg.generated
     */
    public void setChannel(String channel) {
        this.channel = channel;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.version
     *
     * @return the value of MP_Audits.version
     *
     * @mbg.generated
     */
    public String getVersion() {
        return version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.version
     *
     * @param version the value for MP_Audits.version
     *
     * @mbg.generated
     */
    public void setVersion(String version) {
        this.version = version;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.in_timestamp
     *
     * @return the value of MP_Audits.in_timestamp
     *
     * @mbg.generated
     */
    public String getInTimestamp() {
        return inTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.in_timestamp
     *
     * @param inTimestamp the value for MP_Audits.in_timestamp
     *
     * @mbg.generated
     */
    public void setInTimestamp(String inTimestamp) {
        this.inTimestamp = inTimestamp;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.source_address
     *
     * @return the value of MP_Audits.source_address
     *
     * @mbg.generated
     */
    public String getSourceAddress() {
        return sourceAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.source_address
     *
     * @param sourceAddress the value for MP_Audits.source_address
     *
     * @mbg.generated
     */
    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.action
     *
     * @return the value of MP_Audits.action
     *
     * @mbg.generated
     */
    public String getAction() {
        return action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.action
     *
     * @param action the value for MP_Audits.action
     *
     * @mbg.generated
     */
    public void setAction(String action) {
        this.action = action;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.agent
     *
     * @return the value of MP_Audits.agent
     *
     * @mbg.generated
     */
    public String getAgent() {
        return agent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.agent
     *
     * @param agent the value for MP_Audits.agent
     *
     * @mbg.generated
     */
    public void setAgent(String agent) {
        this.agent = agent;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.agent_url
     *
     * @return the value of MP_Audits.agent_url
     *
     * @mbg.generated
     */
    public String getAgentUrl() {
        return agentUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.agent_url
     *
     * @param agentUrl the value for MP_Audits.agent_url
     *
     * @mbg.generated
     */
    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.agency
     *
     * @return the value of MP_Audits.agency
     *
     * @mbg.generated
     */
    public String getAgency() {
        return agency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.agency
     *
     * @param agency the value for MP_Audits.agency
     *
     * @mbg.generated
     */
    public void setAgency(String agency) {
        this.agency = agency;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_context
     *
     * @return the value of MP_Audits.event_context
     *
     * @mbg.generated
     */
    public String getEventContext() {
        return eventContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_context
     *
     * @param eventContext the value for MP_Audits.event_context
     *
     * @mbg.generated
     */
    public void setEventContext(String eventContext) {
        this.eventContext = eventContext;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_id
     *
     * @return the value of MP_Audits.event_id
     *
     * @mbg.generated
     */
    public String getEventId() {
        return eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_id
     *
     * @param eventId the value for MP_Audits.event_id
     *
     * @mbg.generated
     */
    public void setEventId(String eventId) {
        this.eventId = eventId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_oj_super_pnr_rph
     *
     * @return the value of MP_Audits.event_oj_super_pnr_rph
     *
     * @mbg.generated
     */
    public String getEventOjSuperPnrRph() {
        return eventOjSuperPnrRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_oj_super_pnr_rph
     *
     * @param eventOjSuperPnrRph the value for MP_Audits.event_oj_super_pnr_rph
     *
     * @mbg.generated
     */
    public void setEventOjSuperPnrRph(String eventOjSuperPnrRph) {
        this.eventOjSuperPnrRph = eventOjSuperPnrRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_orig_value
     *
     * @return the value of MP_Audits.event_orig_value
     *
     * @mbg.generated
     */
    public String getEventOrigValue() {
        return eventOrigValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_orig_value
     *
     * @param eventOrigValue the value for MP_Audits.event_orig_value
     *
     * @mbg.generated
     */
    public void setEventOrigValue(String eventOrigValue) {
        this.eventOrigValue = eventOrigValue;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_ref_id
     *
     * @return the value of MP_Audits.event_ref_id
     *
     * @mbg.generated
     */
    public String getEventRefId() {
        return eventRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_ref_id
     *
     * @param eventRefId the value for MP_Audits.event_ref_id
     *
     * @mbg.generated
     */
    public void setEventRefId(String eventRefId) {
        this.eventRefId = eventRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_path
     *
     * @return the value of MP_Audits.event_path
     *
     * @mbg.generated
     */
    public String getEventPath() {
        return eventPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_path
     *
     * @param eventPath the value for MP_Audits.event_path
     *
     * @mbg.generated
     */
    public void setEventPath(String eventPath) {
        this.eventPath = eventPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_type
     *
     * @return the value of MP_Audits.event_type
     *
     * @mbg.generated
     */
    public String getEventType() {
        return eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_type
     *
     * @param eventType the value for MP_Audits.event_type
     *
     * @mbg.generated
     */
    public void setEventType(String eventType) {
        this.eventType = eventType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_flt_seg_rph
     *
     * @return the value of MP_Audits.event_flt_seg_rph
     *
     * @mbg.generated
     */
    public String getEventFltSegRph() {
        return eventFltSegRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_flt_seg_rph
     *
     * @param eventFltSegRph the value for MP_Audits.event_flt_seg_rph
     *
     * @mbg.generated
     */
    public void setEventFltSegRph(String eventFltSegRph) {
        this.eventFltSegRph = eventFltSegRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_Audits.event_ref_path
     *
     * @return the value of MP_Audits.event_ref_path
     *
     * @mbg.generated
     */
    public String getEventRefPath() {
        return eventRefPath;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_Audits.event_ref_path
     *
     * @param eventRefPath the value for MP_Audits.event_ref_path
     *
     * @mbg.generated
     */
    public void setEventRefPath(String eventRefPath) {
        this.eventRefPath = eventRefPath;
    }
}