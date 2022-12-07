//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Standard Supplier/Originator/Booking Ref elements
 * 
 * <p>FerryBookingCore complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryBookingCore">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Supplier" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="Originator" type="{http://www.opentravel.org/OTA/2003/05}FerryPOS_Type"/>
 *         &lt;element name="BookingRef" type="{http://www.opentravel.org/OTA/2003/05}FerryUniqueID_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryBookingCore", propOrder = {
    "supplier",
    "originator",
    "bookingRef"
})
public class FerryBookingCore {

    @XmlElement(name = "Supplier")
    protected CompanyNameType supplier;
    @XmlElement(name = "Originator", required = true)
    protected FerryPOSType originator;
    @XmlElement(name = "BookingRef")
    protected FerryUniqueIDType bookingRef;

    /**
     * 获取supplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getSupplier() {
        return supplier;
    }

    /**
     * 设置supplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setSupplier(CompanyNameType value) {
        this.supplier = value;
    }

    /**
     * 获取originator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryPOSType }
     *     
     */
    public FerryPOSType getOriginator() {
        return originator;
    }

    /**
     * 设置originator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryPOSType }
     *     
     */
    public void setOriginator(FerryPOSType value) {
        this.originator = value;
    }

    /**
     * 获取bookingRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryUniqueIDType }
     *     
     */
    public FerryUniqueIDType getBookingRef() {
        return bookingRef;
    }

    /**
     * 设置bookingRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryUniqueIDType }
     *     
     */
    public void setBookingRef(FerryUniqueIDType value) {
        this.bookingRef = value;
    }

}
