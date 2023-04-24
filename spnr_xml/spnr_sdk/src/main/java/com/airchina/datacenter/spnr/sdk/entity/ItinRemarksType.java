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
 * This records Itinerary remarks. This was necessary because TS will solely use OJ_SuperPNR/Remarks for recording the Refund process.
 * 
 * <p>ItinRemarksType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItinRemarksType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ItinRemark" type="{http://www.opentravel.org/OTA/2003/05}ItinRemarkType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ItinRemarksType", propOrder = {
    "itinRemark"
})
public class ItinRemarksType {

    @XmlElement(name = "ItinRemark")
    protected List<ItinRemarkType> itinRemark;

    /**
     * Gets the value of the itinRemark property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the itinRemark property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItinRemark().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ItinRemarkType }
     * 
     * 
     */
    public List<ItinRemarkType> getItinRemark() {
        if (itinRemark == null) {
            itinRemark = new ArrayList<ItinRemarkType>();
        }
        return this.itinRemark;
    }

}