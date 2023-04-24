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
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleLocationAdditionalDetailsType complex type defines the supplemental information that describes a vehicle rental facility. Such information may include the  operation schedules and services offered.
 * 
 * <p>VehicleLocationAdditionalDetailsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationAdditionalDetailsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehRentLocInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehRentLocInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleLocationInformationType">
 *                           &lt;sequence>
 *                             &lt;element name="Keywords" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;sequence>
 *                                       &lt;element name="Keyword" maxOccurs="30">
 *                                         &lt;complexType>
 *                                           &lt;complexContent>
 *                                             &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *                                               &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *                                               &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
 *                                               &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
 *                                               &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
 *                                             &lt;/extension>
 *                                           &lt;/complexContent>
 *                                         &lt;/complexType>
 *                                       &lt;/element>
 *                                     &lt;/sequence>
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ParkLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="CounterLocation" type="{http://www.opentravel.org/OTA/2003/05}VehicleWhereAtFacilityType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *         &lt;element name="Shuttle" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="ShuttleInfos" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="ShuttleInfo" maxOccurs="99">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                                     &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
 *                                   &lt;/extension>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OneWayDropLocations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="OneWayDropLocation" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
 *                           &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TPA_Extensions" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleLocationAdditionalDetailsType", propOrder = {
    "vehRentLocInfos",
    "parkLocation",
    "counterLocation",
    "operationSchedules",
    "shuttle",
    "oneWayDropLocations",
    "tpaExtensions"
})
public class VehicleLocationAdditionalDetailsType {

    @XmlElement(name = "VehRentLocInfos")
    protected VehicleLocationAdditionalDetailsType.VehRentLocInfos vehRentLocInfos;
    @XmlElement(name = "ParkLocation")
    protected VehicleWhereAtFacilityType parkLocation;
    @XmlElement(name = "CounterLocation")
    protected VehicleWhereAtFacilityType counterLocation;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesType operationSchedules;
    @XmlElement(name = "Shuttle")
    protected VehicleLocationAdditionalDetailsType.Shuttle shuttle;
    @XmlElement(name = "OneWayDropLocations")
    protected VehicleLocationAdditionalDetailsType.OneWayDropLocations oneWayDropLocations;
    @XmlElement(name = "TPA_Extensions")
    protected TPAExtensionsType tpaExtensions;

    /**
     * 获取vehRentLocInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     *     
     */
    public VehicleLocationAdditionalDetailsType.VehRentLocInfos getVehRentLocInfos() {
        return vehRentLocInfos;
    }

    /**
     * 设置vehRentLocInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos }
     *     
     */
    public void setVehRentLocInfos(VehicleLocationAdditionalDetailsType.VehRentLocInfos value) {
        this.vehRentLocInfos = value;
    }

    /**
     * 获取parkLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getParkLocation() {
        return parkLocation;
    }

    /**
     * 设置parkLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setParkLocation(VehicleWhereAtFacilityType value) {
        this.parkLocation = value;
    }

    /**
     * 获取counterLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public VehicleWhereAtFacilityType getCounterLocation() {
        return counterLocation;
    }

    /**
     * 设置counterLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleWhereAtFacilityType }
     *     
     */
    public void setCounterLocation(VehicleWhereAtFacilityType value) {
        this.counterLocation = value;
    }

