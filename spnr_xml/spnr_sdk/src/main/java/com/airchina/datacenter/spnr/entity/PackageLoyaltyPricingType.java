//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * This should only be used for the Room, Flights and Vehicle elements that make up a package in order to store the deltas
 * 
 * <p>PackageLoyaltyPricingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageLoyaltyPricingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Earn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageEarnType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Redeem" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageRedeemType">
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageLoyaltyPricingType", propOrder = {
    "earn",
    "redeem"
})
public class PackageLoyaltyPricingType {

    @XmlElement(name = "Earn")
    protected PackageLoyaltyPricingType.Earn earn;
    @XmlElement(name = "Redeem")
    protected List<PackageLoyaltyPricingType.Redeem> redeem;

    /**
     * 获取earn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageLoyaltyPricingType.Earn }
     *     
     */
    public PackageLoyaltyPricingType.Earn getEarn() {
        return earn;
    }

    /**
     * 设置earn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageLoyaltyPricingType.Earn }
     *     
     */
    public void setEarn(PackageLoyaltyPricingType.Earn value) {
        this.earn = value;
    }

    /**
     * Gets the value of the redeem property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the redeem property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRedeem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageLoyaltyPricingType.Redeem }
     * 
     * 
     */
    public List<PackageLoyaltyPricingType.Redeem> getRedeem() {
        if (redeem == null) {
            redeem = new ArrayList<PackageLoyaltyPricingType.Redeem>();
        }
        return this.redeem;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageEarnType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Earn
        extends PackageEarnType
    {


    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PackageRedeemType">
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Redeem
        extends PackageRedeemType
    {


    }

}
