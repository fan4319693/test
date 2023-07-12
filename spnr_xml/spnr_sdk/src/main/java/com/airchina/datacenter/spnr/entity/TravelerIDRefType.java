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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Traveler association ID(s).
 * 				Examples:
 * 				1 or T1 = Traveler 1
 * 				2.1 or T2.1 = Traveler 2 with Infant on Lap
 * 
 * 				=notes=
 * 				1. This is one unique traveler reference and NO comma separated lists or ranges are supported.
 * 				2. Precede an infant ID number with a period (Example: T2.1, 2.1)
 * 				3. The location of the data set may be specified in the @Type attribute.
 * 
 * <p>TravelerIDRefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelerIDRefType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RefType"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelerIDRefType", propOrder = {
    "value"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.SpecialSrvcPaxType.SSRType.TravelerIDRef.class,
    com.airchina.datacenter.spnr.entity.SpecialSrvcPaxType.OtherType.TravelerIDRef.class,
    com.airchina.datacenter.spnr.entity.SocialNetworkingPaxType.TravelerIDRef.class
})
public class TravelerIDRefType {

    @XmlValue
    protected String value;
    @XmlAttribute(name = "RefType")
    protected String refType;

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
     * 获取refType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefType() {
        return refType;
    }

    /**
     * 设置refType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefType(String value) {
        this.refType = value;
    }

}
