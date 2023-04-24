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
import javax.xml.bind.annotation.XmlType;


/**
 * Pricing Restriction information.
 * 
 * <p>PricingRestrictionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PricingRestrictionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MinimumStay" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *       &lt;attribute name="MaximumStay" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *       &lt;attribute name="Advance" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *       &lt;attribute name="Penalty" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="Y" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PricingRestrictionType")
public class PricingRestrictionType {

    @XmlAttribute(name = "MinimumStay")
    protected String minimumStay;
    @XmlAttribute(name = "MaximumStay")
    protected String maximumStay;
    @XmlAttribute(name = "Advance")
    protected String advance;
    @XmlAttribute(name = "Penalty")
    protected String penalty;

    /**
     * 获取minimumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumStay() {
        if (minimumStay == null) {
            return "Y";
        } else {
            return minimumStay;
        }
    }

    /**
     * 设置minimumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumStay(String value) {
        this.minimumStay = value;
    }

    /**
     * 获取maximumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStay() {
        if (maximumStay == null) {
            return "Y";
        } else {
            return maximumStay;
        }
    }

    /**
     * 设置maximumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStay(String value) {
        this.maximumStay = value;
    }

    /**
     * 获取advance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvance() {
        if (advance == null) {
            return "Y";
        } else {
            return advance;
        }
    }

    /**
     * 设置advance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvance(String value) {
        this.advance = value;
    }

    /**
     * 获取penalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPenalty() {
        if (penalty == null) {
            return "Y";
        } else {
            return penalty;
        }
    }

    /**
     * 设置penalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPenalty(String value) {
        this.penalty = value;
    }

}
