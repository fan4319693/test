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
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Contains a quote response for a single insurance plan.
 * 
 * <p>PlanForQuoteRSType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PlanForQuoteRSType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuoteDetail">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
 *                   &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *                   &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
 *                   &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InsCoverageDetail" type="{http://www.opentravel.org/OTA/2003/05}InsCoverageDetailType" minOccurs="0"/>
 *         &lt;element name="PlanCost">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
 *                 &lt;sequence>
 *                   &lt;element name="ExchangeRate" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ReportingExchangeRates" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="IncrementalPrices" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="IncrementalPrice" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                     &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                                     &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
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
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Contact" type="{http://www.opentravel.org/OTA/2003/05}ContactPersonType" maxOccurs="9" minOccurs="0"/>
 *         &lt;element name="Content" type="{http://www.opentravel.org/OTA/2003/05}InsuranceProductContentType" minOccurs="0"/>
 *         &lt;element name="DefaultContent" type="{http://www.opentravel.org/OTA/2003/05}InsuranceProductContentType" minOccurs="0"/>
 *         &lt;element name="Description" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                 &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="BiasingInfos" type="{http://www.opentravel.org/OTA/2003/05}BiasingInfos" minOccurs="0"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyProductType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PlanID_Group"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InsuranceCoverageAttributesGroup"/>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ComboCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InsuranceID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MinAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxAge" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PlanForQuoteRSType", propOrder = {
    "quoteDetail",
    "insCoverageDetail",
    "planCost",
    "contact",
    "content",
    "defaultContent",
    "description",
    "cancellationPenalties",
    "biasingInfos",
    "loyalty"
})
public class PlanForQuoteRSType {

    @XmlElement(name = "QuoteDetail", required = true)
    protected PlanForQuoteRSType.QuoteDetail quoteDetail;
    @XmlElement(name = "InsCoverageDetail")
    protected InsCoverageDetailType insCoverageDetail;
    @XmlElement(name = "PlanCost", required = true)
    protected PlanForQuoteRSType.PlanCost planCost;
    @XmlElement(name = "Contact")
    protected List<ContactPersonType> contact;
    @XmlElement(name = "Content")
    protected InsuranceProductContentType content;
    @XmlElement(name = "DefaultContent")
    protected InsuranceProductContentType defaultContent;
    @XmlElement(name = "Description")
    protected List<PlanForQuoteRSType.Description> description;
    @XmlElement(name = "CancellationPenalties")
    protected CancelPenaltiesType cancellationPenalties;
    @XmlElement(name = "BiasingInfos")
    protected BiasingInfos biasingInfos;
    @XmlElement(name = "Loyalty")
    protected LoyaltyProductType loyalty;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "ComboCode")
    protected String comboCode;
    @XmlAttribute(name = "InsuranceID")
    protected Integer insuranceID;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "MinAge")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger minAge;
    @XmlAttribute(name = "MaxAge")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxAge;
    @XmlAttribute(name = "PlanID", required = true)
    protected String planID;
    @XmlAttribute(name = "Name")
    protected String name;
    @XmlAttribute(name = "Type")
    protected String type;
    @XmlAttribute(name = "TypeID")
    protected String typeID;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;
    @XmlAttribute(name = "PricingBySegments")
    protected Boolean pricingBySegments;
    @XmlAttribute(name = "BookPartSegments")
    protected Boolean bookPartSegments;
    @XmlAttribute(name = "SelectedByDefault")
    protected Boolean selectedByDefault;
    @XmlAttribute(name = "MaximumAmountToBook")
    protected BigInteger maximumAmountToBook;
    @XmlAttribute(name = "TypeOfPassenger")
    protected String typeOfPassenger;
    @XmlAttribute(name = "RefundInsuranceAlone")
    protected Boolean refundInsuranceAlone;
    @XmlAttribute(name = "RefundAloneByAgent")
    protected Boolean refundAloneByAgent;
    @XmlAttribute(name = "RefundInsuranceWithAirTicket")
    protected Boolean refundInsuranceWithAirTicket;
    @XmlAttribute(name = "TimeToRefund")
    protected String timeToRefund;
    @XmlAttribute(name = "ReshopRule")
    protected String reshopRule;
    @XmlAttribute(name = "ReshopRuleUrl")
    protected String reshopRuleUrl;
    @XmlAttribute(name = "Status")
    protected String status;
    @XmlAttribute(name = "ProtocolID")
    protected String protocolID;
    @XmlAttribute(name = "ProductID")
    protected String productID;
    @XmlAttribute(name = "SalesAgencyCode")
    protected String salesAgencyCode;
    @XmlAttribute(name = "SegmentBased")
    protected Boolean segmentBased;

    /**
     * 获取quoteDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanForQuoteRSType.QuoteDetail }
     *     
     */
    public PlanForQuoteRSType.QuoteDetail getQuoteDetail() {
        return quoteDetail;
    }

    /**
     * 设置quoteDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanForQuoteRSType.QuoteDetail }
     *     
     */
    public void setQuoteDetail(PlanForQuoteRSType.QuoteDetail value) {
        this.quoteDetail = value;
    }

    /**
     * 获取insCoverageDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public InsCoverageDetailType getInsCoverageDetail() {
        return insCoverageDetail;
    }

    /**
     * 设置insCoverageDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageDetailType }
     *     
     */
    public void setInsCoverageDetail(InsCoverageDetailType value) {
        this.insCoverageDetail = value;
    }

    /**
     * 获取planCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PlanForQuoteRSType.PlanCost }
     *     
     */
    public PlanForQuoteRSType.PlanCost getPlanCost() {
        return planCost;
    }

    /**
     * 设置planCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PlanForQuoteRSType.PlanCost }
     *     
     */
    public void setPlanCost(PlanForQuoteRSType.PlanCost value) {
        this.planCost = value;
    }

    /**
     * Gets the value of the contact property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the contact property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getContact().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ContactPersonType }
     * 
     * 
     */
    public List<ContactPersonType> getContact() {
        if (contact == null) {
            contact = new ArrayList<ContactPersonType>();
        }
        return this.contact;
    }

    /**
     * 获取content属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsuranceProductContentType }
     *     
     */
    public InsuranceProductContentType getContent() {
        return content;
    }

    /**
     * 设置content属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceProductContentType }
     *     
     */
    public void setContent(InsuranceProductContentType value) {
        this.content = value;
    }

    /**
     * 获取defaultContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsuranceProductContentType }
     *     
     */
    public InsuranceProductContentType getDefaultContent() {
        return defaultContent;
    }

    /**
     * 设置defaultContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsuranceProductContentType }
     *     
     */
    public void setDefaultContent(InsuranceProductContentType value) {
        this.defaultContent = value;
    }

    /**
     * Gets the value of the description property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the description property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PlanForQuoteRSType.Description }
     * 
     * 
     */
    public List<PlanForQuoteRSType.Description> getDescription() {
        if (description == null) {
            description = new ArrayList<PlanForQuoteRSType.Description>();
        }
        return this.description;
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
     * 获取biasingInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BiasingInfos }
     *     
     */
    public BiasingInfos getBiasingInfos() {
        return biasingInfos;
    }

    /**
     * 设置biasingInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BiasingInfos }
     *     
     */
    public void setBiasingInfos(BiasingInfos value) {
        this.biasingInfos = value;
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
     * 获取comboCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getComboCode() {
        return comboCode;
    }

    /**
     * 设置comboCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setComboCode(String value) {
        this.comboCode = value;
    }

    /**
     * 获取insuranceID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getInsuranceID() {
        return insuranceID;
    }

    /**
     * 设置insuranceID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setInsuranceID(Integer value) {
        this.insuranceID = value;
    }

    /**
     * 获取supplierCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSupplierCode() {
        return supplierCode;
    }

    /**
     * 设置supplierCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSupplierCode(String value) {
        this.supplierCode = value;
    }

    /**
     * 获取minAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMinAge() {
        return minAge;
    }

    /**
     * 设置minAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMinAge(BigInteger value) {
        this.minAge = value;
    }

    /**
     * 获取maxAge属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxAge() {
        return maxAge;
    }

    /**
     * 设置maxAge属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxAge(BigInteger value) {
        this.maxAge = value;
    }

    /**
     * 获取planID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlanID() {
        return planID;
    }

    /**
     * 设置planID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlanID(String value) {
        this.planID = value;
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
     * 获取typeID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeID() {
        return typeID;
    }

    /**
     * 设置typeID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeID(String value) {
        this.typeID = value;
    }

    /**
     * 获取codeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeContext() {
        return codeContext;
    }

    /**
     * 设置codeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeContext(String value) {
        this.codeContext = value;
    }

    /**
     * 获取pricingBySegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isPricingBySegments() {
        return pricingBySegments;
    }

    /**
     * 设置pricingBySegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setPricingBySegments(Boolean value) {
        this.pricingBySegments = value;
    }

    /**
     * 获取bookPartSegments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookPartSegments() {
        return bookPartSegments;
    }

    /**
     * 设置bookPartSegments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookPartSegments(Boolean value) {
        this.bookPartSegments = value;
    }

    /**
     * 获取selectedByDefault属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectedByDefault() {
        return selectedByDefault;
    }

    /**
     * 设置selectedByDefault属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectedByDefault(Boolean value) {
        this.selectedByDefault = value;
    }

    /**
     * 获取maximumAmountToBook属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaximumAmountToBook() {
        return maximumAmountToBook;
    }

    /**
     * 设置maximumAmountToBook属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaximumAmountToBook(BigInteger value) {
        this.maximumAmountToBook = value;
    }

    /**
     * 获取typeOfPassenger属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTypeOfPassenger() {
        return typeOfPassenger;
    }

    /**
     * 设置typeOfPassenger属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTypeOfPassenger(String value) {
        this.typeOfPassenger = value;
    }

    /**
     * 获取refundInsuranceAlone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInsuranceAlone() {
        return refundInsuranceAlone;
    }

    /**
     * 设置refundInsuranceAlone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInsuranceAlone(Boolean value) {
        this.refundInsuranceAlone = value;
    }

    /**
     * 获取refundAloneByAgent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundAloneByAgent() {
        return refundAloneByAgent;
    }

    /**
     * 设置refundAloneByAgent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundAloneByAgent(Boolean value) {
        this.refundAloneByAgent = value;
    }

    /**
     * 获取refundInsuranceWithAirTicket属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isRefundInsuranceWithAirTicket() {
        return refundInsuranceWithAirTicket;
    }

    /**
     * 设置refundInsuranceWithAirTicket属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRefundInsuranceWithAirTicket(Boolean value) {
        this.refundInsuranceWithAirTicket = value;
    }

    /**
     * 获取timeToRefund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeToRefund() {
        return timeToRefund;
    }

    /**
     * 设置timeToRefund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeToRefund(String value) {
        this.timeToRefund = value;
    }

    /**
     * 获取reshopRule属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReshopRule() {
        return reshopRule;
    }

    /**
     * 设置reshopRule属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReshopRule(String value) {
        this.reshopRule = value;
    }

    /**
     * 获取reshopRuleUrl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReshopRuleUrl() {
        return reshopRuleUrl;
    }

    /**
     * 设置reshopRuleUrl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReshopRuleUrl(String value) {
        this.reshopRuleUrl = value;
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
     * 获取protocolID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProtocolID() {
        return protocolID;
    }

    /**
     * 设置protocolID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProtocolID(String value) {
        this.protocolID = value;
    }

    /**
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductID(String value) {
        this.productID = value;
    }

    /**
     * 获取salesAgencyCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSalesAgencyCode() {
        return salesAgencyCode;
    }

    /**
     * 设置salesAgencyCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSalesAgencyCode(String value) {
        this.salesAgencyCode = value;
    }

    /**
     * 获取segmentBased属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSegmentBased() {
        return segmentBased;
    }

    /**
     * 设置segmentBased属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSegmentBased(Boolean value) {
        this.segmentBased = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *       &lt;attribute name="Name" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Language" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    public static class Description {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Name")
        @XmlSchemaType(name = "anySimpleType")
        protected String name;
        @XmlAttribute(name = "Language")
        @XmlSchemaType(name = "anySimpleType")
        protected String language;

        /**
         * 获取value属性的值。
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PlanCostType">
     *       &lt;sequence>
     *         &lt;element name="ExchangeRate" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ReportingExchangeRates" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExchangeRateGroup"/>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="IncrementalPrices" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="IncrementalPrice" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                           &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *                           &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
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
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "exchangeRate",
        "reportingExchangeRates",
        "incrementalPrices"
    })
    public static class PlanCost
        extends PlanCostType
    {

        @XmlElement(name = "ExchangeRate")
        protected PlanForQuoteRSType.PlanCost.ExchangeRate exchangeRate;
        @XmlElement(name = "ReportingExchangeRates")
        protected PlanForQuoteRSType.PlanCost.ReportingExchangeRates reportingExchangeRates;
        @XmlElement(name = "IncrementalPrices")
        protected PlanForQuoteRSType.PlanCost.IncrementalPrices incrementalPrices;

        /**
         * 获取exchangeRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlanForQuoteRSType.PlanCost.ExchangeRate }
         *     
         */
        public PlanForQuoteRSType.PlanCost.ExchangeRate getExchangeRate() {
            return exchangeRate;
        }

        /**
         * 设置exchangeRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlanForQuoteRSType.PlanCost.ExchangeRate }
         *     
         */
        public void setExchangeRate(PlanForQuoteRSType.PlanCost.ExchangeRate value) {
            this.exchangeRate = value;
        }

        /**
         * 获取reportingExchangeRates属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlanForQuoteRSType.PlanCost.ReportingExchangeRates }
         *     
         */
        public PlanForQuoteRSType.PlanCost.ReportingExchangeRates getReportingExchangeRates() {
            return reportingExchangeRates;
        }

        /**
         * 设置reportingExchangeRates属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlanForQuoteRSType.PlanCost.ReportingExchangeRates }
         *     
         */
        public void setReportingExchangeRates(PlanForQuoteRSType.PlanCost.ReportingExchangeRates value) {
            this.reportingExchangeRates = value;
        }

        /**
         * 获取incrementalPrices属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlanForQuoteRSType.PlanCost.IncrementalPrices }
         *     
         */
        public PlanForQuoteRSType.PlanCost.IncrementalPrices getIncrementalPrices() {
            return incrementalPrices;
        }

        /**
         * 设置incrementalPrices属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlanForQuoteRSType.PlanCost.IncrementalPrices }
         *     
         */
        public void setIncrementalPrices(PlanForQuoteRSType.PlanCost.IncrementalPrices value) {
            this.incrementalPrices = value;
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
         *         &lt;element name="IncrementalPrice" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
         *                 &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
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
            "incrementalPrice"
        })
        public static class IncrementalPrices {

            @XmlElement(name = "IncrementalPrice", required = true)
            protected List<PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice> incrementalPrice;

            /**
             * Gets the value of the incrementalPrice property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the incrementalPrice property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getIncrementalPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice }
             * 
             * 
             */
            public List<PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice> getIncrementalPrice() {
                if (incrementalPrice == null) {
                    incrementalPrice = new ArrayList<PlanForQuoteRSType.PlanCost.IncrementalPrices.IncrementalPrice>();
                }
                return this.incrementalPrice;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
             *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
             *       &lt;attribute name="FrequencyType" type="{http://www.opentravel.org/OTA/2003/05}TimeUnitType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class IncrementalPrice {

                @XmlAttribute(name = "Frequency")
                @XmlSchemaType(name = "positiveInteger")
                protected BigInteger frequency;
                @XmlAttribute(name = "FrequencyType")
                protected String frequencyType;
                @XmlAttribute(name = "Amount")
                protected Float amount;
                @XmlAttribute(name = "PrePayInd")
                protected Boolean prePayInd;
                @XmlAttribute(name = "CurrencyCode")
                protected String currencyCode;
                @XmlAttribute(name = "DecimalPlaces")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger decimalPlaces;
                @XmlAttribute(name = "OriginalAmount")
                protected Float originalAmount;
                @XmlAttribute(name = "OriginalCurrencyCode")
                protected String originalCurrencyCode;

                /**
                 * 获取frequency属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getFrequency() {
                    return frequency;
                }

                /**
                 * 设置frequency属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setFrequency(BigInteger value) {
                    this.frequency = value;
                }

                /**
                 * 获取frequencyType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFrequencyType() {
                    return frequencyType;
                }

                /**
                 * 设置frequencyType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFrequencyType(String value) {
                    this.frequencyType = value;
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

                /**
                 * 获取prePayInd属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isPrePayInd() {
                    return prePayInd;
                }

                /**
                 * 设置prePayInd属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setPrePayInd(Boolean value) {
                    this.prePayInd = value;
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

                /**
                 * 获取decimalPlaces属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getDecimalPlaces() {
                    return decimalPlaces;
                }

                /**
                 * 设置decimalPlaces属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setDecimalPlaces(BigInteger value) {
                    this.decimalPlaces = value;
                }

                /**
                 * 获取originalAmount属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Float }
                 *     
                 */
                public Float getOriginalAmount() {
                    return originalAmount;
                }

                /**
                 * 设置originalAmount属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Float }
                 *     
                 */
                public void setOriginalAmount(Float value) {
                    this.originalAmount = value;
                }

                /**
                 * 获取originalCurrencyCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOriginalCurrencyCode() {
                    return originalCurrencyCode;
                }

                /**
                 * 设置originalCurrencyCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOriginalCurrencyCode(String value) {
                    this.originalCurrencyCode = value;
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
        public static class ReportingExchangeRates {

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
     *         &lt;element name="ProviderCompany" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType"/>
     *         &lt;element name="QuoteDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
     *         &lt;element name="PlanRestrictions" type="{http://www.opentravel.org/OTA/2003/05}PlanRestrictionType" minOccurs="0"/>
     *         &lt;element name="BookingDetailURL" type="{http://www.opentravel.org/OTA/2003/05}URL_Type" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}EffectiveExpireOptionalDateGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "providerCompany",
        "quoteDetailURL",
        "planRestrictions",
        "bookingDetailURL"
    })
    public static class QuoteDetail {

        @XmlElement(name = "ProviderCompany", required = true)
        protected CompanyNameType providerCompany;
        @XmlElement(name = "QuoteDetailURL")
        protected URLType quoteDetailURL;
        @XmlElement(name = "PlanRestrictions")
        protected PlanRestrictionType planRestrictions;
        @XmlElement(name = "BookingDetailURL")
        protected URLType bookingDetailURL;
        @XmlAttribute(name = "EffectiveDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar effectiveDate;
        @XmlAttribute(name = "ExpireDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar expireDate;

        /**
         * 获取providerCompany属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CompanyNameType }
         *     
         */
        public CompanyNameType getProviderCompany() {
            return providerCompany;
        }

        /**
         * 设置providerCompany属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CompanyNameType }
         *     
         */
        public void setProviderCompany(CompanyNameType value) {
            this.providerCompany = value;
        }

        /**
         * 获取quoteDetailURL属性的值。
         * 
         * @return
         *     possible object is
         *     {@link URLType }
         *     
         */
        public URLType getQuoteDetailURL() {
            return quoteDetailURL;
        }

        /**
         * 设置quoteDetailURL属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link URLType }
         *     
         */
        public void setQuoteDetailURL(URLType value) {
            this.quoteDetailURL = value;
        }

        /**
         * 获取planRestrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PlanRestrictionType }
         *     
         */
        public PlanRestrictionType getPlanRestrictions() {
            return planRestrictions;
        }

        /**
         * 设置planRestrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PlanRestrictionType }
         *     
         */
        public void setPlanRestrictions(PlanRestrictionType value) {
            this.planRestrictions = value;
        }

        /**
         * 获取bookingDetailURL属性的值。
         * 
         * @return
         *     possible object is
         *     {@link URLType }
         *     
         */
        public URLType getBookingDetailURL() {
            return bookingDetailURL;
        }

        /**
         * 设置bookingDetailURL属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link URLType }
         *     
         */
        public void setBookingDetailURL(URLType value) {
            this.bookingDetailURL = value;
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

}
