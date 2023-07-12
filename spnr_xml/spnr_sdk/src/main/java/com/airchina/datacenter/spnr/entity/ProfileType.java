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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Root element for profile content.
 * 
 * <p>ProfileType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ProfileType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Accesses" type="{http://www.opentravel.org/OTA/2003/05}AccessesType" minOccurs="0"/>
 *         &lt;element name="Customer" type="{http://www.opentravel.org/OTA/2003/05}CustomerType" minOccurs="0"/>
 *         &lt;element name="UserID" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                 &lt;sequence>
 *                   &lt;element name="AuthenticationInfo" type="{http://www.opentravel.org/OTA/2003/05}AuthenticationInfoType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OrigPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EncryptedID_Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PrefCollections" type="{http://www.opentravel.org/OTA/2003/05}PreferencesType" minOccurs="0"/>
 *         &lt;element name="CompanyInfo" type="{http://www.opentravel.org/OTA/2003/05}CompanyInfoType" minOccurs="0"/>
 *         &lt;element name="Affiliations" type="{http://www.opentravel.org/OTA/2003/05}AffiliationsType" minOccurs="0"/>
 *         &lt;element name="Agreements" type="{http://www.opentravel.org/OTA/2003/05}AgreementsType" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *         &lt;element name="Loyalty" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="LoyaltyTransactions" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyTransactionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MembershipId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="EncryptedMembershipId" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PointsBalance" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MemberSince" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CorporateInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="UserRoles" type="{http://www.opentravel.org/OTA/2003/05}UsersType" minOccurs="0"/>
 *                   &lt;element name="UserPermissions" type="{http://www.opentravel.org/OTA/2003/05}PermissionsType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Beneficiary" type="{http://www.opentravel.org/OTA/2003/05}BeneficiaryType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="CustomQuestions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CustomQuestion" type="{http://www.opentravel.org/OTA/2003/05}CustomQuestionType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ShareAllGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeStampGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="hasLoyaltyAccount" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="VerifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="VerifiedDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="FaceVerifiedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="RestrictedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="WhitelistedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="id" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="StatusCode" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *       &lt;attribute name="RegistrationType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ProfileType", propOrder = {
    "accesses",
    "customer",
    "userID",
    "prefCollections",
    "companyInfo",
    "affiliations",
    "agreements",
    "tpaExtensions",
    "loyalty",
    "corporateInfo",
    "beneficiary",
    "customQuestions"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.VerificationPNR.Primary.Profile.class
})
public class ProfileType {

