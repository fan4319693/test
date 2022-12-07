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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Detailed flight type preference definition.
 * 
 * <p>FlightDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FlightDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice minOccurs="0">
 *           &lt;element name="NonStop" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *           &lt;element name="DirectStop" type="{http://www.w3.org/2001/XMLSchema}positiveInteger"/>
 *           &lt;element name="Connections">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
 *                   &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="AirportChange" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *         &lt;element name="OvernightStop" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *         &lt;element name="RedEye" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FlightDetailType", propOrder = {
    "nonStop",
    "directStop",
    "connections",
    "airportChange",
    "overnightStop",
    "redEye"
})
public class FlightDetailType {

    @XmlElement(name = "NonStop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger nonStop;
    @XmlElement(name = "DirectStop")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger directStop;
    @XmlElement(name = "Connections")
    protected FlightDetailType.Connections connections;
    @XmlElement(name = "AirportChange")
    protected String airportChange;
    @XmlElement(name = "OvernightStop")
    protected String overnightStop;
    @XmlElement(name = "RedEye")
    protected String redEye;

    /**
     * 获取nonStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getNonStop() {
        return nonStop;
    }

    /**
     * 设置nonStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setNonStop(BigInteger value) {
        this.nonStop = value;
    }

    /**
     * 获取directStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDirectStop() {
        return directStop;
    }

    /**
     * 设置directStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDirectStop(BigInteger value) {
        this.directStop = value;
    }

    /**
     * 获取connections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FlightDetailType.Connections }
     *     
     */
    public FlightDetailType.Connections getConnections() {
        return connections;
    }

    /**
     * 设置connections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FlightDetailType.Connections }
     *     
     */
    public void setConnections(FlightDetailType.Connections value) {
        this.connections = value;
    }

    /**
     * 获取airportChange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirportChange() {
        return airportChange;
    }

    /**
     * 设置airportChange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirportChange(String value) {
        this.airportChange = value;
    }

    /**
     * 获取overnightStop属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOvernightStop() {
        return overnightStop;
    }

    /**
     * 设置overnightStop属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOvernightStop(String value) {
        this.overnightStop = value;
    }

    /**
     * 获取redEye属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRedEye() {
        return redEye;
    }

    /**
     * 设置redEye属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRedEye(String value) {
        this.redEye = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>positiveInteger">
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Connections {

        @XmlValue
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger value;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

    }

}
