//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Tax breakdown information.
 * 
 * <p>TaxCollectionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TaxCollectionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Designator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Nature" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="CollectionPoint" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *                   &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="AirportCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Refundable" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *       &lt;attribute name="MustCollect" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TaxCollectionType", propOrder = {
    "designator",
    "nature",
    "description",
    "collectionPoint"
})
public class TaxCollectionType {

    @XmlElement(name = "Designator")
    protected String designator;
    @XmlElement(name = "Nature")
    protected String nature;
    @XmlElement(name = "Description")
    protected String description;
    @XmlElement(name = "CollectionPoint")
    protected List<TaxCollectionType.CollectionPoint> collectionPoint;
    @XmlAttribute(name = "Amount", required = true)
    protected BigInteger amount;
    @XmlAttribute(name = "Refundable")
    protected String refundable;
    @XmlAttribute(name = "MustCollect")
    protected String mustCollect;

    /**
     * 获取designator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDesignator() {
        return designator;
    }

    /**
     * 设置designator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDesignator(String value) {
        this.designator = value;
    }

    /**
     * 获取nature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNature() {
        return nature;
    }

    /**
     * 设置nature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNature(String value) {
        this.nature = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * Gets the value of the collectionPoint property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the collectionPoint property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCollectionPoint().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TaxCollectionType.CollectionPoint }
     * 
     * 
     */
    public List<TaxCollectionType.CollectionPoint> getCollectionPoint() {
        if (collectionPoint == null) {
            collectionPoint = new ArrayList<TaxCollectionType.CollectionPoint>();
        }
        return this.collectionPoint;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

    /**
     * 获取refundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundable() {
        if (refundable == null) {
            return "Y";
        } else {
            return refundable;
        }
    }

    /**
     * 设置refundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundable(String value) {
        this.refundable = value;
    }

    /**
     * 获取mustCollect属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMustCollect() {
        if (mustCollect == null) {
            return "Y";
        } else {
            return mustCollect;
        }
    }

    /**
     * 设置mustCollect属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMustCollect(String value) {
        this.mustCollect = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
     *         &lt;element name="AirportAmount" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="AirportCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "currencyCode",
        "airportAmount",
        "airportCode"
    })
    public static class CollectionPoint {

        @XmlElement(name = "CurrencyCode", required = true)
        protected CurrencyCodeType currencyCode;
        @XmlElement(name = "AirportAmount", required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger airportAmount;
        @XmlElement(name = "AirportCode", required = true)
        protected String airportCode;
        @XmlAttribute(name = "Amount")
        protected BigInteger amount;

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
         * 获取airportAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAirportAmount() {
            return airportAmount;
        }

        /**
         * 设置airportAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAirportAmount(BigInteger value) {
            this.airportAmount = value;
        }

        /**
         * 获取airportCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAirportCode() {
            return airportCode;
        }

        /**
         * 设置airportCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAirportCode(String value) {
            this.airportCode = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAmount(BigInteger value) {
            this.amount = value;
        }

    }

}
