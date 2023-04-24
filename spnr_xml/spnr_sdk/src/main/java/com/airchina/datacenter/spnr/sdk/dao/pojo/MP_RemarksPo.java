package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_RemarksPo </p>
 * <p>Description: 存储MP产品退后审核信息 </p>
 * <p>Sample: new MP_RemarksPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_RemarksPo {

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
     * 功能说明: 该Remark是否是激活状态,还是已成为历史
     * 最后修改时间: 2023/04/20
     */
    private String active;

    /**
     * 功能说明: 跟审计节点关联的ID
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 动作代码
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String codeContext;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String opsDate;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String agentSourceAddress;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String inTimestamp;

    /**
     * 功能说明: qualifier_item_name与qualifier_item_value组合成了qualifier_item, 如k1:v1|k2:v2|k3:v3
     * 最后修改时间: 2023/04/20
     */
    private String qualifierInfo;

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

    public String getActive() {
        return active;
    }

    public void setActive(String active) {
        this.active = active;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getCodeContext() {
        return codeContext;
    }

    public void setCodeContext(String codeContext) {
        this.codeContext = codeContext;
    }

    public String getOpsDate() {
        return opsDate;
    }

    public void setOpsDate(String opsDate) {
        this.opsDate = opsDate;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public Long getRph() {
        return rph;
    }

    public void setRph(Long rph) {
        this.rph = rph;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getAgentSourceAddress() {
        return agentSourceAddress;
    }

    public void setAgentSourceAddress(String agentSourceAddress) {
        this.agentSourceAddress = agentSourceAddress;
    }

    public String getInTimestamp() {
        return inTimestamp;
    }

    public void setInTimestamp(String inTimestamp) {
        this.inTimestamp = inTimestamp;
    }

    public String getQualifierInfo() {
        return qualifierInfo;
    }

    public void setQualifierInfo(String qualifierInfo) {
        this.qualifierInfo = qualifierInfo;
    }
}