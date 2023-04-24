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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Applicable extra element. It shows what extras have been applied or are optional to the RoomRate.
 * 
 * <p>ExtraType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExtraType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Extra" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Tax" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChildAmounts" type="{http://www.opentravel.org/OTA/2003/05}ChildAmountType" minOccurs="0"/>
 *                   &lt;element name="Restrictions" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Restriction" type="{http://www.opentravel.org/OTA/2003/05}Restriction" maxOccurs="unbounded" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OriginalTotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
 *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="OriginalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                 &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
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
@XmlType(name = "ExtraType", propOrder = {
    "extra"
})
public class ExtraType {

    @XmlElement(name = "Extra", required = true)
    protected List<ExtraType.Extra> extra;

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtraType.Extra }
     * 
     * 
     */
    public List<ExtraType.Extra> getExtra() {
        if (extra == null) {
            extra = new ArrayList<ExtraType.Extra>();
        }
        return this.extra;
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
     *         &lt;element name="Tax" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChildAmounts" type="{http://www.opentravel.org/OTA/2003/05}ChildAmountType" minOccurs="0"/>
     *         &lt;element name="Restrictions" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Restriction" type="{http://www.opentravel.org/OTA/2003/05}Restriction" maxOccurs="unbounded" minOccurs="0"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OriginalTotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength3" />
     *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Mandatory" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="TaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="TotalAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Selected" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="OriginalTaxAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}int" />
     *       &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "tax",
        "childAmounts",
        "restrictions"
    })
    public static class Extra {

        @XmlElement(name = "Tax")
        protected ExtraType.Extra.Tax tax;
        @XmlElement(name = "ChildAmounts")
        protected ChildAmountType childAmounts;
        @XmlElement(name = "Restrictions")
        protected ExtraType.Extra.Restrictions restrictions;
        @XmlAttribute(name = "OriginalTotalAmount")
        protected Float originalTotalAmount;
        @XmlAttribute(name = "OriginalAmount")
        protected Float originalAmount;
        @XmlAttribute(name = "OriginalCurrencyCode")
        protected String originalCurrencyCode;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "Amount")
        protected Float amount;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Mandatory")
        protected Boolean mandatory;
        @XmlAttribute(name = "TaxAmount")
        protected Float taxAmount;
        @XmlAttribute(name = "TotalAmount")
        protected Float totalAmount;
        @XmlAttribute(name = "Prepaid")
        protected Boolean prepaid;
        @XmlAttribute(name = "Selected")
        protected Boolean selected;
        @XmlAttribute(name = "OriginalTaxAmount")
        protected Float originalTaxAmount;
        @XmlAttribute(name = "Quantity")
        protected Integer quantity;
        @XmlAttribute(name = "Duration")
        protected Integer duration;
        @XmlAttribute(name = "Type")
        protected Integer type;
        @XmlAttribute(name = "SupplierAmount")
        protected Float supplierAmount;

        /**
         * 获取tax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ExtraType.Extra.Tax }
         *     
         */
        public ExtraType.Extra.Tax getTax() {
            return tax;
        }

        /**
         * 设置tax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ExtraType.Extra.Tax }
         *     
         */
        public void setTax(ExtraType.Extra.Tax value) {
            this.tax = value;
        }

        /**
         * 获取childAmounts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ChildAmountType }
         *     
         */
        public ChildAmountType getChildAmounts() {
            return childAmounts;
        }

        /**
         * 设置childAmounts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ChildAmountType }
         *     
         */
        public void setChildAmounts(ChildAmountType value) {
            this.childAmounts = value;
        }

        /**
         * 获取restrictions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ExtraType.Extra.Restrictions }
         *     
         */
        public ExtraType.Extra.Restrictions getRestrictions() {
            return restrictions;
        }

        /**
         * 设置restrictions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ExtraType.Extra.Restrictions }
         *     
         */
        public void setRestrictions(ExtraType.Extra.Restrictions value) {
            this.restrictions = value;
        }

        /**
         * 获取originalTotalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalTotalAmount() {
            return originalTotalAmount;
        }

        /**
         * 设置originalTotalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalTotalAmount(Float value) {
            this.originalTotalAmount = value;
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
         * 获取mandatory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isMandatory() {
            return mandatory;
        }

        /**
         * 设置mandatory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setMandatory(Boolean value) {
            this.mandatory = value;
        }

        /**
         * 获取taxAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getTaxAmount() {
            return taxAmount;
        }

        /**
         * 设置taxAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setTaxAmount(Float value) {
            this.taxAmount = value;
        }

        /**
         * 获取totalAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getTotalAmount() {
            return totalAmount;
        }

        /**
         * 设置totalAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setTotalAmount(Float value) {
            this.totalAmount = value;
        }

        /**
         * 获取prepaid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrepaid() {
            return prepaid;
        }

        /**
         * 设置prepaid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrepaid(Boolean value) {
            this.prepaid = value;
        }

        /**
         * 获取selected属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isSelected() {
            return selected;
        }

        /**
         * 设置selected属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setSelected(Boolean value) {
            this.selected = value;
        }

        /**
         * 获取originalTaxAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalTaxAmount() {
            return originalTaxAmount;
        }

        /**
         * 设置originalTaxAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalTaxAmount(Float value) {
            this.originalTaxAmount = value;
        }

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setQuantity(Integer value) {
            this.quantity = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDuration(Integer value) {
            this.duration = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setType(Integer value) {
            this.type = value;
        }

        /**
         * 获取supplierAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSupplierAmount() {
            return supplierAmount;
        }

        /**
         * 设置supplierAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSupplierAmount(Float value) {
            this.supplierAmount = value;
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
         *         &lt;element name="Restriction" type="{http://www.opentravel.org/OTA/2003/05}Restriction" maxOccurs="unbounded" minOccurs="0"/>
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
            "restriction"
        })
        public static class Restrictions {

            @XmlElement(name = "Restriction")
            protected List<Restriction> restriction;

            /**
             * Gets the value of the restriction property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the restriction property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRestriction().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Restriction }
             * 
             * 
             */
            public List<Restriction> getRestriction() {
                if (restriction == null) {
                    restriction = new ArrayList<Restriction>();
                }
                return this.restriction;
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
         *       &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tax {

            @XmlAttribute(name = "OriginalAmount")
            @XmlSchemaType(name = "anySimpleType")
            protected String originalAmount;
            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "Code")
            protected Integer code;
            @XmlAttribute(name = "TaxOption")
            protected Integer taxOption;

            /**
             * 获取originalAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalAmount() {
                return originalAmount;
            }

            /**
             * 设置originalAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalAmount(String value) {
                this.originalAmount = value;
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
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCode(Integer value) {
                this.code = value;
            }

            /**
             * 获取taxOption属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTaxOption() {
                return taxOption;
            }

            /**
             * 设置taxOption属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTaxOption(Integer value) {
                this.taxOption = value;
            }

        }

    }

}
