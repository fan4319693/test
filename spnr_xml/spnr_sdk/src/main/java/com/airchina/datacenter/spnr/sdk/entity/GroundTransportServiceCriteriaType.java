//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of criteria for identifying the preferred ground transport service.
 * 
 * <p>GroundTransportServiceCriteriaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GroundTransportServiceCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BusCriteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FromDeadline" type="{http://www.opentravel.org/OTA/2003/05}DeadlineType" minOccurs="0"/>
 *                   &lt;element name="ToDeadline" type="{http://www.opentravel.org/OTA/2003/05}DeadlineType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MaxSchedules" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="LocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="CodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" default="IATA" />
 *       &lt;attribute name="Direction" type="{http://www.opentravel.org/OTA/2003/05}AirportAncillaryDirection" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GroundTransportServiceCriteriaType", propOrder = {
    "busCriteria"
})
public class GroundTransportServiceCriteriaType {

    @XmlElement(name = "BusCriteria")
    protected GroundTransportServiceCriteriaType.BusCriteria busCriteria;
    @XmlAttribute(name = "LocationCode")
    protected String locationCode;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "Direction")
    protected AirportAncillaryDirection direction;

    /**
     * 获取busCriteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GroundTransportServiceCriteriaType.BusCriteria }
     *     
     */
    public GroundTransportServiceCriteriaType.BusCriteria getBusCriteria() {
        return busCriteria;
    }

    /**
     * 设置busCriteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GroundTransportServiceCriteriaType.BusCriteria }
     *     
     */
    public void setBusCriteria(GroundTransportServiceCriteriaType.BusCriteria value) {
        this.busCriteria = value;
    }

    /**
     * 获取locationCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLocationCode() {
        return locationCode;
    }

    /**
     * 设置locationCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLocationCode(String value) {
        this.locationCode = value;
    }

    /**
     * 获取codeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        if (codeContext == null) {
            return "IATA";
        } else {
            return codeContext;
        }
    }

    /**
     * 设置codeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * 获取direction属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AirportAncillaryDirection }
     *     
     */
    public AirportAncillaryDirection getDirection() {
        return direction;
    }

    /**
     * 设置direction属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AirportAncillaryDirection }
     *     
     */
    public void setDirection(AirportAncillaryDirection value) {
        this.direction = value;
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
     *       &lt;sequence>
     *         &lt;element name="FromDeadline" type="{http://www.opentravel.org/OTA/2003/05}DeadlineType" minOccurs="0"/>
     *         &lt;element name="ToDeadline" type="{http://www.opentravel.org/OTA/2003/05}DeadlineType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MaxSchedules" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "fromDeadline",
        "toDeadline"
    })
    public static class BusCriteria {

        @XmlElement(name = "FromDeadline")
        protected DeadlineType fromDeadline;
        @XmlElement(name = "ToDeadline")
        protected DeadlineType toDeadline;
        @XmlAttribute(name = "MaxSchedules")
        protected BigInteger maxSchedules;

        /**
         * 获取fromDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DeadlineType }
         *     
         */
        public DeadlineType getFromDeadline() {
            return fromDeadline;
        }

        /**
         * 设置fromDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DeadlineType }
         *     
         */
        public void setFromDeadline(DeadlineType value) {
            this.fromDeadline = value;
        }

        /**
         * 获取toDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DeadlineType }
         *     
         */
        public DeadlineType getToDeadline() {
            return toDeadline;
        }

        /**
         * 设置toDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DeadlineType }
         *     
         */
        public void setToDeadline(DeadlineType value) {
            this.toDeadline = value;
        }

        /**
         * 获取maxSchedules属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxSchedules() {
            return maxSchedules;
        }

        /**
         * 设置maxSchedules属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxSchedules(BigInteger value) {
            this.maxSchedules = value;
        }

    }

}
