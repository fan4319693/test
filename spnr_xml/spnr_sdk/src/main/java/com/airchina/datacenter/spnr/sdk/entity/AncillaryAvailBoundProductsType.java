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
 * Air Ancillary Type Product, Bound Products, Groups Products by Category, Origin/Destination and Date
 * 
 * <p>AncillaryAvailBoundProductsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AncillaryAvailBoundProductsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AncillaryProducts" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AncillaryProductsType">
 *                 &lt;sequence>
 *                   &lt;element name="Flights" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Flight" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PTCs" type="{http://www.opentravel.org/OTA/2003/05}PTCs"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
 *                 &lt;attribute name="Flight" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
 *                 &lt;attribute name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
 *       &lt;attribute name="Destination" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Origin" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AncillaryAvailBoundProductsType", propOrder = {
    "ancillaryProducts"
})
public class AncillaryAvailBoundProductsType {

    @XmlElement(name = "AncillaryProducts")
    protected List<AncillaryAvailBoundProductsType.AncillaryProducts> ancillaryProducts;
    @XmlAttribute(name = "Category")
    protected AncillaryProductCategoryType category;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "date")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "Origin")
    protected String origin;

    /**
     * Gets the value of the ancillaryProducts property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryProducts property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryProducts().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryAvailBoundProductsType.AncillaryProducts }
     * 
     * 
     */
    public List<AncillaryAvailBoundProductsType.AncillaryProducts> getAncillaryProducts() {
        if (ancillaryProducts == null) {
            ancillaryProducts = new ArrayList<AncillaryAvailBoundProductsType.AncillaryProducts>();
        }
        return this.ancillaryProducts;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AncillaryProductCategoryType }
     *     
     */
    public AncillaryProductCategoryType getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AncillaryProductCategoryType }
     *     
     */
    public void setCategory(AncillaryProductCategoryType value) {
        this.category = value;
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
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
    }

    /**
     * 获取origin属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOrigin() {
        return origin;
    }

    /**
     * 设置origin属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOrigin(String value) {
        this.origin = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AncillaryProductsType">
     *       &lt;sequence>
     *         &lt;element name="Flights" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Flight" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PTCs" type="{http://www.opentravel.org/OTA/2003/05}PTCs"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Carrier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Category" type="{http://www.opentravel.org/OTA/2003/05}AncillaryProductCategoryType" />
     *       &lt;attribute name="Flight" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
     *       &lt;attribute name="RBD" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flights",
        "ptCs"
    })
    public static class AncillaryProducts
        extends AncillaryProductsType
    {

        @XmlElement(name = "Flights")
        protected AncillaryAvailBoundProductsType.AncillaryProducts.Flights flights;
        @XmlElement(name = "PTCs", required = true)
        protected PTCs ptCs;
        @XmlAttribute(name = "Carrier")
        protected String carrier;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "Category")
        protected AncillaryProductCategoryType category;
        @XmlAttribute(name = "Flight")
        protected String flight;
        @XmlAttribute(name = "Terminal")
        protected String terminal;
        @XmlAttribute(name = "Direction")
        protected AirportAncillaryDirection direction;
        @XmlAttribute(name = "RBD")
        protected String rbd;

        /**
         * 获取flights属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AncillaryAvailBoundProductsType.AncillaryProducts.Flights }
         *     
         */
        public AncillaryAvailBoundProductsType.AncillaryProducts.Flights getFlights() {
            return flights;
        }

        /**
         * 设置flights属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AncillaryAvailBoundProductsType.AncillaryProducts.Flights }
         *     
         */
        public void setFlights(AncillaryAvailBoundProductsType.AncillaryProducts.Flights value) {
            this.flights = value;
        }

        /**
         * 获取ptCs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PTCs }
         *     
         */
        public PTCs getPTCs() {
            return ptCs;
        }

        /**
         * 设置ptCs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PTCs }
         *     
         */
        public void setPTCs(PTCs value) {
            this.ptCs = value;
        }

        /**
         * 获取carrier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCarrier() {
            return carrier;
        }

        /**
         * 设置carrier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCarrier(String value) {
            this.carrier = value;
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
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AncillaryProductCategoryType }
         *     
         */
        public AncillaryProductCategoryType getCategory() {
            return category;
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AncillaryProductCategoryType }
         *     
         */
        public void setCategory(AncillaryProductCategoryType value) {
            this.category = value;
        }

        /**
         * 获取flight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlight() {
            return flight;
        }

        /**
         * 设置flight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlight(String value) {
            this.flight = value;
        }

        /**
         * 获取terminal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTerminal() {
            return terminal;
        }

        /**
         * 设置terminal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTerminal(String value) {
            this.terminal = value;
        }

        /**
         * 获取direction属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirportAncillaryDirection }
         *     
         */
        public AirportAncillaryDirection getDirection() {
            return direction;
        }

        /**
         * 设置direction属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirportAncillaryDirection }
         *     
         */
        public void setDirection(AirportAncillaryDirection value) {
            this.direction = value;
        }

        /**
         * 获取rbd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRBD() {
            return rbd;
        }

        /**
         * 设置rbd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRBD(String value) {
            this.rbd = value;
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
         *                 &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "flight"
        })
        public static class Flights {

            @XmlElement(name = "Flight", required = true)
            protected List<AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight> flight;

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
             * {@link AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight }
             * 
             * 
             */
            public List<AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight> getFlight() {
                if (flight == null) {
                    flight = new ArrayList<AncillaryAvailBoundProductsType.AncillaryProducts.Flights.Flight>();
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
             *       &lt;attribute name="FlightNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="SegmentRef" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Flight {

                @XmlAttribute(name = "FlightNumber", required = true)
                protected int flightNumber;
                @XmlAttribute(name = "SegmentRef")
                @XmlSchemaType(name = "anySimpleType")
                protected String segmentRef;

                /**
                 * 获取flightNumber属性的值。
                 * 
                 */
                public int getFlightNumber() {
                    return flightNumber;
                }

                /**
                 * 设置flightNumber属性的值。
                 * 
                 */
                public void setFlightNumber(int value) {
                    this.flightNumber = value;
                }

                /**
                 * 获取segmentRef属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getSegmentRef() {
                    return segmentRef;
                }

                /**
                 * 设置segmentRef属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setSegmentRef(String value) {
                    this.segmentRef = value;
                }

            }

        }

    }

}
