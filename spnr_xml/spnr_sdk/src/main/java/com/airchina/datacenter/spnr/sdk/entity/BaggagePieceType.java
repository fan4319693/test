//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Baggage
 * 				piece allowance detail.
 * 			
 * 
 * <p>BaggagePieceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaggagePieceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="DescriptionVariable" type="{http://www.opentravel.org/OTA/2003/05}SrvcDesVariableType" minOccurs="0"/>
 *         &lt;element name="DescriptionDetails" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaxWeight" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>decimal">
 *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}WeightUnitType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}BaggageDimensionsType" minOccurs="0"/>
 *         &lt;element name="MaxItems" type="{http://www.w3.org/2001/XMLSchema}decimal" minOccurs="0"/>
 *         &lt;element name="Attributes" type="{http://www.opentravel.org/OTA/2003/05}AttributesType" minOccurs="0"/>
 *         &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
 *         &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SubCodeReq"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaggagePieceType", propOrder = {
    "description",
    "descriptionVariable",
    "descriptionDetails",
    "maxWeight",
    "maxDimensions",
    "maxItems",
    "attributes",
    "s5",
    "s7"
})
public class BaggagePieceType {

    @XmlElement(name = "Description", required = true)
    protected String description;
    @XmlElement(name = "DescriptionVariable")
    protected SrvcDesVariableType descriptionVariable;
    @XmlElement(name = "DescriptionDetails")
    protected BaggagePieceType.DescriptionDetails descriptionDetails;
    @XmlElement(name = "MaxWeight")
    protected BaggagePieceType.MaxWeight maxWeight;
    @XmlElement(name = "MaxDimensions")
    protected BaggageDimensionsType maxDimensions;
    @XmlElement(name = "MaxItems")
    protected BigDecimal maxItems;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "S5")
    protected S5Type s5;
    @XmlElement(name = "S7")
    protected S7Type s7;
    @XmlAttribute(name = "SubCode", required = true)
    protected String subCode;

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取descriptionVariable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SrvcDesVariableType }
     *     
     */
    public SrvcDesVariableType getDescriptionVariable() {
        return descriptionVariable;
    }

    /**
     * 设置descriptionVariable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SrvcDesVariableType }
     *     
     */
    public void setDescriptionVariable(SrvcDesVariableType value) {
        this.descriptionVariable = value;
    }

    /**
     * 获取descriptionDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaggagePieceType.DescriptionDetails }
     *     
     */
    public BaggagePieceType.DescriptionDetails getDescriptionDetails() {
        return descriptionDetails;
    }

    /**
     * 设置descriptionDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePieceType.DescriptionDetails }
     *     
     */
    public void setDescriptionDetails(BaggagePieceType.DescriptionDetails value) {
        this.descriptionDetails = value;
    }

    /**
     * 获取maxWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaggagePieceType.MaxWeight }
     *     
     */
    public BaggagePieceType.MaxWeight getMaxWeight() {
        return maxWeight;
    }

    /**
     * 设置maxWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaggagePieceType.MaxWeight }
     *     
     */
    public void setMaxWeight(BaggagePieceType.MaxWeight value) {
        this.maxWeight = value;
    }

    /**
     * 获取maxDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaggageDimensionsType }
     *     
     */
    public BaggageDimensionsType getMaxDimensions() {
        return maxDimensions;
    }

    /**
     * 设置maxDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaggageDimensionsType }
     *     
     */
    public void setMaxDimensions(BaggageDimensionsType value) {
        this.maxDimensions = value;
    }

    /**
     * 获取maxItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getMaxItems() {
        return maxItems;
    }

    /**
     * 设置maxItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setMaxItems(BigDecimal value) {
        this.maxItems = value;
    }

    /**
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * 获取s5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S5Type }
     *     
     */
    public S5Type getS5() {
        return s5;
    }

    /**
     * 设置s5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S5Type }
     *     
     */
    public void setS5(S5Type value) {
        this.s5 = value;
    }

    /**
     * 获取s7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S7Type }
     *     
     */
    public S7Type getS7() {
        return s7;
    }

    /**
     * 设置s7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S7Type }
     *     
     */
    public void setS7(S7Type value) {
        this.s7 = value;
    }

    /**
     * 获取subCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * 设置subCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
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
    public static class DescriptionDetails {

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
    public static class MaxWeight {

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
