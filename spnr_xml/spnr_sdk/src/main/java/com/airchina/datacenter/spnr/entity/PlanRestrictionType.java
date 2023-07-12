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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Contains all restrictions to coverage by the quoted or booked plan.
 * 
 * <p>PlanRestrictionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PlanRestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PlanRestriction" maxOccurs="99">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="FlightSegmentRefs" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentRefsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LanguageGroup"/>
 *                 &lt;attribute name="CodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
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
@XmlType(name = "PlanRestrictionType", propOrder = {
    "planRestriction"
})
public class PlanRestrictionType {

    @XmlElement(name = "PlanRestriction", required = true)
    protected List<PlanRestrictionType.PlanRestriction> planRestriction;

    /**
     * Gets the value of the planRestriction property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the planRestriction property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPlanRestriction().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanRestrictionType.PlanRestriction }
     * 
     * 
     */
    public List<PlanRestrictionType.PlanRestriction> getPlanRestriction() {
        if (planRestriction == null) {
            planRestriction = new ArrayList<PlanRestrictionType.PlanRestriction>();
        }
        return this.planRestriction;
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
     *         &lt;element name="FlightSegmentRefs" type="{http://www.opentravel.org/OTA/2003/05}FlightSegmentRefsType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LanguageGroup"/>
     *       &lt;attribute name="CodeContext" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "flightSegmentRefs"
    })
    public static class PlanRestriction {

        @XmlElement(name = "FlightSegmentRefs")
        protected FlightSegmentRefsType flightSegmentRefs;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;
        @XmlAttribute(name = "CharSet")
        protected String charSet;

        /**
         * 获取flightSegmentRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FlightSegmentRefsType }
         *     
         */
        public FlightSegmentRefsType getFlightSegmentRefs() {
            return flightSegmentRefs;
        }

        /**
         * 设置flightSegmentRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FlightSegmentRefsType }
         *     
         */
        public void setFlightSegmentRefs(FlightSegmentRefsType value) {
            this.flightSegmentRefs = value;
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
         * 获取language属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * 设置language属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
        }

        /**
         * 获取charSet属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharSet() {
            return charSet;
        }

        /**
         * 设置charSet属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharSet(String value) {
            this.charSet = value;
        }

    }

}
