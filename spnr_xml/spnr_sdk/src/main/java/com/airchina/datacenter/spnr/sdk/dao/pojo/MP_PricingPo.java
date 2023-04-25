package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PricingPo </p>
 * <p>Description: 存储MP内产品的价格信息汇总 </p>
 * <p>Sample: new MP_PricingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_PricingPo {

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
     * 功能说明: PNR号
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: 原始价格
     * 最后修改时间: 2023/04/20
     */
    private String preAmt;

    /**
     * 功能说明: 原始价格的单位
     * 最后修改时间: 2023/04/20
     */
    private String preCurrencyCode;

    /**
     * 功能说明: 该笔支付是否让订单出票
     * 最后修改时间: 2023/04/20
     */
    private String prePayInd;

    /**
     * 功能说明: 总调价金额
     * 最后修改时间: 2023/04/20
     */
    private String adjustmentsAmt;

    /**
     * 功能说明: 总调价金额的单位
     * 最后修改时间: 2023/04/20
     */
    private String adjustmentsCurrencyCode;

    /**
     * 功能说明: 实际总价
     * 最后修改时间: 2023/04/20
     */
    private String totalAmt;

    /**
     * 功能说明: 实际总价的单位
     * 最后修改时间: 2023/04/20
     */
    private String totalCurrencyCode;

    /**
     * 功能说明: 扣款信息金额
     * 最后修改时间: 2023/04/20
     */
    private String cancellationFees;

    /**
     * 功能说明: 扣款信息金额的单位
     * 最后修改时间: 2023/04/20
     */
    private String cancellationFeesCurrencyCode;

    /**
     * 功能说明: 退票信息金额
     * 最后修改时间: 2023/04/20
     */
    private String cancellationRefunds;

    /**
     * 功能说明: 退票信息金额的单位
     * 最后修改时间: 2023/04/20
     */
    private String cancellationRefundsCurrencyCode;

    /**
     * 功能说明: 支付里程数
     * 最后修改时间: 2023/04/20
     */
    private String amountRedeemQuantity;

    /**
     * 功能说明: 支付里程数抵扣的金额
     * 最后修改时间: 2023/04/20
     */
    private String amountRedeemed;

    /**
     * 功能说明: 支付里程数抵扣的单位
     * 最后修改时间: 2023/04/20
     */
    private String amountRedeemedCurrencyCode;

}