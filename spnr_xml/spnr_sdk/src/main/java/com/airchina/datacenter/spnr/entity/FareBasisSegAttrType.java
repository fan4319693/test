//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Fare basis code with proce class name and flight segment qualifier.
 * 
 * <p>FareBasisSegAttrType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FareBasisSegAttrType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="PriceClass" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}FareBasisCodeDefType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FareBasisSegAttrType", propOrder = {
    "segmentIDRef"
})
public class FareBasisSegAttrType {

    @XmlElement(name = "SegmentIDRef")
    protected SegmentIDRefType segmentIDRef;
    @XmlAttribute(name = "PriceClass")
    protected String priceClass;
    @XmlAttribute(name = "Code", required = true)
    protected String code;

    /**
     * 获取segmentIDRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SegmentIDRefType }
     *     
     */
    public SegmentIDRefType getSegmentIDRef() {
        return segmentIDRef;
    }

    /**
     * 设置segmentIDRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SegmentIDRefType }
     *     
     */
    public void setSegmentIDRef(SegmentIDRefType value) {
        this.segmentIDRef = value;
    }

    /**
     * 获取priceClass属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPriceClass() {
        return priceClass;
    }

    /**
     * 设置priceClass属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPriceClass(String value) {
        this.priceClass = value;
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

}
