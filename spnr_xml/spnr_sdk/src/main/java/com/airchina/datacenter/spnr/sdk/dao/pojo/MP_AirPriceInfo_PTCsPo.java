package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_PTCsPo </p>
 * <p>Description: 存储MP中每类乘客的运价统计信息 </p>
 * <p>Sample: new MP_AirPriceInfo_PTCsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirPriceInfo_PTCsPo {

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
     * 功能说明: 旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 乘客子类型,如军警残等
     * 最后修改时间: 2023/04/20
     */
    private String ptcSubType;

    /**
     * 功能说明: 旅客数量
     * 最后修改时间: 2023/04/20
     */
    private Long quantity;

    /**
     * 功能说明: 库存价调整金额
     * 最后修改时间: 2023/04/20
     */
    private String baseFareAdjusted;

    /**
     * 功能说明: 库存金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseFareAmt;

    /**
     * 功能说明: 库存金额及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareCurrencyCode;

    /**
     * 功能说明: 库存价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriAmt;

    /**
     * 功能说明: 库存价原始金额及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriCurrencyCode;

    /**
     * 功能说明: 税收详情
     * 最后修改时间: 2023/04/20
     */
    private String taxDetails;

    /**
     * 功能说明: 调价金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String priceAdjustmentsAmt;

    /**
     * 功能说明: 调价金额及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String priceAdjustmentsCurrencyCode;

    /**
     * 功能说明: 总价调整金额
     * 最后修改时间: 2023/04/20
     */
    private String totalFareAdjusted;

    /**
     * 功能说明: 乘客将支付的总价格（包括票价、税费、费用）及货币
     * 最后修改时间: 2023/04/20
     */
    private String totalFareAmt;

    /**
     * 功能说明: 乘客将支付的总价格（包括票价、税费、费用）及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareCurrencyCode;

    /**
     * 功能说明: 总价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriAmt;

    /**
     * 功能说明: 总价原始金额及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriCurrencyCode;

    /**
     * 功能说明: PNR中的自由文本
     * 最后修改时间: 2023/04/20
     */
    private String fcAvstring;

    /**
     * 功能说明: PNR中FC项信息
     * 最后修改时间: 2023/04/20
     */
    private String fcPnrString;

    /**
     * 功能说明: 票价计算信息
     * 最后修改时间: 2023/04/20
     */
    private String fcString;

    /**
     * 功能说明: 票价组信息
     * 最后修改时间: 2023/04/20
     */
    private String fnString;

    /**
     * 功能说明: 未知
     * 最后修改时间: 2023/04/20
     */
    private String charSet;

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

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public String getPtcSubType() {
        return ptcSubType;
    }

    public void setPtcSubType(String ptcSubType) {
        this.ptcSubType = ptcSubType;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getBaseFareAdjusted() {
        return baseFareAdjusted;
    }

    public void setBaseFareAdjusted(String baseFareAdjusted) {
        this.baseFareAdjusted = baseFareAdjusted;
    }

    public String getBaseFareAmt() {
        return baseFareAmt;
    }

    public void setBaseFareAmt(String baseFareAmt) {
        this.baseFareAmt = baseFareAmt;
    }

    public String getBaseFareCurrencyCode() {
        return baseFareCurrencyCode;
    }

    public void setBaseFareCurrencyCode(String baseFareCurrencyCode) {
        this.baseFareCurrencyCode = baseFareCurrencyCode;
    }

    public String getBaseFareOriAmt() {
        return baseFareOriAmt;
    }

    public void setBaseFareOriAmt(String baseFareOriAmt) {
        this.baseFareOriAmt = baseFareOriAmt;
    }

    public String getBaseFareOriCurrencyCode() {
        return baseFareOriCurrencyCode;
    }

    public void setBaseFareOriCurrencyCode(String baseFareOriCurrencyCode) {
        this.baseFareOriCurrencyCode = baseFareOriCurrencyCode;
    }

    public String getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(String taxDetails) {
        this.taxDetails = taxDetails;
    }

    public String getPriceAdjustmentsAmt() {
        return priceAdjustmentsAmt;
    }

    public void setPriceAdjustmentsAmt(String priceAdjustmentsAmt) {
        this.priceAdjustmentsAmt = priceAdjustmentsAmt;
    }

    public String getPriceAdjustmentsCurrencyCode() {
        return priceAdjustmentsCurrencyCode;
    }

    public void setPriceAdjustmentsCurrencyCode(String priceAdjustmentsCurrencyCode) {
        this.priceAdjustmentsCurrencyCode = priceAdjustmentsCurrencyCode;
    }

    public String getTotalFareAdjusted() {
        return totalFareAdjusted;
    }

    public void setTotalFareAdjusted(String totalFareAdjusted) {
        this.totalFareAdjusted = totalFareAdjusted;
    }

    public String getTotalFareAmt() {
        return totalFareAmt;
    }

    public void setTotalFareAmt(String totalFareAmt) {
        this.totalFareAmt = totalFareAmt;
    }

    public String getTotalFareCurrencyCode() {
        return totalFareCurrencyCode;
    }

    public void setTotalFareCurrencyCode(String totalFareCurrencyCode) {
        this.totalFareCurrencyCode = totalFareCurrencyCode;
    }

    public String getTotalFareOriAmt() {
        return totalFareOriAmt;
    }

    public void setTotalFareOriAmt(String totalFareOriAmt) {
        this.totalFareOriAmt = totalFareOriAmt;
    }

    public String getTotalFareOriCurrencyCode() {
        return totalFareOriCurrencyCode;
    }

    public void setTotalFareOriCurrencyCode(String totalFareOriCurrencyCode) {
        this.totalFareOriCurrencyCode = totalFareOriCurrencyCode;
    }

    public String getFcAvstring() {
        return fcAvstring;
    }

    public void setFcAvstring(String fcAvstring) {
        this.fcAvstring = fcAvstring;
    }

    public String getFcPnrString() {
        return fcPnrString;
    }

    public void setFcPnrString(String fcPnrString) {
        this.fcPnrString = fcPnrString;
    }

    public String getFcString() {
        return fcString;
    }

    public void setFcString(String fcString) {
        this.fcString = fcString;
    }

    public String getFnString() {
        return fnString;
    }

    public void setFnString(String fnString) {
        this.fnString = fnString;
    }

    public String getCharSet() {
        return charSet;
    }

    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }
}