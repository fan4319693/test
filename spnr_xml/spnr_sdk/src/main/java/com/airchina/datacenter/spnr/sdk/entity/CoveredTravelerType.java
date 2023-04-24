//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains identifying information as well as coverage requirements and journey information for each individual requesting coverage by the insurance plan.
 * 
 * <p>CoveredTravelerType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CoveredTravelerType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveredPerson">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
 *                 &lt;attribute name="Relation" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Telephone" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CitizenCountryName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CitizenCountryNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Document" type="{http://www.opentravel.org/OTA/2003/05}DocumentType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="EmergencyContact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Beneficiary" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Name">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *                 &lt;attribute name="Relation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="BenefitPercent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="IndCoverageReqs" type="{http://www.opentravel.org/OTA/2003/05}IndCoverageReqsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CoveredTravelerType", propOrder = {
    "coveredPerson",
    "email",
    "address",
    "telephone",
    "citizenCountryName",
    "document",
    "emergencyContact",
    "beneficiary",
    "indCoverageReqs"
})
public class CoveredTravelerType {

    @XmlElement(name = "CoveredPerson", required = true)
    protected CoveredTravelerType.CoveredPerson coveredPerson;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlElement(name = "Address")
    protected List<AddressInfoType> address;
    @XmlElement(name = "Telephone")
    protected List<CoveredTravelerType.Telephone> telephone;
    @XmlElement(name = "CitizenCountryName")
    protected CoveredTravelerType.CitizenCountryName citizenCountryName;
    @XmlElement(name = "Document")
    protected List<DocumentType> document;
    @XmlElement(name = "EmergencyContact")
    protected List<ContactPersonType> emergencyContact;
    @XmlElement(name = "Beneficiary")
    protected List<CoveredTravelerType.Beneficiary> beneficiary;
    @XmlElement(name = "IndCoverageReqs")
    protected IndCoverageReqsType indCoverageReqs;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "OJ_SuperPNR_RPH")
    protected String ojSuperPNRRPH;

    /**
     * 获取coveredPerson属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CoveredTravelerType.CoveredPerson }
     *     
     */
    public CoveredTravelerType.CoveredPerson getCoveredPerson() {
        return coveredPerson;
    }

    /**
     * 设置coveredPerson属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredTravelerType.CoveredPerson }
     *     
     */
    public void setCoveredPerson(CoveredTravelerType.CoveredPerson value) {
        this.coveredPerson = value;
    }

    /**
     * Gets the value of the email property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the email property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmail().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EmailType }
     * 
     * 
     */
    public List<EmailType> getEmail() {
        if (email == null) {
            email = new ArrayList<EmailType>();
        }
        return this.email;
    }

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
     * {@link AddressInfoType }
     * 
     * 
     */
    public List<AddressInfoType> getAddress() {
        if (address == null) {
            address = new ArrayList<AddressInfoType>();
        }
        return this.address;
    }

    /**
     * Gets the value of the telephone property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the telephone property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTelephone().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveredTravelerType.Telephone }
     * 
     * 
     */
    public List<CoveredTravelerType.Telephone> getTelephone() {
        if (telephone == null) {
            telephone = new ArrayList<CoveredTravelerType.Telephone>();
        }
        return this.telephone;
    }

    /**
     * 获取citizenCountryName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CoveredTravelerType.CitizenCountryName }
     *     
     */
    public CoveredTravelerType.CitizenCountryName getCitizenCountryName() {
        return citizenCountryName;
    }

    /**
     * 设置citizenCountryName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CoveredTravelerType.CitizenCountryName }
     *     
     */
    public void setCitizenCountryName(CoveredTravelerType.CitizenCountryName value) {
        this.citizenCountryName = value;
    }

    /**
     * Gets the value of the document property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the document property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDocument().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentType }
     * 
     * 
     */
    public List<DocumentType> getDocument() {
        if (document == null) {
            document = new ArrayList<DocumentType>();
        }
        return this.document;
    }

    /**
     * Gets the value of the emergencyContact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emergencyContact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEmergencyContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getEmergencyContact() {
        if (emergencyContact == null) {
            emergencyContact = new ArrayList<ContactPersonType>();
        }
        return this.emergencyContact;
    }

    /**
     * Gets the value of the beneficiary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the beneficiary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBeneficiary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CoveredTravelerType.Beneficiary }
     * 
     * 
     */
    public List<CoveredTravelerType.Beneficiary> getBeneficiary() {
        if (beneficiary == null) {
            beneficiary = new ArrayList<CoveredTravelerType.Beneficiary>();
        }
        return this.beneficiary;
    }

    /**
     * 获取indCoverageReqs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link IndCoverageReqsType }
     *     
     */
    public IndCoverageReqsType getIndCoverageReqs() {
        return indCoverageReqs;
    }

    /**
     * 设置indCoverageReqs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link IndCoverageReqsType }
     *     
     */
    public void setIndCoverageReqs(IndCoverageReqsType value) {
        this.indCoverageReqs = value;
    }

    /**
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取passengerTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    /**
     * 设置passengerTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerTypeCode(String value) {
        this.passengerTypeCode = value;
    }

    /**
     * 获取ojSuperPNRRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOJSuperPNRRPH() {
        return ojSuperPNRRPH;
    }

    /**
     * 设置ojSuperPNRRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOJSuperPNRRPH(String value) {
        this.ojSuperPNRRPH = value;
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
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressInfoType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
     *       &lt;attribute name="Relation" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="BenefitPercent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "name",
        "address"
    })
    public static class Beneficiary {

        @XmlElement(name = "Name", required = true)
        protected CoveredTravelerType.Beneficiary.Name name;
        @XmlElement(name = "Address")
        protected AddressInfoType address;
        @XmlAttribute(name = "Relation")
        protected String relation;
        @XmlAttribute(name = "BenefitPercent")
        protected BigDecimal benefitPercent;
        @XmlAttribute(name = "ID")
        protected String id;

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CoveredTravelerType.Beneficiary.Name }
         *     
         */
        public CoveredTravelerType.Beneficiary.Name getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CoveredTravelerType.Beneficiary.Name }
         *     
         */
        public void setName(CoveredTravelerType.Beneficiary.Name value) {
            this.name = value;
        }

        /**
         * 获取address属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AddressInfoType }
         *     
         */
        public AddressInfoType getAddress() {
            return address;
        }

        /**
         * 设置address属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AddressInfoType }
         *     
         */
        public void setAddress(AddressInfoType value) {
            this.address = value;
        }

        /**
         * 获取relation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelation() {
            return relation;
        }

        /**
         * 设置relation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelation(String value) {
            this.relation = value;
        }

        /**
         * 获取benefitPercent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getBenefitPercent() {
            return benefitPercent;
        }

        /**
         * 设置benefitPercent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setBenefitPercent(BigDecimal value) {
            this.benefitPercent = value;
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
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Name
            extends PersonNameType
        {

            @XmlAttribute(name = "BirthDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar birthDate;

            /**
             * 获取birthDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getBirthDate() {
                return birthDate;
            }

            /**
             * 设置birthDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setBirthDate(XMLGregorianCalendar value) {
                this.birthDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CitizenCountryNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CitizenCountryName {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;

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
         * 获取defaultInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDefaultInd() {
            if (defaultInd == null) {
                return false;
            } else {
                return defaultInd;
            }
        }

        /**
         * 设置defaultInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PersonNameType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}BirthDateGroup"/>
     *       &lt;attribute name="Relation" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CoveredPerson
        extends PersonNameType
    {

        @XmlAttribute(name = "Relation", required = true)
        protected String relation;
        @XmlAttribute(name = "Age")
        protected BigInteger age;
        @XmlAttribute(name = "BirthDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar birthDate;

        /**
         * 获取relation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRelation() {
            return relation;
        }

        /**
         * 设置relation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRelation(String value) {
            this.relation = value;
        }

        /**
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAge(BigInteger value) {
            this.age = value;
        }

        /**
         * 获取birthDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBirthDate() {
            return birthDate;
        }

        /**
         * 设置birthDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBirthDate(XMLGregorianCalendar value) {
            this.birthDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneInfoGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Telephone {

        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "index")
        protected Integer index;
        @XmlAttribute(name = "OJ_SuperPNR_RPH")
        protected String ojSuperPNRRPH;
        @XmlAttribute(name = "DefaultInd")
        protected Boolean defaultInd;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;
        @XmlAttribute(name = "PhoneLocationType")
        protected String phoneLocationType;
        @XmlAttribute(name = "PhoneTechType")
        protected String phoneTechType;
        @XmlAttribute(name = "PhoneUseType")
        protected String phoneUseType;
        @XmlAttribute(name = "CountryAccessCode")
        protected String countryAccessCode;
        @XmlAttribute(name = "AreaCityCode")
        protected String areaCityCode;
        @XmlAttribute(name = "PhoneNumber")
        protected String phoneNumberAttr;
        @XmlAttribute(name = "Extension")
        protected String extension;
        @XmlAttribute(name = "PIN")
        protected String pin;

        /**
         * 获取rph属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRPH() {
            return rph;
        }

        /**
         * 设置rph属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRPH(String value) {
            this.rph = value;
        }

        /**
         * 获取index属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIndex() {
            return index;
        }

        /**
         * 设置index属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIndex(Integer value) {
            this.index = value;
        }

        /**
         * 获取ojSuperPNRRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJSuperPNRRPH() {
            return ojSuperPNRRPH;
        }

        /**
         * 设置ojSuperPNRRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJSuperPNRRPH(String value) {
            this.ojSuperPNRRPH = value;
        }

        /**
         * 获取defaultInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isDefaultInd() {
            if (defaultInd == null) {
                return false;
            } else {
                return defaultInd;
            }
        }

        /**
         * 设置defaultInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDefaultInd(Boolean value) {
            this.defaultInd = value;
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
         * 获取formattedInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public boolean isFormattedInd() {
            if (formattedInd == null) {
                return false;
            } else {
                return formattedInd;
            }
        }

        /**
         * 设置formattedInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFormattedInd(Boolean value) {
            this.formattedInd = value;
        }

        /**
         * 获取phoneLocationType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneLocationType() {
            return phoneLocationType;
        }

        /**
         * 设置phoneLocationType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneLocationType(String value) {
            this.phoneLocationType = value;
        }

        /**
         * 获取phoneTechType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneTechType() {
            return phoneTechType;
        }

        /**
         * 设置phoneTechType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneTechType(String value) {
            this.phoneTechType = value;
        }

        /**
         * 获取phoneUseType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneUseType() {
            return phoneUseType;
        }

        /**
         * 设置phoneUseType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneUseType(String value) {
            this.phoneUseType = value;
        }

        /**
         * 获取countryAccessCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryAccessCode() {
            return countryAccessCode;
        }

        /**
         * 设置countryAccessCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryAccessCode(String value) {
            this.countryAccessCode = value;
        }

        /**
         * 获取areaCityCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAreaCityCode() {
            return areaCityCode;
        }

        /**
         * 设置areaCityCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAreaCityCode(String value) {
            this.areaCityCode = value;
        }

        /**
         * 获取phoneNumberAttr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPhoneNumberAttr() {
            return phoneNumberAttr;
        }

        /**
         * 设置phoneNumberAttr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPhoneNumberAttr(String value) {
            this.phoneNumberAttr = value;
        }

        /**
         * 获取extension属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getExtension() {
            return extension;
        }

        /**
         * 设置extension属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setExtension(String value) {
            this.extension = value;
        }

        /**
         * 获取pin属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPIN() {
            return pin;
        }

        /**
         * 设置pin属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPIN(String value) {
            this.pin = value;
        }

    }

}
