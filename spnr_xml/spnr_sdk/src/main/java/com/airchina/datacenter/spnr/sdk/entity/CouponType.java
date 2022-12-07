//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>CouponType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CouponType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Value" type="{http://www.opentravel.org/OTA/2003/05}CouponValueType" minOccurs="0"/>
 *         &lt;element name="UsageRules" type="{http://www.opentravel.org/OTA/2003/05}CouponUsageRulesType" minOccurs="0"/>
 *         &lt;element name="PurchaseRules" type="{http://www.opentravel.org/OTA/2003/05}CouponPurchaseRulesType" minOccurs="0"/>
 *         &lt;element name="RefundRules" type="{http://www.opentravel.org/OTA/2003/05}CouponRefundRulesType" minOccurs="0"/>
 *         &lt;element name="ChangeRules" type="{http://www.opentravel.org/OTA/2003/05}CouponChangeRulesType" minOccurs="0"/>
 *         &lt;element name="RedemptionInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CrossRefs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Travelers" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Traveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType" maxOccurs="unbounded"/>
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
 *         &lt;element name="EMD_Info" type="{http://www.opentravel.org/OTA/2003/05}EMD_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Ticketing" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="TicketingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Endorsements" type="{http://www.opentravel.org/OTA/2003/05}FareInfoEndorsementsType" minOccurs="0"/>
 *         &lt;element name="Points" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeZone" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Number" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="PromotionCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="Category" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="SubCategory" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BookkeepingType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="CouponsRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ActivateDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="ExpiryDate" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="Group" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="BatchId" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to19" />
 *       &lt;attribute name="BeneficiaryIDs" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Password" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AccountBound" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="PaymentDetailRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="DisplayValueInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DisplayPromotionCodeInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CouponType", propOrder = {
    "value",
    "usageRules",
    "purchaseRules",
    "refundRules",
    "changeRules",
    "redemptionInfo",
    "emdInfo",
    "ticketing",
    "endorsements",
    "points",
    "loyalty"
})
public class CouponType {

