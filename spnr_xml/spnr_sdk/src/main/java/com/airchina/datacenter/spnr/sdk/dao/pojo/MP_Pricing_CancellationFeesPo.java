package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_CancellationFeesPo </p>
 * <p>Description: 存储MP产品的扣款信息 </p>
 * <p>Sample: new MP_Pricing_CancellationFeesPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_Pricing_CancellationFeesPo {

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
     * 功能说明: 此次扣款对应的旅客序号。@OJ_SuperPNR_RPH在当前SPNR下,是旅客的唯一序号标识
     * 最后修改时间: 2023/04/20
     */
    private Long ojSuperPnrRph;

    /**
     * 功能说明: 此次扣款金额
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: 添加此CancellationFee的Audit ID,与SPNR下的Audits相对应
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 此次扣款对应的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 添加此节点的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String addedDate;

    /**
     * 功能说明: 如果此产品是另一个产品的附加产品,则它包含该主产品的编号。 它可以在合成预订消息时使用,以将产品组合在一起, 现阶段默认为0
     * 最后修改时间: 2023/04/20
     */
    private Long masterProductNumber;

    /**
     * 功能说明: 费率
     * 最后修改时间: 2023/04/20
     */
    private String percentage;

    /**
     * 功能说明: 当前CancellationFee是在MP处于哪个@ProductNumber时添加的
     * 最后修改时间: 2023/04/20
     */
    private Long cancelProductNumber;

    /**
     * 功能说明: 产品类型
     * 最后修改时间: 2023/04/20
     */
    private String productType;

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