//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * <p>BookingSummaryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookingSummaryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BookingRef" type="{http://www.opentravel.org/OTA/2003/05}FerryUniqueID_Type"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookedDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="BookingStatus">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="F"/>
 *             &lt;enumeration value="H"/>
 *             &lt;enumeration value="O"/>
 *             &lt;enumeration value="P"/>
 *             &lt;enumeration value="T"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="ExpiryDateTime" type="{http://www.opentravel.org/OTA/2003/05}DateOrDateTimeType" />
 *       &lt;attribute name="AgentRef" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to20" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookingSummaryType", propOrder = {
    "bookingRef"
})
public class BookingSummaryType {

    @XmlElement(name = "BookingRef", required = true)
    protected FerryUniqueIDType bookingRef;
    @XmlAttribute(name = "BookedDateTime")
    protected String bookedDateTime;
    @XmlAttribute(name = "BookingStatus")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String bookingStatus;
    @XmlAttribute(name = "ExpiryDateTime")
    protected String expiryDateTime;
    @XmlAttribute(name = "AgentRef")
    protected String agentRef;

    /**
     * 获取bookingRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryUniqueIDType }
     *     
     */
    public FerryUniqueIDType getBookingRef() {
        return bookingRef;
    }

    /**
     * 设置bookingRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryUniqueIDType }
     *     
     */
    public void setBookingRef(FerryUniqueIDType value) {
        this.bookingRef = value;
    }

    /**
     * 获取bookedDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookedDateTime() {
        return bookedDateTime;
    }

    /**
     * 设置bookedDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookedDateTime(String value) {
        this.bookedDateTime = value;
    }

    /**
     * 获取bookingStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingStatus() {
        return bookingStatus;
    }

    /**
     * 设置bookingStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingStatus(String value) {
        this.bookingStatus = value;
    }

    /**
     * 获取expiryDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getExpiryDateTime() {
        return expiryDateTime;
    }

    /**
     * 设置expiryDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setExpiryDateTime(String value) {
        this.expiryDateTime = value;
    }

    /**
     * 获取agentRef属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAgentRef() {
        return agentRef;
    }

    /**
     * 设置agentRef属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAgentRef(String value) {
        this.agentRef = value;
    }

}
