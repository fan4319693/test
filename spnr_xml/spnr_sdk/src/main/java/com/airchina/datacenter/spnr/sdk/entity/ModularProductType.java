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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ModularProductType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ModularProductType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ProductBase">
 *       &lt;sequence>
 *         &lt;group ref="{http://www.opentravel.org/OTA/2003/05}ProductCommonElements"/>
 *       &lt;/sequence>
 *       &lt;attribute name="SupplierCode">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;minLength value="4"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BookAfterPayment" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ComboCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="CreateCoupon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ProductID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="TSBookingStatus" type="{http://www.opentravel.org/OTA/2003/05}ModTSBookingStatusType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ModularProductType", propOrder = {
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
    "modifyTypes",
    "description",
    "ptCs",
    "paymentRefs",
    "crossRefs"
})
public class ModularProductType
    extends ProductBase
{

    @XmlElement(name = "Attachments")
    protected com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Attachments attachments;
    @XmlElement(name = "Pricing", required = true)
    protected ProductPricingType pricing;
    @XmlElement(name = "Remarks")
    protected com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Remarks remarks;
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
    protected List<com.airchina.datacenter.spnr.sdk.entity.PackageProductType.ExchangeRate> exchangeRate;
    @XmlElement(name = "ModifyTypes")
    protected ModifyTypesType modifyTypes;
    @XmlElement(name = "Description")
    protected ProductDescriptionType description;
    @XmlElement(name = "PTCs", required = true)
    protected PTCs ptCs;
    @XmlElement(name = "PaymentRefs")
    protected ModularProductType.PaymentRefs paymentRefs;
    @XmlElement(name = "CrossRefs")
    protected ModularProductType.CrossRefs crossRefs;
    @XmlAttribute(name = "SupplierCode")
    protected String supplierCode;
    @XmlAttribute(name = "BookAfterPayment")
    protected Boolean bookAfterPayment;
    @XmlAttribute(name = "ComboCode")
    protected String comboCode;
    @XmlAttribute(name = "CreateCoupon")
    protected Boolean createCoupon;
    @XmlAttribute(name = "ID")
    protected String id;
    @XmlAttribute(name = "ProductID")
    protected BigInteger productID;
    @XmlAttribute(name = "TSBookingStatus")
    protected ModTSBookingStatusType tsBookingStatus;

    /**
     * 获取attachments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Attachments }
     *     
     */
    public com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Attachments getAttachments() {
        return attachments;
    }

    /**
     * 设置attachments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Attachments }
     *     
     */
    public void setAttachments(com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Attachments value) {
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
     *     {@link com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Remarks }
     *     
     */
    public com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Remarks getRemarks() {
        return remarks;
    }

    /**
     * 设置remarks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Remarks }
     *     
     */
    public void setRemarks(com.airchina.datacenter.spnr.sdk.entity.PackageProductType.Remarks value) {
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
     * {@link com.airchina.datacenter.spnr.sdk.entity.PackageProductType.ExchangeRate }
     * 
     * 
     */
    public List<com.airchina.datacenter.spnr.sdk.entity.PackageProductType.ExchangeRate> getExchangeRate() {
        if (exchangeRate == null) {
            exchangeRate = new ArrayList<>();
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
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ProductDescriptionType }
     *     
     */
    public ProductDescriptionType getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ProductDescriptionType }
     *     
     */
    public void setDescription(ProductDescriptionType value) {
        this.description = value;
    }

    /**
     * 获取ptCs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PTCs }
     *     
     */
    public PTCs getPTCs() {
        return ptCs;
    }

    /**
     * 设置ptCs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PTCs }
     *     
     */
    public void setPTCs(PTCs value) {
        this.ptCs = value;
    }

    /**
     * 获取paymentRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModularProductType.PaymentRefs }
     *     
     */
    public ModularProductType.PaymentRefs getPaymentRefs() {
        return paymentRefs;
    }

    /**
     * 设置paymentRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModularProductType.PaymentRefs }
     *     
     */
    public void setPaymentRefs(ModularProductType.PaymentRefs value) {
        this.paymentRefs = value;
    }

    /**
     * 获取crossRefs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModularProductType.CrossRefs }
     *     
     */
    public ModularProductType.CrossRefs getCrossRefs() {
        return crossRefs;
    }

    /**
     * 设置crossRefs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModularProductType.CrossRefs }
     *     
     */
    public void setCrossRefs(ModularProductType.CrossRefs value) {
        this.crossRefs = value;
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
     * 获取bookAfterPayment属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBookAfterPayment() {
        return bookAfterPayment;
    }

    /**
     * 设置bookAfterPayment属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBookAfterPayment(Boolean value) {
        this.bookAfterPayment = value;
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
     * 获取createCoupon属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isCreateCoupon() {
        return createCoupon;
    }

    /**
     * 设置createCoupon属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setCreateCoupon(Boolean value) {
        this.createCoupon = value;
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
     * 获取productID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getProductID() {
        return productID;
    }

    /**
     * 设置productID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setProductID(BigInteger value) {
        this.productID = value;
    }

    /**
     * 获取tsBookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ModTSBookingStatusType }
     *     
     */
    public ModTSBookingStatusType getTSBookingStatus() {
        return tsBookingStatus;
    }

    /**
     * 设置tsBookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ModTSBookingStatusType }
     *     
     */
    public void setTSBookingStatus(ModTSBookingStatusType value) {
        this.tsBookingStatus = value;
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
     *         &lt;element name="UniqueID" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "uniqueID"
    })
    public static class CrossRefs {

        @XmlElement(name = "UniqueID")
        protected List<ModularProductType.CrossRefs.UniqueID> uniqueID;

        /**
         * Gets the value of the uniqueID property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the uniqueID property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getUniqueID().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModularProductType.CrossRefs.UniqueID }
         * 
         * 
         */
        public List<ModularProductType.CrossRefs.UniqueID> getUniqueID() {
            if (uniqueID == null) {
                uniqueID = new ArrayList<ModularProductType.CrossRefs.UniqueID>();
            }
            return this.uniqueID;
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
         *       &lt;attribute name="SeqNo" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="Historic" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class UniqueID
            extends UniqueIDType
        {

            @XmlAttribute(name = "SeqNo")
            protected Integer seqNo;
            @XmlAttribute(name = "Historic")
            @XmlSchemaType(name = "anySimpleType")
            protected String historic;

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
             * 获取historic属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getHistoric() {
                return historic;
            }

            /**
             * 设置historic属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setHistoric(String value) {
                this.historic = value;
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
     *         &lt;element name="PaymentRef" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="RedemptionID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *                 &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="PaymentState" type="{http://www.opentravel.org/OTA/2003/05}PaymentStateType" />
     *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "paymentRef"
    })
    public static class PaymentRefs {

        @XmlElement(name = "PaymentRef")
        protected List<ModularProductType.PaymentRefs.PaymentRef> paymentRef;
        @XmlAttribute(name = "PaymentState")
        protected PaymentStateType paymentState;
        @XmlAttribute(name = "AuditID")
        protected Integer auditID;

        /**
         * Gets the value of the paymentRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the paymentRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPaymentRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ModularProductType.PaymentRefs.PaymentRef }
         * 
         * 
         */
        public List<ModularProductType.PaymentRefs.PaymentRef> getPaymentRef() {
            if (paymentRef == null) {
                paymentRef = new ArrayList<ModularProductType.PaymentRefs.PaymentRef>();
            }
            return this.paymentRef;
        }

        /**
         * 获取paymentState属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentStateType }
         *     
         */
        public PaymentStateType getPaymentState() {
            return paymentState;
        }

        /**
         * 设置paymentState属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentStateType }
         *     
         */
        public void setPaymentState(PaymentStateType value) {
            this.paymentState = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="RedemptionID" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="AuditID" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="ID" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
         *       &lt;attribute name="PaymentID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class PaymentRef {

            @XmlAttribute(name = "RedemptionID")
            @XmlSchemaType(name = "anySimpleType")
            protected String redemptionID;
            @XmlAttribute(name = "AuditID")
            protected Integer auditID;
            @XmlAttribute(name = "ID", required = true)
            protected BigInteger id;
            @XmlAttribute(name = "PaymentID")
            protected String paymentID;

            /**
             * 获取redemptionID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRedemptionID() {
                return redemptionID;
            }

            /**
             * 设置redemptionID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRedemptionID(String value) {
                this.redemptionID = value;
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
             * 获取id属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getID() {
                return id;
            }

            /**
             * 设置id属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setID(BigInteger value) {
                this.id = value;
            }

            /**
             * 获取paymentID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getPaymentID() {
                return paymentID;
            }

            /**
             * 设置paymentID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setPaymentID(String value) {
                this.paymentID = value;
            }

        }

    }

}