    @XmlElement(name = "Accesses")
    protected AccessesType accesses;
    @XmlElement(name = "Customer")
    protected CustomerType customer;
    @XmlElement(name = "UserID")
    protected List<ProfileType.UserID> userID;
    @XmlElement(name = "PrefCollections")
    protected PreferencesType prefCollections;
    @XmlElement(name = "CompanyInfo")
    protected CompanyInfoType companyInfo;
    @XmlElement(name = "Affiliations")
    protected AffiliationsType affiliations;
    @XmlElement(name = "Agreements")
    protected AgreementsType agreements;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;
    @XmlElement(name = "Loyalty")
    protected List<ProfileType.Loyalty> loyalty;
    @XmlElement(name = "CorporateInfo")
    protected ProfileType.CorporateInfo corporateInfo;
    @XmlElement(name = "Beneficiary")
    protected List<BeneficiaryType> beneficiary;
    @XmlElement(name = "CustomQuestions")
    protected ProfileType.CustomQuestions customQuestions;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "hasLoyaltyAccount")
    protected Boolean hasLoyaltyAccount;
    @XmlAttribute(name = "VerifiedInd")
    protected Boolean verifiedInd;
    @XmlAttribute(name = "VerifiedDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar verifiedDate;
    @XmlAttribute(name = "FaceVerifiedInd")
    protected Boolean faceVerifiedInd;
    @XmlAttribute(name = "RestrictedInd")
    protected Boolean restrictedInd;
    @XmlAttribute(name = "WhitelistedInd")
    protected Boolean whitelistedInd;
    @XmlAttribute(name = "id")
    protected String id;
    @XmlAttribute(name = "StatusCode")
    protected List<String> statusCode;
    @XmlAttribute(name = "RegistrationType")
    protected String registrationType;
    @XmlAttribute(name = "ShareAllSynchInd")
    protected YesNoType shareAllSynchInd;
    @XmlAttribute(name = "ShareAllMarketInd")
    protected YesNoType shareAllMarketInd;
    @XmlAttribute(name = "CreateDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar createDateTime;
    @XmlAttribute(name = "CreatorID")
    protected String creatorID;
    @XmlAttribute(name = "LastModifyDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModifyDateTime;
    @XmlAttribute(name = "LastModifierID")
    protected String lastModifierID;
    @XmlAttribute(name = "ProfileType")
    protected String profileType;

    /**
     * 获取accesses属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccessesType }
     *     
     */
    public AccessesType getAccesses() {
        return accesses;
    }

    /**
     * 设置accesses属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccessesType }
     *     
     */
    public void setAccesses(AccessesType value) {
        this.accesses = value;
    }

    /**
     * 获取customer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerType }
     *     
     */
    public CustomerType getCustomer() {
        return customer;
    }

    /**
     * 设置customer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerType }
     *     
     */
    public void setCustomer(CustomerType value) {
        this.customer = value;
    }

    /**
     * Gets the value of the userID property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the userID property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getUserID().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileType.UserID }
     * 
     * 
     */
    public List<ProfileType.UserID> getUserID() {
        if (userID == null) {
            userID = new ArrayList<ProfileType.UserID>();
        }
        return this.userID;
    }

    /**
     * 获取prefCollections属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PreferencesType }
     *     
     */
    public PreferencesType getPrefCollections() {
        return prefCollections;
    }

    /**
     * 设置prefCollections属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PreferencesType }
     *     
     */
    public void setPrefCollections(PreferencesType value) {
        this.prefCollections = value;
    }

    /**
     * 获取companyInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyInfoType }
     *     
     */
    public CompanyInfoType getCompanyInfo() {
        return companyInfo;
    }

    /**
     * 设置companyInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyInfoType }
     *     
     */
    public void setCompanyInfo(CompanyInfoType value) {
        this.companyInfo = value;
    }

    /**
     * 获取affiliations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AffiliationsType }
     *     
     */
    public AffiliationsType getAffiliations() {
        return affiliations;
    }

    /**
     * 设置affiliations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AffiliationsType }
     *     
     */
    public void setAffiliations(AffiliationsType value) {
        this.affiliations = value;
    }

    /**
     * 获取agreements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgreementsType }
     *     
     */
    public AgreementsType getAgreements() {
        return agreements;
    }

    /**
     * 设置agreements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgreementsType }
     *     
     */
    public void setAgreements(AgreementsType value) {
        this.agreements = value;
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
     * Gets the value of the loyalty property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the loyalty property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getLoyalty().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ProfileType.Loyalty }
     * 
     * 
     */
    public List<ProfileType.Loyalty> getLoyalty() {
        if (loyalty == null) {
            loyalty = new ArrayList<ProfileType.Loyalty>();
        }
        return this.loyalty;
    }

    /**
     * 获取corporateInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProfileType.CorporateInfo }
     *     
     */
    public ProfileType.CorporateInfo getCorporateInfo() {
        return corporateInfo;
    }

    /**
     * 设置corporateInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType.CorporateInfo }
     *     
     */
    public void setCorporateInfo(ProfileType.CorporateInfo value) {
        this.corporateInfo = value;
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
     * {@link BeneficiaryType }
     * 
     * 
     */
    public List<BeneficiaryType> getBeneficiary() {
        if (beneficiary == null) {
            beneficiary = new ArrayList<BeneficiaryType>();
        }
        return this.beneficiary;
    }

    /**
     * 获取customQuestions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProfileType.CustomQuestions }
     *     
     */
    public ProfileType.CustomQuestions getCustomQuestions() {
        return customQuestions;
    }

    /**
     * 设置customQuestions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProfileType.CustomQuestions }
     *     
     */
    public void setCustomQuestions(ProfileType.CustomQuestions value) {
        this.customQuestions = value;
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
     * 获取hasLoyaltyAccount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHasLoyaltyAccount() {
        return hasLoyaltyAccount;
    }

    /**
     * 设置hasLoyaltyAccount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHasLoyaltyAccount(Boolean value) {
        this.hasLoyaltyAccount = value;
    }

    /**
     * 获取verifiedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isVerifiedInd() {
        return verifiedInd;
    }

    /**
     * 设置verifiedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setVerifiedInd(Boolean value) {
        this.verifiedInd = value;
    }

    /**
     * 获取verifiedDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getVerifiedDate() {
        return verifiedDate;
    }

    /**
     * 设置verifiedDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setVerifiedDate(XMLGregorianCalendar value) {
        this.verifiedDate = value;
    }

    /**
     * 获取faceVerifiedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isFaceVerifiedInd() {
        return faceVerifiedInd;
    }

    /**
     * 设置faceVerifiedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setFaceVerifiedInd(Boolean value) {
        this.faceVerifiedInd = value;
    }

    /**
     * 获取restrictedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRestrictedInd() {
        return restrictedInd;
    }

    /**
     * 设置restrictedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRestrictedInd(Boolean value) {
        this.restrictedInd = value;
    }

    /**
     * 获取whitelistedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isWhitelistedInd() {
        return whitelistedInd;
    }

    /**
     * 设置whitelistedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setWhitelistedInd(Boolean value) {
        this.whitelistedInd = value;
    }

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getId() {
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
    public void setId(String value) {
        this.id = value;
    }

    /**
     * Gets the value of the statusCode property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the statusCode property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatusCode().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getStatusCode() {
        if (statusCode == null) {
            statusCode = new ArrayList<String>();
        }
        return this.statusCode;
    }

    /**
     * 获取registrationType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRegistrationType() {
        return registrationType;
    }

    /**
     * 设置registrationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRegistrationType(String value) {
        this.registrationType = value;
    }

    /**
     * 获取shareAllSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getShareAllSynchInd() {
        if (shareAllSynchInd == null) {
            return YesNoType.NO;
        } else {
            return shareAllSynchInd;
        }
    }

    /**
     * 设置shareAllSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setShareAllSynchInd(YesNoType value) {
        this.shareAllSynchInd = value;
    }

    /**
     * 获取shareAllMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link YesNoType }
     *     
     */
    public YesNoType getShareAllMarketInd() {
        if (shareAllMarketInd == null) {
            return YesNoType.NO;
        } else {
            return shareAllMarketInd;
        }
    }

    /**
     * 设置shareAllMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link YesNoType }
     *     
     */
    public void setShareAllMarketInd(YesNoType value) {
        this.shareAllMarketInd = value;
    }

    /**
     * 获取createDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCreateDateTime() {
        return createDateTime;
    }

    /**
     * 设置createDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCreateDateTime(XMLGregorianCalendar value) {
        this.createDateTime = value;
    }

    /**
     * 获取creatorID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCreatorID() {
        return creatorID;
    }

    /**
     * 设置creatorID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCreatorID(String value) {
        this.creatorID = value;
    }

    /**
     * 获取lastModifyDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModifyDateTime() {
        return lastModifyDateTime;
    }

    /**
     * 设置lastModifyDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModifyDateTime(XMLGregorianCalendar value) {
        this.lastModifyDateTime = value;
    }

    /**
     * 获取lastModifierID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLastModifierID() {
        return lastModifierID;
    }

    /**
     * 设置lastModifierID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLastModifierID(String value) {
        this.lastModifierID = value;
    }

    /**
     * 获取profileType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProfileType() {
        return profileType;
    }

    /**
     * 设置profileType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProfileType(String value) {
        this.profileType = value;
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
     *         &lt;element name="UserRoles" type="{http://www.opentravel.org/OTA/2003/05}UsersType" minOccurs="0"/>
     *         &lt;element name="UserPermissions" type="{http://www.opentravel.org/OTA/2003/05}PermissionsType" minOccurs="0"/>
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
        "userRoles",
        "userPermissions"
    })
    public static class CorporateInfo {

        @XmlElement(name = "UserRoles")
        protected UsersType userRoles;
        @XmlElement(name = "UserPermissions")
        protected PermissionsType userPermissions;

        /**
         * 获取userRoles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link UsersType }
         *     
         */
        public UsersType getUserRoles() {
            return userRoles;
        }

        /**
         * 设置userRoles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link UsersType }
         *     
         */
        public void setUserRoles(UsersType value) {
            this.userRoles = value;
        }

        /**
         * 获取userPermissions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PermissionsType }
         *     
         */
        public PermissionsType getUserPermissions() {
            return userPermissions;
        }

        /**
         * 设置userPermissions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PermissionsType }
         *     
         */
        public void setUserPermissions(PermissionsType value) {
            this.userPermissions = value;
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
     *         &lt;element name="CustomQuestion" type="{http://www.opentravel.org/OTA/2003/05}CustomQuestionType" maxOccurs="unbounded"/>
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
        "customQuestion"
    })
    public static class CustomQuestions {

        @XmlElement(name = "CustomQuestion", required = true)
        protected List<CustomQuestionType> customQuestion;

        /**
         * Gets the value of the customQuestion property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the customQuestion property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCustomQuestion().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CustomQuestionType }
         * 
         * 
         */
        public List<CustomQuestionType> getCustomQuestion() {
            if (customQuestion == null) {
                customQuestion = new ArrayList<CustomQuestionType>();
            }
            return this.customQuestion;
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
     *         &lt;element name="LoyaltyTransactions" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyTransactionsType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="CustomerId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MembershipId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EncryptedMembershipId" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PointsBalance" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="Tier" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MemberSince" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="DiscountRate" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "loyaltyTransactions"
    })
    public static class Loyalty {

        @XmlElement(name = "LoyaltyTransactions")
        protected List<LoyaltyTransactionsType> loyaltyTransactions;
        @XmlAttribute(name = "CustomerId")
        protected String customerId;
        @XmlAttribute(name = "MembershipId")
        protected String membershipId;
        @XmlAttribute(name = "EncryptedMembershipId")
        protected String encryptedMembershipId;
        @XmlAttribute(name = "PointsBalance")
        protected BigInteger pointsBalance;
        @XmlAttribute(name = "Tier")
        protected String tier;
        @XmlAttribute(name = "MemberSince")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar memberSince;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "DiscountRate")
        protected String discountRate;
        @XmlAttribute(name = "Name")
        protected String name;

        /**
         * Gets the value of the loyaltyTransactions property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the loyaltyTransactions property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getLoyaltyTransactions().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link LoyaltyTransactionsType }
         * 
         * 
         */
        public List<LoyaltyTransactionsType> getLoyaltyTransactions() {
            if (loyaltyTransactions == null) {
                loyaltyTransactions = new ArrayList<LoyaltyTransactionsType>();
            }
            return this.loyaltyTransactions;
        }

        /**
         * 获取customerId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCustomerId() {
            return customerId;
        }

        /**
         * 设置customerId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCustomerId(String value) {
            this.customerId = value;
        }

        /**
         * 获取membershipId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMembershipId() {
            return membershipId;
        }

        /**
         * 设置membershipId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMembershipId(String value) {
            this.membershipId = value;
        }

        /**
         * 获取encryptedMembershipId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedMembershipId() {
            return encryptedMembershipId;
        }

        /**
         * 设置encryptedMembershipId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedMembershipId(String value) {
            this.encryptedMembershipId = value;
        }

        /**
         * 获取pointsBalance属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getPointsBalance() {
            return pointsBalance;
        }

        /**
         * 设置pointsBalance属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setPointsBalance(BigInteger value) {
            this.pointsBalance = value;
        }

        /**
         * 获取tier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTier() {
            return tier;
        }

        /**
         * 设置tier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTier(String value) {
            this.tier = value;
        }

        /**
         * 获取memberSince属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getMemberSince() {
            return memberSince;
        }

        /**
         * 设置memberSince属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setMemberSince(XMLGregorianCalendar value) {
            this.memberSince = value;
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
         * 获取discountRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountRate() {
            return discountRate;
        }

        /**
         * 设置discountRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountRate(String value) {
            this.discountRate = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *       &lt;sequence>
     *         &lt;element name="AuthenticationInfo" type="{http://www.opentravel.org/OTA/2003/05}AuthenticationInfoType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OrigPassword" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="EncryptedID_Source" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "authenticationInfo"
    })
    public static class UserID
        extends UniqueIDType
    {

        @XmlElement(name = "AuthenticationInfo")
        protected List<AuthenticationInfoType> authenticationInfo;
        @XmlAttribute(name = "Password")
        protected String password;
        @XmlAttribute(name = "OrigPassword")
        protected String origPassword;
        @XmlAttribute(name = "EncryptedID_Source")
        protected String encryptedIDSource;

        /**
         * Gets the value of the authenticationInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the authenticationInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAuthenticationInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AuthenticationInfoType }
         * 
         * 
         */
        public List<AuthenticationInfoType> getAuthenticationInfo() {
            if (authenticationInfo == null) {
                authenticationInfo = new ArrayList<AuthenticationInfoType>();
            }
            return this.authenticationInfo;
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
         * 获取origPassword属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrigPassword() {
            return origPassword;
        }

        /**
         * 设置origPassword属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrigPassword(String value) {
            this.origPassword = value;
        }

        /**
         * 获取encryptedIDSource属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEncryptedIDSource() {
            return encryptedIDSource;
        }

        /**
         * 设置encryptedIDSource属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEncryptedIDSource(String value) {
            this.encryptedIDSource = value;
        }

    }

}
