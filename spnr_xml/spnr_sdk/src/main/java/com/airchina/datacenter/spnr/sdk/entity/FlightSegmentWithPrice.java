//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Ancillary MetaData relating to the flight segment.
 * 
 * <p>FlightSegmentWithPrice complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightSegmentWithPrice">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Prices" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductPricesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Terminal" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AirportLocationCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Airport" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailRuleID" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="ProductAvailability" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="FlightNumber" use="required" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *       &lt;attribute name="CabinClass" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AvailabilityDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightSegmentWithPrice", propOrder = {
    "prices"
})
public class FlightSegmentWithPrice {

    @XmlElement(name = "Prices")
    protected AirAncillaryProductPricesType prices;
    @XmlAttribute(name = "Terminal")
    protected String terminal;
    @XmlAttribute(name = "AirportLocationCode")
    protected String airportLocationCode;
    @XmlAttribute(name = "Airport")
    protected String airport;
    @XmlAttribute(name = "AvailRuleID")
    protected Long availRuleID;
    @XmlAttribute(name = "ProductAvailability", required = true)
    protected boolean productAvailability;
    @XmlAttribute(name = "FlightNumber", required = true)
    protected String flightNumber;
    @XmlAttribute(name = "CabinClass", required = true)
    protected String cabinClass;
    @XmlAttribute(name = "AvailabilityDateTime", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar availabilityDateTime;
    @XmlAttribute(name = "Direction")
    protected AirportAncillaryDirection direction;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;

    /**
     * 获取prices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirAncillaryProductPricesType }
     *     
     */
    public AirAncillaryProductPricesType getPrices() {
        return prices;
    }

    /**
     * 设置prices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirAncillaryProductPricesType }
     *     
     */
    public void setPrices(AirAncillaryProductPricesType value) {
        this.prices = value;
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
     * 获取airportLocationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportLocationCode() {
        return airportLocationCode;
    }

    /**
     * 设置airportLocationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportLocationCode(String value) {
        this.airportLocationCode = value;
    }

    /**
     * 获取airport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirport() {
        return airport;
    }

    /**
     * 设置airport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirport(String value) {
        this.airport = value;
    }

    /**
     * 获取availRuleID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Long }
     *     
     */
    public Long getAvailRuleID() {
        return availRuleID;
    }

    /**
     * 设置availRuleID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Long }
     *     
     */
    public void setAvailRuleID(Long value) {
        this.availRuleID = value;
    }

    /**
     * 获取productAvailability属性的值。
     * 
     */
    public boolean isProductAvailability() {
        return productAvailability;
    }

    /**
     * 设置productAvailability属性的值。
     * 
     */
    public void setProductAvailability(boolean value) {
        this.productAvailability = value;
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
     * 获取cabinClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinClass() {
        return cabinClass;
    }

    /**
     * 设置cabinClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinClass(String value) {
        this.cabinClass = value;
    }

    /**
     * 获取availabilityDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getAvailabilityDateTime() {
        return availabilityDateTime;
    }

    /**
     * 设置availabilityDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setAvailabilityDateTime(XMLGregorianCalendar value) {
        this.availabilityDateTime = value;
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
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }

}
