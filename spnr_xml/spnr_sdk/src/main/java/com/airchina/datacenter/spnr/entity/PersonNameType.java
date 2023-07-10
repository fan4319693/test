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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * This provides name information for a person.
 * 
 * <p>PersonNameType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PersonNameType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="NamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="SurnamePrefix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" minOccurs="0"/>
 *         &lt;element name="Surname" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType"/>
 *         &lt;element name="NameSuffix" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="3" minOccurs="0"/>
 *         &lt;element name="NameTitle" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Document" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="DocID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CnName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Bin" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="AdditionalName" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="5" minOccurs="0"/>
 *                   &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="3" minOccurs="0"/>
 *                   &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *         &lt;element name="PTCSubType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attribute name="NameType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PersonNameType", propOrder = {
    "namePrefix",
    "givenName",
    "middleName",
    "surnamePrefix",
    "surname",
    "nameSuffix",
    "nameTitle",
    "document",
    "cnName",
    "bin",
    "passengerTypeCode",
    "additionalName",
    "tpaExtensions",
    "ptcSubType"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.TravelClubType.ClubMemberName.class,
    com.airchina.datacenter.spnr.entity.ContactsType.Name.class,
    FerryPersonNameType.class,
    com.airchina.datacenter.spnr.entity.OrganizationType.OrgMemberName.class,
    com.airchina.datacenter.spnr.entity.VerificationType.PersonName.class,
    com.airchina.datacenter.spnr.entity.CoveredTravelerType.CoveredPerson.class,
    com.airchina.datacenter.spnr.entity.CoveredTravelerType.Beneficiary.Name.class
})
public class PersonNameType {

