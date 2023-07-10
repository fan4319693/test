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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The container for all of the search details.
 * 
 * <p>SearchType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="xPromotionId" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="DateInformation">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="depart" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="departDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                   &lt;element name="departDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="departMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="departYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *                   &lt;element name="numNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
 *                   &lt;element name="returnDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="returnMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                   &lt;element name="returnYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="HotelInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="locationType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="numRooms" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                   &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="roomRating" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *                   &lt;element name="roomType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="RoomInformation" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ChildAges">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="childAge" maxOccurs="5" minOccurs="0">
 *                                         &lt;simpleType>
 *                                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
 *                                             &lt;enumeration value="0"/>
 *                                             &lt;enumeration value="1"/>
 *                                             &lt;enumeration value="2"/>
 *                                             &lt;enumeration value="3"/>
 *                                             &lt;enumeration value="4"/>
 *                                             &lt;enumeration value="5"/>
 *                                           &lt;/restriction>
 *                                         &lt;/simpleType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                             &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                             &lt;element name="infants" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OriginDestinationInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Origin">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Destination">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="FlightSegment" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="MarketingAirline" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ChildAges">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="childAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="InfantAges">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="infantAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="adult_FareBreakdown" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="child_FareBreakdown" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="infants" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="infant_FareBreakdown" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="airlinePrefs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="airlinePref" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="airlinePrefMulticity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="flightType" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="return"/>
 *               &lt;enumeration value="oneway"/>
 *               &lt;enumeration value="multi-city"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="searchType">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="H"/>
 *               &lt;enumeration value="F"/>
 *               &lt;enumeration value="V"/>
 *               &lt;enumeration value="E"/>
 *               &lt;enumeration value="HFV"/>
 *               &lt;enumeration value="HF"/>
 *               &lt;enumeration value="VH"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="searched" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="seatClass" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="AirDepartTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="AirReturnTime" type="{http://www.w3.org/2001/XMLSchema}time" minOccurs="0"/>
 *         &lt;element name="VehicleInformation" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="dropOffLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dropOffLocation_input" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dropOffLocation_leg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="dropOffTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                   &lt;element name="pickUpLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pickUpLocation_input" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pickUpLocation_leg" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirDirectOnly" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}int">
 *               &lt;enumeration value="0"/>
 *               &lt;enumeration value="1"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="calendarSearch" type="{http://www.w3.org/2001/XMLSchema}boolean" minOccurs="0"/>
 *         &lt;element name="numCityPairs" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
 *         &lt;element name="Protocol">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;enumeration value="http"/>
 *               &lt;enumeration value="https"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *         &lt;element name="airlineIBEIntegration" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="crossSellType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="canDelete" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="returnLink" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                   &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                   &lt;element name="totalFare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
@XmlType(name = "SearchType", propOrder = {
    "xPromotionId",
    "dateInformation",
    "hotelInformation",
    "originDestinationInformation",
    "passengers",
    "airlinePrefs",
    "flightType",
    "searchType",
    "searched",
    "seatClass",
    "airDepartTime",
    "airReturnTime",
    "vehicleInformation",
    "airDirectOnly",
    "calendarSearch",
    "numCityPairs",
    "protocol",
    "airlineIBEIntegration"
})
public class SearchType {

    protected String xPromotionId;
    @XmlElement(name = "DateInformation", required = true)
    protected SearchType.DateInformation dateInformation;
    @XmlElement(name = "HotelInformation")
    protected SearchType.HotelInformation hotelInformation;
    @XmlElement(name = "OriginDestinationInformation")
    protected SearchType.OriginDestinationInformation originDestinationInformation;
    @XmlElement(name = "Passengers")
    protected SearchType.Passengers passengers;
    protected SearchType.AirlinePrefs airlinePrefs;
    protected String flightType;
    @XmlElement(required = true)
    protected String searchType;
    @XmlElement(defaultValue = "false")
    protected Boolean searched;
    protected Object seatClass;
    @XmlElement(name = "AirDepartTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar airDepartTime;
    @XmlElement(name = "AirReturnTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar airReturnTime;
    @XmlElement(name = "VehicleInformation")
    protected SearchType.VehicleInformation vehicleInformation;
    @XmlElement(name = "AirDirectOnly")
    protected Integer airDirectOnly;
    @XmlElement(defaultValue = "false")
    protected Boolean calendarSearch;
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger numCityPairs;
    @XmlElement(name = "Protocol", required = true)
    protected String protocol;
    protected SearchType.AirlineIBEIntegration airlineIBEIntegration;

    /**
     * 获取xPromotionId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getXPromotionId() {
        return xPromotionId;
    }

    /**
     * 设置xPromotionId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setXPromotionId(String value) {
        this.xPromotionId = value;
    }

    /**
     * 获取dateInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.DateInformation }
     *     
     */
    public SearchType.DateInformation getDateInformation() {
        return dateInformation;
    }

    /**
     * 设置dateInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.DateInformation }
     *     
     */
    public void setDateInformation(SearchType.DateInformation value) {
        this.dateInformation = value;
    }

    /**
     * 获取hotelInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.HotelInformation }
     *     
     */
    public SearchType.HotelInformation getHotelInformation() {
        return hotelInformation;
    }

    /**
     * 设置hotelInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.HotelInformation }
     *     
     */
    public void setHotelInformation(SearchType.HotelInformation value) {
        this.hotelInformation = value;
    }

    /**
     * 获取originDestinationInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.OriginDestinationInformation }
     *     
     */
    public SearchType.OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * 设置originDestinationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(SearchType.OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

    /**
     * 获取passengers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.Passengers }
     *     
     */
    public SearchType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * 设置passengers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.Passengers }
     *     
     */
    public void setPassengers(SearchType.Passengers value) {
        this.passengers = value;
    }

    /**
     * 获取airlinePrefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.AirlinePrefs }
     *     
     */
    public SearchType.AirlinePrefs getAirlinePrefs() {
        return airlinePrefs;
    }

    /**
     * 设置airlinePrefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.AirlinePrefs }
     *     
     */
    public void setAirlinePrefs(SearchType.AirlinePrefs value) {
        this.airlinePrefs = value;
    }

    /**
     * 获取flightType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightType() {
        return flightType;
    }

    /**
     * 设置flightType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightType(String value) {
        this.flightType = value;
    }

    /**
     * 获取searchType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * 设置searchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * 获取searched属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSearched() {
        return searched;
    }

    /**
     * 设置searched属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSearched(Boolean value) {
        this.searched = value;
    }

    /**
     * 获取seatClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getSeatClass() {
        return seatClass;
    }

    /**
     * 设置seatClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setSeatClass(Object value) {
        this.seatClass = value;
    }

    /**
     * 获取airDepartTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAirDepartTime() {
        return airDepartTime;
    }

    /**
     * 设置airDepartTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAirDepartTime(XMLGregorianCalendar value) {
        this.airDepartTime = value;
    }

    /**
     * 获取airReturnTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAirReturnTime() {
        return airReturnTime;
    }

    /**
     * 设置airReturnTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAirReturnTime(XMLGregorianCalendar value) {
        this.airReturnTime = value;
    }

    /**
     * 获取vehicleInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.VehicleInformation }
     *     
     */
    public SearchType.VehicleInformation getVehicleInformation() {
        return vehicleInformation;
    }

    /**
     * 设置vehicleInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.VehicleInformation }
     *     
     */
    public void setVehicleInformation(SearchType.VehicleInformation value) {
        this.vehicleInformation = value;
    }

    /**
     * 获取airDirectOnly属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAirDirectOnly() {
        return airDirectOnly;
    }

    /**
     * 设置airDirectOnly属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAirDirectOnly(Integer value) {
        this.airDirectOnly = value;
    }

    /**
     * 获取calendarSearch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCalendarSearch() {
        return calendarSearch;
    }

    /**
     * 设置calendarSearch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCalendarSearch(Boolean value) {
        this.calendarSearch = value;
    }

    /**
     * 获取numCityPairs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNumCityPairs() {
        return numCityPairs;
    }

    /**
     * 设置numCityPairs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNumCityPairs(BigInteger value) {
        this.numCityPairs = value;
    }

    /**
     * 获取protocol属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocol() {
        return protocol;
    }

    /**
     * 设置protocol属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocol(String value) {
        this.protocol = value;
    }

    /**
     * 获取airlineIBEIntegration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchType.AirlineIBEIntegration }
     *     
     */
    public SearchType.AirlineIBEIntegration getAirlineIBEIntegration() {
        return airlineIBEIntegration;
    }

    /**
     * 设置airlineIBEIntegration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchType.AirlineIBEIntegration }
     *     
     */
    public void setAirlineIBEIntegration(SearchType.AirlineIBEIntegration value) {
        this.airlineIBEIntegration = value;
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
     *         &lt;element name="currency" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="crossSellType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="canDelete" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="returnLink" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="pnr" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="totalFare" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
        "currency",
        "crossSellType",
        "canDelete",
        "returnLink",
        "pnr",
        "totalFare"
    })
    public static class AirlineIBEIntegration {

        protected Object currency;
        @XmlElement(required = true)
        protected Object crossSellType;
        protected Object canDelete;
        @XmlElement(required = true)
        protected Object returnLink;
        protected Object pnr;
        @XmlElement(required = true)
        protected Object totalFare;

        /**
         * 获取currency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCurrency() {
            return currency;
        }

        /**
         * 设置currency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCurrency(Object value) {
            this.currency = value;
        }

        /**
         * 获取crossSellType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCrossSellType() {
            return crossSellType;
        }

        /**
         * 设置crossSellType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCrossSellType(Object value) {
            this.crossSellType = value;
        }

        /**
         * 获取canDelete属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getCanDelete() {
            return canDelete;
        }

        /**
         * 设置canDelete属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setCanDelete(Object value) {
            this.canDelete = value;
        }

        /**
         * 获取returnLink属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getReturnLink() {
            return returnLink;
        }

        /**
         * 设置returnLink属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReturnLink(Object value) {
            this.returnLink = value;
        }

        /**
         * 获取pnr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPnr() {
            return pnr;
        }

        /**
         * 设置pnr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPnr(Object value) {
            this.pnr = value;
        }

        /**
         * 获取totalFare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getTotalFare() {
            return totalFare;
        }

        /**
         * 设置totalFare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setTotalFare(Object value) {
            this.totalFare = value;
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
     *         &lt;element name="airlinePref" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="airlinePrefMulticity" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
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
        "airlinePref",
        "airlinePrefMulticity"
    })
    public static class AirlinePrefs {

        protected List<String> airlinePref;
        protected List<String> airlinePrefMulticity;

        /**
         * Gets the value of the airlinePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlinePref() {
            if (airlinePref == null) {
                airlinePref = new ArrayList<String>();
            }
            return this.airlinePref;
        }

        /**
         * Gets the value of the airlinePrefMulticity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePrefMulticity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePrefMulticity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAirlinePrefMulticity() {
            if (airlinePrefMulticity == null) {
                airlinePrefMulticity = new ArrayList<String>();
            }
            return this.airlinePrefMulticity;
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
     *         &lt;element name="depart" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="departDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *         &lt;element name="departDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="departMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="departYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
     *         &lt;element name="numNights" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="return" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="returnDate" type="{http://www.w3.org/2001/XMLSchema}date" minOccurs="0"/>
     *         &lt;element name="returnDay" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="returnMonth" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
     *         &lt;element name="returnYear" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" minOccurs="0"/>
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
        "depart",
        "departDate",
        "departDay",
        "departMonth",
        "departYear",
        "numNights",
        "_return",
        "returnDate",
        "returnDay",
        "returnMonth",
        "returnYear"
    })
    public static class DateInformation {

        @XmlElement(required = true)
        protected Object depart;
        @XmlElement(required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departDate;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger departDay;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger departMonth;
        @XmlElement(required = true)
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger departYear;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numNights;
        @XmlElement(name = "return")
        protected Object _return;
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar returnDate;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger returnDay;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger returnMonth;
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger returnYear;
        @XmlAttribute(name = "index")
        @XmlSchemaType(name = "anySimpleType")
        protected String index;

        /**
         * 获取depart属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getDepart() {
            return depart;
        }

        /**
         * 设置depart属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setDepart(Object value) {
            this.depart = value;
        }

        /**
         * 获取departDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartDate() {
            return departDate;
        }

        /**
         * 设置departDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartDate(XMLGregorianCalendar value) {
            this.departDate = value;
        }

        /**
         * 获取departDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDepartDay() {
            return departDay;
        }

        /**
         * 设置departDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDepartDay(BigInteger value) {
            this.departDay = value;
        }

        /**
         * 获取departMonth属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDepartMonth() {
            return departMonth;
        }

        /**
         * 设置departMonth属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDepartMonth(BigInteger value) {
            this.departMonth = value;
        }

        /**
         * 获取departYear属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDepartYear() {
            return departYear;
        }

        /**
         * 设置departYear属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDepartYear(BigInteger value) {
            this.departYear = value;
        }

        /**
         * 获取numNights属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumNights() {
            return numNights;
        }

        /**
         * 设置numNights属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumNights(BigInteger value) {
            this.numNights = value;
        }

        /**
         * 获取return属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getReturn() {
            return _return;
        }

        /**
         * 设置return属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setReturn(Object value) {
            this._return = value;
        }

        /**
         * 获取returnDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getReturnDate() {
            return returnDate;
        }

        /**
         * 设置returnDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setReturnDate(XMLGregorianCalendar value) {
            this.returnDate = value;
        }

        /**
         * 获取returnDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnDay() {
            return returnDay;
        }

        /**
         * 设置returnDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnDay(BigInteger value) {
            this.returnDay = value;
        }

        /**
         * 获取returnMonth属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnMonth() {
            return returnMonth;
        }

        /**
         * 设置returnMonth属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnMonth(BigInteger value) {
            this.returnMonth = value;
        }

        /**
         * 获取returnYear属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getReturnYear() {
            return returnYear;
        }

        /**
         * 设置returnYear属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setReturnYear(BigInteger value) {
            this.returnYear = value;
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
     *         &lt;element name="hotelName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="locationType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="numRooms" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *         &lt;element name="propertyType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="roomRating" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" minOccurs="0"/>
     *         &lt;element name="roomType" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *         &lt;element name="RoomInformation" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ChildAges">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="childAge" maxOccurs="5" minOccurs="0">
     *                               &lt;simpleType>
     *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
     *                                   &lt;enumeration value="0"/>
     *                                   &lt;enumeration value="1"/>
     *                                   &lt;enumeration value="2"/>
     *                                   &lt;enumeration value="3"/>
     *                                   &lt;enumeration value="4"/>
     *                                   &lt;enumeration value="5"/>
     *                                 &lt;/restriction>
     *                               &lt;/simpleType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                   &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                   &lt;element name="infants" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
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
        "hotelName",
        "locationType",
        "numRooms",
        "propertyType",
        "roomRating",
        "roomType",
        "roomInformation"
    })
    public static class HotelInformation {

        protected String hotelName;
        protected Object locationType;
        @XmlElement(required = true)
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger numRooms;
        protected Object propertyType;
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger roomRating;
        protected Object roomType;
        @XmlElement(name = "RoomInformation", required = true)
        protected List<SearchType.HotelInformation.RoomInformation> roomInformation;

        /**
         * 获取hotelName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHotelName() {
            return hotelName;
        }

        /**
         * 设置hotelName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHotelName(String value) {
            this.hotelName = value;
        }

        /**
         * 获取locationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getLocationType() {
            return locationType;
        }

        /**
         * 设置locationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setLocationType(Object value) {
            this.locationType = value;
        }

        /**
         * 获取numRooms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNumRooms() {
            return numRooms;
        }

        /**
         * 设置numRooms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNumRooms(BigInteger value) {
            this.numRooms = value;
        }

        /**
         * 获取propertyType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getPropertyType() {
            return propertyType;
        }

        /**
         * 设置propertyType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setPropertyType(Object value) {
            this.propertyType = value;
        }

        /**
         * 获取roomRating属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRoomRating() {
            return roomRating;
        }

        /**
         * 设置roomRating属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRoomRating(BigInteger value) {
            this.roomRating = value;
        }

        /**
         * 获取roomType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getRoomType() {
            return roomType;
        }

        /**
         * 设置roomType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setRoomType(Object value) {
            this.roomType = value;
        }

        /**
         * Gets the value of the roomInformation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the roomInformation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRoomInformation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SearchType.HotelInformation.RoomInformation }
         * 
         * 
         */
        public List<SearchType.HotelInformation.RoomInformation> getRoomInformation() {
            if (roomInformation == null) {
                roomInformation = new ArrayList<SearchType.HotelInformation.RoomInformation>();
            }
            return this.roomInformation;
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
         *         &lt;element name="ChildAges">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="childAge" maxOccurs="5" minOccurs="0">
         *                     &lt;simpleType>
         *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
         *                         &lt;enumeration value="0"/>
         *                         &lt;enumeration value="1"/>
         *                         &lt;enumeration value="2"/>
         *                         &lt;enumeration value="3"/>
         *                         &lt;enumeration value="4"/>
         *                         &lt;enumeration value="5"/>
         *                       &lt;/restriction>
         *                     &lt;/simpleType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *         &lt;element name="infants" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger"/>
         *       &lt;/sequence>
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "childAges",
            "adults",
            "children",
            "infants"
        })
        public static class RoomInformation {

            @XmlElement(name = "ChildAges", required = true)
            protected SearchType.HotelInformation.RoomInformation.ChildAges childAges;
            @XmlElement(required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger adults;
            @XmlElement(required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger children;
            @XmlElement(required = true)
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger infants;
            @XmlAttribute(name = "index")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger index;

            /**
             * 获取childAges属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SearchType.HotelInformation.RoomInformation.ChildAges }
             *     
             */
            public SearchType.HotelInformation.RoomInformation.ChildAges getChildAges() {
                return childAges;
            }

            /**
             * 设置childAges属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SearchType.HotelInformation.RoomInformation.ChildAges }
             *     
             */
            public void setChildAges(SearchType.HotelInformation.RoomInformation.ChildAges value) {
                this.childAges = value;
            }

            /**
             * 获取adults属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getAdults() {
                return adults;
            }

            /**
             * 设置adults属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setAdults(BigInteger value) {
                this.adults = value;
            }

            /**
             * 获取children属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getChildren() {
                return children;
            }

            /**
             * 设置children属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setChildren(BigInteger value) {
                this.children = value;
            }

            /**
             * 获取infants属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getInfants() {
                return infants;
            }

            /**
             * 设置infants属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setInfants(BigInteger value) {
                this.infants = value;
            }

            /**
             * 获取index属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndex() {
                return index;
            }

            /**
             * 设置index属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndex(BigInteger value) {
                this.index = value;
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
             *         &lt;element name="childAge" maxOccurs="5" minOccurs="0">
             *           &lt;simpleType>
             *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger">
             *               &lt;enumeration value="0"/>
             *               &lt;enumeration value="1"/>
             *               &lt;enumeration value="2"/>
             *               &lt;enumeration value="3"/>
             *               &lt;enumeration value="4"/>
             *               &lt;enumeration value="5"/>
             *             &lt;/restriction>
             *           &lt;/simpleType>
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
                "childAge"
            })
            public static class ChildAges {

                protected List<BigInteger> childAge;

                /**
                 * Gets the value of the childAge property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the childAge property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getChildAge().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link BigInteger }
                 * 
                 * 
                 */
                public List<BigInteger> getChildAge() {
                    if (childAge == null) {
                        childAge = new ArrayList<BigInteger>();
                    }
                    return this.childAge;
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
     *       &lt;sequence>
     *         &lt;element name="Origin">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Destination">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="FlightSegment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="MarketingAirline" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "origin",
        "destination",
        "flightDetails"
    })
    public static class OriginDestinationInformation {

        @XmlElement(name = "Origin", required = true)
        protected SearchType.OriginDestinationInformation.Origin origin;
        @XmlElement(name = "Destination", required = true)
        protected SearchType.OriginDestinationInformation.Destination destination;
        @XmlElement(name = "FlightDetails")
        protected SearchType.OriginDestinationInformation.FlightDetails flightDetails;

        /**
         * 获取origin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.OriginDestinationInformation.Origin }
         *     
         */
        public SearchType.OriginDestinationInformation.Origin getOrigin() {
            return origin;
        }

        /**
         * 设置origin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.OriginDestinationInformation.Origin }
         *     
         */
        public void setOrigin(SearchType.OriginDestinationInformation.Origin value) {
            this.origin = value;
        }

        /**
         * 获取destination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.OriginDestinationInformation.Destination }
         *     
         */
        public SearchType.OriginDestinationInformation.Destination getDestination() {
            return destination;
        }

        /**
         * 设置destination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.OriginDestinationInformation.Destination }
         *     
         */
        public void setDestination(SearchType.OriginDestinationInformation.Destination value) {
            this.destination = value;
        }

        /**
         * 获取flightDetails属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.OriginDestinationInformation.FlightDetails }
         *     
         */
        public SearchType.OriginDestinationInformation.FlightDetails getFlightDetails() {
            return flightDetails;
        }

        /**
         * 设置flightDetails属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.OriginDestinationInformation.FlightDetails }
         *     
         */
        public void setFlightDetails(SearchType.OriginDestinationInformation.FlightDetails value) {
            this.flightDetails = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destination
            extends LocationFromSearchHotel
        {

            @XmlAttribute(name = "index")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger index;

            /**
             * 获取index属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getIndex() {
                return index;
            }

            /**
             * 设置index属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setIndex(BigInteger value) {
                this.index = value;
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
         *         &lt;element name="FlightSegment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="MarketingAirline" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "flightSegment"
        })
        public static class FlightDetails {

            @XmlElement(name = "FlightSegment", required = true)
            protected List<SearchType.OriginDestinationInformation.FlightDetails.FlightSegment> flightSegment;
            @XmlAttribute(name = "index")
            @XmlSchemaType(name = "anySimpleType")
            protected String index;

            /**
             * Gets the value of the flightSegment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlightSegment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SearchType.OriginDestinationInformation.FlightDetails.FlightSegment }
             * 
             * 
             */
            public List<SearchType.OriginDestinationInformation.FlightDetails.FlightSegment> getFlightSegment() {
                if (flightSegment == null) {
                    flightSegment = new ArrayList<SearchType.OriginDestinationInformation.FlightDetails.FlightSegment>();
                }
                return this.flightSegment;
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
             *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="MarketingAirline" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="ResBookDesigCode" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
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
                "departureDateTime",
                "arrivalDateTime",
                "flightNumber",
                "marketingAirline",
                "cabinCode",
                "resBookDesigCode"
            })
            public static class FlightSegment {

                @XmlElement(name = "DepartureDateTime", required = true)
                protected Object departureDateTime;
                @XmlElement(name = "ArrivalDateTime", required = true)
                protected Object arrivalDateTime;
                @XmlElement(name = "FlightNumber", required = true)
                protected Object flightNumber;
                @XmlElement(name = "MarketingAirline", required = true)
                protected Object marketingAirline;
                @XmlElement(name = "CabinCode", required = true)
                protected Object cabinCode;
                @XmlElement(name = "ResBookDesigCode", required = true)
                protected Object resBookDesigCode;
                @XmlAttribute(name = "index")
                @XmlSchemaType(name = "anySimpleType")
                protected String index;

                /**
                 * 获取departureDateTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getDepartureDateTime() {
                    return departureDateTime;
                }

                /**
                 * 设置departureDateTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setDepartureDateTime(Object value) {
                    this.departureDateTime = value;
                }

                /**
                 * 获取arrivalDateTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getArrivalDateTime() {
                    return arrivalDateTime;
                }

                /**
                 * 设置arrivalDateTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setArrivalDateTime(Object value) {
                    this.arrivalDateTime = value;
                }

                /**
                 * 获取flightNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getFlightNumber() {
                    return flightNumber;
                }

                /**
                 * 设置flightNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setFlightNumber(Object value) {
                    this.flightNumber = value;
                }

                /**
                 * 获取marketingAirline属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getMarketingAirline() {
                    return marketingAirline;
                }

                /**
                 * 设置marketingAirline属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setMarketingAirline(Object value) {
                    this.marketingAirline = value;
                }

                /**
                 * 获取cabinCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getCabinCode() {
                    return cabinCode;
                }

                /**
                 * 设置cabinCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setCabinCode(Object value) {
                    this.cabinCode = value;
                }

                /**
                 * 获取resBookDesigCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getResBookDesigCode() {
                    return resBookDesigCode;
                }

                /**
                 * 设置resBookDesigCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setResBookDesigCode(Object value) {
                    this.resBookDesigCode = value;
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


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Location">
         *       &lt;attribute name="index" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Origin
            extends LocationFromSearchHotel
        {

            @XmlAttribute(name = "index")
            @XmlSchemaType(name = "anySimpleType")
            protected String index;

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
     *         &lt;element name="ChildAges">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="childAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="InfantAges">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="infantAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="adults" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="adult_FareBreakdown" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="children" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="child_FareBreakdown" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="infants" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *         &lt;element name="infant_FareBreakdown" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
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
        "childAges",
        "infantAges",
        "adults",
        "adultFareBreakdown",
        "children",
        "childFareBreakdown",
        "infants",
        "infantFareBreakdown"
    })
    public static class Passengers {

        @XmlElement(name = "ChildAges", required = true)
        protected SearchType.Passengers.ChildAges childAges;
        @XmlElement(name = "InfantAges", required = true)
        protected SearchType.Passengers.InfantAges infantAges;
        @XmlElement(required = true)
        protected Object adults;
        @XmlElement(name = "adult_FareBreakdown")
        protected SearchType.Passengers.AdultFareBreakdown adultFareBreakdown;
        @XmlElement(required = true)
        protected Object children;
        @XmlElement(name = "child_FareBreakdown")
        protected SearchType.Passengers.ChildFareBreakdown childFareBreakdown;
        @XmlElement(required = true)
        protected Object infants;
        @XmlElement(name = "infant_FareBreakdown")
        protected SearchType.Passengers.InfantFareBreakdown infantFareBreakdown;

        /**
         * 获取childAges属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.Passengers.ChildAges }
         *     
         */
        public SearchType.Passengers.ChildAges getChildAges() {
            return childAges;
        }

        /**
         * 设置childAges属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.Passengers.ChildAges }
         *     
         */
        public void setChildAges(SearchType.Passengers.ChildAges value) {
            this.childAges = value;
        }

        /**
         * 获取infantAges属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.Passengers.InfantAges }
         *     
         */
        public SearchType.Passengers.InfantAges getInfantAges() {
            return infantAges;
        }

        /**
         * 设置infantAges属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.Passengers.InfantAges }
         *     
         */
        public void setInfantAges(SearchType.Passengers.InfantAges value) {
            this.infantAges = value;
        }

        /**
         * 获取adults属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAdults() {
            return adults;
        }

        /**
         * 设置adults属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAdults(Object value) {
            this.adults = value;
        }

        /**
         * 获取adultFareBreakdown属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.Passengers.AdultFareBreakdown }
         *     
         */
        public SearchType.Passengers.AdultFareBreakdown getAdultFareBreakdown() {
            return adultFareBreakdown;
        }

        /**
         * 设置adultFareBreakdown属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.Passengers.AdultFareBreakdown }
         *     
         */
        public void setAdultFareBreakdown(SearchType.Passengers.AdultFareBreakdown value) {
            this.adultFareBreakdown = value;
        }

        /**
         * 获取children属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getChildren() {
            return children;
        }

        /**
         * 设置children属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setChildren(Object value) {
            this.children = value;
        }

        /**
         * 获取childFareBreakdown属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.Passengers.ChildFareBreakdown }
         *     
         */
        public SearchType.Passengers.ChildFareBreakdown getChildFareBreakdown() {
            return childFareBreakdown;
        }

        /**
         * 设置childFareBreakdown属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.Passengers.ChildFareBreakdown }
         *     
         */
        public void setChildFareBreakdown(SearchType.Passengers.ChildFareBreakdown value) {
            this.childFareBreakdown = value;
        }

        /**
         * 获取infants属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getInfants() {
            return infants;
        }

        /**
         * 设置infants属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setInfants(Object value) {
            this.infants = value;
        }

        /**
         * 获取infantFareBreakdown属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SearchType.Passengers.InfantFareBreakdown }
         *     
         */
        public SearchType.Passengers.InfantFareBreakdown getInfantFareBreakdown() {
            return infantFareBreakdown;
        }

        /**
         * 设置infantFareBreakdown属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SearchType.Passengers.InfantFareBreakdown }
         *     
         */
        public void setInfantFareBreakdown(SearchType.Passengers.InfantFareBreakdown value) {
            this.infantFareBreakdown = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AdultFareBreakdown
            extends PassengerFareBreakdown
        {


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
         *         &lt;element name="childAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
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
            "childAge"
        })
        public static class ChildAges {

            @XmlSchemaType(name = "nonNegativeInteger")
            protected List<BigInteger> childAge;

            /**
             * Gets the value of the childAge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the childAge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getChildAge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getChildAge() {
                if (childAge == null) {
                    childAge = new ArrayList<BigInteger>();
                }
                return this.childAge;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ChildFareBreakdown
            extends PassengerFareBreakdown
        {


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
         *         &lt;element name="infantAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" maxOccurs="5" minOccurs="0"/>
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
            "infantAge"
        })
        public static class InfantAges {

            @XmlSchemaType(name = "nonNegativeInteger")
            protected List<BigInteger> infantAge;

            /**
             * Gets the value of the infantAge property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the infantAge property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInfantAge().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link BigInteger }
             * 
             * 
             */
            public List<BigInteger> getInfantAge() {
                if (infantAge == null) {
                    infantAge = new ArrayList<BigInteger>();
                }
                return this.infantAge;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PassengerFareBreakdown">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InfantFareBreakdown
            extends PassengerFareBreakdown
        {


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
     *         &lt;element name="dropOffLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dropOffLocation_input" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dropOffLocation_leg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="dropOffTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
     *         &lt;element name="pickUpLocation" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pickUpLocation_input" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pickUpLocation_leg" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="pickUpTime" type="{http://www.w3.org/2001/XMLSchema}time"/>
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
        "dropOffLocation",
        "dropOffLocationInput",
        "dropOffLocationLeg",
        "dropOffTime",
        "pickUpLocation",
        "pickUpLocationInput",
        "pickUpLocationLeg",
        "pickUpTime"
    })
    public static class VehicleInformation {

        @XmlElement(required = true)
        protected String dropOffLocation;
        @XmlElement(name = "dropOffLocation_input", required = true)
        protected String dropOffLocationInput;
        @XmlElement(name = "dropOffLocation_leg", required = true)
        protected String dropOffLocationLeg;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar dropOffTime;
        @XmlElement(required = true)
        protected String pickUpLocation;
        @XmlElement(name = "pickUpLocation_input", required = true)
        protected String pickUpLocationInput;
        @XmlElement(name = "pickUpLocation_leg", required = true)
        protected String pickUpLocationLeg;
        @XmlElement(required = true)
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar pickUpTime;

        /**
         * 获取dropOffLocation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDropOffLocation() {
            return dropOffLocation;
        }

        /**
         * 设置dropOffLocation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDropOffLocation(String value) {
            this.dropOffLocation = value;
        }

        /**
         * 获取dropOffLocationInput属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDropOffLocationInput() {
            return dropOffLocationInput;
        }

        /**
         * 设置dropOffLocationInput属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDropOffLocationInput(String value) {
            this.dropOffLocationInput = value;
        }

        /**
         * 获取dropOffLocationLeg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDropOffLocationLeg() {
            return dropOffLocationLeg;
        }

        /**
         * 设置dropOffLocationLeg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDropOffLocationLeg(String value) {
            this.dropOffLocationLeg = value;
        }

        /**
         * 获取dropOffTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDropOffTime() {
            return dropOffTime;
        }

        /**
         * 设置dropOffTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDropOffTime(XMLGregorianCalendar value) {
            this.dropOffTime = value;
        }

        /**
         * 获取pickUpLocation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPickUpLocation() {
            return pickUpLocation;
        }

        /**
         * 设置pickUpLocation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPickUpLocation(String value) {
            this.pickUpLocation = value;
        }

        /**
         * 获取pickUpLocationInput属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPickUpLocationInput() {
            return pickUpLocationInput;
        }

        /**
         * 设置pickUpLocationInput属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPickUpLocationInput(String value) {
            this.pickUpLocationInput = value;
        }

        /**
         * 获取pickUpLocationLeg属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPickUpLocationLeg() {
            return pickUpLocationLeg;
        }

        /**
         * 设置pickUpLocationLeg属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPickUpLocationLeg(String value) {
            this.pickUpLocationLeg = value;
        }

        /**
         * 获取pickUpTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPickUpTime() {
            return pickUpTime;
        }

        /**
         * 设置pickUpTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPickUpTime(XMLGregorianCalendar value) {
            this.pickUpTime = value;
        }

    }

}
