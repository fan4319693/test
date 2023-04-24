//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SearchType"/>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Passengers"/>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OriginDestinationInformation"/>
 *         &lt;/sequence>
 *         &lt;sequence>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}HotelInformation"/>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}VehicleInformation"/>
 *           &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightInformation"/>
 *         &lt;/sequence>
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
    "searchType",
    "passengers",
    "originDestinationInformation",
    "hotelInformation",
    "vehicleInformation",
    "flightInformation"
})
@XmlRootElement(name = "Search")
public class Search {

    @XmlElement(name = "SearchType")
    protected String searchType;
    @XmlElement(name = "Passengers")
    protected Passengers passengers;
    @XmlElement(name = "OriginDestinationInformation")
    protected OriginDestinationInformation originDestinationInformation;
    @XmlElement(name = "HotelInformation")
    protected HotelInformation hotelInformation;
    @XmlElement(name = "VehicleInformation")
    protected VehicleInformation vehicleInformation;
    @XmlElement(name = "FlightInformation")
    protected FlightInformation flightInformation;

    /**
     * Search type for promotion. eg. H stands for hotel.
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchType() {
        return searchType;
    }

    /**
     * 设置searchType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchType(String value) {
        this.searchType = value;
    }

    /**
     * Passenger information.
     * 
     * @return
     *     possible object is
     *     {@link Passengers }
     *     
     */
    public Passengers getPassengers() {
        return passengers;
    }

    /**
     * 设置passengers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Passengers }
     *     
     */
    public void setPassengers(Passengers value) {
        this.passengers = value;
    }

    /**
     * Container for all of the search criteria related to location.  Used for all product types except vehicle only.
     * 
     * @return
     *     possible object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public OriginDestinationInformation getOriginDestinationInformation() {
        return originDestinationInformation;
    }

    /**
     * 设置originDestinationInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OriginDestinationInformation }
     *     
     */
    public void setOriginDestinationInformation(OriginDestinationInformation value) {
        this.originDestinationInformation = value;
    }

    /**
     * 获取hotelInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link HotelInformation }
     *     
     */
    public HotelInformation getHotelInformation() {
        return hotelInformation;
    }

    /**
     * 设置hotelInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelInformation }
     *     
     */
    public void setHotelInformation(HotelInformation value) {
        this.hotelInformation = value;
    }

    /**
     * 获取vehicleInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleInformation }
     *     
     */
    public VehicleInformation getVehicleInformation() {
        return vehicleInformation;
    }

    /**
     * 设置vehicleInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleInformation }
     *     
     */
    public void setVehicleInformation(VehicleInformation value) {
        this.vehicleInformation = value;
    }

    /**
     * 获取flightInformation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightInformation }
     *     
     */
    public FlightInformation getFlightInformation() {
        return flightInformation;
    }

    /**
     * 设置flightInformation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightInformation }
     *     
     */
    public void setFlightInformation(FlightInformation value) {
        this.flightInformation = value;
    }

}
