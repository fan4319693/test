//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
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
 * <p>CancellationRefundType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CancellationRefundType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Agent" type="{http://www.opentravel.org/OTA/2003/05}AgentDetailsType" minOccurs="0"/>
 *         &lt;element name="SupplierCost" type="{http://www.opentravel.org/OTA/2003/05}SupplierCostType" minOccurs="0"/>
 *         &lt;element name="CancellationRefund" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CancellationRefundDetailsType">
 *                 &lt;sequence>
 *                   &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
 *                   &lt;element name="Other" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
 *         &lt;element name="Taxes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Other" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
 *         &lt;element name="Ticketing" type="{http://www.opentravel.org/OTA/2003/05}TicketingFullInfo_Type" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="ReissueFee" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}double" />
 *       &lt;attribute name="Date" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="FlightSegmentRPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Related" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RefundNature" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AllowRef" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="AllowAuto" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="InTime" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="TimeLim" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CancelPercent" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MasterProductNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="ProductNumber" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="RoomIndex" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="eTicketNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Source" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CancellationRefundType", propOrder = {
    "agent",
    "supplierCost",
    "cancellationRefund",
    "baseFare",
    "taxes",
    "other",
    "ticketing",
    "reissueFee"
})
public class CancellationRefundType {

    @XmlElement(name = "Agent")
    protected AgentDetailsType agent;
    @XmlElement(name = "SupplierCost")
    protected SupplierCostType supplierCost;
    @XmlElement(name = "CancellationRefund")
    protected CancellationRefundType.CancellationRefund cancellationRefund;
    @XmlElement(name = "BaseFare")
    protected SPNRFareType baseFare;
    @XmlElement(name = "Taxes")
    protected CancellationRefundType.Taxes taxes;
    @XmlElement(name = "Other")
    protected SPNRFareType other;
    @XmlElement(name = "Ticketing")
    protected List<TicketingFullInfoType> ticketing;
    @XmlElement(name = "ReissueFee")
    protected CancellationRefundType.ReissueFee reissueFee;
    @XmlAttribute(name = "Quantity")
    protected Double quantity;
    @XmlAttribute(name = "Date")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar date;
    @XmlAttribute(name = "AuditID")
    protected Integer auditID;
    @XmlAttribute(name = "FlightSegmentRPH")
    protected String flightSegmentRPH;
    @XmlAttribute(name = "OriginDestinationRPH")
    protected String originDestinationRPH;
    @XmlAttribute(name = "OJ_SuperPNR_RPH")
    protected String ojSuperPNRRPH;
    @XmlAttribute(name = "Related")
    protected String related;
    @XmlAttribute(name = "RefundNature")
    protected String refundNature;
    @XmlAttribute(name = "AllowRef")
    protected String allowRef;
    @XmlAttribute(name = "AllowAuto")
    protected String allowAuto;
    @XmlAttribute(name = "InTime")
    protected String inTime;
    @XmlAttribute(name = "TimeLim")
    protected String timeLim;
    @XmlAttribute(name = "CancelPercent")
    protected String cancelPercent;
    @XmlAttribute(name = "MasterProductNumber")
    protected Integer masterProductNumber;
    @XmlAttribute(name = "ProductNumber")
    protected Integer productNumber;
    @XmlAttribute(name = "RoomIndex")
    protected String roomIndex;
    @XmlAttribute(name = "eTicketNumber")
    protected String eTicketNumber;
    @XmlAttribute(name = "Source")
    protected String source;
    @XmlAttribute(name = "ProductType")
    protected String productType;
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
     * 获取supplierCost属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierCostType }
     *     
     */
    public SupplierCostType getSupplierCost() {
        return supplierCost;
    }

    /**
     * 设置supplierCost属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierCostType }
     *     
     */
    public void setSupplierCost(SupplierCostType value) {
        this.supplierCost = value;
    }

    /**
     * 获取cancellationRefund属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationRefundType.CancellationRefund }
     *     
     */
    public CancellationRefundType.CancellationRefund getCancellationRefund() {
        return cancellationRefund;
    }

    /**
     * 设置cancellationRefund属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRefundType.CancellationRefund }
     *     
     */
    public void setCancellationRefund(CancellationRefundType.CancellationRefund value) {
        this.cancellationRefund = value;
    }

    /**
     * 获取baseFare属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SPNRFareType }
     *     
     */
    public SPNRFareType getBaseFare() {
        return baseFare;
    }

    /**
     * 设置baseFare属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SPNRFareType }
     *     
     */
    public void setBaseFare(SPNRFareType value) {
        this.baseFare = value;
    }

    /**
     * 获取taxes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationRefundType.Taxes }
     *     
     */
    public CancellationRefundType.Taxes getTaxes() {
        return taxes;
    }

    /**
     * 设置taxes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRefundType.Taxes }
     *     
     */
    public void setTaxes(CancellationRefundType.Taxes value) {
        this.taxes = value;
    }

    /**
     * 获取other属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SPNRFareType }
     *     
     */
    public SPNRFareType getOther() {
        return other;
    }

    /**
     * 设置other属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SPNRFareType }
     *     
     */
    public void setOther(SPNRFareType value) {
        this.other = value;
    }

    /**
     * Gets the value of the ticketing property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketing property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketing().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TicketingFullInfoType }
     * 
     * 
     */
    public List<TicketingFullInfoType> getTicketing() {
        if (ticketing == null) {
            ticketing = new ArrayList<TicketingFullInfoType>();
        }
        return this.ticketing;
    }

    /**
     * 获取reissueFee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancellationRefundType.ReissueFee }
     *     
     */
    public CancellationRefundType.ReissueFee getReissueFee() {
        return reissueFee;
    }

    /**
     * 设置reissueFee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancellationRefundType.ReissueFee }
     *     
     */
    public void setReissueFee(CancellationRefundType.ReissueFee value) {
        this.reissueFee = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Double }
     *     
     */
    public Double getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Double }
     *     
     */
    public void setQuantity(Double value) {
        this.quantity = value;
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
     * 获取originDestinationRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOriginDestinationRPH() {
        return originDestinationRPH;
    }

    /**
     * 设置originDestinationRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOriginDestinationRPH(String value) {
        this.originDestinationRPH = value;
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
     * 获取related属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRelated() {
        return related;
    }

    /**
     * 设置related属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRelated(String value) {
        this.related = value;
    }

    /**
     * 获取refundNature属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundNature() {
        return refundNature;
    }

    /**
     * 设置refundNature属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundNature(String value) {
        this.refundNature = value;
    }

    /**
     * 获取allowRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowRef() {
        return allowRef;
    }

    /**
     * 设置allowRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowRef(String value) {
        this.allowRef = value;
    }

    /**
     * 获取allowAuto属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAllowAuto() {
        return allowAuto;
    }

    /**
     * 设置allowAuto属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAllowAuto(String value) {
        this.allowAuto = value;
    }

    /**
     * 获取inTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInTime() {
        return inTime;
    }

    /**
     * 设置inTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInTime(String value) {
        this.inTime = value;
    }

    /**
     * 获取timeLim属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeLim() {
        return timeLim;
    }

    /**
     * 设置timeLim属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeLim(String value) {
        this.timeLim = value;
    }

    /**
     * 获取cancelPercent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCancelPercent() {
        return cancelPercent;
    }

    /**
     * 设置cancelPercent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCancelPercent(String value) {
        this.cancelPercent = value;
    }

    /**
     * 获取masterProductNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMasterProductNumber() {
        return masterProductNumber;
    }

    /**
     * 设置masterProductNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMasterProductNumber(Integer value) {
        this.masterProductNumber = value;
    }

    /**
     * 获取productNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getProductNumber() {
        return productNumber;
    }

    /**
     * 设置productNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setProductNumber(Integer value) {
        this.productNumber = value;
    }

    /**
     * 获取roomIndex属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRoomIndex() {
        return roomIndex;
    }

    /**
     * 设置roomIndex属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRoomIndex(String value) {
        this.roomIndex = value;
    }

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
     * 获取source属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSource() {
        return source;
    }

    /**
     * 设置source属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSource(String value) {
        this.source = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CancellationRefundDetailsType">
     *       &lt;sequence>
     *         &lt;element name="BaseFare" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
     *         &lt;element name="Other" type="{http://www.opentravel.org/OTA/2003/05}SPNRFareType" minOccurs="0"/>
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
        "baseFare",
        "tax",
        "other"
    })
    public static class CancellationRefund
        extends CancellationRefundDetailsType
    {

        @XmlElement(name = "BaseFare")
        protected SPNRFareType baseFare;
        @XmlElement(name = "Tax")
        protected SPNRFareType tax;
        @XmlElement(name = "Other")
        protected SPNRFareType other;

        /**
         * 获取baseFare属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SPNRFareType }
         *     
         */
        public SPNRFareType getBaseFare() {
            return baseFare;
        }

        /**
         * 设置baseFare属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SPNRFareType }
         *     
         */
        public void setBaseFare(SPNRFareType value) {
            this.baseFare = value;
        }

        /**
         * 获取tax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SPNRFareType }
         *     
         */
        public SPNRFareType getTax() {
            return tax;
        }

        /**
         * 设置tax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SPNRFareType }
         *     
         */
        public void setTax(SPNRFareType value) {
            this.tax = value;
        }

        /**
         * 获取other属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SPNRFareType }
         *     
         */
        public SPNRFareType getOther() {
            return other;
        }

        /**
         * 设置other属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SPNRFareType }
         *     
         */
        public void setOther(SPNRFareType value) {
            this.other = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ReissueFee {

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
     *         &lt;element name="Tax" type="{http://www.opentravel.org/OTA/2003/05}AirTaxType" maxOccurs="99"/>
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
        "tax"
    })
    public static class Taxes {

        @XmlElement(name = "Tax", required = true)
        protected List<AirTaxType> tax;

        /**
         * Gets the value of the tax property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the tax property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTax().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirTaxType }
         * 
         * 
         */
        public List<AirTaxType> getTax() {
            if (tax == null) {
                tax = new ArrayList<AirTaxType>();
            }
            return this.tax;
        }

    }

}
