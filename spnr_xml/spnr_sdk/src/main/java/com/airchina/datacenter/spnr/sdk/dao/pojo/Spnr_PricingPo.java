package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PricingPo </p>
 * <p>Description: 存储订单的价格信息 </p>
 * <p>Sample: new Spnr_PricingPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class Spnr_PricingPo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 配送费？一般为0,目前无使用场景 不用特别关注
     * 最后修改时间: 2023/04/20
     */
    private String postAmt;

    /**
     * 功能说明: 配送费？一般为0,目前无使用场景 不用特别关注
     * 最后修改时间: 2023/04/20
     */
    private String postCurrencyCode;

    /**
     * 功能说明: 代表订单原要预先支付的价格,如无订单级别调价,即为最终支付价格
     * 最后修改时间: 2023/04/20
     */
    private String preAmt;

    /**
     * 功能说明: 代表订单原要预先支付的价格,如无订单级别调价,即为最终支付价格
     * 最后修改时间: 2023/04/20
     */
    private String preCurrencyCode;

    /**
     * 功能说明: 订单原要预先支付的价格的原始货币及币种
     * 最后修改时间: 2023/04/20
     */
    private String preOriAmt;

    /**
     * 功能说明: 订单原要预先支付的价格的原始货币及币种
     * 最后修改时间: 2023/04/20
     */
    private String preOriCurrencyCode;

    /**
     * 功能说明: 要支付的总调价金额,所有子节点PriceAdjustments/PriceAdjustment/@Amount的累加
     * 最后修改时间: 2023/04/20
     */
    private String adjustmentsAmt;

    /**
     * 功能说明: 要支付的总调价金额,所有子节点PriceAdjustments/PriceAdjustment/@Amount的累加
     * 最后修改时间: 2023/04/20
     */
    private String adjustmentsCurrencyCode;

    /**
     * 功能说明: 要支付的总手续费金额,所有子节点AmendmentFees/AmendmentFee/@Amount的累加
     * 最后修改时间: 2023/04/20
     */
    private String amendmentsAmt;

    /**
     * 功能说明: 要支付的总手续费金额,所有子节点AmendmentFees/AmendmentFee/@Amount的累加
     * 最后修改时间: 2023/04/20
     */
    private String amendmentsCurrencyCode;

    /**
     * 功能说明: 实际总价
     * 最后修改时间: 2023/04/20
     */
    private String totalAmt;

    /**
     * 功能说明: 实际总价
     * 最后修改时间: 2023/04/20
     */
    private String totalCurrencyCode;

    /**
     * 功能说明: 实际总价（原始金额和原始币种）
     * 最后修改时间: 2023/04/20
     */
    private String totalOriAmt;

    /**
     * 功能说明: 实际总价（原始金额和原始币种）
     * 最后修改时间: 2023/04/20
     */
    private String totalOriCurrencyCode;

    /**
     * 功能说明: 支付里程数
     * 最后修改时间: 2023/04/20
     */
    private String redeemQuantity;

    /**
     * 功能说明: 支付里程数抵扣的金额
     * 最后修改时间: 2023/04/20
     */
    private String amountRedeemed;

    /**
     * 功能说明: 支付里程数抵扣的金额单位
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

    public String getPostAmt() {
        return postAmt;
    }

    public void setPostAmt(String postAmt) {
        this.postAmt = postAmt;
    }

    public String getPostCurrencyCode() {
        return postCurrencyCode;
    }

    public void setPostCurrencyCode(String postCurrencyCode) {
        this.postCurrencyCode = postCurrencyCode;
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

    public String getPreOriAmt() {
        return preOriAmt;
    }

    public void setPreOriAmt(String preOriAmt) {
        this.preOriAmt = preOriAmt;
    }

    public String getPreOriCurrencyCode() {
        return preOriCurrencyCode;
    }

    public void setPreOriCurrencyCode(String preOriCurrencyCode) {
        this.preOriCurrencyCode = preOriCurrencyCode;
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

    public String getAmendmentsAmt() {
        return amendmentsAmt;
    }

    public void setAmendmentsAmt(String amendmentsAmt) {
        this.amendmentsAmt = amendmentsAmt;
    }

    public String getAmendmentsCurrencyCode() {
        return amendmentsCurrencyCode;
    }

    public void setAmendmentsCurrencyCode(String amendmentsCurrencyCode) {
        this.amendmentsCurrencyCode = amendmentsCurrencyCode;
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

    public String getTotalOriAmt() {
        return totalOriAmt;
    }

    public void setTotalOriAmt(String totalOriAmt) {
        this.totalOriAmt = totalOriAmt;
    }

    public String getTotalOriCurrencyCode() {
        return totalOriCurrencyCode;
    }

    public void setTotalOriCurrencyCode(String totalOriCurrencyCode) {
        this.totalOriCurrencyCode = totalOriCurrencyCode;
    }

    public String getRedeemQuantity() {
        return redeemQuantity;
    }

    public void setRedeemQuantity(String redeemQuantity) {
        this.redeemQuantity = redeemQuantity;
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