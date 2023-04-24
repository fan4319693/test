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
import javax.xml.bind.annotation.XmlType;


/**
 * Defines information used to fully describe a train station.
 * 
 * <p>StationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="StationType">
 *   &lt;simpleContent>
 *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *       &lt;attribute name="IsStaffedInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TicketPrinterInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="SST_MachineInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="TimeZoneOffset" type="{http://www.opentravel.org/OTA/2003/05}UTC_TimeZoneOffset" />
 *     &lt;/extension>
 *   &lt;/simpleContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "StationType")
public class StationType
    extends LocationType
{

    @XmlAttribute(name = "IsStaffedInd")
    protected Boolean isStaffedInd;
    @XmlAttribute(name = "TicketPrinterInd")
    protected Boolean ticketPrinterInd;
    @XmlAttribute(name = "SST_MachineInd")
    protected Boolean sstMachineInd;
    @XmlAttribute(name = "TimeZoneOffset")
    protected String timeZoneOffset;

    /**
     * 获取isStaffedInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isIsStaffedInd() {
        return isStaffedInd;
    }

    /**
     * 设置isStaffedInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setIsStaffedInd(Boolean value) {
        this.isStaffedInd = value;
    }

    /**
     * 获取ticketPrinterInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isTicketPrinterInd() {
        return ticketPrinterInd;
    }

    /**
     * 设置ticketPrinterInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setTicketPrinterInd(Boolean value) {
        this.ticketPrinterInd = value;
    }

    /**
     * 获取sstMachineInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isSSTMachineInd() {
        return sstMachineInd;
    }

    /**
     * 设置sstMachineInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setSSTMachineInd(Boolean value) {
        this.sstMachineInd = value;
    }

    /**
     * 获取timeZoneOffset属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTimeZoneOffset() {
        return timeZoneOffset;
    }

    /**
     * 设置timeZoneOffset属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTimeZoneOffset(String value) {
        this.timeZoneOffset = value;
    }

}
