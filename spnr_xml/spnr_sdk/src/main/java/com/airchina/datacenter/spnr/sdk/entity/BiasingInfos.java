//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
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
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * <p>BiasingInfos complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BiasingInfos">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="BiasingInfo" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Biasing" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="AdvBiasing" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="DestinationSystemCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" default="ALL" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Biasing" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *       &lt;attribute name="AdvBiasing" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BiasingInfos", propOrder = {
    "biasingInfo"
})
public class BiasingInfos {

    @XmlElement(name = "BiasingInfo")
    protected List<BiasingInfos.BiasingInfo> biasingInfo;
    @XmlAttribute(name = "Biasing")
    @XmlSchemaType(name = "anySimpleType")
    protected String biasing;
    @XmlAttribute(name = "AdvBiasing")
    @XmlSchemaType(name = "anySimpleType")
    protected String advBiasing;

    /**
     * Gets the value of the biasingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the biasingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getBiasingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BiasingInfos.BiasingInfo }
     * 
     * 
     */
    public List<BiasingInfos.BiasingInfo> getBiasingInfo() {
        if (biasingInfo == null) {
            biasingInfo = new ArrayList<BiasingInfos.BiasingInfo>();
        }
        return this.biasingInfo;
    }

    /**
     * 获取biasing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBiasing() {
        return biasing;
    }

    /**
     * 设置biasing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBiasing(String value) {
        this.biasing = value;
    }

    /**
     * 获取advBiasing属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAdvBiasing() {
        return advBiasing;
    }

    /**
     * 设置advBiasing属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAdvBiasing(String value) {
        this.advBiasing = value;
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
     *       &lt;attribute name="From" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="To" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Biasing" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="AdvBiasing" use="required" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="DestinationSystemCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" default="ALL" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class BiasingInfo {

        @XmlAttribute(name = "From", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar from;
        @XmlAttribute(name = "To", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar to;
        @XmlAttribute(name = "Biasing", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String biasing;
        @XmlAttribute(name = "AdvBiasing", required = true)
        @XmlSchemaType(name = "anySimpleType")
        protected String advBiasing;
        @XmlAttribute(name = "DestinationSystemCode")
        protected String destinationSystemCode;

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

        /**
         * 获取biasing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBiasing() {
            return biasing;
        }

        /**
         * 设置biasing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBiasing(String value) {
            this.biasing = value;
        }

        /**
         * 获取advBiasing属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdvBiasing() {
            return advBiasing;
        }

        /**
         * 设置advBiasing属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdvBiasing(String value) {
            this.advBiasing = value;
        }

        /**
         * 获取destinationSystemCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDestinationSystemCode() {
            if (destinationSystemCode == null) {
                return "ALL";
            } else {
                return destinationSystemCode;
            }
        }

        /**
         * 设置destinationSystemCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDestinationSystemCode(String value) {
            this.destinationSystemCode = value;
        }

    }

}
