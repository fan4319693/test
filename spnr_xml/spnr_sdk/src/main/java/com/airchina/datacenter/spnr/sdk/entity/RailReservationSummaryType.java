//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

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
 * Defines the summary data that identifies a reservation. This information also helps in selecting a specific reservation.
 * 
 * <p>RailReservationSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailReservationSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ODInfo" maxOccurs="9">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                   &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                   &lt;element name="TrainSegment" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                             &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
 *                             &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                             &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
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
 *         &lt;element name="PassengerInfo" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerCategoryDetailType" maxOccurs="99"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookingReferenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DateBooked" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}TransactionStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailReservationSummaryType", propOrder = {
    "odInfo",
    "passengerInfo",
    "tpaExtensions"
})
public class RailReservationSummaryType {

    @XmlElement(name = "ODInfo", required = true)
    protected List<RailReservationSummaryType.ODInfo> odInfo;
    @XmlElement(name = "PassengerInfo", required = true)
    protected List<RailPassengerCategoryDetailType> passengerInfo;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "BookingReferenceID")
    protected String bookingReferenceID;
    @XmlAttribute(name = "DateBooked")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar dateBooked;
    @XmlAttribute(name = "Status")
    protected TransactionStatusType status;

    /**
     * Gets the value of the odInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the odInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getODInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailReservationSummaryType.ODInfo }
     * 
     * 
     */
    public List<RailReservationSummaryType.ODInfo> getODInfo() {
        if (odInfo == null) {
            odInfo = new ArrayList<RailReservationSummaryType.ODInfo>();
        }
        return this.odInfo;
    }

    /**
     * Gets the value of the passengerInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerCategoryDetailType }
     * 
     * 
     */
    public List<RailPassengerCategoryDetailType> getPassengerInfo() {
        if (passengerInfo == null) {
            passengerInfo = new ArrayList<RailPassengerCategoryDetailType>();
        }
        return this.passengerInfo;
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
     * 获取bookingReferenceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingReferenceID() {
        return bookingReferenceID;
    }

    /**
     * 设置bookingReferenceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingReferenceID(String value) {
        this.bookingReferenceID = value;
    }

    /**
     * 获取dateBooked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getDateBooked() {
        return dateBooked;
    }

    /**
     * 设置dateBooked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setDateBooked(XMLGregorianCalendar value) {
        this.dateBooked = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TransactionStatusType }
     *     
     */
    public TransactionStatusType getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TransactionStatusType }
     *     
     */
    public void setStatus(TransactionStatusType value) {
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
     *       &lt;sequence>
     *         &lt;element name="OriginLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *         &lt;element name="DestinationLocation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *         &lt;element name="TrainSegment" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *                   &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
     *                   &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *                   &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
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
        "originLocation",
        "destinationLocation",
        "trainSegment"
    })
    public static class ODInfo {

        @XmlElement(name = "OriginLocation", required = true)
        protected LocationType originLocation;
        @XmlElement(name = "DestinationLocation", required = true)
        protected LocationType destinationLocation;
        @XmlElement(name = "TrainSegment", required = true)
        protected List<RailReservationSummaryType.ODInfo.TrainSegment> trainSegment;

        /**
         * 获取originLocation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getOriginLocation() {
            return originLocation;
        }

        /**
         * 设置originLocation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setOriginLocation(LocationType value) {
            this.originLocation = value;
        }

        /**
         * 获取destinationLocation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getDestinationLocation() {
            return destinationLocation;
        }

        /**
         * 设置destinationLocation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setDestinationLocation(LocationType value) {
            this.destinationLocation = value;
        }

        /**
         * Gets the value of the trainSegment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the trainSegment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTrainSegment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RailReservationSummaryType.ODInfo.TrainSegment }
         * 
         * 
         */
        public List<RailReservationSummaryType.ODInfo.TrainSegment> getTrainSegment() {
            if (trainSegment == null) {
                trainSegment = new ArrayList<RailReservationSummaryType.ODInfo.TrainSegment>();
            }
            return this.trainSegment;
        }


        /**
         * Defines train segment summary information, including departure and arrival stations, departure and arrival dates/times, and train identification information.
         * 
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DepartureStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
         *         &lt;element name="ArrivalStation" type="{http://www.opentravel.org/OTA/2003/05}LocationType"/>
         *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="ArrivalDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
         *         &lt;element name="TrainIdentification" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
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
            "departureStation",
            "arrivalStation",
            "departureDateTime",
            "arrivalDateTime",
            "trainIdentification"
        })
        public static class TrainSegment {

            @XmlElement(name = "DepartureStation", required = true)
            protected LocationType departureStation;
            @XmlElement(name = "ArrivalStation", required = true)
            protected LocationType arrivalStation;
            @XmlElement(name = "DepartureDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar departureDateTime;
            @XmlElement(name = "ArrivalDateTime", required = true)
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar arrivalDateTime;
            @XmlElement(name = "TrainIdentification", required = true)
            protected TrainIdentificationType trainIdentification;

            /**
             * 获取departureStation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getDepartureStation() {
                return departureStation;
            }

            /**
             * 设置departureStation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setDepartureStation(LocationType value) {
                this.departureStation = value;
            }

            /**
             * 获取arrivalStation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationType }
             *     
             */
            public LocationType getArrivalStation() {
                return arrivalStation;
            }

            /**
             * 设置arrivalStation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationType }
             *     
             */
            public void setArrivalStation(LocationType value) {
                this.arrivalStation = value;
            }

            /**
             * 获取departureDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepartureDateTime() {
                return departureDateTime;
            }

            /**
             * 设置departureDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepartureDateTime(XMLGregorianCalendar value) {
                this.departureDateTime = value;
            }

            /**
             * 获取arrivalDateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getArrivalDateTime() {
                return arrivalDateTime;
            }

            /**
             * 设置arrivalDateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setArrivalDateTime(XMLGregorianCalendar value) {
                this.arrivalDateTime = value;
            }

            /**
             * 获取trainIdentification属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TrainIdentificationType }
             *     
             */
            public TrainIdentificationType getTrainIdentification() {
                return trainIdentification;
            }

            /**
             * 设置trainIdentification属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TrainIdentificationType }
             *     
             */
            public void setTrainIdentification(TrainIdentificationType value) {
                this.trainIdentification = value;
            }

        }

    }

}
