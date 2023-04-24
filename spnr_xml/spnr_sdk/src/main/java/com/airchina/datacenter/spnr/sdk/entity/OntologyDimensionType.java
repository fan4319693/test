//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Dimension measurement system, unit of measure and dimension values with ontology reference.
 * 
 * <p>OntologyDimensionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyDimensionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DimensionUnit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDimensionUOM">
 *                 &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="OtherType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OntologyRefID">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;pattern value="[0-9]{1,8}"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MeasurementSystem" use="required">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}List_OfferMeasurementSystem">
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="OntologyRefID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyDimensionType", propOrder = {
    "dimensionUnit",
    "ontologyExtension"
})
public class OntologyDimensionType {

    @XmlElement(name = "DimensionUnit")
    protected OntologyDimensionType.DimensionUnit dimensionUnit;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;
    @XmlAttribute(name = "MeasurementSystem", required = true)
    protected ListOfferMeasurementSystem measurementSystem;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * 获取dimensionUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyDimensionType.DimensionUnit }
     *     
     */
    public OntologyDimensionType.DimensionUnit getDimensionUnit() {
        return dimensionUnit;
    }

    /**
     * 设置dimensionUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyDimensionType.DimensionUnit }
     *     
     */
    public void setDimensionUnit(OntologyDimensionType.DimensionUnit value) {
        this.dimensionUnit = value;
    }

    /**
     * 获取ontologyExtension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyExtensionType }
     *     
     */
    public OntologyExtensionType getOntologyExtension() {
        return ontologyExtension;
    }

    /**
     * 设置ontologyExtension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyExtensionType }
     *     
     */
    public void setOntologyExtension(OntologyExtensionType value) {
        this.ontologyExtension = value;
    }

    /**
     * 获取measurementSystem属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListOfferMeasurementSystem }
     *     
     */
    public ListOfferMeasurementSystem getMeasurementSystem() {
        return measurementSystem;
    }

    /**
     * 设置measurementSystem属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListOfferMeasurementSystem }
     *     
     */
    public void setMeasurementSystem(ListOfferMeasurementSystem value) {
        this.measurementSystem = value;
    }

    /**
     * 获取ontologyRefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRefID() {
        return ontologyRefID;
    }

    /**
     * 设置ontologyRefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRefID(String value) {
        this.ontologyRefID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDimensionUOM">
     *       &lt;attribute name="Height" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Length" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="OtherType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OntologyRefID">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;pattern value="[0-9]{1,8}"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
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
    public static class DimensionUnit {

        @XmlValue
        protected ListOfferDimensionUOM value;
        @XmlAttribute(name = "Height")
        protected BigDecimal height;
        @XmlAttribute(name = "Length")
        protected BigDecimal length;
        @XmlAttribute(name = "Width")
        protected BigDecimal width;
        @XmlAttribute(name = "OtherType")
        protected String otherType;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Unit of Measure (UOM) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferDimensionUOM }
         *     
         */
        public ListOfferDimensionUOM getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferDimensionUOM }
         *     
         */
        public void setValue(ListOfferDimensionUOM value) {
            this.value = value;
        }

        /**
         * 获取height属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getHeight() {
            return height;
        }

        /**
         * 设置height属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setHeight(BigDecimal value) {
            this.height = value;
        }

        /**
         * 获取length属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getLength() {
            return length;
        }

        /**
         * 设置length属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setLength(BigDecimal value) {
            this.length = value;
        }

        /**
         * 获取width属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWidth() {
            return width;
        }

        /**
         * 设置width属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWidth(BigDecimal value) {
            this.width = value;
        }

        /**
         * 获取otherType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOtherType() {
            return otherType;
        }

        /**
         * 设置otherType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOtherType(String value) {
            this.otherType = value;
        }

        /**
         * 获取ontologyRefID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOntologyRefID() {
            return ontologyRefID;
        }

        /**
         * 设置ontologyRefID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOntologyRefID(String value) {
            this.ontologyRefID = value;
        }

    }

}
