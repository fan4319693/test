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
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>AssociatedBookingProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssociatedBookingProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FlightSegment" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *                 &lt;attribute name="OriginDestination" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightTicketing" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsTicketingAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ticketing" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsTicketingAttributeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="ProductID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefundApplicationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReshopID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefundApplicationDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedBookingProductType", propOrder = {
    "flightSegment",
    "flightTicketing",
    "ticketing"
})
public class AssociatedBookingProductType {

    @XmlElement(name = "FlightSegment")
    protected List<AssociatedBookingProductType.FlightSegment> flightSegment;
    @XmlElement(name = "FlightTicketing")
    protected List<AssociatedBookingProductType.FlightTicketing> flightTicketing;
    @XmlElement(name = "Ticketing")
    protected List<AssociatedBookingProductType.Ticketing> ticketing;
    @XmlAttribute(name = "ProductID")
    protected BigInteger productID;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "SubType")
    protected String subType;
    @XmlAttribute(name = "RefundApplicationID")
    protected String refundApplicationID;
    @XmlAttribute(name = "ReshopID")
    protected String reshopID;
    @XmlAttribute(name = "RefundApplicationDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar refundApplicationDateTime;

    /**
     * Gets the value of the flightSegment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedBookingProductType.FlightSegment }
     * 
     * 
     */
    public List<AssociatedBookingProductType.FlightSegment> getFlightSegment() {
        if (flightSegment == null) {
            flightSegment = new ArrayList<AssociatedBookingProductType.FlightSegment>();
        }
        return this.flightSegment;
    }

    /**
     * Gets the value of the flightTicketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightTicketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedBookingProductType.FlightTicketing }
     * 
     * 
     */
    public List<AssociatedBookingProductType.FlightTicketing> getFlightTicketing() {
        if (flightTicketing == null) {
            flightTicketing = new ArrayList<AssociatedBookingProductType.FlightTicketing>();
        }
        return this.flightTicketing;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AssociatedBookingProductType.Ticketing }
     * 
     * 
     */
    public List<AssociatedBookingProductType.Ticketing> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<AssociatedBookingProductType.Ticketing>();
        }
        return this.ticketing;
    }

    /**
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductID(BigInteger value) {
        this.productID = value;
    }

    /**
     * 获取historyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryID() {
        return historyID;
    }

    /**
     * 设置historyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryID(BigInteger value) {
        this.historyID = value;
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
     * 获取subType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubType() {
        return subType;
    }

    /**
     * 设置subType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubType(String value) {
        this.subType = value;
    }

    /**
     * 获取refundApplicationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundApplicationID() {
        return refundApplicationID;
    }

    /**
     * 设置refundApplicationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundApplicationID(String value) {
        this.refundApplicationID = value;
    }

    /**
     * 获取reshopID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReshopID() {
        return reshopID;
    }

    /**
     * 设置reshopID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReshopID(String value) {
        this.reshopID = value;
    }

    /**
     * 获取refundApplicationDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getRefundApplicationDateTime() {
        return refundApplicationDateTime;
    }

    /**
     * 设置refundApplicationDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setRefundApplicationDateTime(XMLGregorianCalendar value) {
        this.refundApplicationDateTime = value;
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
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
     *       &lt;attribute name="OriginDestination" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightSegment {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "DepartureDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar departureDate;
        @XmlAttribute(name = "FlightNumber")
        protected String flightNumber;
        @XmlAttribute(name = "OriginDestination")
        protected String originDestination;

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
         * 获取departureDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDate() {
            return departureDate;
        }

        /**
         * 设置departureDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDate(XMLGregorianCalendar value) {
            this.departureDate = value;
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
         * 获取originDestination属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginDestination() {
            return originDestination;
        }

        /**
         * 设置originDestination属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginDestination(String value) {
            this.originDestination = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsTicketingAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightTicketing {

        @XmlAttribute(name = "eTicketNumber")
        protected String eTicketNumber;
        @XmlAttribute(name = "EncryptedeTicketNumber")
        protected String encryptedeTicketNumber;
        @XmlAttribute(name = "TicketingStatus")
        protected String ticketingStatus;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected List<String> flightSegmentRPH;
        @XmlAttribute(name = "TravelerRPH")
        protected List<String> travelerRPH;

        /**
         * 获取eTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getETicketNumber() {
            return eTicketNumber;
        }

        /**
         * 设置eTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setETicketNumber(String value) {
            this.eTicketNumber = value;
        }

        /**
         * 获取encryptedeTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedeTicketNumber() {
            return encryptedeTicketNumber;
        }

        /**
         * 设置encryptedeTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedeTicketNumber(String value) {
            this.encryptedeTicketNumber = value;
        }

        /**
         * 获取ticketingStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingStatus() {
            return ticketingStatus;
        }

        /**
         * 设置ticketingStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingStatus(String value) {
            this.ticketingStatus = value;
        }

        /**
         * Gets the value of the flightSegmentRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegmentRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegmentRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightSegmentRPH() {
            if (flightSegmentRPH == null) {
                flightSegmentRPH = new ArrayList<String>();
            }
            return this.flightSegmentRPH;
        }

        /**
         * Gets the value of the travelerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTravelerRPH() {
            if (travelerRPH == null) {
                travelerRPH = new ArrayList<String>();
            }
            return this.travelerRPH;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AssociatedBookingsTicketingAttributeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ticketing {

        @XmlAttribute(name = "eTicketNumber")
        protected String eTicketNumber;
        @XmlAttribute(name = "EncryptedeTicketNumber")
        protected String encryptedeTicketNumber;
        @XmlAttribute(name = "TicketingStatus")
        protected String ticketingStatus;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected List<String> flightSegmentRPH;
        @XmlAttribute(name = "TravelerRPH")
        protected List<String> travelerRPH;

        /**
         * 获取eTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getETicketNumber() {
            return eTicketNumber;
        }

        /**
         * 设置eTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setETicketNumber(String value) {
            this.eTicketNumber = value;
        }

        /**
         * 获取encryptedeTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedeTicketNumber() {
            return encryptedeTicketNumber;
        }

        /**
         * 设置encryptedeTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedeTicketNumber(String value) {
            this.encryptedeTicketNumber = value;
        }

        /**
         * 获取ticketingStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingStatus() {
            return ticketingStatus;
        }

        /**
         * 设置ticketingStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingStatus(String value) {
            this.ticketingStatus = value;
        }

        /**
         * Gets the value of the flightSegmentRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the flightSegmentRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getFlightSegmentRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getFlightSegmentRPH() {
            if (flightSegmentRPH == null) {
                flightSegmentRPH = new ArrayList<String>();
            }
            return this.flightSegmentRPH;
        }

        /**
         * Gets the value of the travelerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getTravelerRPH() {
            if (travelerRPH == null) {
                travelerRPH = new ArrayList<String>();
            }
            return this.travelerRPH;
        }

    }

}
