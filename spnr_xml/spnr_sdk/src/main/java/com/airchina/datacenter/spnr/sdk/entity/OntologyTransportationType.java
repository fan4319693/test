//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Transportation information with ontology reference.
 * 
 * <p>OntologyTransportationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyTransportationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TripDirection" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTripDirection">
 *                 &lt;attribute name="OntologyRefID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,8}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightAndRail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Number" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Carrier" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType" minOccurs="0"/>
 *                   &lt;element name="Class" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferFareClass">
 *                           &lt;attribute name="OtherType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="FareCode" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Class" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferVehicleClass">
 *                           &lt;attribute name="OtherType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Make" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Model" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyTransportationType", propOrder = {
    "tripDirection",
    "flightAndRail",
    "vehicle",
    "ontologyExtension"
})
public class OntologyTransportationType {

    @XmlElement(name = "TripDirection")
    protected OntologyTransportationType.TripDirection tripDirection;
    @XmlElement(name = "FlightAndRail")
    protected OntologyTransportationType.FlightAndRail flightAndRail;
    @XmlElement(name = "Vehicle")
    protected OntologyTransportationType.Vehicle vehicle;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;

    /**
     * 获取tripDirection属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyTransportationType.TripDirection }
     *     
     */
    public OntologyTransportationType.TripDirection getTripDirection() {
        return tripDirection;
    }

    /**
     * 设置tripDirection属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTransportationType.TripDirection }
     *     
     */
    public void setTripDirection(OntologyTransportationType.TripDirection value) {
        this.tripDirection = value;
    }

    /**
     * 获取flightAndRail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyTransportationType.FlightAndRail }
     *     
     */
    public OntologyTransportationType.FlightAndRail getFlightAndRail() {
        return flightAndRail;
    }

    /**
     * 设置flightAndRail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTransportationType.FlightAndRail }
     *     
     */
    public void setFlightAndRail(OntologyTransportationType.FlightAndRail value) {
        this.flightAndRail = value;
    }

