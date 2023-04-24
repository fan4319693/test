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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * This is used to store flight purchase related information in messages.
 * 
 * <p>PurchaseInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PurchaseInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Deadline" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Ranges" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Range" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Max" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                             &lt;element name="Min" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="DescCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "PurchaseInfoType", propOrder = {
    "deadline",
    "ranges"
})
public class PurchaseInfoType {

    @XmlElement(name = "Deadline")
    protected PurchaseInfoType.Deadline deadline;
    @XmlElement(name = "Ranges")
    protected PurchaseInfoType.Ranges ranges;

    /**
     * 获取deadline属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoType.Deadline }
     *     
     */
    public PurchaseInfoType.Deadline getDeadline() {
        return deadline;
    }

    /**
     * 设置deadline属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoType.Deadline }
     *     
     */
    public void setDeadline(PurchaseInfoType.Deadline value) {
        this.deadline = value;
    }

    /**
     * 获取ranges属性的值。
     * 
     * @return
     *     possible object is
     *     {@link PurchaseInfoType.Ranges }
     *     
     */
    public PurchaseInfoType.Ranges getRanges() {
        return ranges;
    }

    /**
     * 设置ranges属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PurchaseInfoType.Ranges }
     *     
     */
    public void setRanges(PurchaseInfoType.Ranges value) {
        this.ranges = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Deadline {

        @XmlAttribute(name = "AbsoluteDeadline")
        protected String absoluteDeadline;
        @XmlAttribute(name = "OffsetTimeUnit")
        protected String offsetTimeUnit;
        @XmlAttribute(name = "OffsetUnitMultiplier")
        protected Integer offsetUnitMultiplier;
        @XmlAttribute(name = "OffsetDropTime")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String offsetDropTime;
        @XmlAttribute(name = "From")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar from;
        @XmlAttribute(name = "To")
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar to;

        /**
         * 获取absoluteDeadline属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAbsoluteDeadline() {
            return absoluteDeadline;
        }

        /**
         * 设置absoluteDeadline属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAbsoluteDeadline(String value) {
            this.absoluteDeadline = value;
        }

        /**
         * 获取offsetTimeUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetTimeUnit() {
            return offsetTimeUnit;
        }

        /**
         * 设置offsetTimeUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetTimeUnit(String value) {
            this.offsetTimeUnit = value;
        }

        /**
         * 获取offsetUnitMultiplier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getOffsetUnitMultiplier() {
            return offsetUnitMultiplier;
        }

        /**
         * 设置offsetUnitMultiplier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setOffsetUnitMultiplier(Integer value) {
            this.offsetUnitMultiplier = value;
        }

        /**
         * 获取offsetDropTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOffsetDropTime() {
            return offsetDropTime;
        }

        /**
         * 设置offsetDropTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOffsetDropTime(String value) {
            this.offsetDropTime = value;
        }

        /**
         * 获取from属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getFrom() {
            return from;
        }

        /**
         * 设置from属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setFrom(XMLGregorianCalendar value) {
            this.from = value;
        }

        /**
         * 获取to属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTo() {
            return to;
        }

        /**
         * 设置to属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTo(XMLGregorianCalendar value) {
            this.to = value;
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
     *         &lt;element name="Range" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Max" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                   &lt;element name="Min" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="DescCode" type="{http://www.w3.org/2001/XMLSchema}string" />
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
        "range"
    })
    public static class Ranges {

        @XmlElement(name = "Range", required = true)
        protected List<PurchaseInfoType.Ranges.Range> range;

        /**
         * Gets the value of the range property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the range property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getRange().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PurchaseInfoType.Ranges.Range }
         * 
         * 
         */
        public List<PurchaseInfoType.Ranges.Range> getRange() {
            if (range == null) {
                range = new ArrayList<PurchaseInfoType.Ranges.Range>();
            }
            return this.range;
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
         *         &lt;element name="Max" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *         &lt;element name="Min" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="DescCode" type="{http://www.w3.org/2001/XMLSchema}string" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "max",
            "min"
        })
        public static class Range {

            @XmlElement(name = "Max")
            protected PurchaseInfoType.Ranges.Range.Max max;
            @XmlElement(name = "Min")
            protected PurchaseInfoType.Ranges.Range.Min min;
            @XmlAttribute(name = "DescCode")
            protected String descCode;

            /**
             * 获取max属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PurchaseInfoType.Ranges.Range.Max }
             *     
             */
            public PurchaseInfoType.Ranges.Range.Max getMax() {
                return max;
            }

            /**
             * 设置max属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PurchaseInfoType.Ranges.Range.Max }
             *     
             */
            public void setMax(PurchaseInfoType.Ranges.Range.Max value) {
                this.max = value;
            }

            /**
             * 获取min属性的值。
             * 
             * @return
             *     possible object is
             *     {@link PurchaseInfoType.Ranges.Range.Min }
             *     
             */
            public PurchaseInfoType.Ranges.Range.Min getMin() {
                return min;
            }

            /**
             * 设置min属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link PurchaseInfoType.Ranges.Range.Min }
             *     
             */
            public void setMin(PurchaseInfoType.Ranges.Range.Min value) {
                this.min = value;
            }

            /**
             * 获取descCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescCode() {
                return descCode;
            }

            /**
             * 设置descCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescCode(String value) {
                this.descCode = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Max {

                @XmlAttribute(name = "AbsoluteDeadline")
                protected String absoluteDeadline;
                @XmlAttribute(name = "OffsetTimeUnit")
                protected String offsetTimeUnit;
                @XmlAttribute(name = "OffsetUnitMultiplier")
                protected Integer offsetUnitMultiplier;
                @XmlAttribute(name = "OffsetDropTime")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetDropTime;
                @XmlAttribute(name = "From")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar from;
                @XmlAttribute(name = "To")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar to;

                /**
                 * 获取absoluteDeadline属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteDeadline() {
                    return absoluteDeadline;
                }

                /**
                 * 设置absoluteDeadline属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteDeadline(String value) {
                    this.absoluteDeadline = value;
                }

                /**
                 * 获取offsetTimeUnit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetTimeUnit() {
                    return offsetTimeUnit;
                }

                /**
                 * 设置offsetTimeUnit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetTimeUnit(String value) {
                    this.offsetTimeUnit = value;
                }

                /**
                 * 获取offsetUnitMultiplier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOffsetUnitMultiplier() {
                    return offsetUnitMultiplier;
                }

                /**
                 * 设置offsetUnitMultiplier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOffsetUnitMultiplier(Integer value) {
                    this.offsetUnitMultiplier = value;
                }

                /**
                 * 获取offsetDropTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetDropTime() {
                    return offsetDropTime;
                }

                /**
                 * 设置offsetDropTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetDropTime(String value) {
                    this.offsetDropTime = value;
                }

                /**
                 * 获取from属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFrom() {
                    return from;
                }

                /**
                 * 设置from属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFrom(XMLGregorianCalendar value) {
                    this.from = value;
                }

                /**
                 * 获取to属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTo() {
                    return to;
                }

                /**
                 * 设置to属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTo(XMLGregorianCalendar value) {
                    this.to = value;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeadlineGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Min {

                @XmlAttribute(name = "AbsoluteDeadline")
                protected String absoluteDeadline;
                @XmlAttribute(name = "OffsetTimeUnit")
                protected String offsetTimeUnit;
                @XmlAttribute(name = "OffsetUnitMultiplier")
                protected Integer offsetUnitMultiplier;
                @XmlAttribute(name = "OffsetDropTime")
                @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
                protected String offsetDropTime;
                @XmlAttribute(name = "From")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar from;
                @XmlAttribute(name = "To")
                @XmlSchemaType(name = "date")
                protected XMLGregorianCalendar to;

                /**
                 * 获取absoluteDeadline属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getAbsoluteDeadline() {
                    return absoluteDeadline;
                }

                /**
                 * 设置absoluteDeadline属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setAbsoluteDeadline(String value) {
                    this.absoluteDeadline = value;
                }

                /**
                 * 获取offsetTimeUnit属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetTimeUnit() {
                    return offsetTimeUnit;
                }

                /**
                 * 设置offsetTimeUnit属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetTimeUnit(String value) {
                    this.offsetTimeUnit = value;
                }

                /**
                 * 获取offsetUnitMultiplier属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Integer }
                 *     
                 */
                public Integer getOffsetUnitMultiplier() {
                    return offsetUnitMultiplier;
                }

                /**
                 * 设置offsetUnitMultiplier属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Integer }
                 *     
                 */
                public void setOffsetUnitMultiplier(Integer value) {
                    this.offsetUnitMultiplier = value;
                }

                /**
                 * 获取offsetDropTime属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getOffsetDropTime() {
                    return offsetDropTime;
                }

                /**
                 * 设置offsetDropTime属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setOffsetDropTime(String value) {
                    this.offsetDropTime = value;
                }

                /**
                 * 获取from属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getFrom() {
                    return from;
                }

                /**
                 * 设置from属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setFrom(XMLGregorianCalendar value) {
                    this.from = value;
                }

                /**
                 * 获取to属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public XMLGregorianCalendar getTo() {
                    return to;
                }

                /**
                 * 设置to属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link XMLGregorianCalendar }
                 *     
                 */
                public void setTo(XMLGregorianCalendar value) {
                    this.to = value;
                }

            }

        }

    }

}
