package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.SuperPNRPo </p>
 * <p>Description: 存储SuperPNR接口基础属性 </p>
 * <p>Sample: new SuperPNRPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SuperPNRPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 订单生成时间（一经生成就不变）
     * 最后修改时间: 2023/04/20
     */
    private String bookingDate;

    /**
     * 功能说明: 用于展示的订单状态
     * 最后修改时间: 2023/04/20
     */
    private String processingStatus;

    /**
     * 功能说明: 整个订单的状态,订单取消
     * 最后修改时间: 2023/04/20
     */
    private String bookingStatus;

    /**
     * 功能说明: 标识该SPNR所处状态
     * 最后修改时间: 2023/04/20
     */
    private String tsBookingStatus;

    /**
     * 功能说明: 该SPNR内第一段行程的出发时间
     * 最后修改时间: 2023/04/20
     */
    private String startDate;

    /**
     * 功能说明: SPNR内最后一段行程的到达时间
     * 最后修改时间: 2023/04/20
     */
    private String endDate;

    /**
     * 功能说明: SPNR内第一段行程的到达地（三字码）
     * 最后修改时间: 2023/04/20
     */
    private String destination;

    /**
     * 功能说明: 该属性标识该SPNR是否由数据库内Summary字段构成
     * 最后修改时间: 2023/04/20
     */
    private String summary;

    /**
     * 功能说明: spnr内发生机票退票时,会添加该属性,值设为TicketRefund
     * 最后修改时间: 2023/04/20
     */
    private String tkCancelType;

    /**
     * 功能说明: 订单取消时间（非退票）无数据
     * 最后修改时间: 2023/04/20
     */
    private String cancellationDate;

    /**
     * 功能说明: spnr内是否包含了所有MP,true:包含所有MP；false：只包含了有效的MP
     * 最后修改时间: 2023/04/20
     */
    private String fullHistory;

    /**
     * 功能说明: 操作记录ID,SPNR的每次修改,都会自增加1存储在该属性上
     * 最后修改时间: 2023/04/20
     */
    private Long lastAuditId;

    /**
     * 功能说明: SPNR上一次修改时间
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    /**
     * 功能说明: SPNR所使用的Schema版本
     * 最后修改时间: 2023/04/20
     */
    private String schemaVersion;

    /**
     * 功能说明: 该SPNR生成时所在服务器的机器名/IP地址
     * 最后修改时间: 2023/04/20
     */
    private String sourceAddress;

    /**
     * 功能说明: 清位时限, 用于记录订单的产品的清位时限
     * 最后修改时间: 2023/04/20
     */
    private String cancelTimeLimit;

    /**
     * 功能说明: 存储在spnr中的敏感信息的加密版本
     * 最后修改时间: 2023/04/20
     */
    private String cryptoVersion;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getBookingDate() {
        return bookingDate;
    }

    public void setBookingDate(String bookingDate) {
        this.bookingDate = bookingDate;
    }

    public String getProcessingStatus() {
        return processingStatus;
    }

    public void setProcessingStatus(String processingStatus) {
        this.processingStatus = processingStatus;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getTsBookingStatus() {
        return tsBookingStatus;
    }

    public void setTsBookingStatus(String tsBookingStatus) {
        this.tsBookingStatus = tsBookingStatus;
    }

    public String getStartDate() {
        return startDate;
    }

    public void setStartDate(String startDate) {
        this.startDate = startDate;
    }

    public String getEndDate() {
        return endDate;
    }

    public void setEndDate(String endDate) {
        this.endDate = endDate;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getSummary() {
        return summary;
    }

    public void setSummary(String summary) {
        this.summary = summary;
    }

    public String getTkCancelType() {
        return tkCancelType;
    }

    public void setTkCancelType(String tkCancelType) {
        this.tkCancelType = tkCancelType;
    }

    public String getCancellationDate() {
        return cancellationDate;
    }

    public void setCancellationDate(String cancellationDate) {
        this.cancellationDate = cancellationDate;
    }

    public String getFullHistory() {
        return fullHistory;
    }

    public void setFullHistory(String fullHistory) {
        this.fullHistory = fullHistory;
    }

    public Long getLastAuditId() {
        return lastAuditId;
    }

    public void setLastAuditId(Long lastAuditId) {
        this.lastAuditId = lastAuditId;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }

    public String getSchemaVersion() {
        return schemaVersion;
    }

    public void setSchemaVersion(String schemaVersion) {
        this.schemaVersion = schemaVersion;
    }

    public String getSourceAddress() {
        return sourceAddress;
    }

    public void setSourceAddress(String sourceAddress) {
        this.sourceAddress = sourceAddress;
    }

    public String getCancelTimeLimit() {
        return cancelTimeLimit;
    }

    public void setCancelTimeLimit(String cancelTimeLimit) {
        this.cancelTimeLimit = cancelTimeLimit;
    }

    public String getCryptoVersion() {
        return cryptoVersion;
    }

    public void setCryptoVersion(String cryptoVersion) {
        this.cryptoVersion = cryptoVersion;
    }
}