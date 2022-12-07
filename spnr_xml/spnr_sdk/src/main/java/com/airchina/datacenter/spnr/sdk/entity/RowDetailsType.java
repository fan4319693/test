//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Describes the row details in a seat map
 * 
 * <p>RowDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RowDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AirSeats">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="AirSeat" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
 *                           &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AirRowCharacteristics">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="CharacteristicList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxNumberOfSeats" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="RowNumber" use="required" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *       &lt;attribute name="AirBookDesigCode" type="{http://www.opentravel.org/OTA/2003/05}UpperCaseAlphaLength1to2" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RowDetailsType", propOrder = {
    "airSeats",
    "airRowCharacteristics"
})
public class RowDetailsType {

    @XmlElement(name = "AirSeats", required = true)
    protected RowDetailsType.AirSeats airSeats;
    @XmlElement(name = "AirRowCharacteristics", required = true)
    protected RowDetailsType.AirRowCharacteristics airRowCharacteristics;
    @XmlAttribute(name = "MaxNumberOfSeats")
    protected Integer maxNumberOfSeats;
    @XmlAttribute(name = "RowNumber", required = true)
    protected BigInteger rowNumber;
    @XmlAttribute(name = "AirBookDesigCode")
    protected String airBookDesigCode;

    /**
     * 获取airSeats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RowDetailsType.AirSeats }
     *     
     */
    public RowDetailsType.AirSeats getAirSeats() {
        return airSeats;
    }

    /**
     * 设置airSeats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RowDetailsType.AirSeats }
     *     
     */
    public void setAirSeats(RowDetailsType.AirSeats value) {
        this.airSeats = value;
    }

    /**
     * 获取airRowCharacteristics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RowDetailsType.AirRowCharacteristics }
     *     
     */
    public RowDetailsType.AirRowCharacteristics getAirRowCharacteristics() {
        return airRowCharacteristics;
    }

    /**
     * 设置airRowCharacteristics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RowDetailsType.AirRowCharacteristics }
     *     
     */
    public void setAirRowCharacteristics(RowDetailsType.AirRowCharacteristics value) {
        this.airRowCharacteristics = value;
    }

    /**
     * 获取maxNumberOfSeats属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxNumberOfSeats() {
        return maxNumberOfSeats;
    }

    /**
     * 设置maxNumberOfSeats属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxNumberOfSeats(Integer value) {
        this.maxNumberOfSeats = value;
    }

    /**
     * 获取rowNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRowNumber() {
        return rowNumber;
    }

    /**
     * 设置rowNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRowNumber(BigInteger value) {
        this.rowNumber = value;
    }

    /**
     * 获取airBookDesigCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAirBookDesigCode() {
        return airBookDesigCode;
    }

    /**
     * 设置airBookDesigCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAirBookDesigCode(String value) {
        this.airBookDesigCode = value;
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
     *       &lt;attribute name="CharacteristicList" use="required" type="{http://www.opentravel.org/OTA/2003/05}ListOfOTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AirRowCharacteristics {

        @XmlAttribute(name = "CharacteristicList", required = true)
        protected List<String> characteristicList;

        /**
         * Gets the value of the characteristicList property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the characteristicList property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCharacteristicList().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getCharacteristicList() {
            if (characteristicList == null) {
                characteristicList = new ArrayList<String>();
            }
            return this.characteristicList;
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
     *         &lt;element name="AirSeat" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
     *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
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
        "airSeat"
    })
    public static class AirSeats {

        @XmlElement(name = "AirSeat", required = true)
        protected List<RowDetailsType.AirSeats.AirSeat> airSeat;

        /**
         * Gets the value of the airSeat property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airSeat property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirSeat().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RowDetailsType.AirSeats.AirSeat }
         * 
         * 
         */
        public List<RowDetailsType.AirSeats.AirSeat> getAirSeat() {
            if (airSeat == null) {
                airSeat = new ArrayList<RowDetailsType.AirSeats.AirSeat>();
            }
            return this.airSeat;
        }


        /**
         *  Describes the seat attributes.
         * 
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SeatDetailsGroup"/>
         *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class AirSeat {

            @XmlAttribute(name = "RPH")
            protected String rph;
            @XmlAttribute(name = "SeatAvailability")
            protected String seatAvailability;
            @XmlAttribute(name = "SeatNumber", required = true)
            protected String seatNumber;
            @XmlAttribute(name = "SeatCharacteristics", required = true)
            protected List<String> seatCharacteristics;
            @XmlAttribute(name = "AirBookDesigCode")
            protected String airBookDesigCode;

            /**
             * 获取rph属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getRPH() {
                return rph;
            }

            /**
             * 设置rph属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setRPH(String value) {
                this.rph = value;
            }

            /**
             * 获取seatAvailability属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatAvailability() {
                return seatAvailability;
            }

            /**
             * 设置seatAvailability属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatAvailability(String value) {
                this.seatAvailability = value;
            }

            /**
             * 获取seatNumber属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getSeatNumber() {
                return seatNumber;
            }

            /**
             * 设置seatNumber属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setSeatNumber(String value) {
                this.seatNumber = value;
            }

            /**
             * Gets the value of the seatCharacteristics property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the seatCharacteristics property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSeatCharacteristics().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link String }
             * 
             * 
             */
            public List<String> getSeatCharacteristics() {
                if (seatCharacteristics == null) {
                    seatCharacteristics = new ArrayList<String>();
                }
                return this.seatCharacteristics;
            }

            /**
             * 获取airBookDesigCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAirBookDesigCode() {
                return airBookDesigCode;
            }

            /**
             * 设置airBookDesigCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAirBookDesigCode(String value) {
                this.airBookDesigCode = value;
            }

        }

    }

}
