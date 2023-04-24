package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_CancellationRefundsPo </p>
 * <p>Description: 存储MP产品的退票费信息 </p>
 * <p>Sample: new MP_Pricing_CancellationRefundsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_Pricing_CancellationRefundsPo {

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
     * 功能说明: 是否允许自动？
     * 最后修改时间: 2023/04/20
     */
    private String allowAuto;

    /**
     * 功能说明: 此次扣款金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 添加此CancellationRefunds的Audit ID,与SPNR下的Audits相对应
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 此次扣款对应的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 如果此产品是另一个产品的附加产品,则它包含该主产品的编号。 它可以在合成预订消息时使用,以将产品组合在一起, 现阶段默认为0
     * 最后修改时间: 2023/04/20
     */
    private Long masterProductNumber;

    /**
     * 功能说明: MP内旅客序号唯一标识
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 当前CancellationRefunds是在MP处于哪个@ProductNumber时添加的
     * 最后修改时间: 2023/04/20
     */
    private Long cancelRefundProductNumber;

    /**
     * 功能说明: 产品类型
     * 最后修改时间: 2023/04/20
     */
    private String productType;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 基础票价
     * 最后修改时间: 2023/04/20
     */
    private String baseFareAmt;

    /**
     * 功能说明: 基础票价退票金额
     * 最后修改时间: 2023/04/20
     */
    private String baseFareRefundAmt;

    /**
     * 功能说明: 税费金额
     * 最后修改时间: 2023/04/20
     */
    private String taxesRefund;

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

    public String getAllowAuto() {
        return allowAuto;
    }

    public void setAllowAuto(String allowAuto) {
        this.allowAuto = allowAuto;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public Long getMasterProductNumber() {
        return masterProductNumber;
    }

    public void setMasterProductNumber(Long masterProductNumber) {
        this.masterProductNumber = masterProductNumber;
    }

    public Long getOjSuperPnrRph() {
        return ojSuperPnrRph;
    }

    public void setOjSuperPnrRph(Long ojSuperPnrRph) {
        this.ojSuperPnrRph = ojSuperPnrRph;
    }

    public Long getCancelRefundProductNumber() {
        return cancelRefundProductNumber;
    }

    public void setCancelRefundProductNumber(Long cancelRefundProductNumber) {
        this.cancelRefundProductNumber = cancelRefundProductNumber;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public String getBaseFareAmt() {
        return baseFareAmt;
    }

    public void setBaseFareAmt(String baseFareAmt) {
        this.baseFareAmt = baseFareAmt;
    }

    public String getBaseFareRefundAmt() {
        return baseFareRefundAmt;
    }

    public void setBaseFareRefundAmt(String baseFareRefundAmt) {
        this.baseFareRefundAmt = baseFareRefundAmt;
    }

    public String getTaxesRefund() {
        return taxesRefund;
    }

    public void setTaxesRefund(String taxesRefund) {
        this.taxesRefund = taxesRefund;
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