//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Associated content is content (items) associated with the itinerary, but not being part of an itinerary.  Examples of itinerary associated items are, travel insurance, maps, and city information.
 * 
 * <p>AssociatedContentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AssociatedContentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AssocItems">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AssocItem" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AssocItemRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                           &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Pricing" type="{http://www.opentravel.org/OTA/2003/05}ItinPricingType" minOccurs="0"/>
 *                   &lt;element name="SpecialRequestDetails">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Pricing" type="{http://www.opentravel.org/OTA/2003/05}ItinPricingType" minOccurs="0"/>
 *         &lt;element name="SpecialRequestDetails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AssociatedContentType", propOrder = {
    "assocItems",
    "pricing",
    "specialRequestDetails",
    "tpaExtensions"
})
public class AssociatedContentType {

    @XmlElement(name = "AssocItems", required = true)
    protected AssociatedContentType.AssocItems assocItems;
    @XmlElement(name = "Pricing")
    protected ItinPricingType pricing;
    @XmlElement(name = "SpecialRequestDetails", required = true)
    protected AssociatedContentType.SpecialRequestDetails specialRequestDetails;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取assocItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedContentType.AssocItems }
     *     
     */
    public AssociatedContentType.AssocItems getAssocItems() {
        return assocItems;
    }

    /**
     * 设置assocItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedContentType.AssocItems }
     *     
     */
    public void setAssocItems(AssociatedContentType.AssocItems value) {
        this.assocItems = value;
    }

    /**
     * 获取pricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ItinPricingType }
     *     
     */
    public ItinPricingType getPricing() {
        return pricing;
    }

    /**
     * 设置pricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ItinPricingType }
     *     
     */
    public void setPricing(ItinPricingType value) {
        this.pricing = value;
    }

    /**
     * 获取specialRequestDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedContentType.SpecialRequestDetails }
     *     
     */
    public AssociatedContentType.SpecialRequestDetails getSpecialRequestDetails() {
        return specialRequestDetails;
    }

    /**
     * 设置specialRequestDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedContentType.SpecialRequestDetails }
     *     
     */
    public void setSpecialRequestDetails(AssociatedContentType.SpecialRequestDetails value) {
        this.specialRequestDetails = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
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
     *         &lt;element name="AssocItem" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AssocItemRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *                 &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Pricing" type="{http://www.opentravel.org/OTA/2003/05}ItinPricingType" minOccurs="0"/>
     *         &lt;element name="SpecialRequestDetails">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/extension>
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
        "assocItem",
        "pricing",
        "specialRequestDetails"
    })
    public static class AssocItems {

        @XmlElement(name = "AssocItem", required = true)
        protected List<AssociatedContentType.AssocItems.AssocItem> assocItem;
        @XmlElement(name = "Pricing")
        protected ItinPricingType pricing;
        @XmlElement(name = "SpecialRequestDetails", required = true)
        protected AssociatedContentType.AssocItems.SpecialRequestDetails specialRequestDetails;

        /**
         * Gets the value of the assocItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the assocItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAssocItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AssociatedContentType.AssocItems.AssocItem }
         * 
         * 
         */
        public List<AssociatedContentType.AssocItems.AssocItem> getAssocItem() {
            if (assocItem == null) {
                assocItem = new ArrayList<AssociatedContentType.AssocItems.AssocItem>();
            }
            return this.assocItem;
        }

        /**
         * 获取pricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItinPricingType }
         *     
         */
        public ItinPricingType getPricing() {
            return pricing;
        }

        /**
         * 设置pricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItinPricingType }
         *     
         */
        public void setPricing(ItinPricingType value) {
            this.pricing = value;
        }

        /**
         * 获取specialRequestDetails属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AssociatedContentType.AssocItems.SpecialRequestDetails }
         *     
         */
        public AssociatedContentType.AssocItems.SpecialRequestDetails getSpecialRequestDetails() {
            return specialRequestDetails;
        }

        /**
         * 设置specialRequestDetails属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AssociatedContentType.AssocItems.SpecialRequestDetails }
         *     
         */
        public void setSpecialRequestDetails(AssociatedContentType.AssocItems.SpecialRequestDetails value) {
            this.specialRequestDetails = value;
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
         *         &lt;element name="AssocItemRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
         *       &lt;/sequence>
         *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *       &lt;attribute name="DateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "assocItemRef"
        })
        public static class AssocItem {

            @XmlElement(name = "AssocItemRef", required = true)
            protected UniqueIDType assocItemRef;
            @XmlAttribute(name = "RPH", required = true)
            protected String rph;
            @XmlAttribute(name = "DateTime")
            protected String dateTime;
            @XmlAttribute(name = "Type", required = true)
            protected String type;

            /**
             * 获取assocItemRef属性的值。
             * 
             * @return
             *     possible object is
             *     {@link UniqueIDType }
             *     
             */
            public UniqueIDType getAssocItemRef() {
                return assocItemRef;
            }

            /**
             * 设置assocItemRef属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link UniqueIDType }
             *     
             */
            public void setAssocItemRef(UniqueIDType value) {
                this.assocItemRef = value;
            }

            /**
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * 获取dateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDateTime() {
                return dateTime;
            }

            /**
             * 设置dateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDateTime(String value) {
                this.dateTime = value;
            }

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setType(String value) {
                this.type = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
         *       &lt;sequence>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
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
            "tpaExtensions"
        })
        public static class SpecialRequestDetails
            extends SpecialReqDetailsType
        {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * 获取tpaExtensions属性的值。
             * 
             * @return
             *     possible object is
             *     {@link TPAExtensionsType }
             *     
             */
            public TPAExtensionsType getTPAExtensions() {
                return tpaExtensions;
            }

            /**
             * 设置tpaExtensions属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link TPAExtensionsType }
             *     
             */
            public void setTPAExtensions(TPAExtensionsType value) {
                this.tpaExtensions = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialReqDetailsType">
     *       &lt;sequence>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
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
        "tpaExtensions"
    })
    public static class SpecialRequestDetails
        extends SpecialReqDetailsType
    {

        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

    }

}
