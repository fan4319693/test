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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Priced ancillary offer information.
 * 
 * <p>AirPricedOfferType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirPricedOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Restriction" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="TripMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TripMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TravelerMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="TravelerMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="BundleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="BundleID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MandatoryInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AcceptInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TripInsuranceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirPricedOfferType", propOrder = {
    "shortDescription",
    "restriction",
    "tpaExtensions"
})
public class AirPricedOfferType {

    @XmlElement(name = "ShortDescription")
    protected List<FormattedTextTextType> shortDescription;
    @XmlElement(name = "Restriction")
    protected List<AirPricedOfferType.Restriction> restriction;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "BundleInd")
    protected Boolean bundleInd;
    @XmlAttribute(name = "BundleID")
    protected String bundleID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "MandatoryInd")
    protected Boolean mandatoryInd;
    @XmlAttribute(name = "AcceptInd")
    protected Boolean acceptInd;
    @XmlAttribute(name = "TripInsuranceInd")
    protected Boolean tripInsuranceInd;

    /**
     * Gets the value of the shortDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the shortDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getShortDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextTextType }
     * 
     * 
     */
    public List<FormattedTextTextType> getShortDescription() {
        if (shortDescription == null) {
            shortDescription = new ArrayList<FormattedTextTextType>();
        }
        return this.shortDescription;
    }

    /**
     * Gets the value of the restriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirPricedOfferType.Restriction }
     * 
     * 
     */
    public List<AirPricedOfferType.Restriction> getRestriction() {
        if (restriction == null) {
            restriction = new ArrayList<AirPricedOfferType.Restriction>();
        }
        return this.restriction;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
    }

    /**
     * 获取bundleInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBundleInd() {
        return bundleInd;
    }

    /**
     * 设置bundleInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBundleInd(Boolean value) {
        this.bundleInd = value;
    }

    /**
     * 获取bundleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBundleID() {
        return bundleID;
    }

    /**
     * 设置bundleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBundleID(String value) {
        this.bundleID = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取mandatoryInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isMandatoryInd() {
        return mandatoryInd;
    }

    /**
     * 设置mandatoryInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setMandatoryInd(Boolean value) {
        this.mandatoryInd = value;
    }

    /**
     * 获取acceptInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAcceptInd() {
        return acceptInd;
    }

    /**
     * 设置acceptInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAcceptInd(Boolean value) {
        this.acceptInd = value;
    }

    /**
     * 获取tripInsuranceInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTripInsuranceInd() {
        return tripInsuranceInd;
    }

    /**
     * 设置tripInsuranceInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTripInsuranceInd(Boolean value) {
        this.tripInsuranceInd = value;
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
     *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="TripMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TripMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TravelerMinOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="TravelerMaxOfferQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="EffectiveDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="ExpireDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Restriction {

        @XmlElement(name = "Description")
        protected String description;
        @XmlAttribute(name = "TripMinOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tripMinOfferQty;
        @XmlAttribute(name = "TripMaxOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger tripMaxOfferQty;
        @XmlAttribute(name = "TravelerMinOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger travelerMinOfferQty;
        @XmlAttribute(name = "TravelerMaxOfferQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger travelerMaxOfferQty;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;
        @XmlAttribute(name = "Code")
        protected String code;

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
         * 获取tripMinOfferQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTripMinOfferQty() {
            return tripMinOfferQty;
        }

        /**
         * 设置tripMinOfferQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTripMinOfferQty(BigInteger value) {
            this.tripMinOfferQty = value;
        }

        /**
         * 获取tripMaxOfferQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTripMaxOfferQty() {
            return tripMaxOfferQty;
        }

        /**
         * 设置tripMaxOfferQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTripMaxOfferQty(BigInteger value) {
            this.tripMaxOfferQty = value;
        }

        /**
         * 获取travelerMinOfferQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTravelerMinOfferQty() {
            return travelerMinOfferQty;
        }

        /**
         * 设置travelerMinOfferQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTravelerMinOfferQty(BigInteger value) {
            this.travelerMinOfferQty = value;
        }

        /**
         * 获取travelerMaxOfferQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getTravelerMaxOfferQty() {
            return travelerMaxOfferQty;
        }

        /**
         * 设置travelerMaxOfferQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setTravelerMaxOfferQty(BigInteger value) {
            this.travelerMaxOfferQty = value;
        }

        /**
         * 获取effectiveDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * 设置effectiveDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * 获取expireDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * 设置expireDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
