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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Use: This is a string list of enumerations with an "Other_" literal to support an open enumeration list. Use the "Other_" enumeration in combination with the Code Extension fields to exchange a value that is not in the list and is known to your trading partners.
 * 
 * <p>List_RateCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="List_RateCategory">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_RateCategory_Base">
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_CodeExtGroup"/>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_RateCategory", propOrder = {
    "value"
})
public class ListRateCategory {

    @XmlValue
    protected ListRateCategoryBase value;
    @XmlAttribute(name = "RemovalInd")
    protected Boolean removalInd;
    @XmlAttribute(name = "Code")
    protected String code;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "DescriptionDetail")
    protected String descriptionDetail;
    @XmlAttribute(name = "SourceName")
    protected String sourceName;
    @XmlAttribute(name = "SourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String sourceURL;
    @XmlAttribute(name = "ResourceName")
    protected String resourceName;
    @XmlAttribute(name = "ResourceURL")
    @XmlSchemaType(name = "anyURI")
    protected String resourceURL;
    @XmlAttribute(name = "UniqueID")
    protected String uniqueID;

    /**
     * Source: Rate Category (RTC) OpenTravel codelist.
     * 
     * @return
     *     possible object is
     *     {@link ListRateCategoryBase }
     *     
     */
    public ListRateCategoryBase getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListRateCategoryBase }
     *     
     */
    public void setValue(ListRateCategoryBase value) {
        this.value = value;
    }

    /**
     * 获取removalInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRemovalInd() {
        return removalInd;
    }

    /**
     * 设置removalInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemovalInd(Boolean value) {
        this.removalInd = value;
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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取descriptionDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptionDetail() {
        return descriptionDetail;
    }

    /**
     * 设置descriptionDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptionDetail(String value) {
        this.descriptionDetail = value;
    }

    /**
     * 获取sourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceName() {
        return sourceName;
    }

    /**
     * 设置sourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceName(String value) {
        this.sourceName = value;
    }

    /**
     * 获取sourceURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSourceURL() {
        return sourceURL;
    }

    /**
     * 设置sourceURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSourceURL(String value) {
        this.sourceURL = value;
    }

    /**
     * 获取resourceName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceName() {
        return resourceName;
    }

    /**
     * 设置resourceName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceName(String value) {
        this.resourceName = value;
    }

    /**
     * 获取resourceURL属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResourceURL() {
        return resourceURL;
    }

    /**
     * 设置resourceURL属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResourceURL(String value) {
        this.resourceURL = value;
    }

    /**
     * 获取uniqueID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUniqueID() {
        return uniqueID;
    }

    /**
     * 设置uniqueID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUniqueID(String value) {
        this.uniqueID = value;
    }

}
