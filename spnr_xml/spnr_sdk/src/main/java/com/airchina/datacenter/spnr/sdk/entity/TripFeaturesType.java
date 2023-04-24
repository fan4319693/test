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
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Information about the traveler(s) journey that is necessary for quoting/booking the insurance.
 * 
 * <p>TripFeaturesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="TripFeaturesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Destinations" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Destination" maxOccurs="99">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AreaID_Group"/>
 *                           &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                           &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                         &lt;/extension>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Activities" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Activity" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" maxOccurs="99"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Operators" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Operator" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="99"/>
 *                 &lt;/sequence>
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
@XmlType(name = "TripFeaturesType", propOrder = {
    "destinations",
    "activities",
    "operators"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.InsCoverageDetailType.CoveredTrips.CoveredTrip.class
})
public class TripFeaturesType {

    @XmlElement(name = "Destinations")
    protected TripFeaturesType.Destinations destinations;
    @XmlElement(name = "Activities")
    protected TripFeaturesType.Activities activities;
    @XmlElement(name = "Operators")
    protected TripFeaturesType.Operators operators;

    /**
     * 获取destinations属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TripFeaturesType.Destinations }
     *     
     */
    public TripFeaturesType.Destinations getDestinations() {
        return destinations;
    }

    /**
     * 设置destinations属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TripFeaturesType.Destinations }
     *     
     */
    public void setDestinations(TripFeaturesType.Destinations value) {
        this.destinations = value;
    }

    /**
     * 获取activities属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TripFeaturesType.Activities }
     *     
     */
    public TripFeaturesType.Activities getActivities() {
        return activities;
    }

    /**
     * 设置activities属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TripFeaturesType.Activities }
     *     
     */
    public void setActivities(TripFeaturesType.Activities value) {
        this.activities = value;
    }

    /**
     * 获取operators属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TripFeaturesType.Operators }
     *     
     */
    public TripFeaturesType.Operators getOperators() {
        return operators;
    }

    /**
     * 设置operators属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TripFeaturesType.Operators }
     *     
     */
    public void setOperators(TripFeaturesType.Operators value) {
        this.operators = value;
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
     *         &lt;element name="Activity" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" maxOccurs="99"/>
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
        "activity"
    })
    public static class Activities {

        @XmlElement(name = "Activity", required = true)
        protected List<String> activity;

        /**
         * Gets the value of the activity property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the activity property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getActivity().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getActivity() {
            if (activity == null) {
                activity = new ArrayList<String>();
            }
            return this.activity;
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
     *         &lt;element name="Destination" maxOccurs="99">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AreaID_Group"/>
     *                 &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" />
     *                 &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
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
        "destination"
    })
    public static class Destinations {

        @XmlElement(name = "Destination", required = true)
        protected List<TripFeaturesType.Destinations.Destination> destination;

        /**
         * Gets the value of the destination property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the destination property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDestination().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TripFeaturesType.Destinations.Destination }
         * 
         * 
         */
        public List<TripFeaturesType.Destinations.Destination> getDestination() {
            if (destination == null) {
                destination = new ArrayList<TripFeaturesType.Destinations.Destination>();
            }
            return this.destination;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}AddressType">
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AreaID_Group"/>
         *       &lt;attribute name="ArrivalDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *       &lt;attribute name="DepartureDate" type="{http://www.w3.org/2001/XMLSchema}date" />
         *     &lt;/extension>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Destination
            extends AddressType
        {

            @XmlAttribute(name = "ArrivalDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar arrivalDate;
            @XmlAttribute(name = "DepartureDate")
            @XmlSchemaType(name = "date")
            protected XMLGregorianCalendar departureDate;
            @XmlAttribute(name = "AreaID")
            protected String areaID;

            /**
             * 获取arrivalDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getArrivalDate() {
                return arrivalDate;
            }

            /**
             * 设置arrivalDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setArrivalDate(XMLGregorianCalendar value) {
                this.arrivalDate = value;
            }

            /**
             * 获取departureDate属性的值。
             * 
             * @return
             *     possible object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public XMLGregorianCalendar getDepartureDate() {
                return departureDate;
            }

            /**
             * 设置departureDate属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link XMLGregorianCalendar }
             *     
             */
            public void setDepartureDate(XMLGregorianCalendar value) {
                this.departureDate = value;
            }

            /**
             * 获取areaID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getAreaID() {
                return areaID;
            }

            /**
             * 设置areaID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setAreaID(String value) {
                this.areaID = value;
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
     *         &lt;element name="Operator" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" maxOccurs="99"/>
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
        "operator"
    })
    public static class Operators {

        @XmlElement(name = "Operator", required = true)
        protected List<CompanyNameType> operator;

        /**
         * Gets the value of the operator property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the operator property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOperator().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link CompanyNameType }
         * 
         * 
         */
        public List<CompanyNameType> getOperator() {
            if (operator == null) {
                operator = new ArrayList<CompanyNameType>();
            }
            return this.operator;
        }

    }

}
