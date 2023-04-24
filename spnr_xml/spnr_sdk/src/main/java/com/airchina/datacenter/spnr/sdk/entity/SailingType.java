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
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Specifies sailing information.
 * 
 * <p>SailingType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="SailingType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}SailingInfoType">
 *       &lt;sequence>
 *         &lt;element name="Dining" maxOccurs="3" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Sitting" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *                 &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Transportation" type="{http://www.opentravel.org/OTA/2003/05}GuestTransportationType" maxOccurs="5" minOccurs="0"/>
 *         &lt;element name="Information" type="{http://www.opentravel.org/OTA/2003/05}ParagraphType" maxOccurs="5" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="MaxCabinOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "SailingType", propOrder = {
    "dining",
    "transportation",
    "information"
})
public class SailingType
    extends SailingInfoType
{

    @XmlElement(name = "Dining")
    protected List<SailingType.Dining> dining;
    @XmlElement(name = "Transportation")
    protected List<GuestTransportationType> transportation;
    @XmlElement(name = "Information")
    protected List<ParagraphType> information;
    @XmlAttribute(name = "MaxCabinOccupancy")
    protected Integer maxCabinOccupancy;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;

    /**
     * Gets the value of the dining property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the dining property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getDining().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SailingType.Dining }
     * 
     * 
     */
    public List<SailingType.Dining> getDining() {
        if (dining == null) {
            dining = new ArrayList<SailingType.Dining>();
        }
        return this.dining;
    }

    /**
     * Gets the value of the transportation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the transportation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTransportation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link GuestTransportationType }
     * 
     * 
     */
    public List<GuestTransportationType> getTransportation() {
        if (transportation == null) {
            transportation = new ArrayList<GuestTransportationType>();
        }
        return this.transportation;
    }

    /**
     * Gets the value of the information property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the information property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getInformation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ParagraphType }
     * 
     * 
     */
    public List<ParagraphType> getInformation() {
        if (information == null) {
            information = new ArrayList<ParagraphType>();
        }
        return this.information;
    }

    /**
     * 获取maxCabinOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxCabinOccupancy() {
        return maxCabinOccupancy;
    }

    /**
     * 设置maxCabinOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxCabinOccupancy(Integer value) {
        this.maxCabinOccupancy = value;
    }

    /**
     * 获取categoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * 设置categoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
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
     *       &lt;attribute name="Sitting" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *       &lt;attribute name="Status" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Dining {

        @XmlAttribute(name = "Sitting", required = true)
        protected String sitting;
        @XmlAttribute(name = "Status")
        protected String status;

        /**
         * 获取sitting属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSitting() {
            return sitting;
        }

        /**
         * 设置sitting属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSitting(String value) {
            this.sitting = value;
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

    }

}
