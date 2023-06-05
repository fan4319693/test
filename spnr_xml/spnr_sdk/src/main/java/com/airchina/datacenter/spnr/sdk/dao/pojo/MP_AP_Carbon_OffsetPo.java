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
public class MP_AP_Carbon_OffsetPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: 碳排放抵消数量
     * 最后修改时间: 2023/06/02
     */
    private String quantity;

    /**
     * 功能说明: 碳排放抵消数量的单位
     * 最后修改时间: 2023/06/02
     */
    private String unit;

    /**
     * 功能说明: 基础价格
     * 最后修改时间: 2023/06/02
     */
    private String baseAmount;

    /**
     * 功能说明: 单位价格
     * 最后修改时间: 2023/06/02
     */
    private String unitPrice;

    /**
     * 功能说明: 基础价格的单位
     * 最后修改时间: 2023/06/02
     */
    private String baseCurrencyCode;

    /**
     * 功能说明: 调整后的价格
     * 最后修改时间: 2023/06/02
     */
    private String adjustedAmount;

    /**
     * 功能说明: 总价格
     * 最后修改时间: 2023/06/02
     */
    private String totalAmount;

    /**
     * 功能说明: 总价格的单位
     * 最后修改时间: 2023/06/02
     */
    private String totalCurrencyCode;

    /**
     * 功能说明: 支付里程数抵扣的金额
     * 最后修改时间: 2023/06/02
     */
    private String redeemedAmount;

    /**
     * 功能说明: 支付里程数抵扣的金额的单位
     * 最后修改时间: 2023/06/02
     */
    private String redeemedAmountCurrencyCode;

    /**
     * 功能说明: 支付里程数
     * 最后修改时间: 2023/06/02
     */
    private String redeemedQuantity;
}
