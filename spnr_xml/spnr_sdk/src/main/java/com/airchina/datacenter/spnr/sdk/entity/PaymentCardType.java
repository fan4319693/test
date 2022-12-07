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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Identification about a specific credit card
 * 
 * <p>PaymentCardType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PaymentCardType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CardHolderName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" minOccurs="0"/>
 *         &lt;element name="CardHolderNameDetails" type="{http://www.opentravel.org/OTA/2003/05}PersonNameType" minOccurs="0"/>
 *         &lt;element name="CardIssuerName" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}IssuerNameGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Address" type="{http://www.opentravel.org/OTA/2003/05}AddressType" minOccurs="0"/>
 *         &lt;element name="CardHolderGivenName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CardHolderSurname" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CardHolderTitle" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *         &lt;element name="CardHolderTelephone" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustLoyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ThreeDomainSecurity" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Gateway" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AuthenticationVerificationValue" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *                                       &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TransactionPassword" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;choice>
 *                                       &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
 *                                       &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
 *                                     &lt;/choice>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ECI" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                           &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Results" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="PAResStatus" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
 *                           &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaymentCardDateGroup"/>
 *       &lt;attribute name="CardType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CardCode" type="{http://www.opentravel.org/OTA/2003/05}PaymentCardCodeType" />
 *       &lt;attribute name="CardNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" />
 *       &lt;attribute name="SeriesCode" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
 *       &lt;attribute name="MaskedCardNumber" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to19" />
 *       &lt;attribute name="CardHolderRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="IssueNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PaymentCardType", propOrder = {
    "cardHolderName",
    "cardHolderNameDetails",
    "cardIssuerName",
    "address",
    "cardHolderGivenName",
    "cardHolderSurname",
    "cardHolderTitle",
    "cardHolderTelephone",
    "custLoyalty",
    "threeDomainSecurity"
})
@XmlSeeAlso({
    FerryPaymentCardBaseType.class
})
public class PaymentCardType {

    @XmlElement(name = "CardHolderName")
    protected String cardHolderName;
    @XmlElement(name = "CardHolderNameDetails")
    protected PersonNameType cardHolderNameDetails;
    @XmlElement(name = "CardIssuerName")
    protected PaymentCardType.CardIssuerName cardIssuerName;
    @XmlElement(name = "Address")
    protected AddressType address;
    @XmlElement(name = "CardHolderGivenName")
    protected Object cardHolderGivenName;
    @XmlElement(name = "CardHolderSurname")
    protected Object cardHolderSurname;
    @XmlElement(name = "CardHolderTitle")
    protected Object cardHolderTitle;
    @XmlElement(name = "CardHolderTelephone")
    protected PaymentCardType.CardHolderTelephone cardHolderTelephone;
    @XmlElement(name = "CustLoyalty")
    protected List<PaymentCardType.CustLoyalty> custLoyalty;
    @XmlElement(name = "ThreeDomainSecurity")
    protected PaymentCardType.ThreeDomainSecurity threeDomainSecurity;
    @XmlAttribute(name = "CardType")
    protected String cardType;
    @XmlAttribute(name = "CardCode")
    protected String cardCode;
    @XmlAttribute(name = "CardNumber")
    protected String cardNumber;
    @XmlAttribute(name = "SeriesCode")
    protected String seriesCode;
    @XmlAttribute(name = "MaskedCardNumber")
    protected String maskedCardNumber;
    @XmlAttribute(name = "CardHolderRPH")
    protected String cardHolderRPH;
    @XmlAttribute(name = "IssueNumber")
    protected Integer issueNumber;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;
    @XmlAttribute(name = "EffectiveDate")
    protected String effectiveDate;
    @XmlAttribute(name = "ExpireDate")
    protected String expireDate;

