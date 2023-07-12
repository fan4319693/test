//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.Duration;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Provides details of an air segment
 * 
 * <p>PkgAirSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PkgAirSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FlightSegmentBaseType">
 *       &lt;sequence>
 *         &lt;element name="SupplementCharges" type="{http://www.opentravel.org/OTA/2003/05}ChargesType" maxOccurs="2" minOccurs="0"/>
 *         &lt;element name="AvailableSeats" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SeatAvailability" type="{http://www.opentravel.org/OTA/2003/05}SeatAvailabilityType" maxOccurs="26"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Passengers" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CheckInDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Type">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="Charter"/>
 *             &lt;enumeration value="Scheduled"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="DepartureDay" type="{http://www.opentravel.org/OTA/2003/05}DayOfWeekType" />
 *       &lt;attribute name="TravelCode" type="{http://www.opentravel.org/OTA/2003/05}PkgTravelCode" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgAirSegmentType", propOrder = {
    "supplementCharges",
    "availableSeats",
    "passengers"
})
public class PkgAirSegmentType
    extends FlightSegmentBaseType
{

    @XmlElement(name = "SupplementCharges")
    protected List<ChargesType> supplementCharges;
    @XmlElement(name = "AvailableSeats")
    protected PkgAirSegmentType.AvailableSeats availableSeats;
    @XmlElement(name = "Passengers")
    protected PkgAirSegmentType.Passengers passengers;
    @XmlAttribute(name = "CheckInDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar checkInDate;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "DepartureDay")
    protected DayOfWeekType departureDay;
    @XmlAttribute(name = "TravelCode")
    protected String travelCode;
    @XmlAttribute(name = "Duration")
    protected Duration duration;

    /**
     * Gets the value of the supplementCharges property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the supplementCharges property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSupplementCharges().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ChargesType }
     * 
     * 
     */
    public List<ChargesType> getSupplementCharges() {
        if (supplementCharges == null) {
            supplementCharges = new ArrayList<ChargesType>();
        }
        return this.supplementCharges;
    }

    /**
     * 获取availableSeats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType.AvailableSeats }
     *     
     */
    public PkgAirSegmentType.AvailableSeats getAvailableSeats() {
        return availableSeats;
    }

    /**
     * 设置availableSeats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType.AvailableSeats }
     *     
     */
    public void setAvailableSeats(PkgAirSegmentType.AvailableSeats value) {
        this.availableSeats = value;
    }

    /**
     * 获取passengers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType.Passengers }
     *     
     */
    public PkgAirSegmentType.Passengers getPassengers() {
        return passengers;
    }

    /**
     * 设置passengers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType.Passengers }
     *     
     */
    public void setPassengers(PkgAirSegmentType.Passengers value) {
        this.passengers = value;
    }

    /**
     * 获取checkInDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCheckInDate() {
        return checkInDate;
    }

    /**
     * 设置checkInDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCheckInDate(XMLGregorianCalendar value) {
        this.checkInDate = value;
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
     * 获取departureDay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DayOfWeekType }
     *     
     */
    public DayOfWeekType getDepartureDay() {
        return departureDay;
    }

    /**
     * 设置departureDay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DayOfWeekType }
     *     
     */
    public void setDepartureDay(DayOfWeekType value) {
        this.departureDay = value;
    }

    /**
     * 获取travelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTravelCode() {
        return travelCode;
    }

    /**
     * 设置travelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTravelCode(String value) {
        this.travelCode = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
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
     *         &lt;element name="SeatAvailability" type="{http://www.opentravel.org/OTA/2003/05}SeatAvailabilityType" maxOccurs="26"/>
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
        "seatAvailability"
    })
    public static class AvailableSeats {

        @XmlElement(name = "SeatAvailability", required = true)
        protected List<SeatAvailabilityType> seatAvailability;

        /**
         * Gets the value of the seatAvailability property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the seatAvailability property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSeatAvailability().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SeatAvailabilityType }
         * 
         * 
         */
        public List<SeatAvailabilityType> getSeatAvailability() {
            if (seatAvailability == null) {
                seatAvailability = new ArrayList<SeatAvailabilityType>();
            }
            return this.seatAvailability;
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
     *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Passengers {

        @XmlAttribute(name = "PassengerRPH")
        protected List<String> passengerRPH;

        /**
         * Gets the value of the passengerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the passengerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPassengerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getPassengerRPH() {
            if (passengerRPH == null) {
                passengerRPH = new ArrayList<String>();
            }
            return this.passengerRPH;
        }

    }

}
