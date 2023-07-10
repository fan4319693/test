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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Hotel_Air_TicketingPo </p>
 * <p>Description: 存储保险和专车接送涉及到的机票信息 </p>
 * <p>Sample: new Mp_Hotel_Air_TicketingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Mp_Activity_InsurancePo {
    /**
     * 功能说明: SPNR ID，唯一标识
     * 最后修改时间: 2023/06/02
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/06/02
     */
    private Long productNumber;

    /**
     * 功能说明: 产品名称
     * 最后修改时间: 2023/06/02
     */
    private String productName;

    /**
     * 功能说明：是否是单人价格
     * 最后修改时间：2023-07-06
     */
    private String isPricePerPerson;

    /**
     * 功能说明：itemType
     * 最后修改时间：2023-07-06
     */
    private String itemType;

    /**
     * 功能说明：可以预订的最大数量
     * 最后修改时间：2023-07-06
     */
    private Long maximumAmountToBook;

    /**
     * 功能说明：产品ID
     * 最后修改时间：2023-07-06
     */
    private String productId;

    /**
     * 功能说明：保险产品类型ID
     * 最后修改时间：2023-07-06
     */
    private String insuranceTypeId;

    /**
     * 功能说明：保险产品状态
     * 最后修改时间：2023-07-06
     */
    private String insuranceStatus;

    /**
     * 功能说明：是否随机票退产品
     * 最后修改时间：2023-07-06
     */
    private String refundInsuranceWithAirTicket;

    /**
     * 功能说明：是否可以单独退保险产品
     * 最后修改时间：2023-07-06
     */
    private String refundInsuranceAlone;

    /**
     * 功能说明：是否可以被代理商单独退
     * 最后修改时间：2023-07-06
     */
    private String refundAloneByAgent;

    /**
     * 功能说明：乘客类型
     * 最后修改时间：2023-07-06
     */
    private String passengerType;

    /**
     * 功能说明：关联的航段序号
     * 最后修改时间：2023-07-06
     */
    private String flightSegmentRPHs;
    /**
     * 功能说明：关联的航程序号
     * 最后修改时间：2023-07-06
     */
    private String odRPHs;

    /**
     * 功能说明：花费金额
     * 最后修改时间：2023-07-06
     */
    private String planCostAmt;

    /**
     * 功能说明：单位
     * 最后修改时间：2023-07-06
     */
    private String currencyCode;

    /**
     * 功能说明：提供公司的CODE值
     * 最后修改时间：2023-07-06
     */
    private String providerCompanyCode;

    /**
     * 功能说明：提供公司的名称
     * 最后修改时间：2023-07-06
     */
    private String providerCompanyName;

    /**
     * 功能说明：语言
     * 最后修改时间：2023-07-06
     */
    private String language;

    /**
     * 功能说明：报销的详细信息
     * 最后修改时间：2023-07-06
     */
    private String shortContent;

    /**
     * 功能说明：产品TAG
     * 最后修改时间：2023-07-06
     */
    private String productTag;

    /**
     * 功能说明：产品的政策地址
     * 最后修改时间：2023-07-06
     */
    private String productPolicyUrl;
}