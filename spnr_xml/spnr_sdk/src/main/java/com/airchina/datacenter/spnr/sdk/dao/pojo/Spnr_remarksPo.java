package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_remarksPo </p>
 * <p>Description: 存储订单的退后审核信息 </p>
 * <p>Sample: new Spnr_remarksPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_remarksPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

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
     * 功能说明: 动作代码的文本
     * 最后修改时间: 2023/04/20
     */
    private String codeContext;

    /**
     * 功能说明: 增加remark项的日期和时间
     * 最后修改时间: 2023/04/20
     */
    private String remarkDate;

    /**
     * 功能说明: 它用于将所有remark元素组合在一起,当remark第一次创建时,它将被发送到RPH,此后不再更改
     * 最后修改时间: 2023/04/20
     */
    private Long historyRph;

    /**
     * 功能说明: remark项最后修改的日期和时间
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明: 标记remark的唯一键
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明: SPNR在db中的编号标识位置
     * 最后修改时间: 2023/04/20
     */
    private Long seqNo;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 所记录审核信息的类型
     * 最后修改时间: 2023/04/20
     */
    private String qualifierDescription;

    /**
     * 功能说明: 所记录审核信息的值
     * 最后修改时间: 2023/04/20
     */
    private String qualifierValue;

    /**
     * 功能说明: 审核所处理的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 审核所处理的旅客序号
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 审核所关联的电子客票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 审核所处理产品的原始ID
     * 最后修改时间: 2023/04/20
     */
    private Long historyId;

    /**
     * 功能说明: 审核所处理产品ID
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: 退票条款的细分
     * 最后修改时间: 2023/04/20
     */
    private String qualifierItem;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
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

    public String getRemarkDate() {
        return remarkDate;
    }

    public void setRemarkDate(String remarkDate) {
        this.remarkDate = remarkDate;
    }

    public Long getHistoryRph() {
        return historyRph;
    }

    public void setHistoryRph(Long historyRph) {
        this.historyRph = historyRph;
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

    public Long getSeqNo() {
        return seqNo;
    }

    public void setSeqNo(Long seqNo) {
        this.seqNo = seqNo;
    }

    public String getAgent() {
        return agent;
    }

    public void setAgent(String agent) {
        this.agent = agent;
    }

    public String getQualifierDescription() {
        return qualifierDescription;
    }

    public void setQualifierDescription(String qualifierDescription) {
        this.qualifierDescription = qualifierDescription;
    }

    public String getQualifierValue() {
        return qualifierValue;
    }

    public void setQualifierValue(String qualifierValue) {
        this.qualifierValue = qualifierValue;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public Long getOjSuperPnrRph() {
        return ojSuperPnrRph;
    }

    public void setOjSuperPnrRph(Long ojSuperPnrRph) {
        this.ojSuperPnrRph = ojSuperPnrRph;
    }

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getQualifierItem() {
        return qualifierItem;
    }

    public void setQualifierItem(String qualifierItem) {
        this.qualifierItem = qualifierItem;
    }
}