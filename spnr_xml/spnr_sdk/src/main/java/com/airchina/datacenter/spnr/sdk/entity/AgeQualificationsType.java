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
 * A collection of Age Qualifications
 * 
 * <p>AgeQualificationsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AgeQualificationsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AgeQualification" type="{http://www.opentravel.org/OTA/2003/05}AgeQualificationType" maxOccurs="unbounded"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AgeQualificationsType", propOrder = {
    "ageQualification"
})
public class AgeQualificationsType {

    @XmlElement(name = "AgeQualification", required = true)
    protected List<AgeQualificationType> ageQualification;

    /**
     * Gets the value of the ageQualification property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ageQualification property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgeQualification().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgeQualificationType }
     * 
     * 
     */
    public List<AgeQualificationType> getAgeQualification() {
        if (ageQualification == null) {
            ageQualification = new ArrayList<AgeQualificationType>();
        }
        return this.ageQualification;
    }

}
