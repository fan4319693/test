//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * The booking refenrence ID from an external system.
 * 
 * <p>SupplierBookingReferenceIDType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SupplierBookingReferenceIDType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *       &lt;sequence>
 *         &lt;element name="CheckInInfo" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BoardingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="GroupID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Status" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SupplierBookingReferenceIDType", propOrder = {
    "checkInInfo"
})
public class SupplierBookingReferenceIDType
    extends UniqueIDType
{

    @XmlElement(name = "CheckInInfo")
    protected SupplierBookingReferenceIDType.CheckInInfo checkInInfo;
    @XmlAttribute(name = "GroupID")
    protected String groupID;
    @XmlAttribute(name = "Status")
    protected String status;

    /**
     * 获取checkInInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SupplierBookingReferenceIDType.CheckInInfo }
     *     
     */
    public SupplierBookingReferenceIDType.CheckInInfo getCheckInInfo() {
        return checkInInfo;
    }

    /**
     * 设置checkInInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SupplierBookingReferenceIDType.CheckInInfo }
     *     
     */
    public void setCheckInInfo(SupplierBookingReferenceIDType.CheckInInfo value) {
        this.checkInInfo = value;
    }

    /**
     * 获取groupID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGroupID() {
        return groupID;
    }

    /**
     * 设置groupID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGroupID(String value) {
        this.groupID = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attribute name="BoardingTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CheckInInfo {

        @XmlAttribute(name = "BoardingTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar boardingTime;

        /**
         * 获取boardingTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getBoardingTime() {
            return boardingTime;
        }

        /**
         * 设置boardingTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setBoardingTime(XMLGregorianCalendar value) {
            this.boardingTime = value;
        }

    }

}
