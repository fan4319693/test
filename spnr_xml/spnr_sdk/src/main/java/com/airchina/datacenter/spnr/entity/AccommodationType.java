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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Type of accommodation including classes of Seat, berth, compartment on a train with seat map detail. 
 * 
 * <p>AccommodationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;sequence>
 *             &lt;element name="Seat" type="{http://www.opentravel.org/OTA/2003/05}SeatAccommodationType"/>
 *             &lt;element name="SeatAvailabilityDetail" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Car" maxOccurs="unbounded" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Compartment" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="Seat" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                                                   &lt;/sequence>
 *                                                   &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                                                   &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
 *                                                   &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
 *                                                   &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                                         &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;sequence>
 *             &lt;element name="Berth" type="{http://www.opentravel.org/OTA/2003/05}BerthAccommodationType"/>
 *             &lt;element name="BerthAvailabilityDetail" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;complexContent>
 *                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                     &lt;sequence>
 *                       &lt;element name="Car" maxOccurs="unbounded" minOccurs="0">
 *                         &lt;complexType>
 *                           &lt;complexContent>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                               &lt;sequence>
 *                                 &lt;element name="Compartment" maxOccurs="unbounded">
 *                                   &lt;complexType>
 *                                     &lt;complexContent>
 *                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                         &lt;sequence>
 *                                           &lt;element name="Berth" maxOccurs="unbounded">
 *                                             &lt;complexType>
 *                                               &lt;complexContent>
 *                                                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                   &lt;sequence>
 *                                                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                                                   &lt;/sequence>
 *                                                   &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                                                   &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
 *                                                   &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                                 &lt;/restriction>
 *                                               &lt;/complexContent>
 *                                             &lt;/complexType>
 *                                           &lt;/element>
 *                                           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                                         &lt;/sequence>
 *                                         &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                                         &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
 *                                       &lt;/restriction>
 *                                     &lt;/complexContent>
 *                                   &lt;/complexType>
 *                                 &lt;/element>
 *                                 &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                               &lt;/sequence>
 *                               &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                             &lt;/restriction>
 *                           &lt;/complexContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/sequence>
 *                   &lt;/restriction>
 *                 &lt;/complexContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *         &lt;/choice>
 *         &lt;element name="Class" type="{http://www.opentravel.org/OTA/2003/05}AccommodationClass" minOccurs="0"/>
 *         &lt;element name="Compartment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationType", propOrder = {
    "seat",
    "seatAvailabilityDetail",
    "berth",
    "berthAvailabilityDetail",
    "clazz",
    "compartment"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.AccommodationCategoryType.Accommodation.class
})
public class AccommodationType {

    @XmlElement(name = "Seat")
    @XmlSchemaType(name = "string")
    protected SeatAccommodationType seat;
    @XmlElement(name = "SeatAvailabilityDetail")
    protected AccommodationType.SeatAvailabilityDetail seatAvailabilityDetail;
    @XmlElement(name = "Berth")
    @XmlSchemaType(name = "string")
    protected BerthAccommodationType berth;
    @XmlElement(name = "BerthAvailabilityDetail")
    protected AccommodationType.BerthAvailabilityDetail berthAvailabilityDetail;
    @XmlElement(name = "Class")
    protected AccommodationClass clazz;
    @XmlElement(name = "Compartment")
    protected AccommodationType.Compartment compartment;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger quantity;

    /**
     * 获取seat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatAccommodationType }
     *     
     */
    public SeatAccommodationType getSeat() {
        return seat;
    }

    /**
     * 设置seat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAccommodationType }
     *     
     */
    public void setSeat(SeatAccommodationType value) {
        this.seat = value;
    }

    /**
     * 获取seatAvailabilityDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationType.SeatAvailabilityDetail }
     *     
     */
    public AccommodationType.SeatAvailabilityDetail getSeatAvailabilityDetail() {
        return seatAvailabilityDetail;
    }

    /**
     * 设置seatAvailabilityDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationType.SeatAvailabilityDetail }
     *     
     */
    public void setSeatAvailabilityDetail(AccommodationType.SeatAvailabilityDetail value) {
        this.seatAvailabilityDetail = value;
    }

    /**
     * 获取berth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BerthAccommodationType }
     *     
     */
    public BerthAccommodationType getBerth() {
        return berth;
    }

    /**
     * 设置berth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BerthAccommodationType }
     *     
     */
    public void setBerth(BerthAccommodationType value) {
        this.berth = value;
    }

