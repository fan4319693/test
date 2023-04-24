package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AssociatedBookingPo </p>
 * <p>Description: 存储关联订单信息 </p>
 * <p>Sample: new Spnr_AssociatedBookingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_AssociatedBookingPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 关联订单号
     * 最后修改时间: 2023/04/20
     */
    private String associateSuperPnrId;

    /**
     * 功能说明: 关联产品状态
     * 最后修改时间: 2023/04/20
     */
    private String bookingStatus;

    /**
     * 功能说明: 用来标明关联订单是该订单的,PARENT:上级订单;CHILD:下级订单;HISTORY:主订单
     * 最后修改时间: 2023/04/20
     */
    private String associationType;

    /**
     * 功能说明: 历史id
     * 最后修改时间: 2023/04/20
     */
    private Long historyId;

    /**
     * 功能说明: 产品id
     * 最后修改时间: 2023/04/20
     */
    private Long productId;

    /**
     * 功能说明: 退票申请单号
     * 最后修改时间: 2023/04/20
     */
    private String refundApplyId;

    /**
     * 功能说明: 产品状态
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: 产品类型
     * 最后修改时间: 2023/04/20
     */
    private String type;

    /**
     * 功能说明: 改期升舱单号
     * 最后修改时间: 2023/04/20
     */
    private String reshopId;

    /**
     * 功能说明: 退票申请时间
     * 最后修改时间: 2023/04/20
     */
    private String refundApplyTime;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/04/20
     */
    private String rph;

    /**
     * 功能说明: 出发日期
     * 最后修改时间: 2023/04/20
     */
    private String departureDate;

    /**
     * 功能说明: 航班号
     * 最后修改时间: 2023/04/20
     */
    private String flightNumber;

    /**
     * 功能说明: 出发到达城市组合
     * 最后修改时间: 2023/04/20
     */
    private String originDestination;

    /**
     * 功能说明: 对应的航段序号
     * 最后修改时间: 2023/04/20
     */
    private String flightSegmentRph;

    /**
     * 功能说明: 票面状态
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 机票票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 乘客序号
     * 最后修改时间: 2023/04/20
     */
    private String travelerRph;

    /**
     * 功能说明: 预定id
     * 最后修改时间: 2023/04/20
     */
    private String profileId;

    /**
     * 功能说明: 预订人类型
     * 最后修改时间: 2023/04/20
     */
    private String profileType;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getAssociateSuperPnrId() {
        return associateSuperPnrId;
    }

    public void setAssociateSuperPnrId(String associateSuperPnrId) {
        this.associateSuperPnrId = associateSuperPnrId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getAssociationType() {
        return associationType;
    }

    public void setAssociationType(String associationType) {
        this.associationType = associationType;
    }

    public Long getHistoryId() {
        return historyId;
    }

    public void setHistoryId(Long historyId) {
        this.historyId = historyId;
    }

    public Long getProductId() {
        return productId;
    }

    public void setProductId(Long productId) {
        this.productId = productId;
    }

    public String getRefundApplyId() {
        return refundApplyId;
    }

    public void setRefundApplyId(String refundApplyId) {
        this.refundApplyId = refundApplyId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getReshopId() {
        return reshopId;
    }

    public void setReshopId(String reshopId) {
        this.reshopId = reshopId;
    }

    public String getRefundApplyTime() {
        return refundApplyTime;
    }

    public void setRefundApplyTime(String refundApplyTime) {
        this.refundApplyTime = refundApplyTime;
    }

    public String getRph() {
        return rph;
    }

    public void setRph(String rph) {
        this.rph = rph;
    }

    public String getDepartureDate() {
        return departureDate;
    }

    public void setDepartureDate(String departureDate) {
        this.departureDate = departureDate;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public String getOriginDestination() {
        return originDestination;
    }

    public void setOriginDestination(String originDestination) {
        this.originDestination = originDestination;
    }

    public String getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(String flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
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

    public String getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(String travelerRph) {
        this.travelerRph = travelerRph;
    }

    public String getProfileId() {
        return profileId;
    }

    public void setProfileId(String profileId) {
        this.profileId = profileId;
    }

    public String getProfileType() {
        return profileType;
    }

    public void setProfileType(String profileType) {
        this.profileType = profileType;
    }
}