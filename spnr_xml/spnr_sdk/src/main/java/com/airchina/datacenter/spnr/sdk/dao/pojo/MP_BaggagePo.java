package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_BaggagePo </p>
 * <p>Description: 存储MP附加产品：预付费行李 </p>
 * <p>Sample: new MP_BaggagePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_BaggagePo {

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
     * 功能说明: 行李能否单独取消
     * 最后修改时间: 2023/04/20
     */
    private String cancelable;

    /**
     * 功能说明: 产品数量
     * 最后修改时间: 2023/04/20
     */
    private Long quantity;

    /**
     * 功能说明: 该产品能否单独退
     * 最后修改时间: 2023/04/20
     */
    private String refundable;

    /**
     * 功能说明: 该产品是否与机票绑定
     * 最后修改时间: 2023/04/20
     */
    private String isSegBind;

    /**
     * 功能说明: 行李相对应的航段出发地
     * 最后修改时间: 2023/04/20
     */
    private String departureCode;

    /**
     * 功能说明: 行李相对应的航段到达地
     * 最后修改时间: 2023/04/20
     */
    private String arrivalCode;

    /**
     * 功能说明: 最大重量计量
     * 最后修改时间: 2023/04/20
     */
    private String maxWeight;

    /**
     * 功能说明: 最大重量计量单位
     * 最后修改时间: 2023/04/20
     */
    private String maxWeightUnit;

    /**
     * 功能说明: 购买的行李最大尺寸长度
     * 最后修改时间: 2023/04/20
     */
    private String maxDimensionslCm;

    /**
     * 功能说明: 最大尺寸计量单位
     * 最后修改时间: 2023/04/20
     */
    private String maxDimensionsUnits;

    /**
     * 功能说明: 调整金额
     * 最后修改时间: 2023/04/20
     */
    private String adjusted;

    /**
     * 功能说明: 金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 税前金额
     * 最后修改时间: 2023/04/20
     */
    private String amtBeforeTax;

    /**
     * 功能说明: 货币代码
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String decimalPlaces;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String oriAmtAfterTax;

    /**
     * 功能说明: 原始货币代码
     * 最后修改时间: 2023/04/20
     */
    private String oriCurrencyCode;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/04/20
     */
    private String flightSegmentNumber;

    /**
     * 功能说明: 对应的旅客序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 航段序号,唯一值,不变
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String geoIndicator;

    /**
     * 功能说明: 销售模式
     * 最后修改时间: 2023/04/20
     */
    private String saleModel;

    /**
     * 功能说明: 出票时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTime;

    /**
     * 功能说明: 出票状态
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: PNR中展示的附加服务明细
     * 最后修改时间: 2023/04/20
     */
    private String ticketAdvisory;

    /**
     * 功能说明: 退行李手续费
     * 最后修改时间: 2023/04/20
     */
    private String cancelAmount;

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

    public String getCancelable() {
        return cancelable;
    }

    public void setCancelable(String cancelable) {
        this.cancelable = cancelable;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getRefundable() {
        return refundable;
    }

    public void setRefundable(String refundable) {
        this.refundable = refundable;
    }

    public String getIsSegBind() {
        return isSegBind;
    }

    public void setIsSegBind(String isSegBind) {
        this.isSegBind = isSegBind;
    }

    public String getDepartureCode() {
        return departureCode;
    }

    public void setDepartureCode(String departureCode) {
        this.departureCode = departureCode;
    }

    public String getArrivalCode() {
        return arrivalCode;
    }

    public void setArrivalCode(String arrivalCode) {
        this.arrivalCode = arrivalCode;
    }

    public String getMaxWeight() {
        return maxWeight;
    }

    public void setMaxWeight(String maxWeight) {
        this.maxWeight = maxWeight;
    }

    public String getMaxWeightUnit() {
        return maxWeightUnit;
    }

    public void setMaxWeightUnit(String maxWeightUnit) {
        this.maxWeightUnit = maxWeightUnit;
    }

    public String getMaxDimensionslCm() {
        return maxDimensionslCm;
    }

    public void setMaxDimensionslCm(String maxDimensionslCm) {
        this.maxDimensionslCm = maxDimensionslCm;
    }

    public String getMaxDimensionsUnits() {
        return maxDimensionsUnits;
    }

    public void setMaxDimensionsUnits(String maxDimensionsUnits) {
        this.maxDimensionsUnits = maxDimensionsUnits;
    }

    public String getAdjusted() {
        return adjusted;
    }

    public void setAdjusted(String adjusted) {
        this.adjusted = adjusted;
    }

    public String getAmt() {
        return amt;
    }

    public void setAmt(String amt) {
        this.amt = amt;
    }

    public String getAmtBeforeTax() {
        return amtBeforeTax;
    }

    public void setAmtBeforeTax(String amtBeforeTax) {
        this.amtBeforeTax = amtBeforeTax;
    }

    public String getCurrencyCode() {
        return currencyCode;
    }

    public void setCurrencyCode(String currencyCode) {
        this.currencyCode = currencyCode;
    }

    public String getDecimalPlaces() {
        return decimalPlaces;
    }

    public void setDecimalPlaces(String decimalPlaces) {
        this.decimalPlaces = decimalPlaces;
    }

    public String getOriAmtAfterTax() {
        return oriAmtAfterTax;
    }

    public void setOriAmtAfterTax(String oriAmtAfterTax) {
        this.oriAmtAfterTax = oriAmtAfterTax;
    }

    public String getOriCurrencyCode() {
        return oriCurrencyCode;
    }

    public void setOriCurrencyCode(String oriCurrencyCode) {
        this.oriCurrencyCode = oriCurrencyCode;
    }

    public String getFlightSegmentNumber() {
        return flightSegmentNumber;
    }

    public void setFlightSegmentNumber(String flightSegmentNumber) {
        this.flightSegmentNumber = flightSegmentNumber;
    }

    public Long getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(Long travelerRph) {
        this.travelerRph = travelerRph;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public String getGeoIndicator() {
        return geoIndicator;
    }

    public void setGeoIndicator(String geoIndicator) {
        this.geoIndicator = geoIndicator;
    }

    public String getSaleModel() {
        return saleModel;
    }

    public void setSaleModel(String saleModel) {
        this.saleModel = saleModel;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }

    public String getTicketingStatus() {
        return ticketingStatus;
    }

    public void setTicketingStatus(String ticketingStatus) {
        this.ticketingStatus = ticketingStatus;
    }

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public String getTicketAdvisory() {
        return ticketAdvisory;
    }

    public void setTicketAdvisory(String ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    public String getCancelAmount() {
        return cancelAmount;
    }

    public void setCancelAmount(String cancelAmount) {
        this.cancelAmount = cancelAmount;
    }
}