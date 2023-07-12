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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines information used to express traveler preferences when requesting rail avilability information.
 * 
 * <p>RailAvailPrefsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailAvailPrefsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperatorPref" type="{http://www.opentravel.org/OTA/2003/05}CompanyNamePrefType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="TransportModes" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RailCodeGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RailAmenities" type="{http://www.opentravel.org/OTA/2003/05}RailAmenityType" minOccurs="0"/>
 *         &lt;element name="ClassCodes" type="{http://www.opentravel.org/OTA/2003/05}ClassCodeType" maxOccurs="99" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AccommodationCategory" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailAvailPrefsType", propOrder = {
    "operatorPref",
    "transportModes",
    "railAmenities",
    "classCodes",
    "accommodationCategory"
})
public class RailAvailPrefsType {

    @XmlElement(name = "OperatorPref")
    protected List<CompanyNamePrefType> operatorPref;
    @XmlElement(name = "TransportModes")
    protected List<RailAvailPrefsType.TransportModes> transportModes;
    @XmlElement(name = "RailAmenities")
    protected RailAmenityType railAmenities;
    @XmlElement(name = "ClassCodes")
    protected List<ClassCodeType> classCodes;
    @XmlElement(name = "AccommodationCategory")
    protected AccommodationCategoryType accommodationCategory;

    /**
     * Gets the value of the operatorPref property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the operatorPref property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOperatorPref().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CompanyNamePrefType }
     * 
     * 
     */
    public List<CompanyNamePrefType> getOperatorPref() {
        if (operatorPref == null) {
            operatorPref = new ArrayList<CompanyNamePrefType>();
        }
        return this.operatorPref;
    }

    /**
     * Gets the value of the transportModes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportModes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportModes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailAvailPrefsType.TransportModes }
     * 
     * 
     */
    public List<RailAvailPrefsType.TransportModes> getTransportModes() {
        if (transportModes == null) {
            transportModes = new ArrayList<RailAvailPrefsType.TransportModes>();
        }
        return this.transportModes;
    }

    /**
     * 获取railAmenities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailAmenityType }
     *     
     */
    public RailAmenityType getRailAmenities() {
        return railAmenities;
    }

    /**
     * 设置railAmenities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailAmenityType }
     *     
     */
    public void setRailAmenities(RailAmenityType value) {
        this.railAmenities = value;
    }

    /**
     * Gets the value of the classCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the classCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getClassCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ClassCodeType }
     * 
     * 
     */
    public List<ClassCodeType> getClassCodes() {
        if (classCodes == null) {
            classCodes = new ArrayList<ClassCodeType>();
        }
        return this.classCodes;
    }

    /**
     * Accommodations and services offered on a train.
     * 
     * @return
     *     possible object is
     *     {@link AccommodationCategoryType }
     *     
     */
    public AccommodationCategoryType getAccommodationCategory() {
        return accommodationCategory;
    }

    /**
     * 设置accommodationCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationCategoryType }
     *     
     */
    public void setAccommodationCategory(AccommodationCategoryType value) {
        this.accommodationCategory = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RailCodeGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class TransportModes {

        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger quantity;
        @XmlAttribute(name = "PreferLevel")
        protected PreferLevelType preferLevel;

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
         * 获取preferLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PreferLevelType }
         *     
         */
        public PreferLevelType getPreferLevel() {
            if (preferLevel == null) {
                return PreferLevelType.PREFERRED;
            } else {
                return preferLevel;
            }
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

    }

}
