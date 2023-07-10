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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * User input required for a service.
 * 
 * <p>UserInputOtherType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UserInputOtherType">
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
 *                                     &lt;sequence>
 *                                       &lt;element name="ElementNumber">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="TattooNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                               &lt;attribute name="TattooQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
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
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="OperatingCarrier" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode" minOccurs="0"/>
 *                                                 &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
 *                                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService" minOccurs="0"/>
 *                                                 &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
 *                                       &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
 *                                       &lt;element name="ActionCode">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                               &lt;attribute name="Status">
 *                                                 &lt;simpleType>
 *                                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                                     &lt;length value="1"/>
 *                                                     &lt;enumeration value="K"/>
 *                                                     &lt;enumeration value="U"/>
 *                                                   &lt;/restriction>
 *                                                 &lt;/simpleType>
 *                                               &lt;/attribute>
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberInParty"/>
 *                                       &lt;element name="Information" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}PAXType" maxOccurs="unbounded"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceRef"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
 *                                     &lt;attribute name="FlownIndicator" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
@XmlType(name = "UserInputOtherType", propOrder = {
    "userText",
    "optionList",
    "userChoices"
})
public class UserInputOtherType {

    @XmlElement(name = "UserText")
    protected List<UserInputOtherType.UserText> userText;
    @XmlElement(name = "OptionList")
    protected List<OptionListType> optionList;
    @XmlElement(name = "UserChoices")
    protected UserInputOtherType.UserChoices userChoices;

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
     * {@link UserInputOtherType.UserText }
     * 
     * 
     */
    public List<UserInputOtherType.UserText> getUserText() {
        if (userText == null) {
            userText = new ArrayList<UserInputOtherType.UserText>();
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
     *     {@link UserInputOtherType.UserChoices }
     *     
     */
    public UserInputOtherType.UserChoices getUserChoices() {
        return userChoices;
    }

    /**
     * 设置userChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserInputOtherType.UserChoices }
     *     
     */
    public void setUserChoices(UserInputOtherType.UserChoices value) {
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
     *                           &lt;sequence>
     *                             &lt;element name="ElementNumber">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="TattooNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                     &lt;attribute name="TattooQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
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
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="OperatingCarrier" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode" minOccurs="0"/>
     *                                       &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService" minOccurs="0"/>
     *                                       &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
     *                             &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
     *                             &lt;element name="ActionCode">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                     &lt;attribute name="Status">
     *                                       &lt;simpleType>
     *                                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                                           &lt;length value="1"/>
     *                                           &lt;enumeration value="K"/>
     *                                           &lt;enumeration value="U"/>
     *                                         &lt;/restriction>
     *                                       &lt;/simpleType>
     *                                     &lt;/attribute>
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberInParty"/>
     *                             &lt;element name="Information" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}PAXType" maxOccurs="unbounded"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceRef"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
     *                           &lt;attribute name="FlownIndicator" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
        protected UserInputOtherType.UserChoices.FlightOptions flightOptions;
        @XmlAttribute(name = "UserInstruction")
        protected String userInstruction;
        @XmlAttribute(name = "Required")
        protected String required;

        /**
         * 获取flightOptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UserInputOtherType.UserChoices.FlightOptions }
         *     
         */
        public UserInputOtherType.UserChoices.FlightOptions getFlightOptions() {
            return flightOptions;
        }

        /**
         * 设置flightOptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UserInputOtherType.UserChoices.FlightOptions }
         *     
         */
        public void setFlightOptions(UserInputOtherType.UserChoices.FlightOptions value) {
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
         *                 &lt;sequence>
         *                   &lt;element name="ElementNumber">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="TattooNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                           &lt;attribute name="TattooQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
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
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="OperatingCarrier" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode" minOccurs="0"/>
         *                             &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService" minOccurs="0"/>
         *                             &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
         *                   &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
         *                   &lt;element name="ActionCode">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                           &lt;attribute name="Status">
         *                             &lt;simpleType>
         *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *                                 &lt;length value="1"/>
         *                                 &lt;enumeration value="K"/>
         *                                 &lt;enumeration value="U"/>
         *                               &lt;/restriction>
         *                             &lt;/simpleType>
         *                           &lt;/attribute>
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberInParty"/>
         *                   &lt;element name="Information" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}PAXType" maxOccurs="unbounded"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceRef"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
         *                 &lt;attribute name="FlownIndicator" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
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
            protected List<UserInputOtherType.UserChoices.FlightOptions.Flight> flight;
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
             * {@link UserInputOtherType.UserChoices.FlightOptions.Flight }
             * 
             * 
             */
            public List<UserInputOtherType.UserChoices.FlightOptions.Flight> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<UserInputOtherType.UserChoices.FlightOptions.Flight>();
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
             *       &lt;sequence>
             *         &lt;element name="ElementNumber">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="TattooNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
             *                 &lt;attribute name="TattooQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
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
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="OperatingCarrier" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode" minOccurs="0"/>
             *                   &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService" minOccurs="0"/>
             *                   &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
             *         &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
             *         &lt;element name="ActionCode">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *                 &lt;attribute name="Status">
             *                   &lt;simpleType>
             *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
             *                       &lt;length value="1"/>
             *                       &lt;enumeration value="K"/>
             *                       &lt;enumeration value="U"/>
             *                     &lt;/restriction>
             *                   &lt;/simpleType>
             *                 &lt;/attribute>
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberInParty"/>
             *         &lt;element name="Information" minOccurs="0">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}PAXType" maxOccurs="unbounded"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceRef"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MarriedSegment"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
             *       &lt;attribute name="FlownIndicator" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "elementNumber",
                "departure",
                "arrival",
                "carrier",
                "operatingCarrier",
                "equipment",
                "numberOfStops",
                "flightDuration",
                "meals",
                "frequency",
                "electronicTicketing",
                "classOfService",
                "actionCode",
                "numberInParty",
                "information"
            })
            public static class Flight {

                @XmlElement(name = "ElementNumber", required = true)
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber elementNumber;
                @XmlElement(name = "Departure", required = true)
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.Departure departure;
                @XmlElement(name = "Arrival", required = true)
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival arrival;
                @XmlElement(name = "Carrier", required = true)
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier carrier;
                @XmlElement(name = "OperatingCarrier")
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier operatingCarrier;
                @XmlElement(name = "Equipment")
                protected EquipmentIDType equipment;
                @XmlElement(name = "NumberOfStops")
                protected Integer numberOfStops;
                @XmlElement(name = "FlightDuration")
                protected String flightDuration;
                @XmlElement(name = "Meals")
                protected String meals;
                @XmlElement(name = "Frequency")
                protected FlightFrequencyType frequency;
                @XmlElement(name = "ElectronicTicketing")
                protected String electronicTicketing;
                @XmlElement(name = "ClassOfService", required = true)
                protected FlightCOSDetailType classOfService;
                @XmlElement(name = "ActionCode", required = true)
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode actionCode;
                @XmlElement(name = "NumberInParty", defaultValue = "1")
                protected int numberInParty;
                @XmlElement(name = "Information")
                protected UserInputOtherType.UserChoices.FlightOptions.Flight.Information information;
                @XmlAttribute(name = "FlownIndicator")
                protected String flownIndicator;
                @XmlAttribute(name = "SourceRef")
                protected String sourceRef;
                @XmlAttribute(name = "Source")
                protected String source;
                @XmlAttribute(name = "MarriedSegment")
                protected String marriedSegment;
                @XmlAttribute(name = "CnxxIndicator")
                protected String cnxxIndicator;

                /**
                 * 获取elementNumber属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber getElementNumber() {
                    return elementNumber;
                }

                /**
                 * 设置elementNumber属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber }
                 *     
                 */
                public void setElementNumber(UserInputOtherType.UserChoices.FlightOptions.Flight.ElementNumber value) {
                    this.elementNumber = value;
                }

                /**
                 * 获取departure属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Departure }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.Departure getDeparture() {
                    return departure;
                }

                /**
                 * 设置departure属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Departure }
                 *     
                 */
                public void setDeparture(UserInputOtherType.UserChoices.FlightOptions.Flight.Departure value) {
                    this.departure = value;
                }

                /**
                 * 获取arrival属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival getArrival() {
                    return arrival;
                }

                /**
                 * 设置arrival属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival }
                 *     
                 */
                public void setArrival(UserInputOtherType.UserChoices.FlightOptions.Flight.Arrival value) {
                    this.arrival = value;
                }

                /**
                 * 获取carrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier getCarrier() {
                    return carrier;
                }

                /**
                 * 设置carrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier }
                 *     
                 */
                public void setCarrier(UserInputOtherType.UserChoices.FlightOptions.Flight.Carrier value) {
                    this.carrier = value;
                }

                /**
                 * 获取operatingCarrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier getOperatingCarrier() {
                    return operatingCarrier;
                }

                /**
                 * 设置operatingCarrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier }
                 *     
                 */
                public void setOperatingCarrier(UserInputOtherType.UserChoices.FlightOptions.Flight.OperatingCarrier value) {
                    this.operatingCarrier = value;
                }

                /**
                 * 获取equipment属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link EquipmentIDType }
                 *     
                 */
                public EquipmentIDType getEquipment() {
                    return equipment;
                }

                /**
                 * 设置equipment属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EquipmentIDType }
                 *     
                 */
                public void setEquipment(EquipmentIDType value) {
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
                 * 获取frequency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightFrequencyType }
                 *     
                 */
                public FlightFrequencyType getFrequency() {
                    return frequency;
                }

                /**
                 * 设置frequency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightFrequencyType }
                 *     
                 */
                public void setFrequency(FlightFrequencyType value) {
                    this.frequency = value;
                }

                /**
                 * 获取electronicTicketing属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getElectronicTicketing() {
                    return electronicTicketing;
                }

                /**
                 * 设置electronicTicketing属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setElectronicTicketing(String value) {
                    this.electronicTicketing = value;
                }

                /**
                 * 获取classOfService属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link FlightCOSDetailType }
                 *     
                 */
                public FlightCOSDetailType getClassOfService() {
                    return classOfService;
                }

                /**
                 * 设置classOfService属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link FlightCOSDetailType }
                 *     
                 */
                public void setClassOfService(FlightCOSDetailType value) {
                    this.classOfService = value;
                }

                /**
                 * 获取actionCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode getActionCode() {
                    return actionCode;
                }

                /**
                 * 设置actionCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode }
                 *     
                 */
                public void setActionCode(UserInputOtherType.UserChoices.FlightOptions.Flight.ActionCode value) {
                    this.actionCode = value;
                }

                /**
                 * 获取numberInParty属性的值。
                 * 
                 */
                public int getNumberInParty() {
                    return numberInParty;
                }

                /**
                 * 设置numberInParty属性的值。
                 * 
                 */
                public void setNumberInParty(int value) {
                    this.numberInParty = value;
                }

                /**
                 * 获取information属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Information }
                 *     
                 */
                public UserInputOtherType.UserChoices.FlightOptions.Flight.Information getInformation() {
                    return information;
                }

                /**
                 * 设置information属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputOtherType.UserChoices.FlightOptions.Flight.Information }
                 *     
                 */
                public void setInformation(UserInputOtherType.UserChoices.FlightOptions.Flight.Information value) {
                    this.information = value;
                }

                /**
                 * 获取flownIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFlownIndicator() {
                    return flownIndicator;
                }

                /**
                 * 设置flownIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFlownIndicator(String value) {
                    this.flownIndicator = value;
                }

                /**
                 * 获取sourceRef属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSourceRef() {
                    return sourceRef;
                }

                /**
                 * 设置sourceRef属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSourceRef(String value) {
                    this.sourceRef = value;
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
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="Status">
                 *         &lt;simpleType>
                 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
                 *             &lt;length value="1"/>
                 *             &lt;enumeration value="K"/>
                 *             &lt;enumeration value="U"/>
                 *           &lt;/restriction>
                 *         &lt;/simpleType>
                 *       &lt;/attribute>
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
                public static class ActionCode {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "Status")
                    protected String status;

                    /**
                     * 获取value属性的值。
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
                    "terminal"
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
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
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
                    @XmlElement(name = "FlightNumber")
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
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirportCode"/>
                 *         &lt;element name="AirportName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element name="Date" type="{http://www.opentravel.org/OTA/2003/05}DateType"/>
                 *         &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType"/>
                 *         &lt;element name="Terminal" type="{http://www.opentravel.org/OTA/2003/05}TerminalType" minOccurs="0"/>
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
                    "terminal"
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

                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
                 *       &lt;attribute name="TattooNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
                 *       &lt;attribute name="TattooQualifier" type="{http://www.w3.org/2001/XMLSchema}string" />
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
                public static class ElementNumber {

                    @XmlValue
                    protected String value;
                    @XmlAttribute(name = "TattooNumber")
                    protected String tattooNumber;
                    @XmlAttribute(name = "TattooQualifier")
                    protected String tattooQualifier;

                    /**
                     * 获取value属性的值。
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
                     * 获取tattooNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTattooNumber() {
                        return tattooNumber;
                    }

                    /**
                     * 设置tattooNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTattooNumber(String value) {
                        this.tattooNumber = value;
                    }

                    /**
                     * 获取tattooQualifier属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getTattooQualifier() {
                        return tattooQualifier;
                    }

                    /**
                     * 设置tattooQualifier属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setTattooQualifier(String value) {
                        this.tattooQualifier = value;
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
                 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}PAXType" maxOccurs="unbounded"/>
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
                    "text"
                })
                public static class Information {

                    @XmlElement(name = "Text", required = true)
                    protected List<String> text;

                    /**
                     * Gets the value of the text property.
                     * 
                     * <p>
                     * This accessor method returns a reference to the live list,
                     * not a snapshot. Therefore any modification you make to the
                     * returned list will be present inside the JAXB object.
                     * This is why there is not a <CODE>set</CODE> method for the text property.
                     * 
                     * <p>
                     * For example, to add a new item, do as follows:
                     * <pre>
                     *    getText().add(newItem);
                     * </pre>
                     * 
                     * 
                     * <p>
                     * Objects of the following type(s) are allowed in the list
                     * {@link String }
                     * 
                     * 
                     */
                    public List<String> getText() {
                        if (text == null) {
                            text = new ArrayList<String>();
                        }
                        return this.text;
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
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode" minOccurs="0"/>
                 *         &lt;element name="AirlineName" type="{http://www.w3.org/2001/XMLSchema}string"/>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
                 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService" minOccurs="0"/>
                 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" minOccurs="0"/>
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
                    "flightNumber",
                    "classOfService",
                    "comment"
                })
                public static class OperatingCarrier {

                    @XmlElement(name = "AirlineCode")
                    protected String airlineCode;
                    @XmlElement(name = "AirlineName", required = true)
                    protected String airlineName;
                    @XmlElement(name = "FlightNumber")
                    protected String flightNumber;
                    @XmlElement(name = "ClassOfService")
                    protected FlightCOSDetailType classOfService;
                    @XmlElement(name = "Comment")
                    protected String comment;

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

                    /**
                     * 获取classOfService属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link FlightCOSDetailType }
                     *     
                     */
                    public FlightCOSDetailType getClassOfService() {
                        return classOfService;
                    }

                    /**
                     * 设置classOfService属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link FlightCOSDetailType }
                     *     
                     */
                    public void setClassOfService(FlightCOSDetailType value) {
                        this.classOfService = value;
                    }

                    /**
                     * 获取comment属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getComment() {
                        return comment;
                    }

                    /**
                     * 设置comment属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setComment(String value) {
                        this.comment = value;
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
