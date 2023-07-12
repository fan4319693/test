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


/**
 * Special Traveler Needs with associated traveler.
 * 
 * <p>SpecialSrvcPaxType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialSrvcPaxType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialSrvcSSRType">
 *                 &lt;sequence>
 *                   &lt;element name="TravelerIDRef" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OtherType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialSrvcOtherType">
 *                 &lt;sequence>
 *                   &lt;element name="TravelerIDRef" maxOccurs="unbounded" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/extension>
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
@XmlType(name = "SpecialSrvcPaxType", propOrder = {
    "ssrType",
    "otherType"
})
public class SpecialSrvcPaxType {

    @XmlElement(name = "SSRType")
    protected List<SpecialSrvcPaxType.SSRType> ssrType;
    @XmlElement(name = "OtherType")
    protected List<SpecialSrvcPaxType.OtherType> otherType;

    /**
     * Gets the value of the ssrType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ssrType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSSRType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialSrvcPaxType.SSRType }
     * 
     * 
     */
    public List<SpecialSrvcPaxType.SSRType> getSSRType() {
        if (ssrType == null) {
            ssrType = new ArrayList<SpecialSrvcPaxType.SSRType>();
        }
        return this.ssrType;
    }

    /**
     * Gets the value of the otherType property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the otherType property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getOtherType().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SpecialSrvcPaxType.OtherType }
     * 
     * 
     */
    public List<SpecialSrvcPaxType.OtherType> getOtherType() {
        if (otherType == null) {
            otherType = new ArrayList<SpecialSrvcPaxType.OtherType>();
        }
        return this.otherType;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialSrvcOtherType">
     *       &lt;sequence>
     *         &lt;element name="TravelerIDRef" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travelerIDRef"
    })
    public static class OtherType
        extends SpecialSrvcOtherType
    {

        @XmlElement(name = "TravelerIDRef")
        protected List<SpecialSrvcPaxType.OtherType.TravelerIDRef> travelerIDRef;

        /**
         * Gets the value of the travelerIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialSrvcPaxType.OtherType.TravelerIDRef }
         * 
         * 
         */
        public List<SpecialSrvcPaxType.OtherType.TravelerIDRef> getTravelerIDRef() {
            if (travelerIDRef == null) {
                travelerIDRef = new ArrayList<SpecialSrvcPaxType.OtherType.TravelerIDRef>();
            }
            return this.travelerIDRef;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelerIDRef
            extends TravelerIDRefType
        {

            @XmlAttribute(name = "PaxType", required = true)
            protected String paxType;

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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialSrvcSSRType">
     *       &lt;sequence>
     *         &lt;element name="TravelerIDRef" maxOccurs="unbounded" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "travelerIDRef"
    })
    public static class SSRType
        extends SpecialSrvcSSRType
    {

        @XmlElement(name = "TravelerIDRef")
        protected List<SpecialSrvcPaxType.SSRType.TravelerIDRef> travelerIDRef;

        /**
         * Gets the value of the travelerIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SpecialSrvcPaxType.SSRType.TravelerIDRef }
         * 
         * 
         */
        public List<SpecialSrvcPaxType.SSRType.TravelerIDRef> getTravelerIDRef() {
            if (travelerIDRef == null) {
                travelerIDRef = new ArrayList<SpecialSrvcPaxType.SSRType.TravelerIDRef>();
            }
            return this.travelerIDRef;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>TravelerIDRefType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PaxType"/>
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class TravelerIDRef
            extends TravelerIDRefType
        {

            @XmlAttribute(name = "PaxType", required = true)
            protected String paxType;

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

        }

    }

}
