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
 * The FacilityInfo class that describes the facilities provided at the hotel, including meeting rooms restaurants.
 * 
 * <p>FacilityInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FacilityInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MeetingRooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType">
 *                 &lt;sequence>
 *                   &lt;element name="Codes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Code" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                                       &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                     &lt;attribute name="DiscountsAvailableCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PricingGroups" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PricingGroup" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Periods" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Period" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                         &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                                                         &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                                         &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
 *                                       &lt;element name="TimeSlotRates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="TimeSlotRate" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                         &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                         &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                                         &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Rooms" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
 *                                                             &lt;complexType>
 *                                                               &lt;complexContent>
 *                                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                                   &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                                 &lt;/restriction>
 *                                                               &lt;/complexContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="DayRates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="DayRate" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PeriodRates" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PeriodRate" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="SpecificRoomTimeslotConfigs" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="SpecificRoomTimeslotConfig" maxOccurs="unbounded" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                         &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GuestRooms" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuestRoom" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="TypeRoom" maxOccurs="5" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
 *                                     &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                     &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                                     &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                                     &lt;attribute name="MinNumOfAdults">
 *                                       &lt;simpleType>
 *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *                                           &lt;minInclusive value="1"/>
 *                                         &lt;/restriction>
 *                                       &lt;/simpleType>
 *                                     &lt;/attribute>
 *                                     &lt;attribute name="AdultsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="DayRoom" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="DayRoomArrivalTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="DayRoomDepartureTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Amenities" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element name="Amenity" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *                                                 &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="5" minOccurs="0"/>
 *                                                 &lt;choice>
 *                                                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
 *                                                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                                                 &lt;/choice>
 *                                                 &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                                               &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                               &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                               &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                               &lt;attribute name="AmenityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
 *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AltRoomTypeNames" minOccurs="0"/>
 *                             &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                             &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                           &lt;attribute name="RoomTypeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                           &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Quality" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                           &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Restaurants" type="{http://www.opentravel.org/OTA/2003/05}RestaurantsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="LastUpdated" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FacilityInfoType", propOrder = {
    "meetingRooms",
    "guestRooms",
    "restaurants"
})
public class FacilityInfoType {

    @XmlElement(name = "MeetingRooms")
    protected FacilityInfoType.MeetingRooms meetingRooms;
    @XmlElement(name = "GuestRooms")
    protected FacilityInfoType.GuestRooms guestRooms;
    @XmlElement(name = "Restaurants")
    protected RestaurantsType restaurants;
    @XmlAttribute(name = "LastUpdated")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastUpdated;

    /**
     * 获取meetingRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType.MeetingRooms }
     *     
     */
    public FacilityInfoType.MeetingRooms getMeetingRooms() {
        return meetingRooms;
    }

    /**
     * 设置meetingRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType.MeetingRooms }
     *     
     */
    public void setMeetingRooms(FacilityInfoType.MeetingRooms value) {
        this.meetingRooms = value;
    }

    /**
     * 获取guestRooms属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FacilityInfoType.GuestRooms }
     *     
     */
    public FacilityInfoType.GuestRooms getGuestRooms() {
        return guestRooms;
    }

    /**
     * 设置guestRooms属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FacilityInfoType.GuestRooms }
     *     
     */
    public void setGuestRooms(FacilityInfoType.GuestRooms value) {
        this.guestRooms = value;
    }

    /**
     * 获取restaurants属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantsType }
     *     
     */
    public RestaurantsType getRestaurants() {
        return restaurants;
    }

    /**
     * 设置restaurants属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantsType }
     *     
     */
    public void setRestaurants(RestaurantsType value) {
        this.restaurants = value;
    }

    /**
     * 获取lastUpdated属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastUpdated() {
        return lastUpdated;
    }

    /**
     * 设置lastUpdated属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastUpdated(XMLGregorianCalendar value) {
        this.lastUpdated = value;
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
     *         &lt;element name="GuestRoom" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="TypeRoom" maxOccurs="5" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
     *                           &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                           &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                           &lt;attribute name="MinNumOfAdults">
     *                             &lt;simpleType>
     *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
     *                                 &lt;minInclusive value="1"/>
     *                               &lt;/restriction>
     *                             &lt;/simpleType>
     *                           &lt;/attribute>
     *                           &lt;attribute name="AdultsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="DayRoom" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="DayRoomArrivalTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="DayRoomDepartureTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Amenities" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element name="Amenity" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
     *                                       &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="5" minOccurs="0"/>
     *                                       &lt;choice>
     *                                         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
     *                                         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                                       &lt;/choice>
     *                                       &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                                     &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                     &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                     &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                                     &lt;attribute name="AmenityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
     *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AltRoomTypeNames" minOccurs="0"/>
     *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                   &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *                 &lt;attribute name="RoomTypeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                 &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Quality" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                 &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "guestRoom"
    })
    public static class GuestRooms {

        @XmlElement(name = "GuestRoom", required = true)
        protected List<FacilityInfoType.GuestRooms.GuestRoom> guestRoom;
        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;

        /**
         * Gets the value of the guestRoom property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guestRoom property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuestRoom().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FacilityInfoType.GuestRooms.GuestRoom }
         * 
         * 
         */
        public List<FacilityInfoType.GuestRooms.GuestRoom> getGuestRoom() {
            if (guestRoom == null) {
                guestRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom>();
            }
            return this.guestRoom;
        }

