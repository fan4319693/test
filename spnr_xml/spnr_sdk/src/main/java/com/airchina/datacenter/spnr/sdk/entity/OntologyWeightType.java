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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Weight measurement system, unit of measure and weight value with ontology reference.
 * 
 * <p>OntologyWeightType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyWeightType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="WeightUnit" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferWeightUOM">
 *                 &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
@XmlType(name = "OntologyWeightType", propOrder = {
    "weightUnit"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.OntologyAnimalType.Detail.Weight.class
})
public class OntologyWeightType {

    @XmlElement(name = "WeightUnit")
    protected OntologyWeightType.WeightUnit weightUnit;
    @XmlAttribute(name = "MeasurementSystem", required = true)
    protected ListOfferMeasurementSystem measurementSystem;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * 获取weightUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyWeightType.WeightUnit }
     *     
     */
    public OntologyWeightType.WeightUnit getWeightUnit() {
        return weightUnit;
    }

    /**
     * 设置weightUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyWeightType.WeightUnit }
     *     
     */
    public void setWeightUnit(OntologyWeightType.WeightUnit value) {
        this.weightUnit = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferWeightUOM">
     *       &lt;attribute name="Weight" use="required" type="{http://www.w3.org/2001/XMLSchema}decimal" />
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
    public static class WeightUnit {

        @XmlValue
        protected ListOfferWeightUOM value;
        @XmlAttribute(name = "Weight", required = true)
        protected BigDecimal weight;
        @XmlAttribute(name = "OtherType")
        protected String otherType;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Unit of Measure (UOM) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferWeightUOM }
         *     
         */
        public ListOfferWeightUOM getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferWeightUOM }
         *     
         */
        public void setValue(ListOfferWeightUOM value) {
            this.value = value;
        }

        /**
         * 获取weight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getWeight() {
            return weight;
        }

        /**
         * 设置weight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setWeight(BigDecimal value) {
            this.weight = value;
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
