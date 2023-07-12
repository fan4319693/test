//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;
import org.w3c.dom.Element;


/**
 * Specifies the origin and destination of the traveler.
 * 			Attributes:
 * 			DirectionInd - A directional indicator that identifies a type of air booking, either one-way, round-trip, or open-jaw with the enumeration of (OneWay | RT | OpenJaw) respectively.
 * 			ActionCode - Indicates the status of the booking, such as OK or Wait-List.
 * 			NumberInParty - Indicates the traveler count.
 * 			 
 * 
 * <p>AirItineraryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirItineraryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginDestinationOptions">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginDestinationOption" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
 *                           &lt;sequence>
 *                             &lt;element name="FormData" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
 *                             &lt;element name="AlternateLocationInfo" type="{http://www.opentravel.org/OTA/2003/05}AlternateLocationInfoType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
 *                           &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="MajorityCarrier" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Openjaw" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="InfantAvailQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="MarketingFlightNum" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PlatingCarriers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence maxOccurs="6">
 *                   &lt;element name="PlatingCarrier">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
 *       &lt;attribute name="DirectionInd" type="{http://www.opentravel.org/OTA/2003/05}AirTripType" />
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MaxPassengerQuantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="WaitlistInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WaitlistConfirmTimeLimit" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ISOCountryOfDeparture" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CachedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AirItineraryType", propOrder = {
    "originDestinationOptions",
    "platingCarriers",
    "tags"
})
public class AirItineraryType {

    @XmlElement(name = "OriginDestinationOptions", required = true)
    protected AirItineraryType.OriginDestinationOptions originDestinationOptions;
    @XmlElement(name = "PlatingCarriers")
    protected AirItineraryType.PlatingCarriers platingCarriers;
    @XmlElement(name = "Tags")
    protected TagsType tags;
    @XmlAttribute(name = "DirectionInd")
    protected AirTripType directionInd;
    @XmlAttribute(name = "Source")
    @XmlSchemaType(name = "anySimpleType")
    protected String source;
    @XmlAttribute(name = "MaxPassengerQuantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger maxPassengerQuantity;
    @XmlAttribute(name = "WaitlistInd")
    protected Boolean waitlistInd;
    @XmlAttribute(name = "WaitlistConfirmTimeLimit")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger waitlistConfirmTimeLimit;
    @XmlAttribute(name = "ISOCountryOfDeparture")
    protected String isoCountryOfDeparture;
    @XmlAttribute(name = "CachedTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cachedTime;
    @XmlAttribute(name = "DocumentationRequired")
    protected String documentationRequired;
    @XmlAttribute(name = "DocReqExclCountries")
    protected List<String> docReqExclCountries;
    @XmlAttribute(name = "DocReqInclCountries")
    protected List<String> docReqInclCountries;

    /**
     * 获取originDestinationOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public AirItineraryType.OriginDestinationOptions getOriginDestinationOptions() {
        return originDestinationOptions;
    }

    /**
     * 设置originDestinationOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType.OriginDestinationOptions }
     *     
     */
    public void setOriginDestinationOptions(AirItineraryType.OriginDestinationOptions value) {
        this.originDestinationOptions = value;
    }

    /**
     * 获取platingCarriers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirItineraryType.PlatingCarriers }
     *     
     */
    public AirItineraryType.PlatingCarriers getPlatingCarriers() {
        return platingCarriers;
    }

    /**
     * 设置platingCarriers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirItineraryType.PlatingCarriers }
     *     
     */
    public void setPlatingCarriers(AirItineraryType.PlatingCarriers value) {
        this.platingCarriers = value;
    }

    /**
     * 获取tags属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TagsType }
     *     
     */
    public TagsType getTags() {
        return tags;
    }

    /**
     * 设置tags属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TagsType }
     *     
     */
    public void setTags(TagsType value) {
        this.tags = value;
    }

    /**
     * 获取directionInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirTripType }
     *     
     */
    public AirTripType getDirectionInd() {
        return directionInd;
    }

    /**
     * 设置directionInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirTripType }
     *     
     */
    public void setDirectionInd(AirTripType value) {
        this.directionInd = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

    /**
     * 获取maxPassengerQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPassengerQuantity() {
        return maxPassengerQuantity;
    }

    /**
     * 设置maxPassengerQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPassengerQuantity(BigInteger value) {
        this.maxPassengerQuantity = value;
    }

    /**
     * 获取waitlistInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWaitlistInd() {
        return waitlistInd;
    }

    /**
     * 设置waitlistInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWaitlistInd(Boolean value) {
        this.waitlistInd = value;
    }

    /**
     * 获取waitlistConfirmTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getWaitlistConfirmTimeLimit() {
        return waitlistConfirmTimeLimit;
    }

    /**
     * 设置waitlistConfirmTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setWaitlistConfirmTimeLimit(BigInteger value) {
        this.waitlistConfirmTimeLimit = value;
    }

    /**
     * 获取isoCountryOfDeparture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getISOCountryOfDeparture() {
        return isoCountryOfDeparture;
    }

    /**
     * 设置isoCountryOfDeparture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setISOCountryOfDeparture(String value) {
        this.isoCountryOfDeparture = value;
    }

    /**
     * 获取cachedTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCachedTime() {
        return cachedTime;
    }

    /**
     * 设置cachedTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCachedTime(XMLGregorianCalendar value) {
        this.cachedTime = value;
    }

    /**
     * 获取documentationRequired属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentationRequired() {
        return documentationRequired;
    }

    /**
     * 设置documentationRequired属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentationRequired(String value) {
        this.documentationRequired = value;
    }

    /**
     * Gets the value of the docReqExclCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocReqExclCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocReqExclCountries() {
        if (docReqExclCountries == null) {
            docReqExclCountries = new ArrayList<String>();
        }
        return this.docReqExclCountries;
    }

    /**
     * Gets the value of the docReqInclCountries property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocReqInclCountries().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getDocReqInclCountries() {
        if (docReqInclCountries == null) {
            docReqInclCountries = new ArrayList<String>();
        }
        return this.docReqInclCountries;
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
     *         &lt;element name="OriginDestinationOption" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
     *                 &lt;sequence>
     *                   &lt;element name="FormData" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
     *                   &lt;element name="AlternateLocationInfo" type="{http://www.opentravel.org/OTA/2003/05}AlternateLocationInfoType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
     *                 &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="MajorityCarrier" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Openjaw" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="InfantAvailQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="MarketingFlightNum" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
     *               &lt;/extension>
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
        "originDestinationOption"
    })
    public static class OriginDestinationOptions {

        @XmlElement(name = "OriginDestinationOption", required = true)
        protected List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> originDestinationOption;

        /**
         * Gets the value of the originDestinationOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the originDestinationOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOriginDestinationOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption }
         * 
         * 
         */
        public List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> getOriginDestinationOption() {
            if (originDestinationOption == null) {
                originDestinationOption = new ArrayList<AirItineraryType.OriginDestinationOptions.OriginDestinationOption>();
            }
            return this.originDestinationOption;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OriginDestinationOptionType">
         *       &lt;sequence>
         *         &lt;element name="FormData" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Tags" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
         *         &lt;element name="AlternateLocationInfo" type="{http://www.opentravel.org/OTA/2003/05}AlternateLocationInfoType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ActionAttributes"/>
         *       &lt;attribute name="BookingChannel" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="MajorityCarrier" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Openjaw" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="InfantAvailQuantity" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="MarketingFlightNum" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "formData",
            "tags",
            "alternateLocationInfo"
        })
        public static class OriginDestinationOption
            extends OriginDestinationOptionType
        {

            @XmlElement(name = "FormData")
            protected AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData formData;
            @XmlElement(name = "Tags")
            protected TagsType tags;
            @XmlElement(name = "AlternateLocationInfo")
            protected AlternateLocationInfoType alternateLocationInfo;
            @XmlAttribute(name = "BookingChannel")
            protected String bookingChannel;
            @XmlAttribute(name = "MajorityCarrier")
            @XmlSchemaType(name = "anySimpleType")
            protected String majorityCarrier;
            @XmlAttribute(name = "Openjaw")
            @XmlSchemaType(name = "anySimpleType")
            protected String openjaw;
            @XmlAttribute(name = "Duration")
            protected String duration;
            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "InfantAvailQuantity")
            protected Integer infantAvailQuantity;
            @XmlAttribute(name = "MarketingFlightNum")
            protected String marketingFlightNum;
            @XmlAttribute(name = "Action")
            protected ActionCodeType action;

            /**
             * 获取formData属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData }
             *     
             */
            public AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData getFormData() {
                return formData;
            }

            /**
             * 设置formData属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData }
             *     
             */
            public void setFormData(AirItineraryType.OriginDestinationOptions.OriginDestinationOption.FormData value) {
                this.formData = value;
            }

            /**
             * 获取tags属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TagsType }
             *     
             */
            public TagsType getTags() {
                return tags;
            }

            /**
             * 设置tags属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TagsType }
             *     
             */
            public void setTags(TagsType value) {
                this.tags = value;
            }

            /**
             * 获取alternateLocationInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AlternateLocationInfoType }
             *     
             */
            public AlternateLocationInfoType getAlternateLocationInfo() {
                return alternateLocationInfo;
            }

            /**
             * 设置alternateLocationInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AlternateLocationInfoType }
             *     
             */
            public void setAlternateLocationInfo(AlternateLocationInfoType value) {
                this.alternateLocationInfo = value;
            }

            /**
             * 获取bookingChannel属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBookingChannel() {
                return bookingChannel;
            }

            /**
             * 设置bookingChannel属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBookingChannel(String value) {
                this.bookingChannel = value;
            }

            /**
             * 获取majorityCarrier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMajorityCarrier() {
                return majorityCarrier;
            }

            /**
             * 设置majorityCarrier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMajorityCarrier(String value) {
                this.majorityCarrier = value;
            }

            /**
             * 获取openjaw属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOpenjaw() {
                return openjaw;
            }

            /**
             * 设置openjaw属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOpenjaw(String value) {
                this.openjaw = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDuration(String value) {
                this.duration = value;
            }

            /**
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * 获取infantAvailQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getInfantAvailQuantity() {
                return infantAvailQuantity;
            }

            /**
             * 设置infantAvailQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setInfantAvailQuantity(Integer value) {
                this.infantAvailQuantity = value;
            }

            /**
             * 获取marketingFlightNum属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMarketingFlightNum() {
                return marketingFlightNum;
            }

            /**
             * 设置marketingFlightNum属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMarketingFlightNum(String value) {
                this.marketingFlightNum = value;
            }

            /**
             * 获取action属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ActionCodeType }
             *     
             */
            public ActionCodeType getAction() {
                return action;
            }

            /**
             * 设置action属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ActionCodeType }
             *     
             */
            public void setAction(ActionCodeType value) {
                this.action = value;
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
             *         &lt;any processContents='lax' maxOccurs="unbounded" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "any"
            })
            public static class FormData {

                @XmlAnyElement(lax = true)
                protected List<Object> any;
                @XmlAttribute(name = "index")
                @XmlSchemaType(name = "anySimpleType")
                protected String index;

                /**
                 * Gets the value of the any property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the any property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAny().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link Element }
                 * {@link Object }
                 * 
                 * 
                 */
                public List<Object> getAny() {
                    if (any == null) {
                        any = new ArrayList<Object>();
                    }
                    return this.any;
                }

                /**
                 * 获取index属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getIndex() {
                    return index;
                }

                /**
                 * 设置index属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setIndex(String value) {
                    this.index = value;
                }

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
     *       &lt;sequence maxOccurs="6">
     *         &lt;element name="PlatingCarrier">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "platingCarrier"
    })
    public static class PlatingCarriers {

        @XmlElement(name = "PlatingCarrier", required = true)
        protected List<AirItineraryType.PlatingCarriers.PlatingCarrier> platingCarrier;

        /**
         * Gets the value of the platingCarrier property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the platingCarrier property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPlatingCarrier().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirItineraryType.PlatingCarriers.PlatingCarrier }
         * 
         * 
         */
        public List<AirItineraryType.PlatingCarriers.PlatingCarrier> getPlatingCarrier() {
            if (platingCarrier == null) {
                platingCarrier = new ArrayList<AirItineraryType.PlatingCarriers.PlatingCarrier>();
            }
            return this.platingCarrier;
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
         *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PlatingCarrier {

            @XmlAttribute(name = "Code", required = true)
            protected String code;
            @XmlAttribute(name = "Type")
            @XmlSchemaType(name = "anySimpleType")
            protected String type;
            @XmlAttribute(name = "RPH")
            protected String rph;

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
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

        }

    }

}
