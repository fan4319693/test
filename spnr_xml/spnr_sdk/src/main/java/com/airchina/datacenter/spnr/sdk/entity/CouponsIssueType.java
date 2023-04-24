//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CouponsIssueType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponsIssueType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Criteria" type="{http://www.opentravel.org/OTA/2003/05}CouponCriteriaType" minOccurs="0"/>
 *         &lt;element name="EventGroup" type="{http://www.opentravel.org/OTA/2003/05}CouponEventGroupType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponsIssueType", propOrder = {
    "criteria",
    "eventGroup"
})
public class CouponsIssueType {

    @XmlElement(name = "Criteria")
    protected CouponCriteriaType criteria;
    @XmlElement(name = "EventGroup")
    protected CouponEventGroupType eventGroup;

    /**
     * 获取criteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponCriteriaType }
     *     
     */
    public CouponCriteriaType getCriteria() {
        return criteria;
    }

    /**
     * 设置criteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponCriteriaType }
     *     
     */
    public void setCriteria(CouponCriteriaType value) {
        this.criteria = value;
    }

    /**
     * 获取eventGroup属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponEventGroupType }
     *     
     */
    public CouponEventGroupType getEventGroup() {
        return eventGroup;
    }

    /**
     * 设置eventGroup属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponEventGroupType }
     *     
     */
    public void setEventGroup(CouponEventGroupType value) {
        this.eventGroup = value;
    }

}
