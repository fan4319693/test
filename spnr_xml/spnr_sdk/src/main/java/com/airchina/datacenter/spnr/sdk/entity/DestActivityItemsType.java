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
import javax.xml.bind.annotation.XmlType;


/**
 * A collection of destination activity items.
 * 
 * <p>DestActivityItemsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DestActivityItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DestActivityItemsType", propOrder = {
    "item"
})
public class DestActivityItemsType {

    @XmlElement(name = "Item", required = true)
    protected List<DestActivityItemsType.Item> item;

    /**
     * Gets the value of the item property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the item property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getItem().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DestActivityItemsType.Item }
     * 
     * 
     */
    public List<DestActivityItemsType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<DestActivityItemsType.Item>();
        }
        return this.item;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ItemType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Item
        extends ItemType
    {

        @XmlAttribute(name = "DocumentationRequired")
        protected String documentationRequired;
        @XmlAttribute(name = "DocReqExclCountries")
        protected List<String> docReqExclCountries;
        @XmlAttribute(name = "DocReqInclCountries")
        protected List<String> docReqInclCountries;

        /**
         * 获取documentationRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentationRequired() {
            return documentationRequired;
        }

        /**
         * 设置documentationRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentationRequired(String value) {
            this.documentationRequired = value;
        }

        /**
         * Gets the value of the docReqExclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqExclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqExclCountries() {
            if (docReqExclCountries == null) {
                docReqExclCountries = new ArrayList<String>();
            }
            return this.docReqExclCountries;
        }

        /**
         * Gets the value of the docReqInclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqInclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqInclCountries() {
            if (docReqInclCountries == null) {
                docReqInclCountries = new ArrayList<String>();
            }
            return this.docReqInclCountries;
        }

    }

}
