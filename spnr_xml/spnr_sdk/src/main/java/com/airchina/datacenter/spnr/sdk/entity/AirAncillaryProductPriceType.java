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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirAncillaryProductPriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillaryProductPriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Base">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitPrice"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *         &lt;element name="Total">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Saving" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="OrigPrice" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="WeightUnit" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="LoyaltyLevel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DisplayPrevPrice" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirAncillaryProductPriceType", propOrder = {
    "base",
    "priceAdjustments",
    "total",
    "saving",
    "origPrice"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.CarbonOffsetType.Price.class
})
public class AirAncillaryProductPriceType {

    @XmlElement(name = "Base", required = true)
    protected AirAncillaryProductPriceType.Base base;
    @XmlElement(name = "PriceAdjustments")
    protected ExPriceAdjustmentsType priceAdjustments;
    @XmlElement(name = "Total", required = true)
    protected AirAncillaryProductPriceType.Total total;
    @XmlElement(name = "Saving")
    protected CurrencyAmountType saving;
    @XmlElement(name = "OrigPrice")
    protected CurrencyAmountType origPrice;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "WeightUnit")
    protected String weightUnit;
    @XmlAttribute(name = "RBD")
    protected String rbd;
    @XmlAttribute(name = "ExcessFirst")
    protected Integer excessFirst;
    @XmlAttribute(name = "ExcessLast")
    protected Integer excessLast;
    @XmlAttribute(name = "LoyaltyLevel")
    protected String loyaltyLevel;
    @XmlAttribute(name = "DisplayPrevPrice")
    protected Boolean displayPrevPrice;

    /**
     * 获取base属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPriceType.Base }
     *     
     */
    public AirAncillaryProductPriceType.Base getBase() {
        return base;
    }

    /**
     * 设置base属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPriceType.Base }
     *     
     */
    public void setBase(AirAncillaryProductPriceType.Base value) {
        this.base = value;
    }

    /**
     * 获取priceAdjustments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public ExPriceAdjustmentsType getPriceAdjustments() {
        return priceAdjustments;
    }

    /**
     * 设置priceAdjustments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExPriceAdjustmentsType }
     *     
     */
    public void setPriceAdjustments(ExPriceAdjustmentsType value) {
        this.priceAdjustments = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPriceType.Total }
     *     
     */
    public AirAncillaryProductPriceType.Total getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPriceType.Total }
     *     
     */
    public void setTotal(AirAncillaryProductPriceType.Total value) {
        this.total = value;
    }

    /**
     * 获取saving属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getSaving() {
        return saving;
    }

    /**
     * 设置saving属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setSaving(CurrencyAmountType value) {
        this.saving = value;
    }

    /**
     * 获取origPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getOrigPrice() {
        return origPrice;
    }

    /**
     * 设置origPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setOrigPrice(CurrencyAmountType value) {
        this.origPrice = value;
    }

    /**
     * 获取passengerTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * 设置passengerTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * 获取weightUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getWeightUnit() {
        return weightUnit;
    }

    /**
     * 设置weightUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setWeightUnit(String value) {
        this.weightUnit = value;
    }

    /**
     * 获取rbd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRBD() {
        return rbd;
    }

    /**
     * 设置rbd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRBD(String value) {
        this.rbd = value;
    }

    /**
     * 获取excessFirst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessFirst() {
        return excessFirst;
    }

    /**
     * 设置excessFirst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessFirst(Integer value) {
        this.excessFirst = value;
    }

    /**
     * 获取excessLast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getExcessLast() {
        return excessLast;
    }

    /**
     * 设置excessLast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setExcessLast(Integer value) {
        this.excessLast = value;
    }

    /**
     * 获取loyaltyLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    /**
     * 设置loyaltyLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyLevel(String value) {
        this.loyaltyLevel = value;
    }

    /**
     * 获取displayPrevPrice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayPrevPrice() {
        return displayPrevPrice;
    }

    /**
     * 设置displayPrevPrice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayPrevPrice(Boolean value) {
        this.displayPrevPrice = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitPrice"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Base
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "UnitPrice")
        protected Float unitPrice;

        /**
         * 获取unitPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getUnitPrice() {
            return unitPrice;
        }

        /**
         * 设置unitPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setUnitPrice(Float value) {
            this.unitPrice = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="Adjusted" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Total
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "Adjusted")
        protected Float adjusted;

        /**
         * 获取adjusted属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getAdjusted() {
            return adjusted;
        }

        /**
         * 设置adjusted属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setAdjusted(Float value) {
            this.adjusted = value;
        }

    }

}
