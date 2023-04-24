//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information on the vehicle and optionally trailer to be carried.
 * 
 * <p>VehicleDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Vehicle">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="VehiclePricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginalUnitPrice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UnitPrice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotalPrice">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
 *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to4" />
 *                 &lt;attribute name="BikesOnBackIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Trailer" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleBaseType">
 *                 &lt;sequence>
 *                   &lt;element name="TrailerPricing" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="OriginalUnitPrice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="UnitPrice" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="TotalPrice">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
 *                 &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to4" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="BulkVehicleInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="Quantity" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
 *       &lt;attribute name="RPH" use="required" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="ItineraryRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleDetailsType", propOrder = {
    "vehicle",
    "trailer"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.FerryReservationRequest.VehicleDetail.class
})
public class VehicleDetailsType {

    @XmlElement(name = "Vehicle", required = true)
    protected VehicleDetailsType.Vehicle vehicle;
    @XmlElement(name = "Trailer")
    protected VehicleDetailsType.Trailer trailer;
    @XmlAttribute(name = "BulkVehicleInd")
    protected Boolean bulkVehicleInd;
    @XmlAttribute(name = "Quantity")
    protected Integer quantity;
    @XmlAttribute(name = "RPH", required = true)
    protected String rph;
    @XmlAttribute(name = "ItineraryRPH")
    protected String itineraryRPH;

    /**
     * 获取vehicle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetailsType.Vehicle }
     *     
     */
    public VehicleDetailsType.Vehicle getVehicle() {
        return vehicle;
    }

    /**
     * 设置vehicle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetailsType.Vehicle }
     *     
     */
    public void setVehicle(VehicleDetailsType.Vehicle value) {
        this.vehicle = value;
    }

    /**
     * 获取trailer属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleDetailsType.Trailer }
     *     
     */
    public VehicleDetailsType.Trailer getTrailer() {
        return trailer;
    }

    /**
     * 设置trailer属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleDetailsType.Trailer }
     *     
     */
    public void setTrailer(VehicleDetailsType.Trailer value) {
        this.trailer = value;
    }

    /**
     * 获取bulkVehicleInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isBulkVehicleInd() {
        return bulkVehicleInd;
    }

    /**
     * 设置bulkVehicleInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setBulkVehicleInd(Boolean value) {
        this.bulkVehicleInd = value;
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
     * 获取itineraryRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getItineraryRPH() {
        return itineraryRPH;
    }

    /**
     * 设置itineraryRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setItineraryRPH(String value) {
        this.itineraryRPH = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleBaseType">
     *       &lt;sequence>
     *         &lt;element name="TrailerPricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginalUnitPrice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="UnitPrice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TotalPrice">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
     *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to4" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "trailerPricing"
    })
    public static class Trailer
        extends VehicleBaseType
    {

        @XmlElement(name = "TrailerPricing")
        protected VehicleDetailsType.Trailer.TrailerPricing trailerPricing;
        @XmlAttribute(name = "Code", required = true)
        protected String code;

        /**
         * 获取trailerPricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehicleDetailsType.Trailer.TrailerPricing }
         *     
         */
        public VehicleDetailsType.Trailer.TrailerPricing getTrailerPricing() {
            return trailerPricing;
        }

