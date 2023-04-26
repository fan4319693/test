package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentInfoPo </p>
 * <p>Description: 存储订单的每一笔支付信息 </p>
 * <p>Sample: new Spnr_PaymentInfoPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class Spnr_PaymentInfoPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 当前Payment在SPNR内的唯一标识
     * 最后修改时间: 2023/04/20
     */
    private Long id;

    /**
     * 功能说明: 数据库自增字段
     * 最后修改时间: 2023/04/20
     */
    private Long seqNo;

    /**
     * 功能说明: 此次Payment记录对应的金额,@Amout > 0时：旅客进行的支付,@Amout < 0时：航司向旅客退款
     * 最后修改时间: 2023/04/20
     */
    private String amt;

    /**
     * 功能说明: 添加该Payment时的Audit ID,与OJ_SuperPNR/Audits相关联
     * 最后修改时间: 2023/04/20
     */
    private Long auditId;

    /**
     * 功能说明: 货币单位
     * 最后修改时间: 2023/04/20
     */
    private String currencyCode;

    /**
     * 功能说明: true:该Payment为历史记录,不生效, false:该Payment为生效记录
     * 最后修改时间: 2023/04/20
     */
    private String historic;

    /**
     * 功能说明: 历史记录id
     * 最后修改时间: 2023/04/20
     */
    private Long historyId;

    /**
     * 功能说明: 添加此Payment的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String paymentDate;

    /**
     * 功能说明: RPH list of Products that this payment refers to
     * 最后修改时间: 2023/04/20
     */
    private String productList;

    /**
     * 功能说明: 支付状态: Paid：已支付,Unpaid：未支付,Deleted：已删除,Failed：支付失败
     * 最后修改时间: 2023/04/20
     */
    private String status;

    /**
     * 功能说明: Debit：付款,Credit：退款
     * 最后修改时间: 2023/04/20
     */
    private String transactionType;

    /**
     * 功能说明: 该笔支付是否让订单出票
     * 最后修改时间: 2023/04/20
     */
    private String prePayInd;

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

    /**
     * 功能说明: 支付类型：101 - 网上支付,105 - 线下支付,106 - 第三方支付,200 - 里程支付,210 - 优惠卷,220 - 银行直减
     * 最后修改时间: 2023/04/20
     */
    private String paymentFormType;

    /**
     * 功能说明: 此特定参考的代码。常用的参考代码是: BankID, BillNo, GateID, PaymentID
     * 最后修改时间: 2023/04/20
     */
    private String refCode;

}