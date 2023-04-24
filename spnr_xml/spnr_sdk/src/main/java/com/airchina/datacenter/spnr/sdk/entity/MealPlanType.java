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
 * Details of meal arrangements, booked or available according to context, with appropriate supplementary charges. 
 * 
 * <p>MealPlanType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MealPlanType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CustomerCounts" type="{http://www.opentravel.org/OTA/2003/05}CustomerCountsType" minOccurs="0"/>
 *         &lt;element name="PassengerRPHs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Prices" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Price" maxOccurs="9">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
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
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}MealPlanGroup"/>
 *       &lt;attribute name="ListOfRoomRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MealPlanType", propOrder = {
    "customerCounts",
    "passengerRPHs",
    "prices"
})
public class MealPlanType {

    @XmlElement(name = "CustomerCounts")
    protected CustomerCountsType customerCounts;
    @XmlElement(name = "PassengerRPHs")
    protected MealPlanType.PassengerRPHs passengerRPHs;
    @XmlElement(name = "Prices")
    protected MealPlanType.Prices prices;
    @XmlAttribute(name = "ListOfRoomRPH")
    protected List<String> listOfRoomRPH;
    @XmlAttribute(name = "Plan")
    protected String plan;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Quantity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger quantity;

    /**
     * 获取customerCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomerCountsType }
     *     
     */
    public CustomerCountsType getCustomerCounts() {
        return customerCounts;
    }

    /**
     * 设置customerCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomerCountsType }
     *     
     */
    public void setCustomerCounts(CustomerCountsType value) {
        this.customerCounts = value;
    }

    /**
     * 获取passengerRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MealPlanType.PassengerRPHs }
     *     
     */
    public MealPlanType.PassengerRPHs getPassengerRPHs() {
        return passengerRPHs;
    }

    /**
     * 设置passengerRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MealPlanType.PassengerRPHs }
     *     
     */
    public void setPassengerRPHs(MealPlanType.PassengerRPHs value) {
        this.passengerRPHs = value;
    }

    /**
     * 获取prices属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MealPlanType.Prices }
     *     
     */
    public MealPlanType.Prices getPrices() {
        return prices;
    }

    /**
     * 设置prices属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MealPlanType.Prices }
     *     
     */
    public void setPrices(MealPlanType.Prices value) {
        this.prices = value;
    }

    /**
     * Gets the value of the listOfRoomRPH property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the listOfRoomRPH property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getListOfRoomRPH().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getListOfRoomRPH() {
        if (listOfRoomRPH == null) {
            listOfRoomRPH = new ArrayList<String>();
        }
        return this.listOfRoomRPH;
    }

    /**
     * 获取plan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPlan() {
        return plan;
    }

    /**
     * 设置plan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPlan(String value) {
        this.plan = value;
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
     * 获取rph属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRPH() {
        return rph;
    }

    /**
     * 设置rph属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRPH(String value) {
        this.rph = value;
    }

    /**
     * 获取quantity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getQuantity() {
        return quantity;
    }

    /**
     * 设置quantity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setQuantity(BigInteger value) {
        this.quantity = value;
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
     *       &lt;attribute name="ListOfPassengerRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PassengerRPHs {

        @XmlAttribute(name = "ListOfPassengerRPH")
        protected List<String> listOfPassengerRPH;

        /**
         * Gets the value of the listOfPassengerRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfPassengerRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfPassengerRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfPassengerRPH() {
            if (listOfPassengerRPH == null) {
                listOfPassengerRPH = new ArrayList<String>();
            }
            return this.listOfPassengerRPH;
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
     *         &lt;element name="Price" maxOccurs="9">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
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
        protected List<MealPlanType.Prices.Price> price;

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
         * {@link MealPlanType.Prices.Price }
         * 
         * 
         */
        public List<MealPlanType.Prices.Price> getPrice() {
            if (price == null) {
                price = new ArrayList<MealPlanType.Prices.Price>();
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PriceGroup"/>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Price {

            @XmlAttribute(name = "PriceQualifier")
            protected Integer priceQualifier;
            @XmlAttribute(name = "PriceBasis")
            protected PricingType priceBasis;
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
            @XmlAttribute(name = "AgeQualifyingCode")
            protected String ageQualifyingCode;
            @XmlAttribute(name = "Age")
            protected Integer age;
            @XmlAttribute(name = "Count")
            protected Integer count;

            /**
             * 获取priceQualifier属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getPriceQualifier() {
                return priceQualifier;
            }

            /**
             * 设置priceQualifier属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setPriceQualifier(Integer value) {
                this.priceQualifier = value;
            }

            /**
             * 获取priceBasis属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PricingType }
             *     
             */
            public PricingType getPriceBasis() {
                return priceBasis;
            }

            /**
             * 设置priceBasis属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PricingType }
             *     
             */
            public void setPriceBasis(PricingType value) {
                this.priceBasis = value;
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

            /**
             * 获取ageQualifyingCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAgeQualifyingCode() {
                return ageQualifyingCode;
            }

            /**
             * 设置ageQualifyingCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAgeQualifyingCode(String value) {
                this.ageQualifyingCode = value;
            }

            /**
             * 获取age属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getAge() {
                return age;
            }

            /**
             * 设置age属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setAge(Integer value) {
                this.age = value;
            }

            /**
             * 获取count属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCount() {
                return count;
            }

            /**
             * 设置count属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCount(Integer value) {
                this.count = value;
            }

        }

    }

}