        /**
         * 获取maxOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * 设置maxOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
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
         *         &lt;element name="TypeRoom" maxOccurs="5" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
         *                 &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *                 &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *                 &lt;attribute name="MinNumOfAdults">
         *                   &lt;simpleType>
         *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
         *                       &lt;minInclusive value="1"/>
         *                     &lt;/restriction>
         *                   &lt;/simpleType>
         *                 &lt;/attribute>
         *                 &lt;attribute name="AdultsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="DayRoom" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="DayRoomArrivalTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="DayRoomDepartureTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Amenities" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element name="Amenity" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
         *                             &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="5" minOccurs="0"/>
         *                             &lt;choice>
         *                               &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
         *                               &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *                             &lt;/choice>
         *                             &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *                           &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                           &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                           &lt;attribute name="AmenityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
         *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AltRoomTypeNames" minOccurs="0"/>
         *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *         &lt;element name="ShortDescription" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeListGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
         *       &lt;attribute name="RoomTypeName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *       &lt;attribute name="Composite" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Quality" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *       &lt;attribute name="MaxAdultOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="NonsmokingQuantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="MaxChildOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "typeRoom",
            "dayRoom",
            "amenities",
            "features",
            "multimediaDescriptions",
            "descriptiveText",
            "altRoomTypeNames",
            "description",
            "shortDescription"
        })
        public static class GuestRoom {

            @XmlElement(name = "TypeRoom")
            protected List<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom> typeRoom;
            @XmlElement(name = "DayRoom")
            protected FacilityInfoType.GuestRooms.GuestRoom.DayRoom dayRoom;
            @XmlElement(name = "Amenities")
            protected FacilityInfoType.GuestRooms.GuestRoom.Amenities amenities;
            @XmlElement(name = "Features")
            protected FeaturesType features;
            @XmlElement(name = "MultimediaDescriptions")
            protected MultimediaDescriptionsType multimediaDescriptions;
            @XmlElement(name = "DescriptiveText")
            protected String descriptiveText;
            @XmlElement(name = "AltRoomTypeNames")
            protected AltRoomTypeNames altRoomTypeNames;
            @XmlElement(name = "Description")
            protected MultimediaDescriptionsType description;
            @XmlElement(name = "ShortDescription")
            protected MultimediaDescriptionsType shortDescription;
            @XmlAttribute(name = "RoomTypeName")
            protected String roomTypeName;
            @XmlAttribute(name = "Composite")
            protected Boolean composite;
            @XmlAttribute(name = "Quality")
            protected String quality;
            @XmlAttribute(name = "MaxOccupancy")
            @XmlSchemaType(name = "positiveInteger")
            protected BigInteger maxOccupancy;
            @XmlAttribute(name = "MaxAdultOccupancy")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxAdultOccupancy;
            @XmlAttribute(name = "NonsmokingQuantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger nonsmokingQuantity;
            @XmlAttribute(name = "MaxChildOccupancy")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger maxChildOccupancy;
            @XmlAttribute(name = "Sort")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger sort;
            @XmlAttribute(name = "URI")
            @XmlSchemaType(name = "anyURI")
            protected String uri;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "ID")
            protected String id;

            /**
             * Gets the value of the typeRoom property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the typeRoom property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTypeRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FacilityInfoType.GuestRooms.GuestRoom.TypeRoom }
             * 
             * 
             */
            public List<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom> getTypeRoom() {
                if (typeRoom == null) {
                    typeRoom = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom.TypeRoom>();
                }
                return this.typeRoom;
            }

            /**
             * 获取dayRoom属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FacilityInfoType.GuestRooms.GuestRoom.DayRoom }
             *     
             */
            public FacilityInfoType.GuestRooms.GuestRoom.DayRoom getDayRoom() {
                return dayRoom;
            }

            /**
             * 设置dayRoom属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FacilityInfoType.GuestRooms.GuestRoom.DayRoom }
             *     
             */
            public void setDayRoom(FacilityInfoType.GuestRooms.GuestRoom.DayRoom value) {
                this.dayRoom = value;
            }

            /**
             * 获取amenities属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities }
             *     
             */
            public FacilityInfoType.GuestRooms.GuestRoom.Amenities getAmenities() {
                return amenities;
            }

            /**
             * 设置amenities属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities }
             *     
             */
            public void setAmenities(FacilityInfoType.GuestRooms.GuestRoom.Amenities value) {
                this.amenities = value;
            }

            /**
             * 获取features属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FeaturesType }
             *     
             */
            public FeaturesType getFeatures() {
                return features;
            }

            /**
             * 设置features属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FeaturesType }
             *     
             */
            public void setFeatures(FeaturesType value) {
                this.features = value;
            }

            /**
             * 获取multimediaDescriptions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getMultimediaDescriptions() {
                return multimediaDescriptions;
            }

            /**
             * 设置multimediaDescriptions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                this.multimediaDescriptions = value;
            }

            /**
             * 获取descriptiveText属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescriptiveText() {
                return descriptiveText;
            }

            /**
             * 设置descriptiveText属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescriptiveText(String value) {
                this.descriptiveText = value;
            }

            /**
             * 获取altRoomTypeNames属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AltRoomTypeNames }
             *     
             */
            public AltRoomTypeNames getAltRoomTypeNames() {
                return altRoomTypeNames;
            }

            /**
             * 设置altRoomTypeNames属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AltRoomTypeNames }
             *     
             */
            public void setAltRoomTypeNames(AltRoomTypeNames value) {
                this.altRoomTypeNames = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setDescription(MultimediaDescriptionsType value) {
                this.description = value;
            }

            /**
             * 获取shortDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public MultimediaDescriptionsType getShortDescription() {
                return shortDescription;
            }

            /**
             * 设置shortDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link MultimediaDescriptionsType }
             *     
             */
            public void setShortDescription(MultimediaDescriptionsType value) {
                this.shortDescription = value;
            }

            /**
             * 获取roomTypeName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRoomTypeName() {
                return roomTypeName;
            }

            /**
             * 设置roomTypeName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRoomTypeName(String value) {
                this.roomTypeName = value;
            }

            /**
             * 获取composite属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isComposite() {
                return composite;
            }

            /**
             * 设置composite属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setComposite(Boolean value) {
                this.composite = value;
            }

            /**
             * 获取quality属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getQuality() {
                return quality;
            }

            /**
             * 设置quality属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setQuality(String value) {
                this.quality = value;
            }

            /**
             * 获取maxOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxOccupancy() {
                return maxOccupancy;
            }

            /**
             * 设置maxOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxOccupancy(BigInteger value) {
                this.maxOccupancy = value;
            }

            /**
             * 获取maxAdultOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxAdultOccupancy() {
                return maxAdultOccupancy;
            }

            /**
             * 设置maxAdultOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxAdultOccupancy(BigInteger value) {
                this.maxAdultOccupancy = value;
            }

            /**
             * 获取nonsmokingQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getNonsmokingQuantity() {
                return nonsmokingQuantity;
            }

            /**
             * 设置nonsmokingQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setNonsmokingQuantity(BigInteger value) {
                this.nonsmokingQuantity = value;
            }

            /**
             * 获取maxChildOccupancy属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getMaxChildOccupancy() {
                return maxChildOccupancy;
            }

            /**
             * 设置maxChildOccupancy属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setMaxChildOccupancy(BigInteger value) {
                this.maxChildOccupancy = value;
            }

            /**
             * 获取sort属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getSort() {
                return sort;
            }

            /**
             * 设置sort属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setSort(BigInteger value) {
                this.sort = value;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence minOccurs="0">
             *         &lt;element name="Amenity" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
             *                   &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="5" minOccurs="0"/>
             *                   &lt;choice>
             *                     &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
             *                     &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
             *                   &lt;/choice>
             *                   &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
             *                 &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *                 &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *                 &lt;attribute name="AmenityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
                "amenity"
            })
            public static class Amenities {

                @XmlElement(name = "Amenity")
                protected List<FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity> amenity;

                /**
                 * Gets the value of the amenity property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the amenity property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getAmenity().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity }
                 * 
                 * 
                 */
                public List<FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity> getAmenity() {
                    if (amenity == null) {
                        amenity = new ArrayList<FacilityInfoType.GuestRooms.GuestRoom.Amenities.Amenity>();
                    }
                    return this.amenity;
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
                 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
                 *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfoRootType" maxOccurs="5" minOccurs="0"/>
                 *         &lt;choice>
                 *           &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="5" minOccurs="0"/>
                 *           &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
                 *         &lt;/choice>
                 *         &lt;element name="DescriptiveText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *       &lt;/sequence>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
                 *       &lt;attribute name="RoomAmenityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *       &lt;attribute name="IncludedInRateIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
                 *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *       &lt;attribute name="AmenityCode" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "operationSchedules",
                    "contactInfo",
                    "description",
                    "multimediaDescriptions",
                    "descriptiveText"
                })
                public static class Amenity {

