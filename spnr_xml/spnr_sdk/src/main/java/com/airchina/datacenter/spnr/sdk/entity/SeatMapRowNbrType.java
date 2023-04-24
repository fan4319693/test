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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Aircraft seat row with seat map ghost row metadata definition.
 * 
 * <p>SeatMapRowNbrType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SeatMapRowNbrType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>AirRowNbrType">
 *       &lt;attribute name="RowSuffix">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[A-Z]{1}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="RowPos">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;enumeration value="BACK"/>
 *             &lt;enumeration value="FRONT"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SeatMapRowNbrType", propOrder = {
    "value"
})
public class SeatMapRowNbrType {

    @XmlValue
    protected int value;
    @XmlAttribute(name = "RowSuffix")
    protected String rowSuffix;
    @XmlAttribute(name = "RowPos")
    protected String rowPos;

    /**
     * Aircraft row number.
     * 
     */
    public int getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     */
    public void setValue(int value) {
        this.value = value;
    }

    /**
     * 获取rowSuffix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowSuffix() {
        return rowSuffix;
    }

    /**
     * 设置rowSuffix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowSuffix(String value) {
        this.rowSuffix = value;
    }

    /**
     * 获取rowPos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRowPos() {
        return rowPos;
    }

    /**
     * 设置rowPos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRowPos(String value) {
        this.rowPos = value;
    }

}
