package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentDetailsPo </p>
 * <p>Description: 存储订单的收支总信息（用于记录整笔订单的支付、退款、里程支付、银行直减等和支付相关的信息） </p>
 * <p>Sample: new Spnr_PaymentDetailsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_PaymentDetailsPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 统计整个SPNR的收支情况，Amout = 0时：该SPNR收支平衡，无需旅客退款、支付;Amout > 0时：需旅客进行支付; Amout < 0时：航司需向旅客退款
     * 最后修改时间: 2023/04/20
     */
    private String balanceAmt;

    /**
     * 功能说明: 收支统计货币单位
     * 最后修改时间: 2023/04/20
     */
    private String balanceCurrency;

    /**
     * 功能说明: 旅客已支付的金额（银行直减、优惠券等也参与计算）
     * 最后修改时间: 2023/04/20
     */
    private String paymentsAmt;

    /**
     * 功能说明: 已支付的金额货币单位
     * 最后修改时间: 2023/04/20
     */
    private String paymentsCurrency;

    /**
     * 功能说明: 旅客实际支付的现金,银行直减、优惠券等优惠项,不作为实际支付的金额参与到此值的计算
     * 最后修改时间: 2023/04/20
     */
    private String actualAmt;

    /**
     * 功能说明: 最后一次修改Payments节点的时间,非北京时间
     * 最后修改时间: 2023/04/20
     */
    private String lastModified;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getBalanceAmt() {
        return balanceAmt;
    }

    public void setBalanceAmt(String balanceAmt) {
        this.balanceAmt = balanceAmt;
    }

    public String getBalanceCurrency() {
        return balanceCurrency;
    }

    public void setBalanceCurrency(String balanceCurrency) {
        this.balanceCurrency = balanceCurrency;
    }

    public String getPaymentsAmt() {
        return paymentsAmt;
    }

    public void setPaymentsAmt(String paymentsAmt) {
        this.paymentsAmt = paymentsAmt;
    }

    public String getPaymentsCurrency() {
        return paymentsCurrency;
    }

    public void setPaymentsCurrency(String paymentsCurrency) {
        this.paymentsCurrency = paymentsCurrency;
    }

    public String getActualAmt() {
        return actualAmt;
    }

    public void setActualAmt(String actualAmt) {
        this.actualAmt = actualAmt;
    }

    public String getLastModified() {
        return lastModified;
    }

    public void setLastModified(String lastModified) {
        this.lastModified = lastModified;
    }
}