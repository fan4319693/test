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
 * Flight Solutions Table.
 * 
 * <p>FlightTableType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightTableType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Flight" maxOccurs="unbounded">
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
 *                             &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
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
 *                             &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Carrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType"/>
 *                   &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineOperatorCoreType" minOccurs="0"/>
 *                   &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
 *                   &lt;element name="StopInformation" type="{http://www.opentravel.org/OTA/2003/05}FlightStopType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
 *                   &lt;element name="OnTimeInfo" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="Low" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="High" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="NewFlightInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                           &lt;attribute name="NoDataInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                           &lt;attribute name="NotRequiredInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *                   &lt;element name="Ticketless" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InstantPurchase" minOccurs="0"/>
 *                   &lt;element name="TrafficRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="Classes">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSSeatType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="FlightID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "FlightTableType", propOrder = {
    "flight"
})
public class FlightTableType {

    @XmlElement(name = "Flight", required = true)
    protected List<FlightTableType.Flight> flight;

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
     * {@link FlightTableType.Flight }
     * 
     * 
     */
    public List<FlightTableType.Flight> getFlight() {
        if (flight == null) {
            flight = new ArrayList<FlightTableType.Flight>();
        }
        return this.flight;
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
     *                   &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
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
     *                   &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Carrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineCarrierType"/>
     *         &lt;element name="OperatingCarrier" type="{http://www.opentravel.org/OTA/2003/05}AirlineOperatorCoreType" minOccurs="0"/>
     *         &lt;element name="Equipment" type="{http://www.opentravel.org/OTA/2003/05}EquipmentDetailType"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}NumberOfStops" minOccurs="0"/>
     *         &lt;element name="StopInformation" type="{http://www.opentravel.org/OTA/2003/05}FlightStopType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Meals" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Frequency" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightDuration" minOccurs="0"/>
     *         &lt;element name="OnTimeInfo" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="Low" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="High" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="NewFlightInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *                 &lt;attribute name="NoDataInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *                 &lt;attribute name="NotRequiredInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ElectronicTicketing" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
     *         &lt;element name="Ticketless" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}InstantPurchase" minOccurs="0"/>
     *         &lt;element name="TrafficRestrictions" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="LegMiles" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="Classes">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSSeatType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="FlightID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "frequency",
        "flightDuration",
        "onTimeInfo",
        "electronicTicketing",
        "ticketless",
        "instantPurchase",
        "trafficRestrictions",
        "legMiles",
        "classes"
    })
    public static class Flight {

        @XmlElement(name = "Departure", required = true)
        protected FlightTableType.Flight.Departure departure;
        @XmlElement(name = "Arrival", required = true)
        protected FlightTableType.Flight.Arrival arrival;
        @XmlElement(name = "Carrier", required = true)
        protected AirlineCarrierType carrier;
        @XmlElement(name = "OperatingCarrier")
        protected AirlineOperatorCoreType operatingCarrier;
        @XmlElement(name = "Equipment", required = true)
        protected EquipmentDetailType equipment;
        @XmlElement(name = "NumberOfStops")
        protected Integer numberOfStops;
        @XmlElement(name = "StopInformation")
        protected List<FlightStopType> stopInformation;
        @XmlElement(name = "Meals")
        protected List<String> meals;
        @XmlElement(name = "Frequency")
        protected FlightFrequencyType frequency;
        @XmlElement(name = "FlightDuration")
        protected String flightDuration;
        @XmlElement(name = "OnTimeInfo")
        protected FlightTableType.Flight.OnTimeInfo onTimeInfo;
        @XmlElement(name = "ElectronicTicketing")
        protected String electronicTicketing;
        @XmlElement(name = "Ticketless")
        protected String ticketless;
        @XmlElement(name = "InstantPurchase")
        protected String instantPurchase;
        @XmlElement(name = "TrafficRestrictions")
        protected String trafficRestrictions;
        @XmlElement(name = "LegMiles")
        protected String legMiles;
        @XmlElement(name = "Classes", required = true)
        protected FlightTableType.Flight.Classes classes;
        @XmlAttribute(name = "FlightID")
        protected String flightID;

        /**
         * 获取departure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightTableType.Flight.Departure }
         *     
         */
        public FlightTableType.Flight.Departure getDeparture() {
            return departure;
        }

        /**
         * 设置departure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTableType.Flight.Departure }
         *     
         */
        public void setDeparture(FlightTableType.Flight.Departure value) {
            this.departure = value;
        }

        /**
         * 获取arrival属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightTableType.Flight.Arrival }
         *     
         */
        public FlightTableType.Flight.Arrival getArrival() {
            return arrival;
        }

        /**
         * 设置arrival属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTableType.Flight.Arrival }
         *     
         */
        public void setArrival(FlightTableType.Flight.Arrival value) {
            this.arrival = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirlineCarrierType }
         *     
         */
        public AirlineCarrierType getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineCarrierType }
         *     
         */
        public void setCarrier(AirlineCarrierType value) {
            this.carrier = value;
        }

        /**
         * 获取operatingCarrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirlineOperatorCoreType }
         *     
         */
        public AirlineOperatorCoreType getOperatingCarrier() {
            return operatingCarrier;
        }

        /**
         * 设置operatingCarrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirlineOperatorCoreType }
         *     
         */
        public void setOperatingCarrier(AirlineOperatorCoreType value) {
            this.operatingCarrier = value;
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
         * {@link FlightStopType }
         * 
         * 
         */
        public List<FlightStopType> getStopInformation() {
            if (stopInformation == null) {
                stopInformation = new ArrayList<FlightStopType>();
            }
            return this.stopInformation;
        }

        /**
         * Gets the value of the meals property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the meals property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMeals().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getMeals() {
            if (meals == null) {
                meals = new ArrayList<String>();
            }
            return this.meals;
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
         * 获取onTimeInfo属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightTableType.Flight.OnTimeInfo }
         *     
         */
        public FlightTableType.Flight.OnTimeInfo getOnTimeInfo() {
            return onTimeInfo;
        }

        /**
         * 设置onTimeInfo属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTableType.Flight.OnTimeInfo }
         *     
         */
        public void setOnTimeInfo(FlightTableType.Flight.OnTimeInfo value) {
            this.onTimeInfo = value;
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
         * 获取ticketless属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketless() {
            return ticketless;
        }

        /**
         * 设置ticketless属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketless(String value) {
            this.ticketless = value;
        }

        /**
         * 获取instantPurchase属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getInstantPurchase() {
            return instantPurchase;
        }

        /**
         * 设置instantPurchase属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setInstantPurchase(String value) {
            this.instantPurchase = value;
        }

        /**
         * 获取trafficRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTrafficRestrictions() {
            return trafficRestrictions;
        }

        /**
         * 设置trafficRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTrafficRestrictions(String value) {
            this.trafficRestrictions = value;
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
         *     {@link FlightTableType.Flight.Classes }
         *     
         */
        public FlightTableType.Flight.Classes getClasses() {
            return classes;
        }

        /**
         * 设置classes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightTableType.Flight.Classes }
         *     
         */
        public void setClasses(FlightTableType.Flight.Classes value) {
            this.classes = value;
        }

        /**
         * 获取flightID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightID() {
            return flightID;
        }

        /**
         * 设置flightID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightID(String value) {
            this.flightID = value;
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
         *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
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
            protected String gate;
            @XmlAttribute(name = "DistanceUnit")
            protected DistanceUnitType distanceUnit;
            @XmlAttribute(name = "Area")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger area;

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
             * 获取distanceUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DistanceUnitType }
             *     
             */
            public DistanceUnitType getDistanceUnit() {
                return distanceUnit;
            }

            /**
             * 设置distanceUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DistanceUnitType }
             *     
             */
            public void setDistanceUnit(DistanceUnitType value) {
                this.distanceUnit = value;
            }

            /**
             * 获取area属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getArea() {
                return area;
            }

            /**
             * 设置area属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setArea(BigInteger value) {
                this.area = value;
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
         *         &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSSeatType" maxOccurs="unbounded"/>
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
            protected List<FlightCOSSeatType> classOfService;

            /**
             * Gets the value of the classOfService property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the classOfService property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getClassOfService().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link FlightCOSSeatType }
             * 
             * 
             */
            public List<FlightCOSSeatType> getClassOfService() {
                if (classOfService == null) {
                    classOfService = new ArrayList<FlightCOSSeatType>();
                }
                return this.classOfService;
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
         *         &lt;element name="Gate" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProximityGroup"/>
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
            protected String gate;
            @XmlAttribute(name = "DistanceUnit")
            protected DistanceUnitType distanceUnit;
            @XmlAttribute(name = "Area")
            @XmlSchemaType(name = "unsignedLong")
            protected BigInteger area;

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
             * 获取distanceUnit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link DistanceUnitType }
             *     
             */
            public DistanceUnitType getDistanceUnit() {
                return distanceUnit;
            }

            /**
             * 设置distanceUnit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link DistanceUnitType }
             *     
             */
            public void setDistanceUnit(DistanceUnitType value) {
                this.distanceUnit = value;
            }

            /**
             * 获取area属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getArea() {
                return area;
            }

            /**
             * 设置area属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setArea(BigInteger value) {
                this.area = value;
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
         *       &lt;attribute name="Low" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="High" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="NewFlightInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
         *       &lt;attribute name="NoDataInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
         *       &lt;attribute name="NotRequiredInd" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OnTimeInfo {

            @XmlAttribute(name = "Low")
            protected String low;
            @XmlAttribute(name = "High")
            protected String high;
            @XmlAttribute(name = "NewFlightInd")
            protected String newFlightInd;
            @XmlAttribute(name = "NoDataInd")
            protected String noDataInd;
            @XmlAttribute(name = "NotRequiredInd")
            protected String notRequiredInd;

            /**
             * 获取low属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getLow() {
                return low;
            }

            /**
             * 设置low属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setLow(String value) {
                this.low = value;
            }

            /**
             * 获取high属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHigh() {
                return high;
            }

            /**
             * 设置high属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHigh(String value) {
                this.high = value;
            }

            /**
             * 获取newFlightInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewFlightInd() {
                return newFlightInd;
            }

            /**
             * 设置newFlightInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewFlightInd(String value) {
                this.newFlightInd = value;
            }

            /**
             * 获取noDataInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNoDataInd() {
                return noDataInd;
            }

            /**
             * 设置noDataInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNoDataInd(String value) {
                this.noDataInd = value;
            }

            /**
             * 获取notRequiredInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNotRequiredInd() {
                return notRequiredInd;
            }

            /**
             * 设置notRequiredInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNotRequiredInd(String value) {
                this.notRequiredInd = value;
            }

        }

    }

}
