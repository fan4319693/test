//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The eligible item of the particular ancillary product.
 * 
 * <p>AirAncillaryEligibleItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryEligibleItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="Air" type="{http://www.opentravel.org/OTA/2003/05}EligibleItemAirType" minOccurs="0"/>
 *         &lt;/choice>
 *         &lt;element name="EligiblePricing" type="{http://www.opentravel.org/OTA/2003/05}EligiblePricingType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryEligibleItemType", propOrder = {
    "air",
    "eligiblePricing"
})
public class AirAncillaryEligibleItemType {

    @XmlElement(name = "Air")
    protected EligibleItemAirType air;
    @XmlElement(name = "EligiblePricing")
    protected EligiblePricingType eligiblePricing;

    /**
     * 获取air属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EligibleItemAirType }
     *     
     */
    public EligibleItemAirType getAir() {
        return air;
    }

    /**
     * 设置air属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EligibleItemAirType }
     *     
     */
    public void setAir(EligibleItemAirType value) {
        this.air = value;
    }

    /**
     * 获取eligiblePricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link EligiblePricingType }
     *     
     */
    public EligiblePricingType getEligiblePricing() {
        return eligiblePricing;
    }

    /**
     * 设置eligiblePricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link EligiblePricingType }
     *     
     */
    public void setEligiblePricing(EligiblePricingType value) {
        this.eligiblePricing = value;
    }

}
