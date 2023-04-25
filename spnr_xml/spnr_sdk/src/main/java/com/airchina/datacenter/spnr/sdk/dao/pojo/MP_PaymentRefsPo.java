package com.airchina.datacenter.spnr.sdk.dao.pojo;


import lombok.Data;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PaymentRefsPo </p>
 * <p>Description: 存储MP产品所关联的支付记录</p>
 * <p>Sample: new MP_PaymentRefsPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
@Data
public class MP_PaymentRefsPo {

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
     * 功能说明:
     * 最后修改时间: 2023/04/20
     */
    private Long paymentRefsAuditId;

    /**
     * 功能说明: MP支付状态:PaymentDue--待支付 FullyPaid--已支付
     * 最后修改时间: 2023/04/20
     */
    private String paymentState;

    /**
     * 功能说明: 相关联的PaymentDetails/Payments/Payment的@ID
     * 最后修改时间: 2023/04/20
     */
    private Long paymentRefId;

    /**
     * 功能说明: 相关联的PaymentDetails/Payments/Payment的@PaymentID
     * 最后修改时间: 2023/04/20
     */
    private Long paymentId;

    /**
     * 功能说明: 相关联的PaymentDetails/Payments/Payment的@AuditID
     * 最后修改时间: 2023/04/20
     */
    private Long paymentRefAuditId;

}