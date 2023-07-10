//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BankFavorType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BankFavorType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AddQueryInfo" type="{http://www.opentravel.org/OTA/2003/05}AddQueryInfoType" minOccurs="0"/>
 *         &lt;element name="BankFavorInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="BankFavorInfo" type="{http://www.opentravel.org/OTA/2003/05}BankFavorInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CountRecord" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="PageRecord" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="CurrPage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BankFavorType", propOrder = {
    "addQueryInfo",
    "bankFavorInfos",
    "tpaExtensions"
})
public class BankFavorType {

    @XmlElement(name = "AddQueryInfo")
    protected AddQueryInfoType addQueryInfo;
    @XmlElement(name = "BankFavorInfos")
    protected BankFavorType.BankFavorInfos bankFavorInfos;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlAttribute(name = "Type")
    @XmlSchemaType(name = "anySimpleType")
    protected String type;

    /**
     * 获取addQueryInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddQueryInfoType }
     *     
     */
    public AddQueryInfoType getAddQueryInfo() {
        return addQueryInfo;
    }

    /**
     * 设置addQueryInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddQueryInfoType }
     *     
     */
    public void setAddQueryInfo(AddQueryInfoType value) {
        this.addQueryInfo = value;
    }

    /**
     * 获取bankFavorInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BankFavorType.BankFavorInfos }
     *     
     */
    public BankFavorType.BankFavorInfos getBankFavorInfos() {
        return bankFavorInfos;
    }

    /**
     * 设置bankFavorInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BankFavorType.BankFavorInfos }
     *     
     */
    public void setBankFavorInfos(BankFavorType.BankFavorInfos value) {
        this.bankFavorInfos = value;
    }

    /**
     * 获取tpaExtensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TPAExtensionsType }
     *     
     */
    public TPAExtensionsType getTPAExtensions() {
        return tpaExtensions;
    }

    /**
     * 设置tpaExtensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TPAExtensionsType }
     *     
     */
    public void setTPAExtensions(TPAExtensionsType value) {
        this.tpaExtensions = value;
    }

    /**
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setType(String value) {
        this.type = value;
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
     *         &lt;element name="BankFavorInfo" type="{http://www.opentravel.org/OTA/2003/05}BankFavorInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CountRecord" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="PageRecord" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="CurrPage" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "bankFavorInfo"
    })
    public static class BankFavorInfos {

        @XmlElement(name = "BankFavorInfo")
        protected List<BankFavorInfoType> bankFavorInfo;
        @XmlAttribute(name = "CountRecord")
        @XmlSchemaType(name = "anySimpleType")
        protected String countRecord;
        @XmlAttribute(name = "PageRecord")
        @XmlSchemaType(name = "anySimpleType")
        protected String pageRecord;
        @XmlAttribute(name = "CurrPage")
        @XmlSchemaType(name = "anySimpleType")
        protected String currPage;

        /**
         * Gets the value of the bankFavorInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bankFavorInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBankFavorInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link BankFavorInfoType }
         * 
         * 
         */
        public List<BankFavorInfoType> getBankFavorInfo() {
            if (bankFavorInfo == null) {
                bankFavorInfo = new ArrayList<BankFavorInfoType>();
            }
            return this.bankFavorInfo;
        }

        /**
         * 获取countRecord属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountRecord() {
            return countRecord;
        }

        /**
         * 设置countRecord属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountRecord(String value) {
            this.countRecord = value;
        }

        /**
         * 获取pageRecord属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPageRecord() {
            return pageRecord;
        }

        /**
         * 设置pageRecord属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPageRecord(String value) {
            this.pageRecord = value;
        }

        /**
         * 获取currPage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrPage() {
            return currPage;
        }

        /**
         * 设置currPage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrPage(String value) {
            this.currPage = value;
        }

    }

}