    /**
     * 获取cardHolderName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderName() {
        return cardHolderName;
    }

    /**
     * 设置cardHolderName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderName(String value) {
        this.cardHolderName = value;
    }

    /**
     * 获取cardHolderNameDetails属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PersonNameType }
     *     
     */
    public PersonNameType getCardHolderNameDetails() {
        return cardHolderNameDetails;
    }

    /**
     * 设置cardHolderNameDetails属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PersonNameType }
     *     
     */
    public void setCardHolderNameDetails(PersonNameType value) {
        this.cardHolderNameDetails = value;
    }

    /**
     * 获取cardIssuerName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public PaymentCardType.CardIssuerName getCardIssuerName() {
        return cardIssuerName;
    }

    /**
     * 设置cardIssuerName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.CardIssuerName }
     *     
     */
    public void setCardIssuerName(PaymentCardType.CardIssuerName value) {
        this.cardIssuerName = value;
    }

    /**
     * 获取address属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddressType }
     *     
     */
    public AddressType getAddress() {
        return address;
    }

    /**
     * 设置address属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddressType }
     *     
     */
    public void setAddress(AddressType value) {
        this.address = value;
    }

    /**
     * 获取cardHolderGivenName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCardHolderGivenName() {
        return cardHolderGivenName;
    }

    /**
     * 设置cardHolderGivenName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCardHolderGivenName(Object value) {
        this.cardHolderGivenName = value;
    }

    /**
     * 获取cardHolderSurname属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCardHolderSurname() {
        return cardHolderSurname;
    }

    /**
     * 设置cardHolderSurname属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCardHolderSurname(Object value) {
        this.cardHolderSurname = value;
    }

    /**
     * 获取cardHolderTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Object }
     *     
     */
    public Object getCardHolderTitle() {
        return cardHolderTitle;
    }

    /**
     * 设置cardHolderTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Object }
     *     
     */
    public void setCardHolderTitle(Object value) {
        this.cardHolderTitle = value;
    }

    /**
     * 获取cardHolderTelephone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.CardHolderTelephone }
     *     
     */
    public PaymentCardType.CardHolderTelephone getCardHolderTelephone() {
        return cardHolderTelephone;
    }

    /**
     * 设置cardHolderTelephone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.CardHolderTelephone }
     *     
     */
    public void setCardHolderTelephone(PaymentCardType.CardHolderTelephone value) {
        this.cardHolderTelephone = value;
    }

    /**
     * Gets the value of the custLoyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the custLoyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCustLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentCardType.CustLoyalty }
     * 
     * 
     */
    public List<PaymentCardType.CustLoyalty> getCustLoyalty() {
        if (custLoyalty == null) {
            custLoyalty = new ArrayList<PaymentCardType.CustLoyalty>();
        }
        return this.custLoyalty;
    }

    /**
     * 获取threeDomainSecurity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PaymentCardType.ThreeDomainSecurity }
     *     
     */
    public PaymentCardType.ThreeDomainSecurity getThreeDomainSecurity() {
        return threeDomainSecurity;
    }

    /**
     * 设置threeDomainSecurity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PaymentCardType.ThreeDomainSecurity }
     *     
     */
    public void setThreeDomainSecurity(PaymentCardType.ThreeDomainSecurity value) {
        this.threeDomainSecurity = value;
    }

