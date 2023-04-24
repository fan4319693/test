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
 * <p>ContactInfo complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactInfo">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Addresses">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Address">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Address">
 *                           &lt;attribute name="UseType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
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
 *         &lt;element name="Phones" minOccurs="0">
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
@XmlType(name = "ContactInfo", propOrder = {
    "addresses",
    "names",
    "phones",
    "emails",
    "contacts"
})
public class ContactInfo {

    @XmlElement(name = "Addresses", required = true)
    protected ContactInfo.Addresses addresses;
    @XmlElement(name = "Names", required = true)
    protected ContactInfo.Names names;
    @XmlElement(name = "Phones")
    protected ContactInfo.Phones phones;
    @XmlElement(name = "Emails")
    protected ContactInfo.Emails emails;
    @XmlElement(name = "Contacts", required = true)
    protected ContactInfo.Contacts contacts;
    @XmlAttribute(name = "Code", required = true)
    protected int code;

    /**
     * 获取addresses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo.Addresses }
     *     
     */
    public ContactInfo.Addresses getAddresses() {
        return addresses;
    }

    /**
     * 设置addresses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo.Addresses }
     *     
     */
    public void setAddresses(ContactInfo.Addresses value) {
        this.addresses = value;
    }

    /**
     * 获取names属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo.Names }
     *     
     */
    public ContactInfo.Names getNames() {
        return names;
    }

    /**
     * 设置names属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo.Names }
     *     
     */
    public void setNames(ContactInfo.Names value) {
        this.names = value;
    }

    /**
     * 获取phones属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo.Phones }
     *     
     */
    public ContactInfo.Phones getPhones() {
        return phones;
    }

    /**
     * 设置phones属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo.Phones }
     *     
     */
    public void setPhones(ContactInfo.Phones value) {
        this.phones = value;
    }

    /**
     * 获取emails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo.Emails }
     *     
     */
    public ContactInfo.Emails getEmails() {
        return emails;
    }

    /**
     * 设置emails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo.Emails }
     *     
     */
    public void setEmails(ContactInfo.Emails value) {
        this.emails = value;
    }

    /**
     * 获取contacts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ContactInfo.Contacts }
     *     
     */
    public ContactInfo.Contacts getContacts() {
        return contacts;
    }

    /**
     * 设置contacts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ContactInfo.Contacts }
     *     
     */
    public void setContacts(ContactInfo.Contacts value) {
        this.contacts = value;
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
     *         &lt;element name="Address">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Address">
     *                 &lt;attribute name="UseType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
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
    @XmlType(name = "", propOrder = {
        "address"
    })
    public static class Addresses {

        @XmlElement(name = "Address", required = true)
        protected ContactInfo.Addresses.Address address;

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfo.Addresses.Address }
         *     
         */
        public ContactInfo.Addresses.Address getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfo.Addresses.Address }
         *     
         */
        public void setAddress(ContactInfo.Addresses.Address value) {
            this.address = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}Address">
         *       &lt;attribute name="UseType" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Address
            extends com.airchina.datacenter.spnr.sdk.entity.Address
        {

            @XmlAttribute(name = "UseType", required = true)
            protected int useType;

            /**
             * 获取useType属性的值。
             * 
             */
            public int getUseType() {
                return useType;
            }

            /**
             * 设置useType属性的值。
             * 
             */
            public void setUseType(int value) {
                this.useType = value;
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
        protected ContactInfo.Contacts.Contact contact;

        /**
         * 获取contact属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfo.Contacts.Contact }
         *     
         */
        public ContactInfo.Contacts.Contact getContact() {
            return contact;
        }

        /**
         * 设置contact属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfo.Contacts.Contact }
         *     
         */
        public void setContact(ContactInfo.Contacts.Contact value) {
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
        protected ContactInfo.Names.Name name;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ContactInfo.Names.Name }
         *     
         */
        public ContactInfo.Names.Name getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ContactInfo.Names.Name }
         *     
         */
        public void setName(ContactInfo.Names.Name value) {
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

}
