package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PricingPo </p>
 * <p>Description: 存储MP内产品的价格信息汇总 </p>
 * <p>Sample: new MP_PricingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
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

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public String getPreAmt() {
        return preAmt;
    }

    public void setPreAmt(String preAmt) {
        this.preAmt = preAmt;
    }

    public String getPreCurrencyCode() {
        return preCurrencyCode;
    }

    public void setPreCurrencyCode(String preCurrencyCode) {
        this.preCurrencyCode = preCurrencyCode;
    }

    public String getPrePayInd() {
        return prePayInd;
    }

    public void setPrePayInd(String prePayInd) {
        this.prePayInd = prePayInd;
    }

    public String getAdjustmentsAmt() {
        return adjustmentsAmt;
    }

    public void setAdjustmentsAmt(String adjustmentsAmt) {
        this.adjustmentsAmt = adjustmentsAmt;
    }

    public String getAdjustmentsCurrencyCode() {
        return adjustmentsCurrencyCode;
    }

    public void setAdjustmentsCurrencyCode(String adjustmentsCurrencyCode) {
        this.adjustmentsCurrencyCode = adjustmentsCurrencyCode;
    }

    public String getTotalAmt() {
        return totalAmt;
    }

    public void setTotalAmt(String totalAmt) {
        this.totalAmt = totalAmt;
    }

    public String getTotalCurrencyCode() {
        return totalCurrencyCode;
    }

    public void setTotalCurrencyCode(String totalCurrencyCode) {
        this.totalCurrencyCode = totalCurrencyCode;
    }

    public String getCancellationFees() {
        return cancellationFees;
    }

    public void setCancellationFees(String cancellationFees) {
        this.cancellationFees = cancellationFees;
    }

    public String getCancellationFeesCurrencyCode() {
        return cancellationFeesCurrencyCode;
    }

    public void setCancellationFeesCurrencyCode(String cancellationFeesCurrencyCode) {
        this.cancellationFeesCurrencyCode = cancellationFeesCurrencyCode;
    }

    public String getCancellationRefunds() {
        return cancellationRefunds;
    }

    public void setCancellationRefunds(String cancellationRefunds) {
        this.cancellationRefunds = cancellationRefunds;
    }

    public String getCancellationRefundsCurrencyCode() {
        return cancellationRefundsCurrencyCode;
    }

    public void setCancellationRefundsCurrencyCode(String cancellationRefundsCurrencyCode) {
        this.cancellationRefundsCurrencyCode = cancellationRefundsCurrencyCode;
    }

    public String getAmountRedeemQuantity() {
        return amountRedeemQuantity;
    }

    public void setAmountRedeemQuantity(String amountRedeemQuantity) {
        this.amountRedeemQuantity = amountRedeemQuantity;
    }

    public String getAmountRedeemed() {
        return amountRedeemed;
    }

    public void setAmountRedeemed(String amountRedeemed) {
        this.amountRedeemed = amountRedeemed;
    }

    public String getAmountRedeemedCurrencyCode() {
        return amountRedeemedCurrencyCode;
    }

    public void setAmountRedeemedCurrencyCode(String amountRedeemedCurrencyCode) {
        this.amountRedeemedCurrencyCode = amountRedeemedCurrencyCode;
    }
}