    /**
     * 获取cardType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardType() {
        return cardType;
    }

    /**
     * 设置cardType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardType(String value) {
        this.cardType = value;
    }

    /**
     * 获取cardCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardCode() {
        return cardCode;
    }

    /**
     * 设置cardCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardCode(String value) {
        this.cardCode = value;
    }

    /**
     * 获取cardNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardNumber() {
        return cardNumber;
    }

    /**
     * 设置cardNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardNumber(String value) {
        this.cardNumber = value;
    }

    /**
     * 获取seriesCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeriesCode() {
        return seriesCode;
    }

    /**
     * 设置seriesCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeriesCode(String value) {
        this.seriesCode = value;
    }

    /**
     * 获取maskedCardNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMaskedCardNumber() {
        return maskedCardNumber;
    }

    /**
     * 设置maskedCardNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMaskedCardNumber(String value) {
        this.maskedCardNumber = value;
    }

    /**
     * 获取cardHolderRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCardHolderRPH() {
        return cardHolderRPH;
    }

    /**
     * 设置cardHolderRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCardHolderRPH(String value) {
        this.cardHolderRPH = value;
    }

    /**
     * 获取issueNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getIssueNumber() {
        return issueNumber;
    }

    /**
     * 设置issueNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setIssueNumber(Integer value) {
        this.issueNumber = value;
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
     * 获取effectiveDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEffectiveDate() {
        return effectiveDate;
    }

    /**
     * 设置effectiveDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEffectiveDate(String value) {
        this.effectiveDate = value;
    }

    /**
     * 获取expireDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpireDate() {
        return expireDate;
    }

    /**
     * 设置expireDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpireDate(String value) {
        this.expireDate = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}TelephoneGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CardHolderTelephone {

        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
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
        @XmlAttribute(name = "FormattedInd")
        protected Boolean formattedInd;

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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}IssuerNameGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CardIssuerName {

        @XmlAttribute(name = "BankID")
        protected String bankID;

        /**
         * 获取bankID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBankID() {
            return bankID;
        }

        /**
         * 设置bankID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBankID(String value) {
            this.bankID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CustomerLoyaltyGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CustLoyalty {

        @XmlAttribute(name = "ProgramID")
        protected String programID;
        @XmlAttribute(name = "MembershipID")
        protected String membershipID;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "PasswordStatus")
        protected String passwordStatus;
        @XmlAttribute(name = "Status")
        protected String status;
        @XmlAttribute(name = "TravelSector")
        protected String travelSector;
        @XmlAttribute(name = "CustomerValue")
        protected String customerValue;
        @XmlAttribute(name = "SingleVendorInd")
        protected String singleVendorInd;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "VendorCode")
        protected List<String> vendorCode;
        @XmlAttribute(name = "SignupDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar signupDate;
        @XmlAttribute(name = "LoyalLevel")
        protected String loyalLevel;
        @XmlAttribute(name = "LoyalLevelCode")
        protected Integer loyalLevelCode;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;

        /**
         * 获取programID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProgramID() {
            return programID;
        }

        /**
         * 设置programID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProgramID(String value) {
            this.programID = value;
        }

        /**
         * 获取membershipID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipID() {
            return membershipID;
        }

        /**
         * 设置membershipID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipID(String value) {
            this.membershipID = value;
        }

        /**
         * 获取password属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPassword() {
            return password;
        }

        /**
         * 设置password属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPassword(String value) {
            this.password = value;
        }

        /**
         * 获取passwordStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPasswordStatus() {
            return passwordStatus;
        }

        /**
         * 设置passwordStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPasswordStatus(String value) {
            this.passwordStatus = value;
        }

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

        /**
         * 获取travelSector属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelSector() {
            return travelSector;
        }

        /**
         * 设置travelSector属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelSector(String value) {
            this.travelSector = value;
        }

        /**
         * 获取customerValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerValue() {
            return customerValue;
        }

        /**
         * 设置customerValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerValue(String value) {
            this.customerValue = value;
        }

        /**
         * 获取singleVendorInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSingleVendorInd() {
            return singleVendorInd;
        }

        /**
         * 设置singleVendorInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSingleVendorInd(String value) {
            this.singleVendorInd = value;
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
         * Gets the value of the vendorCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vendorCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVendorCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getVendorCode() {
            if (vendorCode == null) {
                vendorCode = new ArrayList<String>();
            }
            return this.vendorCode;
        }

        /**
         * 获取signupDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getSignupDate() {
            return signupDate;
        }

        /**
         * 设置signupDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setSignupDate(XMLGregorianCalendar value) {
            this.signupDate = value;
        }

        /**
         * 获取loyalLevel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLoyalLevel() {
            return loyalLevel;
        }

        /**
         * 设置loyalLevel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLoyalLevel(String value) {
            this.loyalLevel = value;
        }

        /**
         * 获取loyalLevelCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLoyalLevelCode() {
            return loyalLevelCode;
        }

        /**
         * 设置loyalLevelCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLoyalLevelCode(Integer value) {
            this.loyalLevelCode = value;
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
         * 获取effectiveDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEffectiveDate() {
            return effectiveDate;
        }

        /**
         * 设置effectiveDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEffectiveDate(XMLGregorianCalendar value) {
            this.effectiveDate = value;
        }

        /**
         * 获取expireDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getExpireDate() {
            return expireDate;
        }

        /**
         * 设置expireDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setExpireDate(XMLGregorianCalendar value) {
            this.expireDate = value;
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
     *         &lt;element name="Gateway" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AuthenticationVerificationValue" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
     *                             &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TransactionPassword" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;choice>
     *                             &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
     *                             &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
     *                           &lt;/choice>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ECI" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *                 &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Results" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="PAResStatus" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
     *                 &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "gateway",
        "results"
    })
    public static class ThreeDomainSecurity {

        @XmlElement(name = "Gateway")
        protected PaymentCardType.ThreeDomainSecurity.Gateway gateway;
        @XmlElement(name = "Results")
        protected PaymentCardType.ThreeDomainSecurity.Results results;

        /**
         * 获取gateway属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Gateway }
         *     
         */
        public PaymentCardType.ThreeDomainSecurity.Gateway getGateway() {
            return gateway;
        }

