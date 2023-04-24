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
 * <p>ExtraProductDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExtraProductDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Service" type="{http://www.opentravel.org/OTA/2003/05}ServiceType"/>
 *         &lt;element name="PricedEquip" type="{http://www.opentravel.org/OTA/2003/05}VehicleEquipmentPricedType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtraProductDetailsType", propOrder = {
    "service",
    "pricedEquip"
})
public class ExtraProductDetailsType {

    @XmlElement(name = "Service")
    protected ServiceType service;
    @XmlElement(name = "PricedEquip")
    protected VehicleEquipmentPricedType pricedEquip;

    /**
     * 获取service属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServiceType }
     *     
     */
    public ServiceType getService() {
        return service;
    }

    /**
     * 设置service属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServiceType }
     *     
     */
    public void setService(ServiceType value) {
        this.service = value;
    }

    /**
     * 获取pricedEquip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleEquipmentPricedType }
     *     
     */
    public VehicleEquipmentPricedType getPricedEquip() {
        return pricedEquip;
    }

    /**
     * 设置pricedEquip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleEquipmentPricedType }
     *     
     */
    public void setPricedEquip(VehicleEquipmentPricedType value) {
        this.pricedEquip = value;
    }

}