    @XmlElement(name = "NamePrefix")
    protected List<String> namePrefix;
    @XmlElement(name = "GivenName")
    protected List<SimplifiedStringType> givenName;
    @XmlElement(name = "MiddleName")
    protected List<SimplifiedStringType> middleName;
    @XmlElement(name = "SurnamePrefix")
    protected String surnamePrefix;
    @XmlElement(name = "Surname", required = true)
    protected SimplifiedStringType surname;
    @XmlElement(name = "NameSuffix")
    protected List<String> nameSuffix;
    @XmlElement(name = "NameTitle")
    protected List<String> nameTitle;
    @XmlElement(name = "Document")
    protected PersonNameType.Document document;
    @XmlElement(name = "CnName")
    protected List<String> cnName;
    @XmlElement(name = "Bin")
    protected List<String> bin;
    @XmlElement(name = "PassengerTypeCode")
    protected List<String> passengerTypeCode;
    @XmlElement(name = "AdditionalName")
    protected List<PersonNameType.AdditionalName> additionalName;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "PTCSubType")
    protected List<String> ptcSubType;
    @XmlAttribute(name = "NameType")
    protected String nameType;
    @XmlAttribute(name = "Language")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    @XmlSchemaType(name = "language")
    protected String language;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the namePrefix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the namePrefix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNamePrefix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNamePrefix() {
        if (namePrefix == null) {
            namePrefix = new ArrayList<String>();
        }
        return this.namePrefix;
    }

    /**
     * Gets the value of the givenName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the givenName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGivenName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplifiedStringType }
     * 
     * 
     */
    public List<SimplifiedStringType> getGivenName() {
        if (givenName == null) {
            givenName = new ArrayList<SimplifiedStringType>();
        }
        return this.givenName;
    }

    /**
     * Gets the value of the middleName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the middleName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMiddleName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SimplifiedStringType }
     * 
     * 
     */
    public List<SimplifiedStringType> getMiddleName() {
        if (middleName == null) {
            middleName = new ArrayList<SimplifiedStringType>();
        }
        return this.middleName;
    }

    /**
     * 获取surnamePrefix属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSurnamePrefix() {
        return surnamePrefix;
    }

    /**
     * 设置surnamePrefix属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSurnamePrefix(String value) {
        this.surnamePrefix = value;
    }

    /**
     * 获取surname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SimplifiedStringType }
     *     
     */
    public SimplifiedStringType getSurname() {
        return surname;
    }

    /**
     * 设置surname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SimplifiedStringType }
     *     
     */
    public void setSurname(SimplifiedStringType value) {
        this.surname = value;
    }

    /**
     * Gets the value of the nameSuffix property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameSuffix property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameSuffix().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameSuffix() {
        if (nameSuffix == null) {
            nameSuffix = new ArrayList<String>();
        }
        return this.nameSuffix;
    }

    /**
     * Gets the value of the nameTitle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the nameTitle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getNameTitle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getNameTitle() {
        if (nameTitle == null) {
            nameTitle = new ArrayList<String>();
        }
        return this.nameTitle;
    }

    /**
     * 获取document属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType.Document }
     *     
     */
    public PersonNameType.Document getDocument() {
        return document;
    }

    /**
     * 设置document属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType.Document }
     *     
     */
    public void setDocument(PersonNameType.Document value) {
        this.document = value;
    }

    /**
     * Gets the value of the cnName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cnName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCnName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getCnName() {
        if (cnName == null) {
            cnName = new ArrayList<String>();
        }
        return this.cnName;
    }

    /**
     * Gets the value of the bin property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the bin property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBin().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getBin() {
        if (bin == null) {
            bin = new ArrayList<String>();
        }
        return this.bin;
    }

    /**
     * Gets the value of the passengerTypeCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerTypeCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerTypeCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPassengerTypeCode() {
        if (passengerTypeCode == null) {
            passengerTypeCode = new ArrayList<String>();
        }
        return this.passengerTypeCode;
    }

    /**
     * Gets the value of the additionalName property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalName property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalName().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PersonNameType.AdditionalName }
     * 
     * 
     */
    public List<PersonNameType.AdditionalName> getAdditionalName() {
        if (additionalName == null) {
            additionalName = new ArrayList<PersonNameType.AdditionalName>();
        }
        return this.additionalName;
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
     * Gets the value of the ptcSubType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ptcSubType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPTCSubType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getPTCSubType() {
        if (ptcSubType == null) {
            ptcSubType = new ArrayList<String>();
        }
        return this.ptcSubType;
    }

    /**
     * 获取nameType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNameType() {
        return nameType;
    }

    /**
     * 设置nameType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNameType(String value) {
        this.nameType = value;
    }

    /**
     * 获取language属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLanguage() {
        return language;
    }

    /**
     * 设置language属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLanguage(String value) {
        this.language = value;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *         &lt;element name="GivenName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="5" minOccurs="0"/>
     *         &lt;element name="MiddleName" type="{http://www.opentravel.org/OTA/2003/05}SimplifiedStringType" maxOccurs="3" minOccurs="0"/>
     *         &lt;element name="Surname" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}language" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "givenName",
        "middleName",
        "surname"
    })
    public static class AdditionalName {

        @XmlElement(name = "GivenName")
        protected List<SimplifiedStringType> givenName;
        @XmlElement(name = "MiddleName")
        protected List<SimplifiedStringType> middleName;
        @XmlElement(name = "Surname", required = true)
        protected String surname;
        @XmlAttribute(name = "Language")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String language;

        /**
         * Gets the value of the givenName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the givenName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGivenName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimplifiedStringType }
         * 
         * 
         */
        public List<SimplifiedStringType> getGivenName() {
            if (givenName == null) {
                givenName = new ArrayList<SimplifiedStringType>();
            }
            return this.givenName;
        }

        /**
         * Gets the value of the middleName property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the middleName property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getMiddleName().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SimplifiedStringType }
         * 
         * 
         */
        public List<SimplifiedStringType> getMiddleName() {
            if (middleName == null) {
                middleName = new ArrayList<SimplifiedStringType>();
            }
            return this.middleName;
        }

        /**
         * 获取surname属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSurname() {
            return surname;
        }

        /**
         * 设置surname属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSurname(String value) {
            this.surname = value;
        }

        /**
         * 获取language属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLanguage() {
            return language;
        }

        /**
         * 设置language属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLanguage(String value) {
            this.language = value;
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
     *       &lt;attribute name="DocID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="DocType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Document {

        @XmlAttribute(name = "DocID")
        protected String docID;
        @XmlAttribute(name = "DocType")
        protected String docType;

        /**
         * 获取docID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocID() {
            return docID;
        }

        /**
         * 设置docID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocID(String value) {
            this.docID = value;
        }

        /**
         * 获取docType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocType() {
            return docType;
        }

        /**
         * 设置docType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocType(String value) {
            this.docType = value;
        }

    }

}
