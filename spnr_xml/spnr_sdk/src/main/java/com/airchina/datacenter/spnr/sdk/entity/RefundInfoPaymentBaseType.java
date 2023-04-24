//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This base type is used for OJ_GetRefundInfoRQ/Request/Payment
 * 
 * <p>RefundInfoPaymentBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RefundInfoPaymentBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="BankBillNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BankID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RefundInfoPaymentBaseType")
@XmlSeeAlso({
    RefundInfoPaymentType.class
})
public class RefundInfoPaymentBaseType {

    @XmlAttribute(name = "BankBillNo")
    protected String bankBillNo;
    @XmlAttribute(name = "BankID")
    protected String bankID;

    /**
     * 获取bankBillNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankBillNo() {
        return bankBillNo;
    }

    /**
     * 设置bankBillNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankBillNo(String value) {
        this.bankBillNo = value;
    }

    /**
     * 获取bankID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBankID() {
        return bankID;
    }

    /**
     * 设置bankID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBankID(String value) {
        this.bankID = value;
    }

}
