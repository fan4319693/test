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
 * Defines the information needed to describe a train segment that has been booked as part of a reservation.
 * 
 * <p>BookedTrainSegmentType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="BookedTrainSegmentType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}TrainSegmentType">
 *       &lt;sequence>
 *         &lt;element name="ClassCode" type="{http://www.opentravel.org/OTA/2003/05}ClassCodeType" minOccurs="0"/>
 *         &lt;element name="Comment" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" maxOccurs="10" minOccurs="0"/>
 *         &lt;element name="Assignment" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccommodationServiceType">
 *                 &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MarriageGrp" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="BookStatus" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="TicketStatus" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "BookedTrainSegmentType", propOrder = {
    "classCode",
    "comment",
    "assignment",
    "marriageGrp"
})
public class BookedTrainSegmentType
    extends TrainSegmentType
{

    @XmlElement(name = "ClassCode")
    protected ClassCodeType classCode;
    @XmlElement(name = "Comment")
    protected List<FreeTextType> comment;
    @XmlElement(name = "Assignment")
    protected List<BookedTrainSegmentType.Assignment> assignment;
    @XmlElement(name = "MarriageGrp")
    protected String marriageGrp;
    @XmlAttribute(name = "BookStatus", required = true)
    protected String bookStatus;
    @XmlAttribute(name = "TicketStatus")
    protected String ticketStatus;

    /**
     * 获取classCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ClassCodeType }
     *     
     */
    public ClassCodeType getClassCode() {
        return classCode;
    }

    /**
     * 设置classCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ClassCodeType }
     *     
     */
    public void setClassCode(ClassCodeType value) {
        this.classCode = value;
    }

    /**
     * Gets the value of the comment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the comment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getComment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FreeTextType }
     * 
     * 
     */
    public List<FreeTextType> getComment() {
        if (comment == null) {
            comment = new ArrayList<FreeTextType>();
        }
        return this.comment;
    }

    /**
     * Gets the value of the assignment property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the assignment property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAssignment().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BookedTrainSegmentType.Assignment }
     * 
     * 
     */
    public List<BookedTrainSegmentType.Assignment> getAssignment() {
        if (assignment == null) {
            assignment = new ArrayList<BookedTrainSegmentType.Assignment>();
        }
        return this.assignment;
    }

    /**
     * 获取marriageGrp属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMarriageGrp() {
        return marriageGrp;
    }

    /**
     * 设置marriageGrp属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMarriageGrp(String value) {
        this.marriageGrp = value;
    }

    /**
     * 获取bookStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookStatus() {
        return bookStatus;
    }

    /**
     * 设置bookStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookStatus(String value) {
        this.bookStatus = value;
    }

    /**
     * 获取ticketStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getTicketStatus() {
        return ticketStatus;
    }

    /**
     * 设置ticketStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setTicketStatus(String value) {
        this.ticketStatus = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AccommodationServiceType">
     *       &lt;attribute name="TravelerRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Assignment
        extends AccommodationServiceType
    {

        @XmlAttribute(name = "TravelerRPH")
        protected String travelerRPH;

        /**
         * 获取travelerRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelerRPH() {
            return travelerRPH;
        }

        /**
         * 设置travelerRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelerRPH(String value) {
            this.travelerRPH = value;
        }

    }

}
