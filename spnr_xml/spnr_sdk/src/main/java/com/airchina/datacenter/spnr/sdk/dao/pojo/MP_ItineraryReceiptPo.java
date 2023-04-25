package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_ItineraryReceiptPo </p>
 * <p>Description: 存储MP行程单信息 </p>
 * <p>Sample: new MP_ItineraryReceiptPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_ItineraryReceiptPo {

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

}