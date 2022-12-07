//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Core shopping response information definition.
 * 
 * <p>ShoppingResponseType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShoppingResponseType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ShoppingResponseID" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferTimeLimit" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ShoppingResponseType", propOrder = {
    "shoppingResponseID",
    "offerTimeLimit"
})
public class ShoppingResponseType {

    @XmlElement(name = "ShoppingResponseID")
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "OfferTimeLimit")
    protected OfferTimeLimit offerTimeLimit;

    /**
     * 获取shoppingResponseID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * 设置shoppingResponseID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

    /**
     * 获取offerTimeLimit属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OfferTimeLimit }
     *     
     */
    public OfferTimeLimit getOfferTimeLimit() {
        return offerTimeLimit;
    }

    /**
     * 设置offerTimeLimit属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OfferTimeLimit }
     *     
     */
    public void setOfferTimeLimit(OfferTimeLimit value) {
        this.offerTimeLimit = value;
    }

}
