//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>BookingOfficeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookingOfficeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Names">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Phones">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Emails">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contacts">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Contact">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="SupplierNotification" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence minOccurs="0">
 *                   &lt;element name="Phones" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Emails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contract" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ContactInfos">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="PaymentDetails" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="PaymentDetail">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="BankAcct">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="Currency">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                       &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
 *                                       &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
 *                                       &lt;element name="AgressoExtraFields">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                               &lt;sequence>
 *                                                 &lt;element name="PaymentTerm">
 *                                                   &lt;complexType>
 *                                                     &lt;complexContent>
 *                                                       &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                                         &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                                       &lt;/restriction>
 *                                                     &lt;/complexContent>
 *                                                   &lt;/complexType>
 *                                                 &lt;/element>
 *                                               &lt;/sequence>
 *                                               &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                               &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                             &lt;/restriction>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Code">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="1"/>
 *             &lt;maxLength value="20"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingOfficeType", propOrder = {
    "addresses",
    "names",
    "phones",
    "emails",
    "contacts",
    "supplierNotification",
    "contract"
})
public class BookingOfficeType {

    @XmlElement(name = "Addresses", required = true)
    protected BookingOfficeType.Addresses addresses;
    @XmlElement(name = "Names", required = true)
    protected BookingOfficeType.Names names;
    @XmlElement(name = "Phones", required = true)
    protected BookingOfficeType.Phones phones;
    @XmlElement(name = "Emails", required = true)
    protected BookingOfficeType.Emails emails;
    @XmlElement(name = "Contacts", required = true)
    protected BookingOfficeType.Contacts contacts;
    @XmlElement(name = "SupplierNotification")
    protected BookingOfficeType.SupplierNotification supplierNotification;
    @XmlElement(name = "Contract")
    protected BookingOfficeType.Contract contract;
    @XmlAttribute(name = "Code")
    protected String code;

    /**
     * 获取addresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Addresses }
     *     
     */
    public BookingOfficeType.Addresses getAddresses() {
        return addresses;
    }

    /**
     * 设置addresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Addresses }
     *     
     */
    public void setAddresses(BookingOfficeType.Addresses value) {
        this.addresses = value;
    }

    /**
     * 获取names属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Names }
     *     
     */
    public BookingOfficeType.Names getNames() {
        return names;
    }

    /**
     * 设置names属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Names }
     *     
     */
    public void setNames(BookingOfficeType.Names value) {
        this.names = value;
    }

    /**
     * 获取phones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Phones }
     *     
     */
    public BookingOfficeType.Phones getPhones() {
        return phones;
    }

    /**
     * 设置phones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Phones }
     *     
     */
    public void setPhones(BookingOfficeType.Phones value) {
        this.phones = value;
    }

    /**
     * 获取emails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Emails }
     *     
     */
    public BookingOfficeType.Emails getEmails() {
        return emails;
    }

    /**
     * 设置emails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Emails }
     *     
     */
    public void setEmails(BookingOfficeType.Emails value) {
        this.emails = value;
    }

    /**
     * 获取contacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Contacts }
     *     
     */
    public BookingOfficeType.Contacts getContacts() {
        return contacts;
    }

    /**
     * 设置contacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Contacts }
     *     
     */
    public void setContacts(BookingOfficeType.Contacts value) {
        this.contacts = value;
    }

    /**
     * 获取supplierNotification属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.SupplierNotification }
     *     
     */
    public BookingOfficeType.SupplierNotification getSupplierNotification() {
        return supplierNotification;
    }

    /**
     * 设置supplierNotification属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.SupplierNotification }
     *     
     */
    public void setSupplierNotification(BookingOfficeType.SupplierNotification value) {
        this.supplierNotification = value;
    }

    /**
     * 获取contract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BookingOfficeType.Contract }
     *     
     */
    public BookingOfficeType.Contract getContract() {
        return contract;
    }

    /**
     * 设置contract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BookingOfficeType.Contract }
     *     
     */
    public void setContract(BookingOfficeType.Contract value) {
        this.contract = value;
    }

