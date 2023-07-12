//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;


/**
 * Defines bus Information.
 * 
 * <p>BusInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BusInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Bus" type="{http://www.opentravel.org/OTA/2003/05}BusIdentificationType"/>
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
 *       &lt;attribute name="DelayTime" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *       &lt;attribute name="ScheduleCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BusInfoType", propOrder = {
    "bus",
    "validDate"
})
public class BusInfoType {

    @XmlElement(name = "Bus", required = true)
    protected BusIdentificationType bus;
    @XmlElement(name = "ValidDate")
    protected BusInfoType.ValidDate validDate;
    @XmlAttribute(name = "DelayTime")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger delayTime;
    @XmlAttribute(name = "ScheduleCode")
    protected String scheduleCode;

    /**
     * 获取bus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusIdentificationType }
     *     
     */
    public BusIdentificationType getBus() {
        return bus;
    }

    /**
     * 设置bus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusIdentificationType }
     *     
     */
    public void setBus(BusIdentificationType value) {
        this.bus = value;
    }

    /**
     * 获取validDate属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BusInfoType.ValidDate }
     *     
     */
    public BusInfoType.ValidDate getValidDate() {
        return validDate;
    }

    /**
     * 设置validDate属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BusInfoType.ValidDate }
     *     
     */
    public void setValidDate(BusInfoType.ValidDate value) {
        this.validDate = value;
    }

    /**
     * 获取delayTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDelayTime() {
        return delayTime;
    }

    /**
     * 设置delayTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDelayTime(BigInteger value) {
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
