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


/**
 * Ancillary service qualifier match information definition.
 * 
 * <p>OfferMatchType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OfferMatchType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AttributeMatch" type="{http://www.opentravel.org/OTA/2003/05}SrvcMatchType" />
 *       &lt;attribute name="AffinityMatch" type="{http://www.opentravel.org/OTA/2003/05}SrvcMatchType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OfferMatchType")
public class OfferMatchType {

    @XmlAttribute(name = "AttributeMatch")
    protected String attributeMatch;
    @XmlAttribute(name = "AffinityMatch")
    protected String affinityMatch;

    /**
     * 获取attributeMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAttributeMatch() {
        return attributeMatch;
    }

    /**
     * 设置attributeMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAttributeMatch(String value) {
        this.attributeMatch = value;
    }

    /**
     * 获取affinityMatch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAffinityMatch() {
        return affinityMatch;
    }

    /**
     * 设置affinityMatch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAffinityMatch(String value) {
        this.affinityMatch = value;
    }

}
