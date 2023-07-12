//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
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
 * <p>PackageProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PackageProductType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Products">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Product" type="{http://www.opentravel.org/OTA/2003/05}ModularProductType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;sequence>
 *           &lt;group ref="{http://www.opentravel.org/OTA/2003/05}PackageCommonElements"/>
 *         &lt;/sequence>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProductIDs"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CommonProductAttributes"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HistoryAttribute"/>
 *       &lt;attribute name="PolicyStatus" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PackageType" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OpaquelyPriced" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SearchID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to128" />
 *       &lt;attribute name="CheapestAlternative" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="IBSAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionCodeType" />
 *       &lt;attribute name="isSwitchSell" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PackageProductType", propOrder = {
    "products",
    "attachments",
    "pricing",
    "remarks",
    "warnings",
    "cancellationPenalties",
    "amendmentPenalties",
    "audits",
    "agent",
    "source",
    "exchangeRate",
    "modifyTypes"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.SuperPNRType.PackageProduct.class
})
public class PackageProductType {

    @XmlElement(name = "Products", required = true)
    protected PackageProductType.Products products;
    @XmlElement(name = "Attachments")
    protected PackageProductType.Attachments attachments;
    @XmlElement(name = "Pricing", required = true)
    protected ProductPricingType pricing;
    @XmlElement(name = "Remarks")
    protected PackageProductType.Remarks remarks;
    @XmlElement(name = "Warnings")
    protected WarningsType warnings;
    @XmlElement(name = "CancellationPenalties")
    protected CancelPenaltiesType cancellationPenalties;
    @XmlElement(name = "AmendmentPenalties")
    protected OJAmendPenaltiesType amendmentPenalties;
    @XmlElement(name = "Audits")
    protected AuditsType audits;
    @XmlElement(name = "Agent")
    protected AgentDetailsType agent;
    @XmlElement(name = "Source")
    protected SourceType source;
    @XmlElement(name = "ExchangeRate")
    protected List<PackageProductType.ExchangeRate> exchangeRate;
    @XmlElement(name = "ModifyTypes")
    protected ModifyTypesType modifyTypes;
    @XmlAttribute(name = "PolicyStatus")
    protected String policyStatus;
    @XmlAttribute(name = "PackageType", required = true)
    protected String packageType;
    @XmlAttribute(name = "OpaquelyPriced", required = true)
    protected boolean opaquelyPriced;
    @XmlAttribute(name = "SearchID")
    protected String searchID;
    @XmlAttribute(name = "CheapestAlternative")
    protected Float cheapestAlternative;
    @XmlAttribute(name = "IBSAmount")
    protected Float ibsAmount;
    @XmlAttribute(name = "Action")
    protected ActionCodeType action;
    @XmlAttribute(name = "isSwitchSell")
    protected Boolean isSwitchSell;
    @XmlAttribute(name = "ProductNumber")
    protected BigInteger productNumber;
    @XmlAttribute(name = "MasterProductNumber")
    protected BigInteger masterProductNumber;
    @XmlAttribute(name = "BookingStatus", required = true)
    protected String bookingStatus;
    @XmlAttribute(name = "CancellationDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar cancellationDate;
    @XmlAttribute(name = "BookingDate")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar bookingDate;
    @XmlAttribute(name = "StartDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar startDate;
    @XmlAttribute(name = "EndDate", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar endDate;
    @XmlAttribute(name = "PromotionType")
    protected String promotionType;
    @XmlAttribute(name = "LastModified", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar lastModified;
    @XmlAttribute(name = "Destination")
    protected String destination;
    @XmlAttribute(name = "HistoryID")
    protected BigInteger historyID;
    @XmlAttribute(name = "Historic")
    protected Boolean historic;
    @XmlAttribute(name = "LiveID")
    protected Integer liveID;

    /**
     * 获取products属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageProductType.Products }
     *     
     */
    public PackageProductType.Products getProducts() {
        return products;
    }

    /**
     * 设置products属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageProductType.Products }
     *     
     */
    public void setProducts(PackageProductType.Products value) {
        this.products = value;
    }

    /**
     * 获取attachments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageProductType.Attachments }
     *     
     */
    public PackageProductType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * 设置attachments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageProductType.Attachments }
     *     
     */
    public void setAttachments(PackageProductType.Attachments value) {
        this.attachments = value;
    }

    /**
     * 获取pricing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductPricingType }
     *     
     */
    public ProductPricingType getPricing() {
        return pricing;
    }

    /**
     * 设置pricing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductPricingType }
     *     
     */
    public void setPricing(ProductPricingType value) {
        this.pricing = value;
    }

    /**
     * 获取remarks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PackageProductType.Remarks }
     *     
     */
    public PackageProductType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PackageProductType.Remarks }
     *     
     */
    public void setRemarks(PackageProductType.Remarks value) {
        this.remarks = value;
    }

    /**
     * 获取warnings属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WarningsType }
     *     
     */
    public WarningsType getWarnings() {
        return warnings;
    }

    /**
     * 设置warnings属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WarningsType }
     *     
     */
    public void setWarnings(WarningsType value) {
        this.warnings = value;
    }

    /**
     * 获取cancellationPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancellationPenalties() {
        return cancellationPenalties;
    }

    /**
     * 设置cancellationPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancellationPenalties(CancelPenaltiesType value) {
        this.cancellationPenalties = value;
    }

    /**
     * 获取amendmentPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public OJAmendPenaltiesType getAmendmentPenalties() {
        return amendmentPenalties;
    }

    /**
     * 设置amendmentPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public void setAmendmentPenalties(OJAmendPenaltiesType value) {
        this.amendmentPenalties = value;
    }

    /**
     * 获取audits属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AuditsType }
     *     
     */
    public AuditsType getAudits() {
        return audits;
    }

    /**
     * 设置audits属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AuditsType }
     *     
     */
    public void setAudits(AuditsType value) {
        this.audits = value;
    }

    /**
     * 获取agent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AgentDetailsType }
     *     
     */
    public AgentDetailsType getAgent() {
        return agent;
    }

    /**
     * 设置agent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AgentDetailsType }
     *     
     */
    public void setAgent(AgentDetailsType value) {
        this.agent = value;
    }

    /**
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SourceType }
     *     
     */
    public SourceType getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SourceType }
     *     
     */
    public void setSource(SourceType value) {
        this.source = value;
    }

    /**
     * Gets the value of the exchangeRate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the exchangeRate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExchangeRate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PackageProductType.ExchangeRate }
     * 
     * 
     */
    public List<PackageProductType.ExchangeRate> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<PackageProductType.ExchangeRate>();
        }
        return this.exchangeRate;
    }

    /**
     * 获取modifyTypes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModifyTypesType }
     *     
     */
    public ModifyTypesType getModifyTypes() {
        return modifyTypes;
    }

    /**
     * 设置modifyTypes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModifyTypesType }
     *     
     */
    public void setModifyTypes(ModifyTypesType value) {
        this.modifyTypes = value;
    }

    /**
     * 获取policyStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPolicyStatus() {
        return policyStatus;
    }

    /**
     * 设置policyStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPolicyStatus(String value) {
        this.policyStatus = value;
    }

    /**
     * 获取packageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPackageType() {
        return packageType;
    }

    /**
     * 设置packageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPackageType(String value) {
        this.packageType = value;
    }

    /**
     * 获取opaquelyPriced属性的值。
     * 
     */
    public boolean isOpaquelyPriced() {
        return opaquelyPriced;
    }

    /**
     * 设置opaquelyPriced属性的值。
     * 
     */
    public void setOpaquelyPriced(boolean value) {
        this.opaquelyPriced = value;
    }

    /**
     * 获取searchID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchID() {
        return searchID;
    }

    /**
     * 设置searchID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchID(String value) {
        this.searchID = value;
    }

    /**
     * 获取cheapestAlternative属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getCheapestAlternative() {
        return cheapestAlternative;
    }

    /**
     * 设置cheapestAlternative属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setCheapestAlternative(Float value) {
        this.cheapestAlternative = value;
    }

    /**
     * 获取ibsAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getIBSAmount() {
        return ibsAmount;
    }

    /**
     * 设置ibsAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setIBSAmount(Float value) {
        this.ibsAmount = value;
    }

    /**
     * 获取action属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ActionCodeType }
     *     
     */
    public ActionCodeType getAction() {
        return action;
    }

    /**
     * 设置action属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ActionCodeType }
     *     
     */
    public void setAction(ActionCodeType value) {
        this.action = value;
    }

    /**
     * 获取isSwitchSell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsSwitchSell() {
        return isSwitchSell;
    }

    /**
     * 设置isSwitchSell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsSwitchSell(Boolean value) {
        this.isSwitchSell = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductNumber(BigInteger value) {
        this.productNumber = value;
    }

    /**
     * 获取masterProductNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMasterProductNumber() {
        return masterProductNumber;
    }

    /**
     * 设置masterProductNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMasterProductNumber(BigInteger value) {
        this.masterProductNumber = value;
    }

    /**
     * 获取bookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 设置bookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * 获取cancellationDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getCancellationDate() {
        return cancellationDate;
    }

    /**
     * 设置cancellationDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setCancellationDate(XMLGregorianCalendar value) {
        this.cancellationDate = value;
    }

    /**
     * 获取bookingDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getBookingDate() {
        return bookingDate;
    }

    /**
     * 设置bookingDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setBookingDate(XMLGregorianCalendar value) {
        this.bookingDate = value;
    }

    /**
     * 获取startDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getStartDate() {
        return startDate;
    }

    /**
     * 设置startDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setStartDate(XMLGregorianCalendar value) {
        this.startDate = value;
    }

    /**
     * 获取endDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getEndDate() {
        return endDate;
    }

    /**
     * 设置endDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setEndDate(XMLGregorianCalendar value) {
        this.endDate = value;
    }

    /**
     * 获取promotionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromotionType() {
        return promotionType;
    }

    /**
     * 设置promotionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromotionType(String value) {
        this.promotionType = value;
    }

    /**
     * 获取lastModified属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getLastModified() {
        return lastModified;
    }

    /**
     * 设置lastModified属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setLastModified(XMLGregorianCalendar value) {
        this.lastModified = value;
    }

    /**
     * 获取destination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDestination() {
        return destination;
    }

    /**
     * 设置destination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDestination(String value) {
        this.destination = value;
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
     * 获取liveID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLiveID() {
        return liveID;
    }

    /**
     * 设置liveID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLiveID(Integer value) {
        this.liveID = value;
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
     *         &lt;element name="Attachment" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AttachmentsType">
     *                 &lt;sequence>
     *                   &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "attachment"
    })
    public static class Attachments {

        @XmlElement(name = "Attachment")
        protected List<PackageProductType.Attachments.Attachment> attachment;

        /**
         * Gets the value of the attachment property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the attachment property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAttachment().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PackageProductType.Attachments.Attachment }
         * 
         * 
         */
        public List<PackageProductType.Attachments.Attachment> getAttachment() {
            if (attachment == null) {
                attachment = new ArrayList<PackageProductType.Attachments.Attachment>();
            }
            return this.attachment;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AttachmentsType">
         *       &lt;sequence>
         *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
         *       &lt;/sequence>
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "agent"
        })
        public static class Attachment
            extends AttachmentsType
        {

            @XmlElement(name = "Agent")
            protected AgentDetailsType agent;

            /**
             * 获取agent属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AgentDetailsType }
             *     
             */
            public AgentDetailsType getAgent() {
                return agent;
            }

            /**
             * 设置agent属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AgentDetailsType }
             *     
             */
            public void setAgent(AgentDetailsType value) {
                this.agent = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ExchangeRate {

        @XmlAttribute(name = "FromCurrency")
        protected String fromCurrency;
        @XmlAttribute(name = "ToCurrency")
        protected String toCurrency;
        @XmlAttribute(name = "Rate")
        protected BigDecimal rate;
        @XmlAttribute(name = "Date")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar date;
        @XmlAttribute(name = "CompanyID")
        protected String companyID;
        @XmlAttribute(name = "RateID")
        protected String rateID;

        /**
         * 获取fromCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFromCurrency() {
            return fromCurrency;
        }

        /**
         * 设置fromCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFromCurrency(String value) {
            this.fromCurrency = value;
        }

        /**
         * 获取toCurrency属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getToCurrency() {
            return toCurrency;
        }

        /**
         * 设置toCurrency属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setToCurrency(String value) {
            this.toCurrency = value;
        }

        /**
         * 获取rate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getRate() {
            return rate;
        }

        /**
         * 设置rate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setRate(BigDecimal value) {
            this.rate = value;
        }

        /**
         * 获取date属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDate() {
            return date;
        }

        /**
         * 设置date属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDate(XMLGregorianCalendar value) {
            this.date = value;
        }

        /**
         * 获取companyID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCompanyID() {
            return companyID;
        }

        /**
         * 设置companyID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCompanyID(String value) {
            this.companyID = value;
        }

        /**
         * 获取rateID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateID() {
            return rateID;
        }

        /**
         * 设置rateID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateID(String value) {
            this.rateID = value;
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
     *         &lt;element name="Product" type="{http://www.opentravel.org/OTA/2003/05}ModularProductType" maxOccurs="unbounded" minOccurs="0"/>
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
        "product"
    })
    public static class Products {

        @XmlElement(name = "Product")
        protected List<ModularProductType> product;

        /**
         * Gets the value of the product property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the product property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getProduct().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModularProductType }
         * 
         * 
         */
        public List<ModularProductType> getProduct() {
            if (product == null) {
                product = new ArrayList<ModularProductType>();
            }
            return this.product;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RemarksType">
     *       &lt;sequence>
     *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}OJ_RemarkType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "remark"
    })
    public static class Remarks
        extends RemarksType
    {

        @XmlElement(name = "Remark")
        protected List<OJRemarkType> remark;

        /**
         * Gets the value of the remark property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the remark property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRemark().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OJRemarkType }
         * 
         * 
         */
        public List<OJRemarkType> getRemark() {
            if (remark == null) {
                remark = new ArrayList<OJRemarkType>();
            }
            return this.remark;
        }

    }

}
