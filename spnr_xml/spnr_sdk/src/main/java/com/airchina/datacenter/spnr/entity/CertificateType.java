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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Electronic Certificate information.
 * 
 * 				=notes=
 * 				1. Supports non-revenue and flightpass certificates.
 * 
 * <p>CertificateType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CertificateType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="IssuingAirline" type="{http://www.opentravel.org/OTA/2003/05}AirlineCodeType"/>
 *         &lt;element name="ProgramName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Holder" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="IATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
 *                 &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FQTVNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CertificateType", propOrder = {
    "number",
    "issuingAirline",
    "programName",
    "holder"
})
public class CertificateType {

    @XmlElement(name = "Number", required = true)
    protected String number;
    @XmlElement(name = "IssuingAirline", required = true)
    protected String issuingAirline;
    @XmlElement(name = "ProgramName")
    protected CertificateType.ProgramName programName;
    @XmlElement(name = "Holder")
    protected CertificateType.Holder holder;

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
     * 获取issuingAirline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getIssuingAirline() {
        return issuingAirline;
    }

    /**
     * 设置issuingAirline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setIssuingAirline(String value) {
        this.issuingAirline = value;
    }

    /**
     * 获取programName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertificateType.ProgramName }
     *     
     */
    public CertificateType.ProgramName getProgramName() {
        return programName;
    }

    /**
     * 设置programName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType.ProgramName }
     *     
     */
    public void setProgramName(CertificateType.ProgramName value) {
        this.programName = value;
    }

    /**
     * 获取holder属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CertificateType.Holder }
     *     
     */
    public CertificateType.Holder getHolder() {
        return holder;
    }

    /**
     * 设置holder属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CertificateType.Holder }
     *     
     */
    public void setHolder(CertificateType.Holder value) {
        this.holder = value;
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
     *       &lt;attribute name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="IATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
     *       &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FQTVNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Holder {

        @XmlAttribute(name = "OwnerID")
        protected String ownerID;
        @XmlAttribute(name = "IATA")
        protected String iata;
        @XmlAttribute(name = "CorpID")
        protected String corpID;
        @XmlAttribute(name = "FQTVNumber")
        protected String fqtvNumber;

        /**
         * 获取ownerID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwnerID() {
            return ownerID;
        }

        /**
         * 设置ownerID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwnerID(String value) {
            this.ownerID = value;
        }

        /**
         * 获取iata属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getIATA() {
            return iata;
        }

        /**
         * 设置iata属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setIATA(String value) {
            this.iata = value;
        }

        /**
         * 获取corpID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorpID() {
            return corpID;
        }

        /**
         * 设置corpID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorpID(String value) {
            this.corpID = value;
        }

        /**
         * 获取fqtvNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFQTVNumber() {
            return fqtvNumber;
        }

        /**
         * 设置fqtvNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFQTVNumber(String value) {
            this.fqtvNumber = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
    public static class ProgramName {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Type")
        protected String type;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
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
