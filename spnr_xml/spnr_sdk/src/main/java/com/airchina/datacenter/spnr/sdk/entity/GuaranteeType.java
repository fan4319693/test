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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The guarantee information to hold a reservation
 * 
 * <p>GuaranteeType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="GuaranteeType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuaranteesAccepted" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="GuaranteeAccepted" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
 *                           &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Deadline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *         &lt;element name="GuaranteeDescription" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="RetributionType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *             &lt;enumeration value="ResAutoCancelled"/>
 *             &lt;enumeration value="ResNotGuaranteed"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="GuaranteeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="GuaranteeType">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *             &lt;enumeration value="GuaranteeRequired"/>
 *             &lt;enumeration value="None"/>
 *             &lt;enumeration value="CC/DC/Voucher"/>
 *             &lt;enumeration value="Profile"/>
 *             &lt;enumeration value="Deposit"/>
 *             &lt;enumeration value="PrePay"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="HoldTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "GuaranteeType", propOrder = {
    "guaranteesAccepted",
    "deadline",
    "comments",
    "guaranteeDescription"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.BookingRulesType.BookingRule.AcceptableGuarantees.AcceptableGuarantee.class
})
public class GuaranteeType {

    @XmlElement(name = "GuaranteesAccepted")
    protected GuaranteeType.GuaranteesAccepted guaranteesAccepted;
    @XmlElement(name = "Deadline")
    protected GuaranteeType.Deadline deadline;
    @XmlElement(name = "Comments")
    protected CommentType comments;
    @XmlElement(name = "GuaranteeDescription")
    protected List<ParagraphType> guaranteeDescription;
    @XmlAttribute(name = "RetributionType")
    protected String retributionType;
    @XmlAttribute(name = "GuaranteeCode")
    protected String guaranteeCode;
    @XmlAttribute(name = "GuaranteeType")
    protected String guaranteeType;
    @XmlAttribute(name = "HoldTime")
    @XmlSchemaType(name = "time")
    protected XMLGregorianCalendar holdTime;

    /**
     * 获取guaranteesAccepted属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType.GuaranteesAccepted }
     *     
     */
    public GuaranteeType.GuaranteesAccepted getGuaranteesAccepted() {
        return guaranteesAccepted;
    }

    /**
     * 设置guaranteesAccepted属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType.GuaranteesAccepted }
     *     
     */
    public void setGuaranteesAccepted(GuaranteeType.GuaranteesAccepted value) {
        this.guaranteesAccepted = value;
    }