    /**
     * 获取berthAvailabilityDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationType.BerthAvailabilityDetail }
     *     
     */
    public AccommodationType.BerthAvailabilityDetail getBerthAvailabilityDetail() {
        return berthAvailabilityDetail;
    }

    /**
     * 设置berthAvailabilityDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationType.BerthAvailabilityDetail }
     *     
     */
    public void setBerthAvailabilityDetail(AccommodationType.BerthAvailabilityDetail value) {
        this.berthAvailabilityDetail = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationClass }
     *     
     */
    public AccommodationClass getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationClass }
     *     
     */
    public void setClazz(AccommodationClass value) {
        this.clazz = value;
    }

    /**
     * 获取compartment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationType.Compartment }
     *     
     */
    public AccommodationType.Compartment getCompartment() {
        return compartment;
    }

    /**
     * 设置compartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationType.Compartment }
     *     
     */
    public void setCompartment(AccommodationType.Compartment value) {
        this.compartment = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Car" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Compartment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Berth" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                                     &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
     *                                     &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                           &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
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
        "car"
    })
    public static class BerthAvailabilityDetail {

        @XmlElement(name = "Car")
        protected List<AccommodationType.BerthAvailabilityDetail.Car> car;

        /**
         * Gets the value of the car property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the car property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationType.BerthAvailabilityDetail.Car }
         * 
         * 
         */
        public List<AccommodationType.BerthAvailabilityDetail.Car> getCar() {
            if (car == null) {
                car = new ArrayList<AccommodationType.BerthAvailabilityDetail.Car>();
            }
            return this.car;
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
         *         &lt;element name="Compartment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Berth" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *                           &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
         *                           &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "compartment",
            "tpaExtensions"
        })
        public static class Car {

            @XmlElement(name = "Compartment", required = true)
            protected List<AccommodationType.BerthAvailabilityDetail.Car.Compartment> compartment;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "Number", required = true)
            protected String number;

            /**
             * Gets the value of the compartment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compartment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompartment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AccommodationType.BerthAvailabilityDetail.Car.Compartment }
             * 
             * 
             */
            public List<AccommodationType.BerthAvailabilityDetail.Car.Compartment> getCompartment() {
                if (compartment == null) {
                    compartment = new ArrayList<AccommodationType.BerthAvailabilityDetail.Car.Compartment>();
                }
                return this.compartment;
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
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *       &lt;sequence>
             *         &lt;element name="Berth" maxOccurs="unbounded">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
             *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
             *                 &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
             *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "berth",
                "tpaExtensions"
            })
            public static class Compartment {

                @XmlElement(name = "Berth", required = true)
                protected List<AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth> berth;
                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensionsType tpaExtensions;
                @XmlAttribute(name = "Number", required = true)
                protected String number;
                @XmlAttribute(name = "Position")
                protected CompartmentPositionType position;

                /**
                 * Gets the value of the berth property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the berth property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getBerth().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth }
                 * 
                 * 
                 */
                public List<AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth> getBerth() {
                    if (berth == null) {
                        berth = new ArrayList<AccommodationType.BerthAvailabilityDetail.Car.Compartment.Berth>();
                    }
                    return this.berth;
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
                 * 获取position属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompartmentPositionType }
                 *     
                 */
                public CompartmentPositionType getPosition() {
                    return position;
                }

                /**
                 * 设置position属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompartmentPositionType }
                 *     
                 */
                public void setPosition(CompartmentPositionType value) {
                    this.position = value;
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
                 *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
                 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}BerthPositionType" />
                 *       &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                public static class Berth {

                    @XmlElement(name = "TPA_Extensions")
                    protected TPAExtensionsType tpaExtensions;
                    @XmlAttribute(name = "Number", required = true)
                    protected String number;
                    @XmlAttribute(name = "Position")
                    protected BerthPositionType position;
                    @XmlAttribute(name = "AvailableInd", required = true)
                    protected boolean availableInd;

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
                     * 获取position属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BerthPositionType }
                     *     
                     */
                    public BerthPositionType getPosition() {
                        return position;
                    }

                    /**
                     * 设置position属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BerthPositionType }
                     *     
                     */
                    public void setPosition(BerthPositionType value) {
                        this.position = value;
                    }

                    /**
                     * 获取availableInd属性的值。
                     * 
                     */
                    public boolean isAvailableInd() {
                        return availableInd;
                    }

                    /**
                     * 设置availableInd属性的值。
                     * 
                     */
                    public void setAvailableInd(boolean value) {
                        this.availableInd = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Compartment
        extends CompartmentType
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
     *         &lt;element name="Car" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Compartment" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Seat" maxOccurs="unbounded">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                                     &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
     *                                     &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
     *                                     &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *                           &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
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
        "car"
    })
    public static class SeatAvailabilityDetail {

        @XmlElement(name = "Car")
        protected List<AccommodationType.SeatAvailabilityDetail.Car> car;

        /**
         * Gets the value of the car property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the car property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCar().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AccommodationType.SeatAvailabilityDetail.Car }
         * 
         * 
         */
        public List<AccommodationType.SeatAvailabilityDetail.Car> getCar() {
            if (car == null) {
                car = new ArrayList<AccommodationType.SeatAvailabilityDetail.Car>();
            }
            return this.car;
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
         *         &lt;element name="Compartment" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Seat" maxOccurs="unbounded">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *                           &lt;/sequence>
         *                           &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *                           &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
         *                           &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
         *                           &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "compartment",
            "tpaExtensions"
        })
        public static class Car {

            @XmlElement(name = "Compartment", required = true)
            protected List<AccommodationType.SeatAvailabilityDetail.Car.Compartment> compartment;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "Number", required = true)
            protected String number;

            /**
             * Gets the value of the compartment property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the compartment property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCompartment().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AccommodationType.SeatAvailabilityDetail.Car.Compartment }
             * 
             * 
             */
            public List<AccommodationType.SeatAvailabilityDetail.Car.Compartment> getCompartment() {
                if (compartment == null) {
                    compartment = new ArrayList<AccommodationType.SeatAvailabilityDetail.Car.Compartment>();
                }
                return this.compartment;
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
             *                 &lt;sequence>
             *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
             *                 &lt;/sequence>
             *                 &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
             *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
             *                 &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
             *                 &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
             *       &lt;/sequence>
             *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
             *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "seat",
                "tpaExtensions"
            })
            public static class Compartment {

                @XmlElement(name = "Seat", required = true)
                protected List<AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat> seat;
                @XmlElement(name = "TPA_Extensions")
                protected TPAExtensionsType tpaExtensions;
                @XmlAttribute(name = "Number", required = true)
                protected String number;
                @XmlAttribute(name = "Position")
                protected CompartmentPositionType position;

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
                 * {@link AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat }
                 * 
                 * 
                 */
                public List<AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat> getSeat() {
                    if (seat == null) {
                        seat = new ArrayList<AccommodationType.SeatAvailabilityDetail.Car.Compartment.Seat>();
                    }
                    return this.seat;
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
                 * 获取position属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link CompartmentPositionType }
                 *     
                 */
                public CompartmentPositionType getPosition() {
                    return position;
                }

                /**
                 * 设置position属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link CompartmentPositionType }
                 *     
                 */
                public void setPosition(CompartmentPositionType value) {
                    this.position = value;
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
                 *       &lt;attribute name="Number" use="required" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
                 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
                 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
                 *       &lt;attribute name="AvailableInd" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
                public static class Seat {

                    @XmlElement(name = "TPA_Extensions")
                    protected TPAExtensionsType tpaExtensions;
                    @XmlAttribute(name = "Number", required = true)
                    protected String number;
                    @XmlAttribute(name = "Position")
                    protected SeatPositionType position;
                    @XmlAttribute(name = "Direction")
                    protected SeatDirectionType direction;
                    @XmlAttribute(name = "AvailableInd", required = true)
                    protected boolean availableInd;

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
                     * 获取position属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SeatPositionType }
                     *     
                     */
                    public SeatPositionType getPosition() {
                        return position;
                    }

                    /**
                     * 设置position属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SeatPositionType }
                     *     
                     */
                    public void setPosition(SeatPositionType value) {
                        this.position = value;
                    }

                    /**
                     * 获取direction属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link SeatDirectionType }
                     *     
                     */
                    public SeatDirectionType getDirection() {
                        return direction;
                    }

                    /**
                     * 设置direction属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link SeatDirectionType }
                     *     
                     */
                    public void setDirection(SeatDirectionType value) {
                        this.direction = value;
                    }

                    /**
                     * 获取availableInd属性的值。
                     * 
                     */
                    public boolean isAvailableInd() {
                        return availableInd;
                    }

                    /**
                     * 设置availableInd属性的值。
                     * 
                     */
                    public void setAvailableInd(boolean value) {
                        this.availableInd = value;
                    }

                }

            }

        }

    }

}
