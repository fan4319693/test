package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_ItinTotalFarePo </p>
 * <p>Description: 存储MP的行程总价 </p>
 * <p>Sample: new MP_AirPriceInfo_ItinTotalFarePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirPriceInfo_ItinTotalFarePo {

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
     * 功能说明: 公共运价/私有运价
     * 最后修改时间: 2023/04/20
     */
    private String pricingSource;

    /**
     * 功能说明: 主机返回的运价CODE值
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyCode;

    /**
     * 功能说明: 主机返回的运价名
     * 最后修改时间: 2023/04/20
     */
    private String fareFamilyName;

    /**
     * 功能说明: QTE时间
     * 最后修改时间: 2023/04/20
     */
    private String priceQuoteDate;

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
     * 功能说明: 库存金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareCurrencyCode;

    /**
     * 功能说明: 库存价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriAmt;

    /**
     * 功能说明: 库存价原始金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String baseFareOriCurrencyCode;


    /**
     * 功能说明: 机建费用
     * 最后修改时间: 2023/04/24
     */
    private String taxAirportFee;

    /**
     * 功能说明: 燃油费用
     * 最后修改时间: 2023/04/24
     */
    private String taxFuelFee;

    /**
     * 功能说明: 机建费用的单位
     * 最后修改时间: 2023/04/24
     */
    private String taxAirportCurrencyCode;

    /**
     * 功能说明: 燃油费用的单位
     * 最后修改时间: 2023/04/24
     */
    private String taxFuelCurrencyCode;

    /**
     * 功能说明: 税收详情
     * 最后修改时间: 2023/04/20
     */
    private String taxDetails;

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
     * 功能说明: 乘客将支付的总价格（包括票价、税费、费用）及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareCurrencyCode;

    /**
     * 功能说明: 总价原始金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriAmt;

    /**
     * 功能说明: 总价原始金额及货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalFareOriCurrencyCode;

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

    public String getPricingSource() {
        return pricingSource;
    }

    public void setPricingSource(String pricingSource) {
        this.pricingSource = pricingSource;
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

    public String getPriceQuoteDate() {
        return priceQuoteDate;
    }

    public void setPriceQuoteDate(String priceQuoteDate) {
        this.priceQuoteDate = priceQuoteDate;
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

    public String getTaxAirportFee() {
        return taxAirportFee;
    }

    public void setTaxAirportFee(String taxAirportFee) {
        this.taxAirportFee = taxAirportFee;
    }

    public String getTaxFuelFee() {
        return taxFuelFee;
    }

    public void setTaxFuelFee(String taxFuelFee) {
        this.taxFuelFee = taxFuelFee;
    }

    public String getTaxAirportCurrencyCode() {
        return taxAirportCurrencyCode;
    }

    public void setTaxAirportCurrencyCode(String taxAirportCurrencyCode) {
        this.taxAirportCurrencyCode = taxAirportCurrencyCode;
    }

    public String getTaxFuelCurrencyCode() {
        return taxFuelCurrencyCode;
    }

    public void setTaxFuelCurrencyCode(String taxFuelCurrencyCode) {
        this.taxFuelCurrencyCode = taxFuelCurrencyCode;
    }
}