//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Room amentity with mixed content.
 * 			Content load message pair can have elements other than strings but for CTRIP due to old connector implementation we need to store this text underneath the amenity element. 
 * 			We want to declare this as a mixed type to keep the schema backward compatible with the old CTRIP connector until the new one has been implemented.
 * 			
 * 
 * <p>RoomAmenityPrefType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomAmenityPrefType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaObjectType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PreferLevelGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QuantityGroup"/>
 *       &lt;attribute name="RoomAmenity" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="QualityLevel" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="Included" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SupplierAmenityCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RoomAmenityPrefType", propOrder = {
    "description"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.PropertyValueMatchType.Amenities.Amenity.class
})
public class RoomAmenityPrefType {

    @XmlElement(name = "Description")
    protected List<MultimediaObjectType> description;
    @XmlAttribute(name = "RoomAmenity")
    protected String roomAmenity;
    @XmlAttribute(name = "ExistsCode")
    protected String existsCode;
    @XmlAttribute(name = "QualityLevel")
    protected String qualityLevel;
    @XmlAttribute(name = "Included")
    protected Boolean included;
    @XmlAttribute(name = "SupplierAmenityCode")
    protected String supplierAmenityCode;
    @XmlAttribute(name = "PreferLevel")
    protected PreferLevelType preferLevel;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

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
     * {@link MultimediaObjectType }
     * 
     * 
     */
    public List<MultimediaObjectType> getDescription() {
        if (description == null) {
            description = new ArrayList<MultimediaObjectType>();
        }
        return this.description;
    }

    /**
     * 获取roomAmenity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomAmenity() {
        return roomAmenity;
    }

    /**
     * 设置roomAmenity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomAmenity(String value) {
        this.roomAmenity = value;
    }

    /**
     * 获取existsCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExistsCode() {
        return existsCode;
    }

    /**
     * 设置existsCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExistsCode(String value) {
        this.existsCode = value;
    }

    /**
     * 获取qualityLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQualityLevel() {
        return qualityLevel;
    }

    /**
     * 设置qualityLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQualityLevel(String value) {
        this.qualityLevel = value;
    }

    /**
     * 获取included属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIncluded() {
        return included;
    }

    /**
     * 设置included属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIncluded(Boolean value) {
        this.included = value;
    }

    /**
     * 获取supplierAmenityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierAmenityCode() {
        return supplierAmenityCode;
    }

    /**
     * 设置supplierAmenityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierAmenityCode(String value) {
        this.supplierAmenityCode = value;
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

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
    }

}