        /**
         * 设置trailerPricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleDetailsType.Trailer.TrailerPricing }
         *     
         */
        public void setTrailerPricing(VehicleDetailsType.Trailer.TrailerPricing value) {
            this.trailerPricing = value;
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
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="OriginalUnitPrice" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="UnitPrice" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TotalPrice">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
            "originalUnitPrice",
            "unitPrice",
            "totalPrice"
        })
        public static class TrailerPricing {

            @XmlElement(name = "OriginalUnitPrice")
            protected VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice originalUnitPrice;
            @XmlElement(name = "UnitPrice")
            protected VehicleDetailsType.Trailer.TrailerPricing.UnitPrice unitPrice;
            @XmlElement(name = "TotalPrice", required = true)
            protected VehicleDetailsType.Trailer.TrailerPricing.TotalPrice totalPrice;

            /**
             * 获取originalUnitPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice }
             *     
             */
            public VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice getOriginalUnitPrice() {
                return originalUnitPrice;
            }

            /**
             * 设置originalUnitPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice }
             *     
             */
            public void setOriginalUnitPrice(VehicleDetailsType.Trailer.TrailerPricing.OriginalUnitPrice value) {
                this.originalUnitPrice = value;
            }

            /**
             * 获取unitPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.UnitPrice }
             *     
             */
            public VehicleDetailsType.Trailer.TrailerPricing.UnitPrice getUnitPrice() {
                return unitPrice;
            }

            /**
             * 设置unitPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.UnitPrice }
             *     
             */
            public void setUnitPrice(VehicleDetailsType.Trailer.TrailerPricing.UnitPrice value) {
                this.unitPrice = value;
            }

            /**
             * 获取totalPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.TotalPrice }
             *     
             */
            public VehicleDetailsType.Trailer.TrailerPricing.TotalPrice getTotalPrice() {
                return totalPrice;
            }

            /**
             * 设置totalPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Trailer.TrailerPricing.TotalPrice }
             *     
             */
            public void setTotalPrice(VehicleDetailsType.Trailer.TrailerPricing.TotalPrice value) {
                this.totalPrice = value;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OriginalUnitPrice {

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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TotalPrice {

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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class UnitPrice {

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

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleBaseType">
     *       &lt;sequence>
     *         &lt;element name="VehiclePricing" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="OriginalUnitPrice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="UnitPrice" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="TotalPrice">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
     *       &lt;attribute name="Code" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to4" />
     *       &lt;attribute name="BikesOnBackIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "vehiclePricing"
    })
    public static class Vehicle
        extends VehicleBaseType
    {

        @XmlElement(name = "VehiclePricing")
        protected VehicleDetailsType.Vehicle.VehiclePricing vehiclePricing;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "BikesOnBackIndicator")
        protected Boolean bikesOnBackIndicator;

        /**
         * 获取vehiclePricing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehicleDetailsType.Vehicle.VehiclePricing }
         *     
         */
        public VehicleDetailsType.Vehicle.VehiclePricing getVehiclePricing() {
            return vehiclePricing;
        }

        /**
         * 设置vehiclePricing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleDetailsType.Vehicle.VehiclePricing }
         *     
         */
        public void setVehiclePricing(VehicleDetailsType.Vehicle.VehiclePricing value) {
            this.vehiclePricing = value;
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
         * 获取bikesOnBackIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isBikesOnBackIndicator() {
            return bikesOnBackIndicator;
        }

        /**
         * 设置bikesOnBackIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setBikesOnBackIndicator(Boolean value) {
            this.bikesOnBackIndicator = value;
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
         *         &lt;element name="OriginalUnitPrice" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="UnitPrice" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="TotalPrice">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CurrencyAmountGroup"/>
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
            "originalUnitPrice",
            "unitPrice",
            "totalPrice"
        })
        public static class VehiclePricing {

            @XmlElement(name = "OriginalUnitPrice")
            protected VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice originalUnitPrice;
            @XmlElement(name = "UnitPrice")
            protected VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice unitPrice;
            @XmlElement(name = "TotalPrice", required = true)
            protected VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice totalPrice;

            /**
             * 获取originalUnitPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice }
             *     
             */
            public VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice getOriginalUnitPrice() {
                return originalUnitPrice;
            }

            /**
             * 设置originalUnitPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice }
             *     
             */
            public void setOriginalUnitPrice(VehicleDetailsType.Vehicle.VehiclePricing.OriginalUnitPrice value) {
                this.originalUnitPrice = value;
            }

            /**
             * 获取unitPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice }
             *     
             */
            public VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice getUnitPrice() {
                return unitPrice;
            }

            /**
             * 设置unitPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice }
             *     
             */
            public void setUnitPrice(VehicleDetailsType.Vehicle.VehiclePricing.UnitPrice value) {
                this.unitPrice = value;
            }

            /**
             * 获取totalPrice属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice }
             *     
             */
            public VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice getTotalPrice() {
                return totalPrice;
            }

            /**
             * 设置totalPrice属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice }
             *     
             */
            public void setTotalPrice(VehicleDetailsType.Vehicle.VehiclePricing.TotalPrice value) {
                this.totalPrice = value;
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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class OriginalUnitPrice {

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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class TotalPrice {

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
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class UnitPrice {

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

    }

}
