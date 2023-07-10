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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Account code, net reporting code, nonendorsable and nonrefundable indicators, penalty restriction indicator, pricing system, statistical code and tour code.
 * 
 * <p>ET_FareInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ET_FareInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Waiver" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="ExchangedReissued"/>
 *                       &lt;enumeration value="FareComponent"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RuleIndicator" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="RuleCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="NetReportingCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *       &lt;attribute name="StatisticalCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to3" />
 *       &lt;attribute name="TourCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="CountryCodeOfIssue" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ET_FareInfo", propOrder = {
    "waiver",
    "ruleIndicator"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.EMDType.FareInfo.class
})
public class ETFareInfo {

    @XmlElement(name = "Waiver")
    protected List<ETFareInfo.Waiver> waiver;
    @XmlElement(name = "RuleIndicator")
    protected List<ETFareInfo.RuleIndicator> ruleIndicator;
    @XmlAttribute(name = "NetReportingCode")
    protected String netReportingCode;
    @XmlAttribute(name = "StatisticalCode")
    protected String statisticalCode;
    @XmlAttribute(name = "TourCode")
    protected String tourCode;
    @XmlAttribute(name = "CountryCodeOfIssue")
    protected String countryCodeOfIssue;

    /**
     * Gets the value of the waiver property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the waiver property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getWaiver().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfo.Waiver }
     * 
     * 
     */
    public List<ETFareInfo.Waiver> getWaiver() {
        if (waiver == null) {
            waiver = new ArrayList<ETFareInfo.Waiver>();
        }
        return this.waiver;
    }

    /**
     * Gets the value of the ruleIndicator property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ruleIndicator property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRuleIndicator().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ETFareInfo.RuleIndicator }
     * 
     * 
     */
    public List<ETFareInfo.RuleIndicator> getRuleIndicator() {
        if (ruleIndicator == null) {
            ruleIndicator = new ArrayList<ETFareInfo.RuleIndicator>();
        }
        return this.ruleIndicator;
    }

    /**
     * 获取netReportingCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNetReportingCode() {
        return netReportingCode;
    }

    /**
     * 设置netReportingCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNetReportingCode(String value) {
        this.netReportingCode = value;
    }

    /**
     * 获取statisticalCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatisticalCode() {
        return statisticalCode;
    }

    /**
     * 设置statisticalCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatisticalCode(String value) {
        this.statisticalCode = value;
    }

    /**
     * 获取tourCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTourCode() {
        return tourCode;
    }

    /**
     * 设置tourCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTourCode(String value) {
        this.tourCode = value;
    }

    /**
     * 获取countryCodeOfIssue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCountryCodeOfIssue() {
        return countryCodeOfIssue;
    }

    /**
     * 设置countryCodeOfIssue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCountryCodeOfIssue(String value) {
        this.countryCodeOfIssue = value;
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
     *       &lt;attribute name="RuleCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to3" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class RuleIndicator {

        @XmlAttribute(name = "RuleCode", required = true)
        protected String ruleCode;

        /**
         * 获取ruleCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleCode() {
            return ruleCode;
        }

        /**
         * 设置ruleCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleCode(String value) {
            this.ruleCode = value;
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
     *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="ExchangedReissued"/>
     *             &lt;enumeration value="FareComponent"/>
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
    public static class Waiver {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Type")
        protected String type;

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

}
