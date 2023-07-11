/*
 * File Name: Mp_Hotel_Air_Ticketing
 * Version: 1.0
 * Last Modified Time: 2023-06-02 13:48
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;

import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_Destination_ItemPo </p>
 * <p>Description: 存储保险和专车接送涉及到的机票信息 </p>
 * <p>Sample: new Mp_Activity_Destination_ItemPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Mp_Activity_Destination_ItemPo {
    /**
     * 功能说明: SPNR ID，唯一标识
     * 最后修改时间: 2023/07/10
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/07/10
     */
    private Long productNumber;

    /**
     * 功能说明: 产品的服务CODE，用于区分是保险还是服务
     * 最后修改时间: 2023/07/10
     */
    private String serviceCode;

    /**
     * 功能说明: 司机联系信息
     * 最后修改时间: 2023/07/10
     */
    private String contactProfileId;

    /**
     * 功能说明: 实际服务车型
     * 最后修改时间: 2023/07/10
     */
    private String actualServiceVehicleCode;

    /**
     * 功能说明: 航段序号
     * 最后修改时间: 2023/07/10
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 航程序号
     * 最后修改时间: 2023/07/10
     */
    private Long odRph;

    /**
     * 功能说明: 产品状态
     * 最后修改时间: 2023/07/10
     */
    private String resStatus;

    /**
     * 功能说明: 专车接送的唯一标识ID
     * 最后修改时间: 2023/07/10
     */
    private String uniqueId;

    /**
     * 功能说明: 专车接送的唯一标识上下文环境
     * 最后修改时间: 2023/07/10
     */
    private String uniqueContext;

    /**
     * 功能说明: 专车接送的唯一标识类型
     * 最后修改时间: 2023/07/10
     */
    private String uniqueType;


    /**
     * 功能说明: 供应商CODE去标识item
     * 最后修改时间: 2023/07/10
     */
    private String itemCode;

    /**
     * 功能说明: 产品购买的数量
     * 最后修改时间: 2023/07/10
     */
    private Long quantity;

    /**
     * 功能说明: 产品预计使用的日期
     * 最后修改时间: 2023/07/10
     */
    private String selectedDate;

    /**
     * 功能说明: 产品预计使用的时间
     * 最后修改时间: 2023/07/10
     */
    private String selectedTime;

    /**
     * 功能说明: 税后价格
     * 最后修改时间: 2023/07/10
     */
    private String amountAfterTax;

    /**
     * 功能说明: 原始税后价格
     * 最后修改时间: 2023/07/10
     */
    private String originalAmountAfterTax;

    /**
     * 功能说明: 单位
     * 最后修改时间: 2023/07/10
     */
    private String currencyCode;

    /**
     * 功能说明: 产品号
     * 最后修改时间: 2023/07/10
     */
    private String bookingReferenceId;

    /**
     * 功能说明: itemId
     * 最后修改时间: 2023/07/10
     */
    private String reservationItemReferenceId;

    /**
     * 功能说明: item上下文环境
     * 最后修改时间: 2023/07/10
     */
    private String reservationItemReferenceContext;

    /**
     * 功能说明: item的类型
     * 最后修改时间: 2023/07/10
     */
    private String reservationItemReferenceType;


    /**
     * 功能说明: 结算日期
     * 最后修改时间: 2023/07/10
     */
    private String settleDate;

    /**
     * 功能说明: 结算描述
     * 最后修改时间: 2023/07/10
     */
    private String settleDescription;

    /**
     * 功能说明: 结算描述
     * 最后修改时间: 2023/07/10
     */
    private String settleExtraAmt;

    /**
     * 功能说明: 结算描述
     * 最后修改时间: 2023/07/10
     */
    private String settleAmt;
}