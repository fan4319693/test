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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>SPNR_PriceAdjustmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SPNR_PriceAdjustmentType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *         &lt;element name="Loyalty" type="{http://www.opentravel.org/OTA/2003/05}LoyaltyPricingType" minOccurs="0"/>
 *         &lt;element name="SaleDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="TravelDateRange" type="{http://www.opentravel.org/OTA/2003/05}DateRangeType" maxOccurs="unbounded" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceAdjustmentBaseAttributes"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SPNR_PriceAdjustmentAttributes"/>
 *       &lt;attribute name="UnitAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="Currency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="PassengerTypeCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="PassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SPNR_PriceAdjustmentType", propOrder = {
    "agent",
    "loyalty",
    "saleDateRange",
    "travelDateRange"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SPNRPriceAdjustmentsType.PriceAdjustment.class
})
public class SPNRPriceAdjustmentType {

    @XmlElement(name = "Agent")
    protected AgentDetailsType agent;
    @XmlElement(name = "Loyalty")
    protected LoyaltyPricingType loyalty;
    @XmlElement(name = "SaleDateRange")
    protected List<DateRangeType> saleDateRange;
    @XmlElement(name = "TravelDateRange")
    protected List<DateRangeType> travelDateRange;
    @XmlAttribute(name = "UnitAmount")
    protected Float unitAmount;
    @XmlAttribute(name = "AuditID")
    protected Integer auditID;
    @XmlAttribute(name = "PaymentID")
    protected BigInteger paymentID;
    @XmlAttribute(name = "Currency")
    protected String currency;
    @XmlAttribute(name = "PassengerTypeCode")
    protected String passengerTypeCode;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "PassengerRPH")
    protected String passengerRPH;
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
    @XmlAttribute(name = "Modular")
    protected Boolean modular;
    @XmlAttribute(name = "CostCentre")
    protected String costCentre;
    @XmlAttribute(name = "Manual")
    protected Boolean manual;
    @XmlAttribute(name = "Date", required = true)
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "Code1")
    protected String code1;
    @XmlAttribute(name = "Code2")
    protected String code2;
    @XmlAttribute(name = "Exclusivity")
    protected String exclusivity;
    @XmlAttribute(name = "Group")
    protected String group;
    @XmlAttribute(name = "Percent")
    protected BigDecimal percent;
    @XmlAttribute(name = "ProductType")
    protected String productType;
    @XmlAttribute(name = "Stage")
    protected String stage;
    @XmlAttribute(name = "Multiplier")
    protected Float multiplier;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "CodeContext")
    protected String codeContext;

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
     * 获取loyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link LoyaltyPricingType }
     *     
     */
    public LoyaltyPricingType getLoyalty() {
        return loyalty;
    }

    /**
     * 设置loyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LoyaltyPricingType }
     *     
     */
    public void setLoyalty(LoyaltyPricingType value) {
        this.loyalty = value;
    }

    /**
     * Gets the value of the saleDateRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the saleDateRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSaleDateRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangeType }
     * 
     * 
     */
    public List<DateRangeType> getSaleDateRange() {
        if (saleDateRange == null) {
            saleDateRange = new ArrayList<DateRangeType>();
        }
        return this.saleDateRange;
    }

    /**
     * Gets the value of the travelDateRange property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelDateRange property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelDateRange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DateRangeType }
     * 
     * 
     */
    public List<DateRangeType> getTravelDateRange() {
        if (travelDateRange == null) {
            travelDateRange = new ArrayList<DateRangeType>();
        }
        return this.travelDateRange;
    }

    /**
     * 获取unitAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getUnitAmount() {
        return unitAmount;
    }

    /**
     * 设置unitAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setUnitAmount(Float value) {
        this.unitAmount = value;
    }

    /**
     * 获取auditID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getAuditID() {
        return auditID;
    }

    /**
     * 设置auditID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setAuditID(Integer value) {
        this.auditID = value;
    }

    /**
     * 获取paymentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getPaymentID() {
        return paymentID;
    }

    /**
     * 设置paymentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setPaymentID(BigInteger value) {
        this.paymentID = value;
    }

    /**
     * 获取currency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCurrency() {
        return currency;
    }

    /**
     * 设置currency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCurrency(String value) {
        this.currency = value;
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
     * 获取flightSegmentRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFlightSegmentRPH() {
        return flightSegmentRPH;
    }

    /**
     * 设置flightSegmentRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFlightSegmentRPH(String value) {
        this.flightSegmentRPH = value;
    }

    /**
     * 获取passengerRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPassengerRPH() {
        return passengerRPH;
    }

    /**
     * 设置passengerRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPassengerRPH(String value) {
        this.passengerRPH = value;
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

    /**
     * 获取modular属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isModular() {
        return modular;
    }

    /**
     * 设置modular属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setModular(Boolean value) {
        this.modular = value;
    }

    /**
     * 获取costCentre属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCostCentre() {
        return costCentre;
    }

    /**
     * 设置costCentre属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCostCentre(String value) {
        this.costCentre = value;
    }

    /**
     * 获取manual属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isManual() {
        return manual;
    }

    /**
     * 设置manual属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setManual(Boolean value) {
        this.manual = value;
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
     * 获取code1属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode1() {
        return code1;
    }

    /**
     * 设置code1属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode1(String value) {
        this.code1 = value;
    }

    /**
     * 获取code2属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCode2() {
        return code2;
    }

    /**
     * 设置code2属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCode2(String value) {
        this.code2 = value;
    }

    /**
     * 获取exclusivity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExclusivity() {
        return exclusivity;
    }

    /**
     * 设置exclusivity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExclusivity(String value) {
        this.exclusivity = value;
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
     * 获取productType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProductType() {
        return productType;
    }

    /**
     * 设置productType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProductType(String value) {
        this.productType = value;
    }

    /**
     * 获取stage属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStage() {
        return stage;
    }

    /**
     * 设置stage属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStage(String value) {
        this.stage = value;
    }

    /**
     * 获取multiplier属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Float }
     *     
     */
    public Float getMultiplier() {
        return multiplier;
    }

    /**
     * 设置multiplier属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Float }
     *     
     */
    public void setMultiplier(Float value) {
        this.multiplier = value;
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

}
