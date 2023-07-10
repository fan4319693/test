//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

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
 * A list of all the items making up a costed booking
 * 
 * <p>FerryInvoiceDetail complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="FerryInvoiceDetail">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CostingItems" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CostingItem" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CostingItemType">
 *                           &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="GrossAmount" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="DepositAmount" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *         &lt;element name="AgentCommission" type="{http://www.opentravel.org/OTA/2003/05}AgentCommissionType" maxOccurs="8" minOccurs="0"/>
 *         &lt;element name="NetAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TaxItems" type="{http://www.opentravel.org/OTA/2003/05}TaxesType" minOccurs="0"/>
 *         &lt;element name="BalanceDueAmount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
 *                 &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmountReceived" type="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "FerryInvoiceDetail", propOrder = {
    "costingItems",
    "grossAmount",
    "depositAmount",
    "agentCommission",
    "netAmount",
    "taxItems",
    "balanceDueAmount",
    "amountReceived"
})
public class FerryInvoiceDetail {

    @XmlElement(name = "CostingItems")
    protected FerryInvoiceDetail.CostingItems costingItems;
    @XmlElement(name = "GrossAmount")
    protected CurrencyAmountType grossAmount;
    @XmlElement(name = "DepositAmount")
    protected CurrencyAmountType depositAmount;
    @XmlElement(name = "AgentCommission")
    protected List<AgentCommissionType> agentCommission;
    @XmlElement(name = "NetAmount")
    protected FerryInvoiceDetail.NetAmount netAmount;
    @XmlElement(name = "TaxItems")
    protected TaxesType taxItems;
    @XmlElement(name = "BalanceDueAmount")
    protected FerryInvoiceDetail.BalanceDueAmount balanceDueAmount;
    @XmlElement(name = "AmountReceived")
    protected CurrencyAmountType amountReceived;

    /**
     * 获取costingItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryInvoiceDetail.CostingItems }
     *     
     */
    public FerryInvoiceDetail.CostingItems getCostingItems() {
        return costingItems;
    }

    /**
     * 设置costingItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryInvoiceDetail.CostingItems }
     *     
     */
    public void setCostingItems(FerryInvoiceDetail.CostingItems value) {
        this.costingItems = value;
    }

    /**
     * 获取grossAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getGrossAmount() {
        return grossAmount;
    }

    /**
     * 设置grossAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setGrossAmount(CurrencyAmountType value) {
        this.grossAmount = value;
    }

    /**
     * 获取depositAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getDepositAmount() {
        return depositAmount;
    }

    /**
     * 设置depositAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setDepositAmount(CurrencyAmountType value) {
        this.depositAmount = value;
    }

    /**
     * Gets the value of the agentCommission property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the agentCommission property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAgentCommission().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AgentCommissionType }
     * 
     * 
     */
    public List<AgentCommissionType> getAgentCommission() {
        if (agentCommission == null) {
            agentCommission = new ArrayList<AgentCommissionType>();
        }
        return this.agentCommission;
    }

    /**
     * 获取netAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryInvoiceDetail.NetAmount }
     *     
     */
    public FerryInvoiceDetail.NetAmount getNetAmount() {
        return netAmount;
    }

    /**
     * 设置netAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryInvoiceDetail.NetAmount }
     *     
     */
    public void setNetAmount(FerryInvoiceDetail.NetAmount value) {
        this.netAmount = value;
    }

    /**
     * 获取taxItems属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TaxesType }
     *     
     */
    public TaxesType getTaxItems() {
        return taxItems;
    }

    /**
     * 设置taxItems属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TaxesType }
     *     
     */
    public void setTaxItems(TaxesType value) {
        this.taxItems = value;
    }

    /**
     * 获取balanceDueAmount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryInvoiceDetail.BalanceDueAmount }
     *     
     */
    public FerryInvoiceDetail.BalanceDueAmount getBalanceDueAmount() {
        return balanceDueAmount;
    }

    /**
     * 设置balanceDueAmount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryInvoiceDetail.BalanceDueAmount }
     *     
     */
    public void setBalanceDueAmount(FerryInvoiceDetail.BalanceDueAmount value) {
        this.balanceDueAmount = value;
    }

    /**
     * 获取amountReceived属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CurrencyAmountType }
     *     
     */
    public CurrencyAmountType getAmountReceived() {
        return amountReceived;
    }

    /**
     * 设置amountReceived属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CurrencyAmountType }
     *     
     */
    public void setAmountReceived(CurrencyAmountType value) {
        this.amountReceived = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BalanceDueAmount
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "PaymentDueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar paymentDueDate;

        /**
         * 获取paymentDueDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPaymentDueDate() {
            return paymentDueDate;
        }

        /**
         * 设置paymentDueDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPaymentDueDate(XMLGregorianCalendar value) {
            this.paymentDueDate = value;
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
     *         &lt;element name="CostingItem" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CostingItemType">
     *                 &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "costingItem"
    })
    public static class CostingItems {

        @XmlElement(name = "CostingItem", required = true)
        protected List<FerryInvoiceDetail.CostingItems.CostingItem> costingItem;

        /**
         * Gets the value of the costingItem property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the costingItem property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCostingItem().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FerryInvoiceDetail.CostingItems.CostingItem }
         * 
         * 
         */
        public List<FerryInvoiceDetail.CostingItems.CostingItem> getCostingItem() {
            if (costingItem == null) {
                costingItem = new ArrayList<FerryInvoiceDetail.CostingItems.CostingItem>();
            }
            return this.costingItem;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CostingItemType">
         *       &lt;attribute name="Tag" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CostingItem
            extends CostingItemType
        {

            @XmlAttribute(name = "Tag")
            protected String tag;

            /**
             * 获取tag属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getTag() {
                return tag;
            }

            /**
             * 设置tag属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setTag(String value) {
                this.tag = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountType">
     *       &lt;attribute name="PaymentDueDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class NetAmount
        extends CurrencyAmountType
    {

        @XmlAttribute(name = "PaymentDueDate")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar paymentDueDate;

        /**
         * 获取paymentDueDate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getPaymentDueDate() {
            return paymentDueDate;
        }

        /**
         * 设置paymentDueDate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setPaymentDueDate(XMLGregorianCalendar value) {
            this.paymentDueDate = value;
        }

    }

}
