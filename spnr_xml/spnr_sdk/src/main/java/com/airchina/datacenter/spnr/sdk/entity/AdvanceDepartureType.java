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
import javax.xml.bind.annotation.XmlValue;


/**
 *  =notes=
 * 				1. The type is defined by the Unit and Permitted attributes. If for example this number is 14 and the unit is D and the permitted is latest (value L), that means that ticketing must be at the latest 14 days before the departure.
 * 				2. If permitted was on time (value O), the ticketing must be 14 days before departure.
 * 
 * <p>AdvanceDepartureType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AdvanceDepartureType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}TimeFrequencyUnitType" />
 *       &lt;attribute name="Permitted" use="required" type="{http://www.opentravel.org/OTA/2003/05}RuleRestrictionContextType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AdvanceDepartureType", propOrder = {
    "value"
})
public class AdvanceDepartureType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "Unit", required = true)
    protected TimeFrequencyUnitType unit;
    @XmlAttribute(name = "Permitted", required = true)
    protected RuleRestrictionContextType permitted;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setValue(String value) {
        this.value = value;
    }

    /**
     * 获取unit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TimeFrequencyUnitType }
     *     
     */
    public TimeFrequencyUnitType getUnit() {
        return unit;
    }

    /**
     * 设置unit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TimeFrequencyUnitType }
     *     
     */
    public void setUnit(TimeFrequencyUnitType value) {
        this.unit = value;
    }

    /**
     * 获取permitted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RuleRestrictionContextType }
     *     
     */
    public RuleRestrictionContextType getPermitted() {
        return permitted;
    }

    /**
     * 设置permitted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RuleRestrictionContextType }
     *     
     */
    public void setPermitted(RuleRestrictionContextType value) {
        this.permitted = value;
    }

}
