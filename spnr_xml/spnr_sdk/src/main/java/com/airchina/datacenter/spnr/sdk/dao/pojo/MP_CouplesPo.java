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


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_GroundTransportPo </p>
 * <p>Description: 存储辅营空巴联运信息 </p>
 * <p>Sample: new MP_AP_GroundTransport_BusPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_CouplesPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: 卡券的名字
     * 最后修改时间: 2023/06/02
     */
    private String couponName;

    /**
     * 功能说明: 卡券类型的CODE值
     * 最后修改时间: 2023/06/02
     */
    private String couponTypeCode;

    /**
     * 功能说明: 卡券的价值
     * 最后修改时间: 2023/06/02
     */
    private String couponQuantity;

    /**
     * 功能说明: 原始金额
     * 最后修改时间: 2023/06/02
     */
    private String originalAmt;

    /**
     * 功能说明: 原始金额的单位
     * 最后修改时间: 2023/06/02
     */
    private String originalCurrencyCode;

    /**
     * 功能说明: 总金额
     * 最后修改时间: 2023/06/02
     */
    private String totalAmt;

    /**
     * 功能说明: 总金额的单位
     * 最后修改时间: 2023/06/02
     */
    private String totalCurrencyCode;

    /**
     * 功能说明: 兑换里程数量
     * 最后修改时间: 2023/06/02
     */
    private String RedeemQuantity;

    /**
     * 功能说明: 兑换里程抵扣金额
     * 最后修改时间: 2023/06/02
     */
    private String amountRedeemed;

    /**
     * 功能说明: 兑换里程抵扣金额的单位
     * 最后修改时间: 2023/06/02
     */
    private String amountRedeemedCurrencyCode;

    /**
     * 功能说明: 折扣数量
     * 最后修改时间: 2023/06/02
     */
    private String discountQuantity;

    /**
     * 功能说明: 折扣金额
     * 最后修改时间: 2023/06/02
     */
    private String discountAmount;

    /**
     * 功能说明: 折扣金额的单位
     * 最后修改时间: 2023/06/02
     */
    private String discountCurrencyCode;

    /**
     * 功能说明: 产品ID
     * 最后修改时间: 2023/06/02
     */
    private String bookingReferenceId;

    /**
     * 功能说明: 生效时间
     * 最后修改时间: 2023/06/02
     */
    private String activateDateTimestamp;

    /**
     * 功能说明: 失效时间
     * 最后修改时间: 2023/06/02
     */
    private String expiryDateTimestamp;

    /**
     * 功能说明: 卡券的类型
     * 最后修改时间: 2023/06/02
     */
    private String couponCategory;

    /**
     * 功能说明: 卡券的CODE值
     * 最后修改时间: 2023/06/02
     */
    private String couponCode;

    /**
     * 功能说明: 卡券的数量
     * 最后修改时间: 2023/06/02
     */
    private String couponNumber;

    /**
     * 功能说明: 卡券的状态
     * 最后修改时间: 2023/06/02
     */
    private String couponStatus;

    /**
     * 功能说明: 卡券面值
     * 最后修改时间: 2023/06/02
     */
    private String couponAmt;

    /**
     * 功能说明: 卡券面值的单位
     * 最后修改时间: 2023/06/02
     */
    private String couponCurrencyCode;

    /**
     * 功能说明: 使用规则
     * 最后修改时间: 2023/06/02
     */
    private String usageRules;

    /**
     * 功能说明: 购买规则
     * 最后修改时间: 2023/06/02
     */
    private String purchaseRules;

    /**
     * 功能说明: 票号
     * 最后修改时间: 2023/06/02
     */
    private String eTicketNumber;

    /**
     * 功能说明: 票的状态
     * 最后修改时间: 2023/06/02
     */
    private String ticketingStatus;

    /**
     * 功能说明: 出票时间
     * 最后修改时间: 2023/06/02
     */
    private String ticketTime;



}
