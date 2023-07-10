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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Service Base (net) Price information.
 * 
 * <p>ServiceBasePriceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServiceBasePriceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FiledIn" type="{http://www.opentravel.org/OTA/2003/05}FareFiledInType" minOccurs="0"/>
 *         &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}SurchargesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServiceBasePriceType", propOrder = {
    "filedIn",
    "surcharges"
})
public class ServiceBasePriceType {

    @XmlElement(name = "FiledIn")
    protected FareFiledInType filedIn;
    @XmlElement(name = "Surcharges")
    protected SurchargesType surcharges;
    @XmlAttribute(name = "Amount", required = true)
    protected BigInteger amount;

    /**
     * 获取filedIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareFiledInType }
     *     
     */
    public FareFiledInType getFiledIn() {
        return filedIn;
    }

    /**
     * 设置filedIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareFiledInType }
     *     
     */
    public void setFiledIn(FareFiledInType value) {
        this.filedIn = value;
    }

    /**
     * 获取surcharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SurchargesType }
     *     
     */
    public SurchargesType getSurcharges() {
        return surcharges;
    }

    /**
     * 设置surcharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargesType }
     *     
     */
    public void setSurcharges(SurchargesType value) {
        this.surcharges = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
    }

}
