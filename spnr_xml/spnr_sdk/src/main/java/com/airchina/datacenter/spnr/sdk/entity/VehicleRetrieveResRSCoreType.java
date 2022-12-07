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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * The VehicleRetrieveResRSCoreType complex type identifies the core, or common, information that is associated with a retrieved reservation, or a list of reservations when one exact match could not be identified. 
 * 
 * <p>VehicleRetrieveResRSCoreType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehicleRetrieveResRSCoreType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;choice>
 *           &lt;element name="VehReservation" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationType"/>
 *           &lt;element name="VehResSummaries">
 *             &lt;complexType>
 *               &lt;complexContent>
 *                 &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                   &lt;sequence>
 *                     &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="99"/>
 *                   &lt;/sequence>
 *                 &lt;/restriction>
 *               &lt;/complexContent>
 *             &lt;/complexType>
 *           &lt;/element>
 *         &lt;/choice>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehicleRetrieveResRSCoreType", propOrder = {
    "vehReservation",
    "vehResSummaries"
})
public class VehicleRetrieveResRSCoreType {

    @XmlElement(name = "VehReservation")
    protected VehicleReservationType vehReservation;
    @XmlElement(name = "VehResSummaries")
    protected VehicleRetrieveResRSCoreType.VehResSummaries vehResSummaries;

    /**
     * 获取vehReservation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleReservationType }
     *     
     */
    public VehicleReservationType getVehReservation() {
        return vehReservation;
    }

    /**
     * 设置vehReservation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleReservationType }
     *     
     */
    public void setVehReservation(VehicleReservationType value) {
        this.vehReservation = value;
    }

    /**
     * 获取vehResSummaries属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRetrieveResRSCoreType.VehResSummaries }
     *     
     */
    public VehicleRetrieveResRSCoreType.VehResSummaries getVehResSummaries() {
        return vehResSummaries;
    }

    /**
     * 设置vehResSummaries属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRetrieveResRSCoreType.VehResSummaries }
     *     
     */
    public void setVehResSummaries(VehicleRetrieveResRSCoreType.VehResSummaries value) {
        this.vehResSummaries = value;
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
     *         &lt;element name="VehResSummary" type="{http://www.opentravel.org/OTA/2003/05}VehicleReservationSummaryType" maxOccurs="99"/>
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
        "vehResSummary"
    })
    public static class VehResSummaries {

        @XmlElement(name = "VehResSummary", required = true)
        protected List<VehicleReservationSummaryType> vehResSummary;

        /**
         * Gets the value of the vehResSummary property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the vehResSummary property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getVehResSummary().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link VehicleReservationSummaryType }
         * 
         * 
         */
        public List<VehicleReservationSummaryType> getVehResSummary() {
            if (vehResSummary == null) {
                vehResSummary = new ArrayList<VehicleReservationSummaryType>();
            }
            return this.vehResSummary;
        }

    }

}
