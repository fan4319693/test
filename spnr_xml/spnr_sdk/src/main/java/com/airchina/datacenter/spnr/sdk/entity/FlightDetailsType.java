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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * <p>FlightDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightLegInfo" maxOccurs="10">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DepartureAirport">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                           &lt;attribute name="CounterNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalAirport" maxOccurs="5">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
 *                           &lt;attribute name="Diversion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="BaggageClaim" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                           &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
 *                   &lt;element name="OperatingAirline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/>
 *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentType" minOccurs="0"/>
 *                   &lt;element name="WeatherInfo" type="{http://www.opentravel.org/OTA/2003/05}AirportWeatherType" minOccurs="0"/>
 *                   &lt;element name="Comment" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DepartureDateTime">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="NextAdvisoryTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalDateTime">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                           &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Delay" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperationTimes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OperationTime" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OperationTimeGroup"/>
 *                                     &lt;attribute name="OperationName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FlightAmenities" type="{http://www.opentravel.org/OTA/2003/05}FlightAmenitiesType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="FFPAccumulation" type="{http://www.opentravel.org/OTA/2003/05}FFPAccumulationType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlifoLegAttributes"/>
 *                 &lt;attribute name="FlightStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                 &lt;attribute name="HostFlightNo" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *                 &lt;attribute name="IncludedMeal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PreFlightNo" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *                 &lt;attribute name="PreFlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingInfoType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Warnings" type="{http://www.opentravel.org/OTA/2003/05}WarningsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirDetailsRSAttributes"/>
 *       &lt;attribute name="MessageStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *       &lt;attribute name="CancelledIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DataSource" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="GlobalIndicatorCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailsType", propOrder = {
    "flightLegInfo",
    "ticketing",
    "comment",
    "warnings"
})
public class FlightDetailsType {

