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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * User input required for a service in a response message.
 * 
 * <p>UserInputResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UserInputResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="InputID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="UserInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OptionList" type="{http://www.opentravel.org/OTA/2003/05}OptionListType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="UserChoices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightOptions">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Flight" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence minOccurs="0">
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}JourneyTime" minOccurs="0"/>
 *                                       &lt;element name="Segment" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Departure">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
 *                                                           &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
 *                                                           &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
 *                                                           &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
 *                                                           &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Arrival">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
 *                                                           &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
 *                                                           &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
 *                                                           &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                                           &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
 *                                                           &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="Carrier">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
 *                                                           &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType" minOccurs="0"/>
 *                                                 &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentSummaryType"/>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
 *                                                 &lt;element name="StopInformation" maxOccurs="6" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
 *                                                           &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                           &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
 *                                                           &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
 *                                                           &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
 *                                                           &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
 *                                                           &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
 *                                                           &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                                         &lt;/sequence>
 *                                                         &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
 *                                                 &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                                                 &lt;element name="Classes" minOccurs="0">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;sequence>
 *                                                           &lt;element name="ClassOfService">
 *                                                             &lt;complexType>
 *                                                               &lt;simpleContent>
 *                                                                 &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
 *                                                                   &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
 *                                                                   &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
 *                                                                   &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                                                 &lt;/extension>
 *                                                               &lt;/simpleContent>
 *                                                             &lt;/complexType>
 *                                                           &lt;/element>
 *                                                         &lt;/sequence>
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
 *                                               &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                                               &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="UserInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
@XmlType(name = "UserInputResponseType", propOrder = {
    "userText",
    "optionList",
    "userChoices"
})
public class UserInputResponseType {

    @XmlElement(name = "UserText")
    protected List<UserInputResponseType.UserText> userText;
    @XmlElement(name = "OptionList")
    protected List<OptionListType> optionList;
    @XmlElement(name = "UserChoices")
    protected UserInputResponseType.UserChoices userChoices;

    /**
     * Gets the value of the userText property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userText property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserText().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link UserInputResponseType.UserText }
     * 
     * 
     */
    public List<UserInputResponseType.UserText> getUserText() {
        if (userText == null) {
            userText = new ArrayList<UserInputResponseType.UserText>();
        }
        return this.userText;
    }

    /**
     * Gets the value of the optionList property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the optionList property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOptionList().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OptionListType }
     * 
     * 
     */
    public List<OptionListType> getOptionList() {
        if (optionList == null) {
            optionList = new ArrayList<OptionListType>();
        }
        return this.optionList;
    }

    /**
     * 获取userChoices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserInputResponseType.UserChoices }
     *     
     */
    public UserInputResponseType.UserChoices getUserChoices() {
        return userChoices;
    }

