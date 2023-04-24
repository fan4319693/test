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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Aggregator Party Identification.
 * 
 * <p>AggregatorPartyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AggregatorPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="AggregatorID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AggregatorPW" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AggregatorType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AggregatorRole" use="required" type="{http://www.opentravel.org/OTA/2003/05}AggregatorRoleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AggregatorPartyType")
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SaleInfoType.Identification.AggregatorInfo.class
})
public class AggregatorPartyType {

    @XmlAttribute(name = "AggregatorID", required = true)
    protected String aggregatorID;
    @XmlAttribute(name = "AggregatorPW")
    protected String aggregatorPW;
    @XmlAttribute(name = "AggregatorType")
    protected String aggregatorType;
    @XmlAttribute(name = "AggregatorRole", required = true)
    protected AggregatorRoleType aggregatorRole;

    /**
     * 获取aggregatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorID() {
        return aggregatorID;
    }

    /**
     * 设置aggregatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorID(String value) {
        this.aggregatorID = value;
    }

    /**
     * 获取aggregatorPW属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorPW() {
        return aggregatorPW;
    }

    /**
     * 设置aggregatorPW属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorPW(String value) {
        this.aggregatorPW = value;
    }

    /**
     * 获取aggregatorType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAggregatorType() {
        return aggregatorType;
    }

    /**
     * 设置aggregatorType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAggregatorType(String value) {
        this.aggregatorType = value;
    }

    /**
     * 获取aggregatorRole属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AggregatorRoleType }
     *     
     */
    public AggregatorRoleType getAggregatorRole() {
        return aggregatorRole;
    }

    /**
     * 设置aggregatorRole属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AggregatorRoleType }
     *     
     */
    public void setAggregatorRole(AggregatorRoleType value) {
        this.aggregatorRole = value;
    }

}
