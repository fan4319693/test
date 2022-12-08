package com.airchina.datacenter.spnr.sdk.dao.entity;

/**
 * Database Table Remarks:
 *   存储MP中每个航段的详细运价、退改签等信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table MP_AirPriceInfo_FareInfos
 */
public class MP_AirPriceInfo_FareInfosPo {
    /**
     * Database Column Remarks:
     *   SPNR ID，唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.super_pnr_id
     *
     * @mbg.generated
     */
    private String superPnrId;

    /**
     * Database Column Remarks:
     *   最终用户进行的搜索的 ID的唯一标识。
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.search_id
     *
     * @mbg.generated
     */
    private String searchId;

    /**
     * Database Column Remarks:
     *   该SPNR内MP唯一序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.product_number
     *
     * @mbg.generated
     */
    private String productNumber;

    /**
     * Database Column Remarks:
     *   PNR号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.pnr
     *
     * @mbg.generated
     */
    private String pnr;

    /**
     * Database Column Remarks:
     *   航段序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.flight_segment_rph
     *
     * @mbg.generated
     */
    private String flightSegmentRph;

    /**
     * Database Column Remarks:
     *   OD序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.od_rph
     *
     * @mbg.generated
     */
    private String odRph;

    /**
     * Database Column Remarks:
     *   舱等
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.cabin_code
     *
     * @mbg.generated
     */
    private String cabinCode;

    /**
     * Database Column Remarks:
     *   子舱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.subclass
     *
     * @mbg.generated
     */
    private String subclass;

    /**
     * Database Column Remarks:
     *   通过公司代码标识公司
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.filing_airline_code
     *
     * @mbg.generated
     */
    private String filingAirlineCode;

    /**
     * Database Column Remarks:
     *   出发机场三字码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.dport
     *
     * @mbg.generated
     */
    private String dport;

    /**
     * Database Column Remarks:
     *   到达机场三字码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.aport
     *
     * @mbg.generated
     */
    private String aport;

    /**
     * Database Column Remarks:
     *   运价基础
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fare_basis
     *
     * @mbg.generated
     */
    private String fareBasis;

    /**
     * Database Column Remarks:
     *   底价扣率
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.dis_count
     *
     * @mbg.generated
     */
    private Double disCount;

    /**
     * Database Column Remarks:
     *   用来记录一体运价拆分分组信息 如果为tu
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fc_price_ind
     *
     * @mbg.generated
     */
    private String fcPriceInd;

    /**
     * Database Column Remarks:
     *   用来记录一体运价拆分分组信息 票价组件可
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fc_rph
     *
     * @mbg.generated
     */
    private String fcRph;

    /**
     * Database Column Remarks:
     *   原始运价价钱，用于记录当运价发布使用外币
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.orig_pub_amt
     *
     * @mbg.generated
     */
    private String origPubAmt;

    /**
     * Database Column Remarks:
     *   此规则的票价的票价基础代码。 它可以是空
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fare_basis_code
     *
     * @mbg.generated
     */
    private String fareBasisCode;

    /**
     * Database Column Remarks:
     *   不含税价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.base_amt
     *
     * @mbg.generated
     */
    private String baseAmt;

    /**
     * Database Column Remarks:
     *   价差
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.differ_fare
     *
     * @mbg.generated
     */
    private Double differFare;

    /**
     * Database Column Remarks:
     *   价格类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.price_type
     *
     * @mbg.generated
     */
    private String priceType;

    /**
     * Database Column Remarks:
     *   变更金额
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.reissue_amt
     *
     * @mbg.generated
     */
    private Double reissueAmt;

    /**
     * Database Column Remarks:
     *   变更费用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.reissue_fee
     *
     * @mbg.generated
     */
    private Double reissueFee;

    /**
     * Database Column Remarks:
     *   税收总价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.taxes_amt
     *
     * @mbg.generated
     */
    private Double taxesAmt;

    /**
     * Database Column Remarks:
     *   总价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.total_fare
     *
     * @mbg.generated
     */
    private Double totalFare;

    /**
     * Database Column Remarks:
     *   税收详情
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.tax_deatils
     *
     * @mbg.generated
     */
    private String taxDeatils;

