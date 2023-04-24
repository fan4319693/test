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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * A collection of ResGuest objects, identifying the guests associated with this reservation. Which guests are in which room is determined by each RoomStays ResGuestRPHs collection.
 * 
 * <p>ResGuestsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResGuestsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="ResGuest" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
 *                   &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *                   &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *                   &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
 *                   &lt;element name="ProfileRPHs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProfileRPH" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
 *                   &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *                   &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
 *                 &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *                 &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
 *                 &lt;attribute name="GroupEventCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                 &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ResGuestsType", propOrder = {
    "resGuest"
})
public class ResGuestsType {

    @XmlElement(name = "ResGuest", required = true)
    protected List<ResGuestsType.ResGuest> resGuest;

    /**
     * Gets the value of the resGuest property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the resGuest property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getResGuest().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ResGuestsType.ResGuest }
     * 
     * 
     */
    public List<ResGuestsType.ResGuest> getResGuest() {
        if (resGuest == null) {
            resGuest = new ArrayList<ResGuestsType.ResGuest>();
        }
        return this.resGuest;
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
     *         &lt;element name="Profiles" type="{http://www.opentravel.org/OTA/2003/05}ProfilesType" minOccurs="0"/>
     *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
     *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
     *         &lt;element name="ServiceRPHs" type="{http://www.opentravel.org/OTA/2003/05}ServiceRPHsType" minOccurs="0"/>
     *         &lt;element name="ProfileRPHs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProfileRPH" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
     *         &lt;element name="ArrivalTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="DepartureTransport" type="{http://www.opentravel.org/OTA/2003/05}TransportInfoType" minOccurs="0"/>
     *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
     *         &lt;element name="InHouseTimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OJ_SuperPNR_RPH"/>
     *       &lt;attribute name="ResGuestRPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
     *       &lt;attribute name="AgeQualifyingCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="ArrivalTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="DepartureTime" type="{http://www.w3.org/2001/XMLSchema}time" />
     *       &lt;attribute name="GroupEventCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *       &lt;attribute name="Age" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="VIP" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "profiles",
        "specialRequests",
        "comments",
        "serviceRPHs",
        "profileRPHs",
        "arrivalTransport",
        "departureTransport",
        "guestCounts",
        "inHouseTimeSpan",
        "tpaExtensions"
    })
    public static class ResGuest {

