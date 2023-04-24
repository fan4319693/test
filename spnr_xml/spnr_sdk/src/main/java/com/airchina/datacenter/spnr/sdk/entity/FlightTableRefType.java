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
import javax.xml.bind.annotation.XmlType;


/**
 * Flight Solutions Table Reference.
 * 
 * 				=notes=
 * 				1. This node replaces complete flight data sets with short listings of the referenced Segment/Flight that contains a few attributes with no elements.
 * 				2. It provides a reference for specified flight/ flight segment information to flight details in the AirShoppingRS/FlightTable.
 * 
 * <p>FlightTableRefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightTableRefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
 *       &lt;attribute name="FlightID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *       &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightTableRefType")
public class FlightTableRefType {

    @XmlAttribute(name = "FlightID", required = true)
    protected String flightID;
    @XmlAttribute(name = "ChangeOfAirport")
    protected String changeOfAirport;
    @XmlAttribute(name = "SecureFlight")
    protected String secureFlight;
    @XmlAttribute(name = "MarriedSegment")
    protected String marriedSegment;
    @XmlAttribute(name = "CnxxIndicator")
    protected String cnxxIndicator;

    /**
     * 获取flightID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightID() {
        return flightID;
    }

    /**
     * 设置flightID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightID(String value) {
        this.flightID = value;
    }

    /**
     * 获取changeOfAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChangeOfAirport() {
        return changeOfAirport;
    }

    /**
     * 设置changeOfAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChangeOfAirport(String value) {
        this.changeOfAirport = value;
    }

    /**
     * 获取secureFlight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSecureFlight() {
        return secureFlight;
    }

    /**
     * 设置secureFlight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSecureFlight(String value) {
        this.secureFlight = value;
    }

    /**
     * 获取marriedSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriedSegment() {
        return marriedSegment;
    }

    /**
     * 设置marriedSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriedSegment(String value) {
        this.marriedSegment = value;
    }

    /**
     * 获取cnxxIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCnxxIndicator() {
        return cnxxIndicator;
    }

    /**
     * 设置cnxxIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCnxxIndicator(String value) {
        this.cnxxIndicator = value;
    }

}
