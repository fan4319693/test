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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * Unique ID for a Collection of Offers from a Prior Shopping Response Message.
 * 
 * <p>ShoppingResponseIDsType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ShoppingResponseIDsType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ShoppingResponseID"/>
 *         &lt;element name="AssociatedIDs" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;choice>
 *                     &lt;element name="OfferGroup">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID"/>
 *                               &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                     &lt;element name="ServiceGroup">
 *                       &lt;complexType>
 *                         &lt;complexContent>
 *                           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                             &lt;sequence>
 *                               &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
 *                             &lt;/sequence>
 *                           &lt;/restriction>
 *                         &lt;/complexContent>
 *                       &lt;/complexType>
 *                     &lt;/element>
 *                   &lt;/choice>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
@XmlType(name = "ShoppingResponseIDsType", propOrder = {
    "shoppingResponseID",
    "associatedIDs"
})
public class ShoppingResponseIDsType {

    @XmlElement(name = "ShoppingResponseID", required = true)
    protected ShoppingResponseIDType shoppingResponseID;
    @XmlElement(name = "AssociatedIDs")
    protected ShoppingResponseIDsType.AssociatedIDs associatedIDs;

    /**
     * Unique offer collection shopping response ID.
     * 						Example: DAB57296-99AA-4C88-B2D5-49CC7FA9EA1B
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public ShoppingResponseIDType getShoppingResponseID() {
        return shoppingResponseID;
    }

    /**
     * 设置shoppingResponseID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDType }
     *     
     */
    public void setShoppingResponseID(ShoppingResponseIDType value) {
        this.shoppingResponseID = value;
    }

    /**
     * 获取associatedIDs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ShoppingResponseIDsType.AssociatedIDs }
     *     
     */
    public ShoppingResponseIDsType.AssociatedIDs getAssociatedIDs() {
        return associatedIDs;
    }

    /**
     * 设置associatedIDs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ShoppingResponseIDsType.AssociatedIDs }
     *     
     */
    public void setAssociatedIDs(ShoppingResponseIDsType.AssociatedIDs value) {
        this.associatedIDs = value;
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
     *         &lt;choice>
     *           &lt;element name="OfferGroup">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID"/>
     *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *           &lt;element name="ServiceGroup">
     *             &lt;complexType>
     *               &lt;complexContent>
     *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                   &lt;sequence>
     *                     &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
     *                   &lt;/sequence>
     *                 &lt;/restriction>
     *               &lt;/complexContent>
     *             &lt;/complexType>
     *           &lt;/element>
     *         &lt;/choice>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded" minOccurs="0"/>
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
        "offerGroup",
        "serviceGroup",
        "travelerIDRef",
        "segmentIDRef"
    })
    public static class AssociatedIDs {

        @XmlElement(name = "OfferGroup")
        protected ShoppingResponseIDsType.AssociatedIDs.OfferGroup offerGroup;
        @XmlElement(name = "ServiceGroup")
        protected ShoppingResponseIDsType.AssociatedIDs.ServiceGroup serviceGroup;
        @XmlElement(name = "TravelerIDRef")
        protected List<TravelerIDRefType> travelerIDRef;
        @XmlElement(name = "SegmentIDRef")
        protected List<SegmentIDRefType> segmentIDRef;

        /**
         * 获取offerGroup属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseIDsType.AssociatedIDs.OfferGroup }
         *     
         */
        public ShoppingResponseIDsType.AssociatedIDs.OfferGroup getOfferGroup() {
            return offerGroup;
        }

        /**
         * 设置offerGroup属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseIDsType.AssociatedIDs.OfferGroup }
         *     
         */
        public void setOfferGroup(ShoppingResponseIDsType.AssociatedIDs.OfferGroup value) {
            this.offerGroup = value;
        }

        /**
         * 获取serviceGroup属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ShoppingResponseIDsType.AssociatedIDs.ServiceGroup }
         *     
         */
        public ShoppingResponseIDsType.AssociatedIDs.ServiceGroup getServiceGroup() {
            return serviceGroup;
        }

        /**
         * 设置serviceGroup属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ShoppingResponseIDsType.AssociatedIDs.ServiceGroup }
         *     
         */
        public void setServiceGroup(ShoppingResponseIDsType.AssociatedIDs.ServiceGroup value) {
            this.serviceGroup = value;
        }

        /**
         * Gets the value of the travelerIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getTravelerIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link TravelerIDRefType }
         * 
         * 
         */
        public List<TravelerIDRefType> getTravelerIDRef() {
            if (travelerIDRef == null) {
                travelerIDRef = new ArrayList<TravelerIDRefType>();
            }
            return this.travelerIDRef;
        }

        /**
         * Gets the value of the segmentIDRef property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSegmentIDRef().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link SegmentIDRefType }
         * 
         * 
         */
        public List<SegmentIDRefType> getSegmentIDRef() {
            if (segmentIDRef == null) {
                segmentIDRef = new ArrayList<SegmentIDRefType>();
            }
            return this.segmentIDRef;
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
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}OfferID"/>
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
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
            "offerID",
            "serviceID"
        })
        public static class OfferGroup {

            @XmlElement(name = "OfferID", required = true)
            protected OfferID offerID;
            @XmlElement(name = "ServiceID")
            protected List<ServiceID> serviceID;

            /**
             * Unique Offer ID.
             * 													Example: OFFER986-69F0-4154-B944-C1646C311569
             * 
             * 													=notes=
             * 													1. This is a unique ID provided by the airline that may include Branded Fare(s); Ancillary Services(s); and/ or Ancillary Service Bundle(s).
             * 
             * @return
             *     possible object is
             *     {@link OfferID }
             *     
             */
            public OfferID getOfferID() {
                return offerID;
            }

            /**
             * 设置offerID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link OfferID }
             *     
             */
            public void setOfferID(OfferID value) {
                this.offerID = value;
            }

            /**
             * Unique product/ service IDs associated with Offer ID.
             * 													Example: SRVCA3FE-4528-4F81-AE4E-C27A5A9B2FF5
             * 
             * 													=notes=
             * 													1. This is a unique ID provided by the airline for an ancillary product or service that may be part of an Ancillary Service Bundle.Gets the value of the serviceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceID }
             * 
             * 
             */
            public List<ServiceID> getServiceID() {
                if (serviceID == null) {
                    serviceID = new ArrayList<ServiceID>();
                }
                return this.serviceID;
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
         *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}ServiceID" maxOccurs="unbounded" minOccurs="0"/>
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
            "serviceID"
        })
        public static class ServiceGroup {

            @XmlElement(name = "ServiceID")
            protected List<ServiceID> serviceID;

            /**
             * Unique product/ service identifier.
             * 													Example: SRVCA3FE-4528-4F81-AE4E-C27A5A9B2FF5
             * 
             * 													=notes=
             * 													1. This is a unique ID provided by the airline for an ancillary product or service that may be part of an Ancillary Service Bundle.Gets the value of the serviceID property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the serviceID property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getServiceID().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link ServiceID }
             * 
             * 
             */
            public List<ServiceID> getServiceID() {
                if (serviceID == null) {
                    serviceID = new ArrayList<ServiceID>();
                }
                return this.serviceID;
            }

        }

    }

}
