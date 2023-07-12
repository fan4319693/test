//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.Duration;


/**
 * The set of changes in the number of units of base inventory for one inventory type (code) to be made on the server. The server must 	successfully update all messages. Failure to update any single status message will result in the failure of all messages. 
 * 
 * <p>BaseInvCountType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BaseInvCountType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="StatusApplicationControl" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType">
 *                 &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="InvCounts" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InvCount" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="InvBlockCutoff" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                           &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                           &lt;attribute name="ActionType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;enumeration value="Adjustment"/>
 *                                 &lt;enumeration value="Used"/>
 *                                 &lt;enumeration value="Remaining"/>
 *                                 &lt;enumeration value="Allocation"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OffSell" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="OffSellValueType">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                       &lt;enumeration value="Total"/>
 *                       &lt;enumeration value="Adjustment"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *                 &lt;attribute name="OffSellValue" type="{http://www.opentravel.org/OTA/2003/05}Money" />
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
@XmlType(name = "BaseInvCountType", propOrder = {
    "statusApplicationControl",
    "invCounts",
    "offSell"
})
public class BaseInvCountType {

    @XmlElement(name = "StatusApplicationControl")
    protected BaseInvCountType.StatusApplicationControl statusApplicationControl;
    @XmlElement(name = "InvCounts")
    protected BaseInvCountType.InvCounts invCounts;
    @XmlElement(name = "OffSell")
    protected BaseInvCountType.OffSell offSell;

    /**
     * 获取statusApplicationControl属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.StatusApplicationControl }
     *     
     */
    public BaseInvCountType.StatusApplicationControl getStatusApplicationControl() {
        return statusApplicationControl;
    }

    /**
     * 设置statusApplicationControl属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.StatusApplicationControl }
     *     
     */
    public void setStatusApplicationControl(BaseInvCountType.StatusApplicationControl value) {
        this.statusApplicationControl = value;
    }

    /**
     * 获取invCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.InvCounts }
     *     
     */
    public BaseInvCountType.InvCounts getInvCounts() {
        return invCounts;
    }

    /**
     * 设置invCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.InvCounts }
     *     
     */
    public void setInvCounts(BaseInvCountType.InvCounts value) {
        this.invCounts = value;
    }

    /**
     * 获取offSell属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public BaseInvCountType.OffSell getOffSell() {
        return offSell;
    }

    /**
     * 设置offSell属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BaseInvCountType.OffSell }
     *     
     */
    public void setOffSell(BaseInvCountType.OffSell value) {
        this.offSell = value;
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
     *         &lt;element name="InvCount" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="InvBlockCutoff" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *                 &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *                 &lt;attribute name="ActionType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;enumeration value="Adjustment"/>
     *                       &lt;enumeration value="Used"/>
     *                       &lt;enumeration value="Remaining"/>
     *                       &lt;enumeration value="Allocation"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
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
        protected List<BaseInvCountType.InvCounts.InvCount> invCount;

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
         * {@link BaseInvCountType.InvCounts.InvCount }
         * 
         * 
         */
        public List<BaseInvCountType.InvCounts.InvCount> getInvCount() {
            if (invCount == null) {
                invCount = new ArrayList<BaseInvCountType.InvCounts.InvCount>();
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
         *       &lt;sequence>
         *         &lt;element name="InvBlockCutoff" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="CountType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="Count" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
         *       &lt;attribute name="AdjustReason" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
         *       &lt;attribute name="ActionType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;enumeration value="Adjustment"/>
         *             &lt;enumeration value="Used"/>
         *             &lt;enumeration value="Remaining"/>
         *             &lt;enumeration value="Allocation"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "invBlockCutoff"
        })
        public static class InvCount {

            @XmlElement(name = "InvBlockCutoff")
            protected BaseInvCountType.InvCounts.InvCount.InvBlockCutoff invBlockCutoff;
            @XmlAttribute(name = "CountType")
            protected String countType;
            @XmlAttribute(name = "Count")
            @XmlSchemaType(name = "nonNegativeInteger")
            protected BigInteger count;
            @XmlAttribute(name = "AdjustReason")
            protected String adjustReason;
            @XmlAttribute(name = "ActionType")
            protected String actionType;

            /**
             * 获取invBlockCutoff属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
             *     
             */
            public BaseInvCountType.InvCounts.InvCount.InvBlockCutoff getInvBlockCutoff() {
                return invBlockCutoff;
            }

            /**
             * 设置invBlockCutoff属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BaseInvCountType.InvCounts.InvCount.InvBlockCutoff }
             *     
             */
            public void setInvBlockCutoff(BaseInvCountType.InvCounts.InvCount.InvBlockCutoff value) {
                this.invBlockCutoff = value;
            }

            /**
             * 获取countType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCountType() {
                return countType;
            }

            /**
             * 设置countType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCountType(String value) {
                this.countType = value;
            }

            /**
             * 获取count属性的值。
             * 
             * @return
             *     possible object is
             *     {@link BigInteger }
             *     
             */
            public BigInteger getCount() {
                return count;
            }

            /**
             * 设置count属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link BigInteger }
             *     
             */
            public void setCount(BigInteger value) {
                this.count = value;
            }

            /**
             * 获取adjustReason属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAdjustReason() {
                return adjustReason;
            }

            /**
             * 设置adjustReason属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAdjustReason(String value) {
                this.adjustReason = value;
            }

            /**
             * 获取actionType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getActionType() {
                return actionType;
            }

            /**
             * 设置actionType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setActionType(String value) {
                this.actionType = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}InvBlockCutoffGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class InvBlockCutoff {

                @XmlAttribute(name = "AbsoluteCutoff")
                protected String absoluteCutoff;
                @XmlAttribute(name = "OffsetDuration")
                protected Duration offsetDuration;
                @XmlAttribute(name = "OffsetCalculationMode")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetCalculationMode;

                /**
                 * 获取absoluteCutoff属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteCutoff() {
                    return absoluteCutoff;
                }

                /**
                 * 设置absoluteCutoff属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteCutoff(String value) {
                    this.absoluteCutoff = value;
                }

                /**
                 * 获取offsetDuration属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Duration }
                 *     
                 */
                public Duration getOffsetDuration() {
                    return offsetDuration;
                }

                /**
                 * 设置offsetDuration属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Duration }
                 *     
                 */
                public void setOffsetDuration(Duration value) {
                    this.offsetDuration = value;
                }

                /**
                 * 获取offsetCalculationMode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetCalculationMode() {
                    return offsetCalculationMode;
                }

                /**
                 * 设置offsetCalculationMode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetCalculationMode(String value) {
                    this.offsetCalculationMode = value;
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
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="OffSellValueType">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *             &lt;enumeration value="Total"/>
     *             &lt;enumeration value="Adjustment"/>
     *           &lt;/restriction>
     *         &lt;/simpleType>
     *       &lt;/attribute>
     *       &lt;attribute name="OffSellValue" type="{http://www.opentravel.org/OTA/2003/05}Money" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OffSell {

        @XmlAttribute(name = "OffSellValueType")
        protected String offSellValueType;
        @XmlAttribute(name = "OffSellValue")
        protected BigDecimal offSellValue;

        /**
         * 获取offSellValueType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffSellValueType() {
            return offSellValueType;
        }

        /**
         * 设置offSellValueType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffSellValueType(String value) {
            this.offSellValueType = value;
        }

        /**
         * 获取offSellValue属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getOffSellValue() {
            return offSellValue;
        }

        /**
         * 设置offSellValue属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setOffSellValue(BigDecimal value) {
            this.offSellValue = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}StatusApplicationControlType">
     *       &lt;attribute name="RoomType" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SupplierCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class StatusApplicationControl
        extends StatusApplicationControlType
    {

        @XmlAttribute(name = "RoomType")
        protected String roomType;
        @XmlAttribute(name = "SupplierCode")
        protected String supplierCode;

        /**
         * 获取roomType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRoomType() {
            return roomType;
        }

        /**
         * 设置roomType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRoomType(String value) {
            this.roomType = value;
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

    }

}
