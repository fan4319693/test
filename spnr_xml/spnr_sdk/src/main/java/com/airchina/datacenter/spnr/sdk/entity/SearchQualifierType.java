//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Search qualifiers that can be used in cruise availability/fare/category to avail special search data.
 * 
 * <p>SearchQualifierType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SearchQualifierType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ReservationID" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" minOccurs="0"/>
 *         &lt;element name="Residency" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StateProvCode" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
 *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="PriceRange" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Status" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FareGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCategoryGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}LoyaltyInfoGroup"/>
 *       &lt;attribute name="CabinNumber" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="HeldIndicator" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="MaxOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="SortOrderCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SearchQualifierType", propOrder = {
    "reservationID",
    "residency",
    "priceRange",
    "status"
})
@XmlSeeAlso({
    SailingSearchQualifierType.class
})
public class SearchQualifierType {

    @XmlElement(name = "ReservationID")
    protected UniqueIDType reservationID;
    @XmlElement(name = "Residency")
    protected SearchQualifierType.Residency residency;
    @XmlElement(name = "PriceRange")
    protected SearchQualifierType.PriceRange priceRange;
    @XmlElement(name = "Status")
    protected List<SearchQualifierType.Status> status;
    @XmlAttribute(name = "CabinNumber")
    protected String cabinNumber;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "SortOrderCode")
    protected String sortOrderCode;
    @XmlAttribute(name = "FareCode")
    protected String fareCode;
    @XmlAttribute(name = "GroupCode")
    protected String groupCode;
    @XmlAttribute(name = "BerthedCategoryCode")
    protected String berthedCategoryCode;
    @XmlAttribute(name = "PricedCategoryCode")
    protected String pricedCategoryCode;
    @XmlAttribute(name = "LoyaltyMembershipID")
    protected String loyaltyMembershipID;
    @XmlAttribute(name = "LoyalLevel")
    protected String loyalLevel;
    @XmlAttribute(name = "LoyalLevelCode")
    protected Integer loyalLevelCode;

    /**
     * 获取reservationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link UniqueIDType }
     *     
     */
    public UniqueIDType getReservationID() {
        return reservationID;
    }

    /**
     * 设置reservationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link UniqueIDType }
     *     
     */
    public void setReservationID(UniqueIDType value) {
        this.reservationID = value;
    }

    /**
     * 获取residency属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchQualifierType.Residency }
     *     
     */
    public SearchQualifierType.Residency getResidency() {
        return residency;
    }

    /**
     * 设置residency属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchQualifierType.Residency }
     *     
     */
    public void setResidency(SearchQualifierType.Residency value) {
        this.residency = value;
    }

    /**
     * 获取priceRange属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SearchQualifierType.PriceRange }
     *     
     */
    public SearchQualifierType.PriceRange getPriceRange() {
        return priceRange;
    }

    /**
     * 设置priceRange属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SearchQualifierType.PriceRange }
     *     
     */
    public void setPriceRange(SearchQualifierType.PriceRange value) {
        this.priceRange = value;
    }

    /**
     * Gets the value of the status property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the status property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getStatus().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SearchQualifierType.Status }
     * 
     * 
     */
    public List<SearchQualifierType.Status> getStatus() {
        if (status == null) {
            status = new ArrayList<SearchQualifierType.Status>();
        }
        return this.status;
    }

    /**
     * 获取cabinNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * 设置cabinNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * 获取heldIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * 设置heldIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }

    /**
     * 获取categoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * 设置categoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * 获取sortOrderCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSortOrderCode() {
        return sortOrderCode;
    }

    /**
     * 设置sortOrderCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSortOrderCode(String value) {
        this.sortOrderCode = value;
    }

    /**
     * 获取fareCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFareCode() {
        return fareCode;
    }

    /**
     * 设置fareCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFareCode(String value) {
        this.fareCode = value;
    }

    /**
     * 获取groupCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupCode() {
        return groupCode;
    }

    /**
     * 设置groupCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupCode(String value) {
        this.groupCode = value;
    }

    /**
     * 获取berthedCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBerthedCategoryCode() {
        return berthedCategoryCode;
    }

    /**
     * 设置berthedCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBerthedCategoryCode(String value) {
        this.berthedCategoryCode = value;
    }

    /**
     * 获取pricedCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPricedCategoryCode() {
        return pricedCategoryCode;
    }

    /**
     * 设置pricedCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPricedCategoryCode(String value) {
        this.pricedCategoryCode = value;
    }

    /**
     * 获取loyaltyMembershipID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyaltyMembershipID() {
        return loyaltyMembershipID;
    }

    /**
     * 设置loyaltyMembershipID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyaltyMembershipID(String value) {
        this.loyaltyMembershipID = value;
    }

    /**
     * 获取loyalLevel属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getLoyalLevel() {
        return loyalLevel;
    }

    /**
     * 设置loyalLevel属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setLoyalLevel(String value) {
        this.loyalLevel = value;
    }

    /**
     * 获取loyalLevelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getLoyalLevelCode() {
        return loyalLevelCode;
    }

    /**
     * 设置loyalLevelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setLoyalLevelCode(Integer value) {
        this.loyalLevelCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}RateRangeGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class PriceRange {

        @XmlAttribute(name = "MinRate")
        protected BigDecimal minRate;
        @XmlAttribute(name = "MaxRate")
        protected BigDecimal maxRate;
        @XmlAttribute(name = "FixedRate")
        protected BigDecimal fixedRate;
        @XmlAttribute(name = "RateTimeUnit")
        protected String rateTimeUnit;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "DecimalPlaces")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger decimalPlaces;

        /**
         * 获取minRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMinRate() {
            return minRate;
        }

        /**
         * 设置minRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMinRate(BigDecimal value) {
            this.minRate = value;
        }

        /**
         * 获取maxRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getMaxRate() {
            return maxRate;
        }

        /**
         * 设置maxRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setMaxRate(BigDecimal value) {
            this.maxRate = value;
        }

        /**
         * 获取fixedRate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getFixedRate() {
            return fixedRate;
        }

        /**
         * 设置fixedRate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setFixedRate(BigDecimal value) {
            this.fixedRate = value;
        }

        /**
         * 获取rateTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRateTimeUnit() {
            return rateTimeUnit;
        }

        /**
         * 设置rateTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRateTimeUnit(String value) {
            this.rateTimeUnit = value;
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
     *       &lt;attribute name="StateProvCode" type="{http://www.opentravel.org/OTA/2003/05}StateProvCodeType" />
     *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Residency {

        @XmlAttribute(name = "StateProvCode")
        protected String stateProvCode;
        @XmlAttribute(name = "CountryCode")
        protected String countryCode;

        /**
         * 获取stateProvCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStateProvCode() {
            return stateProvCode;
        }

        /**
         * 设置stateProvCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStateProvCode(String value) {
            this.stateProvCode = value;
        }

        /**
         * 获取countryCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCountryCode() {
            return countryCode;
        }

        /**
         * 设置countryCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCountryCode(String value) {
            this.countryCode = value;
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
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Status {

        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * 获取status属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStatus() {
            return status;
        }

        /**
         * 设置status属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStatus(String value) {
            this.status = value;
        }

    }

}