    /**
     * Database Column Remarks:
     *   ？
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.ptc_sub_type
     *
     * @mbg.generated
     */
    private String ptcSubType;

    /**
     * Database Column Remarks:
     *   PTC乘客资质
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.ptc_psg_type
     *
     * @mbg.generated
     */
    private String ptcPsgType;

    /**
     * Database Column Remarks:
     *   PTC数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.ptc_quantity
     *
     * @mbg.generated
     */
    private Integer ptcQuantity;

    /**
     * Database Column Remarks:
     *   市场最低价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.lowest_fare
     *
     * @mbg.generated
     */
    private String lowestFare;

    /**
     * Database Column Remarks:
     *   市场最低价子舱
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.lowest_fare_subclass
     *
     * @mbg.generated
     */
    private String lowestFareSubclass;

    /**
     * Database Column Remarks:
     *   ？
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.earn_quantity
     *
     * @mbg.generated
     */
    private String earnQuantity;

    /**
     * Database Column Remarks:
     *   与此票价关联的票价系列代码
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fare_family_code
     *
     * @mbg.generated
     */
    private String fareFamilyCode;

    /**
     * Database Column Remarks:
     *   主机返回的运价名
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.fare_family_name
     *
     * @mbg.generated
     */
    private String fareFamilyName;

    /**
     * Database Column Remarks:
     *   ？
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.add_on_sort
     *
     * @mbg.generated
     */
    private String addOnSort;

    /**
     * Database Column Remarks:
     *   Addon
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.add_on_sort_name
     *
     * @mbg.generated
     */
    private String addOnSortName;

