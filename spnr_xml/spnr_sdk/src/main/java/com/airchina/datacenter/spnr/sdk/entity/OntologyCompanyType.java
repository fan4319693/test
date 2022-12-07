//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Company name, code, travel segment with ontology reference.
 * 
 * <p>OntologyCompanyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyCompanyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NameOrCode" type="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType"/>
 *         &lt;element name="TravelSegment" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTravelSegment">
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
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyCompanyType", propOrder = {
    "nameOrCode",
    "travelSegment",
    "ontologyExtension"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.MultiModalOfferType.RequestingParty.class
})
public class OntologyCompanyType {

    @XmlElement(name = "NameOrCode", required = true)
    protected OntologyCodeType nameOrCode;
    @XmlElement(name = "TravelSegment")
    protected OntologyCompanyType.TravelSegment travelSegment;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;

    /**
     * 获取nameOrCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyCodeType }
     *     
     */
    public OntologyCodeType getNameOrCode() {
        return nameOrCode;
    }

    /**
     * 设置nameOrCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyCodeType }
     *     
     */
    public void setNameOrCode(OntologyCodeType value) {
        this.nameOrCode = value;
    }

    /**
     * 获取travelSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyCompanyType.TravelSegment }
     *     
     */
    public OntologyCompanyType.TravelSegment getTravelSegment() {
        return travelSegment;
    }

    /**
     * 设置travelSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyCompanyType.TravelSegment }
     *     
     */
    public void setTravelSegment(OntologyCompanyType.TravelSegment value) {
        this.travelSegment = value;
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
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferTravelSegment">
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
    public static class TravelSegment {

        @XmlValue
        protected ListOfferTravelSegment value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: OpenTravel
         * 
         * @return
         *     possible object is
         *     {@link ListOfferTravelSegment }
         *     
         */
        public ListOfferTravelSegment getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferTravelSegment }
         *     
         */
        public void setValue(ListOfferTravelSegment value) {
            this.value = value;
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
