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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * The category of accommodation on a train.
 * 
 * <p>AccommodationCategoryBaseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationCategoryBaseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Seat" type="{http://www.opentravel.org/OTA/2003/05}SeatAccommodationType"/>
 *           &lt;element name="Berth" type="{http://www.opentravel.org/OTA/2003/05}BerthAccommodationType"/>
 *         &lt;/choice>
 *         &lt;element name="Class" type="{http://www.opentravel.org/OTA/2003/05}AccommodationClass" minOccurs="0"/>
 *         &lt;element name="Compartment" type="{http://www.opentravel.org/OTA/2003/05}CompartmentType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationCategoryBaseType", propOrder = {
    "seat",
    "berth",
    "clazz",
    "compartment"
})
public class AccommodationCategoryBaseType {

    @XmlElement(name = "Seat")
    @XmlSchemaType(name = "string")
    protected SeatAccommodationType seat;
    @XmlElement(name = "Berth")
    @XmlSchemaType(name = "string")
    protected BerthAccommodationType berth;
    @XmlElement(name = "Class")
    protected AccommodationClass clazz;
    @XmlElement(name = "Compartment")
    protected CompartmentType compartment;

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
     *     {@link CompartmentType }
     *     
     */
    public CompartmentType getCompartment() {
        return compartment;
    }

    /**
     * 设置compartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompartmentType }
     *     
     */
    public void setCompartment(CompartmentType value) {
        this.compartment = value;
    }

}
