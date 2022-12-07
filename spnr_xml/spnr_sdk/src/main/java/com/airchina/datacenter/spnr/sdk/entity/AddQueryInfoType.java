//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AddQueryInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AddQueryInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Banks" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Bank" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Cabins" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Cabin" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="CabinName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Brands" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
 *                             &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
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
@XmlType(name = "AddQueryInfoType", propOrder = {
    "banks",
    "cabins",
    "brands"
})
public class AddQueryInfoType {

    @XmlElement(name = "Banks")
    protected AddQueryInfoType.Banks banks;
    @XmlElement(name = "Cabins")
    protected AddQueryInfoType.Cabins cabins;
    @XmlElement(name = "Brands")
    protected AddQueryInfoType.Brands brands;

    /**
     * 获取banks属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddQueryInfoType.Banks }
     *     
     */
    public AddQueryInfoType.Banks getBanks() {
        return banks;
    }

    /**
     * 设置banks属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddQueryInfoType.Banks }
     *     
     */
    public void setBanks(AddQueryInfoType.Banks value) {
        this.banks = value;
    }

    /**
     * 获取cabins属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddQueryInfoType.Cabins }
     *     
     */
    public AddQueryInfoType.Cabins getCabins() {
        return cabins;
    }

    /**
     * 设置cabins属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddQueryInfoType.Cabins }
     *     
     */
    public void setCabins(AddQueryInfoType.Cabins value) {
        this.cabins = value;
    }

    /**
     * 获取brands属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AddQueryInfoType.Brands }
     *     
     */
    public AddQueryInfoType.Brands getBrands() {
        return brands;
    }

    /**
     * 设置brands属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AddQueryInfoType.Brands }
     *     
     */
    public void setBrands(AddQueryInfoType.Brands value) {
        this.brands = value;
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
     *         &lt;element name="Bank" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "bank"
    })
    public static class Banks {

        @XmlElement(name = "Bank")
        protected List<AddQueryInfoType.Banks.Bank> bank;

        /**
         * Gets the value of the bank property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the bank property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBank().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddQueryInfoType.Banks.Bank }
         * 
         * 
         */
        public List<AddQueryInfoType.Banks.Bank> getBank() {
            if (bank == null) {
                bank = new ArrayList<AddQueryInfoType.Banks.Bank>();
            }
            return this.bank;
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
         *         &lt;element name="BankName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="BankCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "bankName",
            "bankCode",
            "tpaExtensions"
        })
        public static class Bank {

            @XmlElement(name = "BankName")
            protected Object bankName;
            @XmlElement(name = "BankCode")
            protected Object bankCode;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * 获取bankName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBankName() {
                return bankName;
            }

            /**
             * 设置bankName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBankName(Object value) {
                this.bankName = value;
            }

            /**
             * 获取bankCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBankCode() {
                return bankCode;
            }

            /**
             * 设置bankCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBankCode(Object value) {
                this.bankCode = value;
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
     *         &lt;element name="Brand" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "brand"
    })
    public static class Brands {

        @XmlElement(name = "Brand")
        protected List<AddQueryInfoType.Brands.Brand> brand;

        /**
         * Gets the value of the brand property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the brand property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getBrand().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddQueryInfoType.Brands.Brand }
         * 
         * 
         */
        public List<AddQueryInfoType.Brands.Brand> getBrand() {
            if (brand == null) {
                brand = new ArrayList<AddQueryInfoType.Brands.Brand>();
            }
            return this.brand;
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
         *         &lt;element name="BrandName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="BrandCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "brandName",
            "brandCode",
            "tpaExtensions"
        })
        public static class Brand {

            @XmlElement(name = "BrandName")
            protected Object brandName;
            @XmlElement(name = "BrandCode")
            protected Object brandCode;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * 获取brandName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBrandName() {
                return brandName;
            }

            /**
             * 设置brandName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBrandName(Object value) {
                this.brandName = value;
            }

            /**
             * 获取brandCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getBrandCode() {
                return brandCode;
            }

            /**
             * 设置brandCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setBrandCode(Object value) {
                this.brandCode = value;
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
     *         &lt;element name="Cabin" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="CabinName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
     *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *                 &lt;/sequence>
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
        "cabin"
    })
    public static class Cabins {

        @XmlElement(name = "Cabin")
        protected List<AddQueryInfoType.Cabins.Cabin> cabin;

        /**
         * Gets the value of the cabin property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cabin property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCabin().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AddQueryInfoType.Cabins.Cabin }
         * 
         * 
         */
        public List<AddQueryInfoType.Cabins.Cabin> getCabin() {
            if (cabin == null) {
                cabin = new ArrayList<AddQueryInfoType.Cabins.Cabin>();
            }
            return this.cabin;
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
         *         &lt;element name="CabinName" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
         *         &lt;element name="CabinCode" type="{http://www.w3.org/2001/XMLSchema}anyType" minOccurs="0"/>
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
        @XmlType(name = "", propOrder = {
            "cabinName",
            "cabinCode",
            "tpaExtensions"
        })
        public static class Cabin {

            @XmlElement(name = "CabinName")
            protected Object cabinName;
            @XmlElement(name = "CabinCode")
            protected Object cabinCode;
            @XmlElement(name = "TPA_Extensions")
            protected TPAExtensionsType tpaExtensions;

            /**
             * 获取cabinName属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCabinName() {
                return cabinName;
            }

            /**
             * 设置cabinName属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCabinName(Object value) {
                this.cabinName = value;
            }

            /**
             * 获取cabinCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Object }
             *     
             */
            public Object getCabinCode() {
                return cabinCode;
            }

            /**
             * 设置cabinCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Object }
             *     
             */
            public void setCabinCode(Object value) {
                this.cabinCode = value;
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

        }

    }

}