    /**
     * 获取code属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode() {
        return code;
    }

    /**
     * 设置code属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode(String value) {
        this.code = value;
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
     *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}Address" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", required = true)
        protected List<Address> address;

        /**
         * Gets the value of the address property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the address property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAddress().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Address }
         * 
         * 
         */
        public List<Address> getAddress() {
            if (address == null) {
                address = new ArrayList<Address>();
            }
            return this.address;
        }

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
     *         &lt;element name="Contact">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "contact"
    })
    public static class Contacts {

        @XmlElement(name = "Contact", required = true)
        protected BookingOfficeType.Contacts.Contact contact;

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.Contacts.Contact }
         *     
         */
        public BookingOfficeType.Contacts.Contact getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.Contacts.Contact }
         *     
         */
        public void setContact(BookingOfficeType.Contacts.Contact value) {
            this.contact = value;
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
         *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Contact {

            @XmlAttribute(name = "FullName")
            protected String fullName;

            /**
             * 获取fullName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * 设置fullName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

        }

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
     *         &lt;element name="ContactInfos">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="PaymentDetails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="PaymentDetail">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="BankAcct">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="Currency">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                             &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
     *                             &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
     *                             &lt;element name="AgressoExtraFields">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                     &lt;sequence>
     *                                       &lt;element name="PaymentTerm">
     *                                         &lt;complexType>
     *                                           &lt;complexContent>
     *                                             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                                               &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                             &lt;/restriction>
     *                                           &lt;/complexContent>
     *                                         &lt;/complexType>
     *                                       &lt;/element>
     *                                     &lt;/sequence>
     *                                     &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                     &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                                   &lt;/restriction>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                           &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
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
    @XmlType(name = "", propOrder = {
        "contactInfos",
        "paymentDetails"
    })
    public static class Contract {

        @XmlElement(name = "ContactInfos", required = true)
        protected BookingOfficeType.Contract.ContactInfos contactInfos;
        @XmlElement(name = "PaymentDetails")
        protected BookingOfficeType.Contract.PaymentDetails paymentDetails;

        /**
         * 获取contactInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.Contract.ContactInfos }
         *     
         */
        public BookingOfficeType.Contract.ContactInfos getContactInfos() {
            return contactInfos;
        }

        /**
         * 设置contactInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.Contract.ContactInfos }
         *     
         */
        public void setContactInfos(BookingOfficeType.Contract.ContactInfos value) {
            this.contactInfos = value;
        }

        /**
         * 获取paymentDetails属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.Contract.PaymentDetails }
         *     
         */
        public BookingOfficeType.Contract.PaymentDetails getPaymentDetails() {
            return paymentDetails;
        }

        /**
         * 设置paymentDetails属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.Contract.PaymentDetails }
         *     
         */
        public void setPaymentDetails(BookingOfficeType.Contract.PaymentDetails value) {
            this.paymentDetails = value;
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
         *         &lt;element name="ContactInfo" type="{http://www.opentravel.org/OTA/2003/05}ContactInfo" maxOccurs="2"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "contactInfo"
        })
        public static class ContactInfos {

            @XmlElement(name = "ContactInfo", required = true)
            protected List<ContactInfo> contactInfo;

            /**
             * Gets the value of the contactInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the contactInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getContactInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ContactInfo }
             * 
             * 
             */
            public List<ContactInfo> getContactInfo() {
                if (contactInfo == null) {
                    contactInfo = new ArrayList<ContactInfo>();
                }
                return this.contactInfo;
            }

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
         *         &lt;element name="PaymentDetail">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="BankAcct">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="Currency">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                   &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
         *                   &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
         *                   &lt;element name="AgressoExtraFields">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                           &lt;sequence>
         *                             &lt;element name="PaymentTerm">
         *                               &lt;complexType>
         *                                 &lt;complexContent>
         *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                                     &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                                   &lt;/restriction>
         *                                 &lt;/complexContent>
         *                               &lt;/complexType>
         *                             &lt;/element>
         *                           &lt;/sequence>
         *                           &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                           &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                         &lt;/restriction>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
        @XmlType(name = "", propOrder = {
            "paymentDetail"
        })
        public static class PaymentDetails {

            @XmlElement(name = "PaymentDetail", required = true)
            protected BookingOfficeType.Contract.PaymentDetails.PaymentDetail paymentDetail;

            /**
             * 获取paymentDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail }
             *     
             */
            public BookingOfficeType.Contract.PaymentDetails.PaymentDetail getPaymentDetail() {
                return paymentDetail;
            }

            /**
             * 设置paymentDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail }
             *     
             */
            public void setPaymentDetail(BookingOfficeType.Contract.PaymentDetails.PaymentDetail value) {
                this.paymentDetail = value;
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
             *         &lt;element name="BankAcct">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="BankAccName" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="Currency">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *         &lt;element name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anyType"/>
             *         &lt;element name="BankAddress" type="{http://www.opentravel.org/OTA/2003/05}Address"/>
             *         &lt;element name="AgressoExtraFields">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                 &lt;sequence>
             *                   &lt;element name="PaymentTerm">
             *                     &lt;complexType>
             *                       &lt;complexContent>
             *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
             *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                         &lt;/restriction>
             *                       &lt;/complexContent>
             *                     &lt;/complexType>
             *                   &lt;/element>
             *                 &lt;/sequence>
             *                 &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *                 &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *               &lt;/restriction>
             *             &lt;/complexContent>
             *           &lt;/complexType>
             *         &lt;/element>
             *       &lt;/sequence>
             *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "bankAcct",
                "bankAccName",
                "currency",
                "paymentType",
                "bankAddress",
                "agressoExtraFields"
            })
            public static class PaymentDetail {

                @XmlElement(name = "BankAcct", required = true)
                protected BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct bankAcct;
                @XmlElement(name = "BankAccName", required = true)
                protected Object bankAccName;
                @XmlElement(name = "Currency", required = true)
                protected BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency currency;
                @XmlElement(name = "PaymentType", required = true)
                protected Object paymentType;
                @XmlElement(name = "BankAddress", required = true)
                protected Address bankAddress;
                @XmlElement(name = "AgressoExtraFields", required = true)
                protected BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields agressoExtraFields;
                @XmlAttribute(name = "Code", required = true)
                protected int code;

                /**
                 * 获取bankAcct属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct }
                 *     
                 */
                public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct getBankAcct() {
                    return bankAcct;
                }

                /**
                 * 设置bankAcct属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct }
                 *     
                 */
                public void setBankAcct(BookingOfficeType.Contract.PaymentDetails.PaymentDetail.BankAcct value) {
                    this.bankAcct = value;
                }

                /**
                 * 获取bankAccName属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getBankAccName() {
                    return bankAccName;
                }

                /**
                 * 设置bankAccName属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setBankAccName(Object value) {
                    this.bankAccName = value;
                }

                /**
                 * 获取currency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency }
                 *     
                 */
                public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency getCurrency() {
                    return currency;
                }

                /**
                 * 设置currency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency }
                 *     
                 */
                public void setCurrency(BookingOfficeType.Contract.PaymentDetails.PaymentDetail.Currency value) {
                    this.currency = value;
                }

                /**
                 * 获取paymentType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Object }
                 *     
                 */
                public Object getPaymentType() {
                    return paymentType;
                }

                /**
                 * 设置paymentType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Object }
                 *     
                 */
                public void setPaymentType(Object value) {
                    this.paymentType = value;
                }

                /**
                 * 获取bankAddress属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Address }
                 *     
                 */
                public Address getBankAddress() {
                    return bankAddress;
                }

                /**
                 * 设置bankAddress属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Address }
                 *     
                 */
                public void setBankAddress(Address value) {
                    this.bankAddress = value;
                }

                /**
                 * 获取agressoExtraFields属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
                 *     
                 */
                public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields getAgressoExtraFields() {
                    return agressoExtraFields;
                }

                /**
                 * 设置agressoExtraFields属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields }
                 *     
                 */
                public void setAgressoExtraFields(BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields value) {
                    this.agressoExtraFields = value;
                }

                /**
                 * 获取code属性的值。
                 * 
                 */
                public int getCode() {
                    return code;
                }

                /**
                 * 设置code属性的值。
                 * 
                 */
                public void setCode(int value) {
                    this.code = value;
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
                 *         &lt;element name="PaymentTerm">
                 *           &lt;complexType>
                 *             &lt;complexContent>
                 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
                 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *               &lt;/restriction>
                 *             &lt;/complexContent>
                 *           &lt;/complexType>
                 *         &lt;/element>
                 *       &lt;/sequence>
                 *       &lt;attribute name="HandOffCurrency" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="HandOffRouting" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="PaymentMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="PaymentType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="RemittanceVia" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "", propOrder = {
                    "paymentTerm"
                })
                public static class AgressoExtraFields {

                    @XmlElement(name = "PaymentTerm", required = true)
                    protected BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm paymentTerm;
                    @XmlAttribute(name = "HandOffCurrency")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String handOffCurrency;
                    @XmlAttribute(name = "HandOffRouting")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String handOffRouting;
                    @XmlAttribute(name = "PaymentMethod")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String paymentMethod;
                    @XmlAttribute(name = "PaymentType")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String paymentType;
                    @XmlAttribute(name = "RemittanceVia")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String remittanceVia;

                    /**
                     * 获取paymentTerm属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
                     *     
                     */
                    public BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm getPaymentTerm() {
                        return paymentTerm;
                    }

                    /**
                     * 设置paymentTerm属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm }
                     *     
                     */
                    public void setPaymentTerm(BookingOfficeType.Contract.PaymentDetails.PaymentDetail.AgressoExtraFields.PaymentTerm value) {
                        this.paymentTerm = value;
                    }

                    /**
                     * 获取handOffCurrency属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHandOffCurrency() {
                        return handOffCurrency;
                    }

                    /**
                     * 设置handOffCurrency属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHandOffCurrency(String value) {
                        this.handOffCurrency = value;
                    }

                    /**
                     * 获取handOffRouting属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getHandOffRouting() {
                        return handOffRouting;
                    }

                    /**
                     * 设置handOffRouting属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setHandOffRouting(String value) {
                        this.handOffRouting = value;
                    }

                    /**
                     * 获取paymentMethod属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentMethod() {
                        return paymentMethod;
                    }

                    /**
                     * 设置paymentMethod属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentMethod(String value) {
                        this.paymentMethod = value;
                    }

                    /**
                     * 获取paymentType属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPaymentType() {
                        return paymentType;
                    }

                    /**
                     * 设置paymentType属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPaymentType(String value) {
                        this.paymentType = value;
                    }

                    /**
                     * 获取remittanceVia属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getRemittanceVia() {
                        return remittanceVia;
                    }

                    /**
                     * 设置remittanceVia属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setRemittanceVia(String value) {
                        this.remittanceVia = value;
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
                     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                     *     &lt;/restriction>
                     *   &lt;/complexContent>
                     * &lt;/complexType>
                     * </pre>
                     * 
                     * 
                     */
                    @XmlAccessorType(XmlAccessType.FIELD)
                    @XmlType(name = "")
                    public static class PaymentTerm {

                        @XmlAttribute(name = "Type")
                        @XmlSchemaType(name = "anySimpleType")
                        protected String type;

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

                    }

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
                 *       &lt;attribute name="BankAcctNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="BankName" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="IBAN" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="SortCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *       &lt;attribute name="SwiftCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class BankAcct {

                    @XmlAttribute(name = "BankAcctNumber")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String bankAcctNumber;
                    @XmlAttribute(name = "BankName")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String bankName;
                    @XmlAttribute(name = "IBAN")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String iban;
                    @XmlAttribute(name = "SortCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String sortCode;
                    @XmlAttribute(name = "SwiftCode")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String swiftCode;

                    /**
                     * 获取bankAcctNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankAcctNumber() {
                        return bankAcctNumber;
                    }

                    /**
                     * 设置bankAcctNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankAcctNumber(String value) {
                        this.bankAcctNumber = value;
                    }

                    /**
                     * 获取bankName属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getBankName() {
                        return bankName;
                    }

                    /**
                     * 设置bankName属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setBankName(String value) {
                        this.bankName = value;
                    }

                    /**
                     * 获取iban属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getIBAN() {
                        return iban;
                    }

                    /**
                     * 设置iban属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setIBAN(String value) {
                        this.iban = value;
                    }

                    /**
                     * 获取sortCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSortCode() {
                        return sortCode;
                    }

                    /**
                     * 设置sortCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSortCode(String value) {
                        this.sortCode = value;
                    }

                    /**
                     * 获取swiftCode属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSwiftCode() {
                        return swiftCode;
                    }

                    /**
                     * 设置swiftCode属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSwiftCode(String value) {
                        this.swiftCode = value;
                    }

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
                 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
                 *     &lt;/restriction>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Currency {

                    @XmlAttribute(name = "Code")
                    @XmlSchemaType(name = "anySimpleType")
                    protected String code;

                    /**
                     * 获取code属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * 设置code属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                }

            }

        }

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
     *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "email"
    })
    public static class Emails {

        @XmlElement(name = "Email", required = true)
        protected String email;

        /**
         * 获取email属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEmail() {
            return email;
        }

        /**
         * 设置email属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEmail(String value) {
            this.email = value;
        }

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
     *         &lt;element name="Name">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
    @XmlType(name = "", propOrder = {
        "name"
    })
    public static class Names {

        @XmlElement(name = "Name", required = true)
        protected BookingOfficeType.Names.Name name;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.Names.Name }
         *     
         */
        public BookingOfficeType.Names.Name getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.Names.Name }
         *     
         */
        public void setName(BookingOfficeType.Names.Name value) {
            this.name = value;
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
         *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Name {

            @XmlAttribute(name = "FullName")
            protected String fullName;

            /**
             * 获取fullName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFullName() {
                return fullName;
            }

            /**
             * 设置fullName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFullName(String value) {
                this.fullName = value;
            }

        }

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
     *         &lt;element name="Phone" type="{http://www.opentravel.org/OTA/2003/05}Phone" maxOccurs="unbounded"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phone"
    })
    public static class Phones {

        @XmlElement(name = "Phone", required = true)
        protected List<Phone> phone;

        /**
         * Gets the value of the phone property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the phone property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPhone().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link Phone }
         * 
         * 
         */
        public List<Phone> getPhone() {
            if (phone == null) {
                phone = new ArrayList<Phone>();
            }
            return this.phone;
        }

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
     *       &lt;sequence minOccurs="0">
     *         &lt;element name="Phones" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Emails" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PreferredMethod" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "phones",
        "emails"
    })
    public static class SupplierNotification {

        @XmlElement(name = "Phones")
        protected BookingOfficeType.SupplierNotification.Phones phones;
        @XmlElement(name = "Emails")
        protected BookingOfficeType.SupplierNotification.Emails emails;
        @XmlAttribute(name = "PreferredMethod")
        @XmlSchemaType(name = "anySimpleType")
        protected String preferredMethod;

        /**
         * 获取phones属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.SupplierNotification.Phones }
         *     
         */
        public BookingOfficeType.SupplierNotification.Phones getPhones() {
            return phones;
        }

        /**
         * 设置phones属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.SupplierNotification.Phones }
         *     
         */
        public void setPhones(BookingOfficeType.SupplierNotification.Phones value) {
            this.phones = value;
        }

        /**
         * 获取emails属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BookingOfficeType.SupplierNotification.Emails }
         *     
         */
        public BookingOfficeType.SupplierNotification.Emails getEmails() {
            return emails;
        }

        /**
         * 设置emails属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BookingOfficeType.SupplierNotification.Emails }
         *     
         */
        public void setEmails(BookingOfficeType.SupplierNotification.Emails value) {
            this.emails = value;
        }

        /**
         * 获取preferredMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPreferredMethod() {
            return preferredMethod;
        }

        /**
         * 设置preferredMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPreferredMethod(String value) {
            this.preferredMethod = value;
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
         *         &lt;element name="Email" type="{http://www.w3.org/2001/XMLSchema}string"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "email"
        })
        public static class Emails {

            @XmlElement(name = "Email", required = true)
            protected String email;

            /**
             * 获取email属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEmail() {
                return email;
            }

            /**
             * 设置email属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEmail(String value) {
                this.email = value;
            }

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
         *         &lt;element name="Phones" type="{http://www.opentravel.org/OTA/2003/05}Phone"/>
         *       &lt;/sequence>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "phones"
        })
        public static class Phones {

            @XmlElement(name = "Phones", required = true)
            protected Phone phones;

            /**
             * 获取phones属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Phone }
             *     
             */
            public Phone getPhones() {
                return phones;
            }

            /**
             * 设置phones属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Phone }
             *     
             */
            public void setPhones(Phone value) {
                this.phones = value;
            }

        }

    }

}
