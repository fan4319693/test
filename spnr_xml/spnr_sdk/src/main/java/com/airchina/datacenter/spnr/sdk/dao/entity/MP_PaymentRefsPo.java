package com.airchina.datacenter.spnr.sdk.dao.entity;

/**
 * Database Table Remarks:
 *   存储MP产品所关联的支付记录
 *
 * This class was generated by MyBatis Generator.
 * This class corresponds to the database table MP_PaymentRefs
 */
public class MP_PaymentRefsPo {
    /**
     * Database Column Remarks:
     *   SPNR ID，唯一标识
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.super_pnr_id
     *
     * @mbg.generated
     */
    private String superPnrId;

    /**
     * Database Column Remarks:
     *   最终用户进行的搜索的 ID的唯一标识。
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.search_id
     *
     * @mbg.generated
     */
    private String searchId;

    /**
     * Database Column Remarks:
     *   该SPNR内MP唯一序号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.product_number
     *
     * @mbg.generated
     */
    private String productNumber;

    /**
     * Database Column Remarks:
     *   PNR号
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.pnr
     *
     * @mbg.generated
     */
    private String pnr;

    /**
     * Database Column Remarks:
     *   nan
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.payment_refs_audit_id
     *
     * @mbg.generated
     */
    private String paymentRefsAuditId;

    /**
     * Database Column Remarks:
     *   MP支付状态： PaymentDue;
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.payment_state
     *
     * @mbg.generated
     */
    private String paymentState;

    /**
     * Database Column Remarks:
     *   相关联的PaymentDetails/P
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.payment_ref_id
     *
     * @mbg.generated
     */
    private String paymentRefId;

    /**
     * Database Column Remarks:
     *   相关联的PaymentDetails/P
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.payment_id
     *
     * @mbg.generated
     */
    private String paymentId;

    /**
     * Database Column Remarks:
     *   相关联的PaymentDetails/P
     *
     * This field was generated by MyBatis Generator.
     * This field corresponds to the database column MP_PaymentRefs.payment_ref_audit_id
     *
     * @mbg.generated
     */
    private String paymentRefAuditId;

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.super_pnr_id
     *
     * @return the value of MP_PaymentRefs.super_pnr_id
     *
     * @mbg.generated
     */
    public String getSuperPnrId() {
        return superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.super_pnr_id
     *
     * @param superPnrId the value for MP_PaymentRefs.super_pnr_id
     *
     * @mbg.generated
     */
    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.search_id
     *
     * @return the value of MP_PaymentRefs.search_id
     *
     * @mbg.generated
     */
    public String getSearchId() {
        return searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.search_id
     *
     * @param searchId the value for MP_PaymentRefs.search_id
     *
     * @mbg.generated
     */
    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.product_number
     *
     * @return the value of MP_PaymentRefs.product_number
     *
     * @mbg.generated
     */
    public String getProductNumber() {
        return productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.product_number
     *
     * @param productNumber the value for MP_PaymentRefs.product_number
     *
     * @mbg.generated
     */
    public void setProductNumber(String productNumber) {
        this.productNumber = productNumber;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.pnr
     *
     * @return the value of MP_PaymentRefs.pnr
     *
     * @mbg.generated
     */
    public String getPnr() {
        return pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.pnr
     *
     * @param pnr the value for MP_PaymentRefs.pnr
     *
     * @mbg.generated
     */
    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.payment_refs_audit_id
     *
     * @return the value of MP_PaymentRefs.payment_refs_audit_id
     *
     * @mbg.generated
     */
    public String getPaymentRefsAuditId() {
        return paymentRefsAuditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.payment_refs_audit_id
     *
     * @param paymentRefsAuditId the value for MP_PaymentRefs.payment_refs_audit_id
     *
     * @mbg.generated
     */
    public void setPaymentRefsAuditId(String paymentRefsAuditId) {
        this.paymentRefsAuditId = paymentRefsAuditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.payment_state
     *
     * @return the value of MP_PaymentRefs.payment_state
     *
     * @mbg.generated
     */
    public String getPaymentState() {
        return paymentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.payment_state
     *
     * @param paymentState the value for MP_PaymentRefs.payment_state
     *
     * @mbg.generated
     */
    public void setPaymentState(String paymentState) {
        this.paymentState = paymentState;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.payment_ref_id
     *
     * @return the value of MP_PaymentRefs.payment_ref_id
     *
     * @mbg.generated
     */
    public String getPaymentRefId() {
        return paymentRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.payment_ref_id
     *
     * @param paymentRefId the value for MP_PaymentRefs.payment_ref_id
     *
     * @mbg.generated
     */
    public void setPaymentRefId(String paymentRefId) {
        this.paymentRefId = paymentRefId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.payment_id
     *
     * @return the value of MP_PaymentRefs.payment_id
     *
     * @mbg.generated
     */
    public String getPaymentId() {
        return paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.payment_id
     *
     * @param paymentId the value for MP_PaymentRefs.payment_id
     *
     * @mbg.generated
     */
    public void setPaymentId(String paymentId) {
        this.paymentId = paymentId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method returns the value of the database column MP_PaymentRefs.payment_ref_audit_id
     *
     * @return the value of MP_PaymentRefs.payment_ref_audit_id
     *
     * @mbg.generated
     */
    public String getPaymentRefAuditId() {
        return paymentRefAuditId;
    }

    /**
     * This method was generated by MyBatis Generator.
     * This method sets the value of the database column MP_PaymentRefs.payment_ref_audit_id
     *
     * @param paymentRefAuditId the value for MP_PaymentRefs.payment_ref_audit_id
     *
     * @mbg.generated
     */
    public void setPaymentRefAuditId(String paymentRefAuditId) {
        this.paymentRefAuditId = paymentRefAuditId;
    }
}