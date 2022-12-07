//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Checked baggage allowance information.
 * 
 * <p>CheckedBagAllowanceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CheckedBagAllowanceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;sequence>
 *             &lt;element name="MaxWeightPerPiece" maxOccurs="2" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                     &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *                   &lt;/extension>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *             &lt;element name="MaxLengthPerPiece" maxOccurs="2" minOccurs="0">
 *               &lt;complexType>
 *                 &lt;simpleContent>
 *                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                     &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SizeUnitType" />
 *                   &lt;/extension>
 *                 &lt;/simpleContent>
 *               &lt;/complexType>
 *             &lt;/element>
 *           &lt;/sequence>
 *           &lt;element name="BaggageDescription" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;choice>
 *           &lt;element name="MaxPieces" type="{http://www.w3.org/2001/XMLSchema}integer" minOccurs="0"/>
 *           &lt;element name="TotalWeight" minOccurs="0">
 *             &lt;complexType>
 *               &lt;simpleContent>
 *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                   &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *                 &lt;/extension>
 *               &lt;/simpleContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *         &lt;element name="MSCarrier" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CheckedBagAllowanceType", propOrder = {
    "maxWeightPerPiece",
    "maxLengthPerPiece",
    "baggageDescription",
    "maxPieces",
    "totalWeight",
    "msCarrier"
})
public class CheckedBagAllowanceType {

    @XmlElement(name = "MaxWeightPerPiece")
    protected List<CheckedBagAllowanceType.MaxWeightPerPiece> maxWeightPerPiece;
    @XmlElement(name = "MaxLengthPerPiece")
    protected List<CheckedBagAllowanceType.MaxLengthPerPiece> maxLengthPerPiece;
    @XmlElement(name = "BaggageDescription")
    protected CheckedBagAllowanceType.BaggageDescription baggageDescription;
    @XmlElement(name = "MaxPieces")
    protected BigInteger maxPieces;
    @XmlElement(name = "TotalWeight")
    protected CheckedBagAllowanceType.TotalWeight totalWeight;
    @XmlElement(name = "MSCarrier")
    protected String msCarrier;

    /**
     * Gets the value of the maxWeightPerPiece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxWeightPerPiece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxWeightPerPiece().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckedBagAllowanceType.MaxWeightPerPiece }
     * 
     * 
     */
    public List<CheckedBagAllowanceType.MaxWeightPerPiece> getMaxWeightPerPiece() {
        if (maxWeightPerPiece == null) {
            maxWeightPerPiece = new ArrayList<CheckedBagAllowanceType.MaxWeightPerPiece>();
        }
        return this.maxWeightPerPiece;
    }

    /**
     * Gets the value of the maxLengthPerPiece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the maxLengthPerPiece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMaxLengthPerPiece().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CheckedBagAllowanceType.MaxLengthPerPiece }
     * 
     * 
     */
    public List<CheckedBagAllowanceType.MaxLengthPerPiece> getMaxLengthPerPiece() {
        if (maxLengthPerPiece == null) {
            maxLengthPerPiece = new ArrayList<CheckedBagAllowanceType.MaxLengthPerPiece>();
        }
        return this.maxLengthPerPiece;
    }

    /**
     * 获取baggageDescription属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckedBagAllowanceType.BaggageDescription }
     *     
     */
    public CheckedBagAllowanceType.BaggageDescription getBaggageDescription() {
        return baggageDescription;
    }

    /**
     * 设置baggageDescription属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBagAllowanceType.BaggageDescription }
     *     
     */
    public void setBaggageDescription(CheckedBagAllowanceType.BaggageDescription value) {
        this.baggageDescription = value;
    }

    /**
     * 获取maxPieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxPieces() {
        return maxPieces;
    }

    /**
     * 设置maxPieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxPieces(BigInteger value) {
        this.maxPieces = value;
    }

    /**
     * 获取totalWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CheckedBagAllowanceType.TotalWeight }
     *     
     */
    public CheckedBagAllowanceType.TotalWeight getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置totalWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CheckedBagAllowanceType.TotalWeight }
     *     
     */
    public void setTotalWeight(CheckedBagAllowanceType.TotalWeight value) {
        this.totalWeight = value;
    }

    /**
     * 获取msCarrier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMSCarrier() {
        return msCarrier;
    }

    /**
     * 设置msCarrier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMSCarrier(String value) {
        this.msCarrier = value;
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
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class BaggageDescription {

        @XmlElement(name = "Text", required = true)
        protected List<String> text;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}SizeUnitType" />
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
    public static class MaxLengthPerPiece {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "Unit", required = true)
        protected SizeUnitType unit;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SizeUnitType }
         *     
         */
        public SizeUnitType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SizeUnitType }
         *     
         */
        public void setUnit(SizeUnitType value) {
            this.unit = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
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
    public static class MaxWeightPerPiece {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "Unit", required = true)
        protected WeightUnitType unit;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link WeightUnitType }
         *     
         */
        public WeightUnitType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WeightUnitType }
         *     
         */
        public void setUnit(WeightUnitType value) {
            this.unit = value;
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
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
     *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
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
    public static class TotalWeight {

        @XmlValue
        protected BigDecimal value;
        @XmlAttribute(name = "Unit", required = true)
        protected WeightUnitType unit;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setValue(BigDecimal value) {
            this.value = value;
        }

        /**
         * 获取unit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link WeightUnitType }
         *     
         */
        public WeightUnitType getUnit() {
            return unit;
        }

        /**
         * 设置unit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link WeightUnitType }
         *     
         */
        public void setUnit(WeightUnitType value) {
            this.unit = value;
        }

    }

}
