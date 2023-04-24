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
import javax.xml.bind.annotation.XmlSchemaType;
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
 *         &lt;element name="Price" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPriceType">
 *                 &lt;sequence>
 *                   &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Unit" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
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
    protected CarbonOffsetType.Price price;
    @XmlAttribute(name = "Unit")
    protected WeightUnitType unit;
    @XmlAttribute(name = "Amount")
    protected Float amount;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;

    /**
     * 获取price属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CarbonOffsetType.Price }
     *     
     */
    public CarbonOffsetType.Price getPrice() {
        return price;
    }

    /**
     * 设置price属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CarbonOffsetType.Price }
     *     
     */
    public void setPrice(CarbonOffsetType.Price value) {
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

    /**
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPriceType">
     *       &lt;sequence>
     *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyalty"
    })
    public static class Price
        extends AirAncillaryProductPriceType
    {

        @XmlElement(name = "Loyalty")
        protected LoyaltyProductType loyalty;

        /**
         * 获取loyalty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LoyaltyProductType }
         *     
         */
        public LoyaltyProductType getLoyalty() {
            return loyalty;
        }

        /**
         * 设置loyalty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LoyaltyProductType }
         *     
         */
        public void setLoyalty(LoyaltyProductType value) {
            this.loyalty = value;
        }

    }

}
