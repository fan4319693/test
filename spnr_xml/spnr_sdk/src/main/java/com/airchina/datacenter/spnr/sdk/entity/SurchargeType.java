//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Surcharge detail.
 * 
 * <p>SurchargeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SurchargeType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SurchargeBasicType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ONOFFPoint"/>
 *       &lt;attribute name="Segment" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SurchargeType")
public class SurchargeType
    extends SurchargeBasicType
{

    @XmlAttribute(name = "Segment")
    protected BigInteger segment;
    @XmlAttribute(name = "OFFPoint")
    protected String offPoint;
    @XmlAttribute(name = "ONPoint")
    protected String onPoint;

    /**
     * 获取segment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getSegment() {
        return segment;
    }

    /**
     * 设置segment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setSegment(BigInteger value) {
        this.segment = value;
    }

    /**
     * 获取offPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOFFPoint() {
        return offPoint;
    }

    /**
     * 设置offPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOFFPoint(String value) {
        this.offPoint = value;
    }

    /**
     * 获取onPoint属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getONPoint() {
        return onPoint;
    }

    /**
     * 设置onPoint属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setONPoint(String value) {
        this.onPoint = value;
    }

}
