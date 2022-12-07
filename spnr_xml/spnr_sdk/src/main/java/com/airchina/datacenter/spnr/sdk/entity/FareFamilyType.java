//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Represents a fare family
 * 
 * <p>FareFamilyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FareFamilyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Benifits" type="{http://www.opentravel.org/OTA/2003/05}TagsType" minOccurs="0"/>
 *         &lt;element name="AddOns" type="{http://www.opentravel.org/OTA/2003/05}AddOnsType" minOccurs="0"/>
 *         &lt;element name="AssociatedFFs" type="{http://www.opentravel.org/OTA/2003/05}AssociatedFFsType" minOccurs="0"/>
 *         &lt;element name="Tag" type="{http://www.opentravel.org/OTA/2003/05}CustomerTagType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="SupplierCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *       &lt;attribute name="AdditionalCabins" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="EstimatedMaxDiscountAmount" type="{http://www.opentravel.org/OTA/2003/05}Money" />
 *       &lt;attribute name="PriceType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareFamilyType", propOrder = {
    "benifits",
    "addOns",
    "associatedFFs",
    "tag"
})
public class FareFamilyType {

    @XmlElement(name = "Benifits")
    protected TagsType benifits;
    @XmlElement(name = "AddOns")
    protected AddOnsType addOns;
    @XmlElement(name = "AssociatedFFs")
    protected AssociatedFFsType associatedFFs;
    @XmlElement(name = "Tag")
    protected List<CustomerTagType> tag;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "AdditionalCabins")
    protected Boolean additionalCabins;
    @XmlAttribute(name = "EstimatedMaxDiscountAmount")
    protected BigDecimal estimatedMaxDiscountAmount;
    @XmlAttribute(name = "PriceType")
    protected String priceType;

    /**
     * 获取benifits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TagsType }
     *     
     */
    public TagsType getBenifits() {
        return benifits;
    }

    /**
     * 设置benifits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TagsType }
     *     
     */
    public void setBenifits(TagsType value) {
        this.benifits = value;
    }

    /**
     * 获取addOns属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddOnsType }
     *     
     */
    public AddOnsType getAddOns() {
        return addOns;
    }

    /**
     * 设置addOns属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddOnsType }
     *     
     */
    public void setAddOns(AddOnsType value) {
        this.addOns = value;
    }

    /**
     * 获取associatedFFs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AssociatedFFsType }
     *     
     */
    public AssociatedFFsType getAssociatedFFs() {
        return associatedFFs;
    }

    /**
     * 设置associatedFFs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AssociatedFFsType }
     *     
     */
    public void setAssociatedFFs(AssociatedFFsType value) {
        this.associatedFFs = value;
    }

    /**
     * Gets the value of the tag property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the tag property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTag().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomerTagType }
     * 
     * 
     */
    public List<CustomerTagType> getTag() {
        if (tag == null) {
            tag = new ArrayList<CustomerTagType>();
        }
        return this.tag;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
    }

    /**
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
    }

    /**
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * 获取additionalCabins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAdditionalCabins() {
        return additionalCabins;
    }

    /**
     * 设置additionalCabins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAdditionalCabins(Boolean value) {
        this.additionalCabins = value;
    }

    /**
     * 获取estimatedMaxDiscountAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigDecimal }
     *     
     */
    public BigDecimal getEstimatedMaxDiscountAmount() {
        return estimatedMaxDiscountAmount;
    }

    /**
     * 设置estimatedMaxDiscountAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigDecimal }
     *     
     */
    public void setEstimatedMaxDiscountAmount(BigDecimal value) {
        this.estimatedMaxDiscountAmount = value;
    }

    /**
     * 获取priceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceType() {
        return priceType;
    }

    /**
     * 设置priceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceType(String value) {
        this.priceType = value;
    }

}
