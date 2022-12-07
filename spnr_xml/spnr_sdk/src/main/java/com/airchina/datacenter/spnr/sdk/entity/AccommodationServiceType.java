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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Types of accommodations and services available for passenger purchase on a train.
 * 
 * <p>AccommodationServiceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccommodationServiceType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AccommodationDetail" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailAccommDetailType">
 *                 &lt;attribute name="ReferenceTravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="ReferenceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}AncillaryService" maxOccurs="99" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccommodationServiceType", propOrder = {
    "accommodationDetail",
    "ancillaryService"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.BookedTrainSegmentType.Assignment.class
})
public class AccommodationServiceType {

    @XmlElement(name = "AccommodationDetail")
    protected AccommodationServiceType.AccommodationDetail accommodationDetail;
    @XmlElement(name = "AncillaryService")
    protected List<AncillaryService> ancillaryService;

    /**
     * 获取accommodationDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccommodationServiceType.AccommodationDetail }
     *     
     */
    public AccommodationServiceType.AccommodationDetail getAccommodationDetail() {
        return accommodationDetail;
    }

    /**
     * 设置accommodationDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccommodationServiceType.AccommodationDetail }
     *     
     */
    public void setAccommodationDetail(AccommodationServiceType.AccommodationDetail value) {
        this.accommodationDetail = value;
    }

    /**
     * Gets the value of the ancillaryService property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the ancillaryService property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAncillaryService().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AncillaryService }
     * 
     * 
     */
    public List<AncillaryService> getAncillaryService() {
        if (ancillaryService == null) {
            ancillaryService = new ArrayList<AncillaryService>();
        }
        return this.ancillaryService;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RailAccommDetailType">
     *       &lt;attribute name="ReferenceTravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="ReferenceInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccommodationDetail
        extends RailAccommDetailType
    {

        @XmlAttribute(name = "ReferenceTravelerRPH")
        protected String referenceTravelerRPH;
        @XmlAttribute(name = "ReferenceInd")
        protected Boolean referenceInd;

        /**
         * 获取referenceTravelerRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceTravelerRPH() {
            return referenceTravelerRPH;
        }

        /**
         * 设置referenceTravelerRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceTravelerRPH(String value) {
            this.referenceTravelerRPH = value;
        }

        /**
         * 获取referenceInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isReferenceInd() {
            return referenceInd;
        }

        /**
         * 设置referenceInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setReferenceInd(Boolean value) {
            this.referenceInd = value;
        }

    }

}
