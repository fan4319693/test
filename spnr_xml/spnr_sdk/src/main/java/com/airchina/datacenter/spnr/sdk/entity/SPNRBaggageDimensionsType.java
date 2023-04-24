//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>SPNRBaggageDimensionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SPNRBaggageDimensionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Length" type="{http://www.opentravel.org/OTA/2003/05}DimensionLengthWidthHeightType" minOccurs="0"/>
 *         &lt;element name="Width" type="{http://www.opentravel.org/OTA/2003/05}DimensionLengthWidthHeightType" minOccurs="0"/>
 *         &lt;element name="Height" type="{http://www.opentravel.org/OTA/2003/05}DimensionLengthWidthHeightType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Units" use="required" type="{http://www.opentravel.org/OTA/2003/05}SizeUnitType" />
 *       &lt;attribute name="LCM" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPNRBaggageDimensionsType", propOrder = {
    "length",
    "width",
    "height"
})
public class SPNRBaggageDimensionsType {

    @XmlElement(name = "Length")
    protected DimensionLengthWidthHeightType length;
    @XmlElement(name = "Width")
    protected DimensionLengthWidthHeightType width;
    @XmlElement(name = "Height")
    protected DimensionLengthWidthHeightType height;
    @XmlAttribute(name = "Units", required = true)
    protected SizeUnitType units;
    @XmlAttribute(name = "LCM")
    protected BigDecimal lcm;

    /**
     * 获取length属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public DimensionLengthWidthHeightType getLength() {
        return length;
    }

    /**
     * 设置length属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public void setLength(DimensionLengthWidthHeightType value) {
        this.length = value;
    }

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public DimensionLengthWidthHeightType getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public void setWidth(DimensionLengthWidthHeightType value) {
        this.width = value;
    }

    /**
     * 获取height属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public DimensionLengthWidthHeightType getHeight() {
        return height;
    }

    /**
     * 设置height属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DimensionLengthWidthHeightType }
     *     
     */
    public void setHeight(DimensionLengthWidthHeightType value) {
        this.height = value;
    }

    /**
     * 获取units属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SizeUnitType }
     *     
     */
    public SizeUnitType getUnits() {
        return units;
    }

    /**
     * 设置units属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SizeUnitType }
     *     
     */
    public void setUnits(SizeUnitType value) {
        this.units = value;
    }

    /**
     * 获取lcm属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getLCM() {
        return lcm;
    }

    /**
     * 设置lcm属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setLCM(BigDecimal value) {
        this.lcm = value;
    }

}
