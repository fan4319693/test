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
 * The beverage amenity information.
 * 
 * <p>BeverageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BeverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlightAmenityGroup"/>
 *       &lt;attribute name="AlcoholicCost" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmenityCostType" />
 *       &lt;attribute name="NonalcoholicCost" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmenityCostType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BeverageType")
public class BeverageType {

    @XmlAttribute(name = "AlcoholicCost", required = true)
    protected AmenityCostType alcoholicCost;
    @XmlAttribute(name = "NonalcoholicCost", required = true)
    protected AmenityCostType nonalcoholicCost;
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
     * 获取alcoholicCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmenityCostType }
     *     
     */
    public AmenityCostType getAlcoholicCost() {
        return alcoholicCost;
    }

    /**
     * 设置alcoholicCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmenityCostType }
     *     
     */
    public void setAlcoholicCost(AmenityCostType value) {
        this.alcoholicCost = value;
    }

    /**
     * 获取nonalcoholicCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AmenityCostType }
     *     
     */
    public AmenityCostType getNonalcoholicCost() {
        return nonalcoholicCost;
    }

    /**
     * 设置nonalcoholicCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AmenityCostType }
     *     
     */
    public void setNonalcoholicCost(AmenityCostType value) {
        this.nonalcoholicCost = value;
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
