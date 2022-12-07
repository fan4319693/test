//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>InsCoverageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="InsCoverageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CoveredTravelers">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CoveredTraveler" type="{http://www.opentravel.org/OTA/2003/05}CoveredTravelerType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InsCoverageDetail" type="{http://www.opentravel.org/OTA/2003/05}InsCoverageDetailType"/>
 *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InsuranceCoverageAttributesGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PlanID_Group"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "InsCoverageType", propOrder = {
    "coveredTravelers",
    "insCoverageDetail",
    "cancellationPenalties",
    "amendmentPenalties"
})
@XmlSeeAlso({
    PlanForBookRQType.class,
    com.airchina.datacenter.spnr.sdk.entity.ProductBase.Activity.TPAExtensions.Insurance.class,
    com.airchina.datacenter.spnr.sdk.entity.ProductBase.Insurance.class
})
public class InsCoverageType {

    @XmlElement(name = "CoveredTravelers", required = true)
    protected InsCoverageType.CoveredTravelers coveredTravelers;
    @XmlElement(name = "InsCoverageDetail", required = true)
    protected InsCoverageDetailType insCoverageDetail;
    @XmlElement(name = "CancellationPenalties")
    protected CancelPenaltiesType cancellationPenalties;
    @XmlElement(name = "AmendmentPenalties")
    protected OJAmendPenaltiesType amendmentPenalties;
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

    /**
     * 获取coveredTravelers属性的值。
     * 
     * @return
     *     possible object is
     *     {@link InsCoverageType.CoveredTravelers }
     *     
     */
    public InsCoverageType.CoveredTravelers getCoveredTravelers() {
        return coveredTravelers;
    }

    /**
     * 设置coveredTravelers属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link InsCoverageType.CoveredTravelers }
     *     
     */
    public void setCoveredTravelers(InsCoverageType.CoveredTravelers value) {
        this.coveredTravelers = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="CoveredTraveler" type="{http://www.opentravel.org/OTA/2003/05}CoveredTravelerType" maxOccurs="unbounded"/>
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
        "coveredTraveler"
    })
    public static class CoveredTravelers {

        @XmlElement(name = "CoveredTraveler", required = true)
        protected List<CoveredTravelerType> coveredTraveler;

        /**
         * Gets the value of the coveredTraveler property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the coveredTraveler property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCoveredTraveler().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CoveredTravelerType }
         * 
         * 
         */
        public List<CoveredTravelerType> getCoveredTraveler() {
            if (coveredTraveler == null) {
                coveredTraveler = new ArrayList<CoveredTravelerType>();
            }
            return this.coveredTraveler;
        }

    }

}