        /**
         * 设置gateway属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Gateway }
         *     
         */
        public void setGateway(PaymentCardType.ThreeDomainSecurity.Gateway value) {
            this.gateway = value;
        }

        /**
         * 获取results属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Results }
         *     
         */
        public PaymentCardType.ThreeDomainSecurity.Results getResults() {
            return results;
        }

        /**
         * 设置results属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentCardType.ThreeDomainSecurity.Results }
         *     
         */
        public void setResults(PaymentCardType.ThreeDomainSecurity.Results value) {
            this.results = value;
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
         *         &lt;element name="AuthenticationVerificationValue" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
         *                   &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TransactionPassword" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;choice>
         *                   &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
         *                   &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
         *                 &lt;/choice>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="ECI" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
         *       &lt;attribute name="MerchantID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="ProcessorID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="URL" type="{http://www.w3.org/2001/XMLSchema}anyURI" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "authenticationVerificationValue",
            "transactionPassword",
            "tpaExtensions"
        })
        public static class Gateway {

            @XmlElement(name = "AuthenticationVerificationValue")
            protected PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue authenticationVerificationValue;
            @XmlElement(name = "TransactionPassword")
            protected PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword transactionPassword;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "ECI")
            protected String eci;
            @XmlAttribute(name = "MerchantID")
            protected String merchantID;
            @XmlAttribute(name = "ProcessorID")
            protected String processorID;
            @XmlAttribute(name = "URL")
            @XmlSchemaType(name = "anyURI")
            protected String url;

            /**
             * 获取authenticationVerificationValue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue }
             *     
             */
            public PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue getAuthenticationVerificationValue() {
                return authenticationVerificationValue;
            }

            /**
             * 设置authenticationVerificationValue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue }
             *     
             */
            public void setAuthenticationVerificationValue(PaymentCardType.ThreeDomainSecurity.Gateway.AuthenticationVerificationValue value) {
                this.authenticationVerificationValue = value;
            }

            /**
             * 获取transactionPassword属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword }
             *     
             */
            public PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword getTransactionPassword() {
                return transactionPassword;
            }

            /**
             * 设置transactionPassword属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword }
             *     
             */
            public void setTransactionPassword(PaymentCardType.ThreeDomainSecurity.Gateway.TransactionPassword value) {
                this.transactionPassword = value;
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
             * 获取eci属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getECI() {
                return eci;
            }

            /**
             * 设置eci属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setECI(String value) {
                this.eci = value;
            }

            /**
             * 获取merchantID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMerchantID() {
                return merchantID;
            }

            /**
             * 设置merchantID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMerchantID(String value) {
                this.merchantID = value;
            }

            /**
             * 获取processorID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getProcessorID() {
                return processorID;
            }

            /**
             * 设置processorID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setProcessorID(String value) {
                this.processorID = value;
            }

            /**
             * 获取url属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getURL() {
                return url;
            }

            /**
             * 设置url属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setURL(String value) {
                this.url = value;
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
             *       &lt;choice>
             *         &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
             *         &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "secure",
                "plainText"
            })
            public static class AuthenticationVerificationValue {

                @XmlElement(name = "Secure")
                protected EncryptionTokenType secure;
                @XmlElement(name = "PlainText")
                protected String plainText;

                /**
                 * 获取secure属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public EncryptionTokenType getSecure() {
                    return secure;
                }

                /**
                 * 设置secure属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public void setSecure(EncryptionTokenType value) {
                    this.secure = value;
                }

                /**
                 * 获取plainText属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlainText() {
                    return plainText;
                }

                /**
                 * 设置plainText属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlainText(String value) {
                    this.plainText = value;
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
             *       &lt;choice>
             *         &lt;element name="Secure" type="{http://www.opentravel.org/OTA/2003/05}EncryptionTokenType" minOccurs="0"/>
             *         &lt;element name="PlainText" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" minOccurs="0"/>
             *       &lt;/choice>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "secure",
                "plainText"
            })
            public static class TransactionPassword {

                @XmlElement(name = "Secure")
                protected EncryptionTokenType secure;
                @XmlElement(name = "PlainText")
                protected String plainText;

                /**
                 * 获取secure属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public EncryptionTokenType getSecure() {
                    return secure;
                }

                /**
                 * 设置secure属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link EncryptionTokenType }
                 *     
                 */
                public void setSecure(EncryptionTokenType value) {
                    this.secure = value;
                }

                /**
                 * 获取plainText属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPlainText() {
                    return plainText;
                }

                /**
                 * 设置plainText属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPlainText(String value) {
                    this.plainText = value;
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
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="CAVV" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="PAResStatus" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1" />
         *       &lt;attribute name="SignatureVerfication" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="TransactionID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="XID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "tpaExtensions"
        })
        public static class Results {

            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;
            @XmlAttribute(name = "CAVV")
            protected String cavv;
            @XmlAttribute(name = "PAResStatus")
            protected String paResStatus;
            @XmlAttribute(name = "SignatureVerfication")
            protected String signatureVerfication;
            @XmlAttribute(name = "TransactionID")
            protected String transactionID;
            @XmlAttribute(name = "XID")
            protected String xid;

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
             * 获取cavv属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCAVV() {
                return cavv;
            }

            /**
             * 设置cavv属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCAVV(String value) {
                this.cavv = value;
            }

            /**
             * 获取paResStatus属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPAResStatus() {
                return paResStatus;
            }

            /**
             * 设置paResStatus属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPAResStatus(String value) {
                this.paResStatus = value;
            }

            /**
             * 获取signatureVerfication属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSignatureVerfication() {
                return signatureVerfication;
            }

            /**
             * 设置signatureVerfication属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSignatureVerfication(String value) {
                this.signatureVerfication = value;
            }

            /**
             * 获取transactionID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTransactionID() {
                return transactionID;
            }

            /**
             * 设置transactionID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTransactionID(String value) {
                this.transactionID = value;
            }

            /**
             * 获取xid属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getXID() {
                return xid;
            }

            /**
             * 设置xid属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setXID(String value) {
                this.xid = value;
            }

        }

    }

}
