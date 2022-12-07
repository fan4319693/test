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
 * Protected data information. Note that although a PlainText mechanism is provided, it is recommended that any information that may be subject to legislative or company mandated initiatives, such as PCI compliance, should be protected.
 * 
 * <p>ProtectedDataType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProtectedDataType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="PlainText" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Protected" type="{http://www.opentravel.org/OTA/2003/05}ProtectedDataDetailType"/>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProtectedDataType", propOrder = {
    "plainText",
    "_protected"
})
public class ProtectedDataType {

    @XmlElement(name = "PlainText")
    protected String plainText;
    @XmlElement(name = "Protected")
    protected ProtectedDataDetailType _protected;

    /**
     * 获取plainText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlainText() {
        return plainText;
    }

    /**
     * 设置plainText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlainText(String value) {
        this.plainText = value;
    }

    /**
     * 获取protected属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProtectedDataDetailType }
     *     
     */
    public ProtectedDataDetailType getProtected() {
        return _protected;
    }

    /**
     * 设置protected属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProtectedDataDetailType }
     *     
     */
    public void setProtected(ProtectedDataDetailType value) {
        this._protected = value;
    }

}
