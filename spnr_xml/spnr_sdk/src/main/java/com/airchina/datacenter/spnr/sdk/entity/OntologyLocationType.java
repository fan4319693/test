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
 * Location information with ontology reference.
 * 
 * <p>OntologyLocationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyLocationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Type">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferLocationType">
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
 *         &lt;choice>
 *           &lt;element name="GeneralLocation" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyCodeType">
 *                   &lt;sequence>
 *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                   &lt;/sequence>
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="Geocode" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;choice>
 *                       &lt;sequence>
 *                         &lt;element name="Latitude">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                         &lt;element name="Longitude">
 *                           &lt;simpleType>
 *                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                               &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                             &lt;/restriction>
 *                           &lt;/simpleType>
 *                         &lt;/element>
 *                       &lt;/sequence>
 *                       &lt;element name="UniversalAddress">
 *                         &lt;complexType>
 *                           &lt;simpleContent>
 *                             &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                               &lt;attribute name="OntologyRefID">
 *                                 &lt;simpleType>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                     &lt;pattern value="[0-9]{1,8}"/>
 *                                   &lt;/restriction>
 *                                 &lt;/simpleType>
 *                               &lt;/attribute>
 *                             &lt;/extension>
 *                           &lt;/simpleContent>
 *                         &lt;/complexType>
 *                       &lt;/element>
 *                     &lt;/choice>
 *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
 *                   &lt;/sequence>
 *                   &lt;attribute name="OntologyRefID">
 *                     &lt;simpleType>
 *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                         &lt;pattern value="[0-9]{1,8}"/>
 *                       &lt;/restriction>
 *                     &lt;/simpleType>
 *                   &lt;/attribute>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *           &lt;element name="PhysicalLocation" minOccurs="0">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType">
 *                 &lt;/extension>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
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
@XmlType(name = "OntologyLocationType", propOrder = {
    "type",
    "generalLocation",
    "geocode",
    "physicalLocation",
    "ontologyExtension"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.MultiModalOfferType.TripCharacteristics.Location.class
})
public class OntologyLocationType {

    @XmlElement(name = "Type", required = true)
    protected OntologyLocationType.Type type;
    @XmlElement(name = "GeneralLocation")
    protected OntologyLocationType.GeneralLocation generalLocation;
    @XmlElement(name = "Geocode")
    protected OntologyLocationType.Geocode geocode;
    @XmlElement(name = "PhysicalLocation")
    protected OntologyLocationType.PhysicalLocation physicalLocation;
    @XmlElement(name = "OntologyExtension")
    protected OntologyExtensionType ontologyExtension;

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType.Type }
     *     
     */
    public OntologyLocationType.Type getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType.Type }
     *     
     */
    public void setType(OntologyLocationType.Type value) {
        this.type = value;
    }

    /**
     * 获取generalLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType.GeneralLocation }
     *     
     */
    public OntologyLocationType.GeneralLocation getGeneralLocation() {
        return generalLocation;
    }

    /**
     * 设置generalLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType.GeneralLocation }
     *     
     */
    public void setGeneralLocation(OntologyLocationType.GeneralLocation value) {
        this.generalLocation = value;
    }

    /**
     * 获取geocode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType.Geocode }
     *     
     */
    public OntologyLocationType.Geocode getGeocode() {
        return geocode;
    }

    /**
     * 设置geocode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType.Geocode }
     *     
     */
    public void setGeocode(OntologyLocationType.Geocode value) {
        this.geocode = value;
    }

    /**
     * 获取physicalLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyLocationType.PhysicalLocation }
     *     
     */
    public OntologyLocationType.PhysicalLocation getPhysicalLocation() {
        return physicalLocation;
    }

    /**
     * 设置physicalLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyLocationType.PhysicalLocation }
     *     
     */
    public void setPhysicalLocation(OntologyLocationType.PhysicalLocation value) {
        this.physicalLocation = value;
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
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "ontologyExtension"
    })
    public static class GeneralLocation
        extends OntologyCodeType
    {

        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;

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
     *         &lt;choice>
     *           &lt;sequence>
     *             &lt;element name="Latitude">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *             &lt;element name="Longitude">
     *               &lt;simpleType>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                   &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                 &lt;/restriction>
     *               &lt;/simpleType>
     *             &lt;/element>
     *           &lt;/sequence>
     *           &lt;element name="UniversalAddress">
     *             &lt;complexType>
     *               &lt;simpleContent>
     *                 &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                   &lt;attribute name="OntologyRefID">
     *                     &lt;simpleType>
     *                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                         &lt;pattern value="[0-9]{1,8}"/>
     *                       &lt;/restriction>
     *                     &lt;/simpleType>
     *                   &lt;/attribute>
     *                 &lt;/extension>
     *               &lt;/simpleContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OntologyExtension" minOccurs="0"/>
     *       &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "latitude",
        "longitude",
        "universalAddress",
        "ontologyExtension"
    })
    public static class Geocode {

        @XmlElement(name = "Latitude")
        protected String latitude;
        @XmlElement(name = "Longitude")
        protected String longitude;
        @XmlElement(name = "UniversalAddress")
        protected OntologyLocationType.Geocode.UniversalAddress universalAddress;
        @XmlElement(name = "OntologyExtension")
        protected OntologyExtensionType ontologyExtension;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * 获取latitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLatitude() {
            return latitude;
        }

        /**
         * 设置latitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLatitude(String value) {
            this.latitude = value;
        }

        /**
         * 获取longitude属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLongitude() {
            return longitude;
        }

        /**
         * 设置longitude属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLongitude(String value) {
            this.longitude = value;
        }

        /**
         * 获取universalAddress属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyLocationType.Geocode.UniversalAddress }
         *     
         */
        public OntologyLocationType.Geocode.UniversalAddress getUniversalAddress() {
            return universalAddress;
        }

        /**
         * 设置universalAddress属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyLocationType.Geocode.UniversalAddress }
         *     
         */
        public void setUniversalAddress(OntologyLocationType.Geocode.UniversalAddress value) {
            this.universalAddress = value;
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
        public static class UniversalAddress {

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


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}OntologyAddressType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PhysicalLocation
        extends OntologyAddressType
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
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferLocationType">
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
    public static class Type {

        @XmlValue
        protected ListOfferLocationType value;
        @XmlAttribute(name = "OntologyRefID")
        protected String ontologyRefID;

        /**
         * Source: Coverage Type (COV) OpenTravel codelist.
         * 
         * @return
         *     possible object is
         *     {@link ListOfferLocationType }
         *     
         */
        public ListOfferLocationType getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ListOfferLocationType }
         *     
         */
        public void setValue(ListOfferLocationType value) {
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
