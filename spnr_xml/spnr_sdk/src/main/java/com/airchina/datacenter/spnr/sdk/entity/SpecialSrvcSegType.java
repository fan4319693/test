//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Special Traveler Needs with associated flight segment.
 * 
 * <p>SpecialSrvcSegType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SpecialSrvcSegType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="SSRType" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SpecialSrvcSSRType">
 *                 &lt;sequence>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "SpecialSrvcSegType", propOrder = {
    "ssrType",
    "otherType"
})
public class SpecialSrvcSegType {

    @XmlElement(name = "SSRType")
    protected List<SpecialSrvcSegType.SSRType> ssrType;
    @XmlElement(name = "OtherType")
    protected List<SpecialSrvcSegType.OtherType> otherType;

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
     * {@link SpecialSrvcSegType.SSRType }
     * 
     * 
     */
    public List<SpecialSrvcSegType.SSRType> getSSRType() {
        if (ssrType == null) {
            ssrType = new ArrayList<SpecialSrvcSegType.SSRType>();
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
     * {@link SpecialSrvcSegType.OtherType }
     * 
     * 
     */
    public List<SpecialSrvcSegType.OtherType> getOtherType() {
        if (otherType == null) {
            otherType = new ArrayList<SpecialSrvcSegType.OtherType>();
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "segmentIDRef"
    })
    public static class OtherType
        extends SpecialSrvcOtherType
    {

        @XmlElement(name = "SegmentIDRef")
        protected List<SegmentIDRefType> segmentIDRef;

        /**
         * Gets the value of the segmentIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentIDRefType }
         * 
         * 
         */
        public List<SegmentIDRefType> getSegmentIDRef() {
            if (segmentIDRef == null) {
                segmentIDRef = new ArrayList<SegmentIDRefType>();
            }
            return this.segmentIDRef;
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
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "segmentIDRef"
    })
    public static class SSRType
        extends SpecialSrvcSSRType
    {

        @XmlElement(name = "SegmentIDRef")
        protected List<SegmentIDRefType> segmentIDRef;

        /**
         * Gets the value of the segmentIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentIDRefType }
         * 
         * 
         */
        public List<SegmentIDRefType> getSegmentIDRef() {
            if (segmentIDRef == null) {
                segmentIDRef = new ArrayList<SegmentIDRefType>();
            }
            return this.segmentIDRef;
        }

    }

}
