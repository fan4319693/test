//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Baggage type, quantity, weight, size with ontology reference.
 * 
 * <p>OntologyBaggageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyBaggageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TotalWeight" type="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType" minOccurs="0"/>
 *         &lt;element name="Detail" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Item">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *                           &lt;attribute name="SpecialItemInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Size" type="{http://www.opentravel.org/OTA/2003/05}OntologyDimensionType" minOccurs="0"/>
 *                   &lt;element name="Weight" type="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SpecialItemInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TotalPieces" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyBaggageType", propOrder = {
    "totalWeight",
    "detail",
    "ontologyExtension"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.MultiModalOfferType.TripCharacteristics.Baggage.class
})
public class OntologyBaggageType {

    @XmlElement(name = "TotalWeight")
    protected OntologyWeightType totalWeight;
    @XmlElement(name = "Detail")
    protected List<OntologyBaggageType.Detail> detail;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;
    @XmlAttribute(name = "SpecialItemInd")
    protected Boolean specialItemInd;
    @XmlAttribute(name = "TotalPieces")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger totalPieces;

    /**
     * 获取totalWeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyWeightType }
     *     
     */
    public OntologyWeightType getTotalWeight() {
        return totalWeight;
    }

    /**
     * 设置totalWeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyWeightType }
     *     
     */
    public void setTotalWeight(OntologyWeightType value) {
        this.totalWeight = value;
    }

    /**
     * Gets the value of the detail property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the detail property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDetail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OntologyBaggageType.Detail }
     * 
     * 
     */
    public List<OntologyBaggageType.Detail> getDetail() {
        if (detail == null) {
            detail = new ArrayList<OntologyBaggageType.Detail>();
        }
        return this.detail;
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
     * 获取specialItemInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSpecialItemInd() {
        return specialItemInd;
    }

    /**
     * 设置specialItemInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSpecialItemInd(Boolean value) {
        this.specialItemInd = value;
    }

    /**
     * 获取totalPieces属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getTotalPieces() {
        return totalPieces;
    }

    /**
     * 设置totalPieces属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setTotalPieces(BigInteger value) {
        this.totalPieces = value;
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
     *         &lt;element name="Item">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
     *                 &lt;attribute name="SpecialItemInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Size" type="{http://www.opentravel.org/OTA/2003/05}OntologyDimensionType" minOccurs="0"/>
     *         &lt;element name="Weight" type="{http://www.opentravel.org/OTA/2003/05}OntologyWeightType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
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
        "item",
        "size",
        "weight",
        "ontologyExtension"
    })
    public static class Detail {

        @XmlElement(name = "Item", required = true)
        protected OntologyBaggageType.Detail.Item item;
        @XmlElement(name = "Size")
        protected OntologyDimensionType size;
        @XmlElement(name = "Weight")
        protected OntologyWeightType weight;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;

        /**
         * 获取item属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyBaggageType.Detail.Item }
         *     
         */
        public OntologyBaggageType.Detail.Item getItem() {
            return item;
        }

        /**
         * 设置item属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyBaggageType.Detail.Item }
         *     
         */
        public void setItem(OntologyBaggageType.Detail.Item value) {
            this.item = value;
        }

        /**
         * 获取size属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyDimensionType }
         *     
         */
        public OntologyDimensionType getSize() {
            return size;
        }

        /**
         * 设置size属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyDimensionType }
         *     
         */
        public void setSize(OntologyDimensionType value) {
            this.size = value;
        }

        /**
         * 获取weight属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyWeightType }
         *     
         */
        public OntologyWeightType getWeight() {
            return weight;
        }

        /**
         * 设置weight属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyWeightType }
         *     
         */
        public void setWeight(OntologyWeightType value) {
            this.weight = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
         *       &lt;attribute name="SpecialItemInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Item
            extends OntologyCodeType
        {

            @XmlAttribute(name = "SpecialItemInd")
            protected Boolean specialItemInd;

            /**
             * 获取specialItemInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSpecialItemInd() {
                return specialItemInd;
            }

            /**
             * 设置specialItemInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSpecialItemInd(Boolean value) {
                this.specialItemInd = value;
            }

        }

    }

}
