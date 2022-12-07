//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProcessingStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ProcessingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING_PAYMENT"/>
 *     &lt;enumeration value="PRE_CANCEL"/>
 *     &lt;enumeration value="CANCELLING"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="PENDING_TICKET"/>
 *     &lt;enumeration value="TICKET_FAILED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="COMPLETED_REFUND"/>
 *     &lt;enumeration value="COMPLETED_CHANGE"/>
 *     &lt;enumeration value="COMPLETED_REFUND_CHANGE"/>
 *     &lt;enumeration value="PARTIAL_SUCCESS"/>
 *     &lt;enumeration value="PARTIAL_REFUND"/>
 *     &lt;enumeration value="PARTIAL_CHANGE"/>
 *     &lt;enumeration value="PARTIAL_REFUND_CHANGE"/>
 *     &lt;enumeration value="REFUNDED"/>
 *     &lt;enumeration value="APPLYING"/>
 *     &lt;enumeration value="DELETED"/>
 *     &lt;enumeration value="PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ProcessingStatusType")
@XmlEnum
public enum ProcessingStatusType {


    /**
     * Used to indicate pendingPayment status
     * 
     */
    PENDING_PAYMENT,

    /**
     * Used to indicate preCancel status
     * 
     */
    PRE_CANCEL,

    /**
     * Used to indicate pendingCancel status
     * 
     */
    CANCELLING,

    /**
     * Used to indicate cancelled status
     * 
     */
    CANCELLED,

    /**
     * Used to indicate pendingTicket status
     * 
     */
    PENDING_TICKET,

    /**
     * Used to indicate ticketFail status
     * 
     */
    TICKET_FAILED,

    /**
     * Used to indicate completed status
     * 
     */
    COMPLETED,

    /**
     * Used to indicate completed with refundTicket status
     * 
     */
    COMPLETED_REFUND,

    /**
     * Used to indicate completed with changeDatePendingPayment status
     * 
     */
    COMPLETED_CHANGE,

    /**
     * 
     * 						Used to indicate completed with changeDatePendingPayment and refundTicket status
     * 					
     * 
     */
    COMPLETED_REFUND_CHANGE,

    /**
     * Used to indicate partSuccess status
     * 
     */
    PARTIAL_SUCCESS,

    /**
     * Used to indicate partSuccess with refundTicket status
     * 
     */
    PARTIAL_REFUND,

    /**
     * Used to indicate partSuccess with changeDatePendingPayment status
     * 
     */
    PARTIAL_CHANGE,

    /**
     * 
     * 						Used to indicate partSuccess with changeDatePendingPayment and refundTicket status
     * 					
     * 
     */
    PARTIAL_REFUND_CHANGE,

    /**
     * Used to indicate all product are ticketRefund status
     * 
     */
    REFUNDED,

    /**
     * Used to indicate pendingApply status
     * 
     */
    APPLYING,

    /**
     * Used to indicate deleted status
     * 
     */
    DELETED,

    /**
     * Used to indicate paid status
     * 
     */
    PAID;

    public String value() {
        return name();
    }

    public static ProcessingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
