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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to describe how loyalty units might be redeemed, in terms of mixed cash and loyalty.
 * 
 * <p>RedeemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RedeemType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}LoyaltyBaseType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RedeemAttributes"/>
 *       &lt;attribute name="Modular" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RedeemType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyProductType.Redemption.Redeem.class,
    PackageRedeemType.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPaymentType.Redeem.class,
    com.airchina.datacenter.spnr.sdk.entity.PaymentLoyaltyType.Redeem.SubRedeem.class,
    com.airchina.datacenter.spnr.sdk.entity.PaymentLoyaltyType.Redeem.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Combinations.Combination.Redemption.Redeem.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyDetailsPricingType.Combinations.Combination.Redemption.Redeem.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPTCType.PTC.Redemption.Redeem.class,
    com.airchina.datacenter.spnr.sdk.entity.LoyaltyPricingType.Redeem.class
})
public class RedeemType
    extends LoyaltyBaseType
{

    @XmlAttribute(name = "Modular")
    protected Boolean modular;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "Amount")
    protected Float amount;

    /**
     * 获取modular属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModular() {
        return modular;
    }

    /**
     * 设置modular属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModular(Boolean value) {
        this.modular = value;
    }

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrencyCode(String value) {
        this.currencyCode = value;
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
