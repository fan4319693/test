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


/**
 * Specifies the document handling information.
 * 
 * <p>DocumentHandlingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="DocumentHandlingType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="VendorOption" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                 &lt;attribute name="VendorName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DocumentTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="DeliveryMethodCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="DocumentDestination" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="SelectedOptionIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="DefaultIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AddressRequiredIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="AddressRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="EmailRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="TelephoneRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "DocumentHandlingType", propOrder = {
    "vendorOption"
})
public class DocumentHandlingType {

    @XmlElement(name = "VendorOption")
    protected List<DocumentHandlingType.VendorOption> vendorOption;
    @XmlAttribute(name = "DocumentTypeCode")
    protected String documentTypeCode;
    @XmlAttribute(name = "DeliveryMethodCode")
    protected String deliveryMethodCode;
    @XmlAttribute(name = "DocumentDestination")
    protected String documentDestination;
    @XmlAttribute(name = "SelectedOptionIndicator")
    protected Boolean selectedOptionIndicator;
    @XmlAttribute(name = "DefaultIndicator")
    protected Boolean defaultIndicator;
    @XmlAttribute(name = "AddressRequiredIndicator")
    protected Boolean addressRequiredIndicator;
    @XmlAttribute(name = "AddressRPH")
    protected String addressRPH;
    @XmlAttribute(name = "EmailRPH")
    protected String emailRPH;
    @XmlAttribute(name = "TelephoneRPH")
    protected String telephoneRPH;

    /**
     * Gets the value of the vendorOption property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vendorOption property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVendorOption().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link DocumentHandlingType.VendorOption }
     * 
     * 
     */
    public List<DocumentHandlingType.VendorOption> getVendorOption() {
        if (vendorOption == null) {
            vendorOption = new ArrayList<DocumentHandlingType.VendorOption>();
        }
        return this.vendorOption;
    }

    /**
     * 获取documentTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentTypeCode() {
        return documentTypeCode;
    }

    /**
     * 设置documentTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentTypeCode(String value) {
        this.documentTypeCode = value;
    }

    /**
     * 获取deliveryMethodCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeliveryMethodCode() {
        return deliveryMethodCode;
    }

    /**
     * 设置deliveryMethodCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeliveryMethodCode(String value) {
        this.deliveryMethodCode = value;
    }

    /**
     * 获取documentDestination属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDocumentDestination() {
        return documentDestination;
    }

    /**
     * 设置documentDestination属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDocumentDestination(String value) {
        this.documentDestination = value;
    }

    /**
     * 获取selectedOptionIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSelectedOptionIndicator() {
        return selectedOptionIndicator;
    }

    /**
     * 设置selectedOptionIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSelectedOptionIndicator(Boolean value) {
        this.selectedOptionIndicator = value;
    }

    /**
     * 获取defaultIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDefaultIndicator() {
        return defaultIndicator;
    }

    /**
     * 设置defaultIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDefaultIndicator(Boolean value) {
        this.defaultIndicator = value;
    }

    /**
     * 获取addressRequiredIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAddressRequiredIndicator() {
        return addressRequiredIndicator;
    }

    /**
     * 设置addressRequiredIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAddressRequiredIndicator(Boolean value) {
        this.addressRequiredIndicator = value;
    }

    /**
     * 获取addressRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAddressRPH() {
        return addressRPH;
    }

    /**
     * 设置addressRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAddressRPH(String value) {
        this.addressRPH = value;
    }

    /**
     * 获取emailRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEmailRPH() {
        return emailRPH;
    }

    /**
     * 设置emailRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEmailRPH(String value) {
        this.emailRPH = value;
    }

    /**
     * 获取telephoneRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTelephoneRPH() {
        return telephoneRPH;
    }

    /**
     * 设置telephoneRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTelephoneRPH(String value) {
        this.telephoneRPH = value;
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
     *       &lt;attribute name="VendorName" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VendorOption {

        @XmlAttribute(name = "VendorName")
        protected String vendorName;
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
         * 获取vendorName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getVendorName() {
            return vendorName;
        }

        /**
         * 设置vendorName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setVendorName(String value) {
            this.vendorName = value;
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

    }

}