                    @XmlElement(name = "OperationSchedules")
                    protected OperationSchedulesPlusChargeType operationSchedules;
                    @XmlElement(name = "ContactInfo")
                    protected List<ContactInfoRootType> contactInfo;
                    @XmlElement(name = "Description")
                    protected List<MultimediaObjectType> description;
                    @XmlElement(name = "MultimediaDescriptions")
                    protected MultimediaDescriptionsType multimediaDescriptions;
                    @XmlElement(name = "DescriptiveText")
                    protected String descriptiveText;
                    @XmlAttribute(name = "RoomAmenityCode")
                    protected String roomAmenityCode;
                    @XmlAttribute(name = "IncludedInRateIndicator")
                    protected Boolean includedInRateIndicator;
                    @XmlAttribute(name = "ExistsCode")
                    protected String existsCode;
                    @XmlAttribute(name = "AmenityCode", required = true)
                    protected int amenityCode;
                    @XmlAttribute(name = "CodeDetail")
                    protected String codeDetail;
                    @XmlAttribute(name = "Removal")
                    protected Boolean removal;
                    @XmlAttribute(name = "Quantity")
                    @XmlSchemaType(name = "nonNegativeInteger")
                    protected BigInteger quantity;

                    /**
                     * 获取operationSchedules属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link OperationSchedulesPlusChargeType }
                     *     
                     */
                    public OperationSchedulesPlusChargeType getOperationSchedules() {
                        return operationSchedules;
                    }

                    /**
                     * 设置operationSchedules属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link OperationSchedulesPlusChargeType }
                     *     
                     */
                    public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
                        this.operationSchedules = value;
                    }

                    /**
                     * Gets the value of the contactInfo property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getContactInfo().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link ContactInfoRootType }
                     * 
                     * 
                     */
                    public List<ContactInfoRootType> getContactInfo() {
                        if (contactInfo == null) {
                            contactInfo = new ArrayList<ContactInfoRootType>();
                        }
                        return this.contactInfo;
                    }

                    /**
                     * Gets the value of the description property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the description property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDescription().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link MultimediaObjectType }
                     * 
                     * 
                     */
                    public List<MultimediaObjectType> getDescription() {
                        if (description == null) {
                            description = new ArrayList<MultimediaObjectType>();
                        }
                        return this.description;
                    }

                    /**
                     * 获取multimediaDescriptions属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link MultimediaDescriptionsType }
                     *     
                     */
                    public MultimediaDescriptionsType getMultimediaDescriptions() {
                        return multimediaDescriptions;
                    }

