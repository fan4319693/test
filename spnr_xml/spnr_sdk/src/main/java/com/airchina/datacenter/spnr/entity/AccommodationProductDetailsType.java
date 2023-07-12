//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AccommodationProductDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" type="{http://www.opentravel.org/OTA/2003/05}RoomStayType"/>
 *         &lt;element name="Services" type="{http://www.opentravel.org/OTA/2003/05}ServicesType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationProductDetailsType", propOrder = {
    "roomStay",
    "services"
})
public class AccommodationProductDetailsType {

    @XmlElement(name = "RoomStay", required = true)
    protected RoomStayType roomStay;
    @XmlElement(name = "Services")
    protected ServicesType services;

    /**
     * 获取roomStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoomStayType }
     *     
     */
    public RoomStayType getRoomStay() {
        return roomStay;
    }

    /**
     * 设置roomStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoomStayType }
     *     
     */
    public void setRoomStay(RoomStayType value) {
        this.roomStay = value;
    }

    /**
     * 获取services属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServicesType }
     *     
     */
    public ServicesType getServices() {
        return services;
    }

    /**
     * 设置services属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServicesType }
     *     
     */
    public void setServices(ServicesType value) {
        this.services = value;
    }

}
