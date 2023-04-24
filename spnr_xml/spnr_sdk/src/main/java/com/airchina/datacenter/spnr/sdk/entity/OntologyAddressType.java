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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Address information with ontology reference.
 * 
 * <p>OntologyAddressType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyAddressType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Street" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
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
 *         &lt;element name="City" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="StateProvince" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Postal" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Country" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PrivacyInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyAddressType", propOrder = {
    "street",
    "city",
    "stateProvince",
    "postal",
    "country",
    "ontologyExtension"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.OntologyLocationType.PhysicalLocation.class
})
public class OntologyAddressType {

    @XmlElement(name = "Street")
    protected OntologyAddressType.Street street;
    @XmlElement(name = "City")
    protected OntologyAddressType.City city;
    @XmlElement(name = "StateProvince")
    protected OntologyAddressType.StateProvince stateProvince;
    @XmlElement(name = "Postal")
    protected OntologyAddressType.Postal postal;
    @XmlElement(name = "Country")
    protected OntologyAddressType.Country country;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;
    @XmlAttribute(name = "PrivacyInd")
    protected Boolean privacyInd;

    /**
     * 获取street属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyAddressType.Street }
     *     
     */
    public OntologyAddressType.Street getStreet() {
        return street;
    }

    /**
     * 设置street属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyAddressType.Street }
     *     
     */
    public void setStreet(OntologyAddressType.Street value) {
        this.street = value;
    }

    /**
     * 获取city属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyAddressType.City }
     *     
     */
    public OntologyAddressType.City getCity() {
        return city;
    }

    /**
     * 设置city属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyAddressType.City }
     *     
     */
    public void setCity(OntologyAddressType.City value) {
        this.city = value;
    }

    /**
     * 获取stateProvince属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyAddressType.StateProvince }
     *     
     */
    public OntologyAddressType.StateProvince getStateProvince() {
        return stateProvince;
    }

    /**
     * 设置stateProvince属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyAddressType.StateProvince }
     *     
     */
    public void setStateProvince(OntologyAddressType.StateProvince value) {
        this.stateProvince = value;
    }

    /**
     * 获取postal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyAddressType.Postal }
     *     
     */
    public OntologyAddressType.Postal getPostal() {
        return postal;
    }

    /**
     * 设置postal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyAddressType.Postal }
     *     
     */
    public void setPostal(OntologyAddressType.Postal value) {
        this.postal = value;
    }

    /**
     * 获取country属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyAddressType.Country }
     *     
     */
    public OntologyAddressType.Country getCountry() {
        return country;
    }

    /**
     * 设置country属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyAddressType.Country }
     *     
     */
    public void setCountry(OntologyAddressType.Country value) {
        this.country = value;
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
     * 获取privacyInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPrivacyInd() {
        return privacyInd;
    }

    /**
     * 设置privacyInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPrivacyInd(Boolean value) {
        this.privacyInd = value;
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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class City
        extends OntologyCodeType
    {


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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Country
        extends OntologyCodeType
    {


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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Postal
        extends OntologyCodeType
    {


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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StateProvince
        extends OntologyCodeType
    {


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
    public static class Street {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

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
