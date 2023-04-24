package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirTicketingPo </p>
 * <p>Description: 存储MP的票面信息 </p>
 * <p>Sample: new MP_AirTicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirTicketingPo {

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
     * 功能说明: 航段序号,唯一值,不变
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRefNumber;

    /**
     * 功能说明: 是否非自愿退票
     * 最后修改时间: 2023/04/20
     */
    private String irr;

    /**
     * 功能说明: 非自愿退票原因
     * 最后修改时间: 2023/04/20
     */
    private String irrReason;

    /**
     * 功能说明: 出票票台
     * 最后修改时间: 2023/04/20
     */
    private String issuingAgentId;

    /**
     * 功能说明: 未知,待核实
     * 最后修改时间: 2023/04/20
     */
    private String itemNumber;

    /**
     * 功能说明: 是否出票
     * 最后修改时间: 2023/04/20
     */
    private String printed;

    /**
     * 功能说明: T出票时间,取自主机时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTime;

    /**
     * 功能说明: 主机票面状态:OPEN FOR USE , REFUND, EXCHANGE, VOID, USED/FLOWN等
     * 最后修改时间: 2023/04/20
     */
    private String ticketingStatus;

    /**
     * 功能说明: 旅客在该MP内的序号,非@OJ_SuperPNR_RPH,两者不一定相等
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRefNumber;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/04/20
     */
    private String eTicketNumber;

    /**
     * 功能说明: 最晚出票时间
     * 最后修改时间: 2023/04/20
     */
    private String ticketTimeLimit;

    /**
     * 功能说明: 记录客票有效期
     * 最后修改时间: 2023/04/20
     */
    private String expiryDateTime;

    /**
     * 功能说明: 客票候补状态,用于表示客票是候补客票还是非候补客票, OK: 已确认;RQ: 已申请;NS:婴儿,无座位;SA:可用
     * 最后修改时间: 2023/04/20
     */
    private String waitlistStatus;

    /**
     * 功能说明: refund_status: 退票状态;refund_e_refund_number: 退票票号
     * 最后修改时间: 2023/04/20
     */
    private String refundInfo;

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

    public Long getFlightSegmentRefNumber() {
        return flightSegmentRefNumber;
    }

    public void setFlightSegmentRefNumber(Long flightSegmentRefNumber) {
        this.flightSegmentRefNumber = flightSegmentRefNumber;
    }

    public String getIrr() {
        return irr;
    }

    public void setIrr(String irr) {
        this.irr = irr;
    }

    public String getIrrReason() {
        return irrReason;
    }

    public void setIrrReason(String irrReason) {
        this.irrReason = irrReason;
    }

    public String getIssuingAgentId() {
        return issuingAgentId;
    }

    public void setIssuingAgentId(String issuingAgentId) {
        this.issuingAgentId = issuingAgentId;
    }

    public String getItemNumber() {
        return itemNumber;
    }

    public void setItemNumber(String itemNumber) {
        this.itemNumber = itemNumber;
    }

    public String getPrinted() {
        return printed;
    }

    public void setPrinted(String printed) {
        this.printed = printed;
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

    public Long getTravelerRefNumber() {
        return travelerRefNumber;
    }

    public void setTravelerRefNumber(Long travelerRefNumber) {
        this.travelerRefNumber = travelerRefNumber;
    }

    public String geteTicketNumber() {
        return eTicketNumber;
    }

    public void seteTicketNumber(String eTicketNumber) {
        this.eTicketNumber = eTicketNumber;
    }

    public String getTicketTimeLimit() {
        return ticketTimeLimit;
    }

    public void setTicketTimeLimit(String ticketTimeLimit) {
        this.ticketTimeLimit = ticketTimeLimit;
    }

    public String getExpiryDateTime() {
        return expiryDateTime;
    }

    public void setExpiryDateTime(String expiryDateTime) {
        this.expiryDateTime = expiryDateTime;
    }

    public String getWaitlistStatus() {
        return waitlistStatus;
    }

    public void setWaitlistStatus(String waitlistStatus) {
        this.waitlistStatus = waitlistStatus;
    }

    public String getRefundInfo() {
        return refundInfo;
    }

    public void setRefundInfo(String refundInfo) {
        this.refundInfo = refundInfo;
    }

}