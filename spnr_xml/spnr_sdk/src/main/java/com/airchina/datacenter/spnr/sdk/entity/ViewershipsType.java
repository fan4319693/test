//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * Viewerships determine  the distribution channel(s) for a rate plan. As an optional element, the absence of Viewerships implies a generally available rate, while the presence of a Viewerships collection implies qualifications on the rate. This may also be used to define a system that is able to view the hotel content.
 * 
 * <p>ViewershipsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ViewershipsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Viewership" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ViewershipCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SystemCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="SystemCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProfileTypes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProfileType" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ProfileRefs" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ProfileRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Profiles" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" maxOccurs="unbounded"/>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="LocationCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="LocationCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                     &lt;attribute name="StateProvinceCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                                     &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="BookingChannelCodes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="BookingChannelCode" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                           &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="DistributorTypes" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="DistributorType" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;simpleContent>
 *                                   &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                                     &lt;attribute name="DistributorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                     &lt;attribute name="DistributorTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *                                   &lt;/extension>
 *                                 &lt;/simpleContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}byte" />
 *                 &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
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
@XmlType(name = "ViewershipsType", propOrder = {
    "viewership"
})
public class ViewershipsType {

    @XmlElement(name = "Viewership", required = true)
    protected List<ViewershipsType.Viewership> viewership;

