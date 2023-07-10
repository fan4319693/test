//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Collection of plan that meet the search request requirements
 * 
 * <p>AvailablePlansType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AvailablePlansType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AvailablePlan" maxOccurs="999">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PlanDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PlanDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *                             &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *                             &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProviderDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="ProviderDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="UnderwriterDetail" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UnderwriterCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *                             &lt;element name="UnderwriterDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PlanID_Group"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *                 &lt;attribute name="Featured" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
 *                 &lt;attribute name="InsuranceID" type="{http://www.w3.org/2001/XMLSchema}int" />
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
@XmlType(name = "AvailablePlansType", propOrder = {
    "availablePlan"
})
public class AvailablePlansType {

    @XmlElement(name = "AvailablePlan", required = true)
    protected List<AvailablePlansType.AvailablePlan> availablePlan;

    /**
     * Gets the value of the availablePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the availablePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAvailablePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AvailablePlansType.AvailablePlan }
     * 
     * 
     */
    public List<AvailablePlansType.AvailablePlan> getAvailablePlan() {
        if (availablePlan == null) {
            availablePlan = new ArrayList<AvailablePlansType.AvailablePlan>();
        }
        return this.availablePlan;
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
     *         &lt;element name="PlanDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PlanDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
     *                   &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
     *                   &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProviderDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="ProviderDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="UnderwriterDetail" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UnderwriterCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
     *                   &lt;element name="UnderwriterDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PlanID_Group"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
     *       &lt;attribute name="Featured" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="PreferLevel" type="{http://www.opentravel.org/OTA/2003/05}PreferLevelType" />
     *       &lt;attribute name="InsuranceID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "planDetail",
        "providerDetail",
        "underwriterDetail",
        "planRestrictions"
    })
    public static class AvailablePlan {

        @XmlElement(name = "PlanDetail")
        protected AvailablePlansType.AvailablePlan.PlanDetail planDetail;
        @XmlElement(name = "ProviderDetail")
        protected AvailablePlansType.AvailablePlan.ProviderDetail providerDetail;
        @XmlElement(name = "UnderwriterDetail")
        protected AvailablePlansType.AvailablePlan.UnderwriterDetail underwriterDetail;
        @XmlElement(name = "PlanRestrictions")
        protected PlanRestrictionType planRestrictions;
        @XmlAttribute(name = "Featured")
        protected Boolean featured;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;
        @XmlAttribute(name = "InsuranceID")
        protected Integer insuranceID;
        @XmlAttribute(name = "PlanID", required = true)
        protected String planID;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "TypeID")
        protected String typeID;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;

        /**
         * 获取planDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailablePlansType.AvailablePlan.PlanDetail }
         *     
         */
        public AvailablePlansType.AvailablePlan.PlanDetail getPlanDetail() {
            return planDetail;
        }

        /**
         * 设置planDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailablePlansType.AvailablePlan.PlanDetail }
         *     
         */
        public void setPlanDetail(AvailablePlansType.AvailablePlan.PlanDetail value) {
            this.planDetail = value;
        }

        /**
         * 获取providerDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailablePlansType.AvailablePlan.ProviderDetail }
         *     
         */
        public AvailablePlansType.AvailablePlan.ProviderDetail getProviderDetail() {
            return providerDetail;
        }

        /**
         * 设置providerDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailablePlansType.AvailablePlan.ProviderDetail }
         *     
         */
        public void setProviderDetail(AvailablePlansType.AvailablePlan.ProviderDetail value) {
            this.providerDetail = value;
        }

        /**
         * 获取underwriterDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AvailablePlansType.AvailablePlan.UnderwriterDetail }
         *     
         */
        public AvailablePlansType.AvailablePlan.UnderwriterDetail getUnderwriterDetail() {
            return underwriterDetail;
        }

        /**
         * 设置underwriterDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AvailablePlansType.AvailablePlan.UnderwriterDetail }
         *     
         */
        public void setUnderwriterDetail(AvailablePlansType.AvailablePlan.UnderwriterDetail value) {
            this.underwriterDetail = value;
        }

        /**
         * 获取planRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlanRestrictionType }
         *     
         */
        public PlanRestrictionType getPlanRestrictions() {
            return planRestrictions;
        }

        /**
         * 设置planRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlanRestrictionType }
         *     
         */
        public void setPlanRestrictions(PlanRestrictionType value) {
            this.planRestrictions = value;
        }

        /**
         * 获取featured属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFeatured() {
            return featured;
        }

        /**
         * 设置featured属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFeatured(Boolean value) {
            this.featured = value;
        }

        /**
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            return preferLevel;
        }

        /**
         * 设置preferLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PreferLevelType }
         *     
         */
        public void setPreferLevel(PreferLevelType value) {
            this.preferLevel = value;
        }

        /**
         * 获取insuranceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getInsuranceID() {
            return insuranceID;
        }

        /**
         * 设置insuranceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setInsuranceID(Integer value) {
            this.insuranceID = value;
        }

        /**
         * 获取planID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPlanID() {
            return planID;
        }

        /**
         * 设置planID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPlanID(String value) {
            this.planID = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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

        /**
         * 获取typeID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTypeID() {
            return typeID;
        }

        /**
         * 设置typeID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTypeID(String value) {
            this.typeID = value;
        }

        /**
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

        /**
         * 获取effectiveDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * 设置effectiveDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * 获取expireDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * 设置expireDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
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
         *         &lt;element name="PlanDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
         *         &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
         *         &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
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
            "planDescription",
            "quoteDetailURL",
            "bookingDetailURL"
        })
        public static class PlanDetail {

            @XmlElement(name = "PlanDescription")
            protected FormattedTextType planDescription;
            @XmlElement(name = "QuoteDetailURL")
            protected URLType quoteDetailURL;
            @XmlElement(name = "BookingDetailURL")
            protected URLType bookingDetailURL;

            /**
             * 获取planDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getPlanDescription() {
                return planDescription;
            }

            /**
             * 设置planDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setPlanDescription(FormattedTextType value) {
                this.planDescription = value;
            }

            /**
             * 获取quoteDetailURL属性的值。
             * 
             * @return
             *     possible object is
             *     {@link URLType }
             *     
             */
            public URLType getQuoteDetailURL() {
                return quoteDetailURL;
            }

            /**
             * 设置quoteDetailURL属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link URLType }
             *     
             */
            public void setQuoteDetailURL(URLType value) {
                this.quoteDetailURL = value;
            }

            /**
             * 获取bookingDetailURL属性的值。
             * 
             * @return
             *     possible object is
             *     {@link URLType }
             *     
             */
            public URLType getBookingDetailURL() {
                return bookingDetailURL;
            }

            /**
             * 设置bookingDetailURL属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link URLType }
             *     
             */
            public void setBookingDetailURL(URLType value) {
                this.bookingDetailURL = value;
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
         *         &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="ProviderDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
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
            "providerCompany",
            "providerDescription"
        })
        public static class ProviderDetail {

            @XmlElement(name = "ProviderCompany")
            protected CompanyNameType providerCompany;
            @XmlElement(name = "ProviderDescription")
            protected FormattedTextType providerDescription;

            /**
             * 获取providerCompany属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getProviderCompany() {
                return providerCompany;
            }

            /**
             * 设置providerCompany属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setProviderCompany(CompanyNameType value) {
                this.providerCompany = value;
            }

            /**
             * 获取providerDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getProviderDescription() {
                return providerDescription;
            }

            /**
             * 设置providerDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setProviderDescription(FormattedTextType value) {
                this.providerDescription = value;
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
         *         &lt;element name="UnderwriterCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
         *         &lt;element name="UnderwriterDescription" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" minOccurs="0"/>
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
            "underwriterCompany",
            "underwriterDescription"
        })
        public static class UnderwriterDetail {

            @XmlElement(name = "UnderwriterCompany")
            protected CompanyNameType underwriterCompany;
            @XmlElement(name = "UnderwriterDescription")
            protected FormattedTextType underwriterDescription;

            /**
             * 获取underwriterCompany属性的值。
             * 
             * @return
             *     possible object is
             *     {@link CompanyNameType }
             *     
             */
            public CompanyNameType getUnderwriterCompany() {
                return underwriterCompany;
            }

            /**
             * 设置underwriterCompany属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link CompanyNameType }
             *     
             */
            public void setUnderwriterCompany(CompanyNameType value) {
                this.underwriterCompany = value;
            }

            /**
             * 获取underwriterDescription属性的值。
             * 
             * @return
             *     possible object is
             *     {@link FormattedTextType }
             *     
             */
            public FormattedTextType getUnderwriterDescription() {
                return underwriterDescription;
            }

            /**
             * 设置underwriterDescription属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link FormattedTextType }
             *     
             */
            public void setUnderwriterDescription(FormattedTextType value) {
                this.underwriterDescription = value;
            }

        }

    }

}
