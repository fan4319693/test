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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Indicates the number of customers taking specific type of personal insurance.
 * 
 * <p>PersonalInsuranceItemType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonalInsuranceItemType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}PkgPersonalInsuranceCode" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonalInsuranceItemType", propOrder = {
    "customerCounts"
})
public class PersonalInsuranceItemType {

    @XmlElement(name = "CustomerCounts", required = true)
    protected CustomerCountsType customerCounts;
    @XmlAttribute(name = "Code", required = true)
    protected PkgPersonalInsuranceCode code;

    /**
     * 获取customerCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getCustomerCounts() {
        return customerCounts;
    }

    /**
     * 设置customerCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setCustomerCounts(CustomerCountsType value) {
        this.customerCounts = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public PkgPersonalInsuranceCode getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgPersonalInsuranceCode }
     *     
     */
    public void setCode(PkgPersonalInsuranceCode value) {
        this.code = value;
    }

}
