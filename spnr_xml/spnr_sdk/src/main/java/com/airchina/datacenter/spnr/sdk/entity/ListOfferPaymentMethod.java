//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>List_OfferPaymentMethod的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_OfferPaymentMethod">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BusinessCheck"/>
 *     &lt;enumeration value="Cash"/>
 *     &lt;enumeration value="Check"/>
 *     &lt;enumeration value="CorporateAccount"/>
 *     &lt;enumeration value="Coupon"/>
 *     &lt;enumeration value="CreditCard"/>
 *     &lt;enumeration value="DebitCard"/>
 *     &lt;enumeration value="DirectBill"/>
 *     &lt;enumeration value="InternetAccount"/>
 *     &lt;enumeration value="LoyaltyPaymentCard"/>
 *     &lt;enumeration value="LoyaltyRedemption"/>
 *     &lt;enumeration value="MobilePayment"/>
 *     &lt;enumeration value="Ticket"/>
 *     &lt;enumeration value="Voucher"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_OfferPaymentMethod")
@XmlEnum
public enum ListOfferPaymentMethod {

    @XmlEnumValue("BusinessCheck")
    BUSINESS_CHECK("BusinessCheck"),
    @XmlEnumValue("Cash")
    CASH("Cash"),
    @XmlEnumValue("Check")
    CHECK("Check"),
    @XmlEnumValue("CorporateAccount")
    CORPORATE_ACCOUNT("CorporateAccount"),
    @XmlEnumValue("Coupon")
    COUPON("Coupon"),
    @XmlEnumValue("CreditCard")
    CREDIT_CARD("CreditCard"),
    @XmlEnumValue("DebitCard")
    DEBIT_CARD("DebitCard"),
    @XmlEnumValue("DirectBill")
    DIRECT_BILL("DirectBill"),
    @XmlEnumValue("InternetAccount")
    INTERNET_ACCOUNT("InternetAccount"),
    @XmlEnumValue("LoyaltyPaymentCard")
    LOYALTY_PAYMENT_CARD("LoyaltyPaymentCard"),
    @XmlEnumValue("LoyaltyRedemption")
    LOYALTY_REDEMPTION("LoyaltyRedemption"),
    @XmlEnumValue("MobilePayment")
    MOBILE_PAYMENT("MobilePayment"),
    @XmlEnumValue("Ticket")
    TICKET("Ticket"),
    @XmlEnumValue("Voucher")
    VOUCHER("Voucher");
    private final String value;

    ListOfferPaymentMethod(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListOfferPaymentMethod fromValue(String v) {
        for (ListOfferPaymentMethod c: ListOfferPaymentMethod.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
