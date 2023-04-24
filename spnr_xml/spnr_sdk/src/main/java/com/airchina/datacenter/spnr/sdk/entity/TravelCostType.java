//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>TravelCostType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TravelCostType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FormOfPayment" type="{http://www.opentravel.org/OTA/2003/05}PaymentFormType" maxOccurs="unbounded"/>
 *         &lt;element name="CostTotals" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
 *                 &lt;attribute name="FormOfPaymentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TravelCostType", propOrder = {
    "formOfPayment",
    "costTotals",
    "tpaExtensions"
})
public class TravelCostType {

    @XmlElement(name = "FormOfPayment", required = true)
    protected List<PaymentFormType> formOfPayment;
    @XmlElement(name = "CostTotals")
    protected TravelCostType.CostTotals costTotals;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * Gets the value of the formOfPayment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the formOfPayment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFormOfPayment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PaymentFormType }
     * 
     * 
     */
    public List<PaymentFormType> getFormOfPayment() {
        if (formOfPayment == null) {
            formOfPayment = new ArrayList<PaymentFormType>();
        }
        return this.formOfPayment;
    }

    /**
     * 获取costTotals属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TravelCostType.CostTotals }
     *     
     */
    public TravelCostType.CostTotals getCostTotals() {
        return costTotals;
    }

    /**
     * 设置costTotals属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TravelCostType.CostTotals }
     *     
     */
    public void setCostTotals(TravelCostType.CostTotals value) {
        this.costTotals = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TotalType">
     *       &lt;attribute name="FormOfPaymentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CostTotals
        extends TotalType
    {

        @XmlAttribute(name = "FormOfPaymentRPH")
        protected String formOfPaymentRPH;

        /**
         * 获取formOfPaymentRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormOfPaymentRPH() {
            return formOfPaymentRPH;
        }

        /**
         * 设置formOfPaymentRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormOfPaymentRPH(String value) {
            this.formOfPaymentRPH = value;
        }

    }

}
