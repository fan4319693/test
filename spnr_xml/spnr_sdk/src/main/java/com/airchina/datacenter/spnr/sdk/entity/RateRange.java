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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MinRate" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="MaxRate" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="PTCCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "")
@XmlRootElement(name = "RateRange")
public class RateRange {

    @XmlAttribute(name = "MinRate", required = true)
    protected BigInteger minRate;
    @XmlAttribute(name = "MaxRate", required = true)
    protected BigInteger maxRate;
    @XmlAttribute(name = "PTCCode")
    protected String ptcCode;

    /**
     * 获取minRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinRate() {
        return minRate;
    }

    /**
     * 设置minRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinRate(BigInteger value) {
        this.minRate = value;
    }

    /**
     * 获取maxRate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxRate() {
        return maxRate;
    }

    /**
     * 设置maxRate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxRate(BigInteger value) {
        this.maxRate = value;
    }

    /**
     * 获取ptcCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPTCCode() {
        return ptcCode;
    }

    /**
     * 设置ptcCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPTCCode(String value) {
        this.ptcCode = value;
    }

}
