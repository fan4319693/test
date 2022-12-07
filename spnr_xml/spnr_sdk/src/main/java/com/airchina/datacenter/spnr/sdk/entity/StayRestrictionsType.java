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
import javax.xml.bind.annotation.XmlType;


/**
 * Type defining Min and Max Stay Restrictions
 * 
 * <p>StayRestrictionsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StayRestrictionsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="MinimumStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="MinStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                 &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="MinStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MaximumStay" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ReturnType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="C"/>
 *                       &lt;enumeration value="S"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="MaxStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *                 &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
 *                 &lt;attribute name="MaxStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
 *                 &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="StayRestrictionsInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StayRestrictionsType", propOrder = {
    "minimumStay",
    "maximumStay"
})
public class StayRestrictionsType {

    @XmlElement(name = "MinimumStay")
    protected StayRestrictionsType.MinimumStay minimumStay;
    @XmlElement(name = "MaximumStay")
    protected StayRestrictionsType.MaximumStay maximumStay;
    @XmlAttribute(name = "StayRestrictionsInd")
    protected Boolean stayRestrictionsInd;

    /**
     * 获取minimumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType.MinimumStay }
     *     
     */
    public StayRestrictionsType.MinimumStay getMinimumStay() {
        return minimumStay;
    }

    /**
     * 设置minimumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType.MinimumStay }
     *     
     */
    public void setMinimumStay(StayRestrictionsType.MinimumStay value) {
        this.minimumStay = value;
    }

    /**
     * 获取maximumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link StayRestrictionsType.MaximumStay }
     *     
     */
    public StayRestrictionsType.MaximumStay getMaximumStay() {
        return maximumStay;
    }

    /**
     * 设置maximumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link StayRestrictionsType.MaximumStay }
     *     
     */
    public void setMaximumStay(StayRestrictionsType.MaximumStay value) {
        this.maximumStay = value;
    }

    /**
     * 获取stayRestrictionsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    /**
     * 设置stayRestrictionsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setStayRestrictionsInd(Boolean value) {
        this.stayRestrictionsInd = value;
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
     *       &lt;attribute name="ReturnType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="C"/>
     *             &lt;enumeration value="S"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="MaxStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *       &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="MaxStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MaximumStay {

        @XmlAttribute(name = "ReturnType")
        protected String returnType;
        @XmlAttribute(name = "ReturnTimeOfDay")
        protected String returnTimeOfDay;
        @XmlAttribute(name = "MaxStay")
        protected Integer maxStay;
        @XmlAttribute(name = "StayUnit")
        protected StayUnitType stayUnit;
        @XmlAttribute(name = "MaxStayDate")
        protected String maxStayDate;
        @XmlAttribute(name = "ComplicatedRulesInd")
        protected Boolean complicatedRulesInd;

        /**
         * 获取returnType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnType() {
            return returnType;
        }

        /**
         * 设置returnType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnType(String value) {
            this.returnType = value;
        }

        /**
         * 获取returnTimeOfDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnTimeOfDay() {
            return returnTimeOfDay;
        }

        /**
         * 设置returnTimeOfDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnTimeOfDay(String value) {
            this.returnTimeOfDay = value;
        }

        /**
         * 获取maxStay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaxStay() {
            return maxStay;
        }

        /**
         * 设置maxStay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaxStay(Integer value) {
            this.maxStay = value;
        }

        /**
         * 获取stayUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getStayUnit() {
            return stayUnit;
        }

        /**
         * 设置stayUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setStayUnit(StayUnitType value) {
            this.stayUnit = value;
        }

        /**
         * 获取maxStayDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxStayDate() {
            return maxStayDate;
        }

        /**
         * 设置maxStayDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxStayDate(String value) {
            this.maxStayDate = value;
        }

        /**
         * 获取complicatedRulesInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplicatedRulesInd() {
            return complicatedRulesInd;
        }

        /**
         * 设置complicatedRulesInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplicatedRulesInd(Boolean value) {
            this.complicatedRulesInd = value;
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
     *       &lt;attribute name="ReturnTimeOfDay" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="MinStay" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *       &lt;attribute name="StayUnit" type="{http://www.opentravel.org/OTA/2003/05}StayUnitType" />
     *       &lt;attribute name="MinStayDate" type="{http://www.opentravel.org/OTA/2003/05}TimeOrDateTimeType" />
     *       &lt;attribute name="ComplicatedRulesInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MinimumStay {

        @XmlAttribute(name = "ReturnTimeOfDay")
        protected String returnTimeOfDay;
        @XmlAttribute(name = "MinStay")
        protected Integer minStay;
        @XmlAttribute(name = "StayUnit")
        protected StayUnitType stayUnit;
        @XmlAttribute(name = "MinStayDate")
        protected String minStayDate;
        @XmlAttribute(name = "ComplicatedRulesInd")
        protected Boolean complicatedRulesInd;

        /**
         * 获取returnTimeOfDay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReturnTimeOfDay() {
            return returnTimeOfDay;
        }

        /**
         * 设置returnTimeOfDay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReturnTimeOfDay(String value) {
            this.returnTimeOfDay = value;
        }

        /**
         * 获取minStay属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMinStay() {
            return minStay;
        }

        /**
         * 设置minStay属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMinStay(Integer value) {
            this.minStay = value;
        }

        /**
         * 获取stayUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link StayUnitType }
         *     
         */
        public StayUnitType getStayUnit() {
            return stayUnit;
        }

        /**
         * 设置stayUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link StayUnitType }
         *     
         */
        public void setStayUnit(StayUnitType value) {
            this.stayUnit = value;
        }

        /**
         * 获取minStayDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinStayDate() {
            return minStayDate;
        }

        /**
         * 设置minStayDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinStayDate(String value) {
            this.minStayDate = value;
        }

        /**
         * 获取complicatedRulesInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isComplicatedRulesInd() {
            return complicatedRulesInd;
        }

        /**
         * 设置complicatedRulesInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setComplicatedRulesInd(Boolean value) {
            this.complicatedRulesInd = value;
        }

    }

}
