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


/**
 * Search qualifiers that can be used to identify a cruise.
 * 
 * <p>SailingSearchQualifierType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SailingSearchQualifierType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SearchQualifierType">
 *       &lt;sequence>
 *         &lt;element name="Port" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PortInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingSearchQualifierType", propOrder = {
    "port"
})
public class SailingSearchQualifierType
    extends SearchQualifierType
{

    @XmlElement(name = "Port")
    protected SailingSearchQualifierType.Port port;

    /**
     * 获取port属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SailingSearchQualifierType.Port }
     *     
     */
    public SailingSearchQualifierType.Port getPort() {
        return port;
    }

    /**
     * 设置port属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SailingSearchQualifierType.Port }
     *     
     */
    public void setPort(SailingSearchQualifierType.Port value) {
        this.port = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PortInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Port {

        @XmlAttribute(name = "EmbarkIndicator")
        protected Boolean embarkIndicator;
        @XmlAttribute(name = "DisembarkIndicator")
        protected Boolean disembarkIndicator;
        @XmlAttribute(name = "PortCode")
        protected String portCode;
        @XmlAttribute(name = "PortName")
        protected String portName;
        @XmlAttribute(name = "PortCountryCode")
        protected String portCountryCode;
        @XmlAttribute(name = "DockIndicator")
        protected Boolean dockIndicator;
        @XmlAttribute(name = "ShorexIndicator")
        protected Boolean shorexIndicator;

        /**
         * 获取embarkIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isEmbarkIndicator() {
            return embarkIndicator;
        }

        /**
         * 设置embarkIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setEmbarkIndicator(Boolean value) {
            this.embarkIndicator = value;
        }

        /**
         * 获取disembarkIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDisembarkIndicator() {
            return disembarkIndicator;
        }

        /**
         * 设置disembarkIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDisembarkIndicator(Boolean value) {
            this.disembarkIndicator = value;
        }

        /**
         * 获取portCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortCode() {
            return portCode;
        }

        /**
         * 设置portCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortCode(String value) {
            this.portCode = value;
        }

        /**
         * 获取portName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortName() {
            return portName;
        }

        /**
         * 设置portName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortName(String value) {
            this.portName = value;
        }

        /**
         * 获取portCountryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPortCountryCode() {
            return portCountryCode;
        }

        /**
         * 设置portCountryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPortCountryCode(String value) {
            this.portCountryCode = value;
        }

        /**
         * 获取dockIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDockIndicator() {
            return dockIndicator;
        }

        /**
         * 设置dockIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDockIndicator(Boolean value) {
            this.dockIndicator = value;
        }

        /**
         * 获取shorexIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isShorexIndicator() {
            return shorexIndicator;
        }

        /**
         * 设置shorexIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setShorexIndicator(Boolean value) {
            this.shorexIndicator = value;
        }

    }

}
