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
 * Traveler rule.
 * 
 * <p>TravelerRuleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelerRuleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeQualifications" type="{http://www.opentravel.org/OTA/2003/05}AgeQualificationsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MinQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
 *       &lt;attribute name="MaxQuantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to999" />
 *       &lt;attribute name="RuleCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RuleDesc" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerRuleType", propOrder = {
    "ageQualifications"
})
public class TravelerRuleType {

    @XmlElement(name = "AgeQualifications")
    protected AgeQualificationsType ageQualifications;
    @XmlAttribute(name = "MinQuantity")
    protected Integer minQuantity;
    @XmlAttribute(name = "MaxQuantity")
    protected Integer maxQuantity;
    @XmlAttribute(name = "RuleCode")
    protected String ruleCode;
    @XmlAttribute(name = "RuleDesc")
    protected String ruleDesc;

    /**
     * 获取ageQualifications属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgeQualificationsType }
     *     
     */
    public AgeQualificationsType getAgeQualifications() {
        return ageQualifications;
    }

    /**
     * 设置ageQualifications属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgeQualificationsType }
     *     
     */
    public void setAgeQualifications(AgeQualificationsType value) {
        this.ageQualifications = value;
    }

    /**
     * 获取minQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMinQuantity() {
        return minQuantity;
    }

    /**
     * 设置minQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMinQuantity(Integer value) {
        this.minQuantity = value;
    }

    /**
     * 获取maxQuantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxQuantity() {
        return maxQuantity;
    }

    /**
     * 设置maxQuantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxQuantity(Integer value) {
        this.maxQuantity = value;
    }

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

    /**
     * 获取ruleDesc属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleDesc() {
        return ruleDesc;
    }

    /**
     * 设置ruleDesc属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleDesc(String value) {
        this.ruleDesc = value;
    }

}
