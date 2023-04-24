//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Flight type preferences.
 * 
 * <p>FlightType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirportChange" type="{http://www.opentravel.org/OTA/2003/05}ChoicePrefType" minOccurs="0"/>
 *         &lt;element name="OvernightStop" type="{http://www.opentravel.org/OTA/2003/05}ChoicePrefType" minOccurs="0"/>
 *         &lt;element name="RedEye" type="{http://www.opentravel.org/OTA/2003/05}ChoicePrefType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="NonStopDirect" type="{http://www.opentravel.org/OTA/2003/05}ChoicePrefType" />
 *       &lt;attribute name="StopDirect" type="{http://www.opentravel.org/OTA/2003/05}ChoicePrefType" />
 *       &lt;attribute name="NumberConnx" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="AllowInterline" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightType", propOrder = {
    "airportChange",
    "overnightStop",
    "redEye"
})
public class FlightType {

    @XmlElement(name = "AirportChange")
    @XmlSchemaType(name = "string")
    protected ChoicePrefType airportChange;
    @XmlElement(name = "OvernightStop")
    @XmlSchemaType(name = "string")
    protected ChoicePrefType overnightStop;
    @XmlElement(name = "RedEye")
    @XmlSchemaType(name = "string")
    protected ChoicePrefType redEye;
    @XmlAttribute(name = "NonStopDirect")
    protected ChoicePrefType nonStopDirect;
    @XmlAttribute(name = "StopDirect")
    protected ChoicePrefType stopDirect;
    @XmlAttribute(name = "NumberConnx")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger numberConnx;
    @XmlAttribute(name = "AllowInterline")
    protected String allowInterline;

    /**
     * 获取airportChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChoicePrefType }
     *     
     */
    public ChoicePrefType getAirportChange() {
        return airportChange;
    }

    /**
     * 设置airportChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicePrefType }
     *     
     */
    public void setAirportChange(ChoicePrefType value) {
        this.airportChange = value;
    }

    /**
     * 获取overnightStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChoicePrefType }
     *     
     */
    public ChoicePrefType getOvernightStop() {
        return overnightStop;
    }

    /**
     * 设置overnightStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicePrefType }
     *     
     */
    public void setOvernightStop(ChoicePrefType value) {
        this.overnightStop = value;
    }

    /**
     * 获取redEye属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChoicePrefType }
     *     
     */
    public ChoicePrefType getRedEye() {
        return redEye;
    }

    /**
     * 设置redEye属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicePrefType }
     *     
     */
    public void setRedEye(ChoicePrefType value) {
        this.redEye = value;
    }

    /**
     * 获取nonStopDirect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChoicePrefType }
     *     
     */
    public ChoicePrefType getNonStopDirect() {
        return nonStopDirect;
    }

    /**
     * 设置nonStopDirect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicePrefType }
     *     
     */
    public void setNonStopDirect(ChoicePrefType value) {
        this.nonStopDirect = value;
    }

    /**
     * 获取stopDirect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ChoicePrefType }
     *     
     */
    public ChoicePrefType getStopDirect() {
        return stopDirect;
    }

    /**
     * 设置stopDirect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ChoicePrefType }
     *     
     */
    public void setStopDirect(ChoicePrefType value) {
        this.stopDirect = value;
    }

    /**
     * 获取numberConnx属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumberConnx() {
        return numberConnx;
    }

    /**
     * 设置numberConnx属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumberConnx(BigInteger value) {
        this.numberConnx = value;
    }

    /**
     * 获取allowInterline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowInterline() {
        if (allowInterline == null) {
            return "Y";
        } else {
            return allowInterline;
        }
    }

    /**
     * 设置allowInterline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowInterline(String value) {
        this.allowInterline = value;
    }

}
