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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Advisory information that applies to all the rule information.
 * 
 * <p>PenaltyStayInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PenaltyStayInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="MaximumStay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="MinimumStay" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="StayRestrictionsInd" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PenaltyStayInfoType")
public class PenaltyStayInfoType {

    @XmlAttribute(name = "MaximumStay")
    @XmlSchemaType(name = "anySimpleType")
    protected String maximumStay;
    @XmlAttribute(name = "MinimumStay")
    @XmlSchemaType(name = "anySimpleType")
    protected String minimumStay;
    @XmlAttribute(name = "StayRestrictionsInd")
    @XmlSchemaType(name = "anySimpleType")
    protected String stayRestrictionsInd;

    /**
     * 获取maximumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaximumStay() {
        return maximumStay;
    }

    /**
     * 设置maximumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaximumStay(String value) {
        this.maximumStay = value;
    }

    /**
     * 获取minimumStay属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMinimumStay() {
        return minimumStay;
    }

    /**
     * 设置minimumStay属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMinimumStay(String value) {
        this.minimumStay = value;
    }

    /**
     * 获取stayRestrictionsInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStayRestrictionsInd() {
        return stayRestrictionsInd;
    }

    /**
     * 设置stayRestrictionsInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStayRestrictionsInd(String value) {
        this.stayRestrictionsInd = value;
    }

}
