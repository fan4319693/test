//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
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
 * Itinerary with pricing information.
 * 
 * <p>PricedItineraryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PricedItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirItinerary" type="{http://www.opentravel.org/OTA/2003/05}AirItineraryType" minOccurs="0"/>
 *         &lt;element name="AirItineraryPricingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirItineraryPricingInfoGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Notes" maxOccurs="30" minOccurs="0">
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
 *         &lt;element name="TicketingInfo" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SequenceNumber" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricedItineraryType", propOrder = {
    "airItinerary",
    "airItineraryPricingInfo",
    "notes",
    "ticketingInfo"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SearchResponse.Package.Flights.PricedItinerary.class,
    PricedItineraryExtendType.class
})
public class PricedItineraryType {

    @XmlElement(name = "AirItinerary")
    protected AirItineraryType airItinerary;
    @XmlElement(name = "AirItineraryPricingInfo")
    protected List<PricedItineraryType.AirItineraryPricingInfo> airItineraryPricingInfo;
    @XmlElement(name = "Notes")
    protected List<PricedItineraryType.Notes> notes;
    @XmlElement(name = "TicketingInfo")
    protected TicketingInfoType ticketingInfo;
    @XmlAttribute(name = "SequenceNumber")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger sequenceNumber;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;

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
     * {@link PricedItineraryType.AirItineraryPricingInfo }
     * 
     * 
     */
    public List<PricedItineraryType.AirItineraryPricingInfo> getAirItineraryPricingInfo() {
        if (airItineraryPricingInfo == null) {
            airItineraryPricingInfo = new ArrayList<PricedItineraryType.AirItineraryPricingInfo>();
        }
        return this.airItineraryPricingInfo;
    }

    /**
     * Gets the value of the notes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the notes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNotes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItineraryType.Notes }
     * 
     * 
     */
    public List<PricedItineraryType.Notes> getNotes() {
        if (notes == null) {
            notes = new ArrayList<PricedItineraryType.Notes>();
        }
        return this.notes;
    }

    /**
     * 获取ticketingInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TicketingInfoType }
     *     
     */
    public TicketingInfoType getTicketingInfo() {
        return ticketingInfo;
    }

    /**
     * 设置ticketingInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TicketingInfoType }
     *     
     */
    public void setTicketingInfo(TicketingInfoType value) {
        this.ticketingInfo = value;
    }

    /**
     * 获取sequenceNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSequenceNumber() {
        return sequenceNumber;
    }

    /**
     * 设置sequenceNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSequenceNumber(BigInteger value) {
        this.sequenceNumber = value;
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
    public static class Notes {

        @XmlElement(name = "Note")
        protected List<PricedItineraryType.Notes.Note> note;
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
         * {@link PricedItineraryType.Notes.Note }
         * 
         * 
         */
        public List<PricedItineraryType.Notes.Note> getNote() {
            if (note == null) {
                note = new ArrayList<PricedItineraryType.Notes.Note>();
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