    /**
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType.Deadline }
     *     
     */
    public GuaranteeType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType.Deadline }
     *     
     */
    public void setDeadline(GuaranteeType.Deadline value) {
        this.deadline = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComments(CommentType value) {
        this.comments = value;
    }

    /**
     * Gets the value of the guaranteeDescription property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the guaranteeDescription property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getGuaranteeDescription().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getGuaranteeDescription() {
        if (guaranteeDescription == null) {
            guaranteeDescription = new ArrayList<ParagraphType>();
        }
        return this.guaranteeDescription;
    }

    /**
     * 获取retributionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRetributionType() {
        return retributionType;
    }

    /**
     * 设置retributionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRetributionType(String value) {
        this.retributionType = value;
    }

    /**
     * 获取guaranteeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeCode() {
        return guaranteeCode;
    }

    /**
     * 设置guaranteeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeCode(String value) {
        this.guaranteeCode = value;
    }

    /**
     * 获取guaranteeType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGuaranteeType() {
        return guaranteeType;
    }

    /**
     * 设置guaranteeType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGuaranteeType(String value) {
        this.guaranteeType = value;
    }

    /**
     * 获取holdTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getHoldTime() {
        return holdTime;
    }

    /**
     * 设置holdTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setHoldTime(XMLGregorianCalendar value) {
        this.holdTime = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected String offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected Integer offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetDropTime;
        @XmlAttribute(name = "From")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar from;
        @XmlAttribute(name = "To")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar to;

        /**
         * 获取absoluteDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * 设置absoluteDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * 获取offsetTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * 设置offsetTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetTimeUnit(String value) {
            this.offsetTimeUnit = value;
        }

        /**
         * 获取offsetUnitMultiplier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * 设置offsetUnitMultiplier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOffsetUnitMultiplier(Integer value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * 获取offsetDropTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * 设置offsetDropTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

        /**
         * 获取from属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFrom() {
            return from;
        }

        /**
         * 设置from属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFrom(XMLGregorianCalendar value) {
            this.from = value;
        }

        /**
         * 获取to属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTo() {
            return to;
        }

        /**
         * 设置to属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTo(XMLGregorianCalendar value) {
            this.to = value;
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
     *         &lt;element name="GuaranteeAccepted" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
     *                 &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
        "guaranteeAccepted"
    })
    public static class GuaranteesAccepted {

        @XmlElement(name = "GuaranteeAccepted", required = true)
        protected List<GuaranteeType.GuaranteesAccepted.GuaranteeAccepted> guaranteeAccepted;

        /**
         * Gets the value of the guaranteeAccepted property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the guaranteeAccepted property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getGuaranteeAccepted().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link GuaranteeType.GuaranteesAccepted.GuaranteeAccepted }
         * 
         * 
         */
        public List<GuaranteeType.GuaranteesAccepted.GuaranteeAccepted> getGuaranteeAccepted() {
            if (guaranteeAccepted == null) {
                guaranteeAccepted = new ArrayList<GuaranteeType.GuaranteesAccepted.GuaranteeAccepted>();
            }
            return this.guaranteeAccepted;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}PaymentFormType">
         *       &lt;attribute name="Default" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NoCardHolderInfoReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="NameReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="AddressReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="PhoneReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="InterbankNbrReqInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="BookingSourceAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="CorpDiscountNbrAllowedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class GuaranteeAccepted
            extends PaymentFormType
        {

            @XmlAttribute(name = "Default")
            protected Boolean _default;
            @XmlAttribute(name = "NoCardHolderInfoReqInd")
            protected Boolean noCardHolderInfoReqInd;
            @XmlAttribute(name = "NameReqInd")
            protected Boolean nameReqInd;
            @XmlAttribute(name = "AddressReqInd")
            protected Boolean addressReqInd;
            @XmlAttribute(name = "PhoneReqInd")
            protected Boolean phoneReqInd;
            @XmlAttribute(name = "InterbankNbrReqInd")
            protected Boolean interbankNbrReqInd;
            @XmlAttribute(name = "BookingSourceAllowedInd")
            protected Boolean bookingSourceAllowedInd;
            @XmlAttribute(name = "CorpDiscountNbrAllowedInd")
            protected Boolean corpDiscountNbrAllowedInd;

            /**
             * 获取default属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isDefault() {
                return _default;
            }

            /**
             * 设置default属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setDefault(Boolean value) {
                this._default = value;
            }

            /**
             * 获取noCardHolderInfoReqInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNoCardHolderInfoReqInd() {
                return noCardHolderInfoReqInd;
            }

            /**
             * 设置noCardHolderInfoReqInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNoCardHolderInfoReqInd(Boolean value) {
                this.noCardHolderInfoReqInd = value;
            }

            /**
             * 获取nameReqInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isNameReqInd() {
                return nameReqInd;
            }

            /**
             * 设置nameReqInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setNameReqInd(Boolean value) {
                this.nameReqInd = value;
            }

            /**
             * 获取addressReqInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isAddressReqInd() {
                return addressReqInd;
            }

            /**
             * 设置addressReqInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setAddressReqInd(Boolean value) {
                this.addressReqInd = value;
            }

            /**
             * 获取phoneReqInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isPhoneReqInd() {
                return phoneReqInd;
            }

            /**
             * 设置phoneReqInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setPhoneReqInd(Boolean value) {
                this.phoneReqInd = value;
            }

            /**
             * 获取interbankNbrReqInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isInterbankNbrReqInd() {
                return interbankNbrReqInd;
            }

            /**
             * 设置interbankNbrReqInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setInterbankNbrReqInd(Boolean value) {
                this.interbankNbrReqInd = value;
            }

            /**
             * 获取bookingSourceAllowedInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isBookingSourceAllowedInd() {
                return bookingSourceAllowedInd;
            }

            /**
             * 设置bookingSourceAllowedInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setBookingSourceAllowedInd(Boolean value) {
                this.bookingSourceAllowedInd = value;
            }

            /**
             * 获取corpDiscountNbrAllowedInd属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isCorpDiscountNbrAllowedInd() {
                return corpDiscountNbrAllowedInd;
            }

            /**
             * 设置corpDiscountNbrAllowedInd属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setCorpDiscountNbrAllowedInd(Boolean value) {
                this.corpDiscountNbrAllowedInd = value;
            }

        }

    }

}
