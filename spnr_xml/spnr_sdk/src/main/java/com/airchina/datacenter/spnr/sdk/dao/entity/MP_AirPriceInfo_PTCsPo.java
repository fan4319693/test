package com.airchina.datacenter.spnr.sdk.dao.entity;

/**
 * Database Table Remarks:
 *   存储MP中每类乘客的运价统计信息
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table MP_AirPriceInfo_PTCs
 */
public class MP_AirPriceInfo_PTCsPo {
    /**
     * Database Column Remarks:
     *   SPNR ID，唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.super_pnr_id
     *
     * @mbg.generated
     */
    private String superPnrId;

    /**
     * Database Column Remarks:
     *   最终用户进行的搜索的 ID的唯一标识。
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.search_id
     *
     * @mbg.generated
     */
    private String searchId;

    /**
     * Database Column Remarks:
     *   该SPNR内MP唯一序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.product_number
     *
     * @mbg.generated
     */
    private String productNumber;

    /**
     * Database Column Remarks:
     *   PNR号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.pnr
     *
     * @mbg.generated
     */
    private String pnr;

    /**
     * Database Column Remarks:
     *   旅客类型
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.passenger_type_code
     *
     * @mbg.generated
     */
    private String passengerTypeCode;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.ptc_sub_type
     *
     * @mbg.generated
     */
    private String ptcSubType;

    /**
     * Database Column Remarks:
     *   旅客数量
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.quantity
     *
     * @mbg.generated
     */
    private String quantity;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.base_fare_adjusted
     *
     * @mbg.generated
     */
    private String baseFareAdjusted;

    /**
     * Database Column Remarks:
     *   不含税的库存价格
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.base_fare_amt
     *
     * @mbg.generated
     */
    private String baseFareAmt;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.base_fare_ori_amt
     *
     * @mbg.generated
     */
    private String baseFareOriAmt;

    /**
     * Database Column Remarks:
     *   税收详情
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.tax_deatils
     *
     * @mbg.generated
     */
    private String taxDeatils;

    /**
     * Database Column Remarks:
     *   调价
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.price_adjustments_amt
     *
     * @mbg.generated
     */
    private String priceAdjustmentsAmt;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.total_fare_adjusted
     *
     * @mbg.generated
     */
    private String totalFareAdjusted;

    /**
     * Database Column Remarks:
     *   乘客将支付的总价格（包括票价、税费、费用
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.total_fare_amt
     *
     * @mbg.generated
     */
    private String totalFareAmt;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.total_fare_ori_amt
     *
     * @mbg.generated
     */
    private String totalFareOriAmt;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.fc_avstring
     *
     * @mbg.generated
     */
    private String fcAvstring;

    /**
     * Database Column Remarks:
     *   PNR中FC项信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.fc_pnr_string
     *
     * @mbg.generated
     */
    private String fcPnrString;

    /**
     * Database Column Remarks:
     *   票价计算信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.fc_string
     *
     * @mbg.generated
     */
    private String fcString;

    /**
     * Database Column Remarks:
     *   票价组信息
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.fn_string
     *
     * @mbg.generated
     */
    private String fnString;

