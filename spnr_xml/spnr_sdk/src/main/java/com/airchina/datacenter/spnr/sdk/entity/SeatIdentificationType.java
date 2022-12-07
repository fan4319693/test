//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines a specific seat on the train.
 * 
 * <p>SeatIdentificationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatIdentificationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="CarNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="SeatNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Deck" type="{http://www.opentravel.org/OTA/2003/05}DeckType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatIdentificationType")
public class SeatIdentificationType {

    @XmlAttribute(name = "CarNumber", required = true)
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger carNumber;
    @XmlAttribute(name = "SeatNumber", required = true)
    @XmlSchemaType(name = "anySimpleType")
    protected String seatNumber;
    @XmlAttribute(name = "Deck")
    protected DeckType deck;

    /**
     * 获取carNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCarNumber() {
        return carNumber;
    }

    /**
     * 设置carNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCarNumber(BigInteger value) {
        this.carNumber = value;
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

}
