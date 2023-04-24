package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AuditsPo </p>
 * <p>Description: 存储MP发生修改时所关联的Audit ID </p>
 * <p>Sample: new MP_AuditsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AuditsPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/04/20
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: PNR号
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: 该Audit节点的唯一标识,每次操作都递增加1
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 发起此次操作请求的渠道ID
     * 最后修改时间: 2023/04/20
     */
    private String requestorId;

    /**
     * 功能说明: 发起此次操作的渠道
     * 最后修改时间: 2023/04/20
     */
    private String channel;

    /**
     * 功能说明: 版本号
     * 最后修改时间: 2023/04/20
     */
    private String version;

    /**
     * 功能说明: 发起此次操作请求的时间(注:非北京时间,转换为北京时间需+8个小时)
     * 最后修改时间: 2023/04/20
     */
    private String inTimestamp;

    /**
     * 功能说明: 发起此次操作请求的IP地址
     * 最后修改时间: 2023/04/20
     */
    private String sourceAddress;

    /**
     * 功能说明: 记录此次操作类型
     * 最后修改时间: 2023/04/20
     */
    private String action;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 处理该次请求的服务器IP
     * 最后修改时间: 2023/04/20
     */
    private String agentUrl;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agency;

    /**
     * 功能说明: 填入此次操作的坐席CID
     * 最后修改时间: 2023/04/20
     */
    private String agentId;

    /**
     * 功能说明: 记录发起此次操作的坐席技能组
     * 最后修改时间: 2023/04/20
     */
    private String agentFunctionalGroup;

    /**
     * 功能说明: 记录发起此次操作的坐席行政组
     * 最后修改时间: 2023/04/20
     */
    private String agentAdministrativeGroup;

    /**
     * 功能说明: 事件信息
     * 最后修改时间: 2023/04/20
     */
    private String eventInfo;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getRequestorId() {
        return requestorId;
    }

    public void setRequestorId(String requestorId) {
        this.requestorId = requestorId;
    }

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getVersion() {
        return version;
    }

    public void setVersion(String version) {
        this.version = version;
    }

    public String getInTimestamp() {
        return inTimestamp;
    }

    public void setInTimestamp(String inTimestamp) {
        this.inTimestamp = inTimestamp;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getAction() {
        return action;
    }

    public void setAction(String action) {
        this.action = action;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgentUrl() {
        return agentUrl;
    }

    public void setAgentUrl(String agentUrl) {
        this.agentUrl = agentUrl;
    }

    public String getAgency() {
        return agency;
    }

    public void setAgency(String agency) {
        this.agency = agency;
    }

    public String getEventInfo() {
        return eventInfo;
    }

    public void setEventInfo(String eventInfo) {
        this.eventInfo = eventInfo;
    }

    public String getAgentId() {
        return agentId;
    }

    public void setAgentId(String agentId) {
        this.agentId = agentId;
    }

    public String getAgentFunctionalGroup() {
        return agentFunctionalGroup;
    }

    public void setAgentFunctionalGroup(String agentFunctionalGroup) {
        this.agentFunctionalGroup = agentFunctionalGroup;
    }

    public String getAgentAdministrativeGroup() {
        return agentAdministrativeGroup;
    }

    public void setAgentAdministrativeGroup(String agentAdministrativeGroup) {
        this.agentAdministrativeGroup = agentAdministrativeGroup;
    }
}