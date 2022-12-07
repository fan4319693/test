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
 * A full definition of a travel segment including supplemental price and facilities.
 * 
 * <p>PkgTravelSegment complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PkgTravelSegment">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSegment" type="{http://www.opentravel.org/OTA/2003/05}PkgAirSegmentType"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PkgTravelSegment", propOrder = {
    "airSegment"
})
public class PkgTravelSegment {

    @XmlElement(name = "AirSegment", required = true)
    protected PkgAirSegmentType airSegment;

    /**
     * 获取airSegment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public PkgAirSegmentType getAirSegment() {
        return airSegment;
    }

    /**
     * 设置airSegment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PkgAirSegmentType }
     *     
     */
    public void setAirSegment(PkgAirSegmentType value) {
        this.airSegment = value;
    }

}
