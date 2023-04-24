package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_farefamilyPo </p>
 * <p>Description: 存储MP的品牌权益信息 </p>
 * <p>Sample: new MP_AirPriceInfo_farefamilyPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirPriceInfo_farefamilyPo {

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
     * 功能说明: 待核实
     * 最后修改时间: 2023/04/20
     */
    private String ticketDesignatorCode;

    /**
     * 功能说明: 与此票价关联的票价系列代码
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyCode;

    /**
     * 功能说明: 主机返回的运价名
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyName;

    /**
     * 功能说明: 儿童规则按Y运价
     * 最后修改时间: 2023/04/20
     */
    private String chdRuleAsYfare;

    /**
     * 功能说明: 舱等名
     * 最后修改时间: 2023/04/20
     */
    private String cabinName;

    /**
     * 功能说明: 改为Open票
     * 最后修改时间: 2023/04/20
     */
    private String changeToOpen;

    /**
     * 功能说明: 描述
     * 最后修改时间: 2023/04/20
     */
    private String description;

    /**
     * 功能说明: 国内自助checkin
     * 最后修改时间: 2023/04/20
     */
    private String domesticSelfCheckin;

    /**
     * 功能说明: 运价基础
     * 最后修改时间: 2023/04/20
     */
    private String fareBasis;

    /**
     * 功能说明: 婴儿规则按Y运价
     * 最后修改时间: 2023/04/20
     */
    private String infRuleAsYFare;

    /**
     * 功能说明: 国际自助checkin
     * 最后修改时间: 2023/04/20
     */
    private String intlSelfCheckin;

    /**
     * 功能说明: 是否可升舱
     * 最后修改时间: 2023/04/20
     */
    private String upgradable;

    /**
     * 功能说明: ？
     * 最后修改时间: 2023/04/20
     */
    private String userType;

    /**
     * 功能说明: ？
     * 最后修改时间: 2023/04/20
     */
    private String username;

    /**
     * 功能说明: 航班出发后变更的费率
     * 最后修改时间: 2023/04/20
     */
    private String changeAftDeptRate;

    /**
     * 功能说明: 航班出发前变更的费率
     * 最后修改时间: 2023/04/20
     */
    private String changeBefDeptRate;

    /**
     * 功能说明: 航班变更费对应的货币种类
     * 最后修改时间: 2023/04/20
     */
    private String changeCurrency;

    /**
     * 功能说明: 航班变更政策适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String changePsgType;

    /**
     * 功能说明: 航班变更费计算的时间偏移量（相对于出发）
     * 最后修改时间: 2023/04/20
     */
    private String changeTimeThreshold;

    /**
     * 功能说明: 航班变更费类型（百分比或数值）
     * 最后修改时间: 2023/04/20
     */
    private String changeType;

    /**
     * 功能说明: 变更自愿还是非自愿
     * 最后修改时间: 2023/04/20
     */
    private String changeVoluntary;

    /**
     * 功能说明: 变更政策适用的舱位
     * 最后修改时间: 2023/04/20
     */
    private String changePolicyCabin;

    /**
     * 功能说明: 航班起飞前区间起始时间
     * 最后修改时间: 2023/04/20
     */
    private String changeStarttime;

    /**
     * 功能说明: 航班起飞前区间结束时间
     * 最后修改时间: 2023/04/20
     */
    private String changeEndtime;

    /**
     * 功能说明: 改期政策RBD
     * 最后修改时间: 2023/04/20
     */
    private String changePolicyRbd;

    /**
     * 功能说明: 改期限制
     * 最后修改时间: 2023/04/20
     */
    private String changeLimit;

    /**
     * 功能说明: 航班出发后退的费率
     * 最后修改时间: 2023/04/20
     */
    private String refundAftDeptRate;

    /**
     * 功能说明: 航班出发前退的费率
     * 最后修改时间: 2023/04/20
     */
    private String refundBefDeptRate;

    /**
     * 功能说明: 退费的货币类型
     * 最后修改时间: 2023/04/20
     */
    private String refundCurrency;

    /**
     * 功能说明: 退改政策适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String refundPsgType;

    /**
     * 功能说明: 退费计算的时间偏移量（相对于航班出发时间）
     * 最后修改时间: 2023/04/20
     */
    private String refundTimeThreshold;

    /**
     * 功能说明: 退费类型（百分比或数值）
     * 最后修改时间: 2023/04/20
     */
    private String refundType;

    /**
     * 功能说明: 自愿非自愿标识
     * 最后修改时间: 2023/04/20
     */
    private String refundVoluntary;

    /**
     * 功能说明: 退改政策适用舱位
     * 最后修改时间: 2023/04/20
     */
    private String refundPolicyCabin;

    /**
     * 功能说明: 退票限制
     * 最后修改时间: 2023/04/20
     */
    private String refundLimit;

    /**
     * 功能说明: 退票乘客类型
     * 最后修改时间: 2023/04/20
     */
    private String refundEligible;

    /**
     * 功能说明: 退票ruleid
     * 最后修改时间: 2023/04/20
     */
    private String refundLoyaltyRefundRuleId;

    /**
     * 功能说明: 退票结束时间
     * 最后修改时间: 2023/04/20
     */
    private String refundEndtime;

    /**
     * 功能说明: 退票开始时间
     * 最后修改时间: 2023/04/20
     */
    private String refundStarttime;

    /**
     * 功能说明: 退票政策RBD
     * 最后修改时间: 2023/04/20
     */
    private String refundPolicyRbd;

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

    public String getTicketDesignatorCode() {
        return ticketDesignatorCode;
    }

    public void setTicketDesignatorCode(String ticketDesignatorCode) {
        this.ticketDesignatorCode = ticketDesignatorCode;
    }

    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    public String getFareFamilyName() {
        return fareFamilyName;
    }

    public void setFareFamilyName(String fareFamilyName) {
        this.fareFamilyName = fareFamilyName;
    }

    public String getChdRuleAsYfare() {
        return chdRuleAsYfare;
    }

    public void setChdRuleAsYfare(String chdRuleAsYfare) {
        this.chdRuleAsYfare = chdRuleAsYfare;
    }

    public String getCabinName() {
        return cabinName;
    }

    public void setCabinName(String cabinName) {
        this.cabinName = cabinName;
    }

    public String getChangeToOpen() {
        return changeToOpen;
    }

    public void setChangeToOpen(String changeToOpen) {
        this.changeToOpen = changeToOpen;
    }

    public String getDescription() {
        return description;
    }

    public void setDescription(String description) {
        this.description = description;
    }

    public String getDomesticSelfCheckin() {
        return domesticSelfCheckin;
    }

    public void setDomesticSelfCheckin(String domesticSelfCheckin) {
        this.domesticSelfCheckin = domesticSelfCheckin;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getInfRuleAsYFare() {
        return infRuleAsYFare;
    }

    public void setInfRuleAsYFare(String infRuleAsYFare) {
        this.infRuleAsYFare = infRuleAsYFare;
    }

    public String getIntlSelfCheckin() {
        return intlSelfCheckin;
    }

    public void setIntlSelfCheckin(String intlSelfCheckin) {
        this.intlSelfCheckin = intlSelfCheckin;
    }

    public String getUpgradable() {
        return upgradable;
    }

    public void setUpgradable(String upgradable) {
        this.upgradable = upgradable;
    }

    public String getUserType() {
        return userType;
    }

    public void setUserType(String userType) {
        this.userType = userType;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getChangeAftDeptRate() {
        return changeAftDeptRate;
    }

    public void setChangeAftDeptRate(String changeAftDeptRate) {
        this.changeAftDeptRate = changeAftDeptRate;
    }

    public String getChangeBefDeptRate() {
        return changeBefDeptRate;
    }

    public void setChangeBefDeptRate(String changeBefDeptRate) {
        this.changeBefDeptRate = changeBefDeptRate;
    }

    public String getChangeCurrency() {
        return changeCurrency;
    }

    public void setChangeCurrency(String changeCurrency) {
        this.changeCurrency = changeCurrency;
    }

    public String getChangePsgType() {
        return changePsgType;
    }

    public void setChangePsgType(String changePsgType) {
        this.changePsgType = changePsgType;
    }

    public String getChangeTimeThreshold() {
        return changeTimeThreshold;
    }

    public void setChangeTimeThreshold(String changeTimeThreshold) {
        this.changeTimeThreshold = changeTimeThreshold;
    }

    public String getChangeType() {
        return changeType;
    }

    public void setChangeType(String changeType) {
        this.changeType = changeType;
    }

    public String getChangeVoluntary() {
        return changeVoluntary;
    }

    public void setChangeVoluntary(String changeVoluntary) {
        this.changeVoluntary = changeVoluntary;
    }

    public String getChangePolicyCabin() {
        return changePolicyCabin;
    }

    public void setChangePolicyCabin(String changePolicyCabin) {
        this.changePolicyCabin = changePolicyCabin;
    }

    public String getChangeStarttime() {
        return changeStarttime;
    }

    public void setChangeStarttime(String changeStarttime) {
        this.changeStarttime = changeStarttime;
    }

    public String getChangeEndtime() {
        return changeEndtime;
    }

    public void setChangeEndtime(String changeEndtime) {
        this.changeEndtime = changeEndtime;
    }

    public String getChangePolicyRbd() {
        return changePolicyRbd;
    }

    public void setChangePolicyRbd(String changePolicyRbd) {
        this.changePolicyRbd = changePolicyRbd;
    }

    public String getChangeLimit() {
        return changeLimit;
    }

    public void setChangeLimit(String changeLimit) {
        this.changeLimit = changeLimit;
    }

    public String getRefundAftDeptRate() {
        return refundAftDeptRate;
    }

    public void setRefundAftDeptRate(String refundAftDeptRate) {
        this.refundAftDeptRate = refundAftDeptRate;
    }

    public String getRefundBefDeptRate() {
        return refundBefDeptRate;
    }

    public void setRefundBefDeptRate(String refundBefDeptRate) {
        this.refundBefDeptRate = refundBefDeptRate;
    }

    public String getRefundCurrency() {
        return refundCurrency;
    }

    public void setRefundCurrency(String refundCurrency) {
        this.refundCurrency = refundCurrency;
    }

    public String getRefundPsgType() {
        return refundPsgType;
    }

    public void setRefundPsgType(String refundPsgType) {
        this.refundPsgType = refundPsgType;
    }

    public String getRefundTimeThreshold() {
        return refundTimeThreshold;
    }

    public void setRefundTimeThreshold(String refundTimeThreshold) {
        this.refundTimeThreshold = refundTimeThreshold;
    }

    public String getRefundType() {
        return refundType;
    }

    public void setRefundType(String refundType) {
        this.refundType = refundType;
    }

    public String getRefundVoluntary() {
        return refundVoluntary;
    }

    public void setRefundVoluntary(String refundVoluntary) {
        this.refundVoluntary = refundVoluntary;
    }

    public String getRefundPolicyCabin() {
        return refundPolicyCabin;
    }

    public void setRefundPolicyCabin(String refundPolicyCabin) {
        this.refundPolicyCabin = refundPolicyCabin;
    }

    public String getRefundLimit() {
        return refundLimit;
    }

    public void setRefundLimit(String refundLimit) {
        this.refundLimit = refundLimit;
    }

    public String getRefundEligible() {
        return refundEligible;
    }

    public void setRefundEligible(String refundEligible) {
        this.refundEligible = refundEligible;
    }

    public String getRefundLoyaltyRefundRuleId() {
        return refundLoyaltyRefundRuleId;
    }

    public void setRefundLoyaltyRefundRuleId(String refundLoyaltyRefundRuleId) {
        this.refundLoyaltyRefundRuleId = refundLoyaltyRefundRuleId;
    }

    public String getRefundEndtime() {
        return refundEndtime;
    }

    public void setRefundEndtime(String refundEndtime) {
        this.refundEndtime = refundEndtime;
    }

    public String getRefundStarttime() {
        return refundStarttime;
    }

    public void setRefundStarttime(String refundStarttime) {
        this.refundStarttime = refundStarttime;
    }

    public String getRefundPolicyRbd() {
        return refundPolicyRbd;
    }

    public void setRefundPolicyRbd(String refundPolicyRbd) {
        this.refundPolicyRbd = refundPolicyRbd;
    }
}