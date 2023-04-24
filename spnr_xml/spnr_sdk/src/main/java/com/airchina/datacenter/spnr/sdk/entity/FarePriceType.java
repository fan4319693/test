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
import javax.xml.bind.annotation.XmlType;


/**
 * Fare pricing information.
 * 
 * <p>FarePriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FarePriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}BaseFareType"/>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}FareTaxesType" minOccurs="0"/>
 *         &lt;element name="ExemptedTaxes" type="{http://www.opentravel.org/OTA/2003/05}ExemptTaxType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="Redemption" type="{http://www.opentravel.org/OTA/2003/05}FullRedemptionType" minOccurs="0"/>
 *           &lt;element name="RedemptionCurrency" type="{http://www.opentravel.org/OTA/2003/05}PartialRedemptionType" minOccurs="0"/>
 *         &lt;/choice>
 *       &lt;/sequence>
 *       &lt;attribute name="Total" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FarePriceType", propOrder = {
    "currencyCode",
    "baseFare",
    "taxes",
    "exemptedTaxes",
    "redemption",
    "redemptionCurrency"
})
public class FarePriceType {

    @XmlElement(name = "CurrencyCode", required = true)
    protected CurrencyCodeType currencyCode;
    @XmlElement(name = "BaseFare", required = true)
    protected BaseFareType baseFare;
    @XmlElement(name = "Taxes")
    protected FareTaxesType taxes;
    @XmlElement(name = "ExemptedTaxes")
    protected ExemptTaxType exemptedTaxes;
    @XmlElement(name = "Redemption")
    protected FullRedemptionType redemption;
    @XmlElement(name = "RedemptionCurrency")
    protected PartialRedemptionType redemptionCurrency;
    @XmlAttribute(name = "Total", required = true)
    protected BigInteger total;

    /**
     * 获取currencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyCodeType }
     *     
     */
    public CurrencyCodeType getCurrencyCode() {
        return currencyCode;
    }

    /**
     * 设置currencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyCodeType }
     *     
     */
    public void setCurrencyCode(CurrencyCodeType value) {
        this.currencyCode = value;
    }

    /**
     * 获取baseFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseFareType }
     *     
     */
    public BaseFareType getBaseFare() {
        return baseFare;
    }

    /**
     * 设置baseFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareType }
     *     
     */
    public void setBaseFare(BaseFareType value) {
        this.baseFare = value;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareTaxesType }
     *     
     */
    public FareTaxesType getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareTaxesType }
     *     
     */
    public void setTaxes(FareTaxesType value) {
        this.taxes = value;
    }

    /**
     * 获取exemptedTaxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExemptTaxType }
     *     
     */
    public ExemptTaxType getExemptedTaxes() {
        return exemptedTaxes;
    }

    /**
     * 设置exemptedTaxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExemptTaxType }
     *     
     */
    public void setExemptedTaxes(ExemptTaxType value) {
        this.exemptedTaxes = value;
    }

    /**
     * 获取redemption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FullRedemptionType }
     *     
     */
    public FullRedemptionType getRedemption() {
        return redemption;
    }

    /**
     * 设置redemption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FullRedemptionType }
     *     
     */
    public void setRedemption(FullRedemptionType value) {
        this.redemption = value;
    }

    /**
     * 获取redemptionCurrency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PartialRedemptionType }
     *     
     */
    public PartialRedemptionType getRedemptionCurrency() {
        return redemptionCurrency;
    }

    /**
     * 设置redemptionCurrency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PartialRedemptionType }
     *     
     */
    public void setRedemptionCurrency(PartialRedemptionType value) {
        this.redemptionCurrency = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotal(BigInteger value) {
        this.total = value;
    }

}
