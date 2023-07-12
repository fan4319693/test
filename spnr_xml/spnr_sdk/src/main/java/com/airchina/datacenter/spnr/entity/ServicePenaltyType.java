//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Penalty information.
 * 
 * <p>ServicePenaltyType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ServicePenaltyType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="FeeApplies" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ChangeItinerary" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
 *                 &lt;attribute name="Cancellation" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Change" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" maxOccurs="2">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
 *                           &lt;attribute name="MinMax">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="MIN"/>
 *                                 &lt;enumeration value="MAX"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Application">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cancel" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Amount" maxOccurs="2">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
 *                           &lt;attribute name="MinMax">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="MIN"/>
 *                                 &lt;enumeration value="MAX"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Application">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="PRIOR_DEP"/>
 *                       &lt;enumeration value="AFTER_DEP"/>
 *                       &lt;enumeration value="NO_SHOW"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Refundable" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *       &lt;attribute name="Reusable" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ServicePenaltyType", propOrder = {
    "feeApplies",
    "change",
    "cancel"
})
public class ServicePenaltyType {

    @XmlElement(name = "FeeApplies")
    protected ServicePenaltyType.FeeApplies feeApplies;
    @XmlElement(name = "Change")
    protected List<ServicePenaltyType.Change> change;
    @XmlElement(name = "Cancel")
    protected List<ServicePenaltyType.Cancel> cancel;
    @XmlAttribute(name = "Refundable")
    protected String refundable;
    @XmlAttribute(name = "Reusable")
    protected String reusable;

    /**
     * 获取feeApplies属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ServicePenaltyType.FeeApplies }
     *     
     */
    public ServicePenaltyType.FeeApplies getFeeApplies() {
        return feeApplies;
    }

    /**
     * 设置feeApplies属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ServicePenaltyType.FeeApplies }
     *     
     */
    public void setFeeApplies(ServicePenaltyType.FeeApplies value) {
        this.feeApplies = value;
    }

    /**
     * Gets the value of the change property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the change property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getChange().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePenaltyType.Change }
     * 
     * 
     */
    public List<ServicePenaltyType.Change> getChange() {
        if (change == null) {
            change = new ArrayList<ServicePenaltyType.Change>();
        }
        return this.change;
    }

    /**
     * Gets the value of the cancel property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cancel property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCancel().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ServicePenaltyType.Cancel }
     * 
     * 
     */
    public List<ServicePenaltyType.Cancel> getCancel() {
        if (cancel == null) {
            cancel = new ArrayList<ServicePenaltyType.Cancel>();
        }
        return this.cancel;
    }

    /**
     * 获取refundable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRefundable() {
        return refundable;
    }

    /**
     * 设置refundable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRefundable(String value) {
        this.refundable = value;
    }

    /**
     * 获取reusable属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReusable() {
        return reusable;
    }

    /**
     * 设置reusable属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReusable(String value) {
        this.reusable = value;
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
     *         &lt;element name="Amount" maxOccurs="2">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
     *                 &lt;attribute name="MinMax">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="MIN"/>
     *                       &lt;enumeration value="MAX"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Application">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="PRIOR_DEP"/>
     *             &lt;enumeration value="AFTER_DEP"/>
     *             &lt;enumeration value="NO_SHOW"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "text"
    })
    public static class Cancel {

        @XmlElement(name = "Amount", required = true)
        protected List<ServicePenaltyType.Cancel.Amount> amount;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlAttribute(name = "Application")
        protected String application;

        /**
         * Gets the value of the amount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePenaltyType.Cancel.Amount }
         * 
         * 
         */
        public List<ServicePenaltyType.Cancel.Amount> getAmount() {
            if (amount == null) {
                amount = new ArrayList<ServicePenaltyType.Cancel.Amount>();
            }
            return this.amount;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }

        /**
         * 获取application属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * 设置application属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
         *       &lt;attribute name="MinMax">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="MIN"/>
         *             &lt;enumeration value="MAX"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        public static class Amount {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "Unit", required = true)
            protected AmountCategoryType unit;
            @XmlAttribute(name = "MinMax")
            protected String minMax;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * 获取unit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AmountCategoryType }
             *     
             */
            public AmountCategoryType getUnit() {
                return unit;
            }

            /**
             * 设置unit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AmountCategoryType }
             *     
             */
            public void setUnit(AmountCategoryType value) {
                this.unit = value;
            }

            /**
             * 获取minMax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinMax() {
                return minMax;
            }

            /**
             * 设置minMax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinMax(String value) {
                this.minMax = value;
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
     *         &lt;element name="Amount" maxOccurs="2">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
     *                 &lt;attribute name="MinMax">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="MIN"/>
     *                       &lt;enumeration value="MAX"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Application">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "amount",
        "text"
    })
    public static class Change {

        @XmlElement(name = "Amount", required = true)
        protected List<ServicePenaltyType.Change.Amount> amount;
        @XmlElement(name = "Text")
        protected List<String> text;
        @XmlAttribute(name = "Application")
        protected String application;

        /**
         * Gets the value of the amount property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the amount property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAmount().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link ServicePenaltyType.Change.Amount }
         * 
         * 
         */
        public List<ServicePenaltyType.Change.Amount> getAmount() {
            if (amount == null) {
                amount = new ArrayList<ServicePenaltyType.Change.Amount>();
            }
            return this.amount;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }

        /**
         * 获取application属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getApplication() {
            return application;
        }

        /**
         * 设置application属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setApplication(String value) {
            this.application = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="Unit" use="required" type="{http://www.opentravel.org/OTA/2003/05}AmountCategoryType" />
         *       &lt;attribute name="MinMax">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="MIN"/>
         *             &lt;enumeration value="MAX"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        public static class Amount {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "Unit", required = true)
            protected AmountCategoryType unit;
            @XmlAttribute(name = "MinMax")
            protected String minMax;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setValue(BigInteger value) {
                this.value = value;
            }

            /**
             * 获取unit属性的值。
             * 
             * @return
             *     possible object is
             *     {@link AmountCategoryType }
             *     
             */
            public AmountCategoryType getUnit() {
                return unit;
            }

            /**
             * 设置unit属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link AmountCategoryType }
             *     
             */
            public void setUnit(AmountCategoryType value) {
                this.unit = value;
            }

            /**
             * 获取minMax属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getMinMax() {
                return minMax;
            }

            /**
             * 设置minMax属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setMinMax(String value) {
                this.minMax = value;
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
     *       &lt;attribute name="ChangeItinerary" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
     *       &lt;attribute name="Cancellation" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FeeApplies {

        @XmlAttribute(name = "ChangeItinerary")
        protected String changeItinerary;
        @XmlAttribute(name = "Cancellation")
        protected String cancellation;

        /**
         * 获取changeItinerary属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getChangeItinerary() {
            if (changeItinerary == null) {
                return "N";
            } else {
                return changeItinerary;
            }
        }

        /**
         * 设置changeItinerary属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setChangeItinerary(String value) {
            this.changeItinerary = value;
        }

        /**
         * 获取cancellation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCancellation() {
            if (cancellation == null) {
                return "N";
            } else {
                return cancellation;
            }
        }

        /**
         * 设置cancellation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCancellation(String value) {
            this.cancellation = value;
        }

    }

}
