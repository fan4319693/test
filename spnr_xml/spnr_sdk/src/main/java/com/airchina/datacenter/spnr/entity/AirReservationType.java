//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 *  Contains all booking response information pertaining to a completed reservation.
 * 
 * <p>AirReservationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirReservationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="PriceInfo" type="{http://www.opentravel.org/OTA/2003/05}BookingPriceInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *           &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoGroup"/>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="TravelerInfo" type="{http://www.opentravel.org/OTA/2003/05}AirReservationTravelerInfo" minOccurs="0"/>
 *         &lt;element name="Fulfillment" type="{http://www.opentravel.org/OTA/2003/05}FulfillmentType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingFullInfo_Type" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="999" minOccurs="0"/>
 *         &lt;element name="Combo" type="{http://www.opentravel.org/OTA/2003/05}ComboType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Queues" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Queue" maxOccurs="10">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
 *                           &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                           &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingReferenceID" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="CancelDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplierNotes" maxOccurs="30" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceArrangerInfo" type="{http://www.opentravel.org/OTA/2003/05}AirArrangerType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastModified" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirReservationType", propOrder = {
    "airItinerary",
    "priceInfo",
    "airItineraryPricingInfo",
    "travelerInfo",
    "fulfillment",
    "ticketing",
    "emdInfo",
    "combo",
    "queues",
    "bookingReferenceID",
    "supplierNotes",
    "priceArrangerInfo"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.ProductBase.Air.class
})
public class AirReservationType {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "PriceInfo")
    protected List<BookingPriceInfoType> priceInfo;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected List<AirReservationType.AirItineraryPricingInfo> airItineraryPricingInfo;
    @XmlElement(name = "TravelerInfo")
    protected AirReservationTravelerInfo travelerInfo;
    @XmlElement(name = "Fulfillment")
    protected FulfillmentType fulfillment;
    @XmlElement(name = "Ticketing")
    protected List<TicketingFullInfoType> ticketing;
    @XmlElement(name = "EMD_Info")
    protected List<EMDType> emdInfo;
    @XmlElement(name = "Combo")
    protected List<ComboType> combo;
    @XmlElement(name = "Queues")
    protected AirReservationType.Queues queues;
    @XmlElement(name = "BookingReferenceID")
    protected List<AirReservationType.BookingReferenceID> bookingReferenceID;
    @XmlElement(name = "SupplierNotes")
    protected List<AirReservationType.SupplierNotes> supplierNotes;
    @XmlElement(name = "PriceArrangerInfo")
    protected AirArrangerType priceArrangerInfo;
    @XmlAttribute(name = "LastModified")
    protected String lastModified;
    @XmlAttribute(name = "BookingReferenceID")
    protected String bookingReferenceIDAttr;

    /**
     * 获取airItinerary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType }
     *     
     */
    public AirItineraryType getAirItinerary() {
        return airItinerary;
    }

    /**
     * 设置airItinerary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType }
     *     
     */
    public void setAirItinerary(AirItineraryType value) {
        this.airItinerary = value;
    }

    /**
     * Gets the value of the priceInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPriceInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookingPriceInfoType }
     * 
     * 
     */
    public List<BookingPriceInfoType> getPriceInfo() {
        if (priceInfo == null) {
            priceInfo = new ArrayList<BookingPriceInfoType>();
        }
        return this.priceInfo;
    }

    /**
     * Gets the value of the airItineraryPricingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the airItineraryPricingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAirItineraryPricingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservationType.AirItineraryPricingInfo }
     * 
     * 
     */
    public List<AirReservationType.AirItineraryPricingInfo> getAirItineraryPricingInfo() {
        if (airItineraryPricingInfo == null) {
            airItineraryPricingInfo = new ArrayList<AirReservationType.AirItineraryPricingInfo>();
        }
        return this.airItineraryPricingInfo;
    }

    /**
     * 获取travelerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirReservationTravelerInfo }
     *     
     */
    public AirReservationTravelerInfo getTravelerInfo() {
        return travelerInfo;
    }

    /**
     * 设置travelerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationTravelerInfo }
     *     
     */
    public void setTravelerInfo(AirReservationTravelerInfo value) {
        this.travelerInfo = value;
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
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFullInfoType }
     * 
     * 
     */
    public List<TicketingFullInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingFullInfoType>();
        }
        return this.ticketing;
    }

    /**
     * Gets the value of the emdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType }
     * 
     * 
     */
    public List<EMDType> getEMDInfo() {
        if (emdInfo == null) {
            emdInfo = new ArrayList<EMDType>();
        }
        return this.emdInfo;
    }

    /**
     * Gets the value of the combo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the combo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCombo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComboType }
     * 
     * 
     */
    public List<ComboType> getCombo() {
        if (combo == null) {
            combo = new ArrayList<ComboType>();
        }
        return this.combo;
    }

    /**
     * 获取queues属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirReservationType.Queues }
     *     
     */
    public AirReservationType.Queues getQueues() {
        return queues;
    }

    /**
     * 设置queues属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirReservationType.Queues }
     *     
     */
    public void setQueues(AirReservationType.Queues value) {
        this.queues = value;
    }

    /**
     * Gets the value of the bookingReferenceID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bookingReferenceID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBookingReferenceID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservationType.BookingReferenceID }
     * 
     * 
     */
    public List<AirReservationType.BookingReferenceID> getBookingReferenceID() {
        if (bookingReferenceID == null) {
            bookingReferenceID = new ArrayList<AirReservationType.BookingReferenceID>();
        }
        return this.bookingReferenceID;
    }

    /**
     * Gets the value of the supplierNotes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplierNotes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplierNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirReservationType.SupplierNotes }
     * 
     * 
     */
    public List<AirReservationType.SupplierNotes> getSupplierNotes() {
        if (supplierNotes == null) {
            supplierNotes = new ArrayList<AirReservationType.SupplierNotes>();
        }
        return this.supplierNotes;
    }

    /**
     * 获取priceArrangerInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirArrangerType }
     *     
     */
    public AirArrangerType getPriceArrangerInfo() {
        return priceArrangerInfo;
    }

    /**
     * 设置priceArrangerInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirArrangerType }
     *     
     */
    public void setPriceArrangerInfo(AirArrangerType value) {
        this.priceArrangerInfo = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModified(String value) {
        this.lastModified = value;
    }

    /**
     * 获取bookingReferenceIDAttr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReferenceIDAttr() {
        return bookingReferenceIDAttr;
    }

    /**
     * 设置bookingReferenceIDAttr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReferenceIDAttr(String value) {
        this.bookingReferenceIDAttr = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirItineraryPricingInfo
        extends AirItineraryPricingInfoType
    {

        @XmlAttribute(name = "FarefamilyCode")
        protected String farefamilyCode;
        @XmlAttribute(name = "FarefamilyName")
        protected String farefamilyName;
        @XmlAttribute(name = "CellingPrice")
        protected String cellingPrice;
        @XmlAttribute(name = "EstimatedMaxDiscountAmount")
        protected BigDecimal estimatedMaxDiscountAmount;

        /**
         * 获取farefamilyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFarefamilyCode() {
            return farefamilyCode;
        }

        /**
         * 设置farefamilyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFarefamilyCode(String value) {
            this.farefamilyCode = value;
        }

        /**
         * 获取farefamilyName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFarefamilyName() {
            return farefamilyName;
        }

        /**
         * 设置farefamilyName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFarefamilyName(String value) {
            this.farefamilyName = value;
        }

        /**
         * 获取cellingPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCellingPrice() {
            return cellingPrice;
        }

        /**
         * 设置cellingPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCellingPrice(String value) {
            this.cellingPrice = value;
        }

        /**
         * 获取estimatedMaxDiscountAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getEstimatedMaxDiscountAmount() {
            return estimatedMaxDiscountAmount;
        }

        /**
         * 设置estimatedMaxDiscountAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setEstimatedMaxDiscountAmount(BigDecimal value) {
            this.estimatedMaxDiscountAmount = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;attribute name="OriginDestinationRPH" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="CreateDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="CancelDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BookingReferenceID
        extends UniqueIDType
    {

        @XmlAttribute(name = "OriginDestinationRPH")
        @XmlSchemaType(name = "anySimpleType")
        protected String originDestinationRPH;
        @XmlAttribute(name = "CreateDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createDateTime;
        @XmlAttribute(name = "CancelDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cancelDateTime;
        @XmlAttribute(name = "Status")
        protected String status;

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
         * 获取createDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreateDateTime() {
            return createDateTime;
        }

        /**
         * 设置createDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreateDateTime(XMLGregorianCalendar value) {
            this.createDateTime = value;
        }

        /**
         * 获取cancelDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCancelDateTime() {
            return cancelDateTime;
        }

        /**
         * 设置cancelDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCancelDateTime(XMLGregorianCalendar value) {
            this.cancelDateTime = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Queue" maxOccurs="10">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
     *                 &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                 &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "queue"
    })
    public static class Queues {

        @XmlElement(name = "Queue", required = true)
        protected List<AirReservationType.Queues.Queue> queue;

        /**
         * Gets the value of the queue property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the queue property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQueue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.Queues.Queue }
         * 
         * 
         */
        public List<AirReservationType.Queues.Queue> getQueue() {
            if (queue == null) {
                queue = new ArrayList<AirReservationType.Queues.Queue>();
            }
            return this.queue;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueGroup"/>
         *       &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *       &lt;attribute name="CarrierCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Queue {

            @XmlAttribute(name = "DateTime")
            protected String dateTime;
            @XmlAttribute(name = "Text")
            protected String text;
            @XmlAttribute(name = "CarrierCode")
            protected String carrierCode;
            @XmlAttribute(name = "PseudoCityCode")
            protected String pseudoCityCode;
            @XmlAttribute(name = "QueueNumber")
            protected String queueNumber;
            @XmlAttribute(name = "QueueCategory")
            protected String queueCategory;
            @XmlAttribute(name = "SystemCode")
            protected String systemCode;

            /**
             * 获取dateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateTime() {
                return dateTime;
            }

            /**
             * 设置dateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTime(String value) {
                this.dateTime = value;
            }

            /**
             * 获取text属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getText() {
                return text;
            }

            /**
             * 设置text属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setText(String value) {
                this.text = value;
            }

            /**
             * 获取carrierCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCarrierCode() {
                return carrierCode;
            }

            /**
             * 设置carrierCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCarrierCode(String value) {
                this.carrierCode = value;
            }

            /**
             * 获取pseudoCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPseudoCityCode() {
                return pseudoCityCode;
            }

            /**
             * 设置pseudoCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPseudoCityCode(String value) {
                this.pseudoCityCode = value;
            }

            /**
             * 获取queueNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueNumber() {
                return queueNumber;
            }

            /**
             * 设置queueNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueNumber(String value) {
                this.queueNumber = value;
            }

            /**
             * 获取queueCategory属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQueueCategory() {
                return queueCategory;
            }

            /**
             * 设置queueCategory属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQueueCategory(String value) {
                this.queueCategory = value;
            }

            /**
             * 获取systemCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSystemCode() {
                return systemCode;
            }

            /**
             * 设置systemCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSystemCode(String value) {
                this.systemCode = value;
            }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Note" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "note"
    })
    public static class SupplierNotes {

        @XmlElement(name = "Note")
        protected List<AirReservationType.SupplierNotes.Note> note;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;

        /**
         * Gets the value of the note property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the note property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getNote().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirReservationType.SupplierNotes.Note }
         * 
         * 
         */
        public List<AirReservationType.SupplierNotes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<AirReservationType.SupplierNotes.Note>();
            }
            return this.note;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Note
            extends FreeTextType
        {

            @XmlAttribute(name = "Type")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
            }

        }

    }

}
