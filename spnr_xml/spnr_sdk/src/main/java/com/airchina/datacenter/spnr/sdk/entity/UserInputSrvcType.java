//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
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
 * Return of user input/selection from POS application.
 * 
 * <p>UserInputSrvcType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="UserInputSrvcType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UserText" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="InputID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OptionList" type="{http://www.opentravel.org/OTA/2003/05}OptionListInputType" maxOccurs="unbounded" minOccurs="0"/>
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
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
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
 *                                                 &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
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
 *                                                 &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
 *                                                 &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *                                               &lt;/sequence>
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
 *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
 *                                       &lt;element name="ActionCode" minOccurs="0">
 *                                         &lt;complexType>
 *                                           &lt;simpleContent>
 *                                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                             &lt;/extension>
 *                                           &lt;/simpleContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
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
@XmlType(name = "UserInputSrvcType", propOrder = {
    "userText",
    "optionList",
    "userChoices"
})
public class UserInputSrvcType {

    @XmlElement(name = "UserText")
    protected List<UserInputSrvcType.UserText> userText;
    @XmlElement(name = "OptionList")
    protected List<OptionListInputType> optionList;
    @XmlElement(name = "UserChoices")
    protected UserInputSrvcType.UserChoices userChoices;

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
     * {@link UserInputSrvcType.UserText }
     * 
     * 
     */
    public List<UserInputSrvcType.UserText> getUserText() {
        if (userText == null) {
            userText = new ArrayList<UserInputSrvcType.UserText>();
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
     * {@link OptionListInputType }
     * 
     * 
     */
    public List<OptionListInputType> getOptionList() {
        if (optionList == null) {
            optionList = new ArrayList<OptionListInputType>();
        }
        return this.optionList;
    }

    /**
     * 获取userChoices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UserInputSrvcType.UserChoices }
     *     
     */
    public UserInputSrvcType.UserChoices getUserChoices() {
        return userChoices;
    }

    /**
     * 设置userChoices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UserInputSrvcType.UserChoices }
     *     
     */
    public void setUserChoices(UserInputSrvcType.UserChoices value) {
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
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
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
     *                                       &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
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
     *                                       &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
     *                                       &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
     *                             &lt;element name="ActionCode" minOccurs="0">
     *                               &lt;complexType>
     *                                 &lt;simpleContent>
     *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                                   &lt;/extension>
     *                                 &lt;/simpleContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
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
        protected UserInputSrvcType.UserChoices.FlightOptions flightOptions;

        /**
         * 获取flightOptions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UserInputSrvcType.UserChoices.FlightOptions }
         *     
         */
        public UserInputSrvcType.UserChoices.FlightOptions getFlightOptions() {
            return flightOptions;
        }

        /**
         * 设置flightOptions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UserInputSrvcType.UserChoices.FlightOptions }
         *     
         */
        public void setFlightOptions(UserInputSrvcType.UserChoices.FlightOptions value) {
            this.flightOptions = value;
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
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
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
         *                             &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
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
         *                             &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
         *                             &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
         *                           &lt;/sequence>
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
         *                   &lt;element name="ActionCode" minOccurs="0">
         *                     &lt;complexType>
         *                       &lt;simpleContent>
         *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                         &lt;/extension>
         *                       &lt;/simpleContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
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
            protected List<UserInputSrvcType.UserChoices.FlightOptions.Flight> flight;
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
             * {@link UserInputSrvcType.UserChoices.FlightOptions.Flight }
             * 
             * 
             */
            public List<UserInputSrvcType.UserChoices.FlightOptions.Flight> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<UserInputSrvcType.UserChoices.FlightOptions.Flight>();
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
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
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
             *                   &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
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
             *                   &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
             *                   &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
             *                 &lt;/sequence>
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentIDType" minOccurs="0"/>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ClassOfService"/>
             *         &lt;element name="ActionCode" minOccurs="0">
             *           &lt;complexType>
             *             &lt;simpleContent>
             *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *               &lt;/extension>
             *             &lt;/simpleContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "carrier",
                "operatingCarrier",
                "departure",
                "arrival",
                "equipment",
                "classOfService",
                "actionCode"
            })
            public static class Flight {

                @XmlElement(name = "Carrier", required = true)
                protected UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier carrier;
                @XmlElement(name = "OperatingCarrier")
                protected UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier operatingCarrier;
                @XmlElement(name = "Departure", required = true)
                protected UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure departure;
                @XmlElement(name = "Arrival", required = true)
                protected UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival arrival;
                @XmlElement(name = "Equipment")
                protected EquipmentIDType equipment;
                @XmlElement(name = "ClassOfService", required = true)
                protected FlightCOSDetailType classOfService;
                @XmlElement(name = "ActionCode")
                protected UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode actionCode;
                @XmlAttribute(name = "Source")
                protected String source;

                /**
                 * 获取carrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier }
                 *     
                 */
                public UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier getCarrier() {
                    return carrier;
                }

                /**
                 * 设置carrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier }
                 *     
                 */
                public void setCarrier(UserInputSrvcType.UserChoices.FlightOptions.Flight.Carrier value) {
                    this.carrier = value;
                }

                /**
                 * 获取operatingCarrier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier }
                 *     
                 */
                public UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier getOperatingCarrier() {
                    return operatingCarrier;
                }

                /**
                 * 设置operatingCarrier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier }
                 *     
                 */
                public void setOperatingCarrier(UserInputSrvcType.UserChoices.FlightOptions.Flight.OperatingCarrier value) {
                    this.operatingCarrier = value;
                }

                /**
                 * 获取departure属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure }
                 *     
                 */
                public UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure getDeparture() {
                    return departure;
                }

                /**
                 * 设置departure属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure }
                 *     
                 */
                public void setDeparture(UserInputSrvcType.UserChoices.FlightOptions.Flight.Departure value) {
                    this.departure = value;
                }

                /**
                 * 获取arrival属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival }
                 *     
                 */
                public UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival getArrival() {
                    return arrival;
                }

                /**
                 * 设置arrival属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival }
                 *     
                 */
                public void setArrival(UserInputSrvcType.UserChoices.FlightOptions.Flight.Arrival value) {
                    this.arrival = value;
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
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode }
                 *     
                 */
                public UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode getActionCode() {
                    return actionCode;
                }

                /**
                 * 设置actionCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode }
                 *     
                 */
                public void setActionCode(UserInputSrvcType.UserChoices.FlightOptions.Flight.ActionCode value) {
                    this.actionCode = value;
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
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;simpleContent>
                 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
                 *         &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
                 *         &lt;element name="ChangeOfDay" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
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
                    "changeOfDay"
                })
                public static class Arrival {

                    @XmlElement(name = "AirportCode", required = true)
                    protected String airportCode;
                    @XmlElement(name = "AirportName", required = true)
                    protected String airportName;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;
                    @XmlElement(name = "Time")
                    protected String time;
                    @XmlElement(name = "ChangeOfDay")
                    protected BigInteger changeOfDay;

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
                 *         &lt;element name="Time" type="{http://www.opentravel.org/OTA/2003/05}TimeType" minOccurs="0"/>
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
                    "time"
                })
                public static class Departure {

                    @XmlElement(name = "AirportCode", required = true)
                    protected String airportCode;
                    @XmlElement(name = "AirportName", required = true)
                    protected String airportName;
                    @XmlElement(name = "Date", required = true)
                    @XmlSchemaType(name = "date")
                    protected XMLGregorianCalendar date;
                    @XmlElement(name = "Time")
                    protected String time;

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
                    "classOfService"
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="InputID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    public static class UserText {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "InputID", required = true)
        protected String inputID;

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

    }

}