    /**
     * Database Column Remarks:
     *   未知，待核实
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_AirPriceInfo_PTCs.char_set
     *
     * @mbg.generated
     */
    private String charSet;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.super_pnr_id
     *
     * @return the value of MP_AirPriceInfo_PTCs.super_pnr_id
     *
     * @mbg.generated
     */
    public String getSuperPnrId() {
        return superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.super_pnr_id
     *
     * @param superPnrId the value for MP_AirPriceInfo_PTCs.super_pnr_id
     *
     * @mbg.generated
     */
    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.search_id
     *
     * @return the value of MP_AirPriceInfo_PTCs.search_id
     *
     * @mbg.generated
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.search_id
     *
     * @param searchId the value for MP_AirPriceInfo_PTCs.search_id
     *
     * @mbg.generated
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.product_number
     *
     * @return the value of MP_AirPriceInfo_PTCs.product_number
     *
     * @mbg.generated
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.product_number
     *
     * @param productNumber the value for MP_AirPriceInfo_PTCs.product_number
     *
     * @mbg.generated
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.pnr
     *
     * @return the value of MP_AirPriceInfo_PTCs.pnr
     *
     * @mbg.generated
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.pnr
     *
     * @param pnr the value for MP_AirPriceInfo_PTCs.pnr
     *
     * @mbg.generated
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.passenger_type_code
     *
     * @return the value of MP_AirPriceInfo_PTCs.passenger_type_code
     *
     * @mbg.generated
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.passenger_type_code
     *
     * @param passengerTypeCode the value for MP_AirPriceInfo_PTCs.passenger_type_code
     *
     * @mbg.generated
     */
    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.ptc_sub_type
     *
     * @return the value of MP_AirPriceInfo_PTCs.ptc_sub_type
     *
     * @mbg.generated
     */
    public String getPtcSubType() {
        return ptcSubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.ptc_sub_type
     *
     * @param ptcSubType the value for MP_AirPriceInfo_PTCs.ptc_sub_type
     *
     * @mbg.generated
     */
    public void setPtcSubType(String ptcSubType) {
        this.ptcSubType = ptcSubType;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.quantity
     *
     * @return the value of MP_AirPriceInfo_PTCs.quantity
     *
     * @mbg.generated
     */
    public String getQuantity() {
        return quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.quantity
     *
     * @param quantity the value for MP_AirPriceInfo_PTCs.quantity
     *
     * @mbg.generated
     */
    public void setQuantity(String quantity) {
        this.quantity = quantity;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.base_fare_adjusted
     *
     * @return the value of MP_AirPriceInfo_PTCs.base_fare_adjusted
     *
     * @mbg.generated
     */
    public String getBaseFareAdjusted() {
        return baseFareAdjusted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.base_fare_adjusted
     *
     * @param baseFareAdjusted the value for MP_AirPriceInfo_PTCs.base_fare_adjusted
     *
     * @mbg.generated
     */
    public void setBaseFareAdjusted(String baseFareAdjusted) {
        this.baseFareAdjusted = baseFareAdjusted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.base_fare_amt
     *
     * @return the value of MP_AirPriceInfo_PTCs.base_fare_amt
     *
     * @mbg.generated
     */
    public String getBaseFareAmt() {
        return baseFareAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.base_fare_amt
     *
     * @param baseFareAmt the value for MP_AirPriceInfo_PTCs.base_fare_amt
     *
     * @mbg.generated
     */
    public void setBaseFareAmt(String baseFareAmt) {
        this.baseFareAmt = baseFareAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.base_fare_ori_amt
     *
     * @return the value of MP_AirPriceInfo_PTCs.base_fare_ori_amt
     *
     * @mbg.generated
     */
    public String getBaseFareOriAmt() {
        return baseFareOriAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.base_fare_ori_amt
     *
     * @param baseFareOriAmt the value for MP_AirPriceInfo_PTCs.base_fare_ori_amt
     *
     * @mbg.generated
     */
    public void setBaseFareOriAmt(String baseFareOriAmt) {
        this.baseFareOriAmt = baseFareOriAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.tax_deatils
     *
     * @return the value of MP_AirPriceInfo_PTCs.tax_deatils
     *
     * @mbg.generated
     */
    public String getTaxDeatils() {
        return taxDeatils;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.tax_deatils
     *
     * @param taxDeatils the value for MP_AirPriceInfo_PTCs.tax_deatils
     *
     * @mbg.generated
     */
    public void setTaxDeatils(String taxDeatils) {
        this.taxDeatils = taxDeatils;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.price_adjustments_amt
     *
     * @return the value of MP_AirPriceInfo_PTCs.price_adjustments_amt
     *
     * @mbg.generated
     */
    public String getPriceAdjustmentsAmt() {
        return priceAdjustmentsAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.price_adjustments_amt
     *
     * @param priceAdjustmentsAmt the value for MP_AirPriceInfo_PTCs.price_adjustments_amt
     *
     * @mbg.generated
     */
    public void setPriceAdjustmentsAmt(String priceAdjustmentsAmt) {
        this.priceAdjustmentsAmt = priceAdjustmentsAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.total_fare_adjusted
     *
     * @return the value of MP_AirPriceInfo_PTCs.total_fare_adjusted
     *
     * @mbg.generated
     */
    public String getTotalFareAdjusted() {
        return totalFareAdjusted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.total_fare_adjusted
     *
     * @param totalFareAdjusted the value for MP_AirPriceInfo_PTCs.total_fare_adjusted
     *
     * @mbg.generated
     */
    public void setTotalFareAdjusted(String totalFareAdjusted) {
        this.totalFareAdjusted = totalFareAdjusted;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.total_fare_amt
     *
     * @return the value of MP_AirPriceInfo_PTCs.total_fare_amt
     *
     * @mbg.generated
     */
    public String getTotalFareAmt() {
        return totalFareAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.total_fare_amt
     *
     * @param totalFareAmt the value for MP_AirPriceInfo_PTCs.total_fare_amt
     *
     * @mbg.generated
     */
    public void setTotalFareAmt(String totalFareAmt) {
        this.totalFareAmt = totalFareAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.total_fare_ori_amt
     *
     * @return the value of MP_AirPriceInfo_PTCs.total_fare_ori_amt
     *
     * @mbg.generated
     */
    public String getTotalFareOriAmt() {
        return totalFareOriAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.total_fare_ori_amt
     *
     * @param totalFareOriAmt the value for MP_AirPriceInfo_PTCs.total_fare_ori_amt
     *
     * @mbg.generated
     */
    public void setTotalFareOriAmt(String totalFareOriAmt) {
        this.totalFareOriAmt = totalFareOriAmt;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.fc_avstring
     *
     * @return the value of MP_AirPriceInfo_PTCs.fc_avstring
     *
     * @mbg.generated
     */
    public String getFcAvstring() {
        return fcAvstring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.fc_avstring
     *
     * @param fcAvstring the value for MP_AirPriceInfo_PTCs.fc_avstring
     *
     * @mbg.generated
     */
    public void setFcAvstring(String fcAvstring) {
        this.fcAvstring = fcAvstring;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.fc_pnr_string
     *
     * @return the value of MP_AirPriceInfo_PTCs.fc_pnr_string
     *
     * @mbg.generated
     */
    public String getFcPnrString() {
        return fcPnrString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.fc_pnr_string
     *
     * @param fcPnrString the value for MP_AirPriceInfo_PTCs.fc_pnr_string
     *
     * @mbg.generated
     */
    public void setFcPnrString(String fcPnrString) {
        this.fcPnrString = fcPnrString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.fc_string
     *
     * @return the value of MP_AirPriceInfo_PTCs.fc_string
     *
     * @mbg.generated
     */
    public String getFcString() {
        return fcString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.fc_string
     *
     * @param fcString the value for MP_AirPriceInfo_PTCs.fc_string
     *
     * @mbg.generated
     */
    public void setFcString(String fcString) {
        this.fcString = fcString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.fn_string
     *
     * @return the value of MP_AirPriceInfo_PTCs.fn_string
     *
     * @mbg.generated
     */
    public String getFnString() {
        return fnString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.fn_string
     *
     * @param fnString the value for MP_AirPriceInfo_PTCs.fn_string
     *
     * @mbg.generated
     */
    public void setFnString(String fnString) {
        this.fnString = fnString;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_AirPriceInfo_PTCs.char_set
     *
     * @return the value of MP_AirPriceInfo_PTCs.char_set
     *
     * @mbg.generated
     */
    public String getCharSet() {
        return charSet;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_AirPriceInfo_PTCs.char_set
     *
     * @param charSet the value for MP_AirPriceInfo_PTCs.char_set
     *
     * @mbg.generated
     */
    public void setCharSet(String charSet) {
        this.charSet = charSet;
    }
}