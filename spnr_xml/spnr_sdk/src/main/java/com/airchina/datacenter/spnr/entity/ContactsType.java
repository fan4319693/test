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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Provides detailed name information.
 * 
 * <p>ContactsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ContactsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Name" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;sequence>
 *                   &lt;element name="JobTitle" maxOccurs="5" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
 *                           &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                 &lt;attribute name="SrvcCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "ContactsType", propOrder = {
    "name"
})
public class ContactsType {

    @XmlElement(name = "Name", required = true)
    protected List<ContactsType.Name> name;

    /**
     * Gets the value of the name property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the name property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactsType.Name }
     * 
     * 
     */
    public List<ContactsType.Name> getName() {
        if (name == null) {
            name = new ArrayList<ContactsType.Name>();
        }
        return this.name;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;sequence>
     *         &lt;element name="JobTitle" maxOccurs="5" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
     *                 &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *       &lt;attribute name="SrvcCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="CorporatePosition" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OKToPublish" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="NameOrdered" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FullName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ContactName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "jobTitle"
    })
    public static class Name
        extends PersonNameType
    {

        @XmlElement(name = "JobTitle")
        protected List<ContactsType.Name.JobTitle> jobTitle;
        @XmlAttribute(name = "SrvcCode")
        protected String srvcCode;
        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "CorporatePosition")
        protected String corporatePosition;
        @XmlAttribute(name = "OKToPublish")
        protected Boolean okToPublish;
        @XmlAttribute(name = "NameOrdered")
        protected String nameOrdered;
        @XmlAttribute(name = "FullName")
        protected String fullName;
        @XmlAttribute(name = "ContactName")
        protected String contactName;
        @XmlAttribute(name = "CodeDetail")
        protected String codeDetail;
        @XmlAttribute(name = "Removal")
        protected Boolean removal;
        @XmlAttribute(name = "Gender")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String gender;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * Gets the value of the jobTitle property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the jobTitle property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getJobTitle().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ContactsType.Name.JobTitle }
         * 
         * 
         */
        public List<ContactsType.Name.JobTitle> getJobTitle() {
            if (jobTitle == null) {
                jobTitle = new ArrayList<ContactsType.Name.JobTitle>();
            }
            return this.jobTitle;
        }

        /**
         * 获取srvcCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSrvcCode() {
            return srvcCode;
        }

        /**
         * 设置srvcCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSrvcCode(String value) {
            this.srvcCode = value;
        }

        /**
         * 获取location属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * 设置location属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * 获取corporatePosition属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorporatePosition() {
            return corporatePosition;
        }

        /**
         * 设置corporatePosition属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorporatePosition(String value) {
            this.corporatePosition = value;
        }

        /**
         * 获取okToPublish属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isOKToPublish() {
            return okToPublish;
        }

        /**
         * 设置okToPublish属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setOKToPublish(Boolean value) {
            this.okToPublish = value;
        }

        /**
         * 获取nameOrdered属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNameOrdered() {
            return nameOrdered;
        }

        /**
         * 设置nameOrdered属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNameOrdered(String value) {
            this.nameOrdered = value;
        }

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

        /**
         * 获取contactName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getContactName() {
            return contactName;
        }

        /**
         * 设置contactName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setContactName(String value) {
            this.contactName = value;
        }

        /**
         * 获取codeDetail属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeDetail() {
            return codeDetail;
        }

        /**
         * 设置codeDetail属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeDetail(String value) {
            this.codeDetail = value;
        }

        /**
         * 获取removal属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isRemoval() {
            if (removal == null) {
                return false;
            } else {
                return removal;
            }
        }

        /**
         * 设置removal属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRemoval(Boolean value) {
            this.removal = value;
        }

        /**
         * 获取gender属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGender() {
            return gender;
        }

        /**
         * 设置gender属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGender(String value) {
            this.gender = value;
        }

        /**
         * 获取id属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getID() {
            return id;
        }

        /**
         * 设置id属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setID(String value) {
            this.id = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>StringLength1to64">
         *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class JobTitle {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type")
            protected String type;

            /**
             * Used for Character Strings, length 1 to 64
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
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

        }

    }

}
