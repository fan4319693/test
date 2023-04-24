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


/**
 * 
 * Provides category information for the specified sailing.
 * 
 * 
 * <p>SailingCategoryInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SailingCategoryInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType">
 *       &lt;sequence>
 *         &lt;element name="SelectedCategory" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CabinAttributes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinAttribute" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SelectedCabin" maxOccurs="3" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinAttributes" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="CabinAttribute" maxOccurs="99">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryDetailGroup"/>
 *                 &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingCategoryInfoType", propOrder = {
    "selectedCategory"
})
public class SailingCategoryInfoType
    extends SailingInfoType
{

    @XmlElement(name = "SelectedCategory")
    protected List<SailingCategoryInfoType.SelectedCategory> selectedCategory;

    /**
     * Gets the value of the selectedCategory property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the selectedCategory property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSelectedCategory().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingCategoryInfoType.SelectedCategory }
     * 
     * 
     */
    public List<SailingCategoryInfoType.SelectedCategory> getSelectedCategory() {
        if (selectedCategory == null) {
            selectedCategory = new ArrayList<SailingCategoryInfoType.SelectedCategory>();
        }
        return this.selectedCategory;
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
     *         &lt;element name="CabinAttributes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinAttribute" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SelectedCabin" maxOccurs="3" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinAttributes" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="CabinAttribute" maxOccurs="99">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryDetailGroup"/>
     *       &lt;attribute name="WaitlistIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "cabinAttributes",
        "selectedCabin"
    })
    public static class SelectedCategory {

        @XmlElement(name = "CabinAttributes")
        protected SailingCategoryInfoType.SelectedCategory.CabinAttributes cabinAttributes;
        @XmlElement(name = "SelectedCabin")
        protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> selectedCabin;
        @XmlAttribute(name = "WaitlistIndicator")
        protected Boolean waitlistIndicator;
        @XmlAttribute(name = "BerthedCategoryCode")
        protected String berthedCategoryCode;
        @XmlAttribute(name = "PricedCategoryCode")
        protected String pricedCategoryCode;
        @XmlAttribute(name = "DeckNumber")
        protected String deckNumber;
        @XmlAttribute(name = "DeckName")
        protected String deckName;

        /**
         * 获取cabinAttributes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
         *     
         */
        public SailingCategoryInfoType.SelectedCategory.CabinAttributes getCabinAttributes() {
            return cabinAttributes;
        }

        /**
         * 设置cabinAttributes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes }
         *     
         */
        public void setCabinAttributes(SailingCategoryInfoType.SelectedCategory.CabinAttributes value) {
            this.cabinAttributes = value;
        }

        /**
         * Gets the value of the selectedCabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the selectedCabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSelectedCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin }
         * 
         * 
         */
        public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin> getSelectedCabin() {
            if (selectedCabin == null) {
                selectedCabin = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin>();
            }
            return this.selectedCabin;
        }

        /**
         * 获取waitlistIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWaitlistIndicator() {
            return waitlistIndicator;
        }

        /**
         * 设置waitlistIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWaitlistIndicator(Boolean value) {
            this.waitlistIndicator = value;
        }

        /**
         * 获取berthedCategoryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBerthedCategoryCode() {
            return berthedCategoryCode;
        }

        /**
         * 设置berthedCategoryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBerthedCategoryCode(String value) {
            this.berthedCategoryCode = value;
        }

        /**
         * 获取pricedCategoryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPricedCategoryCode() {
            return pricedCategoryCode;
        }

        /**
         * 设置pricedCategoryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPricedCategoryCode(String value) {
            this.pricedCategoryCode = value;
        }

        /**
         * 获取deckNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckNumber() {
            return deckNumber;
        }

        /**
         * 设置deckNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckNumber(String value) {
            this.deckNumber = value;
        }

        /**
         * 获取deckName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeckName() {
            return deckName;
        }

        /**
         * 设置deckName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeckName(String value) {
            this.deckName = value;
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
         *         &lt;element name="CabinAttribute" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
            "cabinAttribute"
        })
        public static class CabinAttributes {

            @XmlElement(name = "CabinAttribute", required = true)
            protected List<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute> cabinAttribute;

            /**
             * Gets the value of the cabinAttribute property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getCabinAttribute().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute }
             * 
             * 
             */
            public List<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute> getCabinAttribute() {
                if (cabinAttribute == null) {
                    cabinAttribute = new ArrayList<SailingCategoryInfoType.SelectedCategory.CabinAttributes.CabinAttribute>();
                }
                return this.cabinAttribute;
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
             *       &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class CabinAttribute {

                @XmlAttribute(name = "CabinAttributeCode")
                protected String cabinAttributeCode;

                /**
                 * 获取cabinAttributeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCabinAttributeCode() {
                    return cabinAttributeCode;
                }

                /**
                 * 设置cabinAttributeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCabinAttributeCode(String value) {
                    this.cabinAttributeCode = value;
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
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CabinOptionType">
         *       &lt;sequence>
         *         &lt;element name="CabinAttributes" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="CabinAttribute" maxOccurs="99">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "cabinAttributes"
        })
        public static class SelectedCabin
            extends CabinOptionType
        {

            @XmlElement(name = "CabinAttributes")
            protected SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes cabinAttributes;

            /**
             * 获取cabinAttributes属性的值。
             * 
             * @return
             *     possible object is
             *     {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
             *     
             */
            public SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes getCabinAttributes() {
                return cabinAttributes;
            }

            /**
             * 设置cabinAttributes属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes }
             *     
             */
            public void setCabinAttributes(SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes value) {
                this.cabinAttributes = value;
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
             *         &lt;element name="CabinAttribute" maxOccurs="99">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
                "cabinAttribute"
            })
            public static class CabinAttributes {

                @XmlElement(name = "CabinAttribute", required = true)
                protected List<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute> cabinAttribute;

                /**
                 * Gets the value of the cabinAttribute property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the cabinAttribute property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getCabinAttribute().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute }
                 * 
                 * 
                 */
                public List<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute> getCabinAttribute() {
                    if (cabinAttribute == null) {
                        cabinAttribute = new ArrayList<SailingCategoryInfoType.SelectedCategory.SelectedCabin.CabinAttributes.CabinAttribute>();
                    }
                    return this.cabinAttribute;
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
                 *       &lt;attribute name="CabinAttributeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class CabinAttribute {

                    @XmlAttribute(name = "CabinAttributeCode")
                    protected String cabinAttributeCode;

                    /**
                     * 获取cabinAttributeCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCabinAttributeCode() {
                        return cabinAttributeCode;
                    }

                    /**
                     * 设置cabinAttributeCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCabinAttributeCode(String value) {
                        this.cabinAttributeCode = value;
                    }

                }

            }

        }

    }

}
