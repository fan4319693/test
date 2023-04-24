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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Rates" maxOccurs="unbounded"/>
 *         &lt;element name="QuantityOptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="QuantityOption" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="ValidQuantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
@XmlType(name = "", propOrder = {
    "rates",
    "quantityOptions"
})
@XmlRootElement(name = "AllRates")
public class AllRates {

    @XmlElement(name = "Rates", required = true)
    protected List<Rates> rates;
    @XmlElement(name = "QuantityOptions")
    protected AllRates.QuantityOptions quantityOptions;

    /**
     * Gets the value of the rates property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the rates property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRates().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Rates }
     * 
     * 
     */
    public List<Rates> getRates() {
        if (rates == null) {
            rates = new ArrayList<Rates>();
        }
        return this.rates;
    }

    /**
     * 获取quantityOptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AllRates.QuantityOptions }
     *     
     */
    public AllRates.QuantityOptions getQuantityOptions() {
        return quantityOptions;
    }

    /**
     * 设置quantityOptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AllRates.QuantityOptions }
     *     
     */
    public void setQuantityOptions(AllRates.QuantityOptions value) {
        this.quantityOptions = value;
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
     *         &lt;element name="QuantityOption" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="ValidQuantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
        "quantityOption"
    })
    public static class QuantityOptions {

        @XmlElement(name = "QuantityOption", required = true)
        protected List<AllRates.QuantityOptions.QuantityOption> quantityOption;

        /**
         * Gets the value of the quantityOption property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the quantityOption property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getQuantityOption().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AllRates.QuantityOptions.QuantityOption }
         * 
         * 
         */
        public List<AllRates.QuantityOptions.QuantityOption> getQuantityOption() {
            if (quantityOption == null) {
                quantityOption = new ArrayList<AllRates.QuantityOptions.QuantityOption>();
            }
            return this.quantityOption;
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
         *       &lt;attribute name="ValidQuantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class QuantityOption {

            @XmlAttribute(name = "ValidQuantity")
            @XmlSchemaType(name = "anySimpleType")
            protected String validQuantity;

            /**
             * 获取validQuantity属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValidQuantity() {
                return validQuantity;
            }

            /**
             * 设置validQuantity属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValidQuantity(String value) {
                this.validQuantity = value;
            }

        }

    }

}
