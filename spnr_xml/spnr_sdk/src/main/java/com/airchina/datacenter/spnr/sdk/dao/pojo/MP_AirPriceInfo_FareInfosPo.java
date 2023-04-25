package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirPriceInfo_FareInfosPo </p>
 * <p>Description: 存储MP中每个航段的详细运价、退改签等信息 </p>
 * <p>Sample: new MP_AirPriceInfo_FareInfosPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirPriceInfo_FareInfosPo implements Cloneable{

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
     * 功能说明: 航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: OD序号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 舱等
     * 最后修改时间: 2023/04/20
     */
    private String cabinCode;

    /**
     * 功能说明: 子舱
     * 最后修改时间: 2023/04/20
     */
    private String subclass;

    /**
     * 功能说明: 通过公司代码标识公司
     * 最后修改时间: 2023/04/20
     */
    private String filingAirlineCode;

    /**
     * 功能说明: 出发机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String dport;

    /**
     * 功能说明: 到达机场三字码
     * 最后修改时间: 2023/04/20
     */
    private String aport;

    /**
     * 功能说明: 运价基础
     * 最后修改时间: 2023/04/20
     */
    private String fareBasis;

    /**
     * 功能说明: 底价扣率
     * 最后修改时间: 2023/04/20
     */
    private String disCount;

    /**
     * 功能说明: 用来记录一体运价拆分分组信息,如果为tue,则票价组件的全价包含在此段/pax类型FareInfo中。通常,它会在Fare组件的第一个段中被设置为true。
     * 最后修改时间: 2023/04/20
     */
    private String fcPriceInd;

    /**
     * 功能说明: 用来记录一体运价拆分分组信息,票价组件可以包含1个或多个分段(每个pax类型)。该RPH表示FareInfo所属的段/pax类型的票价组件。
     * 最后修改时间: 2023/04/20
     */
    private Long fcRph;

    /**
     * 功能说明: 原始运价价钱,用于记录当运价发布使用外币而询价使用CNY时的外币金额及币种信息
     * 最后修改时间: 2023/04/20
     */
    private String origPubAmt;

    /**
     * 功能说明: 原始运价价钱,用于记录当运价发布使用外币而询价使用CNY时的外币金额及币种信息的单位
     * 最后修改时间: 2023/04/20
     */
    private String origPubCurrencyCode;

    /**
     * 功能说明: 此规则的票价的票价基础代码。 它可以是空的
     * 最后修改时间: 2023/04/20
     */
    private String fareBasisCode;

    /**
     * 功能说明: 不含税价格
     * 最后修改时间: 2023/04/20
     */
    private String baseAmt;

    /**
     * 功能说明: 不含税价格的单位
     * 最后修改时间: 2023/04/20
     */
    private String baseCurrencyCode;

    /**
     * 功能说明: 价差
     * 最后修改时间: 2023/04/20
     */
    private String differFare;

    /**
     * 功能说明: 价格类型
     * 最后修改时间: 2023/04/20
     */
    private String priceType;

    /**
     * 功能说明: 变更金额
     * 最后修改时间: 2023/04/20
     */
    private String reissueAmt;

    /**
     * 功能说明: 变更费用
     * 最后修改时间: 2023/04/20
     */
    private String reissueFee;

    /**
     * 功能说明: 税收总价
     * 最后修改时间: 2023/04/20
     */
    private String taxesAmt;

    /**
     * 功能说明: 总价格
     * 最后修改时间: 2023/04/20
     */
    private String totalFare;

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
     * 功能说明: 乘客子类型（如军警残旅客）
     * 最后修改时间: 2023/04/20
     */
    private String ptcSubType;

    /**
     * 功能说明: PTC乘客资质
     * 最后修改时间: 2023/04/20
     */
    private String ptcPsgType;

    /**
     * 功能说明: PTC数量
     * 最后修改时间: 2023/04/20
     */
    private Long ptcQuantity;

    /**
     * 功能说明: 市场最低价
     * 最后修改时间: 2023/04/20
     */
    private String lowestFare;

    /**
     * 功能说明: 市场最低价子舱
     * 最后修改时间: 2023/04/20
     */
    private String lowestFareSubclass;

    /**
     * 功能说明: 忠诚度单位的数量
     * 最后修改时间: 2023/04/20
     */
    private String earnQuantity;

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
     * 功能说明: 用于定义显示顺序
     * 最后修改时间: 2023/04/20
     */
    private String addOnSort;

    /**
     * 功能说明: Addon的额外信息描述
     * 最后修改时间: 2023/04/20
     */
    private String addOnSortName;

    /**
     * 功能说明: 语言字符集
     * 最后修改时间: 2023/04/20
     */
    private String addOnCharSet;

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

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public Long getOdRph() {
        return odRph;
    }

    public void setOdRph(Long odRph) {
        this.odRph = odRph;
    }

    public String getCabinCode() {
        return cabinCode;
    }

    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    public String getSubclass() {
        return subclass;
    }

    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    public String getFilingAirlineCode() {
        return filingAirlineCode;
    }

    public void setFilingAirlineCode(String filingAirlineCode) {
        this.filingAirlineCode = filingAirlineCode;
    }

    public String getDport() {
        return dport;
    }

    public void setDport(String dport) {
        this.dport = dport;
    }

    public String getAport() {
        return aport;
    }

    public void setAport(String aport) {
        this.aport = aport;
    }

    public String getFareBasis() {
        return fareBasis;
    }

    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    public String getDisCount() {
        return disCount;
    }

    public void setDisCount(String disCount) {
        this.disCount = disCount;
    }

    public String getFcPriceInd() {
        return fcPriceInd;
    }

    public void setFcPriceInd(String fcPriceInd) {
        this.fcPriceInd = fcPriceInd;
    }

    public Long getFcRph() {
        return fcRph;
    }

    public void setFcRph(Long fcRph) {
        this.fcRph = fcRph;
    }

    public String getOrigPubAmt() {
        return origPubAmt;
    }

    public void setOrigPubAmt(String origPubAmt) {
        this.origPubAmt = origPubAmt;
    }

    public String getOrigPubCurrencyCode() {
        return origPubCurrencyCode;
    }

    public void setOrigPubCurrencyCode(String origPubCurrencyCode) {
        this.origPubCurrencyCode = origPubCurrencyCode;
    }

    public String getFareBasisCode() {
        return fareBasisCode;
    }

    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    public String getBaseAmt() {
        return baseAmt;
    }

    public void setBaseAmt(String baseAmt) {
        this.baseAmt = baseAmt;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getDifferFare() {
        return differFare;
    }

    public void setDifferFare(String differFare) {
        this.differFare = differFare;
    }

    public String getPriceType() {
        return priceType;
    }

    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    public String getReissueAmt() {
        return reissueAmt;
    }

    public void setReissueAmt(String reissueAmt) {
        this.reissueAmt = reissueAmt;
    }

    public String getReissueFee() {
        return reissueFee;
    }

    public void setReissueFee(String reissueFee) {
        this.reissueFee = reissueFee;
    }

    public String getTaxesAmt() {
        return taxesAmt;
    }

    public void setTaxesAmt(String taxesAmt) {
        this.taxesAmt = taxesAmt;
    }

    public String getTotalFare() {
        return totalFare;
    }

    public void setTotalFare(String totalFare) {
        this.totalFare = totalFare;
    }

    public String getTaxDetails() {
        return taxDetails;
    }

    public void setTaxDetails(String taxDetails) {
        this.taxDetails = taxDetails;
    }

    public String getPtcSubType() {
        return ptcSubType;
    }

    public void setPtcSubType(String ptcSubType) {
        this.ptcSubType = ptcSubType;
    }

    public String getPtcPsgType() {
        return ptcPsgType;
    }

    public void setPtcPsgType(String ptcPsgType) {
        this.ptcPsgType = ptcPsgType;
    }

    public Long getPtcQuantity() {
        return ptcQuantity;
    }

    public void setPtcQuantity(Long ptcQuantity) {
        this.ptcQuantity = ptcQuantity;
    }

    public String getLowestFare() {
        return lowestFare;
    }

    public void setLowestFare(String lowestFare) {
        this.lowestFare = lowestFare;
    }

    public String getLowestFareSubclass() {
        return lowestFareSubclass;
    }

    public void setLowestFareSubclass(String lowestFareSubclass) {
        this.lowestFareSubclass = lowestFareSubclass;
    }

    public String getEarnQuantity() {
        return earnQuantity;
    }

    public void setEarnQuantity(String earnQuantity) {
        this.earnQuantity = earnQuantity;
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

    public String getAddOnSort() {
        return addOnSort;
    }

    public void setAddOnSort(String addOnSort) {
        this.addOnSort = addOnSort;
    }

    public String getAddOnSortName() {
        return addOnSortName;
    }

    public void setAddOnSortName(String addOnSortName) {
        this.addOnSortName = addOnSortName;
    }

    public String getAddOnCharSet() {
        return addOnCharSet;
    }

    public void setAddOnCharSet(String addOnCharSet) {
        this.addOnCharSet = addOnCharSet;
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