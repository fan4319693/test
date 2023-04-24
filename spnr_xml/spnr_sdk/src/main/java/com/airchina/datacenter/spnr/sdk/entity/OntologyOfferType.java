//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Offer type, inclusion/ exclusion with ontology reference.
 * 
 * <p>OntologyOfferType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyOfferType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Offer" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTypesRequested">
 *                 &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
 *       &lt;attribute name="AllOffersInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "OntologyOfferType", propOrder = {
    "offer",
    "ontologyExtension"
})
public class OntologyOfferType {

    @XmlElement(name = "Offer", required = true)
    protected List<OntologyOfferType.Offer> offer;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;
    @XmlAttribute(name = "AllOffersInd")
    protected Boolean allOffersInd;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * Gets the value of the offer property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the offer property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOffer().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OntologyOfferType.Offer }
     * 
     * 
     */
    public List<OntologyOfferType.Offer> getOffer() {
        if (offer == null) {
            offer = new ArrayList<OntologyOfferType.Offer>();
        }
        return this.offer;
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
     * 获取allOffersInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAllOffersInd() {
        return allOffersInd;
    }

    /**
     * 设置allOffersInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAllOffersInd(Boolean value) {
        this.allOffersInd = value;
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTypesRequested">
     *       &lt;attribute name="ExcludeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
    public static class Offer {

        @XmlValue
        protected ListOfferTypesRequested value;
        @XmlAttribute(name = "ExcludeInd")
        protected Boolean excludeInd;
        @XmlAttribute(name = "OtherType")
        protected String otherType;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Coverage Type (COV) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferTypesRequested }
         *     
         */
        public ListOfferTypesRequested getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferTypesRequested }
         *     
         */
        public void setValue(ListOfferTypesRequested value) {
            this.value = value;
        }

        /**
         * 获取excludeInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isExcludeInd() {
            return excludeInd;
        }

        /**
         * 设置excludeInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setExcludeInd(Boolean value) {
            this.excludeInd = value;
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