                    /**
                     * 设置multimediaDescriptions属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link MultimediaDescriptionsType }
                     *     
                     */
                    public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                        this.multimediaDescriptions = value;
                    }

                    /**
                     * 获取descriptiveText属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getDescriptiveText() {
                        return descriptiveText;
                    }

                    /**
                     * 设置descriptiveText属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setDescriptiveText(String value) {
                        this.descriptiveText = value;
                    }

                    /**
                     * 获取roomAmenityCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRoomAmenityCode() {
                        return roomAmenityCode;
                    }

                    /**
                     * 设置roomAmenityCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRoomAmenityCode(String value) {
                        this.roomAmenityCode = value;
                    }

                    /**
                     * 获取includedInRateIndicator属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public Boolean isIncludedInRateIndicator() {
                        return includedInRateIndicator;
                    }

                    /**
                     * 设置includedInRateIndicator属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setIncludedInRateIndicator(Boolean value) {
                        this.includedInRateIndicator = value;
                    }

                    /**
                     * 获取existsCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getExistsCode() {
                        return existsCode;
                    }

                    /**
                     * 设置existsCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setExistsCode(String value) {
                        this.existsCode = value;
                    }

                    /**
                     * 获取amenityCode属性的值。
                     * 
                     */
                    public int getAmenityCode() {
                        return amenityCode;
                    }

                    /**
                     * 设置amenityCode属性的值。
                     * 
                     */
                    public void setAmenityCode(int value) {
                        this.amenityCode = value;
                    }

                    /**
                     * 获取codeDetail属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCodeDetail() {
                        return codeDetail;
                    }

                    /**
                     * 设置codeDetail属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCodeDetail(String value) {
                        this.codeDetail = value;
                    }

                    /**
                     * 获取removal属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Boolean }
                     *     
                     */
                    public boolean isRemoval() {
                        if (removal == null) {
                            return false;
                        } else {
                            return removal;
                        }
                    }

                    /**
                     * 设置removal属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Boolean }
                     *     
                     */
                    public void setRemoval(Boolean value) {
                        this.removal = value;
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


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;attribute name="DayRoomArrivalTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="DayRoomDepartureTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class DayRoom {

                @XmlAttribute(name = "DayRoomArrivalTime")
                @XmlSchemaType(name = "anySimpleType")
                protected String dayRoomArrivalTime;
                @XmlAttribute(name = "DayRoomDepartureTime")
                @XmlSchemaType(name = "anySimpleType")
                protected String dayRoomDepartureTime;

                /**
                 * 获取dayRoomArrivalTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDayRoomArrivalTime() {
                    return dayRoomArrivalTime;
                }

                /**
                 * 设置dayRoomArrivalTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDayRoomArrivalTime(String value) {
                    this.dayRoomArrivalTime = value;
                }

                /**
                 * 获取dayRoomDepartureTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDayRoomDepartureTime() {
                    return dayRoomDepartureTime;
                }

                /**
                 * 设置dayRoomDepartureTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDayRoomDepartureTime(String value) {
                    this.dayRoomDepartureTime = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RoomGroup"/>
             *       &lt;attribute name="StandardNumBeds" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="MaxRollaways" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="Size" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="TypeImplied" type="{http://www.w3.org/2001/XMLSchema}string" />
             *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="Name" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
             *       &lt;attribute name="MaxCribs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
             *       &lt;attribute name="MinNumOfAdults">
             *         &lt;simpleType>
             *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
             *             &lt;minInclusive value="1"/>
             *           &lt;/restriction>
             *         &lt;/simpleType>
             *       &lt;/attribute>
             *       &lt;attribute name="AdultsOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TypeRoom {

                @XmlAttribute(name = "StandardNumBeds")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger standardNumBeds;
                @XmlAttribute(name = "StandardOccupancy")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger standardOccupancy;
                @XmlAttribute(name = "MaxRollaways")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxRollaways;
                @XmlAttribute(name = "Size")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger size;
                @XmlAttribute(name = "TypeImplied")
                protected String typeImplied;
                @XmlAttribute(name = "Count")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger count;
                @XmlAttribute(name = "Name")
                protected String name;
                @XmlAttribute(name = "MaxCribs")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger maxCribs;
                @XmlAttribute(name = "MinNumOfAdults")
                protected Integer minNumOfAdults;
                @XmlAttribute(name = "AdultsOnly")
                protected Boolean adultsOnly;
                @XmlAttribute(name = "RoomType")
                protected String roomType;
                @XmlAttribute(name = "RoomTypeCode")
                protected String roomTypeCode;
                @XmlAttribute(name = "RoomCategory")
                protected String roomCategory;
                @XmlAttribute(name = "RoomID")
                protected String roomID;
                @XmlAttribute(name = "Floor")
                protected Integer floor;
                @XmlAttribute(name = "InvBlockCode")
                protected String invBlockCode;
                @XmlAttribute(name = "RoomLocationCode")
                protected String roomLocationCode;
                @XmlAttribute(name = "RoomViewCode")
                protected String roomViewCode;
                @XmlAttribute(name = "BedTypeCode")
                protected String bedTypeCode;
                @XmlAttribute(name = "NonSmoking")
                protected Boolean nonSmoking;
                @XmlAttribute(name = "Configuration")
                protected String configuration;
                @XmlAttribute(name = "SizeMeasurement")
                protected String sizeMeasurement;
                @XmlAttribute(name = "Quantity")
                protected Integer quantity;
                @XmlAttribute(name = "Composite")
                protected Boolean composite;
                @XmlAttribute(name = "RoomClassificationCode")
                protected String roomClassificationCode;
                @XmlAttribute(name = "RoomArchitectureCode")
                protected String roomArchitectureCode;
                @XmlAttribute(name = "PromotionCode")
                protected String promotionCode;
                @XmlAttribute(name = "PromotionVendorCode")
                protected List<String> promotionVendorCode;

                /**
                 * 获取standardNumBeds属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getStandardNumBeds() {
                    return standardNumBeds;
                }

                /**
                 * 设置standardNumBeds属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setStandardNumBeds(BigInteger value) {
                    this.standardNumBeds = value;
                }

                /**
                 * 获取standardOccupancy属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getStandardOccupancy() {
                    return standardOccupancy;
                }

                /**
                 * 设置standardOccupancy属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setStandardOccupancy(BigInteger value) {
                    this.standardOccupancy = value;
                }

                /**
                 * 获取maxRollaways属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxRollaways() {
                    return maxRollaways;
                }

                /**
                 * 设置maxRollaways属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxRollaways(BigInteger value) {
                    this.maxRollaways = value;
                }

                /**
                 * 获取size属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSize() {
                    return size;
                }

                /**
                 * 设置size属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSize(BigInteger value) {
                    this.size = value;
                }

                /**
                 * 获取typeImplied属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTypeImplied() {
                    return typeImplied;
                }

                /**
                 * 设置typeImplied属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTypeImplied(String value) {
                    this.typeImplied = value;
                }

                /**
                 * 获取count属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getCount() {
                    return count;
                }

                /**
                 * 设置count属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setCount(BigInteger value) {
                    this.count = value;
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
                 * 获取maxCribs属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getMaxCribs() {
                    return maxCribs;
                }

                /**
                 * 设置maxCribs属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setMaxCribs(BigInteger value) {
                    this.maxCribs = value;
                }

                /**
                 * 获取minNumOfAdults属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getMinNumOfAdults() {
                    return minNumOfAdults;
                }

                /**
                 * 设置minNumOfAdults属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setMinNumOfAdults(Integer value) {
                    this.minNumOfAdults = value;
                }

                /**
                 * 获取adultsOnly属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isAdultsOnly() {
                    return adultsOnly;
                }

                /**
                 * 设置adultsOnly属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setAdultsOnly(Boolean value) {
                    this.adultsOnly = value;
                }

                /**
                 * 获取roomType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomType() {
                    return roomType;
                }

                /**
                 * 设置roomType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomType(String value) {
                    this.roomType = value;
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
                 * 获取roomCategory属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomCategory() {
                    return roomCategory;
                }

                /**
                 * 设置roomCategory属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomCategory(String value) {
                    this.roomCategory = value;
                }

                /**
                 * 获取roomID属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomID() {
                    return roomID;
                }

                /**
                 * 设置roomID属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomID(String value) {
                    this.roomID = value;
                }

                /**
                 * 获取floor属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getFloor() {
                    return floor;
                }

                /**
                 * 设置floor属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setFloor(Integer value) {
                    this.floor = value;
                }

                /**
                 * 获取invBlockCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInvBlockCode() {
                    return invBlockCode;
                }

                /**
                 * 设置invBlockCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInvBlockCode(String value) {
                    this.invBlockCode = value;
                }

                /**
                 * 获取roomLocationCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomLocationCode() {
                    return roomLocationCode;
                }

                /**
                 * 设置roomLocationCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomLocationCode(String value) {
                    this.roomLocationCode = value;
                }

                /**
                 * 获取roomViewCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomViewCode() {
                    return roomViewCode;
                }

                /**
                 * 设置roomViewCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomViewCode(String value) {
                    this.roomViewCode = value;
                }

                /**
                 * 获取bedTypeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getBedTypeCode() {
                    return bedTypeCode;
                }

                /**
                 * 设置bedTypeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setBedTypeCode(String value) {
                    this.bedTypeCode = value;
                }

                /**
                 * 获取nonSmoking属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isNonSmoking() {
                    return nonSmoking;
                }

                /**
                 * 设置nonSmoking属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setNonSmoking(Boolean value) {
                    this.nonSmoking = value;
                }

                /**
                 * 获取configuration属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getConfiguration() {
                    return configuration;
                }

                /**
                 * 设置configuration属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setConfiguration(String value) {
                    this.configuration = value;
                }

                /**
                 * 获取sizeMeasurement属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSizeMeasurement() {
                    return sizeMeasurement;
                }

                /**
                 * 设置sizeMeasurement属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSizeMeasurement(String value) {
                    this.sizeMeasurement = value;
                }

                /**
                 * 获取quantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getQuantity() {
                    return quantity;
                }

                /**
                 * 设置quantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setQuantity(Integer value) {
                    this.quantity = value;
                }

                /**
                 * 获取composite属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isComposite() {
                    return composite;
                }

                /**
                 * 设置composite属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setComposite(Boolean value) {
                    this.composite = value;
                }

                /**
                 * 获取roomClassificationCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomClassificationCode() {
                    return roomClassificationCode;
                }

                /**
                 * 设置roomClassificationCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomClassificationCode(String value) {
                    this.roomClassificationCode = value;
                }

                /**
                 * 获取roomArchitectureCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getRoomArchitectureCode() {
                    return roomArchitectureCode;
                }

                /**
                 * 设置roomArchitectureCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setRoomArchitectureCode(String value) {
                    this.roomArchitectureCode = value;
                }

                /**
                 * 获取promotionCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPromotionCode() {
                    return promotionCode;
                }

                /**
                 * 设置promotionCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPromotionCode(String value) {
                    this.promotionCode = value;
                }

                /**
                 * Gets the value of the promotionVendorCode property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the promotionVendorCode property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getPromotionVendorCode().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link String }
                 * 
                 * 
                 */
                public List<String> getPromotionVendorCode() {
                    if (promotionVendorCode == null) {
                        promotionVendorCode = new ArrayList<String>();
                    }
                    return this.promotionVendorCode;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MeetingRoomsType">
     *       &lt;sequence>
     *         &lt;element name="Codes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Code" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *                             &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                           &lt;attribute name="DiscountsAvailableCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PricingGroups" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PricingGroup" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Periods" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Period" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *                                               &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                                               &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
     *                             &lt;element name="TimeSlotRates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="TimeSlotRate" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                               &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                               &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                                               &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Rooms" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
     *                                                   &lt;complexType>
     *                                                     &lt;complexContent>
     *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                                         &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                                       &lt;/restriction>
     *                                                     &lt;/complexContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="DayRates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="DayRate" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PeriodRates" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PeriodRate" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="SpecificRoomTimeslotConfigs" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="SpecificRoomTimeslotConfig" maxOccurs="unbounded" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                               &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
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
        "codes",
        "pricingGroups"
    })
    public static class MeetingRooms
        extends MeetingRoomsType
    {

        @XmlElement(name = "Codes")
        protected FacilityInfoType.MeetingRooms.Codes codes;
        @XmlElement(name = "PricingGroups")
        protected FacilityInfoType.MeetingRooms.PricingGroups pricingGroups;

        /**
         * 获取codes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FacilityInfoType.MeetingRooms.Codes }
         *     
         */
        public FacilityInfoType.MeetingRooms.Codes getCodes() {
            return codes;
        }

        /**
         * 设置codes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FacilityInfoType.MeetingRooms.Codes }
         *     
         */
        public void setCodes(FacilityInfoType.MeetingRooms.Codes value) {
            this.codes = value;
        }

        /**
         * 获取pricingGroups属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FacilityInfoType.MeetingRooms.PricingGroups }
         *     
         */
        public FacilityInfoType.MeetingRooms.PricingGroups getPricingGroups() {
            return pricingGroups;
        }

        /**
         * 设置pricingGroups属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FacilityInfoType.MeetingRooms.PricingGroups }
         *     
         */
        public void setPricingGroups(FacilityInfoType.MeetingRooms.PricingGroups value) {
            this.pricingGroups = value;
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
         *         &lt;element name="Code" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
         *                   &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *                 &lt;attribute name="DiscountsAvailableCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
            "code"
        })
        public static class Codes {

            @XmlElement(name = "Code", required = true)
            protected List<FacilityInfoType.MeetingRooms.Codes.Code> code;

            /**
             * Gets the value of the code property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the code property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FacilityInfoType.MeetingRooms.Codes.Code }
             * 
             * 
             */
            public List<FacilityInfoType.MeetingRooms.Codes.Code> getCode() {
                if (code == null) {
                    code = new ArrayList<FacilityInfoType.MeetingRooms.Codes.Code>();
                }
                return this.code;
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
             *         &lt;element name="Charge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
             *         &lt;element name="MultimediaDescriptions" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *       &lt;attribute name="DiscountsAvailableCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "charge",
                "multimediaDescriptions"
            })
            public static class Code {

                @XmlElement(name = "Charge")
                protected FeeType charge;
                @XmlElement(name = "MultimediaDescriptions")
                protected MultimediaDescriptionsType multimediaDescriptions;
                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "ExistsCode")
                protected String existsCode;
                @XmlAttribute(name = "DiscountsAvailableCode")
                protected String discountsAvailableCode;
                @XmlAttribute(name = "Quantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger quantity;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;

                /**
                 * 获取charge属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FeeType }
                 *     
                 */
                public FeeType getCharge() {
                    return charge;
                }

                /**
                 * 设置charge属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FeeType }
                 *     
                 */
                public void setCharge(FeeType value) {
                    this.charge = value;
                }

                /**
                 * 获取multimediaDescriptions属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link MultimediaDescriptionsType }
                 *     
                 */
                public MultimediaDescriptionsType getMultimediaDescriptions() {
                    return multimediaDescriptions;
                }

                /**
                 * 设置multimediaDescriptions属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link MultimediaDescriptionsType }
                 *     
                 */
                public void setMultimediaDescriptions(MultimediaDescriptionsType value) {
                    this.multimediaDescriptions = value;
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
                 * 获取existsCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getExistsCode() {
                    return existsCode;
                }

                /**
                 * 设置existsCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setExistsCode(String value) {
                    this.existsCode = value;
                }

                /**
                 * 获取discountsAvailableCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDiscountsAvailableCode() {
                    return discountsAvailableCode;
                }

                /**
                 * 设置discountsAvailableCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDiscountsAvailableCode(String value) {
                    this.discountsAvailableCode = value;
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
                 * 获取codeDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * 设置codeDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
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
         *         &lt;element name="PricingGroup" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Periods" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Period" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *                                     &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                                     &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
         *                   &lt;element name="TimeSlotRates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="TimeSlotRate" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                     &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                     &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                                     &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Rooms" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
         *                                         &lt;complexType>
         *                                           &lt;complexContent>
         *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                               &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                             &lt;/restriction>
         *                                           &lt;/complexContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="DayRates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="DayRate" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PeriodRates" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PeriodRate" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="SpecificRoomTimeslotConfigs" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="SpecificRoomTimeslotConfig" maxOccurs="unbounded" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                     &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
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
            "pricingGroup"
        })
        public static class PricingGroups {

            @XmlElement(name = "PricingGroup")
            protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup> pricingGroup;

            /**
             * Gets the value of the pricingGroup property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the pricingGroup property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPricingGroup().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup }
             * 
             * 
             */
            public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup> getPricingGroup() {
                if (pricingGroup == null) {
                    pricingGroup = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup>();
                }
                return this.pricingGroup;
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
             *         &lt;element name="Periods" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Period" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
             *                           &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                           &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
             *         &lt;element name="TimeSlotRates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="TimeSlotRate" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                           &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                           &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
             *                           &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Rooms" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
             *                               &lt;complexType>
             *                                 &lt;complexContent>
             *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                                   &lt;/restriction>
             *                                 &lt;/complexContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="DayRates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="DayRate" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PeriodRates" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PeriodRate" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="SpecificRoomTimeslotConfigs" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="SpecificRoomTimeslotConfig" maxOccurs="unbounded" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                           &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="CurrencyCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "periods",
                "timeSlots",
                "timeSlotRates",
                "dayRates",
                "periodRates",
                "specificRoomTimeslotConfigs"
            })
            public static class PricingGroup {

                @XmlElement(name = "Periods")
                protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods periods;
                @XmlElement(name = "TimeSlots")
                protected TimeSlots timeSlots;
                @XmlElement(name = "TimeSlotRates")
                protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates timeSlotRates;
                @XmlElement(name = "DayRates")
                protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates dayRates;
                @XmlElement(name = "PeriodRates")
                protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates periodRates;
                @XmlElement(name = "SpecificRoomTimeslotConfigs")
                protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs specificRoomTimeslotConfigs;
                @XmlAttribute(name = "Name", required = true)
                @XmlSchemaType(name = "anySimpleType")
                protected String name;
                @XmlAttribute(name = "ID")
                @XmlSchemaType(name = "anySimpleType")
                protected String id;
                @XmlAttribute(name = "CurrencyCode", required = true)
                protected String currencyCode;

                /**
                 * 获取periods属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods }
                 *     
                 */
                public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods getPeriods() {
                    return periods;
                }

                /**
                 * 设置periods属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods }
                 *     
                 */
                public void setPeriods(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods value) {
                    this.periods = value;
                }

                /**
                 * 获取timeSlots属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link TimeSlots }
                 *     
                 */
                public TimeSlots getTimeSlots() {
                    return timeSlots;
                }

                /**
                 * 设置timeSlots属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link TimeSlots }
                 *     
                 */
                public void setTimeSlots(TimeSlots value) {
                    this.timeSlots = value;
                }

                /**
                 * 获取timeSlotRates属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates }
                 *     
                 */
                public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates getTimeSlotRates() {
                    return timeSlotRates;
                }

                /**
                 * 设置timeSlotRates属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates }
                 *     
                 */
                public void setTimeSlotRates(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates value) {
                    this.timeSlotRates = value;
                }

                /**
                 * 获取dayRates属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates }
                 *     
                 */
                public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates getDayRates() {
                    return dayRates;
                }

                /**
                 * 设置dayRates属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates }
                 *     
                 */
                public void setDayRates(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates value) {
                    this.dayRates = value;
                }

                /**
                 * 获取periodRates属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates }
                 *     
                 */
                public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates getPeriodRates() {
                    return periodRates;
                }

                /**
                 * 设置periodRates属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates }
                 *     
                 */
                public void setPeriodRates(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates value) {
                    this.periodRates = value;
                }

                /**
                 * 获取specificRoomTimeslotConfigs属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs }
                 *     
                 */
                public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs getSpecificRoomTimeslotConfigs() {
                    return specificRoomTimeslotConfigs;
                }

                /**
                 * 设置specificRoomTimeslotConfigs属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs }
                 *     
                 */
                public void setSpecificRoomTimeslotConfigs(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs value) {
                    this.specificRoomTimeslotConfigs = value;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *       &lt;sequence>
                 *         &lt;element name="DayRate" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                    "dayRate"
                })
                public static class DayRates {

                    @XmlElement(name = "DayRate")
                    protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate> dayRate;

                    /**
                     * Gets the value of the dayRate property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the dayRate property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getDayRate().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate }
                     * 
                     * 
                     */
                    public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate> getDayRate() {
                        if (dayRate == null) {
                            dayRate = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.DayRates.DayRate>();
                        }
                        return this.dayRate;
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
                     *       &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class DayRate {

                        @XmlAttribute(name = "RoomCode", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String roomCode;
                        @XmlAttribute(name = "Rate", required = true)
                        protected float rate;

                        /**
                         * 获取roomCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoomCode() {
                            return roomCode;
                        }

                        /**
                         * 设置roomCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoomCode(String value) {
                            this.roomCode = value;
                        }

                        /**
                         * 获取rate属性的值。
                         * 
                         */
                        public float getRate() {
                            return rate;
                        }

                        /**
                         * 设置rate属性的值。
                         * 
                         */
                        public void setRate(float value) {
                            this.rate = value;
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
                 *         &lt;element name="PeriodRate" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
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
                    "periodRate"
                })
                public static class PeriodRates {

                    @XmlElement(name = "PeriodRate")
                    protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate> periodRate;

                    /**
                     * Gets the value of the periodRate property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the periodRate property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPeriodRate().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate }
                     * 
                     * 
                     */
                    public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate> getPeriodRate() {
                        if (periodRate == null) {
                            periodRate = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.PeriodRates.PeriodRate>();
                        }
                        return this.periodRate;
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
                     *       &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class PeriodRate {

                        @XmlAttribute(name = "RoomCode", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String roomCode;
                        @XmlAttribute(name = "Rate", required = true)
                        protected float rate;

                        /**
                         * 获取roomCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoomCode() {
                            return roomCode;
                        }

                        /**
                         * 设置roomCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoomCode(String value) {
                            this.roomCode = value;
                        }

                        /**
                         * 获取rate属性的值。
                         * 
                         */
                        public float getRate() {
                            return rate;
                        }

                        /**
                         * 设置rate属性的值。
                         * 
                         */
                        public void setRate(float value) {
                            this.rate = value;
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
                 *         &lt;element name="Period" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                 *                 &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                 *                 &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
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
                    "period"
                })
                public static class Periods {

                    @XmlElement(name = "Period")
                    protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period> period;

                    /**
                     * Gets the value of the period property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the period property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getPeriod().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period }
                     * 
                     * 
                     */
                    public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period> getPeriod() {
                        if (period == null) {
                            period = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.Periods.Period>();
                        }
                        return this.period;
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
                     *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
                     *       &lt;attribute name="Reconfigurable" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                     *       &lt;attribute name="Locked" type="{http://www.w3.org/2001/XMLSchema}boolean" default="false" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class Period {

                        @XmlAttribute(name = "ID")
                        protected Integer id;
                        @XmlAttribute(name = "From", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar from;
                        @XmlAttribute(name = "To", required = true)
                        @XmlSchemaType(name = "dateTime")
                        protected XMLGregorianCalendar to;
                        @XmlAttribute(name = "Reconfigurable")
                        protected Boolean reconfigurable;
                        @XmlAttribute(name = "Locked")
                        protected Boolean locked;

                        /**
                         * 获取id属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getID() {
                            return id;
                        }

                        /**
                         * 设置id属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setID(Integer value) {
                            this.id = value;
                        }

                        /**
                         * 获取from属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getFrom() {
                            return from;
                        }

                        /**
                         * 设置from属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setFrom(XMLGregorianCalendar value) {
                            this.from = value;
                        }

                        /**
                         * 获取to属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getTo() {
                            return to;
                        }

                        /**
                         * 设置to属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setTo(XMLGregorianCalendar value) {
                            this.to = value;
                        }

                        /**
                         * 获取reconfigurable属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public boolean isReconfigurable() {
                            if (reconfigurable == null) {
                                return false;
                            } else {
                                return reconfigurable;
                            }
                        }

                        /**
                         * 设置reconfigurable属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setReconfigurable(Boolean value) {
                            this.reconfigurable = value;
                        }

                        /**
                         * 获取locked属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Boolean }
                         *     
                         */
                        public boolean isLocked() {
                            if (locked == null) {
                                return false;
                            } else {
                                return locked;
                            }
                        }

                        /**
                         * 设置locked属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Boolean }
                         *     
                         */
                        public void setLocked(Boolean value) {
                            this.locked = value;
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
                 *         &lt;element name="SpecificRoomTimeslotConfig" maxOccurs="unbounded" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                    "specificRoomTimeslotConfig"
                })
                public static class SpecificRoomTimeslotConfigs {

                    @XmlElement(name = "SpecificRoomTimeslotConfig")
                    protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig> specificRoomTimeslotConfig;

                    /**
                     * Gets the value of the specificRoomTimeslotConfig property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the specificRoomTimeslotConfig property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getSpecificRoomTimeslotConfig().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig }
                     * 
                     * 
                     */
                    public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig> getSpecificRoomTimeslotConfig() {
                        if (specificRoomTimeslotConfig == null) {
                            specificRoomTimeslotConfig = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.SpecificRoomTimeslotConfigs.SpecificRoomTimeslotConfig>();
                        }
                        return this.specificRoomTimeslotConfig;
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
                     *         &lt;element name="TimeSlots" type="{http://www.opentravel.org/OTA/2003/05}TimeSlots" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="RoomCode" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="Rate" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="RatePerPerson" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "timeSlots"
                    })
                    public static class SpecificRoomTimeslotConfig {

                        @XmlElement(name = "TimeSlots")
                        protected TimeSlots timeSlots;
                        @XmlAttribute(name = "RoomCode", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String roomCode;
                        @XmlAttribute(name = "Rate", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String rate;
                        @XmlAttribute(name = "RatePerPerson")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String ratePerPerson;
                        @XmlAttribute(name = "ExtraHourRate")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String extraHourRate;

                        /**
                         * 获取timeSlots属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TimeSlots }
                         *     
                         */
                        public TimeSlots getTimeSlots() {
                            return timeSlots;
                        }

                        /**
                         * 设置timeSlots属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TimeSlots }
                         *     
                         */
                        public void setTimeSlots(TimeSlots value) {
                            this.timeSlots = value;
                        }

                        /**
                         * 获取roomCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRoomCode() {
                            return roomCode;
                        }

                        /**
                         * 设置roomCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRoomCode(String value) {
                            this.roomCode = value;
                        }

                        /**
                         * 获取rate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRate() {
                            return rate;
                        }

                        /**
                         * 设置rate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRate(String value) {
                            this.rate = value;
                        }

                        /**
                         * 获取ratePerPerson属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getRatePerPerson() {
                            return ratePerPerson;
                        }

                        /**
                         * 设置ratePerPerson属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setRatePerPerson(String value) {
                            this.ratePerPerson = value;
                        }

                        /**
                         * 获取extraHourRate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getExtraHourRate() {
                            return extraHourRate;
                        }

                        /**
                         * 设置extraHourRate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setExtraHourRate(String value) {
                            this.extraHourRate = value;
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
                 *         &lt;element name="TimeSlotRate" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                 &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                 &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *                 &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
                 *                 &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Rooms" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
                 *                     &lt;complexType>
                 *                       &lt;complexContent>
                 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *                         &lt;/restriction>
                 *                       &lt;/complexContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
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
                    "timeSlotRate",
                    "rooms"
                })
                public static class TimeSlotRates {

                    @XmlElement(name = "TimeSlotRate")
                    protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate timeSlotRate;
                    @XmlElement(name = "Rooms")
                    protected FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms rooms;

                    /**
                     * 获取timeSlotRate属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate }
                     *     
                     */
                    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate getTimeSlotRate() {
                        return timeSlotRate;
                    }

                    /**
                     * 设置timeSlotRate属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate }
                     *     
                     */
                    public void setTimeSlotRate(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.TimeSlotRate value) {
                        this.timeSlotRate = value;
                    }

                    /**
                     * 获取rooms属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms }
                     *     
                     */
                    public FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms getRooms() {
                        return rooms;
                    }

                    /**
                     * 设置rooms属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms }
                     *     
                     */
                    public void setRooms(FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms value) {
                        this.rooms = value;
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
                     *         &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
                     *           &lt;complexType>
                     *             &lt;complexContent>
                     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
                        "room"
                    })
                    public static class Rooms {

                        @XmlElement(name = "Room")
                        protected List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room> room;

                        /**
                         * Gets the value of the room property.
                         * 
                         * <p>
                         * This accessor method returns a reference to the live list,
                         * not a snapshot. Therefore any modification you make to the
                         * returned list will be present inside the JAXB object.
                         * This is why there is not a <CODE>set</CODE> method for the room property.
                         * 
                         * <p>
                         * For example, to add a new item, do as follows:
                         * <pre>
                         *    getRoom().add(newItem);
                         * </pre>
                         * 
                         * 
                         * <p>
                         * Objects of the following type(s) are allowed in the list
                         * {@link FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room }
                         * 
                         * 
                         */
                        public List<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room> getRoom() {
                            if (room == null) {
                                room = new ArrayList<FacilityInfoType.MeetingRooms.PricingGroups.PricingGroup.TimeSlotRates.Rooms.Room>();
                            }
                            return this.room;
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
                         *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                         *     &lt;/restriction>
                         *   &lt;/complexContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "")
                        public static class Room {

                            @XmlAttribute(name = "Code", required = true)
                            @XmlSchemaType(name = "anySimpleType")
                            protected String code;

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


                    /**
                     * <p>anonymous complex type的 Java 类。
                     * 
                     * <p>以下模式片段指定包含在此类中的预期内容。
                     * 
                     * <pre>
                     * &lt;complexType>
                     *   &lt;complexContent>
                     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                     *       &lt;attribute name="MinPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="MaxPartySize" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *       &lt;attribute name="RequiredRate" use="required" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *       &lt;attribute name="ExtraHourRate" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *       &lt;attribute name="Layout" type="{http://www.w3.org/2001/XMLSchema}int" />
                     *       &lt;attribute name="PricePerPerson" type="{http://www.w3.org/2001/XMLSchema}float" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class TimeSlotRate {

                        @XmlAttribute(name = "MinPartySize", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String minPartySize;
                        @XmlAttribute(name = "MaxPartySize", required = true)
                        @XmlSchemaType(name = "anySimpleType")
                        protected String maxPartySize;
                        @XmlAttribute(name = "RequiredRate", required = true)
                        protected float requiredRate;
                        @XmlAttribute(name = "ExtraHourRate")
                        protected Float extraHourRate;
                        @XmlAttribute(name = "Layout")
                        protected Integer layout;
                        @XmlAttribute(name = "PricePerPerson")
                        protected Float pricePerPerson;

                        /**
                         * 获取minPartySize属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMinPartySize() {
                            return minPartySize;
                        }

                        /**
                         * 设置minPartySize属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMinPartySize(String value) {
                            this.minPartySize = value;
                        }

                        /**
                         * 获取maxPartySize属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getMaxPartySize() {
                            return maxPartySize;
                        }

                        /**
                         * 设置maxPartySize属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setMaxPartySize(String value) {
                            this.maxPartySize = value;
                        }

                        /**
                         * 获取requiredRate属性的值。
                         * 
                         */
                        public float getRequiredRate() {
                            return requiredRate;
                        }

                        /**
                         * 设置requiredRate属性的值。
                         * 
                         */
                        public void setRequiredRate(float value) {
                            this.requiredRate = value;
                        }

                        /**
                         * 获取extraHourRate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getExtraHourRate() {
                            return extraHourRate;
                        }

                        /**
                         * 设置extraHourRate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setExtraHourRate(Float value) {
                            this.extraHourRate = value;
                        }

                        /**
                         * 获取layout属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Integer }
                         *     
                         */
                        public Integer getLayout() {
                            return layout;
                        }

                        /**
                         * 设置layout属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Integer }
                         *     
                         */
                        public void setLayout(Integer value) {
                            this.layout = value;
                        }

                        /**
                         * 获取pricePerPerson属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link Float }
                         *     
                         */
                        public Float getPricePerPerson() {
                            return pricePerPerson;
                        }

                        /**
                         * 设置pricePerPerson属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link Float }
                         *     
                         */
                        public void setPricePerPerson(Float value) {
                            this.pricePerPerson = value;
                        }

                    }

                }

            }

        }

    }

}