        @XmlElement(name = "Profiles")
        protected ProfilesType profiles;
        @XmlElement(name = "SpecialRequests")
        protected SpecialRequestType specialRequests;
        @XmlElement(name = "Comments")
        protected CommentType comments;
        @XmlElement(name = "ServiceRPHs")
        protected ServiceRPHsType serviceRPHs;
        @XmlElement(name = "ProfileRPHs")
        protected ResGuestsType.ResGuest.ProfileRPHs profileRPHs;
        @XmlElement(name = "ArrivalTransport")
        protected TransportInfoType arrivalTransport;
        @XmlElement(name = "DepartureTransport")
        protected TransportInfoType departureTransport;
        @XmlElement(name = "GuestCounts")
        protected GuestCountType guestCounts;
        @XmlElement(name = "InHouseTimeSpan")
        protected DateTimeSpanType inHouseTimeSpan;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "ResGuestRPH")
        protected String resGuestRPH;
        @XmlAttribute(name = "AgeQualifyingCode")
        protected String ageQualifyingCode;
        @XmlAttribute(name = "ArrivalTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar arrivalTime;
        @XmlAttribute(name = "DepartureTime")
        @XmlSchemaType(name = "time")
        protected XMLGregorianCalendar departureTime;
        @XmlAttribute(name = "GroupEventCode")
        protected String groupEventCode;
        @XmlAttribute(name = "Age")
        @XmlSchemaType(name = "anySimpleType")
        protected String age;
        @XmlAttribute(name = "VIP")
        protected Boolean vip;
        @XmlAttribute(name = "OJ_SuperPNR_RPH")
        protected String ojSuperPNRRPH;

        /**
         * 获取profiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ProfilesType }
         *     
         */
        public ProfilesType getProfiles() {
            return profiles;
        }

        /**
         * 设置profiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ProfilesType }
         *     
         */
        public void setProfiles(ProfilesType value) {
            this.profiles = value;
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
         * 获取profileRPHs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ResGuestsType.ResGuest.ProfileRPHs }
         *     
         */
        public ResGuestsType.ResGuest.ProfileRPHs getProfileRPHs() {
            return profileRPHs;
        }

        /**
         * 设置profileRPHs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ResGuestsType.ResGuest.ProfileRPHs }
         *     
         */
        public void setProfileRPHs(ResGuestsType.ResGuest.ProfileRPHs value) {
            this.profileRPHs = value;
        }

        /**
         * 获取arrivalTransport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType }
         *     
         */
        public TransportInfoType getArrivalTransport() {
            return arrivalTransport;
        }

        /**
         * 设置arrivalTransport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType }
         *     
         */
        public void setArrivalTransport(TransportInfoType value) {
            this.arrivalTransport = value;
        }

        /**
         * 获取departureTransport属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TransportInfoType }
         *     
         */
        public TransportInfoType getDepartureTransport() {
            return departureTransport;
        }

        /**
         * 设置departureTransport属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TransportInfoType }
         *     
         */
        public void setDepartureTransport(TransportInfoType value) {
            this.departureTransport = value;
        }

        /**
         * 获取guestCounts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link GuestCountType }
         *     
         */
        public GuestCountType getGuestCounts() {
            return guestCounts;
        }

        /**
         * 设置guestCounts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link GuestCountType }
         *     
         */
        public void setGuestCounts(GuestCountType value) {
            this.guestCounts = value;
        }

        /**
         * 获取inHouseTimeSpan属性的值。
         * 
         * @return
         *     possible object is
         *     {@link DateTimeSpanType }
         *     
         */
        public DateTimeSpanType getInHouseTimeSpan() {
            return inHouseTimeSpan;
        }

        /**
         * 设置inHouseTimeSpan属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link DateTimeSpanType }
         *     
         */
        public void setInHouseTimeSpan(DateTimeSpanType value) {
            this.inHouseTimeSpan = value;
        }

        /**
         * 获取tpaExtensions属性的值。
         * 
         * @return
         *     possible object is
         *     {@link TPAExtensionsType }
         *     
         */
        public TPAExtensionsType getTPAExtensions() {
            return tpaExtensions;
        }

        /**
         * 设置tpaExtensions属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link TPAExtensionsType }
         *     
         */
        public void setTPAExtensions(TPAExtensionsType value) {
            this.tpaExtensions = value;
        }

        /**
         * 获取resGuestRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getResGuestRPH() {
            return resGuestRPH;
        }

        /**
         * 设置resGuestRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setResGuestRPH(String value) {
            this.resGuestRPH = value;
        }

        /**
         * 获取ageQualifyingCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgeQualifyingCode() {
            return ageQualifyingCode;
        }

        /**
         * 设置ageQualifyingCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgeQualifyingCode(String value) {
            this.ageQualifyingCode = value;
        }

        /**
         * 获取arrivalTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getArrivalTime() {
            return arrivalTime;
        }

        /**
         * 设置arrivalTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setArrivalTime(XMLGregorianCalendar value) {
            this.arrivalTime = value;
        }

        /**
         * 获取departureTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureTime() {
            return departureTime;
        }

        /**
         * 设置departureTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureTime(XMLGregorianCalendar value) {
            this.departureTime = value;
        }

        /**
         * 获取groupEventCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGroupEventCode() {
            return groupEventCode;
        }

        /**
         * 设置groupEventCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGroupEventCode(String value) {
            this.groupEventCode = value;
        }

        /**
         * 获取age属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAge() {
            return age;
        }

        /**
         * 设置age属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAge(String value) {
            this.age = value;
        }

        /**
         * 获取vip属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isVIP() {
            return vip;
        }

        /**
         * 设置vip属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setVIP(Boolean value) {
            this.vip = value;
        }

        /**
         * 获取ojSuperPNRRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOJSuperPNRRPH() {
            return ojSuperPNRRPH;
        }

        /**
         * 设置ojSuperPNRRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOJSuperPNRRPH(String value) {
            this.ojSuperPNRRPH = value;
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
         *         &lt;element name="ProfileRPH" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
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
            "profileRPH"
        })
        public static class ProfileRPHs {

            @XmlElement(name = "ProfileRPH", required = true)
            protected List<ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH> profileRPH;

            /**
             * Gets the value of the profileRPH property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the profileRPH property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProfileRPH().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH }
             * 
             * 
             */
            public List<ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH> getProfileRPH() {
                if (profileRPH == null) {
                    profileRPH = new ArrayList<ResGuestsType.ResGuest.ProfileRPHs.ProfileRPH>();
                }
                return this.profileRPH;
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
            public static class ProfileRPH {

                @XmlAttribute(name = "RPH")
                protected String rph;

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

            }

        }

    }

}