    /**
     * Gets the value of the viewership property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the viewership property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getViewership().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ViewershipsType.Viewership }
     * 
     * 
     */
    public List<ViewershipsType.Viewership> getViewership() {
        if (viewership == null) {
            viewership = new ArrayList<ViewershipsType.Viewership>();
        }
        return this.viewership;
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
     *         &lt;element name="ViewershipCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SystemCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="SystemCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProfileTypes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProfileType" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ProfileRefs" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ProfileRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Profiles" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" maxOccurs="unbounded"/>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="LocationCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="LocationCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                           &lt;attribute name="StateProvinceCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *                           &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="BookingChannelCodes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="BookingChannelCode" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *                 &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="DistributorTypes" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="DistributorType" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;simpleContent>
     *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                           &lt;attribute name="DistributorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                           &lt;attribute name="DistributorTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *                         &lt;/extension>
     *                       &lt;/simpleContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="ViewershipRPH" type="{http://www.w3.org/2001/XMLSchema}byte" />
     *       &lt;attribute name="ViewOnly" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "viewershipCodes",
        "systemCodes",
        "profileTypes",
        "profileRefs",
        "profiles",
        "locationCodes",
        "bookingChannelCodes",
        "distributorTypes"
    })
    public static class Viewership {

        @XmlElement(name = "ViewershipCodes")
        protected ViewershipsType.Viewership.ViewershipCodes viewershipCodes;
        @XmlElement(name = "SystemCodes")
        protected ViewershipsType.Viewership.SystemCodes systemCodes;
        @XmlElement(name = "ProfileTypes")
        protected ViewershipsType.Viewership.ProfileTypes profileTypes;
        @XmlElement(name = "ProfileRefs")
        protected ViewershipsType.Viewership.ProfileRefs profileRefs;
        @XmlElement(name = "Profiles")
        protected ViewershipsType.Viewership.Profiles profiles;
        @XmlElement(name = "LocationCodes")
        protected ViewershipsType.Viewership.LocationCodes locationCodes;
        @XmlElement(name = "BookingChannelCodes")
        protected ViewershipsType.Viewership.BookingChannelCodes bookingChannelCodes;
        @XmlElement(name = "DistributorTypes")
        protected ViewershipsType.Viewership.DistributorTypes distributorTypes;
        @XmlAttribute(name = "ViewershipRPH")
        protected Byte viewershipRPH;
        @XmlAttribute(name = "ViewOnly")
        protected Boolean viewOnly;

        /**
         * 获取viewershipCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.ViewershipCodes }
         *     
         */
        public ViewershipsType.Viewership.ViewershipCodes getViewershipCodes() {
            return viewershipCodes;
        }

        /**
         * 设置viewershipCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.ViewershipCodes }
         *     
         */
        public void setViewershipCodes(ViewershipsType.Viewership.ViewershipCodes value) {
            this.viewershipCodes = value;
        }

        /**
         * 获取systemCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.SystemCodes }
         *     
         */
        public ViewershipsType.Viewership.SystemCodes getSystemCodes() {
            return systemCodes;
        }

        /**
         * 设置systemCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.SystemCodes }
         *     
         */
        public void setSystemCodes(ViewershipsType.Viewership.SystemCodes value) {
            this.systemCodes = value;
        }

        /**
         * 获取profileTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.ProfileTypes }
         *     
         */
        public ViewershipsType.Viewership.ProfileTypes getProfileTypes() {
            return profileTypes;
        }

        /**
         * 设置profileTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.ProfileTypes }
         *     
         */
        public void setProfileTypes(ViewershipsType.Viewership.ProfileTypes value) {
            this.profileTypes = value;
        }

        /**
         * 获取profileRefs属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.ProfileRefs }
         *     
         */
        public ViewershipsType.Viewership.ProfileRefs getProfileRefs() {
            return profileRefs;
        }

        /**
         * 设置profileRefs属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.ProfileRefs }
         *     
         */
        public void setProfileRefs(ViewershipsType.Viewership.ProfileRefs value) {
            this.profileRefs = value;
        }

        /**
         * 获取profiles属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.Profiles }
         *     
         */
        public ViewershipsType.Viewership.Profiles getProfiles() {
            return profiles;
        }

        /**
         * 设置profiles属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.Profiles }
         *     
         */
        public void setProfiles(ViewershipsType.Viewership.Profiles value) {
            this.profiles = value;
        }

        /**
         * 获取locationCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.LocationCodes }
         *     
         */
        public ViewershipsType.Viewership.LocationCodes getLocationCodes() {
            return locationCodes;
        }

        /**
         * 设置locationCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.LocationCodes }
         *     
         */
        public void setLocationCodes(ViewershipsType.Viewership.LocationCodes value) {
            this.locationCodes = value;
        }

        /**
         * 获取bookingChannelCodes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.BookingChannelCodes }
         *     
         */
        public ViewershipsType.Viewership.BookingChannelCodes getBookingChannelCodes() {
            return bookingChannelCodes;
        }

        /**
         * 设置bookingChannelCodes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.BookingChannelCodes }
         *     
         */
        public void setBookingChannelCodes(ViewershipsType.Viewership.BookingChannelCodes value) {
            this.bookingChannelCodes = value;
        }

        /**
         * 获取distributorTypes属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ViewershipsType.Viewership.DistributorTypes }
         *     
         */
        public ViewershipsType.Viewership.DistributorTypes getDistributorTypes() {
            return distributorTypes;
        }

        /**
         * 设置distributorTypes属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ViewershipsType.Viewership.DistributorTypes }
         *     
         */
        public void setDistributorTypes(ViewershipsType.Viewership.DistributorTypes value) {
            this.distributorTypes = value;
        }

        /**
         * 获取viewershipRPH属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Byte }
         *     
         */
        public Byte getViewershipRPH() {
            return viewershipRPH;
        }

        /**
         * 设置viewershipRPH属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Byte }
         *     
         */
        public void setViewershipRPH(Byte value) {
            this.viewershipRPH = value;
        }

        /**
         * 获取viewOnly属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isViewOnly() {
            return viewOnly;
        }

        /**
         * 设置viewOnly属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setViewOnly(Boolean value) {
            this.viewOnly = value;
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
         *         &lt;element name="BookingChannelCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="ChannelCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "bookingChannelCode"
        })
        public static class BookingChannelCodes {

            @XmlElement(name = "BookingChannelCode", required = true)
            protected List<ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode> bookingChannelCode;
            @XmlAttribute(name = "ChannelCodesInclusive")
            protected Boolean channelCodesInclusive;

            /**
             * Gets the value of the bookingChannelCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the bookingChannelCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getBookingChannelCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode }
             * 
             * 
             */
            public List<ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode> getBookingChannelCode() {
                if (bookingChannelCode == null) {
                    bookingChannelCode = new ArrayList<ViewershipsType.Viewership.BookingChannelCodes.BookingChannelCode>();
                }
                return this.bookingChannelCode;
            }

            /**
             * 获取channelCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isChannelCodesInclusive() {
                return channelCodesInclusive;
            }

            /**
             * 设置channelCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setChannelCodesInclusive(Boolean value) {
                this.channelCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
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
            public static class BookingChannelCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * 获取restrictedDisplayIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * 设置restrictedDisplayIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
                }

                /**
                 * 获取sort属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSort() {
                    return sort;
                }

                /**
                 * 设置sort属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSort(BigInteger value) {
                    this.sort = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="DistributorType" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attribute name="DistributorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
         *                 &lt;attribute name="DistributorTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
        @XmlType(name = "", propOrder = {
            "distributorType"
        })
        public static class DistributorTypes {

            @XmlElement(name = "DistributorType", required = true)
            protected List<ViewershipsType.Viewership.DistributorTypes.DistributorType> distributorType;

            /**
             * Gets the value of the distributorType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the distributorType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getDistributorType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ViewershipsType.Viewership.DistributorTypes.DistributorType }
             * 
             * 
             */
            public List<ViewershipsType.Viewership.DistributorTypes.DistributorType> getDistributorType() {
                if (distributorType == null) {
                    distributorType = new ArrayList<ViewershipsType.Viewership.DistributorTypes.DistributorType>();
                }
                return this.distributorType;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attribute name="DistributorCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
             *       &lt;attribute name="DistributorTypeCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
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
            public static class DistributorType {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "DistributorCode")
                protected String distributorCode;
                @XmlAttribute(name = "DistributorTypeCode")
                protected String distributorTypeCode;

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * 获取distributorCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistributorCode() {
                    return distributorCode;
                }

                /**
                 * 设置distributorCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistributorCode(String value) {
                    this.distributorCode = value;
                }

                /**
                 * 获取distributorTypeCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getDistributorTypeCode() {
                    return distributorTypeCode;
                }

                /**
                 * 设置distributorTypeCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setDistributorTypeCode(String value) {
                    this.distributorTypeCode = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="LocationCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                 &lt;attribute name="StateProvinceCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *                 &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="LocationCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "locationCode"
        })
        public static class LocationCodes {

            @XmlElement(name = "LocationCode", required = true)
            protected List<ViewershipsType.Viewership.LocationCodes.LocationCode> locationCode;
            @XmlAttribute(name = "LocationCodesInclusive")
            protected Boolean locationCodesInclusive;

            /**
             * Gets the value of the locationCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the locationCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getLocationCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ViewershipsType.Viewership.LocationCodes.LocationCode }
             * 
             * 
             */
            public List<ViewershipsType.Viewership.LocationCodes.LocationCode> getLocationCode() {
                if (locationCode == null) {
                    locationCode = new ArrayList<ViewershipsType.Viewership.LocationCodes.LocationCode>();
                }
                return this.locationCode;
            }

            /**
             * 获取locationCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isLocationCodesInclusive() {
                return locationCodesInclusive;
            }

            /**
             * 设置locationCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setLocationCodesInclusive(Boolean value) {
                this.locationCodesInclusive = value;
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
             *       &lt;attribute name="CityCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *       &lt;attribute name="StateProvinceCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
             *       &lt;attribute name="CountryCode" type="{http://www.opentravel.org/OTA/2003/05}ISO3166" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class LocationCode {

                @XmlAttribute(name = "CityCode")
                protected String cityCode;
                @XmlAttribute(name = "StateProvinceCode")
                protected String stateProvinceCode;
                @XmlAttribute(name = "CountryCode")
                protected String countryCode;

                /**
                 * 获取cityCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCityCode() {
                    return cityCode;
                }

                /**
                 * 设置cityCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCityCode(String value) {
                    this.cityCode = value;
                }

                /**
                 * 获取stateProvinceCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getStateProvinceCode() {
                    return stateProvinceCode;
                }

                /**
                 * 设置stateProvinceCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setStateProvinceCode(String value) {
                    this.stateProvinceCode = value;
                }

                /**
                 * 获取countryCode属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getCountryCode() {
                    return countryCode;
                }

                /**
                 * 设置countryCode属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setCountryCode(String value) {
                    this.countryCode = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ProfileRef" type="{http://www.opentravel.org/OTA/2003/05}UniqueID_Type" maxOccurs="unbounded"/>
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
            "profileRef"
        })
        public static class ProfileRefs {

            @XmlElement(name = "ProfileRef", required = true)
            protected List<UniqueIDType> profileRef;

            /**
             * Gets the value of the profileRef property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the profileRef property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProfileRef().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link UniqueIDType }
             * 
             * 
             */
            public List<UniqueIDType> getProfileRef() {
                if (profileRef == null) {
                    profileRef = new ArrayList<UniqueIDType>();
                }
                return this.profileRef;
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
         *         &lt;element name="ProfileType" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
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
            "profileType"
        })
        public static class ProfileTypes {

            @XmlElement(name = "ProfileType", required = true)
            protected List<ViewershipsType.Viewership.ProfileTypes.ProfileType> profileType;

            /**
             * Gets the value of the profileType property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the profileType property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProfileType().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ViewershipsType.Viewership.ProfileTypes.ProfileType }
             * 
             * 
             */
            public List<ViewershipsType.Viewership.ProfileTypes.ProfileType> getProfileType() {
                if (profileType == null) {
                    profileType = new ArrayList<ViewershipsType.Viewership.ProfileTypes.ProfileType>();
                }
                return this.profileType;
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
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ProfileTypeGroup"/>
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ProfileType {

                @XmlAttribute(name = "ProfileType")
                protected String profileType;

                /**
                 * 获取profileType属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getProfileType() {
                    return profileType;
                }

                /**
                 * 设置profileType属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setProfileType(String value) {
                    this.profileType = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="Profile" type="{http://www.opentravel.org/OTA/2003/05}ProfileType" maxOccurs="unbounded"/>
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
            "profile"
        })
        public static class Profiles {

            @XmlElement(name = "Profile", required = true)
            protected List<com.airchina.datacenter.spnr.sdk.entity.ProfileType> profile;

            /**
             * Gets the value of the profile property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the profile property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getProfile().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link com.airchina.datacenter.spnr.sdk.entity.ProfileType }
             * 
             * 
             */
            public List<com.airchina.datacenter.spnr.sdk.entity.ProfileType> getProfile() {
                if (profile == null) {
                    profile = new ArrayList<com.airchina.datacenter.spnr.sdk.entity.ProfileType>();
                }
                return this.profile;
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
         *         &lt;element name="SystemCode" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;simpleContent>
         *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
         *               &lt;/extension>
         *             &lt;/simpleContent>
         *           &lt;/complexType>
         *         &lt;/element>
         *       &lt;/sequence>
         *       &lt;attribute name="SystemCodesInclusive" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "systemCode"
        })
        public static class SystemCodes {

            @XmlElement(name = "SystemCode", required = true)
            protected List<ViewershipsType.Viewership.SystemCodes.SystemCode> systemCode;
            @XmlAttribute(name = "SystemCodesInclusive")
            protected Boolean systemCodesInclusive;

            /**
             * Gets the value of the systemCode property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the systemCode property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getSystemCode().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ViewershipsType.Viewership.SystemCodes.SystemCode }
             * 
             * 
             */
            public List<ViewershipsType.Viewership.SystemCodes.SystemCode> getSystemCode() {
                if (systemCode == null) {
                    systemCode = new ArrayList<ViewershipsType.Viewership.SystemCodes.SystemCode>();
                }
                return this.systemCode;
            }

            /**
             * 获取systemCodesInclusive属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isSystemCodesInclusive() {
                return systemCodesInclusive;
            }

            /**
             * 设置systemCodesInclusive属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setSystemCodesInclusive(Boolean value) {
                this.systemCodesInclusive = value;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;simpleContent>
             *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
             *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DisplayGroup"/>
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
            public static class SystemCode {

                @XmlValue
                protected String value;
                @XmlAttribute(name = "RestrictedDisplayIndicator")
                protected Boolean restrictedDisplayIndicator;
                @XmlAttribute(name = "Sort")
                @XmlSchemaType(name = "nonNegativeInteger")
                protected BigInteger sort;

                /**
                 * 获取value属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link String }
                 *     
                 */
                public String getValue() {
                    return value;
                }

                /**
                 * 设置value属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link String }
                 *     
                 */
                public void setValue(String value) {
                    this.value = value;
                }

                /**
                 * 获取restrictedDisplayIndicator属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link Boolean }
                 *     
                 */
                public Boolean isRestrictedDisplayIndicator() {
                    return restrictedDisplayIndicator;
                }

                /**
                 * 设置restrictedDisplayIndicator属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link Boolean }
                 *     
                 */
                public void setRestrictedDisplayIndicator(Boolean value) {
                    this.restrictedDisplayIndicator = value;
                }

                /**
                 * 获取sort属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link BigInteger }
                 *     
                 */
                public BigInteger getSort() {
                    return sort;
                }

                /**
                 * 设置sort属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link BigInteger }
                 *     
                 */
                public void setSort(BigInteger value) {
                    this.sort = value;
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
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;sequence>
         *         &lt;element name="ViewershipCode" type="{http://www.w3.org/2001/XMLSchema}string"/>
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
            "viewershipCode"
        })
        public static class ViewershipCodes {

            @XmlElement(name = "ViewershipCode", required = true)
            protected String viewershipCode;

            /**
             * 获取viewershipCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getViewershipCode() {
                return viewershipCode;
            }

            /**
             * 设置viewershipCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setViewershipCode(String value) {
                this.viewershipCode = value;
            }

        }

    }

}
