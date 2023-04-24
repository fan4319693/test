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
import javax.xml.bind.annotation.XmlType;


/**
 * Optional service BUNDLE AND ITEM information.
 * 
 * <p>NDC_ServiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="NDC_ServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}Source"/>
 *       &lt;attribute name="ApplyToAll" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}SrvcProcessStatusType" />
 *       &lt;attribute name="SaleStatus" type="{http://www.opentravel.org/OTA/2003/05}SrvcSalesStatusType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "NDC_ServiceType")
public class NDCServiceType {

    @XmlAttribute(name = "ApplyToAll")
    protected String applyToAll;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "SaleStatus")
    protected SrvcSalesStatusType saleStatus;
    @XmlAttribute(name = "Source")
    protected String source;

    /**
     * 获取applyToAll属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyToAll() {
        return applyToAll;
    }

    /**
     * 设置applyToAll属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyToAll(String value) {
        this.applyToAll = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取saleStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SrvcSalesStatusType }
     *     
     */
    public SrvcSalesStatusType getSaleStatus() {
        return saleStatus;
    }

    /**
     * 设置saleStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SrvcSalesStatusType }
     *     
     */
    public void setSaleStatus(SrvcSalesStatusType value) {
        this.saleStatus = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
    }

}
