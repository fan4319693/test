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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Needs of the traveler related to travel experiences.
 * 
 * <p>PreferencesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="PreferencesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="PrefCollection" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *                 &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "PreferencesType", propOrder = {
    "prefCollection"
})
public class PreferencesType {

    @XmlElement(name = "PrefCollection", required = true)
    protected List<PreferencesType.PrefCollection> prefCollection;
    @XmlAttribute(name = "ShareSynchInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareSynchInd;
    @XmlAttribute(name = "ShareMarketInd")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shareMarketInd;

    /**
     * Gets the value of the prefCollection property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the prefCollection property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrefCollection().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link PreferencesType.PrefCollection }
     * 
     * 
     */
    public List<PreferencesType.PrefCollection> getPrefCollection() {
        if (prefCollection == null) {
            prefCollection = new ArrayList<PreferencesType.PrefCollection>();
        }
        return this.prefCollection;
    }

    /**
     * 获取shareSynchInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareSynchInd() {
        return shareSynchInd;
    }

    /**
     * 设置shareSynchInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareSynchInd(String value) {
        this.shareSynchInd = value;
    }

    /**
     * 获取shareMarketInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShareMarketInd() {
        return shareMarketInd;
    }

    /**
     * 设置shareMarketInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShareMarketInd(String value) {
        this.shareMarketInd = value;
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
     *         &lt;element name="CommonPref" type="{http://www.opentravel.org/OTA/2003/05}CommonPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="VehicleRentalPref" type="{http://www.opentravel.org/OTA/2003/05}VehicleProfileRentalPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="AirlinePref" type="{http://www.opentravel.org/OTA/2003/05}AirlinePrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="HotelPref" type="{http://www.opentravel.org/OTA/2003/05}HotelPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OtherSrvcPref" type="{http://www.opentravel.org/OTA/2003/05}OtherSrvcPrefType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}PrivacyGroup"/>
     *       &lt;attribute name="TravelPurpose" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "commonPref",
        "vehicleRentalPref",
        "airlinePref",
        "hotelPref",
        "otherSrvcPref",
        "tpaExtensions"
    })
    public static class PrefCollection {

        @XmlElement(name = "CommonPref")
        protected List<CommonPrefType> commonPref;
        @XmlElement(name = "VehicleRentalPref")
        protected List<VehicleProfileRentalPrefType> vehicleRentalPref;
        @XmlElement(name = "AirlinePref")
        protected List<AirlinePrefType> airlinePref;
        @XmlElement(name = "HotelPref")
        protected List<HotelPrefType> hotelPref;
        @XmlElement(name = "OtherSrvcPref")
        protected List<OtherSrvcPrefType> otherSrvcPref;
        @XmlElement(name = "TPA_Extensions")
        protected TPAExtensionsType tpaExtensions;
        @XmlAttribute(name = "TravelPurpose")
        protected String travelPurpose;
        @XmlAttribute(name = "ShareSynchInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareSynchInd;
        @XmlAttribute(name = "ShareMarketInd")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String shareMarketInd;

        /**
         * Gets the value of the commonPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the commonPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCommonPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CommonPrefType }
         * 
         * 
         */
        public List<CommonPrefType> getCommonPref() {
            if (commonPref == null) {
                commonPref = new ArrayList<CommonPrefType>();
            }
            return this.commonPref;
        }

        /**
         * Gets the value of the vehicleRentalPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleRentalPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleRentalPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleProfileRentalPrefType }
         * 
         * 
         */
        public List<VehicleProfileRentalPrefType> getVehicleRentalPref() {
            if (vehicleRentalPref == null) {
                vehicleRentalPref = new ArrayList<VehicleProfileRentalPrefType>();
            }
            return this.vehicleRentalPref;
        }

        /**
         * Gets the value of the airlinePref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the airlinePref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getAirlinePref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link AirlinePrefType }
         * 
         * 
         */
        public List<AirlinePrefType> getAirlinePref() {
            if (airlinePref == null) {
                airlinePref = new ArrayList<AirlinePrefType>();
            }
            return this.airlinePref;
        }

        /**
         * Gets the value of the hotelPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the hotelPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getHotelPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link HotelPrefType }
         * 
         * 
         */
        public List<HotelPrefType> getHotelPref() {
            if (hotelPref == null) {
                hotelPref = new ArrayList<HotelPrefType>();
            }
            return this.hotelPref;
        }

        /**
         * Gets the value of the otherSrvcPref property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the otherSrvcPref property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOtherSrvcPref().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link OtherSrvcPrefType }
         * 
         * 
         */
        public List<OtherSrvcPrefType> getOtherSrvcPref() {
            if (otherSrvcPref == null) {
                otherSrvcPref = new ArrayList<OtherSrvcPrefType>();
            }
            return this.otherSrvcPref;
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
         * 获取travelPurpose属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTravelPurpose() {
            return travelPurpose;
        }

        /**
         * 设置travelPurpose属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTravelPurpose(String value) {
            this.travelPurpose = value;
        }

        /**
         * 获取shareSynchInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareSynchInd() {
            return shareSynchInd;
        }

        /**
         * 设置shareSynchInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareSynchInd(String value) {
            this.shareSynchInd = value;
        }

        /**
         * 获取shareMarketInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getShareMarketInd() {
            return shareMarketInd;
        }

        /**
         * 设置shareMarketInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setShareMarketInd(String value) {
            this.shareMarketInd = value;
        }

    }

}
