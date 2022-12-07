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


/**
 * Provides accommodation location, dates and classifications
 * 
 * <p>AccommodationInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Property" type="{http://www.opentravel.org/OTA/2003/05}PropertyIdentityType"/>
 *         &lt;element name="Resort" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResortCodeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccommodationClass" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SourceIdentification" type="{http://www.opentravel.org/OTA/2003/05}SourceIdentificationType" minOccurs="0"/>
 *         &lt;element name="ContentInfo" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PackageID" type="{http://www.opentravel.org/OTA/2003/05}PackageID_RefType" />
 *       &lt;attribute name="MinChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="MaxChildAge" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="BaseMealPlan" type="{http://www.opentravel.org/OTA/2003/05}MealPlanCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationInfoType", propOrder = {
    "property",
    "resort",
    "accommodationClass",
    "sourceIdentification",
    "contentInfo"
})
@XmlSeeAlso({
    AccommodationDetailType.class
})
public class AccommodationInfoType {

    @XmlElement(name = "Property", required = true)
    protected PropertyIdentityType property;
    @XmlElement(name = "Resort")
    protected AccommodationInfoType.Resort resort;
    @XmlElement(name = "AccommodationClass")
    protected AccommodationInfoType.AccommodationClass accommodationClass;
    @XmlElement(name = "SourceIdentification")
    protected SourceIdentificationType sourceIdentification;
    @XmlElement(name = "ContentInfo")
    protected URLType contentInfo;
    @XmlAttribute(name = "PackageID")
    protected String packageID;
    @XmlAttribute(name = "MinChildAge")
    protected Integer minChildAge;
    @XmlAttribute(name = "MaxChildAge")
    protected Integer maxChildAge;
    @XmlAttribute(name = "BaseMealPlan")
    protected String baseMealPlan;

    /**
     * 获取property属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PropertyIdentityType }
     *     
     */
    public PropertyIdentityType getProperty() {
        return property;
    }

    /**
     * 设置property属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyIdentityType }
     *     
     */
    public void setProperty(PropertyIdentityType value) {
        this.property = value;
    }

    /**
     * 获取resort属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationInfoType.Resort }
     *     
     */
    public AccommodationInfoType.Resort getResort() {
        return resort;
    }

    /**
     * 设置resort属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationInfoType.Resort }
     *     
     */
    public void setResort(AccommodationInfoType.Resort value) {
        this.resort = value;
    }

    /**
     * 获取accommodationClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationInfoType.AccommodationClass }
     *     
     */
    public AccommodationInfoType.AccommodationClass getAccommodationClass() {
        return accommodationClass;
    }

    /**
     * 设置accommodationClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationInfoType.AccommodationClass }
     *     
     */
    public void setAccommodationClass(AccommodationInfoType.AccommodationClass value) {
        this.accommodationClass = value;
    }

    /**
     * 获取sourceIdentification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceIdentificationType }
     *     
     */
    public SourceIdentificationType getSourceIdentification() {
        return sourceIdentification;
    }

    /**
     * 设置sourceIdentification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceIdentificationType }
     *     
     */
    public void setSourceIdentification(SourceIdentificationType value) {
        this.sourceIdentification = value;
    }

    /**
     * 获取contentInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link URLType }
     *     
     */
    public URLType getContentInfo() {
        return contentInfo;
    }

    /**
     * 设置contentInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link URLType }
     *     
     */
    public void setContentInfo(URLType value) {
        this.contentInfo = value;
    }

    /**
     * 获取packageID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageID() {
        return packageID;
    }

    /**
     * 设置packageID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageID(String value) {
        this.packageID = value;
    }

    /**
     * 获取minChildAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinChildAge() {
        return minChildAge;
    }

    /**
     * 设置minChildAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinChildAge(Integer value) {
        this.minChildAge = value;
    }

    /**
     * 获取maxChildAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxChildAge() {
        return maxChildAge;
    }

    /**
     * 设置maxChildAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxChildAge(Integer value) {
        this.maxChildAge = value;
    }

    /**
     * 获取baseMealPlan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBaseMealPlan() {
        return baseMealPlan;
    }

    /**
     * 设置baseMealPlan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBaseMealPlan(String value) {
        this.baseMealPlan = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AccommodationClassGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccommodationClass {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "NationalCode")
        protected String nationalCode;
        @XmlAttribute(name = "OfficialName")
        protected String officialName;

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
         * 获取nationalCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNationalCode() {
            return nationalCode;
        }

        /**
         * 设置nationalCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNationalCode(String value) {
            this.nationalCode = value;
        }

        /**
         * 获取officialName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOfficialName() {
            return officialName;
        }

        /**
         * 设置officialName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOfficialName(String value) {
            this.officialName = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ResortCodeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Resort {

        @XmlAttribute(name = "ResortCode")
        protected String resortCode;
        @XmlAttribute(name = "ResortName")
        protected String resortName;

        /**
         * 获取resortCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortCode() {
            return resortCode;
        }

        /**
         * 设置resortCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortCode(String value) {
            this.resortCode = value;
        }

        /**
         * 获取resortName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResortName() {
            return resortName;
        }

        /**
         * 设置resortName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResortName(String value) {
            this.resortName = value;
        }

    }

}
