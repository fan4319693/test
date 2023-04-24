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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>anonymous complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType>
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence maxOccurs="unbounded" minOccurs="0">
 *         &lt;element name="RatePlan" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvCounts">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence maxOccurs="unbounded">
 *                             &lt;element name="InvCount">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Available" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                                     &lt;attribute name="ForDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                                     &lt;attribute name="LocallyBooked" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="InitiallyAvailable" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="AdjustmentToAvailability" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="TotallyAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="RatePlanEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                     &lt;attribute name="AvailableOverCap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
 *                 &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="RatePlanCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    "ratePlan"
})
@XmlRootElement(name = "RatePlans")
public class RatePlans {

    @XmlElement(name = "RatePlan")
    protected List<RatePlans.RatePlan> ratePlan;

    /**
     * Gets the value of the ratePlan property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ratePlan property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRatePlan().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RatePlans.RatePlan }
     * 
     * 
     */
    public List<RatePlans.RatePlan> getRatePlan() {
        if (ratePlan == null) {
            ratePlan = new ArrayList<RatePlans.RatePlan>();
        }
        return this.ratePlan;
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
     *         &lt;element name="InvCounts">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence maxOccurs="unbounded">
     *                   &lt;element name="InvCount">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Available" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                           &lt;attribute name="ForDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                           &lt;attribute name="LocallyBooked" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="InitiallyAvailable" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="AdjustmentToAvailability" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="TotallyAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="RatePlanEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                           &lt;attribute name="AvailableOverCap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
     *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="RatePlanCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierCode" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierName" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="RatePlanCategory" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "invCounts"
    })
    public static class RatePlan {

        @XmlElement(name = "InvCounts", required = true)
        protected RatePlans.RatePlan.InvCounts invCounts;
        @XmlAttribute(name = "Start", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar start;
        @XmlAttribute(name = "End", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar end;
        @XmlAttribute(name = "RatePlanCode", required = true)
        protected String ratePlanCode;
        @XmlAttribute(name = "RatePlanName")
        protected String ratePlanName;
        @XmlAttribute(name = "SupplierCode", required = true)
        protected String supplierCode;
        @XmlAttribute(name = "SupplierName")
        protected String supplierName;
        @XmlAttribute(name = "RatePlanCategory")
        @XmlSchemaType(name = "anySimpleType")
        protected String ratePlanCategory;

        /**
         * 获取invCounts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RatePlans.RatePlan.InvCounts }
         *     
         */
        public RatePlans.RatePlan.InvCounts getInvCounts() {
            return invCounts;
        }

        /**
         * 设置invCounts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RatePlans.RatePlan.InvCounts }
         *     
         */
        public void setInvCounts(RatePlans.RatePlan.InvCounts value) {
            this.invCounts = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

        /**
         * 获取ratePlanCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCode() {
            return ratePlanCode;
        }

        /**
         * 设置ratePlanCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCode(String value) {
            this.ratePlanCode = value;
        }

        /**
         * 获取ratePlanName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanName() {
            return ratePlanName;
        }

        /**
         * 设置ratePlanName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanName(String value) {
            this.ratePlanName = value;
        }

        /**
         * 获取supplierCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierCode() {
            return supplierCode;
        }

        /**
         * 设置supplierCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierCode(String value) {
            this.supplierCode = value;
        }

        /**
         * 获取supplierName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSupplierName() {
            return supplierName;
        }

        /**
         * 设置supplierName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSupplierName(String value) {
            this.supplierName = value;
        }

        /**
         * 获取ratePlanCategory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRatePlanCategory() {
            return ratePlanCategory;
        }

        /**
         * 设置ratePlanCategory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRatePlanCategory(String value) {
            this.ratePlanCategory = value;
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
         *       &lt;sequence maxOccurs="unbounded">
         *         &lt;element name="InvCount">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Available" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *                 &lt;attribute name="ForDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
         *                 &lt;attribute name="LocallyBooked" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="InitiallyAvailable" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="AdjustmentToAvailability" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="TotallyAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="RatePlanEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *                 &lt;attribute name="AvailableOverCap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
            "invCount"
        })
        public static class InvCounts {

            @XmlElement(name = "InvCount", required = true)
            protected List<RatePlans.RatePlan.InvCounts.InvCount> invCount;

            /**
             * Gets the value of the invCount property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the invCount property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getInvCount().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link RatePlans.RatePlan.InvCounts.InvCount }
             * 
             * 
             */
            public List<RatePlans.RatePlan.InvCounts.InvCount> getInvCount() {
                if (invCount == null) {
                    invCount = new ArrayList<RatePlans.RatePlan.InvCounts.InvCount>();
                }
                return this.invCount;
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
             *       &lt;attribute name="Available" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Blocked" use="required" type="{http://www.w3.org/2001/XMLSchema}boolean" />
             *       &lt;attribute name="ForDate" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
             *       &lt;attribute name="LocallyBooked" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="InitiallyAvailable" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="AdjustmentToAvailability" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="TotallyAvailable" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="RatePlanEnabled" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="MinLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="FullPatternLOS" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *       &lt;attribute name="AvailableOverCap" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class InvCount {

                @XmlAttribute(name = "Available", required = true)
                protected int available;
                @XmlAttribute(name = "Blocked", required = true)
                protected boolean blocked;
                @XmlAttribute(name = "ForDate", required = true)
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar forDate;
                @XmlAttribute(name = "LocallyBooked", required = true)
                protected int locallyBooked;
                @XmlAttribute(name = "InitiallyAvailable")
                @XmlSchemaType(name = "anySimpleType")
                protected String initiallyAvailable;
                @XmlAttribute(name = "AdjustmentToAvailability")
                @XmlSchemaType(name = "anySimpleType")
                protected String adjustmentToAvailability;
                @XmlAttribute(name = "TotallyAvailable", required = true)
                protected int totallyAvailable;
                @XmlAttribute(name = "RatePlanEnabled", required = true)
                protected int ratePlanEnabled;
                @XmlAttribute(name = "Status")
                @XmlSchemaType(name = "anySimpleType")
                protected String status;
                @XmlAttribute(name = "MinLOS")
                @XmlSchemaType(name = "anySimpleType")
                protected String minLOS;
                @XmlAttribute(name = "FullPatternLOS")
                @XmlSchemaType(name = "anySimpleType")
                protected String fullPatternLOS;
                @XmlAttribute(name = "AvailableOverCap")
                @XmlSchemaType(name = "anySimpleType")
                protected String availableOverCap;

                /**
                 * 获取available属性的值。
                 * 
                 */
                public int getAvailable() {
                    return available;
                }

                /**
                 * 设置available属性的值。
                 * 
                 */
                public void setAvailable(int value) {
                    this.available = value;
                }

                /**
                 * 获取blocked属性的值。
                 * 
                 */
                public boolean isBlocked() {
                    return blocked;
                }

                /**
                 * 设置blocked属性的值。
                 * 
                 */
                public void setBlocked(boolean value) {
                    this.blocked = value;
                }

                /**
                 * 获取forDate属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getForDate() {
                    return forDate;
                }

                /**
                 * 设置forDate属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setForDate(XMLGregorianCalendar value) {
                    this.forDate = value;
                }

                /**
                 * 获取locallyBooked属性的值。
                 * 
                 */
                public int getLocallyBooked() {
                    return locallyBooked;
                }

                /**
                 * 设置locallyBooked属性的值。
                 * 
                 */
                public void setLocallyBooked(int value) {
                    this.locallyBooked = value;
                }

                /**
                 * 获取initiallyAvailable属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getInitiallyAvailable() {
                    return initiallyAvailable;
                }

                /**
                 * 设置initiallyAvailable属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setInitiallyAvailable(String value) {
                    this.initiallyAvailable = value;
                }

                /**
                 * 获取adjustmentToAvailability属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAdjustmentToAvailability() {
                    return adjustmentToAvailability;
                }

                /**
                 * 设置adjustmentToAvailability属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAdjustmentToAvailability(String value) {
                    this.adjustmentToAvailability = value;
                }

                /**
                 * 获取totallyAvailable属性的值。
                 * 
                 */
                public int getTotallyAvailable() {
                    return totallyAvailable;
                }

                /**
                 * 设置totallyAvailable属性的值。
                 * 
                 */
                public void setTotallyAvailable(int value) {
                    this.totallyAvailable = value;
                }

                /**
                 * 获取ratePlanEnabled属性的值。
                 * 
                 */
                public int getRatePlanEnabled() {
                    return ratePlanEnabled;
                }

                /**
                 * 设置ratePlanEnabled属性的值。
                 * 
                 */
                public void setRatePlanEnabled(int value) {
                    this.ratePlanEnabled = value;
                }

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

                /**
                 * 获取minLOS属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getMinLOS() {
                    return minLOS;
                }

                /**
                 * 设置minLOS属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setMinLOS(String value) {
                    this.minLOS = value;
                }

                /**
                 * 获取fullPatternLOS属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getFullPatternLOS() {
                    return fullPatternLOS;
                }

                /**
                 * 设置fullPatternLOS属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setFullPatternLOS(String value) {
                    this.fullPatternLOS = value;
                }

                /**
                 * 获取availableOverCap属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAvailableOverCap() {
                    return availableOverCap;
                }

                /**
                 * 设置availableOverCap属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAvailableOverCap(String value) {
                    this.availableOverCap = value;
                }

            }

        }

    }

}
