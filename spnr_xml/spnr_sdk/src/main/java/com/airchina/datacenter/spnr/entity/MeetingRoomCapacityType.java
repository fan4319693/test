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
 * The MeetingRoomCapacity object that defines the largest room seating capacity for a meeting room at the hotel facility. 
 * 
 * <p>MeetingRoomCapacityType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MeetingRoomCapacityType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Occupancy" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *                 &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MeetingRoomFormatCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MeetingRoomCapacityType", propOrder = {
    "occupancy"
})
public class MeetingRoomCapacityType {

    @XmlElement(name = "Occupancy")
    protected MeetingRoomCapacityType.Occupancy occupancy;
    @XmlAttribute(name = "MeetingRoomFormatCode")
    protected String meetingRoomFormatCode;

    /**
     * 获取occupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public MeetingRoomCapacityType.Occupancy getOccupancy() {
        return occupancy;
    }

    /**
     * 设置occupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MeetingRoomCapacityType.Occupancy }
     *     
     */
    public void setOccupancy(MeetingRoomCapacityType.Occupancy value) {
        this.occupancy = value;
    }

    /**
     * 获取meetingRoomFormatCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMeetingRoomFormatCode() {
        return meetingRoomFormatCode;
    }

    /**
     * 设置meetingRoomFormatCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMeetingRoomFormatCode(String value) {
        this.meetingRoomFormatCode = value;
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
     *         &lt;element name="MinRoomCharge" type="{http://www.opentravel.org/OTA/2003/05}FeeType" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="MinOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="MaxOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *       &lt;attribute name="StandardOccupancy" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "minRoomCharge"
    })
    public static class Occupancy {

        @XmlElement(name = "MinRoomCharge")
        protected FeeType minRoomCharge;
        @XmlAttribute(name = "MinOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger minOccupancy;
        @XmlAttribute(name = "MaxOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger maxOccupancy;
        @XmlAttribute(name = "StandardOccupancy")
        @XmlSchemaType(name = "nonNegativeInteger")
        protected BigInteger standardOccupancy;

        /**
         * 获取minRoomCharge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link FeeType }
         *     
         */
        public FeeType getMinRoomCharge() {
            return minRoomCharge;
        }

        /**
         * 设置minRoomCharge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link FeeType }
         *     
         */
        public void setMinRoomCharge(FeeType value) {
            this.minRoomCharge = value;
        }

        /**
         * 获取minOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinOccupancy() {
            return minOccupancy;
        }

        /**
         * 设置minOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinOccupancy(BigInteger value) {
            this.minOccupancy = value;
        }

        /**
         * 获取maxOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaxOccupancy() {
            return maxOccupancy;
        }

        /**
         * 设置maxOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaxOccupancy(BigInteger value) {
            this.maxOccupancy = value;
        }

        /**
         * 获取standardOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getStandardOccupancy() {
            return standardOccupancy;
        }

        /**
         * 设置standardOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setStandardOccupancy(BigInteger value) {
            this.standardOccupancy = value;
        }

    }

}