    @XmlElement(name = "Value")
    protected CouponValueType value;
    @XmlElement(name = "UsageRules")
    protected CouponUsageRulesType usageRules;
    @XmlElement(name = "PurchaseRules")
    protected CouponPurchaseRulesType purchaseRules;
    @XmlElement(name = "RefundRules")
    protected CouponRefundRulesType refundRules;
    @XmlElement(name = "ChangeRules")
    protected CouponChangeRulesType changeRules;
    @XmlElement(name = "RedemptionInfo")
    protected CouponType.RedemptionInfo redemptionInfo;
    @XmlElement(name = "EMD_Info")
    protected List<EMDType> emdInfo;
    @XmlElement(name = "Ticketing")
    protected CouponType.Ticketing ticketing;
    @XmlElement(name = "Endorsements")
    protected FareInfoEndorsementsType endorsements;
    @XmlElement(name = "Points")
    protected CouponType.Points points;
    @XmlElement(name = "Loyalty")
    protected LoyaltyProductType loyalty;
    @XmlAttribute(name = "Code")
    @XmlSchemaType(name = "anySimpleType")
    protected String code;
    @XmlAttribute(name = "SeqNo")
    protected String seqNo;
    @XmlAttribute(name = "TimeZone")
    protected String timeZone;
    @XmlAttribute(name = "Name")
    @XmlSchemaType(name = "anySimpleType")
    protected String name;
    @XmlAttribute(name = "Description")
    @XmlSchemaType(name = "anySimpleType")
    protected String description;
    @XmlAttribute(name = "Number")
    @XmlSchemaType(name = "anySimpleType")
    protected String number;
    @XmlAttribute(name = "PromotionCode")
    @XmlSchemaType(name = "anySimpleType")
    protected String promotionCode;
    @XmlAttribute(name = "Category")
    @XmlSchemaType(name = "anySimpleType")
    protected String category;
    @XmlAttribute(name = "SubCategory")
    @XmlSchemaType(name = "anySimpleType")
    protected String subCategory;
    @XmlAttribute(name = "BookkeepingType")
    protected String bookkeepingType;
    @XmlAttribute(name = "Status")
    @XmlSchemaType(name = "anySimpleType")
    protected String status;
    @XmlAttribute(name = "CouponsRPH")
    protected String couponsRPH;
    @XmlAttribute(name = "ActivateDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar activateDate;
    @XmlAttribute(name = "ExpiryDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar expiryDate;
    @XmlAttribute(name = "Group")
    @XmlSchemaType(name = "anySimpleType")
    protected String group;
    @XmlAttribute(name = "BatchId")
    protected String batchId;
    @XmlAttribute(name = "BeneficiaryIDs")
    protected String beneficiaryIDs;
    @XmlAttribute(name = "Password")
    protected String password;
    @XmlAttribute(name = "AccountBound")
    protected Boolean accountBound;
    @XmlAttribute(name = "PaymentDetailRPH")
    protected String paymentDetailRPH;
    @XmlAttribute(name = "DisplayValueInd")
    protected Boolean displayValueInd;
    @XmlAttribute(name = "DisplayPromotionCodeInd")
    protected Boolean displayPromotionCodeInd;

    /**
     * 获取value属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponValueType }
     *     
     */
    public CouponValueType getValue() {
        return value;
    }

    /**
     * 设置value属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponValueType }
     *     
     */
    public void setValue(CouponValueType value) {
        this.value = value;
    }

    /**
     * 获取usageRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponUsageRulesType }
     *     
     */
    public CouponUsageRulesType getUsageRules() {
        return usageRules;
    }

    /**
     * 设置usageRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponUsageRulesType }
     *     
     */
    public void setUsageRules(CouponUsageRulesType value) {
        this.usageRules = value;
    }

    /**
     * 获取purchaseRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponPurchaseRulesType }
     *     
     */
    public CouponPurchaseRulesType getPurchaseRules() {
        return purchaseRules;
    }

    /**
     * 设置purchaseRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponPurchaseRulesType }
     *     
     */
    public void setPurchaseRules(CouponPurchaseRulesType value) {
        this.purchaseRules = value;
    }

    /**
     * 获取refundRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponRefundRulesType }
     *     
     */
    public CouponRefundRulesType getRefundRules() {
        return refundRules;
    }

    /**
     * 设置refundRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponRefundRulesType }
     *     
     */
    public void setRefundRules(CouponRefundRulesType value) {
        this.refundRules = value;
    }

    /**
     * 获取changeRules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponChangeRulesType }
     *     
     */
    public CouponChangeRulesType getChangeRules() {
        return changeRules;
    }

    /**
     * 设置changeRules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponChangeRulesType }
     *     
     */
    public void setChangeRules(CouponChangeRulesType value) {
        this.changeRules = value;
    }

    /**
     * 获取redemptionInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponType.RedemptionInfo }
     *     
     */
    public CouponType.RedemptionInfo getRedemptionInfo() {
        return redemptionInfo;
    }

    /**
     * 设置redemptionInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType.RedemptionInfo }
     *     
     */
    public void setRedemptionInfo(CouponType.RedemptionInfo value) {
        this.redemptionInfo = value;
    }

    /**
     * Gets the value of the emdInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the emdInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getEMDInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link EMDType }
     * 
     * 
     */
    public List<EMDType> getEMDInfo() {
        if (emdInfo == null) {
            emdInfo = new ArrayList<EMDType>();
        }
        return this.emdInfo;
    }

    /**
     * 获取ticketing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponType.Ticketing }
     *     
     */
    public CouponType.Ticketing getTicketing() {
        return ticketing;
    }

    /**
     * 设置ticketing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType.Ticketing }
     *     
     */
    public void setTicketing(CouponType.Ticketing value) {
        this.ticketing = value;
    }

    /**
     * 获取endorsements属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FareInfoEndorsementsType }
     *     
     */
    public FareInfoEndorsementsType getEndorsements() {
        return endorsements;
    }

    /**
     * 设置endorsements属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FareInfoEndorsementsType }
     *     
     */
    public void setEndorsements(FareInfoEndorsementsType value) {
        this.endorsements = value;
    }

    /**
     * 获取points属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CouponType.Points }
     *     
     */
    public CouponType.Points getPoints() {
        return points;
    }

    /**
     * 设置points属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CouponType.Points }
     *     
     */
    public void setPoints(CouponType.Points value) {
        this.points = value;
    }

    /**
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyProductType }
     *     
     */
    public LoyaltyProductType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyProductType }
     *     
     */
    public void setLoyalty(LoyaltyProductType value) {
        this.loyalty = value;
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
     * 获取seqNo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSeqNo() {
        return seqNo;
    }

    /**
     * 设置seqNo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSeqNo(String value) {
        this.seqNo = value;
    }

    /**
     * 获取timeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZone() {
        return timeZone;
    }

    /**
     * 设置timeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZone(String value) {
        this.timeZone = value;
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

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取number属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getNumber() {
        return number;
    }

    /**
     * 设置number属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setNumber(String value) {
        this.number = value;
    }

    /**
     * 获取promotionCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionCode() {
        return promotionCode;
    }

    /**
     * 设置promotionCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionCode(String value) {
        this.promotionCode = value;
    }

    /**
     * 获取category属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCategory() {
        return category;
    }

    /**
     * 设置category属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCategory(String value) {
        this.category = value;
    }

    /**
     * 获取subCategory属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCategory() {
        return subCategory;
    }

    /**
     * 设置subCategory属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCategory(String value) {
        this.subCategory = value;
    }

    /**
     * 获取bookkeepingType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookkeepingType() {
        return bookkeepingType;
    }

    /**
     * 设置bookkeepingType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookkeepingType(String value) {
        this.bookkeepingType = value;
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
     * 获取couponsRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCouponsRPH() {
        return couponsRPH;
    }

    /**
     * 设置couponsRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCouponsRPH(String value) {
        this.couponsRPH = value;
    }

    /**
     * 获取activateDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getActivateDate() {
        return activateDate;
    }

    /**
     * 设置activateDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setActivateDate(XMLGregorianCalendar value) {
        this.activateDate = value;
    }

    /**
     * 获取expiryDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getExpiryDate() {
        return expiryDate;
    }

    /**
     * 设置expiryDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setExpiryDate(XMLGregorianCalendar value) {
        this.expiryDate = value;
    }

    /**
     * 获取group属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroup() {
        return group;
    }

    /**
     * 设置group属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroup(String value) {
        this.group = value;
    }

    /**
     * 获取batchId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBatchId() {
        return batchId;
    }

    /**
     * 设置batchId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBatchId(String value) {
        this.batchId = value;
    }

    /**
     * 获取beneficiaryIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBeneficiaryIDs() {
        return beneficiaryIDs;
    }

    /**
     * 设置beneficiaryIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBeneficiaryIDs(String value) {
        this.beneficiaryIDs = value;
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
     * 获取accountBound属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccountBound() {
        return accountBound;
    }

    /**
     * 设置accountBound属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccountBound(Boolean value) {
        this.accountBound = value;
    }

    /**
     * 获取paymentDetailRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPaymentDetailRPH() {
        return paymentDetailRPH;
    }

    /**
     * 设置paymentDetailRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPaymentDetailRPH(String value) {
        this.paymentDetailRPH = value;
    }

    /**
     * 获取displayValueInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayValueInd() {
        return displayValueInd;
    }

    /**
     * 设置displayValueInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayValueInd(Boolean value) {
        this.displayValueInd = value;
    }

    /**
     * 获取displayPromotionCodeInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDisplayPromotionCodeInd() {
        return displayPromotionCodeInd;
    }

    /**
     * 设置displayPromotionCodeInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDisplayPromotionCodeInd(Boolean value) {
        this.displayPromotionCodeInd = value;
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
     *       &lt;attribute name="Percent" type="{http://www.opentravel.org/OTA/2003/05}Percentage" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Points {

        @XmlAttribute(name = "Percent")
        protected BigDecimal percent;
        @XmlAttribute(name = "Amount")
        protected Float amount;

        /**
         * 获取percent属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getPercent() {
            return percent;
        }

        /**
         * 设置percent属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setPercent(BigDecimal value) {
            this.percent = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setAmount(Float value) {
            this.amount = value;
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
     *         &lt;element name="CrossRefs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Travelers" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Traveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType" maxOccurs="unbounded"/>
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
        "crossRefs",
        "travelers"
    })
    public static class RedemptionInfo {

        @XmlElement(name = "CrossRefs")
        protected CouponType.RedemptionInfo.CrossRefs crossRefs;
        @XmlElement(name = "Travelers")
        protected CouponType.RedemptionInfo.Travelers travelers;

        /**
         * 获取crossRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CouponType.RedemptionInfo.CrossRefs }
         *     
         */
        public CouponType.RedemptionInfo.CrossRefs getCrossRefs() {
            return crossRefs;
        }

        /**
         * 设置crossRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CouponType.RedemptionInfo.CrossRefs }
         *     
         */
        public void setCrossRefs(CouponType.RedemptionInfo.CrossRefs value) {
            this.crossRefs = value;
        }

        /**
         * 获取travelers属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CouponType.RedemptionInfo.Travelers }
         *     
         */
        public CouponType.RedemptionInfo.Travelers getTravelers() {
            return travelers;
        }

        /**
         * 设置travelers属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CouponType.RedemptionInfo.Travelers }
         *     
         */
        public void setTravelers(CouponType.RedemptionInfo.Travelers value) {
            this.travelers = value;
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
         *         &lt;element name="UniqueID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
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
            "uniqueID"
        })
        public static class CrossRefs {

            @XmlElement(name = "UniqueID")
            protected UniqueIDType uniqueID;

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
         *         &lt;element name="Traveler" type="{http://www.opentravel.org/OTA/2003/05}AirTravelerType" maxOccurs="unbounded"/>
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
            "traveler"
        })
        public static class Travelers {

