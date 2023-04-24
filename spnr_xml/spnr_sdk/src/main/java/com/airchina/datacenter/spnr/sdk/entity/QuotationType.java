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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QuotationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QuotationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Tariff" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Promotion" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to10" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Scheme" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Authorisation" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to25" />
 *                 &lt;attribute name="Category" default="Member">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to35">
 *                       &lt;enumeration value="Member"/>
 *                       &lt;enumeration value="Guest"/>
 *                       &lt;enumeration value="Associate"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
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
@XmlType(name = "QuotationType", propOrder = {
    "tariff",
    "scheme"
})
public class QuotationType {

    @XmlElement(name = "Tariff")
    protected QuotationType.Tariff tariff;
    @XmlElement(name = "Scheme")
    protected QuotationType.Scheme scheme;

    /**
     * 获取tariff属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.Tariff }
     *     
     */
    public QuotationType.Tariff getTariff() {
        return tariff;
    }

    /**
     * 设置tariff属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.Tariff }
     *     
     */
    public void setTariff(QuotationType.Tariff value) {
        this.tariff = value;
    }

    /**
     * 获取scheme属性的值。
     * 
     * @return
     *     possible object is
     *     {@link QuotationType.Scheme }
     *     
     */
    public QuotationType.Scheme getScheme() {
        return scheme;
    }

    /**
     * 设置scheme属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link QuotationType.Scheme }
     *     
     */
    public void setScheme(QuotationType.Scheme value) {
        this.scheme = value;
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
     *       &lt;attribute name="Authorisation" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to25" />
     *       &lt;attribute name="Category" default="Member">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to35">
     *             &lt;enumeration value="Member"/>
     *             &lt;enumeration value="Guest"/>
     *             &lt;enumeration value="Associate"/>
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
    @XmlType(name = "")
    public static class Scheme {

        @XmlAttribute(name = "Authorisation", required = true)
        protected String authorisation;
        @XmlAttribute(name = "Category")
        protected String category;

        /**
         * 获取authorisation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAuthorisation() {
            return authorisation;
        }

        /**
         * 设置authorisation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAuthorisation(String value) {
            this.authorisation = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            if (category == null) {
                return "Member";
            } else {
                return category;
            }
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
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
     *       &lt;attribute name="Promotion" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to10" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Tariff {

        @XmlAttribute(name = "Promotion", required = true)
        protected String promotion;

        /**
         * 获取promotion属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPromotion() {
            return promotion;
        }

        /**
         * 设置promotion属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPromotion(String value) {
            this.promotion = value;
        }

    }

}
