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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The carbon offset calculated based on journey, class and number of passengers.
 * 
 * <p>CarbonOffsetType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CarbonOffsetType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Price" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPriceType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CarbonOffsetType", propOrder = {
    "price"
})
public class CarbonOffsetType {

    @XmlElement(name = "Price")
    protected AirAncillaryProductPriceType price;
    @XmlAttribute(name = "Unit")
    protected WeightUnitType unit;
    @XmlAttribute(name = "Amount")
    protected Float amount;

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPriceType }
     *     
     */
    public AirAncillaryProductPriceType getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPriceType }
     *     
     */
    public void setPrice(AirAncillaryProductPriceType value) {
        this.price = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeightUnitType }
     *     
     */
    public WeightUnitType getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeightUnitType }
     *     
     */
    public void setUnit(WeightUnitType value) {
        this.unit = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmount(Float value) {
        this.amount = value;
    }

}
