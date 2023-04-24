//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CouponCriteriaType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponCriteriaType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TravelItinerary" type="{http://www.opentravel.org/OTA/2003/05}CouponTravelItineraryType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Account" type="{http://www.opentravel.org/OTA/2003/05}CouponAccountType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Product" type="{http://www.opentravel.org/OTA/2003/05}CouponProductType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponCriteriaType", propOrder = {
    "travelItinerary",
    "account",
    "product"
})
public class CouponCriteriaType {

    @XmlElement(name = "TravelItinerary")
    protected List<CouponTravelItineraryType> travelItinerary;
    @XmlElement(name = "Account")
    protected List<CouponAccountType> account;
    @XmlElement(name = "Product")
    protected List<CouponProductType> product;

    /**
     * Gets the value of the travelItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponTravelItineraryType }
     * 
     * 
     */
    public List<CouponTravelItineraryType> getTravelItinerary() {
        if (travelItinerary == null) {
            travelItinerary = new ArrayList<CouponTravelItineraryType>();
        }
        return this.travelItinerary;
    }

    /**
     * Gets the value of the account property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the account property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccount().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponAccountType }
     * 
     * 
     */
    public List<CouponAccountType> getAccount() {
        if (account == null) {
            account = new ArrayList<CouponAccountType>();
        }
        return this.account;
    }

    /**
     * Gets the value of the product property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the product property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CouponProductType }
     * 
     * 
     */
    public List<CouponProductType> getProduct() {
        if (product == null) {
            product = new ArrayList<CouponProductType>();
        }
        return this.product;
    }

}
