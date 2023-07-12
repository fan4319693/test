//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Defines information about a seat on a train.
 * 
 * <p>SeatDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatDetailType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>SeatAccommodationType">
 *       &lt;attribute name="Number" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}SeatPositionType" />
 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}SeatDirectionType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatDetailType", propOrder = {
    "value"
})
public class SeatDetailType {

    @XmlValue
    protected SeatAccommodationType value;
    @XmlAttribute(name = "Number")
    protected String number;
    @XmlAttribute(name = "Position")
    protected SeatPositionType position;
    @XmlAttribute(name = "Direction")
    protected SeatDirectionType direction;

    /**
     * Identifies the type of seat accommodation, such as lower level and upper level.
     * 
     * @return
     *     possible object is
     *     {@link SeatAccommodationType }
     *     
     */
    public SeatAccommodationType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatAccommodationType }
     *     
     */
    public void setValue(SeatAccommodationType value) {
        this.value = value;
    }

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
     *     {@link SeatPositionType }
     *     
     */
    public SeatPositionType getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatPositionType }
     *     
     */
    public void setPosition(SeatPositionType value) {
        this.position = value;
    }

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDirectionType }
     *     
     */
    public SeatDirectionType getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDirectionType }
     *     
     */
    public void setDirection(SeatDirectionType value) {
        this.direction = value;
    }

}
