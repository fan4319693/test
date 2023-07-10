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
import javax.xml.datatype.Duration;


/**
 * Operating or availability schedule associated with a code item.
 * 
 * <p>CodeListScheduleType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CodeListScheduleType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OperationTimes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OperationTime" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="AdditionalInfo" type="{http://www.opentravel.org/OTA/2003/05}List_AdditionalOperationInfo" minOccurs="0"/>
 *                           &lt;/sequence>
 *                           &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                           &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
 *                           &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *                           &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
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
 *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
 *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
 *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
 *       &lt;attribute name="FeeRefRPH">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ScheduleRPH">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
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
@XmlType(name = "CodeListScheduleType", propOrder = {
    "operationTimes"
})
public class CodeListScheduleType {

    @XmlElement(name = "OperationTimes")
    protected CodeListScheduleType.OperationTimes operationTimes;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected Duration duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "FeeRefRPH")
    protected String feeRefRPH;
    @XmlAttribute(name = "ScheduleRPH")
    protected String scheduleRPH;

    /**
     * 获取operationTimes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CodeListScheduleType.OperationTimes }
     *     
     */
    public CodeListScheduleType.OperationTimes getOperationTimes() {
        return operationTimes;
    }

    /**
     * 设置operationTimes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CodeListScheduleType.OperationTimes }
     *     
     */
    public void setOperationTimes(CodeListScheduleType.OperationTimes value) {
        this.operationTimes = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Duration }
     *     
     */
    public Duration getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Duration }
     *     
     */
    public void setDuration(Duration value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取feeRefRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFeeRefRPH() {
        return feeRefRPH;
    }

    /**
     * 设置feeRefRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFeeRefRPH(String value) {
        this.feeRefRPH = value;
    }

    /**
     * 获取scheduleRPH属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleRPH() {
        return scheduleRPH;
    }

    /**
     * 设置scheduleRPH属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleRPH(String value) {
        this.scheduleRPH = value;
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
     *         &lt;element name="OperationTime" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="AdditionalInfo" type="{http://www.opentravel.org/OTA/2003/05}List_AdditionalOperationInfo" minOccurs="0"/>
     *                 &lt;/sequence>
     *                 &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *                 &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
     *                 &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
     *                 &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
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
        "operationTime"
    })
    public static class OperationTimes {

        @XmlElement(name = "OperationTime", required = true)
        protected List<CodeListScheduleType.OperationTimes.OperationTime> operationTime;

        /**
         * Gets the value of the operationTime property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operationTime property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperationTime().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CodeListScheduleType.OperationTimes.OperationTime }
         * 
         * 
         */
        public List<CodeListScheduleType.OperationTimes.OperationTime> getOperationTime() {
            if (operationTime == null) {
                operationTime = new ArrayList<CodeListScheduleType.OperationTimes.OperationTime>();
            }
            return this.operationTime;
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
         *         &lt;element name="AdditionalInfo" type="{http://www.opentravel.org/OTA/2003/05}List_AdditionalOperationInfo" minOccurs="0"/>
         *       &lt;/sequence>
         *       &lt;attribute name="Frequency" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
         *       &lt;attribute name="Mon" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Tue" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Weds" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Thur" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Fri" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Sat" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Sun" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="Start" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
         *       &lt;attribute name="Duration" type="{http://www.w3.org/2001/XMLSchema}duration" />
         *       &lt;attribute name="End" type="{http://www.opentravel.org/OTA/2003/05}CodeListSchedulePeriodType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "additionalInfo"
        })
        public static class OperationTime {

            @XmlElement(name = "AdditionalInfo")
            protected ListAdditionalOperationInfo additionalInfo;
            @XmlAttribute(name = "Frequency")
            protected String frequency;
            @XmlAttribute(name = "Description")
            protected String description;
            @XmlAttribute(name = "Mon")
            protected Boolean mon;
            @XmlAttribute(name = "Tue")
            protected Boolean tue;
            @XmlAttribute(name = "Weds")
            protected Boolean weds;
            @XmlAttribute(name = "Thur")
            protected Boolean thur;
            @XmlAttribute(name = "Fri")
            protected Boolean fri;
            @XmlAttribute(name = "Sat")
            protected Boolean sat;
            @XmlAttribute(name = "Sun")
            protected Boolean sun;
            @XmlAttribute(name = "Start")
            protected String start;
            @XmlAttribute(name = "Duration")
            protected Duration duration;
            @XmlAttribute(name = "End")
            protected String end;

            /**
             * 获取additionalInfo属性的值。
             * 
             * @return
             *     possible object is
             *     {@link ListAdditionalOperationInfo }
             *     
             */
            public ListAdditionalOperationInfo getAdditionalInfo() {
                return additionalInfo;
            }

            /**
             * 设置additionalInfo属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ListAdditionalOperationInfo }
             *     
             */
            public void setAdditionalInfo(ListAdditionalOperationInfo value) {
                this.additionalInfo = value;
            }

            /**
             * 获取frequency属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getFrequency() {
                return frequency;
            }

            /**
             * 设置frequency属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setFrequency(String value) {
                this.frequency = value;
            }

            /**
             * 获取description属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getDescription() {
                return description;
            }

            /**
             * 设置description属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setDescription(String value) {
                this.description = value;
            }

            /**
             * 获取mon属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isMon() {
                return mon;
            }

            /**
             * 设置mon属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setMon(Boolean value) {
                this.mon = value;
            }

            /**
             * 获取tue属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isTue() {
                return tue;
            }

            /**
             * 设置tue属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setTue(Boolean value) {
                this.tue = value;
            }

            /**
             * 获取weds属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isWeds() {
                return weds;
            }

            /**
             * 设置weds属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setWeds(Boolean value) {
                this.weds = value;
            }

            /**
             * 获取thur属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isThur() {
                return thur;
            }

            /**
             * 设置thur属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setThur(Boolean value) {
                this.thur = value;
            }

            /**
             * 获取fri属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isFri() {
                return fri;
            }

            /**
             * 设置fri属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setFri(Boolean value) {
                this.fri = value;
            }

            /**
             * 获取sat属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSat() {
                return sat;
            }

            /**
             * 设置sat属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSat(Boolean value) {
                this.sat = value;
            }

            /**
             * 获取sun属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSun() {
                return sun;
            }

            /**
             * 设置sun属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSun(Boolean value) {
                this.sun = value;
            }

            /**
             * 获取start属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getStart() {
                return start;
            }

            /**
             * 设置start属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setStart(String value) {
                this.start = value;
            }

            /**
             * 获取duration属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Duration }
             *     
             */
            public Duration getDuration() {
                return duration;
            }

            /**
             * 设置duration属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Duration }
             *     
             */
            public void setDuration(Duration value) {
                this.duration = value;
            }

            /**
             * 获取end属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getEnd() {
                return end;
            }

            /**
             * 设置end属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setEnd(String value) {
                this.end = value;
            }

        }

    }

}
