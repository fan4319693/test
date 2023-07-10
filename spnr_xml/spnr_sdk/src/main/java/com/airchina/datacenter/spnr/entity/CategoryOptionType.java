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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies category option information.
 * 
 * <p>CategoryOptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CategoryOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PriceInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="PriceInfo" type="{http://www.opentravel.org/OTA/2003/05}PriceInfoType" maxOccurs="8"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryGroup"/>
 *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="ListOfCategoryQualifierCodes" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *       &lt;attribute name="AvailableGroupAllocationQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to9999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CategoryOptionType", propOrder = {
    "priceInfos"
})
public class CategoryOptionType {

    @XmlElement(name = "PriceInfos")
    protected CategoryOptionType.PriceInfos priceInfos;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;
    @XmlAttribute(name = "ListOfCategoryQualifierCodes")
    protected List<String> listOfCategoryQualifierCodes;
    @XmlAttribute(name = "AvailableGroupAllocationQty")
    protected Integer availableGroupAllocationQty;
    @XmlAttribute(name = "FareCode")
    protected String fareCode;
    @XmlAttribute(name = "GroupCode")
    protected String groupCode;
    @XmlAttribute(name = "BerthedCategoryCode")
    protected String berthedCategoryCode;
    @XmlAttribute(name = "PricedCategoryCode")
    protected String pricedCategoryCode;

    /**
     * 获取priceInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryOptionType.PriceInfos }
     *     
     */
    public CategoryOptionType.PriceInfos getPriceInfos() {
        return priceInfos;
    }

    /**
     * 设置priceInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryOptionType.PriceInfos }
     *     
     */
    public void setPriceInfos(CategoryOptionType.PriceInfos value) {
        this.priceInfos = value;
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
     * 获取heldIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * 设置heldIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * 获取categoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * 设置categoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }

    /**
     * Gets the value of the listOfCategoryQualifierCodes property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfCategoryQualifierCodes property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfCategoryQualifierCodes().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfCategoryQualifierCodes() {
        if (listOfCategoryQualifierCodes == null) {
            listOfCategoryQualifierCodes = new ArrayList<String>();
        }
        return this.listOfCategoryQualifierCodes;
    }

    /**
     * 获取availableGroupAllocationQty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAvailableGroupAllocationQty() {
        return availableGroupAllocationQty;
    }

    /**
     * 设置availableGroupAllocationQty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAvailableGroupAllocationQty(Integer value) {
        this.availableGroupAllocationQty = value;
    }

    /**
     * 获取fareCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * 设置fareCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * 获取groupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置groupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * 获取berthedCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerthedCategoryCode() {
        return berthedCategoryCode;
    }

    /**
     * 设置berthedCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerthedCategoryCode(String value) {
        this.berthedCategoryCode = value;
    }

    /**
     * 获取pricedCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricedCategoryCode() {
        return pricedCategoryCode;
    }

    /**
     * 设置pricedCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricedCategoryCode(String value) {
        this.pricedCategoryCode = value;
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
     *         &lt;element name="PriceInfo" type="{http://www.opentravel.org/OTA/2003/05}PriceInfoType" maxOccurs="8"/>
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
        "priceInfo"
    })
    public static class PriceInfos {

        @XmlElement(name = "PriceInfo", required = true)
        protected List<PriceInfoType> priceInfo;

        /**
         * Gets the value of the priceInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the priceInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPriceInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PriceInfoType }
         * 
         * 
         */
        public List<PriceInfoType> getPriceInfo() {
            if (priceInfo == null) {
                priceInfo = new ArrayList<PriceInfoType>();
            }
            return this.priceInfo;
        }

    }

}
