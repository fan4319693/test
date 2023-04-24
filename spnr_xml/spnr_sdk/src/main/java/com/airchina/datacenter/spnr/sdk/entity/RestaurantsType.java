//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Provides detailed information regarding restaurants. 
 * 
 * <p>RestaurantsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RestaurantsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Restaurant" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType">
 *                 &lt;sequence>
 *                   &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
 *                   &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
 *                   &lt;element name="SrvcInfoCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SrvcInfoCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                                     &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SrvcInfoCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SrvcInfoCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantsType", propOrder = {
    "restaurant",
    "srvcInfoCodes"
})
public class RestaurantsType {

    @XmlElement(name = "Restaurant", required = true)
    protected List<RestaurantsType.Restaurant> restaurant;
    @XmlElement(name = "SrvcInfoCodes")
    protected RestaurantsType.SrvcInfoCodes srvcInfoCodes;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * Gets the value of the restaurant property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the restaurant property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRestaurant().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RestaurantsType.Restaurant }
     * 
     * 
     */
    public List<RestaurantsType.Restaurant> getRestaurant() {
        if (restaurant == null) {
            restaurant = new ArrayList<RestaurantsType.Restaurant>();
        }
        return this.restaurant;
    }

    /**
     * 获取srvcInfoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantsType.SrvcInfoCodes }
     *     
     */
    public RestaurantsType.SrvcInfoCodes getSrvcInfoCodes() {
        return srvcInfoCodes;
    }

    /**
     * 设置srvcInfoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantsType.SrvcInfoCodes }
     *     
     */
    public void setSrvcInfoCodes(RestaurantsType.SrvcInfoCodes value) {
        this.srvcInfoCodes = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RestaurantType">
     *       &lt;sequence>
     *         &lt;element name="Features" type="{http://www.opentravel.org/OTA/2003/05}FeaturesType" minOccurs="0"/>
     *         &lt;element name="ContactInfos" type="{http://www.opentravel.org/OTA/2003/05}ContactInfosType" minOccurs="0"/>
     *         &lt;element name="SrvcInfoCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SrvcInfoCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RemovalGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "features",
        "contactInfos",
        "srvcInfoCodes"
    })
    public static class Restaurant
        extends RestaurantType
    {

        @XmlElement(name = "Features")
        protected FeaturesType features;
        @XmlElement(name = "ContactInfos")
        protected ContactInfosType contactInfos;
        @XmlElement(name = "SrvcInfoCodes")
        protected RestaurantsType.Restaurant.SrvcInfoCodes srvcInfoCodes;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;

        /**
         * 获取features属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FeaturesType }
         *     
         */
        public FeaturesType getFeatures() {
            return features;
        }

        /**
         * 设置features属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FeaturesType }
         *     
         */
        public void setFeatures(FeaturesType value) {
            this.features = value;
        }

        /**
         * 获取contactInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfosType }
         *     
         */
        public ContactInfosType getContactInfos() {
            return contactInfos;
        }

        /**
         * 设置contactInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfosType }
         *     
         */
        public void setContactInfos(ContactInfosType value) {
            this.contactInfos = value;
        }

        /**
         * 获取srvcInfoCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RestaurantsType.Restaurant.SrvcInfoCodes }
         *     
         */
        public RestaurantsType.Restaurant.SrvcInfoCodes getSrvcInfoCodes() {
            return srvcInfoCodes;
        }

        /**
         * 设置srvcInfoCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RestaurantsType.Restaurant.SrvcInfoCodes }
         *     
         */
        public void setSrvcInfoCodes(RestaurantsType.Restaurant.SrvcInfoCodes value) {
            this.srvcInfoCodes = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
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
         *         &lt;element name="SrvcInfoCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
        @XmlType(name = "", propOrder = {
            "srvcInfoCode"
        })
        public static class SrvcInfoCodes {

            @XmlElement(name = "SrvcInfoCode", required = true)
            protected List<RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode> srvcInfoCode;

            /**
             * Gets the value of the srvcInfoCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the srvcInfoCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSrvcInfoCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode }
             * 
             * 
             */
            public List<RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode> getSrvcInfoCode() {
                if (srvcInfoCode == null) {
                    srvcInfoCode = new ArrayList<RestaurantsType.Restaurant.SrvcInfoCodes.SrvcInfoCode>();
                }
                return this.srvcInfoCode;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
             *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class SrvcInfoCode {

                @XmlAttribute(name = "Code")
                protected String code;
                @XmlAttribute(name = "CodeDetail")
                protected String codeDetail;
                @XmlAttribute(name = "Removal")
                protected Boolean removal;
                @XmlAttribute(name = "Quantity")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger quantity;

                /**
                 * 获取code属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCode() {
                    return code;
                }

                /**
                 * 设置code属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCode(String value) {
                    this.code = value;
                }

                /**
                 * 获取codeDetail属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCodeDetail() {
                    return codeDetail;
                }

                /**
                 * 设置codeDetail属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCodeDetail(String value) {
                    this.codeDetail = value;
                }

                /**
                 * 获取removal属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public boolean isRemoval() {
                    if (removal == null) {
                        return false;
                    } else {
                        return removal;
                    }
                }

                /**
                 * 设置removal属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRemoval(Boolean value) {
                    this.removal = value;
                }

                /**
                 * 获取quantity属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getQuantity() {
                    return quantity;
                }

                /**
                 * 设置quantity属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setQuantity(BigInteger value) {
                    this.quantity = value;
                }

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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SrvcInfoCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "srvcInfoCode"
    })
    public static class SrvcInfoCodes {

        @XmlElement(name = "SrvcInfoCode", required = true)
        protected List<RestaurantsType.SrvcInfoCodes.SrvcInfoCode> srvcInfoCode;

        /**
         * Gets the value of the srvcInfoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the srvcInfoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSrvcInfoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestaurantsType.SrvcInfoCodes.SrvcInfoCode }
         * 
         * 
         */
        public List<RestaurantsType.SrvcInfoCodes.SrvcInfoCode> getSrvcInfoCode() {
            if (srvcInfoCode == null) {
                srvcInfoCode = new ArrayList<RestaurantsType.SrvcInfoCodes.SrvcInfoCode>();
            }
            return this.srvcInfoCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SrvcInfoCode {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;
            @XmlAttribute(name = "Quantity")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger quantity;

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCode(String value) {
                this.code = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
            }

            /**
             * 获取quantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getQuantity() {
                return quantity;
            }

            /**
             * 设置quantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setQuantity(BigInteger value) {
                this.quantity = value;
            }

        }

    }

}
