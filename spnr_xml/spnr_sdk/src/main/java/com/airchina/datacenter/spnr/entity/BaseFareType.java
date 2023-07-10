//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Base fare information.
 * 
 * <p>BaseFareType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseFareType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;all>
 *         &lt;element name="FiledIn" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;all>
 *                   &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
 *                   &lt;element name="Amount">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="BulkMask" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="NUCAmount">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                           &lt;attribute name="ROE" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/all>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Surcharges" type="{http://www.opentravel.org/OTA/2003/05}SurchargesType" minOccurs="0"/>
 *       &lt;/all>
 *       &lt;attribute name="Amount" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BaseFareType", propOrder = {

})
public class BaseFareType {

    @XmlElement(name = "FiledIn")
    protected BaseFareType.FiledIn filedIn;
    @XmlElement(name = "Surcharges")
    protected SurchargesType surcharges;
    @XmlAttribute(name = "Amount", required = true)
    protected BigInteger amount;

    /**
     * 获取filedIn属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseFareType.FiledIn }
     *     
     */
    public BaseFareType.FiledIn getFiledIn() {
        return filedIn;
    }

    /**
     * 设置filedIn属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseFareType.FiledIn }
     *     
     */
    public void setFiledIn(BaseFareType.FiledIn value) {
        this.filedIn = value;
    }

    /**
     * 获取surcharges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SurchargesType }
     *     
     */
    public SurchargesType getSurcharges() {
        return surcharges;
    }

    /**
     * 设置surcharges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SurchargesType }
     *     
     */
    public void setSurcharges(SurchargesType value) {
        this.surcharges = value;
    }

    /**
     * 获取amount属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getAmount() {
        return amount;
    }

    /**
     * 设置amount属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setAmount(BigInteger value) {
        this.amount = value;
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
     *       &lt;all>
     *         &lt;element name="CurrencyCode" type="{http://www.opentravel.org/OTA/2003/05}CurrencyCodeType"/>
     *         &lt;element name="Amount">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="BulkMask" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="NUCAmount">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *                 &lt;attribute name="ROE" type="{http://www.w3.org/2001/XMLSchema}string" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/all>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {

    })
    public static class FiledIn {

        @XmlElement(name = "CurrencyCode", required = true)
        protected CurrencyCodeType currencyCode;
        @XmlElement(name = "Amount", required = true)
        protected BaseFareType.FiledIn.Amount amount;
        @XmlElement(name = "NUCAmount", required = true)
        protected BaseFareType.FiledIn.NUCAmount nucAmount;

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CurrencyCodeType }
         *     
         */
        public CurrencyCodeType getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CurrencyCodeType }
         *     
         */
        public void setCurrencyCode(CurrencyCodeType value) {
            this.currencyCode = value;
        }

        /**
         * 获取amount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BaseFareType.FiledIn.Amount }
         *     
         */
        public BaseFareType.FiledIn.Amount getAmount() {
            return amount;
        }

        /**
         * 设置amount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BaseFareType.FiledIn.Amount }
         *     
         */
        public void setAmount(BaseFareType.FiledIn.Amount value) {
            this.amount = value;
        }

        /**
         * 获取nucAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BaseFareType.FiledIn.NUCAmount }
         *     
         */
        public BaseFareType.FiledIn.NUCAmount getNUCAmount() {
            return nucAmount;
        }

        /**
         * 设置nucAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BaseFareType.FiledIn.NUCAmount }
         *     
         */
        public void setNUCAmount(BaseFareType.FiledIn.NUCAmount value) {
            this.nucAmount = value;
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
         *       &lt;attribute name="BulkMask" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            @XmlAttribute(name = "BulkMask")
            protected String bulkMask;

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
             * 获取bulkMask属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getBulkMask() {
                return bulkMask;
            }

            /**
             * 设置bulkMask属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setBulkMask(String value) {
                this.bulkMask = value;
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
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
         *       &lt;attribute name="ROE" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        public static class NUCAmount {

            @XmlValue
            protected BigInteger value;
            @XmlAttribute(name = "ROE")
            protected String roe;

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
             * 获取roe属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getROE() {
                return roe;
            }

            /**
             * 设置roe属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setROE(String value) {
                this.roe = value;
            }

        }

    }

}