    /**
     * 获取operationSchedules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesType }
     *     
     */
    public OperationSchedulesType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * 设置operationSchedules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesType value) {
        this.operationSchedules = value;
    }

    /**
     * 获取shuttle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public VehicleLocationAdditionalDetailsType.Shuttle getShuttle() {
        return shuttle;
    }

    /**
     * 设置shuttle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.Shuttle }
     *     
     */
    public void setShuttle(VehicleLocationAdditionalDetailsType.Shuttle value) {
        this.shuttle = value;
    }

    /**
     * 获取oneWayDropLocations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     *     
     */
    public VehicleLocationAdditionalDetailsType.OneWayDropLocations getOneWayDropLocations() {
        return oneWayDropLocations;
    }

    /**
     * 设置oneWayDropLocations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations }
     *     
     */
    public void setOneWayDropLocations(VehicleLocationAdditionalDetailsType.OneWayDropLocations value) {
        this.oneWayDropLocations = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="OneWayDropLocation" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
     *                 &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
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
        "oneWayDropLocation"
    })
    public static class OneWayDropLocations {

        @XmlElement(name = "OneWayDropLocation", required = true)
        protected List<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation> oneWayDropLocation;

        /**
         * Gets the value of the oneWayDropLocation property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the oneWayDropLocation property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOneWayDropLocation().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation }
         * 
         * 
         */
        public List<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation> getOneWayDropLocation() {
            if (oneWayDropLocation == null) {
                oneWayDropLocation = new ArrayList<VehicleLocationAdditionalDetailsType.OneWayDropLocations.OneWayDropLocation>();
            }
            return this.oneWayDropLocation;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>LocationType">
         *       &lt;attribute name="ExtendedLocationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class OneWayDropLocation
            extends LocationType
        {

            @XmlAttribute(name = "ExtendedLocationCode")
            protected String extendedLocationCode;

            /**
             * 获取extendedLocationCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExtendedLocationCode() {
                return extendedLocationCode;
            }

            /**
             * 设置extendedLocationCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExtendedLocationCode(String value) {
                this.extendedLocationCode = value;
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
     *         &lt;element name="ShuttleInfos" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="ShuttleInfo" maxOccurs="99">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
     *                         &lt;/extension>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesType" minOccurs="0"/>
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
        "shuttleInfos",
        "operationSchedules"
    })
    public static class Shuttle {

        @XmlElement(name = "ShuttleInfos")
        protected VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos shuttleInfos;
        @XmlElement(name = "OperationSchedules")
        protected OperationSchedulesType operationSchedules;

        /**
         * 获取shuttleInfos属性的值。
         * 
         * @return
         *     possible object is
         *     {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
         *     
         */
        public VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos getShuttleInfos() {
            return shuttleInfos;
        }

        /**
         * 设置shuttleInfos属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos }
         *     
         */
        public void setShuttleInfos(VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos value) {
            this.shuttleInfos = value;
        }

        /**
         * 获取operationSchedules属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OperationSchedulesType }
         *     
         */
        public OperationSchedulesType getOperationSchedules() {
            return operationSchedules;
        }

        /**
         * 设置operationSchedules属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OperationSchedulesType }
         *     
         */
        public void setOperationSchedules(OperationSchedulesType value) {
            this.operationSchedules = value;
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
         *         &lt;element name="ShuttleInfo" maxOccurs="99">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
         *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
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
        @XmlType(name = "", propOrder = {
            "shuttleInfo"
        })
        public static class ShuttleInfos {

            @XmlElement(name = "ShuttleInfo", required = true)
            protected List<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo> shuttleInfo;

            /**
             * Gets the value of the shuttleInfo property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the shuttleInfo property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getShuttleInfo().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo }
             * 
             * 
             */
            public List<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo> getShuttleInfo() {
                if (shuttleInfo == null) {
                    shuttleInfo = new ArrayList<VehicleLocationAdditionalDetailsType.Shuttle.ShuttleInfos.ShuttleInfo>();
                }
                return this.shuttleInfo;
            }


            /**
             * <p>anonymous complex type的 Java 类。
             * 
             * <p>以下模式片段指定包含在此类中的预期内容。
             * 
             * <pre>
             * &lt;complexType>
             *   &lt;complexContent>
             *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
             *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailShuttleInfoType" />
             *     &lt;/extension>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class ShuttleInfo
                extends FormattedTextType
            {

                @XmlAttribute(name = "Type", required = true)
                protected LocationDetailShuttleInfoType type;

                /**
                 * 获取type属性的值。
                 * 
                 * @return
                 *     possible object is
                 *     {@link LocationDetailShuttleInfoType }
                 *     
                 */
                public LocationDetailShuttleInfoType getType() {
                    return type;
                }

                /**
                 * 设置type属性的值。
                 * 
                 * @param value
                 *     allowed object is
                 *     {@link LocationDetailShuttleInfoType }
                 *     
                 */
                public void setType(LocationDetailShuttleInfoType value) {
                    this.type = value;
                }

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
     *         &lt;element name="VehRentLocInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleLocationInformationType">
     *                 &lt;sequence>
     *                   &lt;element name="Keywords" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;sequence>
     *                             &lt;element name="Keyword" maxOccurs="30">
     *                               &lt;complexType>
     *                                 &lt;complexContent>
     *                                   &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
     *                                     &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
     *                                     &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
     *                                     &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
     *                                     &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
     *                                   &lt;/extension>
     *                                 &lt;/complexContent>
     *                               &lt;/complexType>
     *                             &lt;/element>
     *                           &lt;/sequence>
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
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
    @XmlType(name = "", propOrder = {
        "vehRentLocInfo"
    })
    public static class VehRentLocInfos {

        @XmlElement(name = "VehRentLocInfo", required = true)
        protected List<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo> vehRentLocInfo;

        /**
         * Gets the value of the vehRentLocInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehRentLocInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehRentLocInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo }
         * 
         * 
         */
        public List<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo> getVehRentLocInfo() {
            if (vehRentLocInfo == null) {
                vehRentLocInfo = new ArrayList<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo>();
            }
            return this.vehRentLocInfo;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleLocationInformationType">
         *       &lt;sequence>
         *         &lt;element name="Keywords" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;sequence>
         *                   &lt;element name="Keyword" maxOccurs="30">
         *                     &lt;complexType>
         *                       &lt;complexContent>
         *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
         *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
         *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
         *                           &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
         *                           &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
         *                         &lt;/extension>
         *                       &lt;/complexContent>
         *                     &lt;/complexType>
         *                   &lt;/element>
         *                 &lt;/sequence>
         *               &lt;/restriction>
         *             &lt;/complexContent>
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
            "keywords"
        })
        public static class VehRentLocInfo
            extends VehicleLocationInformationType
        {

            @XmlElement(name = "Keywords")
            protected VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords keywords;

            /**
             * 获取keywords属性的值。
             * 
             * @return
             *     possible object is
             *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords }
             *     
             */
            public VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords getKeywords() {
                return keywords;
            }

            /**
             * 设置keywords属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords }
             *     
             */
            public void setKeywords(VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords value) {
                this.keywords = value;
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
             *         &lt;element name="Keyword" maxOccurs="30">
             *           &lt;complexType>
             *             &lt;complexContent>
             *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
             *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
             *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
             *                 &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
             *                 &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
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
            @XmlType(name = "", propOrder = {
                "keyword"
            })
            public static class Keywords {

                @XmlElement(name = "Keyword", required = true)
                protected List<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword> keyword;

                /**
                 * Gets the value of the keyword property.
                 * 
                 * <p>
                 * This accessor method returns a reference to the live list,
                 * not a snapshot. Therefore any modification you make to the
                 * returned list will be present inside the JAXB object.
                 * This is why there is not a <CODE>set</CODE> method for the keyword property.
                 * 
                 * <p>
                 * For example, to add a new item, do as follows:
                 * <pre>
                 *    getKeyword().add(newItem);
                 * </pre>
                 * 
                 * 
                 * <p>
                 * Objects of the following type(s) are allowed in the list
                 * {@link VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword }
                 * 
                 * 
                 */
                public List<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword> getKeyword() {
                    if (keyword == null) {
                        keyword = new ArrayList<VehicleLocationAdditionalDetailsType.VehRentLocInfos.VehRentLocInfo.Keywords.Keyword>();
                    }
                    return this.keyword;
                }


                /**
                 * <p>anonymous complex type的 Java 类。
                 * 
                 * <p>以下模式片段指定包含在此类中的预期内容。
                 * 
                 * <pre>
                 * &lt;complexType>
                 *   &lt;complexContent>
                 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
                 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
                 *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}AlphaNumericStringLength1to8" />
                 *       &lt;attribute name="PolicyNumber" type="{http://www.opentravel.org/OTA/2003/05}NumericStringLength1to8" />
                 *       &lt;attribute name="Action" type="{http://www.opentravel.org/OTA/2003/05}ActionType" />
                 *     &lt;/extension>
                 *   &lt;/complexContent>
                 * &lt;/complexType>
                 * </pre>
                 * 
                 * 
                 */
                @XmlAccessorType(XmlAccessType.FIELD)
                @XmlType(name = "")
                public static class Keyword
                    extends ParagraphType
                {

                    @XmlAttribute(name = "Code")
                    protected String code;
                    @XmlAttribute(name = "PolicyNumber")
                    protected String policyNumber;
                    @XmlAttribute(name = "Action")
                    protected ActionType action;
                    @XmlAttribute(name = "Start")
                    protected String start;
                    @XmlAttribute(name = "Duration")
                    protected BigInteger duration;
                    @XmlAttribute(name = "End")
                    protected String end;
                    @XmlAttribute(name = "RangeNum")
                    protected BigInteger rangeNum;
                    @XmlAttribute(name = "SearchTimeZone")
                    protected String searchTimeZone;

                    /**
                     * 获取code属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getCode() {
                        return code;
                    }

                    /**
                     * 设置code属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setCode(String value) {
                        this.code = value;
                    }

                    /**
                     * 获取policyNumber属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getPolicyNumber() {
                        return policyNumber;
                    }

                    /**
                     * 设置policyNumber属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setPolicyNumber(String value) {
                        this.policyNumber = value;
                    }

                    /**
                     * 获取action属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link ActionType }
                     *     
                     */
                    public ActionType getAction() {
                        return action;
                    }

                    /**
                     * 设置action属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link ActionType }
                     *     
                     */
                    public void setAction(ActionType value) {
                        this.action = value;
                    }

                    /**
                     * 获取start属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getStart() {
                        return start;
                    }

                    /**
                     * 设置start属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setStart(String value) {
                        this.start = value;
                    }

                    /**
                     * 获取duration属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getDuration() {
                        return duration;
                    }

                    /**
                     * 设置duration属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setDuration(BigInteger value) {
                        this.duration = value;
                    }

                    /**
                     * 获取end属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getEnd() {
                        return end;
                    }

                    /**
                     * 设置end属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setEnd(String value) {
                        this.end = value;
                    }

                    /**
                     * 获取rangeNum属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link BigInteger }
                     *     
                     */
                    public BigInteger getRangeNum() {
                        return rangeNum;
                    }

                    /**
                     * 设置rangeNum属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link BigInteger }
                     *     
                     */
                    public void setRangeNum(BigInteger value) {
                        this.rangeNum = value;
                    }

                    /**
                     * 获取searchTimeZone属性的值。
                     * 
                     * @return
                     *     possible object is
                     *     {@link String }
                     *     
                     */
                    public String getSearchTimeZone() {
                        return searchTimeZone;
                    }

                    /**
                     * 设置searchTimeZone属性的值。
                     * 
                     * @param value
                     *     allowed object is
                     *     {@link String }
                     *     
                     */
                    public void setSearchTimeZone(String value) {
                        this.searchTimeZone = value;
                    }

                }

            }

        }

    }

}
