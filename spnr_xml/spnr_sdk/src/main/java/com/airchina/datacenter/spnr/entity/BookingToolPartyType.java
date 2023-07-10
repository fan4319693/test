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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Booking Tool or Sub-Account information.
 * 
 * <p>BookingToolPartyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookingToolPartyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="AccountUserInfo">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AccountUserID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="AccountID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingToolPartyType", propOrder = {
    "accountUserInfo"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.SaleInfoType.Identification.RequestorInfo.AccountInfo.class
})
public class BookingToolPartyType {

    @XmlElement(name = "AccountUserInfo")
    protected BookingToolPartyType.AccountUserInfo accountUserInfo;
    @XmlAttribute(name = "AccountID", required = true)
    protected String accountID;

    /**
     * 获取accountUserInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingToolPartyType.AccountUserInfo }
     *     
     */
    public BookingToolPartyType.AccountUserInfo getAccountUserInfo() {
        return accountUserInfo;
    }

    /**
     * 设置accountUserInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingToolPartyType.AccountUserInfo }
     *     
     */
    public void setAccountUserInfo(BookingToolPartyType.AccountUserInfo value) {
        this.accountUserInfo = value;
    }

    /**
     * 获取accountID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccountID() {
        return accountID;
    }

    /**
     * 设置accountID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccountID(String value) {
        this.accountID = value;
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
     *       &lt;attribute name="AccountUserID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccountUserInfo {

        @XmlAttribute(name = "AccountUserID", required = true)
        protected String accountUserID;

        /**
         * 获取accountUserID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountUserID() {
            return accountUserID;
        }

        /**
         * 设置accountUserID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountUserID(String value) {
            this.accountUserID = value;
        }

    }

}
