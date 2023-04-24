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
 * Time zone abbreviation.
 * 				Example: ET
 * 
 * The time zone name or abbreviation.
 * 
 * <p>TimeZoneType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TimeZoneType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attribute name="UTCOffset" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="DaylightSavings" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TimeZoneType", propOrder = {
    "value"
})
public class TimeZoneType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "UTCOffset")
    protected String utcOffset;
    @XmlAttribute(name = "DaylightSavings")
    protected String daylightSavings;

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
     * 获取utcOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUTCOffset() {
        return utcOffset;
    }

    /**
     * 设置utcOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUTCOffset(String value) {
        this.utcOffset = value;
    }

    /**
     * 获取daylightSavings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDaylightSavings() {
        return daylightSavings;
    }

    /**
     * 设置daylightSavings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDaylightSavings(String value) {
        this.daylightSavings = value;
    }

}
