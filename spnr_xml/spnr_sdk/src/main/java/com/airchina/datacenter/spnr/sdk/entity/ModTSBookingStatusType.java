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
 * <p>ModTSBookingStatusType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ModTSBookingStatusType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="PENDING_PAYMENT"/>
 *     &lt;enumeration value="PRE_CANCEL"/>
 *     &lt;enumeration value="CANCELLING"/>
 *     &lt;enumeration value="CANCELLED"/>
 *     &lt;enumeration value="PENDING_TICKET"/>
 *     &lt;enumeration value="TICKET_FAILED"/>
 *     &lt;enumeration value="TICKET_FAILED_ENSURING"/>
 *     &lt;enumeration value="TICKET_ENSURE_FAILED_MANUAL"/>
 *     &lt;enumeration value="TICKET_ENSURE_FAILED_SYS"/>
 *     &lt;enumeration value="TICKETED"/>
 *     &lt;enumeration value="BOOKED"/>
 *     &lt;enumeration value="USED"/>
 *     &lt;enumeration value="APPLIED"/>
 *     &lt;enumeration value="BOOK_FAILED"/>
 *     &lt;enumeration value="COMPLETED"/>
 *     &lt;enumeration value="EXPIRED"/>
 *     &lt;enumeration value="STATION_INBOUND"/>
 *     &lt;enumeration value="STATION_OUTBOUND"/>
 *     &lt;enumeration value="UPGRADE_FAILED"/>
 *     &lt;enumeration value="UPGRADED"/>
 *     &lt;enumeration value="FORCE_REFUND_REVIEW"/>
 *     &lt;enumeration value="INSURANCE_CANCELLED"/>
 *     &lt;enumeration value="INSURANCE_BOOKED"/>
 *     &lt;enumeration value="INSURANCE_BOOK_FAILED"/>
 *     &lt;enumeration value="PAID"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ModTSBookingStatusType")
@XmlEnum
public enum ModTSBookingStatusType {


    /**
     * Indicates that the product is waiting for payment.
     * 
     */
    PENDING_PAYMENT,

    /**
     * Indicates payment deadline has not returned the result of successful payment.
     * 
     */
    PRE_CANCEL,

    /**
     * Indicates product cancellation failure.
     * 
     */
    CANCELLING,

    /**
     * Indicates the system automatically cancels if the payment fails due to timeout.
     * 
     */
    CANCELLED,

    /**
     * Indicates product payment is successful and the ticket is issued.
     * 
     */
    PENDING_TICKET,

    /**
     * Indicates ticket issuing queue fails, waiting for manual guarantee.
     * 
     */
    TICKET_FAILED,

    /**
     * Indicates ticket failure is being secured.
     * 
     */
    TICKET_FAILED_ENSURING,

    /**
     * Indicates ticket issue failed and manual security failed.
     * 
     */
    TICKET_ENSURE_FAILED_MANUAL,

    /**
     * Indicates failed to issue ticket and system guarantee time out.
     * 
     */
    TICKET_ENSURE_FAILED_SYS,

    /**
     * Indicates the product has been ticketed successfully.
     * 
     */
    TICKETED,

    /**
     * Indicates product book successfull.
     * 
     */
    BOOKED,

    /**
     * Indicates product has been used.
     * 
     */
    USED,

    /**
     * Indicates product has already applied.
     * 
     */
    APPLIED,

    /**
     * Indicates product book failed.
     * 
     */
    BOOK_FAILED,

    /**
     * Indicates the product has been completed.
     * 
     */
    COMPLETED,

    /**
     * Indicates product has been expired
     * 
     */
    EXPIRED,

    /**
     * Indicates product has been inbound.
     * 
     */
    STATION_INBOUND,

    /**
     * Indicates product has been outbound.
     * 
     */
    STATION_OUTBOUND,

    /**
     * Indicates upgrade product failed.
     * 
     */
    UPGRADE_FAILED,

    /**
     * Indicates upgrade product successfull
     * 
     */
    UPGRADED,

    /**
     * This type of refund is not restrict by refund rules, it usually initiated by the administrator.
     * 
     */
    FORCE_REFUND_REVIEW,

    /**
     * Indicates no payment is made when the order cancellation time
     * 						limit is reached
     * 
     */
    INSURANCE_CANCELLED,

    /**
     * Indicates insurance purchase succeeded
     * 
     */
    INSURANCE_BOOKED,

    /**
     * Indicates insurance purchase failed
     * 
     */
    INSURANCE_BOOK_FAILED,

    /**
     * Indicates the product is paid
     * 
     */
    PAID;

    public String value() {
        return name();
    }

    public static ModTSBookingStatusType fromValue(String v) {
        return valueOf(v);
    }

}
