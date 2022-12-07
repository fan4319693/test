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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Specific traveler requested accommodation information, including class and type, and associated accommodation attributes such as seat,  berth and compartment number, position, direction and adjacent seating preferences.
 * 
 * <p>RailAccommDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailAccommDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="Seat" type="{http://www.opentravel.org/OTA/2003/05}SeatDetailType"/>
 *           &lt;element name="Berth" type="{http://www.opentravel.org/OTA/2003/05}BerthDetailType"/>
 *         &lt;/choice>
 *         &lt;element name="Class" type="{http://www.opentravel.org/OTA/2003/05}AccommodationClass" minOccurs="0"/>
 *         &lt;element name="Compartment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
 *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                 &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Car" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Deck" type="{http://www.opentravel.org/OTA/2003/05}DeckType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAccommDetailType", propOrder = {
    "seat",
    "berth",
    "clazz",
    "compartment",
    "car"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.AccommodationServiceType.AccommodationDetail.class
})
public class RailAccommDetailType {

    @XmlElement(name = "Seat")
    protected SeatDetailType seat;
    @XmlElement(name = "Berth")
    protected BerthDetailType berth;
    @XmlElement(name = "Class")
    protected AccommodationClass clazz;
    @XmlElement(name = "Compartment")
    protected RailAccommDetailType.Compartment compartment;
    @XmlElement(name = "Car")
    protected RailAccommDetailType.Car car;
    @XmlAttribute(name = "Deck")
    protected DeckType deck;

    /**
     * 获取seat属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDetailType }
     *     
     */
    public SeatDetailType getSeat() {
        return seat;
    }

    /**
     * 设置seat属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDetailType }
     *     
     */
    public void setSeat(SeatDetailType value) {
        this.seat = value;
    }

    /**
     * 获取berth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BerthDetailType }
     *     
     */
    public BerthDetailType getBerth() {
        return berth;
    }

    /**
     * 设置berth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BerthDetailType }
     *     
     */
    public void setBerth(BerthDetailType value) {
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
     *     {@link RailAccommDetailType.Compartment }
     *     
     */
    public RailAccommDetailType.Compartment getCompartment() {
        return compartment;
    }

    /**
     * 设置compartment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailAccommDetailType.Compartment }
     *     
     */
    public void setCompartment(RailAccommDetailType.Compartment value) {
        this.compartment = value;
    }

    /**
     * 获取car属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailAccommDetailType.Car }
     *     
     */
    public RailAccommDetailType.Car getCar() {
        return car;
    }

    /**
     * 设置car属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailAccommDetailType.Car }
     *     
     */
    public void setCar(RailAccommDetailType.Car value) {
        this.car = value;
    }

    /**
     * 获取deck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DeckType }
     *     
     */
    public DeckType getDeck() {
        return deck;
    }

    /**
     * 设置deck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DeckType }
     *     
     */
    public void setDeck(DeckType value) {
        this.deck = value;
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
     *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Car {

        @XmlAttribute(name = "Number")
        protected String number;

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>CompartmentType">
     *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}CompartmentPositionType" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Compartment
        extends CompartmentType
    {

        @XmlAttribute(name = "Number")
        protected String number;
        @XmlAttribute(name = "Position")
        protected CompartmentPositionType position;

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * 获取position属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompartmentPositionType }
         *     
         */
        public CompartmentPositionType getPosition() {
            return position;
        }

        /**
         * 设置position属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompartmentPositionType }
         *     
         */
        public void setPosition(CompartmentPositionType value) {
            this.position = value;
        }

    }

}
