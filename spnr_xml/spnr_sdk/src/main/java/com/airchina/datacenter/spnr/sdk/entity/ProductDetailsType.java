//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ProductDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="AirProductDetails" type="{http://www.opentravel.org/OTA/2003/05}AirProductDetailsType"/>
 *         &lt;element name="HotelProductDetails" type="{http://www.opentravel.org/OTA/2003/05}AccommodationProductDetailsType"/>
 *         &lt;element name="VehicleProductDetails" type="{http://www.opentravel.org/OTA/2003/05}VehicleProductDetailsType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProductDetailsType", propOrder = {
    "airProductDetails",
    "hotelProductDetails",
    "vehicleProductDetails"
})
public class ProductDetailsType {

    @XmlElement(name = "AirProductDetails")
    protected AirProductDetailsType airProductDetails;
    @XmlElement(name = "HotelProductDetails")
    protected AccommodationProductDetailsType hotelProductDetails;
    @XmlElement(name = "VehicleProductDetails")
    protected VehicleProductDetailsType vehicleProductDetails;

    /**
     * 获取airProductDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirProductDetailsType }
     *     
     */
    public AirProductDetailsType getAirProductDetails() {
        return airProductDetails;
    }

    /**
     * 设置airProductDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirProductDetailsType }
     *     
     */
    public void setAirProductDetails(AirProductDetailsType value) {
        this.airProductDetails = value;
    }

    /**
     * 获取hotelProductDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationProductDetailsType }
     *     
     */
    public AccommodationProductDetailsType getHotelProductDetails() {
        return hotelProductDetails;
    }

    /**
     * 设置hotelProductDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationProductDetailsType }
     *     
     */
    public void setHotelProductDetails(AccommodationProductDetailsType value) {
        this.hotelProductDetails = value;
    }

    /**
     * 获取vehicleProductDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleProductDetailsType }
     *     
     */
    public VehicleProductDetailsType getVehicleProductDetails() {
        return vehicleProductDetails;
    }

    /**
     * 设置vehicleProductDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleProductDetailsType }
     *     
     */
    public void setVehicleProductDetails(VehicleProductDetailsType value) {
        this.vehicleProductDetails = value;
    }

}