    /**
     * Database Column Remarks:
     *   ？
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_FareInfos.add_on_char_set
     *
     * @mbg.generated
     */
    private String addOnCharSet;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.super_pnr_id
     *
     * @return the value of MP_AirPriceInfo_FareInfos.super_pnr_id
     *
     * @mbg.generated
     */
    public String getSuperPnrId() {
        return superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.super_pnr_id
     *
     * @param superPnrId the value for MP_AirPriceInfo_FareInfos.super_pnr_id
     *
     * @mbg.generated
     */
    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.search_id
     *
     * @return the value of MP_AirPriceInfo_FareInfos.search_id
     *
     * @mbg.generated
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.search_id
     *
     * @param searchId the value for MP_AirPriceInfo_FareInfos.search_id
     *
     * @mbg.generated
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.product_number
     *
     * @return the value of MP_AirPriceInfo_FareInfos.product_number
     *
     * @mbg.generated
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.product_number
     *
     * @param productNumber the value for MP_AirPriceInfo_FareInfos.product_number
     *
     * @mbg.generated
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.pnr
     *
     * @return the value of MP_AirPriceInfo_FareInfos.pnr
     *
     * @mbg.generated
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.pnr
     *
     * @param pnr the value for MP_AirPriceInfo_FareInfos.pnr
     *
     * @mbg.generated
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.flight_segment_rph
     *
     * @return the value of MP_AirPriceInfo_FareInfos.flight_segment_rph
     *
     * @mbg.generated
     */
    public String getFlightSegmentRph() {
        return flightSegmentRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.flight_segment_rph
     *
     * @param flightSegmentRph the value for MP_AirPriceInfo_FareInfos.flight_segment_rph
     *
     * @mbg.generated
     */
    public void setFlightSegmentRph(String flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.od_rph
     *
     * @return the value of MP_AirPriceInfo_FareInfos.od_rph
     *
     * @mbg.generated
     */
    public String getOdRph() {
        return odRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.od_rph
     *
     * @param odRph the value for MP_AirPriceInfo_FareInfos.od_rph
     *
     * @mbg.generated
     */
    public void setOdRph(String odRph) {
        this.odRph = odRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.cabin_code
     *
     * @return the value of MP_AirPriceInfo_FareInfos.cabin_code
     *
     * @mbg.generated
     */
    public String getCabinCode() {
        return cabinCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.cabin_code
     *
     * @param cabinCode the value for MP_AirPriceInfo_FareInfos.cabin_code
     *
     * @mbg.generated
     */
    public void setCabinCode(String cabinCode) {
        this.cabinCode = cabinCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.subclass
     *
     * @return the value of MP_AirPriceInfo_FareInfos.subclass
     *
     * @mbg.generated
     */
    public String getSubclass() {
        return subclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.subclass
     *
     * @param subclass the value for MP_AirPriceInfo_FareInfos.subclass
     *
     * @mbg.generated
     */
    public void setSubclass(String subclass) {
        this.subclass = subclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.filing_airline_code
     *
     * @return the value of MP_AirPriceInfo_FareInfos.filing_airline_code
     *
     * @mbg.generated
     */
    public String getFilingAirlineCode() {
        return filingAirlineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.filing_airline_code
     *
     * @param filingAirlineCode the value for MP_AirPriceInfo_FareInfos.filing_airline_code
     *
     * @mbg.generated
     */
    public void setFilingAirlineCode(String filingAirlineCode) {
        this.filingAirlineCode = filingAirlineCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.dport
     *
     * @return the value of MP_AirPriceInfo_FareInfos.dport
     *
     * @mbg.generated
     */
    public String getDport() {
        return dport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.dport
     *
     * @param dport the value for MP_AirPriceInfo_FareInfos.dport
     *
     * @mbg.generated
     */
    public void setDport(String dport) {
        this.dport = dport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.aport
     *
     * @return the value of MP_AirPriceInfo_FareInfos.aport
     *
     * @mbg.generated
     */
    public String getAport() {
        return aport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.aport
     *
     * @param aport the value for MP_AirPriceInfo_FareInfos.aport
     *
     * @mbg.generated
     */
    public void setAport(String aport) {
        this.aport = aport;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fare_basis
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fare_basis
     *
     * @mbg.generated
     */
    public String getFareBasis() {
        return fareBasis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fare_basis
     *
     * @param fareBasis the value for MP_AirPriceInfo_FareInfos.fare_basis
     *
     * @mbg.generated
     */
    public void setFareBasis(String fareBasis) {
        this.fareBasis = fareBasis;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.dis_count
     *
     * @return the value of MP_AirPriceInfo_FareInfos.dis_count
     *
     * @mbg.generated
     */
    public Double getDisCount() {
        return disCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.dis_count
     *
     * @param disCount the value for MP_AirPriceInfo_FareInfos.dis_count
     *
     * @mbg.generated
     */
    public void setDisCount(Double disCount) {
        this.disCount = disCount;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fc_price_ind
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fc_price_ind
     *
     * @mbg.generated
     */
    public String getFcPriceInd() {
        return fcPriceInd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fc_price_ind
     *
     * @param fcPriceInd the value for MP_AirPriceInfo_FareInfos.fc_price_ind
     *
     * @mbg.generated
     */
    public void setFcPriceInd(String fcPriceInd) {
        this.fcPriceInd = fcPriceInd;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fc_rph
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fc_rph
     *
     * @mbg.generated
     */
    public String getFcRph() {
        return fcRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fc_rph
     *
     * @param fcRph the value for MP_AirPriceInfo_FareInfos.fc_rph
     *
     * @mbg.generated
     */
    public void setFcRph(String fcRph) {
        this.fcRph = fcRph;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.orig_pub_amt
     *
     * @return the value of MP_AirPriceInfo_FareInfos.orig_pub_amt
     *
     * @mbg.generated
     */
    public String getOrigPubAmt() {
        return origPubAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.orig_pub_amt
     *
     * @param origPubAmt the value for MP_AirPriceInfo_FareInfos.orig_pub_amt
     *
     * @mbg.generated
     */
    public void setOrigPubAmt(String origPubAmt) {
        this.origPubAmt = origPubAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fare_basis_code
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fare_basis_code
     *
     * @mbg.generated
     */
    public String getFareBasisCode() {
        return fareBasisCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fare_basis_code
     *
     * @param fareBasisCode the value for MP_AirPriceInfo_FareInfos.fare_basis_code
     *
     * @mbg.generated
     */
    public void setFareBasisCode(String fareBasisCode) {
        this.fareBasisCode = fareBasisCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.base_amt
     *
     * @return the value of MP_AirPriceInfo_FareInfos.base_amt
     *
     * @mbg.generated
     */
    public String getBaseAmt() {
        return baseAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.base_amt
     *
     * @param baseAmt the value for MP_AirPriceInfo_FareInfos.base_amt
     *
     * @mbg.generated
     */
    public void setBaseAmt(String baseAmt) {
        this.baseAmt = baseAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.differ_fare
     *
     * @return the value of MP_AirPriceInfo_FareInfos.differ_fare
     *
     * @mbg.generated
     */
    public Double getDifferFare() {
        return differFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.differ_fare
     *
     * @param differFare the value for MP_AirPriceInfo_FareInfos.differ_fare
     *
     * @mbg.generated
     */
    public void setDifferFare(Double differFare) {
        this.differFare = differFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.price_type
     *
     * @return the value of MP_AirPriceInfo_FareInfos.price_type
     *
     * @mbg.generated
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.price_type
     *
     * @param priceType the value for MP_AirPriceInfo_FareInfos.price_type
     *
     * @mbg.generated
     */
    public void setPriceType(String priceType) {
        this.priceType = priceType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.reissue_amt
     *
     * @return the value of MP_AirPriceInfo_FareInfos.reissue_amt
     *
     * @mbg.generated
     */
    public Double getReissueAmt() {
        return reissueAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.reissue_amt
     *
     * @param reissueAmt the value for MP_AirPriceInfo_FareInfos.reissue_amt
     *
     * @mbg.generated
     */
    public void setReissueAmt(Double reissueAmt) {
        this.reissueAmt = reissueAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.reissue_fee
     *
     * @return the value of MP_AirPriceInfo_FareInfos.reissue_fee
     *
     * @mbg.generated
     */
    public Double getReissueFee() {
        return reissueFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.reissue_fee
     *
     * @param reissueFee the value for MP_AirPriceInfo_FareInfos.reissue_fee
     *
     * @mbg.generated
     */
    public void setReissueFee(Double reissueFee) {
        this.reissueFee = reissueFee;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.taxes_amt
     *
     * @return the value of MP_AirPriceInfo_FareInfos.taxes_amt
     *
     * @mbg.generated
     */
    public Double getTaxesAmt() {
        return taxesAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.taxes_amt
     *
     * @param taxesAmt the value for MP_AirPriceInfo_FareInfos.taxes_amt
     *
     * @mbg.generated
     */
    public void setTaxesAmt(Double taxesAmt) {
        this.taxesAmt = taxesAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.total_fare
     *
     * @return the value of MP_AirPriceInfo_FareInfos.total_fare
     *
     * @mbg.generated
     */
    public Double getTotalFare() {
        return totalFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.total_fare
     *
     * @param totalFare the value for MP_AirPriceInfo_FareInfos.total_fare
     *
     * @mbg.generated
     */
    public void setTotalFare(Double totalFare) {
        this.totalFare = totalFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.tax_deatils
     *
     * @return the value of MP_AirPriceInfo_FareInfos.tax_deatils
     *
     * @mbg.generated
     */
    public String getTaxDeatils() {
        return taxDeatils;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.tax_deatils
     *
     * @param taxDeatils the value for MP_AirPriceInfo_FareInfos.tax_deatils
     *
     * @mbg.generated
     */
    public void setTaxDeatils(String taxDeatils) {
        this.taxDeatils = taxDeatils;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.ptc_sub_type
     *
     * @return the value of MP_AirPriceInfo_FareInfos.ptc_sub_type
     *
     * @mbg.generated
     */
    public String getPtcSubType() {
        return ptcSubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.ptc_sub_type
     *
     * @param ptcSubType the value for MP_AirPriceInfo_FareInfos.ptc_sub_type
     *
     * @mbg.generated
     */
    public void setPtcSubType(String ptcSubType) {
        this.ptcSubType = ptcSubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.ptc_psg_type
     *
     * @return the value of MP_AirPriceInfo_FareInfos.ptc_psg_type
     *
     * @mbg.generated
     */
    public String getPtcPsgType() {
        return ptcPsgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.ptc_psg_type
     *
     * @param ptcPsgType the value for MP_AirPriceInfo_FareInfos.ptc_psg_type
     *
     * @mbg.generated
     */
    public void setPtcPsgType(String ptcPsgType) {
        this.ptcPsgType = ptcPsgType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.ptc_quantity
     *
     * @return the value of MP_AirPriceInfo_FareInfos.ptc_quantity
     *
     * @mbg.generated
     */
    public Integer getPtcQuantity() {
        return ptcQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.ptc_quantity
     *
     * @param ptcQuantity the value for MP_AirPriceInfo_FareInfos.ptc_quantity
     *
     * @mbg.generated
     */
    public void setPtcQuantity(Integer ptcQuantity) {
        this.ptcQuantity = ptcQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.lowest_fare
     *
     * @return the value of MP_AirPriceInfo_FareInfos.lowest_fare
     *
     * @mbg.generated
     */
    public String getLowestFare() {
        return lowestFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.lowest_fare
     *
     * @param lowestFare the value for MP_AirPriceInfo_FareInfos.lowest_fare
     *
     * @mbg.generated
     */
    public void setLowestFare(String lowestFare) {
        this.lowestFare = lowestFare;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.lowest_fare_subclass
     *
     * @return the value of MP_AirPriceInfo_FareInfos.lowest_fare_subclass
     *
     * @mbg.generated
     */
    public String getLowestFareSubclass() {
        return lowestFareSubclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.lowest_fare_subclass
     *
     * @param lowestFareSubclass the value for MP_AirPriceInfo_FareInfos.lowest_fare_subclass
     *
     * @mbg.generated
     */
    public void setLowestFareSubclass(String lowestFareSubclass) {
        this.lowestFareSubclass = lowestFareSubclass;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.earn_quantity
     *
     * @return the value of MP_AirPriceInfo_FareInfos.earn_quantity
     *
     * @mbg.generated
     */
    public String getEarnQuantity() {
        return earnQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.earn_quantity
     *
     * @param earnQuantity the value for MP_AirPriceInfo_FareInfos.earn_quantity
     *
     * @mbg.generated
     */
    public void setEarnQuantity(String earnQuantity) {
        this.earnQuantity = earnQuantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fare_family_code
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fare_family_code
     *
     * @mbg.generated
     */
    public String getFareFamilyCode() {
        return fareFamilyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fare_family_code
     *
     * @param fareFamilyCode the value for MP_AirPriceInfo_FareInfos.fare_family_code
     *
     * @mbg.generated
     */
    public void setFareFamilyCode(String fareFamilyCode) {
        this.fareFamilyCode = fareFamilyCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.fare_family_name
     *
     * @return the value of MP_AirPriceInfo_FareInfos.fare_family_name
     *
     * @mbg.generated
     */
    public String getFareFamilyName() {
        return fareFamilyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.fare_family_name
     *
     * @param fareFamilyName the value for MP_AirPriceInfo_FareInfos.fare_family_name
     *
     * @mbg.generated
     */
    public void setFareFamilyName(String fareFamilyName) {
        this.fareFamilyName = fareFamilyName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.add_on_sort
     *
     * @return the value of MP_AirPriceInfo_FareInfos.add_on_sort
     *
     * @mbg.generated
     */
    public String getAddOnSort() {
        return addOnSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.add_on_sort
     *
     * @param addOnSort the value for MP_AirPriceInfo_FareInfos.add_on_sort
     *
     * @mbg.generated
     */
    public void setAddOnSort(String addOnSort) {
        this.addOnSort = addOnSort;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.add_on_sort_name
     *
     * @return the value of MP_AirPriceInfo_FareInfos.add_on_sort_name
     *
     * @mbg.generated
     */
    public String getAddOnSortName() {
        return addOnSortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.add_on_sort_name
     *
     * @param addOnSortName the value for MP_AirPriceInfo_FareInfos.add_on_sort_name
     *
     * @mbg.generated
     */
    public void setAddOnSortName(String addOnSortName) {
        this.addOnSortName = addOnSortName;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_FareInfos.add_on_char_set
     *
     * @return the value of MP_AirPriceInfo_FareInfos.add_on_char_set
     *
     * @mbg.generated
     */
    public String getAddOnCharSet() {
        return addOnCharSet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_FareInfos.add_on_char_set
     *
     * @param addOnCharSet the value for MP_AirPriceInfo_FareInfos.add_on_char_set
     *
     * @mbg.generated
     */
    public void setAddOnCharSet(String addOnCharSet) {
        this.addOnCharSet = addOnCharSet;
    }
}