            @XmlElement(name = "Traveler", required = true)
            protected List<AirTravelerType> traveler;

            /**
             * Gets the value of the traveler property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the traveler property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getTraveler().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirTravelerType }
             * 
             * 
             */
            public List<AirTravelerType> getTraveler() {
                if (traveler == null) {
                    traveler = new ArrayList<AirTravelerType>();
                }
                return this.traveler;
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
     *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="TicketingStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="TicketTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Ticketing {

        @XmlAttribute(name = "eTicketNumber")
        @XmlSchemaType(name = "anySimpleType")
        protected String eTicketNumber;
        @XmlAttribute(name = "TicketingStatus")
        protected String ticketingStatus;
        @XmlAttribute(name = "TicketTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar ticketTime;

        /**
         * 获取eTicketNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getETicketNumber() {
            return eTicketNumber;
        }

        /**
         * 设置eTicketNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setETicketNumber(String value) {
            this.eTicketNumber = value;
        }

        /**
         * 获取ticketingStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketingStatus() {
            return ticketingStatus;
        }

        /**
         * 设置ticketingStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketingStatus(String value) {
            this.ticketingStatus = value;
        }

        /**
         * 获取ticketTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTicketTime() {
            return ticketTime;
        }

        /**
         * 设置ticketTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTicketTime(XMLGregorianCalendar value) {
            this.ticketTime = value;
        }

    }

}
