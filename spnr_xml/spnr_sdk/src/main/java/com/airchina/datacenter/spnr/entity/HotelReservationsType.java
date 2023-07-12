//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of hotel reservations.
 * 
 * <p>HotelReservationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="HotelReservationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="HotelReservation" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
 *                 &lt;attribute name="OnRequest" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RoutingHops" type="{http://www.opentravel.org/OTA/2003/05}RoutingHopType" minOccurs="0"/>
 *         &lt;element name="WrittenConfInst" type="{http://www.opentravel.org/OTA/2003/05}WrittenConfInstType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "HotelReservationsType", propOrder = {
    "hotelReservation",
    "routingHops",
    "writtenConfInst"
})
public class HotelReservationsType {

    @XmlElement(name = "HotelReservation", required = true)
    protected List<HotelReservationsType.HotelReservation> hotelReservation;
    @XmlElement(name = "RoutingHops")
    protected RoutingHopType routingHops;
    @XmlElement(name = "WrittenConfInst")
    protected WrittenConfInstType writtenConfInst;

    /**
     * Gets the value of the hotelReservation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the hotelReservation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getHotelReservation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link HotelReservationsType.HotelReservation }
     * 
     * 
     */
    public List<HotelReservationsType.HotelReservation> getHotelReservation() {
        if (hotelReservation == null) {
            hotelReservation = new ArrayList<HotelReservationsType.HotelReservation>();
        }
        return this.hotelReservation;
    }

    /**
     * 获取routingHops属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RoutingHopType }
     *     
     */
    public RoutingHopType getRoutingHops() {
        return routingHops;
    }

    /**
     * 设置routingHops属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RoutingHopType }
     *     
     */
    public void setRoutingHops(RoutingHopType value) {
        this.routingHops = value;
    }

    /**
     * 获取writtenConfInst属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WrittenConfInstType }
     *     
     */
    public WrittenConfInstType getWrittenConfInst() {
        return writtenConfInst;
    }

    /**
     * 设置writtenConfInst属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WrittenConfInstType }
     *     
     */
    public void setWrittenConfInst(WrittenConfInstType value) {
        this.writtenConfInst = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}HotelReservationType">
     *       &lt;attribute name="OnRequest" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PaymentType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class HotelReservation
        extends HotelReservationType
    {

        @XmlAttribute(name = "OnRequest", required = true)
        protected boolean onRequest;
        @XmlAttribute(name = "PaymentType", required = true)
        protected String paymentType;

        /**
         * 获取onRequest属性的值。
         * 
         */
        public boolean isOnRequest() {
            return onRequest;
        }

        /**
         * 设置onRequest属性的值。
         * 
         */
        public void setOnRequest(boolean value) {
            this.onRequest = value;
        }

        /**
         * 获取paymentType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaymentType() {
            return paymentType;
        }

        /**
         * 设置paymentType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaymentType(String value) {
            this.paymentType = value;
        }

    }

}
