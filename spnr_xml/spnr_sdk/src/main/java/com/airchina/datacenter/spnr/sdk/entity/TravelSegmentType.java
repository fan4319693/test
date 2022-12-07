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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>TravelSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelSegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Air">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="Reservation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
 *                           &lt;sequence>
 *                             &lt;element name="Seats" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Seat" maxOccurs="unbounded">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                               &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                                               &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                                               &lt;attribute name="SeatLocation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="OrginDestType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                                 &lt;enumeration value="First"/>
 *                                 &lt;enumeration value="Intermediate"/>
 *                                 &lt;enumeration value="Last"/>
 *                                 &lt;enumeration value="Only"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DetailedReservation" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType"/>
 *                 &lt;/choice>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" type="{http://www.opentravel.org/OTA/2003/05}VehicleSegmentCoreType"/>
 *         &lt;element name="Hotel">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Reservation" type="{http://www.opentravel.org/OTA/2003/05}RoomStayLiteType"/>
 *                   &lt;element name="DetailedReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Rail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cruise">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Tour">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="ID_Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="General">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Bus"/>
 *                       &lt;enumeration value="Show"/>
 *                       &lt;enumeration value="Unknown"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Package">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *                 &lt;attribute name="AssocItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GroundTransport">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DetailedReservation">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
 *                             &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
 *                             &lt;element name="CancellationRefunds" type="{http://www.opentravel.org/OTA/2003/05}CancellationRefundsType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activity" type="{http://www.opentravel.org/OTA/2003/05}DestActivityRetrieveInfoType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/choice>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelSegmentType", propOrder = {
    "air",
    "vehicle",
    "hotel",
    "rail",
    "cruise",
    "tour",
    "general",
    "_package",
    "groundTransport",
    "activity",
    "tpaExtensions"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.ReservationItemsType.Item.class
})
public class TravelSegmentType {

    @XmlElement(name = "Air")
    protected TravelSegmentType.Air air;
    @XmlElement(name = "Vehicle")
    protected VehicleSegmentCoreType vehicle;
    @XmlElement(name = "Hotel")
    protected TravelSegmentType.Hotel hotel;
    @XmlElement(name = "Rail")
    protected TravelSegmentType.Rail rail;
    @XmlElement(name = "Cruise")
    protected TravelSegmentType.Cruise cruise;
    @XmlElement(name = "Tour")
    protected TravelSegmentType.Tour tour;
    @XmlElement(name = "General")
    protected TravelSegmentType.General general;
    @XmlElement(name = "Package")
    protected TravelSegmentType.Package _package;
    @XmlElement(name = "GroundTransport")
    protected TravelSegmentType.GroundTransport groundTransport;
    @XmlElement(name = "Activity")
    protected DestActivityRetrieveInfoType activity;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * 获取air属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Air }
     *     
     */
    public TravelSegmentType.Air getAir() {
        return air;
    }

    /**
     * 设置air属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Air }
     *     
     */
    public void setAir(TravelSegmentType.Air value) {
        this.air = value;
    }

    /**
     * 获取vehicle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleSegmentCoreType }
     *     
     */
    public VehicleSegmentCoreType getVehicle() {
        return vehicle;
    }

    /**
     * 设置vehicle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleSegmentCoreType }
     *     
     */
    public void setVehicle(VehicleSegmentCoreType value) {
        this.vehicle = value;
    }

    /**
     * 获取hotel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Hotel }
     *     
     */
    public TravelSegmentType.Hotel getHotel() {
        return hotel;
    }

    /**
     * 设置hotel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Hotel }
     *     
     */
    public void setHotel(TravelSegmentType.Hotel value) {
        this.hotel = value;
    }

    /**
     * 获取rail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Rail }
     *     
     */
    public TravelSegmentType.Rail getRail() {
        return rail;
    }

    /**
     * 设置rail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Rail }
     *     
     */
    public void setRail(TravelSegmentType.Rail value) {
        this.rail = value;
    }

    /**
     * 获取cruise属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Cruise }
     *     
     */
    public TravelSegmentType.Cruise getCruise() {
        return cruise;
    }

    /**
     * 设置cruise属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Cruise }
     *     
     */
    public void setCruise(TravelSegmentType.Cruise value) {
        this.cruise = value;
    }

    /**
     * 获取tour属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Tour }
     *     
     */
    public TravelSegmentType.Tour getTour() {
        return tour;
    }

    /**
     * 设置tour属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Tour }
     *     
     */
    public void setTour(TravelSegmentType.Tour value) {
        this.tour = value;
    }

    /**
     * 获取general属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.General }
     *     
     */
    public TravelSegmentType.General getGeneral() {
        return general;
    }

    /**
     * 设置general属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.General }
     *     
     */
    public void setGeneral(TravelSegmentType.General value) {
        this.general = value;
    }

    /**
     * 获取package属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.Package }
     *     
     */
    public TravelSegmentType.Package getPackage() {
        return _package;
    }

    /**
     * 设置package属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.Package }
     *     
     */
    public void setPackage(TravelSegmentType.Package value) {
        this._package = value;
    }

    /**
     * 获取groundTransport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelSegmentType.GroundTransport }
     *     
     */
    public TravelSegmentType.GroundTransport getGroundTransport() {
        return groundTransport;
    }

    /**
     * 设置groundTransport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelSegmentType.GroundTransport }
     *     
     */
    public void setGroundTransport(TravelSegmentType.GroundTransport value) {
        this.groundTransport = value;
    }

    /**
     * 获取activity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DestActivityRetrieveInfoType }
     *     
     */
    public DestActivityRetrieveInfoType getActivity() {
        return activity;
    }

    /**
     * 设置activity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DestActivityRetrieveInfoType }
     *     
     */
    public void setActivity(DestActivityRetrieveInfoType value) {
        this.activity = value;
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
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;choice>
     *         &lt;element name="Reservation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
     *                 &lt;sequence>
     *                   &lt;element name="Seats" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Seat" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                                     &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                                     &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *                                     &lt;attribute name="SeatLocation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="OrginDestType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *                       &lt;enumeration value="First"/>
     *                       &lt;enumeration value="Intermediate"/>
     *                       &lt;enumeration value="Last"/>
     *                       &lt;enumeration value="Only"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DetailedReservation" type="{http://www.opentravel.org/OTA/2003/05}AirReservationType"/>
     *       &lt;/choice>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "reservation",
        "detailedReservation"
    })
    public static class Air {

        @XmlElement(name = "Reservation")
        protected TravelSegmentType.Air.Reservation reservation;
        @XmlElement(name = "DetailedReservation")
        protected AirReservationType detailedReservation;

        /**
         * 获取reservation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelSegmentType.Air.Reservation }
         *     
         */
        public TravelSegmentType.Air.Reservation getReservation() {
            return reservation;
        }

        /**
         * 设置reservation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelSegmentType.Air.Reservation }
         *     
         */
        public void setReservation(TravelSegmentType.Air.Reservation value) {
            this.reservation = value;
        }

        /**
         * 获取detailedReservation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirReservationType }
         *     
         */
        public AirReservationType getDetailedReservation() {
            return detailedReservation;
        }

        /**
         * 设置detailedReservation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirReservationType }
         *     
         */
        public void setDetailedReservation(AirReservationType value) {
            this.detailedReservation = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BookFlightSegmentType">
         *       &lt;sequence>
         *         &lt;element name="Seats" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Seat" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *                           &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *                           &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *                           &lt;attribute name="SeatLocation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="OrginDestType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
         *             &lt;enumeration value="First"/>
         *             &lt;enumeration value="Intermediate"/>
         *             &lt;enumeration value="Last"/>
         *             &lt;enumeration value="Only"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "seats",
            "tpaExtensions"
        })
        public static class Reservation
            extends BookFlightSegmentType
        {

            @XmlElement(name = "Seats")
            protected TravelSegmentType.Air.Reservation.Seats seats;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "OrginDestType")
            @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
            protected String orginDestType;

            /**
             * 获取seats属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TravelSegmentType.Air.Reservation.Seats }
             *     
             */
            public TravelSegmentType.Air.Reservation.Seats getSeats() {
                return seats;
            }

            /**
             * 设置seats属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TravelSegmentType.Air.Reservation.Seats }
             *     
             */
            public void setSeats(TravelSegmentType.Air.Reservation.Seats value) {
                this.seats = value;
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
             * 获取orginDestType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOrginDestType() {
                return orginDestType;
            }

            /**
             * 设置orginDestType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOrginDestType(String value) {
                this.orginDestType = value;
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
             *         &lt;element name="Seat" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
             *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
             *                 &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
             *                 &lt;attribute name="SeatLocation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
                "seat"
            })
            public static class Seats {

                @XmlElement(name = "Seat", required = true)
                protected List<TravelSegmentType.Air.Reservation.Seats.Seat> seat;

                /**
                 * Gets the value of the seat property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the seat property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getSeat().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link TravelSegmentType.Air.Reservation.Seats.Seat }
                 * 
                 * 
                 */
                public List<TravelSegmentType.Air.Reservation.Seats.Seat> getSeat() {
                    if (seat == null) {
                        seat = new ArrayList<TravelSegmentType.Air.Reservation.Seats.Seat>();
                    }
                    return this.seat;
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
                 *       &lt;attribute name="CustomerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
                 *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
                 *       &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
                 *       &lt;attribute name="SeatLocation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Seat {

                    @XmlAttribute(name = "CustomerRPH")
                    protected String customerRPH;
                    @XmlAttribute(name = "Number")
                    protected String number;
                    @XmlAttribute(name = "Characteristic")
                    protected String characteristic;
                    @XmlAttribute(name = "SeatLocation")
                    protected String seatLocation;

                    /**
                     * 获取customerRPH属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCustomerRPH() {
                        return customerRPH;
                    }

                    /**
                     * 设置customerRPH属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCustomerRPH(String value) {
                        this.customerRPH = value;
                    }

                    /**
                     * 获取number属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getNumber() {
                        return number;
                    }

                    /**
                     * 设置number属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setNumber(String value) {
                        this.number = value;
                    }

                    /**
                     * 获取characteristic属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCharacteristic() {
                        return characteristic;
                    }

                    /**
                     * 设置characteristic属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCharacteristic(String value) {
                        this.characteristic = value;
                    }

                    /**
                     * 获取seatLocation属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSeatLocation() {
                        return seatLocation;
                    }

                    /**
                     * 设置seatLocation属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSeatLocation(String value) {
                        this.seatLocation = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
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
        "tpaExtensions"
    })
    public static class Cruise {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Bus"/>
     *             &lt;enumeration value="Show"/>
     *             &lt;enumeration value="Unknown"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "tpaExtensions"
    })
    public static class General {

        @XmlElement(name = "Description", required = true)
        protected FreeTextType description;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setDescription(FreeTextType value) {
            this.description = value;
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
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *         &lt;element name="DetailedReservation">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
     *                   &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
     *                   &lt;element name="CancellationRefunds" type="{http://www.opentravel.org/OTA/2003/05}CancellationRefundsType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="EndDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "detailedReservation"
    })
    public static class GroundTransport {

        @XmlElement(name = "DetailedReservation", required = true)
        protected TravelSegmentType.GroundTransport.DetailedReservation detailedReservation;
        @XmlAttribute(name = "EndDate")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar endDate;

        /**
         * 获取detailedReservation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TravelSegmentType.GroundTransport.DetailedReservation }
         *     
         */
        public TravelSegmentType.GroundTransport.DetailedReservation getDetailedReservation() {
            return detailedReservation;
        }

        /**
         * 设置detailedReservation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TravelSegmentType.GroundTransport.DetailedReservation }
         *     
         */
        public void setDetailedReservation(TravelSegmentType.GroundTransport.DetailedReservation value) {
            this.detailedReservation = value;
        }

        /**
         * 获取endDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEndDate() {
            return endDate;
        }

        /**
         * 设置endDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEndDate(XMLGregorianCalendar value) {
            this.endDate = value;
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
         *         &lt;element name="QRData" type="{http://www.opentravel.org/OTA/2003/05}QRDataType" minOccurs="0"/>
         *         &lt;element name="SupplierBookingReferenceID" type="{http://www.opentravel.org/OTA/2003/05}SupplierBookingReferenceIDType" minOccurs="0"/>
         *         &lt;element name="CancellationRefunds" type="{http://www.opentravel.org/OTA/2003/05}CancellationRefundsType" minOccurs="0"/>
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
            "qrData",
            "supplierBookingReferenceID",
            "cancellationRefunds"
        })
        public static class DetailedReservation {

            @XmlElement(name = "QRData")
            protected QRDataType qrData;
            @XmlElement(name = "SupplierBookingReferenceID")
            protected SupplierBookingReferenceIDType supplierBookingReferenceID;
            @XmlElement(name = "CancellationRefunds")
            protected CancellationRefundsType cancellationRefunds;

            /**
             * 获取qrData属性的值。
             * 
             * @return
             *     possible object is
             *     {@link QRDataType }
             *     
             */
            public QRDataType getQRData() {
                return qrData;
            }

            /**
             * 设置qrData属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link QRDataType }
             *     
             */
            public void setQRData(QRDataType value) {
                this.qrData = value;
            }

            /**
             * 获取supplierBookingReferenceID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SupplierBookingReferenceIDType }
             *     
             */
            public SupplierBookingReferenceIDType getSupplierBookingReferenceID() {
                return supplierBookingReferenceID;
            }

            /**
             * 设置supplierBookingReferenceID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SupplierBookingReferenceIDType }
             *     
             */
            public void setSupplierBookingReferenceID(SupplierBookingReferenceIDType value) {
                this.supplierBookingReferenceID = value;
            }

            /**
             * 获取cancellationRefunds属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CancellationRefundsType }
             *     
             */
            public CancellationRefundsType getCancellationRefunds() {
                return cancellationRefunds;
            }

            /**
             * 设置cancellationRefunds属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CancellationRefundsType }
             *     
             */
            public void setCancellationRefunds(CancellationRefundsType value) {
                this.cancellationRefunds = value;
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
     *         &lt;element name="Reservation" type="{http://www.opentravel.org/OTA/2003/05}RoomStayLiteType"/>
     *         &lt;element name="DetailedReservation" type="{http://www.opentravel.org/OTA/2003/05}HotelReservationType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
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
        "reservation",
        "detailedReservation",
        "tpaExtensions"
    })
    public static class Hotel {

        @XmlElement(name = "Reservation", required = true)
        protected RoomStayLiteType reservation;
        @XmlElement(name = "DetailedReservation")
        protected HotelReservationType detailedReservation;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

        /**
         * 获取reservation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RoomStayLiteType }
         *     
         */
        public RoomStayLiteType getReservation() {
            return reservation;
        }

        /**
         * 设置reservation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RoomStayLiteType }
         *     
         */
        public void setReservation(RoomStayLiteType value) {
            this.reservation = value;
        }

        /**
         * 获取detailedReservation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link HotelReservationType }
         *     
         */
        public HotelReservationType getDetailedReservation() {
            return detailedReservation;
        }

        /**
         * 设置detailedReservation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link HotelReservationType }
         *     
         */
        public void setDetailedReservation(HotelReservationType value) {
            this.detailedReservation = value;
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="ItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *       &lt;attribute name="AssocItemRPH_List" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tpaExtensions"
    })
    public static class Package {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ItemRPH_List")
        protected List<String> itemRPHList;
        @XmlAttribute(name = "AssocItemRPH_List")
        protected List<String> assocItemRPHList;

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
         * Gets the value of the itemRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the itemRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getItemRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getItemRPHList() {
            if (itemRPHList == null) {
                itemRPHList = new ArrayList<String>();
            }
            return this.itemRPHList;
        }

        /**
         * Gets the value of the assocItemRPHList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assocItemRPHList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssocItemRPHList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getAssocItemRPHList() {
            if (assocItemRPHList == null) {
                assocItemRPHList = new ArrayList<String>();
            }
            return this.assocItemRPHList;
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
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
        "tpaExtensions"
    })
    public static class Rail {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="ID_Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "tpaExtensions"
    })
    public static class Tour {

        @XmlElement(name = "Description", required = true)
        protected FreeTextType description;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ID_Type")
        protected String idType;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

        /**
         * 获取description属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FreeTextType }
         *     
         */
        public FreeTextType getDescription() {
            return description;
        }

        /**
         * 设置description属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FreeTextType }
         *     
         */
        public void setDescription(FreeTextType value) {
            this.description = value;
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
         * 获取idType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIDType() {
            return idType;
        }

        /**
         * 设置idType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIDType(String value) {
            this.idType = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
        }

    }

}
