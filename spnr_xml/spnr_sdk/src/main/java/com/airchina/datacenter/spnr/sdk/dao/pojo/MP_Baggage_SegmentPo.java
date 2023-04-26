package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Baggage_SegmentPo </p>
 * <p>Description: 存储付费行李的航段信息 </p>
 * <p>Sample: new MP_Baggage_SegmentPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_Baggage_SegmentPo {

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
     * 功能说明: OD在该MP内的唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 航段RPH,SPNR内唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 国内/国际
     * 最后修改时间: 2023/04/20
     */
    private String infoSource;

    /**
     * 功能说明: 更改类型
     * 最后修改时间: 2023/04/20
     */
    private String modType;

    /**
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private String flightNumber;

    /**
     * 功能说明: 原始航段RPH序号
     * 最后修改时间: 2023/04/20
     */
    private Long originalRph;

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
     * 功能说明: 航班出发时间
     * 最后修改时间: 2023/04/20
     */
    private String departureTime;

    /**
     * 功能说明: 航班原定出发时间
     * 最后修改时间: 2023/04/20
     */
    private String oriDepartureTime;

    /**
     * 功能说明: 航段到达时间
     * 最后修改时间: 2023/04/20
     */
    private String arrivalTime;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/04/20
     */
    private String marketingFlightNo;

    /**
     * 功能说明: 承运航班号
     * 最后修改时间: 2023/04/20
     */
    private String operatingFlightNo;

    /**
     * 功能说明: 联盟标识
     * 最后修改时间: 2023/04/20
     */
    private String singleVendorInd;

    /**
     * 功能说明: 舱等
     * 最后修改时间: 2023/04/20
     */
    private String cabinCode;

    /**
     * 功能说明: 预定舱位
     * 最后修改时间: 2023/04/20
     */
    private String subclass;

    /**
     * 功能说明: 航段主机状态:RR、NO、OPEN
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: 航班飞行时间
     * 最后修改时间: 2023/04/20
     */
    private String duration;

    /**
     * 功能说明: 航程允许的剩余婴儿数量
     * 最后修改时间: 2023/04/20
     */
    private Long infantAvailQuantity;

    /**
     * 功能说明: 餐食代号
     * 最后修改时间: 2023/04/20
     */
    private String mealCode;

    /**
     * 功能说明: 分销系统航段类型,多用于国际
     * 最后修改时间: 2023/04/20
     */
    private String segmentType;

    /**
     * 功能说明: 是否占座限制
     * 最后修改时间: 2023/04/20
     */
    private String invControl;

    /**
     * 功能说明: 里程积累
     * 最后修改时间: 2023/04/20
     */
    private String mileage;

    /**
     * 功能说明: 经停次数
     * 最后修改时间: 2023/04/20
     */
    private Long stopQuantity;

    /**
     * 功能说明: 航班是否可进行预值机
     * 最后修改时间: 2023/04/20
     */
    private String preCheckin;

    /**
     * 功能说明: 是否是线上值机
     * 最后修改时间: 2023/04/20
     */
    private String onlineCheckin;

    /**
     * 功能说明: 机型
     * 最后修改时间: 2023/04/20
     */
    private String airEquipType;

    /**
     * 功能说明: 经停地代码
     * 最后修改时间: 2023/04/20
     */
    private String stopOver;

    /**
     * 功能说明: 经停机场
     * 最后修改时间: 2023/04/20
     */
    private String stopPoint;

    /**
     * 功能说明: 经停地点code类型
     * 最后修改时间: 2023/04/20
     */
    private String stopContext;

    /**
     * 功能说明: 经停时间
     * 最后修改时间: 2023/04/20
     */
    private String stopTime;

    /**
     * 功能说明: availableRails信息
     * 最后修改时间: 2023/04/20
     */
    private String avInfo;

    /**
     * 功能说明: 航程类型
     * 最后修改时间: 2023/04/20
     */
    private String directionInd;

    /**
     * 功能说明: 是否缺口程
     * 最后修改时间: 2023/04/20
     */
    private String odOpenJaw;

    /**
     * 功能说明: 机票票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

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

    public Long getOdRph() {
        return odRph;
    }

    public void setOdRph(Long odRph) {
        this.odRph = odRph;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public String getInfoSource() {
        return infoSource;
    }

    public void setInfoSource(String infoSource) {
        this.infoSource = infoSource;
    }

    public String getModType() {
        return modType;
    }

    public void setModType(String modType) {
        this.modType = modType;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getOriginalRph() {
        return originalRph;
    }

    public void setOriginalRph(Long originalRph) {
        this.originalRph = originalRph;
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

    public String getDepartureTime() {
        return departureTime;
    }

    public void setDepartureTime(String departureTime) {
        this.departureTime = departureTime;
    }

    public String getOriDepartureTime() {
        return oriDepartureTime;
    }

    public void setOriDepartureTime(String oriDepartureTime) {
        this.oriDepartureTime = oriDepartureTime;
    }

    public String getArrivalTime() {
        return arrivalTime;
    }

    public void setArrivalTime(String arrivalTime) {
        this.arrivalTime = arrivalTime;
    }

    public String getMarketingFlightNo() {
        return marketingFlightNo;
    }

    public void setMarketingFlightNo(String marketingFlightNo) {
        this.marketingFlightNo = marketingFlightNo;
    }

    public String getOperatingFlightNo() {
        return operatingFlightNo;
    }

    public void setOperatingFlightNo(String operatingFlightNo) {
        this.operatingFlightNo = operatingFlightNo;
    }

    public String getSingleVendorInd() {
        return singleVendorInd;
    }

    public void setSingleVendorInd(String singleVendorInd) {
        this.singleVendorInd = singleVendorInd;
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

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getDuration() {
        return duration;
    }

    public void setDuration(String duration) {
        this.duration = duration;
    }

    public Long getInfantAvailQuantity() {
        return infantAvailQuantity;
    }

    public void setInfantAvailQuantity(Long infantAvailQuantity) {
        this.infantAvailQuantity = infantAvailQuantity;
    }

    public String getMealCode() {
        return mealCode;
    }

    public void setMealCode(String mealCode) {
        this.mealCode = mealCode;
    }

    public String getSegmentType() {
        return segmentType;
    }

    public void setSegmentType(String segmentType) {
        this.segmentType = segmentType;
    }

    public String getInvControl() {
        return invControl;
    }

    public void setInvControl(String invControl) {
        this.invControl = invControl;
    }

    public String getMileage() {
        return mileage;
    }

    public void setMileage(String mileage) {
        this.mileage = mileage;
    }

    public Long getStopQuantity() {
        return stopQuantity;
    }

    public void setStopQuantity(Long stopQuantity) {
        this.stopQuantity = stopQuantity;
    }

    public String getPreCheckin() {
        return preCheckin;
    }

    public void setPreCheckin(String preCheckin) {
        this.preCheckin = preCheckin;
    }

    public String getOnlineCheckin() {
        return onlineCheckin;
    }

    public void setOnlineCheckin(String onlineCheckin) {
        this.onlineCheckin = onlineCheckin;
    }

    public String getAirEquipType() {
        return airEquipType;
    }

    public void setAirEquipType(String airEquipType) {
        this.airEquipType = airEquipType;
    }

    public String getStopOver() {
        return stopOver;
    }

    public void setStopOver(String stopOver) {
        this.stopOver = stopOver;
    }

    public String getStopPoint() {
        return stopPoint;
    }

    public void setStopPoint(String stopPoint) {
        this.stopPoint = stopPoint;
    }

    public String getStopContext() {
        return stopContext;
    }

    public void setStopContext(String stopContext) {
        this.stopContext = stopContext;
    }

    public String getStopTime() {
        return stopTime;
    }

    public void setStopTime(String stopTime) {
        this.stopTime = stopTime;
    }

    public String getAvInfo() {
        return avInfo;
    }

    public void setAvInfo(String avInfo) {
        this.avInfo = avInfo;
    }

    public String getDirectionInd() {
        return directionInd;
    }

    public void setDirectionInd(String directionInd) {
        this.directionInd = directionInd;
    }

    public String getOdOpenJaw() {
        return odOpenJaw;
    }

    public void setOdOpenJaw(String odOpenJaw) {
        this.odOpenJaw = odOpenJaw;
    }

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }
}