    /**
     * 设置userChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserInputResponseType.UserChoices }
     *     
     */
    public void setUserChoices(UserInputResponseType.UserChoices value) {
        this.userChoices = value;
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
     *         &lt;element name="FlightOptions">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flight" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence minOccurs="0">
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}JourneyTime" minOccurs="0"/>
     *                             &lt;element name="Segment" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Departure">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
     *                                                 &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
     *                                                 &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
     *                                                 &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
     *                                                 &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Arrival">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
     *                                                 &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
     *                                                 &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
     *                                                 &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                                 &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
     *                                                 &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="Carrier">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
     *                                                 &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType" minOccurs="0"/>
     *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentSummaryType"/>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
     *                                       &lt;element name="StopInformation" maxOccurs="6" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
     *                                                 &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                                 &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
     *                                                 &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
     *                                                 &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
     *                                                 &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
     *                                                 &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
     *                                                 &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                               &lt;/sequence>
     *                                               &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
     *                                       &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                                       &lt;element name="Classes" minOccurs="0">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;sequence>
     *                                                 &lt;element name="ClassOfService">
     *                                                   &lt;complexType>
     *                                                     &lt;simpleContent>
     *                                                       &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
     *                                                         &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
     *                                                         &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
     *                                                         &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                                                       &lt;/extension>
     *                                                     &lt;/simpleContent>
     *                                                   &lt;/complexType>
     *                                                 &lt;/element>
     *                                               &lt;/sequence>
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
     *                                     &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *                                     &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="UserInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightOptions"
    })
    public static class UserChoices {

        @XmlElement(name = "FlightOptions", required = true)
        protected UserInputResponseType.UserChoices.FlightOptions flightOptions;
        @XmlAttribute(name = "UserInstruction")
        protected String userInstruction;
        @XmlAttribute(name = "Required")
        protected String required;

        /**
         * 获取flightOptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UserInputResponseType.UserChoices.FlightOptions }
         *     
         */
        public UserInputResponseType.UserChoices.FlightOptions getFlightOptions() {
            return flightOptions;
        }

        /**
         * 设置flightOptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UserInputResponseType.UserChoices.FlightOptions }
         *     
         */
        public void setFlightOptions(UserInputResponseType.UserChoices.FlightOptions value) {
            this.flightOptions = value;
        }

        /**
         * 获取userInstruction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserInstruction() {
            return userInstruction;
        }

        /**
         * 设置userInstruction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserInstruction(String value) {
            this.userInstruction = value;
        }

        /**
         * 获取required属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequired() {
            return required;
        }

        /**
         * 设置required属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequired(String value) {
            this.required = value;
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
         *         &lt;element name="Flight" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence minOccurs="0">
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}JourneyTime" minOccurs="0"/>
         *                   &lt;element name="Segment" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Departure">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
         *                                       &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
         *                                       &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
         *                                       &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
         *                                       &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Arrival">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
         *                                       &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
         *                                       &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
         *                                       &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                                       &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
         *                                       &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="Carrier">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
         *                                       &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType" minOccurs="0"/>
         *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentSummaryType"/>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
         *                             &lt;element name="StopInformation" maxOccurs="6" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
         *                                       &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                                       &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
         *                                       &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
         *                                       &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
         *                                       &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
         *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
         *                                       &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                                     &lt;/sequence>
         *                                     &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
         *                             &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *                             &lt;element name="Classes" minOccurs="0">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;sequence>
         *                                       &lt;element name="ClassOfService">
         *                                         &lt;complexType>
         *                                           &lt;simpleContent>
         *                                             &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
         *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
         *                                               &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
         *                                               &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                                             &lt;/extension>
         *                                           &lt;/simpleContent>
         *                                         &lt;/complexType>
         *                                       &lt;/element>
         *                                     &lt;/sequence>
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
         *                           &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
         *                           &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DepartureArrivalCode"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "flight"
        })
        public static class FlightOptions {

            @XmlElement(name = "Flight", required = true)
            protected List<UserInputResponseType.UserChoices.FlightOptions.Flight> flight;
            @XmlAttribute(name = "DepartureCode", required = true)
            protected String departureCode;
            @XmlAttribute(name = "ArrivalCode", required = true)
            protected String arrivalCode;

            /**
             * Gets the value of the flight property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the flight property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getFlight().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UserInputResponseType.UserChoices.FlightOptions.Flight }
             * 
             * 
             */
            public List<UserInputResponseType.UserChoices.FlightOptions.Flight> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<UserInputResponseType.UserChoices.FlightOptions.Flight>();
                }
                return this.flight;
            }

            /**
             * 获取departureCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDepartureCode() {
                return departureCode;
            }

            /**
             * 设置departureCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDepartureCode(String value) {
                this.departureCode = value;
            }

            /**
             * 获取arrivalCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getArrivalCode() {
                return arrivalCode;
            }

            /**
             * 设置arrivalCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setArrivalCode(String value) {
                this.arrivalCode = value;
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
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}JourneyTime" minOccurs="0"/>
             *         &lt;element name="Segment" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Departure">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
             *                             &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
             *                             &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
             *                             &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
             *                             &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Arrival">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
             *                             &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
             *                             &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
             *                             &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                             &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
             *                             &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="Carrier">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
             *                             &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType" minOccurs="0"/>
             *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentSummaryType"/>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
             *                   &lt;element name="StopInformation" maxOccurs="6" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
             *                             &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                             &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
             *                             &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
             *                             &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
             *                             &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
             *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
             *                             &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                           &lt;/sequence>
             *                           &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
             *                   &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
             *                   &lt;element name="Classes" minOccurs="0">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;sequence>
             *                             &lt;element name="ClassOfService">
             *                               &lt;complexType>
             *                                 &lt;simpleContent>
             *                                   &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
             *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
             *                                     &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
             *                                     &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *                                   &lt;/extension>
             *                                 &lt;/simpleContent>
             *                               &lt;/complexType>
             *                             &lt;/element>
             *                           &lt;/sequence>
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
             *                 &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
             *                 &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
                "journeyTime",
                "segment"
            })
            public static class Flight {

                @XmlElement(name = "JourneyTime")
                protected String journeyTime;
                @XmlElement(name = "Segment")
                protected List<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment> segment;

                /**
                 * 获取journeyTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getJourneyTime() {
                    return journeyTime;
                }

                /**
                 * 设置journeyTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setJourneyTime(String value) {
                    this.journeyTime = value;
                }

                /**
                 * Gets the value of the segment property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the segment property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSegment().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment }
                 * 
                 * 
                 */
                public List<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment> getSegment() {
                    if (segment == null) {
                        segment = new ArrayList<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment>();
                    }
                    return this.segment;
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
                 *         &lt;element name="Departure">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                 *                   &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                 *                   &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                 *                   &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                 *                   &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Arrival">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                 *                   &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                 *                   &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                 *                   &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                 *                   &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                 *                   &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="Carrier">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
                 *                   &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType" minOccurs="0"/>
                 *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentSummaryType"/>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
                 *         &lt;element name="StopInformation" maxOccurs="6" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                 *                   &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *                   &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                 *                   &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                 *                   &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                 *                   &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                 *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
                 *                   &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                 *                 &lt;/sequence>
                 *                 &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
                 *         &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
                 *         &lt;element name="Classes" minOccurs="0">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;sequence>
                 *                   &lt;element name="ClassOfService">
                 *                     &lt;complexType>
                 *                       &lt;simpleContent>
                 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
                 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
                 *                           &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
                 *                           &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                 *                         &lt;/extension>
                 *                       &lt;/simpleContent>
                 *                     &lt;/complexType>
                 *                   &lt;/element>
                 *                 &lt;/sequence>
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
                 *       &lt;attribute name="ChangeOfAirport" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
                 *       &lt;attribute name="SecureFlight" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "departure",
                    "arrival",
                    "carrier",
                    "operatingCarrier",
                    "equipment",
                    "numberOfStops",
                    "stopInformation",
                    "meals",
                    "flightDuration",
                    "legMiles",
                    "classes"
                })
                public static class Segment {

                    @XmlElement(name = "Departure", required = true)
                    protected UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure departure;
                    @XmlElement(name = "Arrival", required = true)
                    protected UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival arrival;
                    @XmlElement(name = "Carrier", required = true)
                    protected UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier carrier;
                    @XmlElement(name = "OperatingCarrier")
                    protected AirlineCarrierType operatingCarrier;
                    @XmlElement(name = "Equipment", required = true)
                    protected EquipmentSummaryType equipment;
                    @XmlElement(name = "NumberOfStops")
                    protected Integer numberOfStops;
                    @XmlElement(name = "StopInformation")
                    protected List<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation> stopInformation;
                    @XmlElement(name = "Meals")
                    protected String meals;
                    @XmlElement(name = "FlightDuration")
                    protected String flightDuration;
                    @XmlElement(name = "LegMiles")
                    protected String legMiles;
                    @XmlElement(name = "Classes")
                    protected UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes classes;
                    @XmlAttribute(name = "ChangeOfAirport")
                    protected String changeOfAirport;
                    @XmlAttribute(name = "SecureFlight")
                    protected String secureFlight;
                    @XmlAttribute(name = "MarriedSegment")
                    protected String marriedSegment;
                    @XmlAttribute(name = "CnxxIndicator")
                    protected String cnxxIndicator;

                    /**
                     * 获取departure属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure }
                     *     
                     */
                    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure getDeparture() {
                        return departure;
                    }

                    /**
                     * 设置departure属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure }
                     *     
                     */
                    public void setDeparture(UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Departure value) {
                        this.departure = value;
                    }

                    /**
                     * 获取arrival属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival }
                     *     
                     */
                    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival getArrival() {
                        return arrival;
                    }

                    /**
                     * 设置arrival属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival }
                     *     
                     */
                    public void setArrival(UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Arrival value) {
                        this.arrival = value;
                    }

                    /**
                     * 获取carrier属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier }
                     *     
                     */
                    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier getCarrier() {
                        return carrier;
                    }

                    /**
                     * 设置carrier属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier }
                     *     
                     */
                    public void setCarrier(UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Carrier value) {
                        this.carrier = value;
                    }

                    /**
                     * 获取operatingCarrier属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link AirlineCarrierType }
                     *     
                     */
                    public AirlineCarrierType getOperatingCarrier() {
                        return operatingCarrier;
                    }

                    /**
                     * 设置operatingCarrier属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link AirlineCarrierType }
                     *     
                     */
                    public void setOperatingCarrier(AirlineCarrierType value) {
                        this.operatingCarrier = value;
                    }

                    /**
                     * 获取equipment属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link EquipmentSummaryType }
                     *     
                     */
                    public EquipmentSummaryType getEquipment() {
                        return equipment;
                    }

                    /**
                     * 设置equipment属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link EquipmentSummaryType }
                     *     
                     */
                    public void setEquipment(EquipmentSummaryType value) {
                        this.equipment = value;
                    }

                    /**
                     * 获取numberOfStops属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link Integer }
                     *     
                     */
                    public Integer getNumberOfStops() {
                        return numberOfStops;
                    }

                    /**
                     * 设置numberOfStops属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link Integer }
                     *     
                     */
                    public void setNumberOfStops(Integer value) {
                        this.numberOfStops = value;
                    }

                    /**
                     * Gets the value of the stopInformation property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the stopInformation property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getStopInformation().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation }
                     * 
                     * 
                     */
                    public List<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation> getStopInformation() {
                        if (stopInformation == null) {
                            stopInformation = new ArrayList<UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.StopInformation>();
                        }
                        return this.stopInformation;
                    }

                    /**
                     * 获取meals属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMeals() {
                        return meals;
                    }

                    /**
                     * 设置meals属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMeals(String value) {
                        this.meals = value;
                    }

                    /**
                     * 获取flightDuration属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getFlightDuration() {
                        return flightDuration;
                    }

                    /**
                     * 设置flightDuration属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setFlightDuration(String value) {
                        this.flightDuration = value;
                    }

                    /**
                     * 获取legMiles属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getLegMiles() {
                        return legMiles;
                    }

                    /**
                     * 设置legMiles属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setLegMiles(String value) {
                        this.legMiles = value;
                    }

                    /**
                     * 获取classes属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes }
                     *     
                     */
                    public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes getClasses() {
                        return classes;
                    }

                    /**
                     * 设置classes属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes }
                     *     
                     */
                    public void setClasses(UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes value) {
                        this.classes = value;
                    }

                    /**
                     * 获取changeOfAirport属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getChangeOfAirport() {
                        return changeOfAirport;
                    }

                    /**
                     * 设置changeOfAirport属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setChangeOfAirport(String value) {
                        this.changeOfAirport = value;
                    }

                    /**
                     * 获取secureFlight属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSecureFlight() {
                        return secureFlight;
                    }

                    /**
                     * 设置secureFlight属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSecureFlight(String value) {
                        this.secureFlight = value;
                    }

                    /**
                     * 获取marriedSegment属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getMarriedSegment() {
                        return marriedSegment;
                    }

                    /**
                     * 设置marriedSegment属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setMarriedSegment(String value) {
                        this.marriedSegment = value;
                    }

                    /**
                     * 获取cnxxIndicator属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCnxxIndicator() {
                        return cnxxIndicator;
                    }

                    /**
                     * 设置cnxxIndicator属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCnxxIndicator(String value) {
                        this.cnxxIndicator = value;
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
                     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                     *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                     *         &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                     *         &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                     *         &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                     *         &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
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
                        "airportCode",
                        "airportName",
                        "date",
                        "time",
                        "changeOfDay",
                        "terminal",
                        "gate"
                    })
                    public static class Arrival {

                        @XmlElement(name = "AirportCode", required = true)
                        protected String airportCode;
                        @XmlElement(name = "AirportName", required = true)
                        protected String airportName;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;
                        @XmlElement(name = "Time", required = true)
                        protected String time;
                        @XmlElement(name = "ChangeOfDay")
                        protected BigInteger changeOfDay;
                        @XmlElement(name = "Terminal")
                        protected TerminalType terminal;
                        @XmlElement(name = "Gate")
                        protected TerminalType gate;

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
                         * 获取airportName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirportName() {
                            return airportName;
                        }

                        /**
                         * 设置airportName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirportName(String value) {
                            this.airportName = value;
                        }

                        /**
                         * 获取date属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * 设置date属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
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
                         * 获取changeOfDay属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getChangeOfDay() {
                            return changeOfDay;
                        }

                        /**
                         * 设置changeOfDay属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setChangeOfDay(BigInteger value) {
                            this.changeOfDay = value;
                        }

                        /**
                         * 获取terminal属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TerminalType }
                         *     
                         */
                        public TerminalType getTerminal() {
                            return terminal;
                        }

                        /**
                         * 设置terminal属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TerminalType }
                         *     
                         */
                        public void setTerminal(TerminalType value) {
                            this.terminal = value;
                        }

                        /**
                         * 获取gate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TerminalType }
                         *     
                         */
                        public TerminalType getGate() {
                            return gate;
                        }

                        /**
                         * 设置gate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TerminalType }
                         *     
                         */
                        public void setGate(TerminalType value) {
                            this.gate = value;
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
                     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
                     *         &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber"/>
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
                        "airlineCode",
                        "airlineName",
                        "flightNumber"
                    })
                    public static class Carrier {

                        @XmlElement(name = "AirlineCode", required = true)
                        protected String airlineCode;
                        @XmlElement(name = "AirlineName", required = true)
                        protected String airlineName;
                        @XmlElement(name = "FlightNumber", required = true)
                        protected String flightNumber;

                        /**
                         * 获取airlineCode属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirlineCode() {
                            return airlineCode;
                        }

                        /**
                         * 设置airlineCode属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirlineCode(String value) {
                            this.airlineCode = value;
                        }

                        /**
                         * 获取airlineName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirlineName() {
                            return airlineName;
                        }

                        /**
                         * 设置airlineName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirlineName(String value) {
                            this.airlineName = value;
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
                     *         &lt;element name="ClassOfService">
                     *           &lt;complexType>
                     *             &lt;simpleContent>
                     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
                     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
                     *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
                     *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                     *               &lt;/extension>
                     *             &lt;/simpleContent>
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
                        "classOfService"
                    })
                    public static class Classes {

                        @XmlElement(name = "ClassOfService", required = true)
                        protected UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService classOfService;

                        /**
                         * 获取classOfService属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService }
                         *     
                         */
                        public UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService getClassOfService() {
                            return classOfService;
                        }

                        /**
                         * 设置classOfService属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService }
                         *     
                         */
                        public void setClassOfService(UserInputResponseType.UserChoices.FlightOptions.Flight.Segment.Classes.ClassOfService value) {
                            this.classOfService = value;
                        }


                        /**
                         * <p>anonymous complex type的 Java 类。
                         * 
                         * <p>以下模式片段指定包含在此类中的预期内容。
                         * 
                         * <pre>
                         * &lt;complexType>
                         *   &lt;simpleContent>
                         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FlightCOSType">
                         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceClassName"/>
                         *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}AvailSeatStatusType" />
                         *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
                         *     &lt;/extension>
                         *   &lt;/simpleContent>
                         * &lt;/complexType>
                         * </pre>
                         * 
                         * 
                         */
                        @XmlAccessorType(XmlAccessType.FIELD)
                        @XmlType(name = "", propOrder = {
                            "value"
                        })
                        public static class ClassOfService {

                            @XmlValue
                            protected String value;
                            @XmlAttribute(name = "Status")
                            protected String status;
                            @XmlAttribute(name = "Quantity")
                            @XmlSchemaType(name = "positiveInteger")
                            protected BigInteger quantity;
                            @XmlAttribute(name = "PriceClassName")
                            protected String priceClassName;

                            /**
                             *  =accepted values=
                             * One alpha character from A through Z. 
                             * ATPCO ENCODING: In ATPCO data processing, this is referred to as the RBD.
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getValue() {
                                return value;
                            }

                            /**
                             * 设置value属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setValue(String value) {
                                this.value = value;
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
                             * 获取priceClassName属性的值。
                             * 
                             * @return
                             *     possible object is
                             *     {@link String }
                             *     
                             */
                            public String getPriceClassName() {
                                return priceClassName;
                            }

                            /**
                             * 设置priceClassName属性的值。
                             * 
                             * @param value
                             *     allowed object is
                             *     {@link String }
                             *     
                             */
                            public void setPriceClassName(String value) {
                                this.priceClassName = value;
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
                     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                     *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                     *         &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                     *         &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
                     *         &lt;element name="Gate" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
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
                        "airportCode",
                        "airportName",
                        "date",
                        "time",
                        "terminal",
                        "gate"
                    })
                    public static class Departure {

                        @XmlElement(name = "AirportCode", required = true)
                        protected String airportCode;
                        @XmlElement(name = "AirportName", required = true)
                        protected String airportName;
                        @XmlElement(name = "Date", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar date;
                        @XmlElement(name = "Time", required = true)
                        protected String time;
                        @XmlElement(name = "Terminal")
                        protected TerminalType terminal;
                        @XmlElement(name = "Gate")
                        protected TerminalType gate;

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
                         * 获取airportName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirportName() {
                            return airportName;
                        }

                        /**
                         * 设置airportName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirportName(String value) {
                            this.airportName = value;
                        }

                        /**
                         * 获取date属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDate() {
                            return date;
                        }

                        /**
                         * 设置date属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDate(XMLGregorianCalendar value) {
                            this.date = value;
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
                         * 获取terminal属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TerminalType }
                         *     
                         */
                        public TerminalType getTerminal() {
                            return terminal;
                        }

                        /**
                         * 设置terminal属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TerminalType }
                         *     
                         */
                        public void setTerminal(TerminalType value) {
                            this.terminal = value;
                        }

                        /**
                         * 获取gate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link TerminalType }
                         *     
                         */
                        public TerminalType getGate() {
                            return gate;
                        }

                        /**
                         * 设置gate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link TerminalType }
                         *     
                         */
                        public void setGate(TerminalType value) {
                            this.gate = value;
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
                     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                     *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                     *         &lt;element name="ArrivalDate" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                     *         &lt;element name="ArrivalTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                     *         &lt;element name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date"/>
                     *         &lt;element name="DepartureTime" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                     *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType" minOccurs="0"/>
                     *         &lt;element name="GroundTime" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
                     *       &lt;/sequence>
                     *       &lt;attribute name="ChangeOfGauge" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "", propOrder = {
                        "airportCode",
                        "airportName",
                        "arrivalDate",
                        "arrivalTime",
                        "departureDate",
                        "departureTime",
                        "equipment",
                        "groundTime"
                    })
                    public static class StopInformation {

                        @XmlElement(name = "AirportCode", required = true)
                        protected String airportCode;
                        @XmlElement(name = "AirportName", required = true)
                        protected String airportName;
                        @XmlElement(name = "ArrivalDate", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar arrivalDate;
                        @XmlElement(name = "ArrivalTime", required = true)
                        protected String arrivalTime;
                        @XmlElement(name = "DepartureDate", required = true)
                        @XmlSchemaType(name = "date")
                        protected XMLGregorianCalendar departureDate;
                        @XmlElement(name = "DepartureTime", required = true)
                        protected String departureTime;
                        @XmlElement(name = "Equipment")
                        protected EquipmentDetailType equipment;
                        @XmlElement(name = "GroundTime")
                        protected BigInteger groundTime;
                        @XmlAttribute(name = "ChangeOfGauge")
                        protected String changeOfGauge;

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
                         * 获取airportName属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getAirportName() {
                            return airportName;
                        }

                        /**
                         * 设置airportName属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setAirportName(String value) {
                            this.airportName = value;
                        }

                        /**
                         * 获取arrivalDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getArrivalDate() {
                            return arrivalDate;
                        }

                        /**
                         * 设置arrivalDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setArrivalDate(XMLGregorianCalendar value) {
                            this.arrivalDate = value;
                        }

                        /**
                         * 获取arrivalTime属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getArrivalTime() {
                            return arrivalTime;
                        }

                        /**
                         * 设置arrivalTime属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setArrivalTime(String value) {
                            this.arrivalTime = value;
                        }

                        /**
                         * 获取departureDate属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public XMLGregorianCalendar getDepartureDate() {
                            return departureDate;
                        }

                        /**
                         * 设置departureDate属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link XMLGregorianCalendar }
                         *     
                         */
                        public void setDepartureDate(XMLGregorianCalendar value) {
                            this.departureDate = value;
                        }

                        /**
                         * 获取departureTime属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getDepartureTime() {
                            return departureTime;
                        }

                        /**
                         * 设置departureTime属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setDepartureTime(String value) {
                            this.departureTime = value;
                        }

                        /**
                         * 获取equipment属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link EquipmentDetailType }
                         *     
                         */
                        public EquipmentDetailType getEquipment() {
                            return equipment;
                        }

                        /**
                         * 设置equipment属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link EquipmentDetailType }
                         *     
                         */
                        public void setEquipment(EquipmentDetailType value) {
                            this.equipment = value;
                        }

                        /**
                         * 获取groundTime属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link BigInteger }
                         *     
                         */
                        public BigInteger getGroundTime() {
                            return groundTime;
                        }

                        /**
                         * 设置groundTime属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link BigInteger }
                         *     
                         */
                        public void setGroundTime(BigInteger value) {
                            this.groundTime = value;
                        }

                        /**
                         * 获取changeOfGauge属性的值。
                         * 
                         * @return
                         *     possible object is
                         *     {@link String }
                         *     
                         */
                        public String getChangeOfGauge() {
                            return changeOfGauge;
                        }

                        /**
                         * 设置changeOfGauge属性的值。
                         * 
                         * @param value
                         *     allowed object is
                         *     {@link String }
                         *     
                         */
                        public void setChangeOfGauge(String value) {
                            this.changeOfGauge = value;
                        }

                    }

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
     *       &lt;attribute name="InputID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="UserInstruction" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Required" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class UserText {

        @XmlAttribute(name = "InputID", required = true)
        protected String inputID;
        @XmlAttribute(name = "UserInstruction")
        protected String userInstruction;
        @XmlAttribute(name = "Required")
        protected String required;

        /**
         * 获取inputID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInputID() {
            return inputID;
        }

        /**
         * 设置inputID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInputID(String value) {
            this.inputID = value;
        }

        /**
         * 获取userInstruction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUserInstruction() {
            return userInstruction;
        }

        /**
         * 设置userInstruction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUserInstruction(String value) {
            this.userInstruction = value;
        }

        /**
         * 获取required属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRequired() {
            return required;
        }

        /**
         * 设置required属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRequired(String value) {
            this.required = value;
        }

    }

}