    /**
     * 获取vehicle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyTransportationType.Vehicle }
     *     
     */
    public OntologyTransportationType.Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 设置vehicle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTransportationType.Vehicle }
     *     
     */
    public void setVehicle(OntologyTransportationType.Vehicle value) {
        this.vehicle = value;
    }

    /**
     * 获取ontologyExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyExtensionType }
     *     
     */
    public OntologyExtensionType getOntologyExtension() {
        return ontologyExtension;
    }

    /**
     * 设置ontologyExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyExtensionType }
     *     
     */
    public void setOntologyExtension(OntologyExtensionType value) {
        this.ontologyExtension = value;
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
     *         &lt;element name="Number" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Carrier" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType" minOccurs="0"/>
     *         &lt;element name="Class" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferFareClass">
     *                 &lt;attribute name="OtherType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="FareCode" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType" minOccurs="0"/>
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
        "number",
        "carrier",
        "clazz",
        "fareCode"
    })
    public static class FlightAndRail {

        @XmlElement(name = "Number")
        protected OntologyTransportationType.FlightAndRail.Number number;
        @XmlElement(name = "Carrier")
        protected OntologyCodeType carrier;
        @XmlElement(name = "Class")
        protected OntologyTransportationType.FlightAndRail.Class clazz;
        @XmlElement(name = "FareCode")
        protected OntologyCodeType fareCode;

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType.FlightAndRail.Number }
         *     
         */
        public OntologyTransportationType.FlightAndRail.Number getNumber() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType.FlightAndRail.Number }
         *     
         */
        public void setNumber(OntologyTransportationType.FlightAndRail.Number value) {
            this.number = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyCodeType }
         *     
         */
        public OntologyCodeType getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyCodeType }
         *     
         */
        public void setCarrier(OntologyCodeType value) {
            this.carrier = value;
        }

        /**
         * 获取clazz属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType.FlightAndRail.Class }
         *     
         */
        public OntologyTransportationType.FlightAndRail.Class getClazz() {
            return clazz;
        }

        /**
         * 设置clazz属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType.FlightAndRail.Class }
         *     
         */
        public void setClazz(OntologyTransportationType.FlightAndRail.Class value) {
            this.clazz = value;
        }

        /**
         * 获取fareCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyCodeType }
         *     
         */
        public OntologyCodeType getFareCode() {
            return fareCode;
        }

        /**
         * 设置fareCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyCodeType }
         *     
         */
        public void setFareCode(OntologyCodeType value) {
            this.fareCode = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferFareClass">
         *       &lt;attribute name="OtherType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        public static class Class {

            @XmlValue
            protected ListOfferFareClass value;
            @XmlAttribute(name = "OtherType")
            protected String otherType;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * Source: Unit of Measure (UOM) OpenTravel codelist.
             * 
             * @return
             *     possible object is
             *     {@link ListOfferFareClass }
             *     
             */
            public ListOfferFareClass getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfferFareClass }
             *     
             */
            public void setValue(ListOfferFareClass value) {
                this.value = value;
            }

            /**
             * 获取otherType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherType() {
                return otherType;
            }

            /**
             * 设置otherType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherType(String value) {
                this.otherType = value;
            }

            /**
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
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
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        public static class Number {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

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
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTripDirection">
     *       &lt;attribute name="OntologyRefID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,8}"/>
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
    public static class TripDirection {

        @XmlValue
        protected ListOfferTripDirection value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Coverage Type (COV) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferTripDirection }
         *     
         */
        public ListOfferTripDirection getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferTripDirection }
         *     
         */
        public void setValue(ListOfferTripDirection value) {
            this.value = value;
        }

        /**
         * 获取ontologyRefID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOntologyRefID() {
            return ontologyRefID;
        }

        /**
         * 设置ontologyRefID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOntologyRefID(String value) {
            this.ontologyRefID = value;
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
     *         &lt;element name="Class" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferVehicleClass">
     *                 &lt;attribute name="OtherType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Make" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Model" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        "clazz",
        "make",
        "model"
    })
    public static class Vehicle {

        @XmlElement(name = "Class")
        protected OntologyTransportationType.Vehicle.Class clazz;
        @XmlElement(name = "Make")
        protected OntologyTransportationType.Vehicle.Make make;
        @XmlElement(name = "Model")
        protected OntologyTransportationType.Vehicle.Model model;

        /**
         * 获取clazz属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType.Vehicle.Class }
         *     
         */
        public OntologyTransportationType.Vehicle.Class getClazz() {
            return clazz;
        }

        /**
         * 设置clazz属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType.Vehicle.Class }
         *     
         */
        public void setClazz(OntologyTransportationType.Vehicle.Class value) {
            this.clazz = value;
        }

        /**
         * 获取make属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType.Vehicle.Make }
         *     
         */
        public OntologyTransportationType.Vehicle.Make getMake() {
            return make;
        }

        /**
         * 设置make属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType.Vehicle.Make }
         *     
         */
        public void setMake(OntologyTransportationType.Vehicle.Make value) {
            this.make = value;
        }

        /**
         * 获取model属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTransportationType.Vehicle.Model }
         *     
         */
        public OntologyTransportationType.Vehicle.Model getModel() {
            return model;
        }

        /**
         * 设置model属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTransportationType.Vehicle.Model }
         *     
         */
        public void setModel(OntologyTransportationType.Vehicle.Model value) {
            this.model = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferVehicleClass">
         *       &lt;attribute name="OtherType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        public static class Class {

            @XmlValue
            protected ListOfferVehicleClass value;
            @XmlAttribute(name = "OtherType")
            protected String otherType;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * Source: Vehicle Size (VEH) OpenTravel codelist.
             * 
             * @return
             *     possible object is
             *     {@link ListOfferVehicleClass }
             *     
             */
            public ListOfferVehicleClass getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfferVehicleClass }
             *     
             */
            public void setValue(ListOfferVehicleClass value) {
                this.value = value;
            }

            /**
             * 获取otherType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherType() {
                return otherType;
            }

            /**
             * 设置otherType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherType(String value) {
                this.otherType = value;
            }

            /**
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
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
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        public static class Make {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

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
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
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
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
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
        public static class Model {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

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
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
            }

        }

    }

}
