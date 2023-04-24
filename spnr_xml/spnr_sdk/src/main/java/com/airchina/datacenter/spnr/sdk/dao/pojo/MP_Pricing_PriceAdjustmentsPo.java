package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_PriceAdjustmentsPo </p>
 * <p>Description: 存储MP的调价信息 </p>
 * <p>Sample: new MP_Pricing_PriceAdjustmentsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_Pricing_PriceAdjustmentsPo {

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
     * 功能说明: 进行此次调价的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String adjustDate;

    /**
     * 功能说明: 对应此次调价的业务配置的CODE值
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明: 这一调整适用的产品类型
     * 最后修改时间: 2023/04/20
     */
    private String productType;

    /**
     * 功能说明: 此次调价信息描述
     * 最后修改时间: 2023/04/20
     */
    private String description;

    /**
     * 功能说明: 对应此次调价需支付的金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 该价格调整元素的单位金额
     * 最后修改时间: 2023/04/20
     */
    private String unitAmt;

    /**
     * 功能说明: SuperPNR 中audit的操作标识
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 这一调整适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 这一调整适用的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

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

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getAdjustDate() {
        return adjustDate;
    }

    public void setAdjustDate(String adjustDate) {
        this.adjustDate = adjustDate;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getProductType() {
        return productType;
    }

    public void setProductType(String productType) {
        this.productType = productType;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
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

    public String getUnitAmt() {
        return unitAmt;
    }

    public void setUnitAmt(String unitAmt) {
        this.unitAmt = unitAmt;
    }

    public Long getAuditId() {
        return auditId;
    }

    public void setAuditId(Long auditId) {
        this.auditId = auditId;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
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