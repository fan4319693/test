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
 *  =notes=
 * 
 * 				1. The type is defined by the Unit attribute. If for example this number is 3 and the unit is D, the advance purchase restriction is 3 DAYS.
 * 
 * <p>AdvanceTicketingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdvanceTicketingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AdvanceReservation" type="{http://www.opentravel.org/OTA/2003/05}AdvanceReservationType" minOccurs="0"/>
 *         &lt;element name="AdvanceDeparture" type="{http://www.opentravel.org/OTA/2003/05}AdvanceDepartureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvanceTicketingType", propOrder = {
    "advanceReservation",
    "advanceDeparture"
})
public class AdvanceTicketingType {

    @XmlElement(name = "AdvanceReservation")
    protected AdvanceReservationType advanceReservation;
    @XmlElement(name = "AdvanceDeparture")
    protected AdvanceDepartureType advanceDeparture;

    /**
     * 获取advanceReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdvanceReservationType }
     *     
     */
    public AdvanceReservationType getAdvanceReservation() {
        return advanceReservation;
    }

    /**
     * 设置advanceReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceReservationType }
     *     
     */
    public void setAdvanceReservation(AdvanceReservationType value) {
        this.advanceReservation = value;
    }

    /**
     * 获取advanceDeparture属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AdvanceDepartureType }
     *     
     */
    public AdvanceDepartureType getAdvanceDeparture() {
        return advanceDeparture;
    }

    /**
     * 设置advanceDeparture属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AdvanceDepartureType }
     *     
     */
    public void setAdvanceDeparture(AdvanceDepartureType value) {
        this.advanceDeparture = value;
    }

}
