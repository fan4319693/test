/*
 * File Name: MP_AP_TicketingPo
 * Version: 1.0
 * Last Modified Time: 2023-03-07 15:51
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_TicketingPo </p>
 * <p>Description: 存储辅营的出票信息 </p>
 * <p>Sample: new MP_AP_TicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AP_TicketingPo {

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
     * 功能说明: 辅营产品票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 对应的机票产品的乘客序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 对应的机票产品的航段序号
     * 最后修改时间: 2023/04/20
     */
    private String flightSegmentRph;

    /**
     * 功能说明: 机票补充信息的开放文本
     * 最后修改时间: 2023/04/20
     */
    private String ticketAdvisory;

    /**
     * 功能说明: 登机时间（核销时间）
     * 最后修改时间: 2023/04/20
     */
    private String boardingTime;

    /**
     * 功能说明: 出票状态（是否强制核销）
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 出票时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTime;

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

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public Long getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(Long travelerRph) {
        this.travelerRph = travelerRph;
    }

    public String getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(String flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public String getTicketAdvisory() {
        return ticketAdvisory;
    }

    public void setTicketAdvisory(String ticketAdvisory) {
        this.ticketAdvisory = ticketAdvisory;
    }

    public String getBoardingTime() {
        return boardingTime;
    }

    public void setBoardingTime(String boardingTime) {
        this.boardingTime = boardingTime;
    }

    public String getTicketingStatus() {
        return ticketingStatus;
    }

    public void setTicketingStatus(String ticketingStatus) {
        this.ticketingStatus = ticketingStatus;
    }

    public String getTicketTime() {
        return ticketTime;
    }

    public void setTicketTime(String ticketTime) {
        this.ticketTime = ticketTime;
    }
}
