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
import javax.xml.bind.annotation.XmlValue;


/**
 *  =notes=
 * 				1. IMPORTANT: This is MANDATORY information for AutoExchange applications, such as ReShop from ITA.
 * 				2. If used, the attribute @AutoExchange in the PricingInfo node MUST also be set to Y.
 * 
 * <p>TktInExchangeForType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TktInExchangeForType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="TicketNumber" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceReq"/>
 *                 &lt;attribute name="TravelerID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
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
@XmlType(name = "TktInExchangeForType", propOrder = {
    "ticketNumber"
})
public class TktInExchangeForType {

    @XmlElement(name = "TicketNumber", required = true)
    protected List<TktInExchangeForType.TicketNumber> ticketNumber;

    /**
     * Gets the value of the ticketNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ticketNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTicketNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TktInExchangeForType.TicketNumber }
     * 
     * 
     */
    public List<TktInExchangeForType.TicketNumber> getTicketNumber() {
        if (ticketNumber == null) {
            ticketNumber = new ArrayList<TktInExchangeForType.TicketNumber>();
        }
        return this.ticketNumber;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>integer">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}SourceReq"/>
     *       &lt;attribute name="TravelerID" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TicketNumber {

        @XmlValue
        protected BigInteger value;
        @XmlAttribute(name = "TravelerID", required = true)
        protected String travelerID;
        @XmlAttribute(name = "PaxType", required = true)
        protected String paxType;
        @XmlAttribute(name = "Source", required = true)
        protected String source;

        /**
         * 获取value属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setValue(BigInteger value) {
            this.value = value;
        }

        /**
         * 获取travelerID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerID() {
            return travelerID;
        }

        /**
         * 设置travelerID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerID(String value) {
            this.travelerID = value;
        }

        /**
         * 获取paxType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPaxType() {
            return paxType;
        }

        /**
         * 设置paxType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPaxType(String value) {
            this.paxType = value;
        }

        /**
         * 获取source属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSource() {
            return source;
        }

        /**
         * 设置source属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSource(String value) {
            this.source = value;
        }

    }

}
