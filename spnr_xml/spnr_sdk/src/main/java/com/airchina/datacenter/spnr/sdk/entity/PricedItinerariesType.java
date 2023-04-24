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
 * Container for priced itineraries.
 * 
 * <p>PricedItinerariesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PricedItinerariesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PricedItinerary" type="{http://www.opentravel.org/OTA/2003/05}PricedItineraryExtendType" maxOccurs="unbounded"/>
 *         &lt;element name="SupplierPenalties" type="{http://www.opentravel.org/OTA/2003/05}SupplierPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Descriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}LongDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
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
@XmlType(name = "PricedItinerariesType", propOrder = {
    "pricedItinerary",
    "supplierPenalties",
    "descriptions"
})
public class PricedItinerariesType {

    @XmlElement(name = "PricedItinerary", required = true)
    protected List<PricedItineraryExtendType> pricedItinerary;
    @XmlElement(name = "SupplierPenalties")
    protected SupplierPenaltiesType supplierPenalties;
    @XmlElement(name = "Descriptions")
    protected PricedItinerariesType.Descriptions descriptions;

    /**
     * Gets the value of the pricedItinerary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the pricedItinerary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPricedItinerary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PricedItineraryExtendType }
     * 
     * 
     */
    public List<PricedItineraryExtendType> getPricedItinerary() {
        if (pricedItinerary == null) {
            pricedItinerary = new ArrayList<PricedItineraryExtendType>();
        }
        return this.pricedItinerary;
    }

    /**
     * 获取supplierPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierPenaltiesType }
     *     
     */
    public SupplierPenaltiesType getSupplierPenalties() {
        return supplierPenalties;
    }

    /**
     * 设置supplierPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierPenaltiesType }
     *     
     */
    public void setSupplierPenalties(SupplierPenaltiesType value) {
        this.supplierPenalties = value;
    }

    /**
     * 获取descriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PricedItinerariesType.Descriptions }
     *     
     */
    public PricedItinerariesType.Descriptions getDescriptions() {
        return descriptions;
    }

    /**
     * 设置descriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PricedItinerariesType.Descriptions }
     *     
     */
    public void setDescriptions(PricedItinerariesType.Descriptions value) {
        this.descriptions = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}LongDescriptionType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description"
    })
    public static class Descriptions {

        @XmlElement(name = "Description")
        protected List<LongDescriptionType> description;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LongDescriptionType }
         * 
         * 
         */
        public List<LongDescriptionType> getDescription() {
            if (description == null) {
                description = new ArrayList<LongDescriptionType>();
            }
            return this.description;
        }

    }

}
