//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to hold filter parameters for a given corporate policy.
 * 
 * <p>CorporatePolicyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CorporatePolicyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="FilterID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CorporateNodeID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ApplicationOrder" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FilterValue" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CorporatePolicyType")
public class CorporatePolicyType {

    @XmlAttribute(name = "FilterID", required = true)
    protected String filterID;
    @XmlAttribute(name = "CorporateNodeID", required = true)
    protected String corporateNodeID;
    @XmlAttribute(name = "Status", required = true)
    protected int status;
    @XmlAttribute(name = "ApplicationOrder", required = true)
    protected int applicationOrder;
    @XmlAttribute(name = "FilterValue", required = true)
    protected String filterValue;

    /**
     * 获取filterID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterID() {
        return filterID;
    }

    /**
     * 设置filterID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterID(String value) {
        this.filterID = value;
    }

    /**
     * 获取corporateNodeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCorporateNodeID() {
        return corporateNodeID;
    }

    /**
     * 设置corporateNodeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCorporateNodeID(String value) {
        this.corporateNodeID = value;
    }

    /**
     * 获取status属性的值。
     * 
     */
    public int getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     */
    public void setStatus(int value) {
        this.status = value;
    }

    /**
     * 获取applicationOrder属性的值。
     * 
     */
    public int getApplicationOrder() {
        return applicationOrder;
    }

    /**
     * 设置applicationOrder属性的值。
     * 
     */
    public void setApplicationOrder(int value) {
        this.applicationOrder = value;
    }

    /**
     * 获取filterValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFilterValue() {
        return filterValue;
    }

    /**
     * 设置filterValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFilterValue(String value) {
        this.filterValue = value;
    }

}
