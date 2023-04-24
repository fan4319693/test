package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_itineraryreceiptPo </p>
 * <p>Description: 存储MP行程单信息 </p>
 * <p>Sample: new MP_itineraryreceiptPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_itineraryreceiptPo {

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
     * 功能说明: 行程单获取渠道
     * 最后修改时间: 2023/04/20
     */
    private String channel;

    /**
     * 功能说明: 行程单号
     * 最后修改时间: 2023/04/20
     */
    private String itineraryReceiptId;

    /**
     * 功能说明: 物流系统编号
     * 最后修改时间: 2023/04/20
     */
    private String logisticsId;

    /**
     * 功能说明: 行程单状态
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: 追踪编号
     * 最后修改时间: 2023/04/20
     */
    private String trackingNumber;

    /**
     * 功能说明: 行程单收件人姓名
     * 最后修改时间: 2023/04/20
     */
    private String recipientPersonName;

    /**
     * 功能说明: 行程单收件人电话
     * 最后修改时间: 2023/04/20
     */
    private String recipientTelephone;

    /**
     * 功能说明: 行程单收件人地址
     * 最后修改时间: 2023/04/20
     */
    private String recipientAddress;

    /**
     * 功能说明: 配送费
     * 最后修改时间: 2023/04/20
     */
    private String estimatedPrice;

    /**
     * 功能说明: 配送费币种
     * 最后修改时间: 2023/04/20
     */
    private String recipientCurrencyCode;

    /**
     * 功能说明: 航班到达的时间和日期
     * 最后修改时间: 2023/04/20
     */
    private String productArrivalDateTime;

    /**
     * 功能说明: 产品预订渠道
     * 最后修改时间: 2023/04/20
     */
    private String productChannel;

    /**
     * 功能说明: 产品类型,国内/国际
     * 最后修改时间: 2023/04/20
     */
    private String productGeoIndicator;

    /**
     * 功能说明: 产品历史ID
     * 最后修改时间: 2023/04/20
     */
    private Long productHistoryId;

    /**
     * 功能说明: 产品product_number
     * 最后修改时间: 2023/04/20
     */
    private Long productProductNumber;

    /**
     * 功能说明: 产品类型
     * 最后修改时间: 2023/04/20
     */
    private String productProductType;

    /**
     * 功能说明: 产品电子票号
     * 最后修改时间: 2023/04/20
     */
    private String productETicketNumber;

    /**
     * 功能说明: 产品金额
     * 最后修改时间: 2023/04/20
     */
    private String productTicketPrice;

    /**
     * 功能说明: 产品金额货币单位
     * 最后修改时间: 2023/04/20
     */
    private String productCurrencyCode;

    /**
     * 功能说明: 产品乘客姓名
     * 最后修改时间: 2023/04/20
     */
    private String productPassengerName;

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

    public String getChannel() {
        return channel;
    }

    public void setChannel(String channel) {
        this.channel = channel;
    }

    public String getItineraryReceiptId() {
        return itineraryReceiptId;
    }

    public void setItineraryReceiptId(String itineraryReceiptId) {
        this.itineraryReceiptId = itineraryReceiptId;
    }

    public String getLogisticsId() {
        return logisticsId;
    }

    public void setLogisticsId(String logisticsId) {
        this.logisticsId = logisticsId;
    }

    public String getStatus() {
        return status;
    }

    public void setStatus(String status) {
        this.status = status;
    }

    public String getTrackingNumber() {
        return trackingNumber;
    }

    public void setTrackingNumber(String trackingNumber) {
        this.trackingNumber = trackingNumber;
    }

    public String getRecipientPersonName() {
        return recipientPersonName;
    }

    public void setRecipientPersonName(String recipientPersonName) {
        this.recipientPersonName = recipientPersonName;
    }

    public String getRecipientTelephone() {
        return recipientTelephone;
    }

    public void setRecipientTelephone(String recipientTelephone) {
        this.recipientTelephone = recipientTelephone;
    }

    public String getRecipientAddress() {
        return recipientAddress;
    }

    public void setRecipientAddress(String recipientAddress) {
        this.recipientAddress = recipientAddress;
    }

    public String getEstimatedPrice() {
        return estimatedPrice;
    }

    public void setEstimatedPrice(String estimatedPrice) {
        this.estimatedPrice = estimatedPrice;
    }

    public String getRecipientCurrencyCode() {
        return recipientCurrencyCode;
    }

    public void setRecipientCurrencyCode(String recipientCurrencyCode) {
        this.recipientCurrencyCode = recipientCurrencyCode;
    }

    public String getProductArrivalDateTime() {
        return productArrivalDateTime;
    }

    public void setProductArrivalDateTime(String productArrivalDateTime) {
        this.productArrivalDateTime = productArrivalDateTime;
    }

    public String getProductChannel() {
        return productChannel;
    }

    public void setProductChannel(String productChannel) {
        this.productChannel = productChannel;
    }

    public String getProductGeoIndicator() {
        return productGeoIndicator;
    }

    public void setProductGeoIndicator(String productGeoIndicator) {
        this.productGeoIndicator = productGeoIndicator;
    }

    public Long getProductHistoryId() {
        return productHistoryId;
    }

    public void setProductHistoryId(Long productHistoryId) {
        this.productHistoryId = productHistoryId;
    }

    public Long getProductProductNumber() {
        return productProductNumber;
    }

    public void setProductProductNumber(Long productProductNumber) {
        this.productProductNumber = productProductNumber;
    }

    public String getProductProductType() {
        return productProductType;
    }

    public void setProductProductType(String productProductType) {
        this.productProductType = productProductType;
    }

    public String getProductETicketNumber() {
        return productETicketNumber;
    }

    public void setProductETicketNumber(String productETicketNumber) {
        this.productETicketNumber = productETicketNumber;
    }

    public String getProductTicketPrice() {
        return productTicketPrice;
    }

    public void setProductTicketPrice(String productTicketPrice) {
        this.productTicketPrice = productTicketPrice;
    }

    public String getProductCurrencyCode() {
        return productCurrencyCode;
    }

    public void setProductCurrencyCode(String productCurrencyCode) {
        this.productCurrencyCode = productCurrencyCode;
    }

    public String getProductPassengerName() {
        return productPassengerName;
    }

    public void setProductPassengerName(String productPassengerName) {
        this.productPassengerName = productPassengerName;
    }
}