//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * The total amount charged for the service including additional amounts and fees.
 * 
 * <p>TotalType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TotalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Taxes" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtendedCurrencyHotelGroup"/>
 *       &lt;attribute name="AmountBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="AmountAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="AdditionalFeesExcludedIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Adjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="OriginalAdjusted" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="Amount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="SellingAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="SupplierAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TotalType", propOrder = {
    "taxes"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.Rates.Rate.TotalRate.class,
    com.airchina.datacenter.spnr.sdk.entity.AmountType.Base.class,
    com.airchina.datacenter.spnr.sdk.entity.AmountType.Total.class,
    com.airchina.datacenter.spnr.sdk.entity.ItinPricingType.Cost.class,
    com.airchina.datacenter.spnr.sdk.entity.TravelCostType.CostTotals.class,
    DiscountType.class,
    com.airchina.datacenter.spnr.sdk.entity.RateUploadType.BaseByGuestAmts.BaseByGuestAmt.class
})
public class TotalType {

    @XmlElement(name = "Taxes")
    protected TaxesType taxes;
    @XmlAttribute(name = "AmountBeforeTax")
    protected BigDecimal amountBeforeTax;
    @XmlAttribute(name = "AmountAfterTax")
    protected BigDecimal amountAfterTax;
    @XmlAttribute(name = "AdditionalFeesExcludedIndicator")
    protected Boolean additionalFeesExcludedIndicator;
    @XmlAttribute(name = "Adjusted")
    protected BigDecimal adjusted;
    @XmlAttribute(name = "OriginalAdjusted")
    protected BigDecimal originalAdjusted;
    @XmlAttribute(name = "Amount")
    protected BigDecimal amount;
    @XmlAttribute(name = "SellingAmount")
    protected BigDecimal sellingAmount;
    @XmlAttribute(name = "SupplierAmount")
    protected BigDecimal supplierAmount;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "DecimalPlaces")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger decimalPlaces;
    @XmlAttribute(name = "OriginalAmountBeforeTax")
    protected Float originalAmountBeforeTax;
    @XmlAttribute(name = "OriginalAmountAfterTax")
    protected Float originalAmountAfterTax;
    @XmlAttribute(name = "OriginalCurrencyCode")
    protected String originalCurrencyCode;

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxes(TaxesType value) {
        this.taxes = value;
    }

    /**
     * 获取amountBeforeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountBeforeTax() {
        return amountBeforeTax;
    }

    /**
     * 设置amountBeforeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountBeforeTax(BigDecimal value) {
        this.amountBeforeTax = value;
    }

    /**
     * 获取amountAfterTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmountAfterTax() {
        return amountAfterTax;
    }

    /**
     * 设置amountAfterTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmountAfterTax(BigDecimal value) {
        this.amountAfterTax = value;
    }

    /**
     * 获取additionalFeesExcludedIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalFeesExcludedIndicator() {
        return additionalFeesExcludedIndicator;
    }

    /**
     * 设置additionalFeesExcludedIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalFeesExcludedIndicator(Boolean value) {
        this.additionalFeesExcludedIndicator = value;
    }

    /**
     * 获取adjusted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAdjusted() {
        return adjusted;
    }

    /**
     * 设置adjusted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAdjusted(BigDecimal value) {
        this.adjusted = value;
    }

    /**
     * 获取originalAdjusted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getOriginalAdjusted() {
        return originalAdjusted;
    }

    /**
     * 设置originalAdjusted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setOriginalAdjusted(BigDecimal value) {
        this.originalAdjusted = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setAmount(BigDecimal value) {
        this.amount = value;
    }

    /**
     * 获取sellingAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSellingAmount() {
        return sellingAmount;
    }

    /**
     * 设置sellingAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSellingAmount(BigDecimal value) {
        this.sellingAmount = value;
    }

    /**
     * 获取supplierAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getSupplierAmount() {
        return supplierAmount;
    }

    /**
     * 设置supplierAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setSupplierAmount(BigDecimal value) {
        this.supplierAmount = value;
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
     * 获取decimalPlaces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDecimalPlaces() {
        return decimalPlaces;
    }

    /**
     * 设置decimalPlaces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDecimalPlaces(BigInteger value) {
        this.decimalPlaces = value;
    }

    /**
     * 获取originalAmountBeforeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalAmountBeforeTax() {
        return originalAmountBeforeTax;
    }

    /**
     * 设置originalAmountBeforeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalAmountBeforeTax(Float value) {
        this.originalAmountBeforeTax = value;
    }

    /**
     * 获取originalAmountAfterTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getOriginalAmountAfterTax() {
        return originalAmountAfterTax;
    }

    /**
     * 设置originalAmountAfterTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setOriginalAmountAfterTax(Float value) {
        this.originalAmountAfterTax = value;
    }

    /**
     * 获取originalCurrencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginalCurrencyCode() {
        return originalCurrencyCode;
    }

    /**
     * 设置originalCurrencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginalCurrencyCode(String value) {
        this.originalCurrencyCode = value;
    }

}