    @XmlElement(name = "FlightLegInfo", required = true)
    protected List<FlightDetailsType.FlightLegInfo> flightLegInfo;
    @XmlElement(name = "Ticketing")
    protected List<TicketingInfoType> ticketing;
    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlAttribute(name = "MessageStatus")
    protected String messageStatus;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "CancelledIndicator")
    protected Boolean cancelledIndicator;
    @XmlAttribute(name = "DataSource")
    protected String dataSource;
    @XmlAttribute(name = "GlobalIndicatorCode")
    protected String globalIndicatorCode;
    @XmlAttribute(name = "Reference")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger reference;
    @XmlAttribute(name = "TotalFlightTime")
    protected Duration totalFlightTime;
    @XmlAttribute(name = "TotalGroundTime")
    protected Duration totalGroundTime;
    @XmlAttribute(name = "TotalTripTime")
    protected Duration totalTripTime;
    @XmlAttribute(name = "TotalMiles")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalMiles;

    /**
     * Gets the value of the flightLegInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightLegInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightLegInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightDetailsType.FlightLegInfo }
     * 
     * 
     */
    public List<FlightDetailsType.FlightLegInfo> getFlightLegInfo() {
        if (flightLegInfo == null) {
            flightLegInfo = new ArrayList<FlightDetailsType.FlightLegInfo>();
        }
        return this.flightLegInfo;
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
     * {@link TicketingInfoType }
     * 
     * 
     */
    public List<TicketingInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingInfoType>();
        }
        return this.ticketing;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getComment() {
        if (comment == null) {
            comment = new ArrayList<FreeTextType>();
        }
        return this.comment;
    }

    /**
     * 获取warnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * 设置warnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * 获取messageStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageStatus() {
        return messageStatus;
    }

    /**
     * 设置messageStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageStatus(String value) {
        this.messageStatus = value;
    }

    /**
     * 获取flightNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightNumber() {
        return flightNumber;
    }

    /**
     * 设置flightNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightNumber(String value) {
        this.flightNumber = value;
    }

    /**
     * 获取cancelledIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCancelledIndicator() {
        return cancelledIndicator;
    }

    /**
     * 设置cancelledIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCancelledIndicator(Boolean value) {
        this.cancelledIndicator = value;
    }

    /**
     * 获取dataSource属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDataSource() {
        return dataSource;
    }

    /**
     * 设置dataSource属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDataSource(String value) {
        this.dataSource = value;
    }

    /**
     * 获取globalIndicatorCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGlobalIndicatorCode() {
        return globalIndicatorCode;
    }

    /**
     * 设置globalIndicatorCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGlobalIndicatorCode(String value) {
        this.globalIndicatorCode = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setReference(BigInteger value) {
        this.reference = value;
    }

    /**
     * 获取totalFlightTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalFlightTime() {
        return totalFlightTime;
    }

    /**
     * 设置totalFlightTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalFlightTime(Duration value) {
        this.totalFlightTime = value;
    }

    /**
     * 获取totalGroundTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalGroundTime() {
        return totalGroundTime;
    }

    /**
     * 设置totalGroundTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalGroundTime(Duration value) {
        this.totalGroundTime = value;
    }

    /**
     * 获取totalTripTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getTotalTripTime() {
        return totalTripTime;
    }

    /**
     * 设置totalTripTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setTotalTripTime(Duration value) {
        this.totalTripTime = value;
    }

    /**
     * 获取totalMiles属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalMiles() {
        return totalMiles;
    }

    /**
     * 设置totalMiles属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalMiles(BigInteger value) {
        this.totalMiles = value;
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
     *         &lt;element name="DepartureAirport">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *                 &lt;attribute name="CounterNo" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalAirport" maxOccurs="5">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
     *                 &lt;attribute name="Diversion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="BaggageClaim" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                 &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="MarketingAirline" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
     *         &lt;element name="OperatingAirline" type="{http://www.opentravel.org/OTA/2003/05}OperatingAirlineType" minOccurs="0"/>
     *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentType" minOccurs="0"/>
     *         &lt;element name="WeatherInfo" type="{http://www.opentravel.org/OTA/2003/05}AirportWeatherType" minOccurs="0"/>
     *         &lt;element name="Comment" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FreeTextType">
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DepartureDateTime">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="NextAdvisoryTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ArrivalDateTime">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *                 &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Delay" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperationTimes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OperationTime" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OperationTimeGroup"/>
     *                           &lt;attribute name="OperationName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FlightAmenities" type="{http://www.opentravel.org/OTA/2003/05}FlightAmenitiesType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="FFPAccumulation" type="{http://www.opentravel.org/OTA/2003/05}FFPAccumulationType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FlifoLegAttributes"/>
     *       &lt;attribute name="FlightStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *       &lt;attribute name="HostFlightNo" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
     *       &lt;attribute name="IncludedMeal" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PreFlightNo" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
     *       &lt;attribute name="PreFlightStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "departureAirport",
        "arrivalAirport",
        "marketingAirline",
        "operatingAirline",
        "equipment",
        "weatherInfo",
        "comment",
        "departureDateTime",
        "arrivalDateTime",
        "operationTimes",
        "flightAmenities",
        "ffpAccumulation"
    })
    public static class FlightLegInfo {

        @XmlElement(name = "DepartureAirport", required = true)
        protected FlightDetailsType.FlightLegInfo.DepartureAirport departureAirport;
        @XmlElement(name = "ArrivalAirport", required = true)
        protected List<FlightDetailsType.FlightLegInfo.ArrivalAirport> arrivalAirport;
        @XmlElement(name = "MarketingAirline", required = true)
        protected CompanyNameType marketingAirline;
        @XmlElement(name = "OperatingAirline")
        protected OperatingAirlineType operatingAirline;
        @XmlElement(name = "Equipment")
        protected EquipmentType equipment;
        @XmlElement(name = "WeatherInfo")
        protected AirportWeatherType weatherInfo;
        @XmlElement(name = "Comment")
        protected List<FlightDetailsType.FlightLegInfo.Comment> comment;
        @XmlElement(name = "DepartureDateTime", required = true)
        protected FlightDetailsType.FlightLegInfo.DepartureDateTime departureDateTime;
        @XmlElement(name = "ArrivalDateTime", required = true)
        protected FlightDetailsType.FlightLegInfo.ArrivalDateTime arrivalDateTime;
        @XmlElement(name = "OperationTimes")
        protected FlightDetailsType.FlightLegInfo.OperationTimes operationTimes;
        @XmlElement(name = "FlightAmenities")
        protected List<FlightAmenitiesType> flightAmenities;
        @XmlElement(name = "FFPAccumulation")
        protected FFPAccumulationType ffpAccumulation;
        @XmlAttribute(name = "FlightStatus")
        protected String flightStatus;
        @XmlAttribute(name = "OnTimeRate")
        protected BigDecimal onTimeRate;
        @XmlAttribute(name = "HostFlightNo")
        protected String hostFlightNo;
        @XmlAttribute(name = "IncludedMeal")
        protected Boolean includedMeal;
        @XmlAttribute(name = "PreFlightNo")
        protected String preFlightNo;
        @XmlAttribute(name = "PreFlightStatus")
        protected String preFlightStatus;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;
        @XmlAttribute(name = "JourneyDuration")
        protected Duration journeyDuration;
        @XmlAttribute(name = "GroundDuration")
        protected Duration groundDuration;
        @XmlAttribute(name = "AccumulatedDuration")
        protected Duration accumulatedDuration;
        @XmlAttribute(name = "LegDistance")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger legDistance;
        @XmlAttribute(name = "LegDistanceUnit")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String legDistanceUnit;

        /**
         * 获取departureAirport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsType.FlightLegInfo.DepartureAirport }
         *     
         */
        public FlightDetailsType.FlightLegInfo.DepartureAirport getDepartureAirport() {
            return departureAirport;
        }

        /**
         * 设置departureAirport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsType.FlightLegInfo.DepartureAirport }
         *     
         */
        public void setDepartureAirport(FlightDetailsType.FlightLegInfo.DepartureAirport value) {
            this.departureAirport = value;
        }

        /**
         * Gets the value of the arrivalAirport property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the arrivalAirport property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getArrivalAirport().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightDetailsType.FlightLegInfo.ArrivalAirport }
         * 
         * 
         */
        public List<FlightDetailsType.FlightLegInfo.ArrivalAirport> getArrivalAirport() {
            if (arrivalAirport == null) {
                arrivalAirport = new ArrayList<FlightDetailsType.FlightLegInfo.ArrivalAirport>();
            }
            return this.arrivalAirport;
        }

        /**
         * 获取marketingAirline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getMarketingAirline() {
            return marketingAirline;
        }

        /**
         * 设置marketingAirline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setMarketingAirline(CompanyNameType value) {
            this.marketingAirline = value;
        }

        /**
         * 获取operatingAirline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OperatingAirlineType }
         *     
         */
        public OperatingAirlineType getOperatingAirline() {
            return operatingAirline;
        }

        /**
         * 设置operatingAirline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OperatingAirlineType }
         *     
         */
        public void setOperatingAirline(OperatingAirlineType value) {
            this.operatingAirline = value;
        }

        /**
         * 获取equipment属性的值。
         * 
         * @return
         *     possible object is
         *     {@link EquipmentType }
         *     
         */
        public EquipmentType getEquipment() {
            return equipment;
        }

        /**
         * 设置equipment属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link EquipmentType }
         *     
         */
        public void setEquipment(EquipmentType value) {
            this.equipment = value;
        }

        /**
         * 获取weatherInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirportWeatherType }
         *     
         */
        public AirportWeatherType getWeatherInfo() {
            return weatherInfo;
        }

        /**
         * 设置weatherInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirportWeatherType }
         *     
         */
        public void setWeatherInfo(AirportWeatherType value) {
            this.weatherInfo = value;
        }

        /**
         * Gets the value of the comment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the comment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getComment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightDetailsType.FlightLegInfo.Comment }
         * 
         * 
         */
        public List<FlightDetailsType.FlightLegInfo.Comment> getComment() {
            if (comment == null) {
                comment = new ArrayList<FlightDetailsType.FlightLegInfo.Comment>();
            }
            return this.comment;
        }

        /**
         * 获取departureDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsType.FlightLegInfo.DepartureDateTime }
         *     
         */
        public FlightDetailsType.FlightLegInfo.DepartureDateTime getDepartureDateTime() {
            return departureDateTime;
        }

        /**
         * 设置departureDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsType.FlightLegInfo.DepartureDateTime }
         *     
         */
        public void setDepartureDateTime(FlightDetailsType.FlightLegInfo.DepartureDateTime value) {
            this.departureDateTime = value;
        }

        /**
         * 获取arrivalDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsType.FlightLegInfo.ArrivalDateTime }
         *     
         */
        public FlightDetailsType.FlightLegInfo.ArrivalDateTime getArrivalDateTime() {
            return arrivalDateTime;
        }

        /**
         * 设置arrivalDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsType.FlightLegInfo.ArrivalDateTime }
         *     
         */
        public void setArrivalDateTime(FlightDetailsType.FlightLegInfo.ArrivalDateTime value) {
            this.arrivalDateTime = value;
        }

        /**
         * 获取operationTimes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightDetailsType.FlightLegInfo.OperationTimes }
         *     
         */
        public FlightDetailsType.FlightLegInfo.OperationTimes getOperationTimes() {
            return operationTimes;
        }

        /**
         * 设置operationTimes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightDetailsType.FlightLegInfo.OperationTimes }
         *     
         */
        public void setOperationTimes(FlightDetailsType.FlightLegInfo.OperationTimes value) {
            this.operationTimes = value;
        }

        /**
         * Gets the value of the flightAmenities property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightAmenities property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightAmenities().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FlightAmenitiesType }
         * 
         * 
         */
        public List<FlightAmenitiesType> getFlightAmenities() {
            if (flightAmenities == null) {
                flightAmenities = new ArrayList<FlightAmenitiesType>();
            }
            return this.flightAmenities;
        }

        /**
         * 获取ffpAccumulation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FFPAccumulationType }
         *     
         */
        public FFPAccumulationType getFFPAccumulation() {
            return ffpAccumulation;
        }

        /**
         * 设置ffpAccumulation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FFPAccumulationType }
         *     
         */
        public void setFFPAccumulation(FFPAccumulationType value) {
            this.ffpAccumulation = value;
        }

        /**
         * 获取flightStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightStatus() {
            return flightStatus;
        }

        /**
         * 设置flightStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightStatus(String value) {
            this.flightStatus = value;
        }

        /**
         * 获取onTimeRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOnTimeRate() {
            return onTimeRate;
        }

        /**
         * 设置onTimeRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOnTimeRate(BigDecimal value) {
            this.onTimeRate = value;
        }

        /**
         * 获取hostFlightNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getHostFlightNo() {
            return hostFlightNo;
        }

        /**
         * 设置hostFlightNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setHostFlightNo(String value) {
            this.hostFlightNo = value;
        }

        /**
         * 获取includedMeal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIncludedMeal() {
            return includedMeal;
        }

        /**
         * 设置includedMeal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIncludedMeal(Boolean value) {
            this.includedMeal = value;
        }

        /**
         * 获取preFlightNo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreFlightNo() {
            return preFlightNo;
        }

        /**
         * 设置preFlightNo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreFlightNo(String value) {
            this.preFlightNo = value;
        }

        /**
         * 获取preFlightStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreFlightStatus() {
            return preFlightStatus;
        }

        /**
         * 设置preFlightStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreFlightStatus(String value) {
            this.preFlightStatus = value;
        }

        /**
         * 获取flightNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNumber() {
            return flightNumber;
        }

        /**
         * 设置flightNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNumber(String value) {
            this.flightNumber = value;
        }

        /**
         * 获取journeyDuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getJourneyDuration() {
            return journeyDuration;
        }

        /**
         * 设置journeyDuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setJourneyDuration(Duration value) {
            this.journeyDuration = value;
        }

        /**
         * 获取groundDuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getGroundDuration() {
            return groundDuration;
        }

        /**
         * 设置groundDuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setGroundDuration(Duration value) {
            this.groundDuration = value;
        }

        /**
         * 获取accumulatedDuration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Duration }
         *     
         */
        public Duration getAccumulatedDuration() {
            return accumulatedDuration;
        }

        /**
         * 设置accumulatedDuration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Duration }
         *     
         */
        public void setAccumulatedDuration(Duration value) {
            this.accumulatedDuration = value;
        }

        /**
         * 获取legDistance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getLegDistance() {
            return legDistance;
        }

        /**
         * 设置legDistance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setLegDistance(BigInteger value) {
            this.legDistance = value;
        }

        /**
         * 获取legDistanceUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLegDistanceUnit() {
            return legDistanceUnit;
        }

        /**
         * 设置legDistanceUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLegDistanceUnit(String value) {
            this.legDistanceUnit = value;
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
         *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *       &lt;attribute name="Diversion" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="BaggageClaim" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *       &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class ArrivalAirport {

            @XmlElement(name = "Comment")
            protected List<FreeTextType> comment;
            @XmlAttribute(name = "Diversion", required = true)
            protected boolean diversion;
            @XmlAttribute(name = "BaggageClaim")
            protected String baggageClaim;
            @XmlAttribute(name = "Traffic")
            protected String traffic;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextType }
             * 
             * 
             */
            public List<FreeTextType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<FreeTextType>();
                }
                return this.comment;
            }

            /**
             * 获取diversion属性的值。
             * 
             */
            public boolean isDiversion() {
                return diversion;
            }

            /**
             * 设置diversion属性的值。
             * 
             */
            public void setDiversion(boolean value) {
                this.diversion = value;
            }

            /**
             * 获取baggageClaim属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBaggageClaim() {
                return baggageClaim;
            }

            /**
             * 设置baggageClaim属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBaggageClaim(String value) {
                this.baggageClaim = value;
            }

            /**
             * 获取traffic属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTraffic() {
                return traffic;
            }

            /**
             * 设置traffic属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTraffic(String value) {
                this.traffic = value;
            }

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
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
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
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
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
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
         *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Delay" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class ArrivalDateTime {

            @XmlElement(name = "Comment")
            protected List<FreeTextType> comment;
            @XmlAttribute(name = "Scheduled")
            protected String scheduled;
            @XmlAttribute(name = "Estimated")
            protected String estimated;
            @XmlAttribute(name = "Actual")
            protected String actual;
            @XmlAttribute(name = "ReasonCode")
            protected String reasonCode;
            @XmlAttribute(name = "Delay")
            protected String delay;
            @XmlAttribute(name = "TimeZone")
            @XmlSchemaType(name = "anySimpleType")
            protected String timeZone;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextType }
             * 
             * 
             */
            public List<FreeTextType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<FreeTextType>();
                }
                return this.comment;
            }

            /**
             * 获取scheduled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheduled() {
                return scheduled;
            }

            /**
             * 设置scheduled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheduled(String value) {
                this.scheduled = value;
            }

            /**
             * 获取estimated属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstimated() {
                return estimated;
            }

            /**
             * 设置estimated属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstimated(String value) {
                this.estimated = value;
            }

            /**
             * 获取actual属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActual() {
                return actual;
            }

            /**
             * 设置actual属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActual(String value) {
                this.actual = value;
            }

            /**
             * 获取reasonCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonCode() {
                return reasonCode;
            }

            /**
             * 设置reasonCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonCode(String value) {
                this.reasonCode = value;
            }

            /**
             * 获取delay属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDelay() {
                return delay;
            }

            /**
             * 设置delay属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDelay(String value) {
                this.delay = value;
            }

            /**
             * 获取timeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimeZone() {
                return timeZone;
            }

            /**
             * 设置timeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimeZone(String value) {
                this.timeZone = value;
            }

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
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Comment
            extends FreeTextType
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
         *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="unbounded" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AirportLocationGroup"/>
         *       &lt;attribute name="CounterNo" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Traffic" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "comment"
        })
        public static class DepartureAirport {

            @XmlElement(name = "Comment")
            protected List<FreeTextType> comment;
            @XmlAttribute(name = "CounterNo")
            protected String counterNo;
            @XmlAttribute(name = "Traffic")
            protected String traffic;
            @XmlAttribute(name = "LocationCode")
            protected String locationCode;
            @XmlAttribute(name = "LocationName")
            protected String locationName;
            @XmlAttribute(name = "CodeContext")
            protected String codeContext;
            @XmlAttribute(name = "Terminal")
            protected String terminal;
            @XmlAttribute(name = "Gate")
            protected String gate;
            @XmlAttribute(name = "TS_CityCode")
            protected String tsCityCode;
            @XmlAttribute(name = "TS_CityName")
            protected String tsCityName;
            @XmlAttribute(name = "CityAirportName")
            protected String cityAirportName;
            @XmlAttribute(name = "CountryCode")
            protected String countryCode;
            @XmlAttribute(name = "CountryName")
            protected String countryName;

            /**
             * Gets the value of the comment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the comment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getComment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FreeTextType }
             * 
             * 
             */
            public List<FreeTextType> getComment() {
                if (comment == null) {
                    comment = new ArrayList<FreeTextType>();
                }
                return this.comment;
            }

            /**
             * 获取counterNo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCounterNo() {
                return counterNo;
            }

            /**
             * 设置counterNo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCounterNo(String value) {
                this.counterNo = value;
            }

            /**
             * 获取traffic属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTraffic() {
                return traffic;
            }

            /**
             * 设置traffic属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTraffic(String value) {
                this.traffic = value;
            }

            /**
             * 获取locationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationCode() {
                return locationCode;
            }

            /**
             * 设置locationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationCode(String value) {
                this.locationCode = value;
            }

            /**
             * 获取locationName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLocationName() {
                return locationName;
            }

            /**
             * 设置locationName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLocationName(String value) {
                this.locationName = value;
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
                if (codeContext == null) {
                    return "IATA";
                } else {
                    return codeContext;
                }
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
             * 获取terminal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTerminal() {
                return terminal;
            }

            /**
             * 设置terminal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTerminal(String value) {
                this.terminal = value;
            }

            /**
             * 获取gate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getGate() {
                return gate;
            }

            /**
             * 设置gate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setGate(String value) {
                this.gate = value;
            }

            /**
             * 获取tsCityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityCode() {
                return tsCityCode;
            }

            /**
             * 设置tsCityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityCode(String value) {
                this.tsCityCode = value;
            }

            /**
             * 获取tsCityName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTSCityName() {
                return tsCityName;
            }

            /**
             * 设置tsCityName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTSCityName(String value) {
                this.tsCityName = value;
            }

            /**
             * 获取cityAirportName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityAirportName() {
                return cityAirportName;
            }

            /**
             * 设置cityAirportName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityAirportName(String value) {
                this.cityAirportName = value;
            }

            /**
             * 获取countryCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryCode() {
                return countryCode;
            }

            /**
             * 设置countryCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryCode(String value) {
                this.countryCode = value;
            }

            /**
             * 获取countryName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountryName() {
                return countryName;
            }

            /**
             * 设置countryName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountryName(String value) {
                this.countryName = value;
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
         *       &lt;attribute name="Scheduled" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="Estimated" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="Actual" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="ReasonCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="NextAdvisoryTime" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
         *       &lt;attribute name="TimeZone" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class DepartureDateTime {

            @XmlAttribute(name = "Scheduled")
            protected String scheduled;
            @XmlAttribute(name = "Estimated")
            protected String estimated;
            @XmlAttribute(name = "Actual")
            protected String actual;
            @XmlAttribute(name = "ReasonCode")
            protected String reasonCode;
            @XmlAttribute(name = "NextAdvisoryTime")
            protected String nextAdvisoryTime;
            @XmlAttribute(name = "TimeZone")
            @XmlSchemaType(name = "anySimpleType")
            protected String timeZone;

            /**
             * 获取scheduled属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getScheduled() {
                return scheduled;
            }

            /**
             * 设置scheduled属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setScheduled(String value) {
                this.scheduled = value;
            }

            /**
             * 获取estimated属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEstimated() {
                return estimated;
            }

            /**
             * 设置estimated属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEstimated(String value) {
                this.estimated = value;
            }

            /**
             * 获取actual属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActual() {
                return actual;
            }

            /**
             * 设置actual属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActual(String value) {
                this.actual = value;
            }

            /**
             * 获取reasonCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReasonCode() {
                return reasonCode;
            }

            /**
             * 设置reasonCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReasonCode(String value) {
                this.reasonCode = value;
            }

            /**
             * 获取nextAdvisoryTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNextAdvisoryTime() {
                return nextAdvisoryTime;
            }

            /**
             * 设置nextAdvisoryTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNextAdvisoryTime(String value) {
                this.nextAdvisoryTime = value;
            }

            /**
             * 获取timeZone属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTimeZone() {
                return timeZone;
            }

            /**
             * 设置timeZone属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTimeZone(String value) {
                this.timeZone = value;
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
         *         &lt;element name="OperationTime" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OperationTimeGroup"/>
         *                 &lt;attribute name="OperationName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
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
            "operationTime"
        })
        public static class OperationTimes {

            @XmlElement(name = "OperationTime", required = true)
            protected List<FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime> operationTime;

            /**
             * Gets the value of the operationTime property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the operationTime property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getOperationTime().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime }
             * 
             * 
             */
            public List<FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime> getOperationTime() {
                if (operationTime == null) {
                    operationTime = new ArrayList<FlightDetailsType.FlightLegInfo.OperationTimes.OperationTime>();
                }
                return this.operationTime;
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
             *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="5" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OperationTimeGroup"/>
             *       &lt;attribute name="OperationName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "comment"
            })
            public static class OperationTime {

                @XmlElement(name = "Comment")
                protected List<FreeTextType> comment;
                @XmlAttribute(name = "OperationName")
                protected String operationName;
                @XmlAttribute(name = "Time", required = true)
                protected String time;
                @XmlAttribute(name = "OperationType", required = true)
                protected String operationType;
                @XmlAttribute(name = "TimeType", required = true)
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String timeType;
                @XmlAttribute(name = "ReasonCode")
                protected String reasonCode;

                /**
                 * Gets the value of the comment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the comment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getComment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link FreeTextType }
                 * 
                 * 
                 */
                public List<FreeTextType> getComment() {
                    if (comment == null) {
                        comment = new ArrayList<FreeTextType>();
                    }
                    return this.comment;
                }

                /**
                 * 获取operationName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOperationName() {
                    return operationName;
                }

                /**
                 * 设置operationName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOperationName(String value) {
                    this.operationName = value;
                }

                /**
                 * 获取time属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTime() {
                    return time;
                }

                /**
                 * 设置time属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTime(String value) {
                    this.time = value;
                }

                /**
                 * 获取operationType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOperationType() {
                    return operationType;
                }

                /**
                 * 设置operationType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOperationType(String value) {
                    this.operationType = value;
                }

                /**
                 * 获取timeType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getTimeType() {
                    return timeType;
                }

                /**
                 * 设置timeType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setTimeType(String value) {
                    this.timeType = value;
                }

                /**
                 * 获取reasonCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getReasonCode() {
                    return reasonCode;
                }

                /**
                 * 设置reasonCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setReasonCode(String value) {
                    this.reasonCode = value;
                }

            }

        }

    }

}
