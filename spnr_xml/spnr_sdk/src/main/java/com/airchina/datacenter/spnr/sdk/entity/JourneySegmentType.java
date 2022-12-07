//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
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


/**
 * Journey Segment information which may be a train and/or a bus segment.
 * 
 * <p>JourneySegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="JourneySegmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingOffices" type="{http://www.opentravel.org/OTA/2003/05}BookingOfficesType" minOccurs="0"/>
 *         &lt;choice>
 *           &lt;element name="TrainSegment" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TrainSegmentType">
 *                   &lt;sequence>
 *                     &lt;element name="TrainOrigin" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                     &lt;element name="TrainDestination" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *                     &lt;element name="RailAmenities" type="{http://www.opentravel.org/OTA/2003/05}RailAmenityType" minOccurs="0"/>
 *                     &lt;element name="AvailabilityDetail" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="ClassCode" minOccurs="0">
 *                                 &lt;complexType>
 *                                   &lt;complexContent>
 *                                     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
 *                                     &lt;/extension>
 *                                   &lt;/complexContent>
 *                                 &lt;/complexType>
 *                               &lt;/element>
 *                               &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                               &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AncillaryService" minOccurs="0"/>
 *                               &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationType" minOccurs="0"/>
 *                             &lt;/sequence>
 *                             &lt;attribute name="ReservationClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ReservationType">
 *                               &lt;simpleType>
 *                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                   &lt;enumeration value="Reservable"/>
 *                                   &lt;enumeration value="NotReservable"/>
 *                                 &lt;/restriction>
 *                               &lt;/simpleType>
 *                             &lt;/attribute>
 *                             &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="IsBicycleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                             &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
 *                     &lt;element name="Remarks" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                   &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                   &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="RestrictedServiceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                   &lt;attribute name="CancelledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="BusSegment" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BusSegmentType">
 *                   &lt;sequence>
 *                     &lt;element name="ClassCodes" maxOccurs="unbounded" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
 *                             &lt;attribute name="ReservationClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="ReservationType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                             &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;/extension>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="Remarks" minOccurs="0">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="FareOption" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="TotalFare">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AlternateCurrencyTotal" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationType"/>
 *                   &lt;element name="PriceDetail" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailPriceType">
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OperationScheduleRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "JourneySegmentType", propOrder = {
    "bookingOffices",
    "trainSegment",
    "busSegment",
    "fareOption"
})
public class JourneySegmentType {

    @XmlElement(name = "BookingOffices")
    protected BookingOfficesType bookingOffices;
    @XmlElement(name = "TrainSegment")
    protected JourneySegmentType.TrainSegment trainSegment;
    @XmlElement(name = "BusSegment")
    protected JourneySegmentType.BusSegment busSegment;
    @XmlElement(name = "FareOption")
    protected List<JourneySegmentType.FareOption> fareOption;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "SupplierCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String supplierCode;

    /**
     * 获取bookingOffices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficesType }
     *     
     */
    public BookingOfficesType getBookingOffices() {
        return bookingOffices;
    }

    /**
     * 设置bookingOffices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficesType }
     *     
     */
    public void setBookingOffices(BookingOfficesType value) {
        this.bookingOffices = value;
    }

    /**
     * 获取trainSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JourneySegmentType.TrainSegment }
     *     
     */
    public JourneySegmentType.TrainSegment getTrainSegment() {
        return trainSegment;
    }

    /**
     * 设置trainSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JourneySegmentType.TrainSegment }
     *     
     */
    public void setTrainSegment(JourneySegmentType.TrainSegment value) {
        this.trainSegment = value;
    }

    /**
     * 获取busSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link JourneySegmentType.BusSegment }
     *     
     */
    public JourneySegmentType.BusSegment getBusSegment() {
        return busSegment;
    }

    /**
     * 设置busSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link JourneySegmentType.BusSegment }
     *     
     */
    public void setBusSegment(JourneySegmentType.BusSegment value) {
        this.busSegment = value;
    }

    /**
     * Gets the value of the fareOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the fareOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFareOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link JourneySegmentType.FareOption }
     * 
     * 
     */
    public List<JourneySegmentType.FareOption> getFareOption() {
        if (fareOption == null) {
            fareOption = new ArrayList<JourneySegmentType.FareOption>();
        }
        return this.fareOption;
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
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}BusSegmentType">
     *       &lt;sequence>
     *         &lt;element name="ClassCodes" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
     *                 &lt;attribute name="ReservationClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReservationType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Remarks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "classCodes",
        "remarks"
    })
    public static class BusSegment
        extends BusSegmentType
    {

        @XmlElement(name = "ClassCodes")
        protected List<JourneySegmentType.BusSegment.ClassCodes> classCodes;
        @XmlElement(name = "Remarks")
        protected JourneySegmentType.BusSegment.Remarks remarks;

        /**
         * Gets the value of the classCodes property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the classCodes property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getClassCodes().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneySegmentType.BusSegment.ClassCodes }
         * 
         * 
         */
        public List<JourneySegmentType.BusSegment.ClassCodes> getClassCodes() {
            if (classCodes == null) {
                classCodes = new ArrayList<JourneySegmentType.BusSegment.ClassCodes>();
            }
            return this.classCodes;
        }

        /**
         * 获取remarks属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneySegmentType.BusSegment.Remarks }
         *     
         */
        public JourneySegmentType.BusSegment.Remarks getRemarks() {
            return remarks;
        }

        /**
         * 设置remarks属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneySegmentType.BusSegment.Remarks }
         *     
         */
        public void setRemarks(JourneySegmentType.BusSegment.Remarks value) {
            this.remarks = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
         *       &lt;attribute name="ReservationClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ClassCodes
            extends ClassCodeType
        {

            @XmlAttribute(name = "ReservationClass", required = true)
            protected String reservationClass;
            @XmlAttribute(name = "ReservationType", required = true)
            protected String reservationType;
            @XmlAttribute(name = "VehicleType")
            protected String vehicleType;
            @XmlAttribute(name = "AlternativeInd")
            protected Boolean alternativeInd;

            /**
             * 获取reservationClass属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationClass() {
                return reservationClass;
            }

            /**
             * 设置reservationClass属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationClass(String value) {
                this.reservationClass = value;
            }

            /**
             * 获取reservationType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationType() {
                return reservationType;
            }

            /**
             * 设置reservationType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationType(String value) {
                this.reservationType = value;
            }

            /**
             * 获取vehicleType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicleType() {
                return vehicleType;
            }

            /**
             * 设置vehicleType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicleType(String value) {
                this.vehicleType = value;
            }

            /**
             * 获取alternativeInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAlternativeInd() {
                return alternativeInd;
            }

            /**
             * 设置alternativeInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAlternativeInd(Boolean value) {
                this.alternativeInd = value;
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
         *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
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
            "remark"
        })
        public static class Remarks {

            @XmlElement(name = "Remark", required = true)
            protected List<WarningType> remark;

            /**
             * Gets the value of the remark property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remark property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemark().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link WarningType }
             * 
             * 
             */
            public List<WarningType> getRemark() {
                if (remark == null) {
                    remark = new ArrayList<WarningType>();
                }
                return this.remark;
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
     *         &lt;element name="TotalFare">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AlternateCurrencyTotal" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationType"/>
     *         &lt;element name="PriceDetail" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailPriceType">
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OperationScheduleRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "totalFare",
        "accommodation",
        "priceDetail"
    })
    public static class FareOption {

        @XmlElement(name = "TotalFare", required = true)
        protected JourneySegmentType.FareOption.TotalFare totalFare;
        @XmlElement(name = "Accommodation", required = true)
        protected AccommodationType accommodation;
        @XmlElement(name = "PriceDetail", required = true)
        protected List<JourneySegmentType.FareOption.PriceDetail> priceDetail;
        @XmlAttribute(name = "OperationScheduleRPH")
        protected String operationScheduleRPH;

        /**
         * 获取totalFare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneySegmentType.FareOption.TotalFare }
         *     
         */
        public JourneySegmentType.FareOption.TotalFare getTotalFare() {
            return totalFare;
        }

        /**
         * 设置totalFare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneySegmentType.FareOption.TotalFare }
         *     
         */
        public void setTotalFare(JourneySegmentType.FareOption.TotalFare value) {
            this.totalFare = value;
        }

        /**
         * 获取accommodation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AccommodationType }
         *     
         */
        public AccommodationType getAccommodation() {
            return accommodation;
        }

        /**
         * 设置accommodation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AccommodationType }
         *     
         */
        public void setAccommodation(AccommodationType value) {
            this.accommodation = value;
        }

        /**
         * Gets the value of the priceDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneySegmentType.FareOption.PriceDetail }
         * 
         * 
         */
        public List<JourneySegmentType.FareOption.PriceDetail> getPriceDetail() {
            if (priceDetail == null) {
                priceDetail = new ArrayList<JourneySegmentType.FareOption.PriceDetail>();
            }
            return this.priceDetail;
        }

        /**
         * 获取operationScheduleRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOperationScheduleRPH() {
            return operationScheduleRPH;
        }

        /**
         * 设置operationScheduleRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOperationScheduleRPH(String value) {
            this.operationScheduleRPH = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailPriceType">
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PriceDetail
            extends RailPriceType
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
         *         &lt;element name="AlternateCurrencyTotal" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "alternateCurrencyTotal"
        })
        public static class TotalFare {

            @XmlElement(name = "AlternateCurrencyTotal")
            protected List<JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal> alternateCurrencyTotal;
            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "PrePayInd")
            protected Boolean prePayInd;
            @XmlAttribute(name = "OriginalAmount")
            protected Float originalAmount;
            @XmlAttribute(name = "OriginalCurrencyCode")
            protected String originalCurrencyCode;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;
            @XmlAttribute(name = "DecimalPlaces")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger decimalPlaces;

            /**
             * Gets the value of the alternateCurrencyTotal property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the alternateCurrencyTotal property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getAlternateCurrencyTotal().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal }
             * 
             * 
             */
            public List<JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal> getAlternateCurrencyTotal() {
                if (alternateCurrencyTotal == null) {
                    alternateCurrencyTotal = new ArrayList<JourneySegmentType.FareOption.TotalFare.AlternateCurrencyTotal>();
                }
                return this.alternateCurrencyTotal;
            }

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmount(Float value) {
                this.amount = value;
            }

            /**
             * 获取prePayInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPrePayInd() {
                return prePayInd;
            }

            /**
             * 设置prePayInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPrePayInd(Boolean value) {
                this.prePayInd = value;
            }

            /**
             * 获取originalAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getOriginalAmount() {
                return originalAmount;
            }

            /**
             * 设置originalAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setOriginalAmount(Float value) {
                this.originalAmount = value;
            }

            /**
             * 获取originalCurrencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalCurrencyCode() {
                return originalCurrencyCode;
            }

            /**
             * 设置originalCurrencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalCurrencyCode(String value) {
                this.originalCurrencyCode = value;
            }

            /**
             * 获取currencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * 设置currencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

            /**
             * 获取decimalPlaces属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getDecimalPlaces() {
                return decimalPlaces;
            }

            /**
             * 设置decimalPlaces属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setDecimalPlaces(BigInteger value) {
                this.decimalPlaces = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class AlternateCurrencyTotal {

                @XmlAttribute(name = "Amount")
                protected Float amount;
                @XmlAttribute(name = "PrePayInd")
                protected Boolean prePayInd;
                @XmlAttribute(name = "OriginalAmount")
                protected Float originalAmount;
                @XmlAttribute(name = "OriginalCurrencyCode")
                protected String originalCurrencyCode;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;

                /**
                 * 获取amount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getAmount() {
                    return amount;
                }

                /**
                 * 设置amount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setAmount(Float value) {
                    this.amount = value;
                }

                /**
                 * 获取prePayInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPrePayInd() {
                    return prePayInd;
                }

                /**
                 * 设置prePayInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPrePayInd(Boolean value) {
                    this.prePayInd = value;
                }

                /**
                 * 获取originalAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getOriginalAmount() {
                    return originalAmount;
                }

                /**
                 * 设置originalAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setOriginalAmount(Float value) {
                    this.originalAmount = value;
                }

                /**
                 * 获取originalCurrencyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginalCurrencyCode() {
                    return originalCurrencyCode;
                }

                /**
                 * 设置originalCurrencyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginalCurrencyCode(String value) {
                    this.originalCurrencyCode = value;
                }

                /**
                 * 获取currencyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCurrencyCode() {
                    return currencyCode;
                }

                /**
                 * 设置currencyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCurrencyCode(String value) {
                    this.currencyCode = value;
                }

                /**
                 * 获取decimalPlaces属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * 设置decimalPlaces属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TrainSegmentType">
     *       &lt;sequence>
     *         &lt;element name="TrainOrigin" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *         &lt;element name="TrainDestination" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
     *         &lt;element name="RailAmenities" type="{http://www.opentravel.org/OTA/2003/05}RailAmenityType" minOccurs="0"/>
     *         &lt;element name="AvailabilityDetail" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ClassCode" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AncillaryService" minOccurs="0"/>
     *                   &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationType" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ReservationClass" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ReservationType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Reservable"/>
     *                       &lt;enumeration value="NotReservable"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IsBicycleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="VendorMessages" type="{http://www.opentravel.org/OTA/2003/05}VendorMessagesType" minOccurs="0"/>
     *         &lt;element name="Remarks" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OnTimeRate" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *       &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="RestrictedServiceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CancelledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trainOrigin",
        "trainDestination",
        "railAmenities",
        "availabilityDetail",
        "vendorMessages",
        "remarks"
    })
    public static class TrainSegment
        extends TrainSegmentType
    {

        @XmlElement(name = "TrainOrigin")
        protected LocationType trainOrigin;
        @XmlElement(name = "TrainDestination")
        protected LocationType trainDestination;
        @XmlElement(name = "RailAmenities")
        protected RailAmenityType railAmenities;
        @XmlElement(name = "AvailabilityDetail")
        protected List<JourneySegmentType.TrainSegment.AvailabilityDetail> availabilityDetail;
        @XmlElement(name = "VendorMessages")
        protected VendorMessagesType vendorMessages;
        @XmlElement(name = "Remarks")
        protected JourneySegmentType.TrainSegment.Remarks remarks;
        @XmlAttribute(name = "OnTimeRate")
        protected BigDecimal onTimeRate;
        @XmlAttribute(name = "AlternativeInd")
        protected Boolean alternativeInd;
        @XmlAttribute(name = "RestrictedServiceInd")
        protected Boolean restrictedServiceInd;
        @XmlAttribute(name = "CancelledInd")
        protected Boolean cancelledInd;

        /**
         * 获取trainOrigin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getTrainOrigin() {
            return trainOrigin;
        }

        /**
         * 设置trainOrigin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setTrainOrigin(LocationType value) {
            this.trainOrigin = value;
        }

        /**
         * 获取trainDestination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link LocationType }
         *     
         */
        public LocationType getTrainDestination() {
            return trainDestination;
        }

        /**
         * 设置trainDestination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link LocationType }
         *     
         */
        public void setTrainDestination(LocationType value) {
            this.trainDestination = value;
        }

        /**
         * 获取railAmenities属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RailAmenityType }
         *     
         */
        public RailAmenityType getRailAmenities() {
            return railAmenities;
        }

        /**
         * 设置railAmenities属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RailAmenityType }
         *     
         */
        public void setRailAmenities(RailAmenityType value) {
            this.railAmenities = value;
        }

        /**
         * Gets the value of the availabilityDetail property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the availabilityDetail property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAvailabilityDetail().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link JourneySegmentType.TrainSegment.AvailabilityDetail }
         * 
         * 
         */
        public List<JourneySegmentType.TrainSegment.AvailabilityDetail> getAvailabilityDetail() {
            if (availabilityDetail == null) {
                availabilityDetail = new ArrayList<JourneySegmentType.TrainSegment.AvailabilityDetail>();
            }
            return this.availabilityDetail;
        }

        /**
         * 获取vendorMessages属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VendorMessagesType }
         *     
         */
        public VendorMessagesType getVendorMessages() {
            return vendorMessages;
        }

        /**
         * 设置vendorMessages属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VendorMessagesType }
         *     
         */
        public void setVendorMessages(VendorMessagesType value) {
            this.vendorMessages = value;
        }

        /**
         * 获取remarks属性的值。
         * 
         * @return
         *     possible object is
         *     {@link JourneySegmentType.TrainSegment.Remarks }
         *     
         */
        public JourneySegmentType.TrainSegment.Remarks getRemarks() {
            return remarks;
        }

        /**
         * 设置remarks属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link JourneySegmentType.TrainSegment.Remarks }
         *     
         */
        public void setRemarks(JourneySegmentType.TrainSegment.Remarks value) {
            this.remarks = value;
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
         * 获取alternativeInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isAlternativeInd() {
            return alternativeInd;
        }

        /**
         * 设置alternativeInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setAlternativeInd(Boolean value) {
            this.alternativeInd = value;
        }

        /**
         * 获取restrictedServiceInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRestrictedServiceInd() {
            return restrictedServiceInd;
        }

        /**
         * 设置restrictedServiceInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRestrictedServiceInd(Boolean value) {
            this.restrictedServiceInd = value;
        }

        /**
         * 获取cancelledInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCancelledInd() {
            return cancelledInd;
        }

        /**
         * 设置cancelledInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCancelledInd(Boolean value) {
            this.cancelledInd = value;
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
         *         &lt;element name="ClassCode" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
         *               &lt;/extension>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AncillaryService" minOccurs="0"/>
         *         &lt;element name="Accommodation" type="{http://www.opentravel.org/OTA/2003/05}AccommodationType" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ReservationClass" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ReservationType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Reservable"/>
         *             &lt;enumeration value="NotReservable"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="VehicleType" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IsBicycleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AlternativeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "classCode",
            "reference",
            "ancillaryService",
            "accommodation"
        })
        public static class AvailabilityDetail {

            @XmlElement(name = "ClassCode")
            protected JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode classCode;
            @XmlElement(name = "Reference")
            protected String reference;
            @XmlElement(name = "AncillaryService")
            protected AncillaryService ancillaryService;
            @XmlElement(name = "Accommodation")
            protected AccommodationType accommodation;
            @XmlAttribute(name = "ReservationClass")
            protected String reservationClass;
            @XmlAttribute(name = "ReservationType")
            protected String reservationType;
            @XmlAttribute(name = "VehicleType")
            protected String vehicleType;
            @XmlAttribute(name = "IsBicycleInd")
            protected Boolean isBicycleInd;
            @XmlAttribute(name = "AlternativeInd")
            protected Boolean alternativeInd;

            /**
             * 获取classCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode }
             *     
             */
            public JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode getClassCode() {
                return classCode;
            }

            /**
             * 设置classCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode }
             *     
             */
            public void setClassCode(JourneySegmentType.TrainSegment.AvailabilityDetail.ClassCode value) {
                this.classCode = value;
            }

            /**
             * 获取reference属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReference() {
                return reference;
            }

            /**
             * 设置reference属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReference(String value) {
                this.reference = value;
            }

            /**
             * 获取ancillaryService属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AncillaryService }
             *     
             */
            public AncillaryService getAncillaryService() {
                return ancillaryService;
            }

            /**
             * 设置ancillaryService属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AncillaryService }
             *     
             */
            public void setAncillaryService(AncillaryService value) {
                this.ancillaryService = value;
            }

            /**
             * 获取accommodation属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AccommodationType }
             *     
             */
            public AccommodationType getAccommodation() {
                return accommodation;
            }

            /**
             * 设置accommodation属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AccommodationType }
             *     
             */
            public void setAccommodation(AccommodationType value) {
                this.accommodation = value;
            }

            /**
             * 获取reservationClass属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationClass() {
                return reservationClass;
            }

            /**
             * 设置reservationClass属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationClass(String value) {
                this.reservationClass = value;
            }

            /**
             * 获取reservationType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getReservationType() {
                return reservationType;
            }

            /**
             * 设置reservationType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setReservationType(String value) {
                this.reservationType = value;
            }

            /**
             * 获取vehicleType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getVehicleType() {
                return vehicleType;
            }

            /**
             * 设置vehicleType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setVehicleType(String value) {
                this.vehicleType = value;
            }

            /**
             * 获取isBicycleInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsBicycleInd() {
                return isBicycleInd;
            }

            /**
             * 设置isBicycleInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsBicycleInd(Boolean value) {
                this.isBicycleInd = value;
            }

            /**
             * 获取alternativeInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAlternativeInd() {
                return alternativeInd;
            }

            /**
             * 设置alternativeInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAlternativeInd(Boolean value) {
                this.alternativeInd = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ClassCodeType">
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ClassCode
                extends ClassCodeType
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
         *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}WarningType" maxOccurs="99"/>
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
            "remark"
        })
        public static class Remarks {

            @XmlElement(name = "Remark", required = true)
            protected List<WarningType> remark;

            /**
             * Gets the value of the remark property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the remark property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRemark().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link WarningType }
             * 
             * 
             */
            public List<WarningType> getRemark() {
                if (remark == null) {
                    remark = new ArrayList<WarningType>();
                }
                return this.remark;
            }

        }

    }

}
