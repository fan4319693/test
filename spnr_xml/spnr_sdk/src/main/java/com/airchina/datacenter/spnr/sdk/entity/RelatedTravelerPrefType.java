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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Name(s) of related travelers to be used with this collection of preferences.
 * 
 * <p>RelatedTravelerPrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RelatedTravelerPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RelatedTravelerPrefType", propOrder = {
    "uniqueID"
})
public class RelatedTravelerPrefType {

    @XmlElement(name = "UniqueID", required = true)
    protected UniqueIDType uniqueID;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setUniqueID(UniqueIDType value) {
        this.uniqueID = value;
    }

    /**
     * 获取preferLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferLevelType }
     *     
     */
    public PreferLevelType getPreferLevel() {
        if (preferLevel == null) {
            return PreferLevelType.PREFERRED;
        } else {
            return preferLevel;
        }
    }

    /**
     * 设置preferLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferLevelType }
     *     
     */
    public void setPreferLevel(PreferLevelType value) {
        this.preferLevel = value;
    }

}