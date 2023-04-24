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


/**
 * Information on the one primary driver and, optionally, several additional drivers. This may be used to provide a frequent renter number.
 * 
 * <p>OJ_CustomerPrimaryAdditionalType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJ_CustomerPrimaryAdditionalType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Primary">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
 *                 &lt;sequence>
 *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                   &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
 *                   &lt;element name="ShareReward" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShareRewardGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="AccountType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="AdvMailConsent" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Additional" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                 &lt;attribute name="CorpDiscountName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="CorpDiscountNmbr" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
 *                 &lt;attribute name="QualificationMethod">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="RT_AirlineTicket"/>
 *                       &lt;enumeration value="CreditCard"/>
 *                       &lt;enumeration value="PassportAndReturnTkt"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="Importer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Email" type="{http://www.opentravel.org/OTA/2003/05}EmailType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="AuditID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="CustomerID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJ_CustomerPrimaryAdditionalType", propOrder = {
    "primary",
    "additional",
    "email"
})
public class OJCustomerPrimaryAdditionalType {

    @XmlElement(name = "Primary", required = true)
    protected OJCustomerPrimaryAdditionalType.Primary primary;
    @XmlElement(name = "Additional")
    protected List<OJCustomerPrimaryAdditionalType.Additional> additional;
    @XmlElement(name = "Email")
    protected List<EmailType> email;
    @XmlAttribute(name = "AuditID", required = true)
    protected BigInteger auditID;
    @XmlAttribute(name = "CustomerID", required = true)
    protected BigInteger customerID;
    @XmlAttribute(name = "Historic")
    protected Boolean historic;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "SeqNo")
    protected Integer seqNo;

    /**
     * 获取primary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OJCustomerPrimaryAdditionalType.Primary }
     *     
     */
    public OJCustomerPrimaryAdditionalType.Primary getPrimary() {
        return primary;
    }

    /**
     * 设置primary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OJCustomerPrimaryAdditionalType.Primary }
     *     
     */
    public void setPrimary(OJCustomerPrimaryAdditionalType.Primary value) {
        this.primary = value;
    }

    /**
     * Gets the value of the additional property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additional property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditional().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link OJCustomerPrimaryAdditionalType.Additional }
     * 
     * 
     */
    public List<OJCustomerPrimaryAdditionalType.Additional> getAdditional() {
        if (additional == null) {
            additional = new ArrayList<OJCustomerPrimaryAdditionalType.Additional>();
        }
        return this.additional;
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
     * 获取auditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAuditID() {
        return auditID;
    }

    /**
     * 设置auditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAuditID(BigInteger value) {
        this.auditID = value;
    }

    /**
     * 获取customerID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCustomerID() {
        return customerID;
    }

    /**
     * 设置customerID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCustomerID(BigInteger value) {
        this.customerID = value;
    }

    /**
     * 获取historic属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHistoric() {
        return historic;
    }

    /**
     * 设置historic属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHistoric(Boolean value) {
        this.historic = value;
    }

    /**
     * 获取historyID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getHistoryID() {
        return historyID;
    }

    /**
     * 设置historyID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setHistoryID(BigInteger value) {
        this.historyID = value;
    }

    /**
     * 获取seqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getSeqNo() {
        return seqNo;
    }

    /**
     * 设置seqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setSeqNo(Integer value) {
        this.seqNo = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *       &lt;attribute name="CorpDiscountName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="CorpDiscountNmbr" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to14" />
     *       &lt;attribute name="QualificationMethod">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="RT_AirlineTicket"/>
     *             &lt;enumeration value="CreditCard"/>
     *             &lt;enumeration value="PassportAndReturnTkt"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="Importer" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Additional
        extends CustomerType
    {

        @XmlAttribute(name = "CorpDiscountName")
        protected String corpDiscountName;
        @XmlAttribute(name = "CorpDiscountNmbr")
        protected String corpDiscountNmbr;
        @XmlAttribute(name = "QualificationMethod")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String qualificationMethod;
        @XmlAttribute(name = "Importer")
        protected Boolean importer;
        @XmlAttribute(name = "Start")
        protected String start;
        @XmlAttribute(name = "Duration")
        protected BigInteger duration;
        @XmlAttribute(name = "End")
        protected String end;
        @XmlAttribute(name = "RangeNum")
        protected BigInteger rangeNum;
        @XmlAttribute(name = "SearchTimeZone")
        protected String searchTimeZone;

        /**
         * 获取corpDiscountName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorpDiscountName() {
            return corpDiscountName;
        }

        /**
         * 设置corpDiscountName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorpDiscountName(String value) {
            this.corpDiscountName = value;
        }

        /**
         * 获取corpDiscountNmbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorpDiscountNmbr() {
            return corpDiscountNmbr;
        }

        /**
         * 设置corpDiscountNmbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorpDiscountNmbr(String value) {
            this.corpDiscountNmbr = value;
        }

        /**
         * 获取qualificationMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQualificationMethod() {
            return qualificationMethod;
        }

        /**
         * 设置qualificationMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQualificationMethod(String value) {
            this.qualificationMethod = value;
        }

        /**
         * 获取importer属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isImporter() {
            return importer;
        }

        /**
         * 设置importer属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setImporter(Boolean value) {
            this.importer = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStart(String value) {
            this.start = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setDuration(BigInteger value) {
            this.duration = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEnd(String value) {
            this.end = value;
        }

        /**
         * 获取rangeNum属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRangeNum() {
            return rangeNum;
        }

        /**
         * 设置rangeNum属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRangeNum(BigInteger value) {
            this.rangeNum = value;
        }

        /**
         * 获取searchTimeZone属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSearchTimeZone() {
            return searchTimeZone;
        }

        /**
         * 设置searchTimeZone属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSearchTimeZone(String value) {
            this.searchTimeZone = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CustomerType">
     *       &lt;sequence>
     *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *         &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" minOccurs="0"/>
     *         &lt;element name="ShareReward" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShareRewardGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="AccountType" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="AdvMailConsent" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "uniqueID",
        "profile",
        "shareReward"
    })
    public static class Primary
        extends CustomerType
    {

        @XmlElement(name = "UniqueID")
        protected UniqueIDType uniqueID;
        @XmlElement(name = "Profile")
        protected ProfileType profile;
        @XmlElement(name = "ShareReward")
        protected List<OJCustomerPrimaryAdditionalType.Primary.ShareReward> shareReward;
        @XmlAttribute(name = "AccountType")
        @XmlSchemaType(name = "anySimpleType")
        protected String accountType;
        @XmlAttribute(name = "AdvMailConsent")
        protected String advMailConsent;

        /**
         * 获取uniqueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UniqueIDType }
         *     
         */
        public UniqueIDType getUniqueID() {
            return uniqueID;
        }

        /**
         * 设置uniqueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UniqueIDType }
         *     
         */
        public void setUniqueID(UniqueIDType value) {
            this.uniqueID = value;
        }

        /**
         * 获取profile属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProfileType }
         *     
         */
        public ProfileType getProfile() {
            return profile;
        }

        /**
         * 设置profile属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfileType }
         *     
         */
        public void setProfile(ProfileType value) {
            this.profile = value;
        }

        /**
         * Gets the value of the shareReward property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the shareReward property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getShareReward().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OJCustomerPrimaryAdditionalType.Primary.ShareReward }
         * 
         * 
         */
        public List<OJCustomerPrimaryAdditionalType.Primary.ShareReward> getShareReward() {
            if (shareReward == null) {
                shareReward = new ArrayList<OJCustomerPrimaryAdditionalType.Primary.ShareReward>();
            }
            return this.shareReward;
        }

        /**
         * 获取accountType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAccountType() {
            return accountType;
        }

        /**
         * 设置accountType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAccountType(String value) {
            this.accountType = value;
        }

        /**
         * 获取advMailConsent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvMailConsent() {
            return advMailConsent;
        }

        /**
         * 设置advMailConsent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvMailConsent(String value) {
            this.advMailConsent = value;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShareRewardGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class ShareReward {

            @XmlAttribute(name = "ShareUserID")
            protected String shareUserID;
            @XmlAttribute(name = "ShareUserType")
            protected Integer shareUserType;
            @XmlAttribute(name = "ShareUserBonusAmount")
            protected BigDecimal shareUserBonusAmount;
            @XmlAttribute(name = "CurrencyCode")
            protected String currencyCode;

            /**
             * 获取shareUserID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getShareUserID() {
                return shareUserID;
            }

            /**
             * 设置shareUserID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setShareUserID(String value) {
                this.shareUserID = value;
            }

            /**
             * 获取shareUserType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getShareUserType() {
                return shareUserType;
            }

            /**
             * 设置shareUserType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setShareUserType(Integer value) {
                this.shareUserType = value;
            }

            /**
             * 获取shareUserBonusAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigDecimal }
             *     
             */
            public BigDecimal getShareUserBonusAmount() {
                return shareUserBonusAmount;
            }

            /**
             * 设置shareUserBonusAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigDecimal }
             *     
             */
            public void setShareUserBonusAmount(BigDecimal value) {
                this.shareUserBonusAmount = value;
            }

            /**
             * 获取currencyCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCurrencyCode() {
                return currencyCode;
            }

            /**
             * 设置currencyCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCurrencyCode(String value) {
                this.currencyCode = value;
            }

        }

    }

}
