//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>VehAvailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="VehAvailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="VehAvailCore">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
 *                 &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Vendor" type="{http://www.opentravel.org/OTA/2003/05}CompanyNameType" minOccurs="0"/>
 *         &lt;element name="VehRentalCore" type="{http://www.opentravel.org/OTA/2003/05}VehicleRentalCoreType"/>
 *         &lt;element name="VehAvailInfo" type="{http://www.opentravel.org/OTA/2003/05}VehicleAvailAdditionalInfoType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "VehAvailType", propOrder = {
    "vehAvailCore",
    "vendor",
    "vehRentalCore",
    "vehAvailInfo"
})
public class VehAvailType {

    @XmlElement(name = "VehAvailCore", required = true)
    protected VehAvailType.VehAvailCore vehAvailCore;
    @XmlElement(name = "Vendor")
    protected CompanyNameType vendor;
    @XmlElement(name = "VehRentalCore", required = true)
    protected VehicleRentalCoreType vehRentalCore;
    @XmlElement(name = "VehAvailInfo")
    protected VehicleAvailAdditionalInfoType vehAvailInfo;

    /**
     * 获取vehAvailCore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehAvailType.VehAvailCore }
     *     
     */
    public VehAvailType.VehAvailCore getVehAvailCore() {
        return vehAvailCore;
    }

    /**
     * 设置vehAvailCore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehAvailType.VehAvailCore }
     *     
     */
    public void setVehAvailCore(VehAvailType.VehAvailCore value) {
        this.vehAvailCore = value;
    }

    /**
     * 获取vendor属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CompanyNameType }
     *     
     */
    public CompanyNameType getVendor() {
        return vendor;
    }

    /**
     * 设置vendor属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CompanyNameType }
     *     
     */
    public void setVendor(CompanyNameType value) {
        this.vendor = value;
    }

    /**
     * 获取vehRentalCore属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public VehicleRentalCoreType getVehRentalCore() {
        return vehRentalCore;
    }

    /**
     * 设置vehRentalCore属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleRentalCoreType }
     *     
     */
    public void setVehRentalCore(VehicleRentalCoreType value) {
        this.vehRentalCore = value;
    }

    /**
     * 获取vehAvailInfo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link VehicleAvailAdditionalInfoType }
     *     
     */
    public VehicleAvailAdditionalInfoType getVehAvailInfo() {
        return vehAvailInfo;
    }

    /**
     * 设置vehAvailInfo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link VehicleAvailAdditionalInfoType }
     *     
     */
    public void setVehAvailInfo(VehicleAvailAdditionalInfoType value) {
        this.vehAvailInfo = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}VehicleAvailCoreType">
     *       &lt;attribute name="Reference" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class VehAvailCore
        extends VehicleAvailCoreType
    {

        @XmlAttribute(name = "Reference")
        protected String referenceAttr;

        /**
         * 获取referenceAttr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getReferenceAttr() {
            return referenceAttr;
        }

        /**
         * 设置referenceAttr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setReferenceAttr(String value) {
            this.referenceAttr = value;
        }

    }

}
