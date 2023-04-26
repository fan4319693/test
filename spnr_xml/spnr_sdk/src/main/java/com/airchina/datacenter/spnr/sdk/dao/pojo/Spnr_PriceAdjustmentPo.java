package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PriceAdjustmentPo </p>
 * <p>Description: 存储订单的调价信息（如折扣、额外收费等。每增加一次调价，子节点增加一次。） </p>
 * <p>Sample: new Spnr_PriceAdjustmentPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_PriceAdjustmentPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 进行此次调价的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String adjustDate;

    /**
     * 功能说明: 对应此次调价的业务配置的CODE值
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明: 这一调整适用的产品类型
     * 最后修改时间: 2023/04/20
     */
    private String productType;

    /**
     * 功能说明: 此次调价信息描述
     * 最后修改时间: 2023/04/20
     */
    private String description;

    /**
     * 功能说明: 对应此次调价需支付的金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 该价格调整元素的单位金额
     * 最后修改时间: 2023/04/20
     */
    private String unitAmt;

    /**
     * 功能说明: SuperPNR 中audit的操作标识
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 这一调整适用的旅客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 这一调整适用的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agent;

    /**
     * 功能说明: 处理该次请求的服务器IP
     * 最后修改时间: 2023/04/20
     */
    private String agentUrl;

    /**
     * 功能说明: 渠道名或ID
     * 最后修改时间: 2023/04/20
     */
    private String agency;

    /**
     * 功能说明: 填入此次操作的坐席CID
     * 最后修改时间: 2023/04/20
     */
    private String agentId;

    /**
     * 功能说明: 记录发起此次操作的坐席技能组
     * 最后修改时间: 2023/04/20
     */
    private String agentFunctionalGroup;

    /**
     * 功能说明: 记录发起此次操作的坐席行政组
     * 最后修改时间: 2023/04/20
     */
    private String agentAdministrativeGroup;

}