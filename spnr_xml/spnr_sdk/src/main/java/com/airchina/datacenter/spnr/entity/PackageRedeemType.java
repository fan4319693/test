//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to describe how loyalty units might be redeemed, in terms of mixed cash and loyalty.
 * 
 * <p>PackageRedeemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageRedeemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RedeemType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PackageRedeemAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageRedeemType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.PackageLoyaltyPricingType.Redeem.class
})
public class PackageRedeemType
    extends RedeemType
{

    @XmlAttribute(name = "AmountChange")
    protected Float amountChange;
    @XmlAttribute(name = "QuantityAdjusted")
    protected BigInteger quantityAdjusted;
    @XmlAttribute(name = "QuantityChange")
    protected BigInteger quantityChange;

    /**
     * 获取amountChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getAmountChange() {
        return amountChange;
    }

    /**
     * 设置amountChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setAmountChange(Float value) {
        this.amountChange = value;
    }

    /**
     * 获取quantityAdjusted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityAdjusted() {
        return quantityAdjusted;
    }

    /**
     * 设置quantityAdjusted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityAdjusted(BigInteger value) {
        this.quantityAdjusted = value;
    }

    /**
     * 获取quantityChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantityChange() {
        return quantityChange;
    }

    /**
     * 设置quantityChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantityChange(BigInteger value) {
        this.quantityChange = value;
    }

}
