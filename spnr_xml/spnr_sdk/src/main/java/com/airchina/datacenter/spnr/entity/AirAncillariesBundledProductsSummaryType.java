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
import javax.xml.bind.annotation.XmlType;


/**
 * <p>AirAncillariesBundledProductsSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AirAncillariesBundledProductsSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Ancillary" type="{http://www.opentravel.org/OTA/2003/05}AirAncillaryProductType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="Service" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Prices" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Price" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
 *                                       &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}AdjustedCurrencyAmountType"/>
 *                                     &lt;/sequence>
 *                                     &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ProductAvailability" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "AirAncillariesBundledProductsSummaryType", propOrder = {
    "ancillary",
    "service"
})
public class AirAncillariesBundledProductsSummaryType {

    @XmlElement(name = "Ancillary")
    protected List<AirAncillaryProductType> ancillary;
    @XmlElement(name = "Service")
    protected List<AirAncillariesBundledProductsSummaryType.Service> service;

    /**
     * Gets the value of the ancillary property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillary property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillary().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAncillaryProductType }
     * 
     * 
     */
    public List<AirAncillaryProductType> getAncillary() {
        if (ancillary == null) {
            ancillary = new ArrayList<AirAncillaryProductType>();
        }
        return this.ancillary;
    }

    /**
     * Gets the value of the service property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the service property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AirAncillariesBundledProductsSummaryType.Service }
     * 
     * 
     */
    public List<AirAncillariesBundledProductsSummaryType.Service> getService() {
        if (service == null) {
            service = new ArrayList<AirAncillariesBundledProductsSummaryType.Service>();
        }
        return this.service;
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
     *         &lt;element name="Prices" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Price" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
     *                             &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}AdjustedCurrencyAmountType"/>
     *                           &lt;/sequence>
     *                           &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attribute name="Category" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ProductAvailability" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="ServiceCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "prices"
    })
    public static class Service {

        @XmlElement(name = "Prices")
        protected AirAncillariesBundledProductsSummaryType.Service.Prices prices;
        @XmlAttribute(name = "Category", required = true)
        protected String category;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "ProductAvailability", required = true)
        protected boolean productAvailability;
        @XmlAttribute(name = "ServiceCode")
        protected String serviceCode;

        /**
         * 获取prices属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AirAncillariesBundledProductsSummaryType.Service.Prices }
         *     
         */
        public AirAncillariesBundledProductsSummaryType.Service.Prices getPrices() {
            return prices;
        }

        /**
         * 设置prices属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AirAncillariesBundledProductsSummaryType.Service.Prices }
         *     
         */
        public void setPrices(AirAncillariesBundledProductsSummaryType.Service.Prices value) {
            this.prices = value;
        }

        /**
         * 获取category属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCategory() {
            return category;
        }

        /**
         * 设置category属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCategory(String value) {
            this.category = value;
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
         * 获取productAvailability属性的值。
         * 
         */
        public boolean isProductAvailability() {
            return productAvailability;
        }

        /**
         * 设置productAvailability属性的值。
         * 
         */
        public void setProductAvailability(boolean value) {
            this.productAvailability = value;
        }

        /**
         * 获取serviceCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getServiceCode() {
            return serviceCode;
        }

        /**
         * 设置serviceCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setServiceCode(String value) {
            this.serviceCode = value;
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
         *         &lt;element name="Price" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
         *                   &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}AdjustedCurrencyAmountType"/>
         *                 &lt;/sequence>
         *                 &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "price"
        })
        public static class Prices {

            @XmlElement(name = "Price", required = true)
            protected List<AirAncillariesBundledProductsSummaryType.Service.Prices.Price> price;

            /**
             * Gets the value of the price property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the price property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getPrice().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link AirAncillariesBundledProductsSummaryType.Service.Prices.Price }
             * 
             * 
             */
            public List<AirAncillariesBundledProductsSummaryType.Service.Prices.Price> getPrice() {
                if (price == null) {
                    price = new ArrayList<AirAncillariesBundledProductsSummaryType.Service.Prices.Price>();
                }
                return this.price;
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
             *         &lt;element name="PriceAdjustments" type="{http://www.opentravel.org/OTA/2003/05}exPriceAdjustmentsType" minOccurs="0"/>
             *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}AdjustedCurrencyAmountType"/>
             *       &lt;/sequence>
             *       &lt;attribute name="ExcessFirst" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="ExcessLast" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="PassengerTypeCode" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "", propOrder = {
                "priceAdjustments",
                "total"
            })
            public static class Price {

                @XmlElement(name = "PriceAdjustments")
                protected ExPriceAdjustmentsType priceAdjustments;
                @XmlElement(name = "Total", required = true)
                protected AdjustedCurrencyAmountType total;
                @XmlAttribute(name = "ExcessFirst")
                protected Integer excessFirst;
                @XmlAttribute(name = "ExcessLast")
                protected Integer excessLast;
                @XmlAttribute(name = "PassengerTypeCode")
                protected String passengerTypeCode;

                /**
                 * 获取priceAdjustments属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public ExPriceAdjustmentsType getPriceAdjustments() {
                    return priceAdjustments;
                }

                /**
                 * 设置priceAdjustments属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link ExPriceAdjustmentsType }
                 *     
                 */
                public void setPriceAdjustments(ExPriceAdjustmentsType value) {
                    this.priceAdjustments = value;
                }

                /**
                 * 获取total属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link AdjustedCurrencyAmountType }
                 *     
                 */
                public AdjustedCurrencyAmountType getTotal() {
                    return total;
                }

                /**
                 * 设置total属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link AdjustedCurrencyAmountType }
                 *     
                 */
                public void setTotal(AdjustedCurrencyAmountType value) {
                    this.total = value;
                }

                /**
                 * 获取excessFirst属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getExcessFirst() {
                    return excessFirst;
                }

                /**
                 * 设置excessFirst属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExcessFirst(Integer value) {
                    this.excessFirst = value;
                }

                /**
                 * 获取excessLast属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getExcessLast() {
                    return excessLast;
                }

                /**
                 * 设置excessLast属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setExcessLast(Integer value) {
                    this.excessLast = value;
                }

                /**
                 * 获取passengerTypeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getPassengerTypeCode() {
                    return passengerTypeCode;
                }

                /**
                 * 设置passengerTypeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setPassengerTypeCode(String value) {
                    this.passengerTypeCode = value;
                }

            }

        }

    }

}
