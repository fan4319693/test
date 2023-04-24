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
 * Construct for holding cabin class information, such as seat availability or meal codes. Can be up to three of these per flight segment or air leg - First, Business and Economy.
 * 
 * <p>CabinAvailabilityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CabinAvailabilityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Meal" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BaggageAllowance" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="FlightLoadInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AuthorizedSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="NRSA_StandbyPaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="RevenuePaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="CabinType" use="required" type="{http://www.opentravel.org/OTA/2003/05}CabinType" />
 *       &lt;attribute name="CabinCapacity" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinAvailabilityType", propOrder = {
    "meal",
    "baggageAllowance",
    "flightLoadInfo"
})
@XmlSeeAlso({
    MarketingCabinType.class
})
public class CabinAvailabilityType {

    @XmlElement(name = "Meal")
    protected List<CabinAvailabilityType.Meal> meal;
    @XmlElement(name = "BaggageAllowance")
    protected CabinAvailabilityType.BaggageAllowance baggageAllowance;
    @XmlElement(name = "FlightLoadInfo")
    protected CabinAvailabilityType.FlightLoadInfo flightLoadInfo;
    @XmlAttribute(name = "CabinType", required = true)
    protected CabinType cabinType;
    @XmlAttribute(name = "CabinCapacity")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger cabinCapacity;

    /**
     * Gets the value of the meal property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the meal property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeal().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinAvailabilityType.Meal }
     * 
     * 
     */
    public List<CabinAvailabilityType.Meal> getMeal() {
        if (meal == null) {
            meal = new ArrayList<CabinAvailabilityType.Meal>();
        }
        return this.meal;
    }

    /**
     * 获取baggageAllowance属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public CabinAvailabilityType.BaggageAllowance getBaggageAllowance() {
        return baggageAllowance;
    }

    /**
     * 设置baggageAllowance属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityType.BaggageAllowance }
     *     
     */
    public void setBaggageAllowance(CabinAvailabilityType.BaggageAllowance value) {
        this.baggageAllowance = value;
    }

    /**
     * 获取flightLoadInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinAvailabilityType.FlightLoadInfo }
     *     
     */
    public CabinAvailabilityType.FlightLoadInfo getFlightLoadInfo() {
        return flightLoadInfo;
    }

    /**
     * 设置flightLoadInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinAvailabilityType.FlightLoadInfo }
     *     
     */
    public void setFlightLoadInfo(CabinAvailabilityType.FlightLoadInfo value) {
        this.flightLoadInfo = value;
    }

    /**
     * 获取cabinType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CabinType }
     *     
     */
    public CabinType getCabinType() {
        return cabinType;
    }

    /**
     * 设置cabinType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CabinType }
     *     
     */
    public void setCabinType(CabinType value) {
        this.cabinType = value;
    }

    /**
     * 获取cabinCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getCabinCapacity() {
        return cabinCapacity;
    }

    /**
     * 设置cabinCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setCabinCapacity(BigInteger value) {
        this.cabinCapacity = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BaggageAllowance {

        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

        /**
         * 获取unitOfMeasureQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * 设置unitOfMeasureQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * 获取unitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * 设置unitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
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
     *       &lt;attribute name="AuthorizedSeatQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="NRSA_StandbyPaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="RevenuePaxQty" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class FlightLoadInfo {

        @XmlAttribute(name = "AuthorizedSeatQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger authorizedSeatQty;
        @XmlAttribute(name = "NRSA_StandbyPaxQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger nrsaStandbyPaxQty;
        @XmlAttribute(name = "RevenuePaxQty")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger revenuePaxQty;

        /**
         * 获取authorizedSeatQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAuthorizedSeatQty() {
            return authorizedSeatQty;
        }

        /**
         * 设置authorizedSeatQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAuthorizedSeatQty(BigInteger value) {
            this.authorizedSeatQty = value;
        }

        /**
         * 获取nrsaStandbyPaxQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getNRSAStandbyPaxQty() {
            return nrsaStandbyPaxQty;
        }

        /**
         * 设置nrsaStandbyPaxQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setNRSAStandbyPaxQty(BigInteger value) {
            this.nrsaStandbyPaxQty = value;
        }

        /**
         * 获取revenuePaxQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getRevenuePaxQty() {
            return revenuePaxQty;
        }

        /**
         * 设置revenuePaxQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setRevenuePaxQty(BigInteger value) {
            this.revenuePaxQty = value;
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
     *       &lt;attribute name="MealCode" use="required" type="{http://www.opentravel.org/OTA/2003/05}MealServiceType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Meal {

        @XmlAttribute(name = "MealCode", required = true)
        protected String mealCode;

        /**
         * 获取mealCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMealCode() {
            return mealCode;
        }

        /**
         * 设置mealCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMealCode(String value) {
            this.mealCode = value;
        }

    }

}
