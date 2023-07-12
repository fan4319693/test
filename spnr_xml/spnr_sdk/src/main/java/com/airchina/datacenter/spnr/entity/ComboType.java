//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>ComboType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ComboType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ComboProduct" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="FareFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="air"/>
 *                       &lt;enumeration value="activity"/>
 *                       &lt;enumeration value="ancillary"/>
 *                       &lt;enumeration value="baggage"/>
 *                       &lt;enumeration value="hotel"/>
 *                       &lt;enumeration value="insurance"/>
 *                       &lt;enumeration value="seat"/>
 *                       &lt;enumeration value="vehicle"/>
 *                       &lt;enumeration value="coupons"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="PTC" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="FlightIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AmendmentPenalties" type="{http://www.opentravel.org/OTA/2003/05}OJ_AmendPenaltiesType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ComboType", propOrder = {
    "comboProduct",
    "amendmentPenalties"
})
public class ComboType {

    @XmlElement(name = "ComboProduct", required = true)
    protected List<ComboType.ComboProduct> comboProduct;
    @XmlElement(name = "AmendmentPenalties")
    protected OJAmendPenaltiesType amendmentPenalties;
    @XmlAttribute(name = "Code", required = true)
    protected String code;
    @XmlAttribute(name = "Name", required = true)
    protected String name;

    /**
     * Gets the value of the comboProduct property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comboProduct property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComboProduct().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ComboType.ComboProduct }
     * 
     * 
     */
    public List<ComboType.ComboProduct> getComboProduct() {
        if (comboProduct == null) {
            comboProduct = new ArrayList<ComboType.ComboProduct>();
        }
        return this.comboProduct;
    }

    /**
     * 获取amendmentPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public OJAmendPenaltiesType getAmendmentPenalties() {
        return amendmentPenalties;
    }

    /**
     * 设置amendmentPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OJAmendPenaltiesType }
     *     
     */
    public void setAmendmentPenalties(OJAmendPenaltiesType value) {
        this.amendmentPenalties = value;
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
     * 获取name属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getName() {
        return name;
    }

    /**
     * 设置name属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setName(String value) {
        this.name = value;
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
     *       &lt;attribute name="HistoryID" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="FareFamilyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="air"/>
     *             &lt;enumeration value="activity"/>
     *             &lt;enumeration value="ancillary"/>
     *             &lt;enumeration value="baggage"/>
     *             &lt;enumeration value="hotel"/>
     *             &lt;enumeration value="insurance"/>
     *             &lt;enumeration value="seat"/>
     *             &lt;enumeration value="vehicle"/>
     *             &lt;enumeration value="coupons"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="SubType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="OriginDestinationRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="FlightSegmentRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="OJ_SuperPNR_RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="PTC" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="FlightIncluded" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ComboProduct {

        @XmlAttribute(name = "HistoryID")
        protected BigInteger historyID;
        @XmlAttribute(name = "FareFamilyCode")
        protected String fareFamilyCode;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Type")
        protected String type;
        @XmlAttribute(name = "SubType")
        protected String subType;
        @XmlAttribute(name = "OriginDestinationRPH")
        protected String originDestinationRPH;
        @XmlAttribute(name = "FlightSegmentRPH")
        protected String flightSegmentRPH;
        @XmlAttribute(name = "OJ_SuperPNR_RPH")
        protected String ojSuperPNRRPH;
        @XmlAttribute(name = "PTC")
        protected String ptc;
        @XmlAttribute(name = "FlightIncluded")
        protected Boolean flightIncluded;

        /**
         * 获取historyID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getHistoryID() {
            return historyID;
        }

        /**
         * 设置historyID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setHistoryID(BigInteger value) {
            this.historyID = value;
        }

        /**
         * 获取fareFamilyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFareFamilyCode() {
            return fareFamilyCode;
        }

        /**
         * 设置fareFamilyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFareFamilyCode(String value) {
            this.fareFamilyCode = value;
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

        /**
         * 获取subType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSubType() {
            return subType;
        }

        /**
         * 设置subType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSubType(String value) {
            this.subType = value;
        }

        /**
         * 获取originDestinationRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginDestinationRPH() {
            return originDestinationRPH;
        }

        /**
         * 设置originDestinationRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginDestinationRPH(String value) {
            this.originDestinationRPH = value;
        }

        /**
         * 获取flightSegmentRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightSegmentRPH() {
            return flightSegmentRPH;
        }

        /**
         * 设置flightSegmentRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightSegmentRPH(String value) {
            this.flightSegmentRPH = value;
        }

        /**
         * 获取ojSuperPNRRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJSuperPNRRPH() {
            return ojSuperPNRRPH;
        }

        /**
         * 设置ojSuperPNRRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJSuperPNRRPH(String value) {
            this.ojSuperPNRRPH = value;
        }

        /**
         * 获取ptc属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPTC() {
            return ptc;
        }

        /**
         * 设置ptc属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPTC(String value) {
            this.ptc = value;
        }

        /**
         * 获取flightIncluded属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isFlightIncluded() {
            return flightIncluded;
        }

        /**
         * 设置flightIncluded属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setFlightIncluded(Boolean value) {
            this.flightIncluded = value;
        }

    }

}
