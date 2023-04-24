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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Collection of formatted text sub sections.
 * 
 * <p>FormattedTextType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FormattedTextType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="SubSection" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextSubSectionType" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Title" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FormattedTextType", propOrder = {
    "subSection"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.VehicleAgeRequirementsType.Age.AgeInfos.AgeInfo.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleLocationVehiclesType.VehicleInfos.VehicleInfo.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleAdditionalDriverRequirementsType.AddlDriverInfos.AddlDriverInfo.class,
    VehicleLocationInformationType.class,
    com.airchina.datacenter.spnr.sdk.entity.VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo.class,
    VendorMessageType.class
})
public class FormattedTextType {

    @XmlElement(name = "SubSection")
    protected List<FormattedTextSubSectionType> subSection;
    @XmlAttribute(name = "Title")
    protected String title;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;

    /**
     * Gets the value of the subSection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the subSection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSubSection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FormattedTextSubSectionType }
     * 
     * 
     */
    public List<FormattedTextSubSectionType> getSubSection() {
        if (subSection == null) {
            subSection = new ArrayList<FormattedTextSubSectionType>();
        }
        return this.subSection;
    }

    /**
     * 获取title属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTitle() {
        return title;
    }

    /**
     * 设置title属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTitle(String value) {
        this.title = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

}
