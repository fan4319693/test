//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Seat dimension information.
 * 
 * <p>SeatDimensionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatDimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Width" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="UOM" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pitch" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "SeatDimensionType", propOrder = {
    "width",
    "pitch"
})
public class SeatDimensionType {

    @XmlElement(name = "Width")
    protected SeatDimensionType.Width width;
    @XmlElement(name = "Pitch")
    protected SeatDimensionType.Pitch pitch;

    /**
     * 获取width属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDimensionType.Width }
     *     
     */
    public SeatDimensionType.Width getWidth() {
        return width;
    }

    /**
     * 设置width属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDimensionType.Width }
     *     
     */
    public void setWidth(SeatDimensionType.Width value) {
        this.width = value;
    }

    /**
     * 获取pitch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SeatDimensionType.Pitch }
     *     
     */
    public SeatDimensionType.Pitch getPitch() {
        return pitch;
    }

    /**
     * 设置pitch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SeatDimensionType.Pitch }
     *     
     */
    public void setPitch(SeatDimensionType.Pitch value) {
        this.pitch = value;
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
    public static class Pitch {

        @XmlValue
        protected String value;

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
     *       &lt;attribute name="UOM" use="required" type="{http://www.opentravel.org/OTA/2003/05}SeatDimensionUOMType" />
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
    public static class Width {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "UOM", required = true)
        protected SeatDimensionUOMType uom;

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
         * 获取uom属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SeatDimensionUOMType }
         *     
         */
        public SeatDimensionUOMType getUOM() {
            return uom;
        }

        /**
         * 设置uom属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SeatDimensionUOMType }
         *     
         */
        public void setUOM(SeatDimensionUOMType value) {
            this.uom = value;
        }

    }

}
