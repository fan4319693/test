//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAnyElement;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>ItemsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ItemsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Item" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;any/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="SequenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Work" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Working" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                 &lt;attribute name="Urgent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProductHistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="ModificationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
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
@XmlType(name = "ItemsType", propOrder = {
    "item"
})
public class ItemsType {

    @XmlElement(name = "Item")
    protected List<ItemsType.Item> item;

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
     * {@link ItemsType.Item }
     * 
     * 
     */
    public List<ItemsType.Item> getItem() {
        if (item == null) {
            item = new ArrayList<ItemsType.Item>();
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;any/>
     *       &lt;/sequence>
     *       &lt;attribute name="ItemID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="AccessTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="SequenceID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Work" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Working" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="CreatedTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *       &lt;attribute name="Urgent" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductHistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="ModificationID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "any"
    })
    public static class Item {

        @XmlAnyElement(lax = true)
        protected Object any;
        @XmlAttribute(name = "ItemID", required = true)
        protected String itemID;
        @XmlAttribute(name = "AccessTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar accessTime;
        @XmlAttribute(name = "SequenceID")
        protected String sequenceID;
        @XmlAttribute(name = "Work")
        protected Boolean work;
        @XmlAttribute(name = "Working")
        protected Boolean working;
        @XmlAttribute(name = "CreatedTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar createdTime;
        @XmlAttribute(name = "Urgent")
        protected String urgent;
        @XmlAttribute(name = "ProductHistoryID")
        protected BigInteger productHistoryID;
        @XmlAttribute(name = "ModificationID")
        protected String modificationID;

        /**
         * 获取any属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Object }
         *     
         */
        public Object getAny() {
            return any;
        }

        /**
         * 设置any属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Object }
         *     
         */
        public void setAny(Object value) {
            this.any = value;
        }

        /**
         * 获取itemID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getItemID() {
            return itemID;
        }

        /**
         * 设置itemID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setItemID(String value) {
            this.itemID = value;
        }

        /**
         * 获取accessTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getAccessTime() {
            return accessTime;
        }

        /**
         * 设置accessTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setAccessTime(XMLGregorianCalendar value) {
            this.accessTime = value;
        }

        /**
         * 获取sequenceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceID() {
            return sequenceID;
        }

        /**
         * 设置sequenceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceID(String value) {
            this.sequenceID = value;
        }

        /**
         * 获取work属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWork() {
            return work;
        }

        /**
         * 设置work属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWork(Boolean value) {
            this.work = value;
        }

        /**
         * 获取working属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isWorking() {
            return working;
        }

        /**
         * 设置working属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setWorking(Boolean value) {
            this.working = value;
        }

        /**
         * 获取createdTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCreatedTime() {
            return createdTime;
        }

        /**
         * 设置createdTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCreatedTime(XMLGregorianCalendar value) {
            this.createdTime = value;
        }

        /**
         * 获取urgent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUrgent() {
            return urgent;
        }

        /**
         * 设置urgent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUrgent(String value) {
            this.urgent = value;
        }

        /**
         * 获取productHistoryID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getProductHistoryID() {
            return productHistoryID;
        }

        /**
         * 设置productHistoryID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setProductHistoryID(BigInteger value) {
            this.productHistoryID = value;
        }

        /**
         * 获取modificationID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getModificationID() {
            return modificationID;
        }

        /**
         * 设置modificationID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setModificationID(String value) {
            this.modificationID = value;
        }

    }

}
