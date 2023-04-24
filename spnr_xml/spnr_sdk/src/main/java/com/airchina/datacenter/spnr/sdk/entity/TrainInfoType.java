//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines train Information.
 * 
 * <p>TrainInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TrainInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Train" type="{http://www.opentravel.org/OTA/2003/05}TrainIdentificationType"/>
 *         &lt;element name="ValidDate" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DatePeriodGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="ScheduleCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "TrainInfoType", propOrder = {
    "train",
    "validDate"
})
public class TrainInfoType {

    @XmlElement(name = "Train", required = true)
    protected TrainIdentificationType train;
    @XmlElement(name = "ValidDate")
    protected TrainInfoType.ValidDate validDate;
    @XmlAttribute(name = "DelayTime")
    @XmlSchemaType(name = "anySimpleType")
    protected String delayTime;
    @XmlAttribute(name = "ScheduleCode")
    protected String scheduleCode;

    /**
     * 获取train属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrainIdentificationType }
     *     
     */
    public TrainIdentificationType getTrain() {
        return train;
    }

    /**
     * 设置train属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrainIdentificationType }
     *     
     */
    public void setTrain(TrainIdentificationType value) {
        this.train = value;
    }

    /**
     * 获取validDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TrainInfoType.ValidDate }
     *     
     */
    public TrainInfoType.ValidDate getValidDate() {
        return validDate;
    }

    /**
     * 设置validDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TrainInfoType.ValidDate }
     *     
     */
    public void setValidDate(TrainInfoType.ValidDate value) {
        this.validDate = value;
    }

    /**
     * 获取delayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDelayTime() {
        return delayTime;
    }

    /**
     * 设置delayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDelayTime(String value) {
        this.delayTime = value;
    }

    /**
     * 获取scheduleCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getScheduleCode() {
        return scheduleCode;
    }

    /**
     * 设置scheduleCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setScheduleCode(String value) {
        this.scheduleCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DatePeriodGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ValidDate {

        @XmlAttribute(name = "StartPeriod")
        protected String startPeriod;
        @XmlAttribute(name = "Duration")
        protected String duration;
        @XmlAttribute(name = "EndPeriod")
        protected String endPeriod;

        /**
         * 获取startPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartPeriod() {
            return startPeriod;
        }

        /**
         * 设置startPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartPeriod(String value) {
            this.startPeriod = value;
        }

        /**
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDuration(String value) {
            this.duration = value;
        }

        /**
         * 获取endPeriod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndPeriod() {
            return endPeriod;
        }

        /**
         * 设置endPeriod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndPeriod(String value) {
            this.endPeriod = value;
        }

    }

}
