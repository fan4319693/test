//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
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
 * <p>AvailRequestSegmentsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailRequestSegmentsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailRequestSegment" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StayDateRange" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RateRange" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
 *                           &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType" minOccurs="0"/>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *                   &lt;element name="RoomStayCandidates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
 *                                     &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="HotelSearchCriteria" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
 *                           &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="SearchDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                   &lt;element name="HotelSearchCriteriaQueued" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResponseTypeGroup"/>
 *                 &lt;attribute name="AvailReqType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
 *                       &lt;enumeration value="Room"/>
 *                       &lt;enumeration value="NonRoom"/>
 *                       &lt;enumeration value="Both"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="MoreDataEchoToken" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *                 &lt;attribute name="InfoSource" type="{http://www.opentravel.org/OTA/2003/05}InfoSourceType" />
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
@XmlType(name = "AvailRequestSegmentsType", propOrder = {
    "availRequestSegment"
})
public class AvailRequestSegmentsType {

    @XmlElement(name = "AvailRequestSegment", required = true)
    protected List<AvailRequestSegmentsType.AvailRequestSegment> availRequestSegment;

    /**
     * Gets the value of the availRequestSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availRequestSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailRequestSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailRequestSegmentsType.AvailRequestSegment }
     * 
     * 
     */
    public List<AvailRequestSegmentsType.AvailRequestSegment> getAvailRequestSegment() {
        if (availRequestSegment == null) {
            availRequestSegment = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment>();
        }
        return this.availRequestSegment;
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
     *         &lt;element name="StayDateRange" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RateRange" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
     *                 &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="RatePlanCandidates" type="{http://www.opentravel.org/OTA/2003/05}RatePlanCandidatesType" minOccurs="0"/>
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
     *         &lt;element name="RoomStayCandidates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
     *                           &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="HotelSearchCriteria" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
     *                 &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="SearchDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *         &lt;element name="HotelSearchCriteriaQueued" type="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResponseTypeGroup"/>
     *       &lt;attribute name="AvailReqType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to16">
     *             &lt;enumeration value="Room"/>
     *             &lt;enumeration value="NonRoom"/>
     *             &lt;enumeration value="Both"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="MoreDataEchoToken" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
     *       &lt;attribute name="InfoSource" type="{http://www.opentravel.org/OTA/2003/05}InfoSourceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "stayDateRange",
        "rateRange",
        "ratePlanCandidates",
        "profiles",
        "roomStayCandidates",
        "hotelSearchCriteria",
        "tpaExtensions",
        "hotelSearchCriteriaQueued"
    })
    public static class AvailRequestSegment {

        @XmlElement(name = "StayDateRange")
        protected List<AvailRequestSegmentsType.AvailRequestSegment.StayDateRange> stayDateRange;
        @XmlElement(name = "RateRange")
        protected List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> rateRange;
        @XmlElement(name = "RatePlanCandidates")
        protected RatePlanCandidatesType ratePlanCandidates;
        @XmlElement(name = "Profiles")
        protected ProfilesType profiles;
        @XmlElement(name = "RoomStayCandidates")
        protected AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates roomStayCandidates;
        @XmlElement(name = "HotelSearchCriteria")
        protected AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria hotelSearchCriteria;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlElement(name = "HotelSearchCriteriaQueued")
        protected HotelSearchCriteriaType hotelSearchCriteriaQueued;
        @XmlAttribute(name = "AvailReqType")
        protected String availReqType;
        @XmlAttribute(name = "MoreDataEchoToken")
        protected String moreDataEchoToken;
        @XmlAttribute(name = "InfoSource")
        protected String infoSource;
        @XmlAttribute(name = "ResponseType")
        protected String responseType;

        /**
         * Gets the value of the stayDateRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the stayDateRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getStayDateRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailRequestSegmentsType.AvailRequestSegment.StayDateRange }
         * 
         * 
         */
        public List<AvailRequestSegmentsType.AvailRequestSegment.StayDateRange> getStayDateRange() {
            if (stayDateRange == null) {
                stayDateRange = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.StayDateRange>();
            }
            return this.stayDateRange;
        }

        /**
         * Gets the value of the rateRange property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the rateRange property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRateRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AvailRequestSegmentsType.AvailRequestSegment.RateRange }
         * 
         * 
         */
        public List<AvailRequestSegmentsType.AvailRequestSegment.RateRange> getRateRange() {
            if (rateRange == null) {
                rateRange = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RateRange>();
            }
            return this.rateRange;
        }

        /**
         * 获取ratePlanCandidates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePlanCandidatesType }
         *     
         */
        public RatePlanCandidatesType getRatePlanCandidates() {
            return ratePlanCandidates;
        }

        /**
         * 设置ratePlanCandidates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlanCandidatesType }
         *     
         */
        public void setRatePlanCandidates(RatePlanCandidatesType value) {
            this.ratePlanCandidates = value;
        }

        /**
         * 获取profiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProfilesType }
         *     
         */
        public ProfilesType getProfiles() {
            return profiles;
        }

        /**
         * 设置profiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfilesType }
         *     
         */
        public void setProfiles(ProfilesType value) {
            this.profiles = value;
        }

        /**
         * 获取roomStayCandidates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates getRoomStayCandidates() {
            return roomStayCandidates;
        }

        /**
         * 设置roomStayCandidates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates }
         *     
         */
        public void setRoomStayCandidates(AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates value) {
            this.roomStayCandidates = value;
        }

        /**
         * 获取hotelSearchCriteria属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria getHotelSearchCriteria() {
            return hotelSearchCriteria;
        }

        /**
         * 设置hotelSearchCriteria属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria }
         *     
         */
        public void setHotelSearchCriteria(AvailRequestSegmentsType.AvailRequestSegment.HotelSearchCriteria value) {
            this.hotelSearchCriteria = value;
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
         * 获取hotelSearchCriteriaQueued属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelSearchCriteriaType }
         *     
         */
        public HotelSearchCriteriaType getHotelSearchCriteriaQueued() {
            return hotelSearchCriteriaQueued;
        }

        /**
         * 设置hotelSearchCriteriaQueued属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelSearchCriteriaType }
         *     
         */
        public void setHotelSearchCriteriaQueued(HotelSearchCriteriaType value) {
            this.hotelSearchCriteriaQueued = value;
        }

        /**
         * 获取availReqType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAvailReqType() {
            return availReqType;
        }

        /**
         * 设置availReqType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAvailReqType(String value) {
            this.availReqType = value;
        }

        /**
         * 获取moreDataEchoToken属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMoreDataEchoToken() {
            return moreDataEchoToken;
        }

        /**
         * 设置moreDataEchoToken属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMoreDataEchoToken(String value) {
            this.moreDataEchoToken = value;
        }

        /**
         * 获取infoSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInfoSource() {
            return infoSource;
        }

        /**
         * 设置infoSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInfoSource(String value) {
            this.infoSource = value;
        }

        /**
         * 获取responseType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResponseType() {
            if (responseType == null) {
                return "PropertyList";
            } else {
                return responseType;
            }
        }

        /**
         * 设置responseType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResponseType(String value) {
            this.responseType = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelSearchCriteriaType">
         *       &lt;attribute name="Floor" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="RoomTypeCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="SearchDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class HotelSearchCriteria
            extends HotelSearchCriteriaType
        {

            @XmlAttribute(name = "Floor")
            @XmlSchemaType(name = "anySimpleType")
            protected String floor;
            @XmlAttribute(name = "RoomTypeCode")
            @XmlSchemaType(name = "anySimpleType")
            protected String roomTypeCode;
            @XmlAttribute(name = "SearchDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar searchDate;

            /**
             * 获取floor属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFloor() {
                return floor;
            }

            /**
             * 设置floor属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFloor(String value) {
                this.floor = value;
            }

            /**
             * 获取roomTypeCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomTypeCode() {
                return roomTypeCode;
            }

            /**
             * 设置roomTypeCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomTypeCode(String value) {
                this.roomTypeCode = value;
            }

            /**
             * 获取searchDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getSearchDate() {
                return searchDate;
            }

            /**
             * 设置searchDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setSearchDate(XMLGregorianCalendar value) {
                this.searchDate = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
         *       &lt;attribute name="RoomStayCandidateRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class RateRange {

            @XmlAttribute(name = "RoomStayCandidateRPH")
            protected String roomStayCandidateRPH;
            @XmlAttribute(name = "MinRate")
            protected BigDecimal minRate;
            @XmlAttribute(name = "MaxRate")
            protected BigDecimal maxRate;
            @XmlAttribute(name = "FixedRate")
            protected BigDecimal fixedRate;
            @XmlAttribute(name = "RateTimeUnit")
            protected String rateTimeUnit;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * 获取roomStayCandidateRPH属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomStayCandidateRPH() {
                return roomStayCandidateRPH;
            }

            /**
             * 设置roomStayCandidateRPH属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomStayCandidateRPH(String value) {
                this.roomStayCandidateRPH = value;
            }

            /**
             * 获取minRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMinRate() {
                return minRate;
            }

            /**
             * 设置minRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMinRate(BigDecimal value) {
                this.minRate = value;
            }

            /**
             * 获取maxRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getMaxRate() {
                return maxRate;
            }

            /**
             * 设置maxRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setMaxRate(BigDecimal value) {
                this.maxRate = value;
            }

            /**
             * 获取fixedRate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getFixedRate() {
                return fixedRate;
            }

            /**
             * 设置fixedRate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setFixedRate(BigDecimal value) {
                this.fixedRate = value;
            }

            /**
             * 获取rateTimeUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRateTimeUnit() {
                return rateTimeUnit;
            }

            /**
             * 设置rateTimeUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRateTimeUnit(String value) {
                this.rateTimeUnit = value;
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
         *         &lt;element name="RoomStayCandidate" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
         *                 &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
            "roomStayCandidate"
        })
        public static class RoomStayCandidates {

            @XmlElement(name = "RoomStayCandidate", required = true)
            protected List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> roomStayCandidate;

            /**
             * Gets the value of the roomStayCandidate property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the roomStayCandidate property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoomStayCandidate().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate }
             * 
             * 
             */
            public List<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate> getRoomStayCandidate() {
                if (roomStayCandidate == null) {
                    roomStayCandidate = new ArrayList<AvailRequestSegmentsType.AvailRequestSegment.RoomStayCandidates.RoomStayCandidate>();
                }
                return this.roomStayCandidate;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayCandidateType">
             *       &lt;attribute name="IsAlternate" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class RoomStayCandidate
                extends RoomStayCandidateType
            {

                @XmlAttribute(name = "IsAlternate")
                protected Boolean isAlternate;

                /**
                 * 获取isAlternate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isIsAlternate() {
                    if (isAlternate == null) {
                        return false;
                    } else {
                        return isAlternate;
                    }
                }

                /**
                 * 设置isAlternate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setIsAlternate(Boolean value) {
                    this.isAlternate = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class StayDateRange
            extends DateTimeSpanType
        {


        }

    }

}
