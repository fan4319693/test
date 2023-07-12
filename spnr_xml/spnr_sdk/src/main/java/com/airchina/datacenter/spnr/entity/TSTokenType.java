//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TSTokenType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TSTokenType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="KeyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="KeyValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="EffectivePeriod" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PeriodUnit" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TSTokenType")
public class TSTokenType {

    @XmlAttribute(name = "KeyCode")
    protected String keyCode;
    @XmlAttribute(name = "KeyValue", required = true)
    protected String keyValue;
    @XmlAttribute(name = "EffectivePeriod")
    protected BigInteger effectivePeriod;
    @XmlAttribute(name = "PeriodUnit")
    protected String periodUnit;

    /**
     * 获取keyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyCode() {
        return keyCode;
    }

    /**
     * 设置keyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyCode(String value) {
        this.keyCode = value;
    }

    /**
     * 获取keyValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getKeyValue() {
        return keyValue;
    }

    /**
     * 设置keyValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setKeyValue(String value) {
        this.keyValue = value;
    }

    /**
     * 获取effectivePeriod属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEffectivePeriod() {
        return effectivePeriod;
    }

    /**
     * 设置effectivePeriod属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEffectivePeriod(BigInteger value) {
        this.effectivePeriod = value;
    }

    /**
     * 获取periodUnit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriodUnit() {
        return periodUnit;
    }

    /**
     * 设置periodUnit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriodUnit(String value) {
        this.periodUnit = value;
    }

}
