//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Review question categories
 * 
 * <p>List_QuestionCategory complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="List_QuestionCategory">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="List" type="{http://www.opentravel.org/OTA/2003/05}List_QuestionCategory_Base"/>
 *         &lt;element name="Extension" type="{http://www.opentravel.org/OTA/2003/05}CodeListSummaryExtension" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "List_QuestionCategory", propOrder = {
    "list",
    "extension"
})
public class ListQuestionCategory {

    @XmlElement(name = "List", required = true)
    @XmlSchemaType(name = "string")
    protected ListQuestionCategoryBase list;
    @XmlElement(name = "Extension")
    protected CodeListSummaryExtension extension;

    /**
     * 获取list属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ListQuestionCategoryBase }
     *     
     */
    public ListQuestionCategoryBase getList() {
        return list;
    }

    /**
     * 设置list属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ListQuestionCategoryBase }
     *     
     */
    public void setList(ListQuestionCategoryBase value) {
        this.list = value;
    }

    /**
     * 获取extension属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public CodeListSummaryExtension getExtension() {
        return extension;
    }

    /**
     * 设置extension属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListSummaryExtension }
     *     
     */
    public void setExtension(CodeListSummaryExtension value) {
        this.extension = value;
    }

}
