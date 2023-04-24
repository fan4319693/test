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
import javax.xml.bind.annotation.XmlValue;


/**
 * Price derivation information definition.
 * 
 * <p>DerivationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DerivationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="Account" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Contract" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Certificate" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                   &lt;element name="ProgramName" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Holder" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="IATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
 *                           &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="FQTVNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PromoCode" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *         &lt;element name="Discount" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="DiscountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="TourCode" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/choice>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DerivationType", propOrder = {
    "account",
    "contract",
    "certificate",
    "promoCode",
    "discount",
    "tourCode"
})
public class DerivationType {

    @XmlElement(name = "Account")
    protected String account;
    @XmlElement(name = "Contract")
    protected String contract;
    @XmlElement(name = "Certificate")
    protected List<DerivationType.Certificate> certificate;
    @XmlElement(name = "PromoCode")
    protected String promoCode;
    @XmlElement(name = "Discount")
    protected DerivationType.Discount discount;
    @XmlElement(name = "TourCode")
    protected DerivationType.TourCode tourCode;

    /**
     * 获取account属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccount() {
        return account;
    }

    /**
     * 设置account属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccount(String value) {
        this.account = value;
    }

    /**
     * 获取contract属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContract() {
        return contract;
    }

    /**
     * 设置contract属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContract(String value) {
        this.contract = value;
    }

    /**
     * Gets the value of the certificate property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the certificate property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCertificate().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DerivationType.Certificate }
     * 
     * 
     */
    public List<DerivationType.Certificate> getCertificate() {
        if (certificate == null) {
            certificate = new ArrayList<DerivationType.Certificate>();
        }
        return this.certificate;
    }

    /**
     * 获取promoCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPromoCode() {
        return promoCode;
    }

    /**
     * 设置promoCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPromoCode(String value) {
        this.promoCode = value;
    }

    /**
     * 获取discount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DerivationType.Discount }
     *     
     */
    public DerivationType.Discount getDiscount() {
        return discount;
    }

    /**
     * 设置discount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DerivationType.Discount }
     *     
     */
    public void setDiscount(DerivationType.Discount value) {
        this.discount = value;
    }

    /**
     * 获取tourCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DerivationType.TourCode }
     *     
     */
    public DerivationType.TourCode getTourCode() {
        return tourCode;
    }

    /**
     * 设置tourCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DerivationType.TourCode }
     *     
     */
    public void setTourCode(DerivationType.TourCode value) {
        this.tourCode = value;
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
     *         &lt;element name="Number" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *         &lt;element name="ProgramName" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Holder" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="IATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
     *                 &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="FQTVNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "number",
        "programName",
        "holder"
    })
    public static class Certificate {

        @XmlElement(name = "Number", required = true)
        protected String number;
        @XmlElement(name = "ProgramName")
        protected DerivationType.Certificate.ProgramName programName;
        @XmlElement(name = "Holder")
        protected DerivationType.Certificate.Holder holder;

        /**
         * 获取number属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getNumber() {
            return number;
        }

        /**
         * 设置number属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setNumber(String value) {
            this.number = value;
        }

        /**
         * 获取programName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DerivationType.Certificate.ProgramName }
         *     
         */
        public DerivationType.Certificate.ProgramName getProgramName() {
            return programName;
        }

        /**
         * 设置programName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DerivationType.Certificate.ProgramName }
         *     
         */
        public void setProgramName(DerivationType.Certificate.ProgramName value) {
            this.programName = value;
        }

        /**
         * 获取holder属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DerivationType.Certificate.Holder }
         *     
         */
        public DerivationType.Certificate.Holder getHolder() {
            return holder;
        }

        /**
         * 设置holder属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DerivationType.Certificate.Holder }
         *     
         */
        public void setHolder(DerivationType.Certificate.Holder value) {
            this.holder = value;
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
         *       &lt;attribute name="OwnerID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="IATA" type="{http://www.opentravel.org/OTA/2003/05}IATANumberType" />
         *       &lt;attribute name="CorpID" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="FQTVNumber" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Holder {

            @XmlAttribute(name = "OwnerID")
            protected String ownerID;
            @XmlAttribute(name = "IATA")
            protected String iata;
            @XmlAttribute(name = "CorpID")
            protected String corpID;
            @XmlAttribute(name = "FQTVNumber")
            protected String fqtvNumber;

            /**
             * 获取ownerID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOwnerID() {
                return ownerID;
            }

            /**
             * 设置ownerID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOwnerID(String value) {
                this.ownerID = value;
            }

            /**
             * 获取iata属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getIATA() {
                return iata;
            }

            /**
             * 设置iata属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setIATA(String value) {
                this.iata = value;
            }

            /**
             * 获取corpID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCorpID() {
                return corpID;
            }

            /**
             * 设置corpID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCorpID(String value) {
                this.corpID = value;
            }

            /**
             * 获取fqtvNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFQTVNumber() {
                return fqtvNumber;
            }

            /**
             * 设置fqtvNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFQTVNumber(String value) {
                this.fqtvNumber = value;
            }

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
         *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class ProgramName {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "Type")
            protected String type;

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
     *         &lt;element name="DiscountID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="TicketDesignator" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
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
        "discountID",
        "ticketDesignator"
    })
    public static class Discount {

        @XmlElement(name = "DiscountID")
        protected String discountID;
        @XmlElement(name = "TicketDesignator")
        protected String ticketDesignator;

        /**
         * 获取discountID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDiscountID() {
            return discountID;
        }

        /**
         * 设置discountID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDiscountID(String value) {
            this.discountID = value;
        }

        /**
         * 获取ticketDesignator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTicketDesignator() {
            return ticketDesignator;
        }

        /**
         * 设置ticketDesignator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTicketDesignator(String value) {
            this.ticketDesignator = value;
        }

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
    public static class TourCode {

        @XmlValue
        protected String value;

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

    }

}
