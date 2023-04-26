/*
 * File Name: MP_AP_GroundTransportPo
 * Version: 1.0
 * Last Modified Time: 2023-03-07 16:06
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_GroundTransportPo </p>
 * <p>Description: 存储辅营空轨信息 </p>
 * <p>Sample: new MP_AP_GroundTransportPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AP_GroundTransportPo {

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
     * 功能说明: 辅营产品对应机票的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 旅客在SPNR内唯一标识序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long rph;

    /**
     * 功能说明: 轨交出发站点类型
     * 最后修改时间: 2023/04/20
     */
    private String dStationType;

    /**
     * 功能说明: 轨交出发站点代号
     * 最后修改时间: 2023/04/20
     */
    private String dStationCode;

    /**
     * 功能说明: 轨交出发站点名称
     * 最后修改时间: 2023/04/20
     */
    private String dStationName;

    /**
     * 功能说明: 轨交到达站点类型
     * 最后修改时间: 2023/04/20
     */
    private String aStationType;

    /**
     * 功能说明: 轨交到达站点代号
     * 最后修改时间: 2023/04/20
     */
    private String aStationCode;

    /**
     * 功能说明: 轨交到达站点名称
     * 最后修改时间: 2023/04/20
     */
    private String aStationName;

    /**
     * 功能说明: 轨交有效期开始日期
     * 最后修改时间: 2023/04/20
     */
    private String startPeriod;

    /**
     * 功能说明: 轨交有效期截止日期
     * 最后修改时间: 2023/04/20
     */
    private String endPeriod;

    /**
     * 功能说明: 座位类型,如坐铺、卧铺等
     * 最后修改时间: 2023/04/20
     */
    private String seatType;

    /**
     * 功能说明: 席位类别,如头等、二等
     * 最后修改时间: 2023/04/20
     */
    private String clazz;

    /**
     * 功能说明: 总价
     * 最后修改时间: 2023/04/25
     */
    private String totalFareAmount;

    /**
     * 功能说明: 总价的单位
     * 最后修改时间: 2023/04/25
     */
    private String totalFareCurrencyCode;

    /**
     * 功能说明: 成本价格
     * 最后修改时间: 2023/04/20
     */
    private String basicFareAmount;

    /**
     * 功能说明: 成本价格的单位
     * 最后修改时间: 2023/04/20
     */
    private String basicFareCurrencyCode;

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

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public Long getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(Long travelerRph) {
        this.travelerRph = travelerRph;
    }

    public Long getRph() {
        return rph;
    }

    public void setRph(Long rph) {
        this.rph = rph;
    }

    public String getdStationType() {
        return dStationType;
    }

    public void setdStationType(String dStationType) {
        this.dStationType = dStationType;
    }

    public String getdStationCode() {
        return dStationCode;
    }

    public void setdStationCode(String dStationCode) {
        this.dStationCode = dStationCode;
    }

    public String getdStationName() {
        return dStationName;
    }

    public void setdStationName(String dStationName) {
        this.dStationName = dStationName;
    }

    public String getaStationType() {
        return aStationType;
    }

    public void setaStationType(String aStationType) {
        this.aStationType = aStationType;
    }

    public String getaStationCode() {
        return aStationCode;
    }

    public void setaStationCode(String aStationCode) {
        this.aStationCode = aStationCode;
    }

    public String getaStationName() {
        return aStationName;
    }

    public void setaStationName(String aStationName) {
        this.aStationName = aStationName;
    }

    public String getStartPeriod() {
        return startPeriod;
    }

    public void setStartPeriod(String startPeriod) {
        this.startPeriod = startPeriod;
    }

    public String getEndPeriod() {
        return endPeriod;
    }

    public void setEndPeriod(String endPeriod) {
        this.endPeriod = endPeriod;
    }

    public String getSeatType() {
        return seatType;
    }

    public void setSeatType(String seatType) {
        this.seatType = seatType;
    }

    public String getClazz() {
        return clazz;
    }

    public void setClazz(String clazz) {
        this.clazz = clazz;
    }

    public String getBasicFareAmount() {
        return basicFareAmount;
    }

    public void setBasicFareAmount(String basicFareAmount) {
        this.basicFareAmount = basicFareAmount;
    }

    public String getBasicFareCurrencyCode() {
        return basicFareCurrencyCode;
    }

    public void setBasicFareCurrencyCode(String basicFareCurrencyCode) {
        this.basicFareCurrencyCode = basicFareCurrencyCode;
    }

    public String getTotalFareAmount() {
        return totalFareAmount;
    }

    public void setTotalFareAmount(String totalFareAmount) {
        this.totalFareAmount = totalFareAmount;
    }

    public String getTotalFareCurrencyCode() {
        return totalFareCurrencyCode;
    }

    public void setTotalFareCurrencyCode(String totalFareCurrencyCode) {
        this.totalFareCurrencyCode = totalFareCurrencyCode;
    }
}
