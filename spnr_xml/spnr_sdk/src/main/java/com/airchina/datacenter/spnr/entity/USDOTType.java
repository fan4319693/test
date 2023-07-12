//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Select a value from the enumerated list or enter a string value.
 * 				=enumerated values=
 * 				N = NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
 * 				Y = SUBJECT TO US DOT RESERVATION AND DISCLOSURE
 * 				D = SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
 * 
 * <p>USDOTType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="USDOTType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>DisclosureCodeType">
 *       &lt;attribute name="Disclosure" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Info" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "USDOTType", propOrder = {
    "value"
})
public class USDOTType {

    @XmlValue
    protected DisclosureCodeType value;
    @XmlAttribute(name = "Disclosure")
    protected String disclosure;
    @XmlAttribute(name = "Info")
    protected String info;

    /**
     * Select a value from the enumerated list or enter a string value that is bilaterally agreed upon between trading partners.
     *  =enumerated values=
     * N = BAGGAGE IS NOT SUBJECT TO US DOT RESERVATION OR DISCLOSURE
     * Y = BAGGAGE IS SUBJECT TO US DOT RESERVATION AND DISCLOSURE
     * D = BAGGAGE IS SUBJECT TO DISCLOSURE BUT NOT TO US DOT RESERVATION
     * 
     * @return
     *     possible object is
     *     {@link DisclosureCodeType }
     *     
     */
    public DisclosureCodeType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DisclosureCodeType }
     *     
     */
    public void setValue(DisclosureCodeType value) {
        this.value = value;
    }

    /**
     * 获取disclosure属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDisclosure() {
        return disclosure;
    }

    /**
     * 设置disclosure属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDisclosure(String value) {
        this.disclosure = value;
    }

    /**
     * 获取info属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInfo() {
        return info;
    }

    /**
     * 设置info属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInfo(String value) {
        this.info = value;
    }

}
