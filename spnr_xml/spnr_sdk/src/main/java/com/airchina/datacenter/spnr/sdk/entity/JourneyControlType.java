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
 * Journey control information.
 * 
 * <p>JourneyControlType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JourneyControlType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="JCDFlight" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="JCDDeparture">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JCDArrival">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="JCDDate">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
 *                           &lt;attribute name="Qualifier" type="{http://www.opentravel.org/OTA/2003/05}FlightDateType" default="DEPARTURE" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Carrier">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AirlineCode" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType"/>
 *                             &lt;element name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType"/>
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
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType"/>
 *                   &lt;element name="ActionCode" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;minLength value="2"/>
 *                         &lt;maxLength value="2"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="NumberOfStops" minOccurs="0">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                         &lt;minInclusive value="0"/>
 *                         &lt;maxInclusive value="9"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/element>
 *                   &lt;element name="ReservationsDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateTimeStampType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OriginDestinationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MarriedSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MarriedRef">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "JourneyControlType", propOrder = {
    "jcdFlight"
})
public class JourneyControlType {

    @XmlElement(name = "JCDFlight", required = true)
    protected List<JourneyControlType.JCDFlight> jcdFlight;

    /**
     * Gets the value of the jcdFlight property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the jcdFlight property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getJCDFlight().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneyControlType.JCDFlight }
     * 
     * 
     */
    public List<JourneyControlType.JCDFlight> getJCDFlight() {
        if (jcdFlight == null) {
            jcdFlight = new ArrayList<JourneyControlType.JCDFlight>();
        }
        return this.jcdFlight;
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
     *         &lt;element name="JCDDeparture">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JCDArrival">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="JCDDate">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
     *                 &lt;attribute name="Qualifier" type="{http://www.opentravel.org/OTA/2003/05}FlightDateType" default="DEPARTURE" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Carrier">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AirlineCode" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType"/>
     *                   &lt;element name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType"/>
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
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AirlineCode"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightNumber" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ClassOfService" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType"/>
     *         &lt;element name="ActionCode" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *               &lt;minLength value="2"/>
     *               &lt;maxLength value="2"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="NumberOfStops" minOccurs="0">
     *           &lt;simpleType>
     *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *               &lt;minInclusive value="0"/>
     *               &lt;maxInclusive value="9"/>
     *             &lt;/restriction>
     *           &lt;/simpleType>
     *         &lt;/element>
     *         &lt;element name="ReservationsDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateTimeStampType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CnxxIndicator"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginDestinationID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MarriedSegment" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MarriedRef">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}integer">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SegmentIDRef" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jcdDeparture",
        "jcdArrival",
        "jcdDate",
        "carrier",
        "operatingCarrier",
        "classOfService",
        "actionCode",
        "numberOfStops",
        "reservationsDateTime"
    })
    public static class JCDFlight {

        @XmlElement(name = "JCDDeparture", required = true)
        protected JourneyControlType.JCDFlight.JCDDeparture jcdDeparture;
        @XmlElement(name = "JCDArrival", required = true)
        protected JourneyControlType.JCDFlight.JCDArrival jcdArrival;
        @XmlElement(name = "JCDDate", required = true)
        protected JourneyControlType.JCDFlight.JCDDate jcdDate;
        @XmlElement(name = "Carrier", required = true)
        protected JourneyControlType.JCDFlight.Carrier carrier;
        @XmlElement(name = "OperatingCarrier")
        protected JourneyControlType.JCDFlight.OperatingCarrier operatingCarrier;
        @XmlElement(name = "ClassOfService", required = true)
        protected String classOfService;
        @XmlElement(name = "ActionCode")
        protected String actionCode;
        @XmlElement(name = "NumberOfStops")
        protected Integer numberOfStops;
        @XmlElement(name = "ReservationsDateTime")
        protected DateTimeStampType reservationsDateTime;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "OriginDestinationID")
        protected String originDestinationID;
        @XmlAttribute(name = "MarriedSegment")
        protected String marriedSegment;
        @XmlAttribute(name = "MarriedRef")
        protected BigInteger marriedRef;
        @XmlAttribute(name = "SegmentIDRef")
        protected String segmentIDRef;
        @XmlAttribute(name = "CnxxIndicator")
        protected String cnxxIndicator;
        @XmlAttribute(name = "Source")
        protected String source;

        /**
         * 获取jcdDeparture属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneyControlType.JCDFlight.JCDDeparture }
         *     
         */
        public JourneyControlType.JCDFlight.JCDDeparture getJCDDeparture() {
            return jcdDeparture;
        }

        /**
         * 设置jcdDeparture属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneyControlType.JCDFlight.JCDDeparture }
         *     
         */
        public void setJCDDeparture(JourneyControlType.JCDFlight.JCDDeparture value) {
            this.jcdDeparture = value;
        }

        /**
         * 获取jcdArrival属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneyControlType.JCDFlight.JCDArrival }
         *     
         */
        public JourneyControlType.JCDFlight.JCDArrival getJCDArrival() {
            return jcdArrival;
        }

        /**
         * 设置jcdArrival属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneyControlType.JCDFlight.JCDArrival }
         *     
         */
        public void setJCDArrival(JourneyControlType.JCDFlight.JCDArrival value) {
            this.jcdArrival = value;
        }

        /**
         * 获取jcdDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneyControlType.JCDFlight.JCDDate }
         *     
         */
        public JourneyControlType.JCDFlight.JCDDate getJCDDate() {
            return jcdDate;
        }

        /**
         * 设置jcdDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneyControlType.JCDFlight.JCDDate }
         *     
         */
        public void setJCDDate(JourneyControlType.JCDFlight.JCDDate value) {
            this.jcdDate = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneyControlType.JCDFlight.Carrier }
         *     
         */
        public JourneyControlType.JCDFlight.Carrier getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneyControlType.JCDFlight.Carrier }
         *     
         */
        public void setCarrier(JourneyControlType.JCDFlight.Carrier value) {
            this.carrier = value;
        }

        /**
         * 获取operatingCarrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneyControlType.JCDFlight.OperatingCarrier }
         *     
         */
        public JourneyControlType.JCDFlight.OperatingCarrier getOperatingCarrier() {
            return operatingCarrier;
        }

        /**
         * 设置operatingCarrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneyControlType.JCDFlight.OperatingCarrier }
         *     
         */
        public void setOperatingCarrier(JourneyControlType.JCDFlight.OperatingCarrier value) {
            this.operatingCarrier = value;
        }

        /**
         * 获取classOfService属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClassOfService() {
            return classOfService;
        }

        /**
         * 设置classOfService属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClassOfService(String value) {
            this.classOfService = value;
        }

        /**
         * 获取actionCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getActionCode() {
            return actionCode;
        }

        /**
         * 设置actionCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setActionCode(String value) {
            this.actionCode = value;
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
         * 获取reservationsDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DateTimeStampType }
         *     
         */
        public DateTimeStampType getReservationsDateTime() {
            return reservationsDateTime;
        }

        /**
         * 设置reservationsDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeStampType }
         *     
         */
        public void setReservationsDateTime(DateTimeStampType value) {
            this.reservationsDateTime = value;
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
         * 获取originDestinationID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginDestinationID() {
            return originDestinationID;
        }

        /**
         * 设置originDestinationID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginDestinationID(String value) {
            this.originDestinationID = value;
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
         * 获取marriedRef属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMarriedRef() {
            return marriedRef;
        }

        /**
         * 设置marriedRef属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMarriedRef(BigInteger value) {
            this.marriedRef = value;
        }

        /**
         * 获取segmentIDRef属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSegmentIDRef() {
            return segmentIDRef;
        }

        /**
         * 设置segmentIDRef属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSegmentIDRef(String value) {
            this.segmentIDRef = value;
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
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="AirlineCode" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType"/>
         *         &lt;element name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType"/>
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
            "flightNumber"
        })
        public static class Carrier {

            @XmlElement(name = "AirlineCode", required = true)
            protected String airlineCode;
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
         *         &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
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
            "cityCode"
        })
        public static class JCDArrival {

            @XmlElement(name = "CityCode", required = true)
            protected String cityCode;

            /**
             * 获取cityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityCode() {
                return cityCode;
            }

            /**
             * 设置cityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityCode(String value) {
                this.cityCode = value;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>date">
         *       &lt;attribute name="Qualifier" type="{http://www.opentravel.org/OTA/2003/05}FlightDateType" default="DEPARTURE" />
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
        public static class JCDDate {

            @XmlValue
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar value;
            @XmlAttribute(name = "Qualifier")
            protected FlightDateType qualifier;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setValue(XMLGregorianCalendar value) {
                this.value = value;
            }

            /**
             * 获取qualifier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FlightDateType }
             *     
             */
            public FlightDateType getQualifier() {
                if (qualifier == null) {
                    return FlightDateType.DEPARTURE;
                } else {
                    return qualifier;
                }
            }

            /**
             * 设置qualifier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FlightDateType }
             *     
             */
            public void setQualifier(FlightDateType value) {
                this.qualifier = value;
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
         *         &lt;element name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}AirportCityCodeType"/>
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
            "cityCode"
        })
        public static class JCDDeparture {

            @XmlElement(name = "CityCode", required = true)
            protected String cityCode;

            /**
             * 获取cityCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCityCode() {
                return cityCode;
            }

            /**
             * 设置cityCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCityCode(String value) {
                this.cityCode = value;
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
            "flightNumber"
        })
        public static class OperatingCarrier {

            @XmlElement(name = "AirlineCode", required = true)
            protected String airlineCode;
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

    }

}
