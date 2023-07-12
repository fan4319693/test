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
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * The Vehicle Location Vehicles Type is used to define information on the vehicles that are offered for rental at this facility.
 * 
 * <p>VehicleLocationVehiclesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleLocationVehiclesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehicleInfos" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="VehicleInfo" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
 *                           &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vehicle" maxOccurs="99" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="5" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
 *                 &lt;attribute name="DistancePerFuelUnit" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
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
@XmlType(name = "VehicleLocationVehiclesType", propOrder = {
    "vehicleInfos",
    "vehicle"
})
public class VehicleLocationVehiclesType {

    @XmlElement(name = "VehicleInfos")
    protected VehicleLocationVehiclesType.VehicleInfos vehicleInfos;
    @XmlElement(name = "Vehicle")
    protected List<VehicleLocationVehiclesType.Vehicle> vehicle;

    /**
     * 获取vehicleInfos属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleLocationVehiclesType.VehicleInfos }
     *     
     */
    public VehicleLocationVehiclesType.VehicleInfos getVehicleInfos() {
        return vehicleInfos;
    }

    /**
     * 设置vehicleInfos属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleLocationVehiclesType.VehicleInfos }
     *     
     */
    public void setVehicleInfos(VehicleLocationVehiclesType.VehicleInfos value) {
        this.vehicleInfos = value;
    }

    /**
     * Gets the value of the vehicle property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the vehicle property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getVehicle().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link VehicleLocationVehiclesType.Vehicle }
     * 
     * 
     */
    public List<VehicleLocationVehiclesType.Vehicle> getVehicle() {
        if (vehicle == null) {
            vehicle = new ArrayList<VehicleLocationVehiclesType.Vehicle>();
        }
        return this.vehicle;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleType">
     *       &lt;sequence>
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextType" maxOccurs="5" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="IsConfirmableInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DistanceUnit" type="{http://www.opentravel.org/OTA/2003/05}DistanceUnitNameType" />
     *       &lt;attribute name="DistancePerFuelUnit" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "text"
    })
    public static class Vehicle
        extends VehicleType
    {

        @XmlElement(name = "Text")
        protected List<FormattedTextType> text;
        @XmlAttribute(name = "IsConfirmableInd")
        protected Boolean isConfirmableInd;
        @XmlAttribute(name = "DistanceUnit")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String distanceUnit;
        @XmlAttribute(name = "DistancePerFuelUnit")
        protected Integer distancePerFuelUnit;

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link FormattedTextType }
         * 
         * 
         */
        public List<FormattedTextType> getText() {
            if (text == null) {
                text = new ArrayList<FormattedTextType>();
            }
            return this.text;
        }

        /**
         * 获取isConfirmableInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsConfirmableInd() {
            return isConfirmableInd;
        }

        /**
         * 设置isConfirmableInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsConfirmableInd(Boolean value) {
            this.isConfirmableInd = value;
        }

        /**
         * 获取distanceUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDistanceUnit() {
            return distanceUnit;
        }

        /**
         * 设置distanceUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDistanceUnit(String value) {
            this.distanceUnit = value;
        }

        /**
         * 获取distancePerFuelUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getDistancePerFuelUnit() {
            return distancePerFuelUnit;
        }

        /**
         * 设置distancePerFuelUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setDistancePerFuelUnit(Integer value) {
            this.distancePerFuelUnit = value;
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
     *         &lt;element name="VehicleInfo" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}FormattedTextType">
     *                 &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
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
        "vehicleInfo"
    })
    public static class VehicleInfos {

        @XmlElement(name = "VehicleInfo", required = true)
        protected List<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo> vehicleInfo;

        /**
         * Gets the value of the vehicleInfo property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehicleInfo property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehicleInfo().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleLocationVehiclesType.VehicleInfos.VehicleInfo }
         * 
         * 
         */
        public List<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo> getVehicleInfo() {
            if (vehicleInfo == null) {
                vehicleInfo = new ArrayList<VehicleLocationVehiclesType.VehicleInfos.VehicleInfo>();
            }
            return this.vehicleInfo;
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
         *       &lt;attribute name="Type" use="required" type="{http://www.opentravel.org/OTA/2003/05}LocationDetailVehicleInfoType" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class VehicleInfo
            extends FormattedTextType
        {

            @XmlAttribute(name = "Type", required = true)
            protected LocationDetailVehicleInfoType type;

            /**
             * 获取type属性的值。
             * 
             * @return
             *     possible object is
             *     {@link LocationDetailVehicleInfoType }
             *     
             */
            public LocationDetailVehicleInfoType getType() {
                return type;
            }

            /**
             * 设置type属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link LocationDetailVehicleInfoType }
             *     
             */
            public void setType(LocationDetailVehicleInfoType value) {
                this.type = value;
            }

        }

    }

}
