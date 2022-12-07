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
 * A collection of RoomStay objects.  Room stays associated with this reservation.
 * 
 * <p>RoomStaysType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RoomStaysType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="RoomStay" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
 *                 &lt;sequence>
 *                   &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *                   &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
 *                   &lt;element name="Reference" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
 *                           &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
 *                 &lt;attribute name="IndexNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
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
@XmlType(name = "RoomStaysType", propOrder = {
    "roomStay"
})
public class RoomStaysType {

    @XmlElement(name = "RoomStay", required = true)
    protected List<RoomStaysType.RoomStay> roomStay;

    /**
     * Gets the value of the roomStay property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the roomStay property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getRoomStay().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RoomStaysType.RoomStay }
     * 
     * 
     */
    public List<RoomStaysType.RoomStay> getRoomStay() {
        if (roomStay == null) {
            roomStay = new ArrayList<RoomStaysType.RoomStay>();
        }
        return this.roomStay;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}RoomStayType">
     *       &lt;sequence>
     *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
     *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
     *         &lt;element name="Reference" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
     *                 &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *               &lt;/extension>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DocRqdGroup"/>
     *       &lt;attribute name="IndexNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to999" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "resGuestRPHs",
        "memberships",
        "comments",
        "specialRequests",
        "serviceRPHs",
        "reference"
    })
    public static class RoomStay
        extends RoomStayType
    {

        @XmlElement(name = "ResGuestRPHs")
        protected ResGuestRPHsType resGuestRPHs;
        @XmlElement(name = "Memberships")
        protected MembershipType memberships;
        @XmlElement(name = "Comments")
        protected CommentType comments;
        @XmlElement(name = "SpecialRequests")
        protected SpecialRequestType specialRequests;
        @XmlElement(name = "ServiceRPHs")
        protected ServiceRPHsType serviceRPHs;
        @XmlElement(name = "Reference")
        protected RoomStaysType.RoomStay.Reference reference;
        @XmlAttribute(name = "IndexNumber")
        protected Integer indexNumber;
        @XmlAttribute(name = "DocumentationRequired")
        protected String documentationRequired;
        @XmlAttribute(name = "DocReqExclCountries")
        protected List<String> docReqExclCountries;
        @XmlAttribute(name = "DocReqInclCountries")
        protected List<String> docReqInclCountries;

        /**
         * 获取resGuestRPHs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public ResGuestRPHsType getResGuestRPHs() {
            return resGuestRPHs;
        }

        /**
         * 设置resGuestRPHs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestRPHsType }
         *     
         */
        public void setResGuestRPHs(ResGuestRPHsType value) {
            this.resGuestRPHs = value;
        }

        /**
         * 获取memberships属性的值。
         * 
         * @return
         *     possible object is
         *     {@link MembershipType }
         *     
         */
        public MembershipType getMemberships() {
            return memberships;
        }

        /**
         * 设置memberships属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link MembershipType }
         *     
         */
        public void setMemberships(MembershipType value) {
            this.memberships = value;
        }

        /**
         * 获取comments属性的值。
         * 
         * @return
         *     possible object is
         *     {@link CommentType }
         *     
         */
        public CommentType getComments() {
            return comments;
        }

        /**
         * 设置comments属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link CommentType }
         *     
         */
        public void setComments(CommentType value) {
            this.comments = value;
        }

        /**
         * 获取specialRequests属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SpecialRequestType }
         *     
         */
        public SpecialRequestType getSpecialRequests() {
            return specialRequests;
        }

        /**
         * 设置specialRequests属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SpecialRequestType }
         *     
         */
        public void setSpecialRequests(SpecialRequestType value) {
            this.specialRequests = value;
        }

        /**
         * 获取serviceRPHs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ServiceRPHsType }
         *     
         */
        public ServiceRPHsType getServiceRPHs() {
            return serviceRPHs;
        }

        /**
         * 设置serviceRPHs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ServiceRPHsType }
         *     
         */
        public void setServiceRPHs(ServiceRPHsType value) {
            this.serviceRPHs = value;
        }

        /**
         * 获取reference属性的值。
         * 
         * @return
         *     possible object is
         *     {@link RoomStaysType.RoomStay.Reference }
         *     
         */
        public RoomStaysType.RoomStay.Reference getReference() {
            return reference;
        }

        /**
         * 设置reference属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link RoomStaysType.RoomStay.Reference }
         *     
         */
        public void setReference(RoomStaysType.RoomStay.Reference value) {
            this.reference = value;
        }

        /**
         * 获取indexNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getIndexNumber() {
            return indexNumber;
        }

        /**
         * 设置indexNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setIndexNumber(Integer value) {
            this.indexNumber = value;
        }

        /**
         * 获取documentationRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDocumentationRequired() {
            return documentationRequired;
        }

        /**
         * 设置documentationRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDocumentationRequired(String value) {
            this.documentationRequired = value;
        }

        /**
         * Gets the value of the docReqExclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqExclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqExclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqExclCountries() {
            if (docReqExclCountries == null) {
                docReqExclCountries = new ArrayList<String>();
            }
            return this.docReqExclCountries;
        }

        /**
         * Gets the value of the docReqInclCountries property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the docReqInclCountries property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocReqInclCountries().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getDocReqInclCountries() {
            if (docReqInclCountries == null) {
                docReqInclCountries = new ArrayList<String>();
            }
            return this.docReqInclCountries;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type">
         *       &lt;attribute name="DateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Reference
            extends UniqueIDType
        {

            @XmlAttribute(name = "DateTime")
            @XmlSchemaType(name = "dateTime")
            protected XMLGregorianCalendar dateTime;

            /**
             * 获取dateTime属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDateTime() {
                return dateTime;
            }

            /**
             * 设置dateTime属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDateTime(XMLGregorianCalendar value) {
                this.dateTime = value;
            }

        }

    }

}
