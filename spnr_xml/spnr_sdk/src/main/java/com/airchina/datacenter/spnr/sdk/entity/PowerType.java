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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The power amenity information.
 * 
 * <p>PowerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PowerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightAmenityGroup"/>
 *       &lt;attribute name="Cost" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmenityCostType" />
 *       &lt;attribute name="Distribution" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MultipleAtSeat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="UsbPort" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PowerOutlet" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PowerType")
public class PowerType {

    @XmlAttribute(name = "Cost", required = true)
    protected AmenityCostType cost;
    @XmlAttribute(name = "Distribution", required = true)
    protected String distribution;
    @XmlAttribute(name = "MultipleAtSeat")
    protected Boolean multipleAtSeat;
    @XmlAttribute(name = "UsbPort")
    protected Boolean usbPort;
    @XmlAttribute(name = "PowerOutlet")
    protected Boolean powerOutlet;
    @XmlAttribute(name = "ID", required = true)
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger id;
    @XmlAttribute(name = "QualityLevel", required = true)
    protected String qualityLevel;
    @XmlAttribute(name = "Info", required = true)
    protected String info;
    @XmlAttribute(name = "Available")
    protected Boolean available;
    @XmlAttribute(name = "Text")
    protected String text;

    /**
     * 获取cost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmenityCostType }
     *     
     */
    public AmenityCostType getCost() {
        return cost;
    }

    /**
     * 设置cost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmenityCostType }
     *     
     */
    public void setCost(AmenityCostType value) {
        this.cost = value;
    }

    /**
     * 获取distribution属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDistribution() {
        return distribution;
    }

    /**
     * 设置distribution属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDistribution(String value) {
        this.distribution = value;
    }

    /**
     * 获取multipleAtSeat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMultipleAtSeat() {
        return multipleAtSeat;
    }

    /**
     * 设置multipleAtSeat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMultipleAtSeat(Boolean value) {
        this.multipleAtSeat = value;
    }

    /**
     * 获取usbPort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isUsbPort() {
        return usbPort;
    }

    /**
     * 设置usbPort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setUsbPort(Boolean value) {
        this.usbPort = value;
    }

    /**
     * 获取powerOutlet属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPowerOutlet() {
        return powerOutlet;
    }

    /**
     * 设置powerOutlet属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPowerOutlet(Boolean value) {
        this.powerOutlet = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setID(BigInteger value) {
        this.id = value;
    }

    /**
     * 获取qualityLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * 设置qualityLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityLevel(String value) {
        this.qualityLevel = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

    /**
     * 获取available属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAvailable() {
        return available;
    }

    /**
     * 设置available属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAvailable(Boolean value) {
        this.available = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

}
