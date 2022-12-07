//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Details of a destination activity reservation.
 * 
 * <p>DestActivityReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="TravelerCount" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Travelers" type="{http://www.opentravel.org/OTA/2003/05}TravelersType" minOccurs="0"/>
 *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" minOccurs="0"/>
 *         &lt;element name="DestActivityItems" type="{http://www.opentravel.org/OTA/2003/05}DestActivityItemsType"/>
 *         &lt;element name="DestActivityDescriptiveContent" type="{http://www.opentravel.org/OTA/2003/05}DestActivityDescriptiveContentType" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{http://www.opentravel.org/OTA/2003/05}FulfillmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="TotalPriceAfterTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="TotalPriceBeforeTax" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="ResStatus" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityReservationType", propOrder = {
    "uniqueID",
    "travelerCount",
    "travelers",
    "contact",
    "destActivityItems",
    "destActivityDescriptiveContent",
    "fulfillment"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ProductBase.Activity.class
})
public class DestActivityReservationType {

    @XmlElement(name = "UniqueID")
    protected UniqueIDType uniqueID;
    @XmlElement(name = "TravelerCount")
    protected List<DestActivityReservationType.TravelerCount> travelerCount;
    @XmlElement(name = "Travelers")
    protected TravelersType travelers;
    @XmlElement(name = "Contact")
    protected ContactPersonType contact;
    @XmlElement(name = "DestActivityItems", required = true)
    protected DestActivityItemsType destActivityItems;
    @XmlElement(name = "DestActivityDescriptiveContent")
    protected DestActivityDescriptiveContentType destActivityDescriptiveContent;
    @XmlElement(name = "Fulfillment")
    protected FulfillmentType fulfillment;
    @XmlAttribute(name = "TotalPriceAfterTax")
    protected BigDecimal totalPriceAfterTax;
    @XmlAttribute(name = "CurrencyCode")
    protected String currencyCode;
    @XmlAttribute(name = "TotalPriceBeforeTax")
    protected BigDecimal totalPriceBeforeTax;
    @XmlAttribute(name = "ResStatus")
    @XmlSchemaType(name = "anySimpleType")
    protected String resStatus;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * Gets the value of the travelerCount property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerCount property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerCount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestActivityReservationType.TravelerCount }
     * 
     * 
     */
    public List<DestActivityReservationType.TravelerCount> getTravelerCount() {
        if (travelerCount == null) {
            travelerCount = new ArrayList<DestActivityReservationType.TravelerCount>();
        }
        return this.travelerCount;
    }

    /**
     * 获取travelers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelersType }
     *     
     */
    public TravelersType getTravelers() {
        return travelers;
    }

    /**
     * 设置travelers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelersType }
     *     
     */
    public void setTravelers(TravelersType value) {
        this.travelers = value;
    }

    /**
     * 获取contact属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactPersonType }
     *     
     */
    public ContactPersonType getContact() {
        return contact;
    }

    /**
     * 设置contact属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactPersonType }
     *     
     */
    public void setContact(ContactPersonType value) {
        this.contact = value;
    }

    /**
     * 获取destActivityItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityItemsType }
     *     
     */
    public DestActivityItemsType getDestActivityItems() {
        return destActivityItems;
    }

    /**
     * 设置destActivityItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityItemsType }
     *     
     */
    public void setDestActivityItems(DestActivityItemsType value) {
        this.destActivityItems = value;
    }

    /**
     * 获取destActivityDescriptiveContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityDescriptiveContentType }
     *     
     */
    public DestActivityDescriptiveContentType getDestActivityDescriptiveContent() {
        return destActivityDescriptiveContent;
    }

    /**
     * 设置destActivityDescriptiveContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityDescriptiveContentType }
     *     
     */
    public void setDestActivityDescriptiveContent(DestActivityDescriptiveContentType value) {
        this.destActivityDescriptiveContent = value;
    }

    /**
     * 获取fulfillment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FulfillmentType }
     *     
     */
    public FulfillmentType getFulfillment() {
        return fulfillment;
    }

    /**
     * 设置fulfillment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FulfillmentType }
     *     
     */
    public void setFulfillment(FulfillmentType value) {
        this.fulfillment = value;
    }

    /**
     * 获取totalPriceAfterTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPriceAfterTax() {
        return totalPriceAfterTax;
    }

    /**
     * 设置totalPriceAfterTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPriceAfterTax(BigDecimal value) {
        this.totalPriceAfterTax = value;
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
     * 获取totalPriceBeforeTax属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getTotalPriceBeforeTax() {
        return totalPriceBeforeTax;
    }

    /**
     * 设置totalPriceBeforeTax属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setTotalPriceBeforeTax(BigDecimal value) {
        this.totalPriceBeforeTax = value;
    }

    /**
     * 获取resStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResStatus() {
        return resStatus;
    }

    /**
     * 设置resStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResStatus(String value) {
        this.resStatus = value;
    }

    /**
     * 获取originDestinationRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    /**
     * 设置originDestinationRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationRPH(String value) {
        this.originDestinationRPH = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TravelerCountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TravelerCount {

        @XmlAttribute(name = "Age")
        protected Integer age;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "URI")
        @XmlSchemaType(name = "anyURI")
        protected String uri;
        @XmlAttribute(name = "PTCSubType")
        protected String ptcSubType;
        @XmlAttribute(name = "Virtual")
        protected Boolean virtual;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;

        /**
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAge(Integer value) {
            this.age = value;
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

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * 获取uri属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getURI() {
            return uri;
        }

        /**
         * 设置uri属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setURI(String value) {
            this.uri = value;
        }

        /**
         * 获取ptcSubType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTCSubType() {
            return ptcSubType;
        }

        /**
         * 设置ptcSubType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTCSubType(String value) {
            this.ptcSubType = value;
        }

        /**
         * 获取virtual属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVirtual() {
            return virtual;
        }

        /**
         * 设置virtual属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVirtual(Boolean value) {
            this.virtual = value;
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

    }

}
