//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * This is an extension of CompanyNameType to include a FlightNumber.
 * 
 * <p>OperatingAirlineType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OperatingAirlineType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompanyNameType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightNumberGroup"/>
 *       &lt;attribute name="DisplayCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DisclosureText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OperatingAirlineType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.TicketingFullInfoType.FlightInfo.CarrierInfo.class,
    com.airchina.datacenter.spnr.sdk.entity.VerificationPNR.Product.Air.class
})
public class OperatingAirlineType
    extends CompanyNameType
{

    @XmlAttribute(name = "DisplayCode")
    protected String displayCode;
    @XmlAttribute(name = "DisclosureText")
    protected String disclosureText;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "FlightNumberSuffix")
    protected String flightNumberSuffix;

    /**
     * 获取displayCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisplayCode() {
        return displayCode;
    }

    /**
     * 设置displayCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisplayCode(String value) {
        this.displayCode = value;
    }

    /**
     * 获取disclosureText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosureText() {
        return disclosureText;
    }

    /**
     * 设置disclosureText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosureText(String value) {
        this.disclosureText = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取flightNumberSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumberSuffix() {
        return flightNumberSuffix;
    }

    /**
     * 设置flightNumberSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumberSuffix(String value) {
        this.flightNumberSuffix = value;
    }

}
