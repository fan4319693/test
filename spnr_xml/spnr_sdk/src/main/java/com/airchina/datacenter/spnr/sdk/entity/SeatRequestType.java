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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Object to hold a passengers' seat request
 * 
 * <p>SeatRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DepartureAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="ArrivalAirport" type="{http://www.opentravel.org/OTA/2003/05}LocationType" minOccurs="0"/>
 *         &lt;element name="SupplierRef" type="{http://www.opentravel.org/OTA/2003/05}SupplierRefType" minOccurs="0"/>
 *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatRequestAttributes"/>
 *       &lt;attribute name="DepartureDate" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="FlightNumber" type="{http://www.opentravel.org/OTA/2003/05}FlightNumberType" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="AllocationType" type="{http://www.opentravel.org/OTA/2003/05}AllocationType" />
 *       &lt;attribute name="ET_EMD_Linked" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatRequestType", propOrder = {
    "departureAirport",
    "arrivalAirport",
    "supplierRef",
    "text"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SpecialReqDetailsType.SeatRequests.SeatRequest.class
})
public class SeatRequestType {

    @XmlElement(name = "DepartureAirport")
    protected LocationType departureAirport;
    @XmlElement(name = "ArrivalAirport")
    protected LocationType arrivalAirport;
    @XmlElement(name = "SupplierRef")
    protected SupplierRefType supplierRef;
    @XmlElement(name = "Text")
    protected String text;
    @XmlAttribute(name = "DepartureDate")
    protected String departureDate;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "AllocationType")
    protected AllocationType allocationType;
    @XmlAttribute(name = "ET_EMD_Linked")
    protected Boolean etemdLinked;
    @XmlAttribute(name = "SeatNumber")
    protected String seatNumber;
    @XmlAttribute(name = "SeatPreference")
    protected String seatPreference;
    @XmlAttribute(name = "SmokingAllowed")
    protected Boolean smokingAllowed;

    /**
     * 获取departureAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getDepartureAirport() {
        return departureAirport;
    }

    /**
     * 设置departureAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setDepartureAirport(LocationType value) {
        this.departureAirport = value;
    }

    /**
     * 获取arrivalAirport属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LocationType }
     *     
     */
    public LocationType getArrivalAirport() {
        return arrivalAirport;
    }

    /**
     * 设置arrivalAirport属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationType }
     *     
     */
    public void setArrivalAirport(LocationType value) {
        this.arrivalAirport = value;
    }

    /**
     * 获取supplierRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierRefType }
     *     
     */
    public SupplierRefType getSupplierRef() {
        return supplierRef;
    }

    /**
     * 设置supplierRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierRefType }
     *     
     */
    public void setSupplierRef(SupplierRefType value) {
        this.supplierRef = value;
    }

    /**
     * 获取text属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getText() {
        return text;
    }

    /**
     * 设置text属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setText(String value) {
        this.text = value;
    }

    /**
     * 获取departureDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDepartureDate() {
        return departureDate;
    }

    /**
     * 设置departureDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDepartureDate(String value) {
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
     * 获取allocationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AllocationType }
     *     
     */
    public AllocationType getAllocationType() {
        return allocationType;
    }

    /**
     * 设置allocationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AllocationType }
     *     
     */
    public void setAllocationType(AllocationType value) {
        this.allocationType = value;
    }

    /**
     * 获取etemdLinked属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isETEMDLinked() {
        return etemdLinked;
    }

    /**
     * 设置etemdLinked属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setETEMDLinked(Boolean value) {
        this.etemdLinked = value;
    }

    /**
     * 获取seatNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatNumber() {
        return seatNumber;
    }

    /**
     * 设置seatNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatNumber(String value) {
        this.seatNumber = value;
    }

    /**
     * 获取seatPreference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeatPreference() {
        return seatPreference;
    }

    /**
     * 设置seatPreference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeatPreference(String value) {
        this.seatPreference = value;
    }

    /**
     * 获取smokingAllowed属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isSmokingAllowed() {
        if (smokingAllowed == null) {
            return false;
        } else {
            return smokingAllowed;
        }
    }

    /**
     * 设置smokingAllowed属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSmokingAllowed(Boolean value) {
        this.smokingAllowed = value;
    }

}
