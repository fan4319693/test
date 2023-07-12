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
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Classification of passenger demographics and rate qualifying information with passenger category quantity and reference place holder.
 * 
 * <p>RailPassengerShopType_DEPRECATE complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RailPassengerShopType_DEPRECATE">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Occupation" type="{http://www.opentravel.org/OTA/2003/05}RailPassengerOccupationType" minOccurs="0"/>
 *         &lt;element name="PassengerQualifyingInfo" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeGroup"/>
 *                 &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ADA_Requirement" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" maxOccurs="9" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
 *       &lt;attribute name="AccompaniedByInfantInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RailPassengerShopType_DEPRECATE", propOrder = {
    "occupation",
    "passengerQualifyingInfo",
    "adaRequirement"
})
public class RailPassengerShopTypeDEPRECATE {

    @XmlElement(name = "Occupation")
    protected RailPassengerOccupationType occupation;
    @XmlElement(name = "PassengerQualifyingInfo")
    protected List<RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo> passengerQualifyingInfo;
    @XmlElement(name = "ADA_Requirement")
    protected List<String> adaRequirement;
    @XmlAttribute(name = "AccompaniedByInfantInd")
    protected Boolean accompaniedByInfantInd;
    @XmlAttribute(name = "Gender")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String gender;

    /**
     * 获取occupation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RailPassengerOccupationType }
     *     
     */
    public RailPassengerOccupationType getOccupation() {
        return occupation;
    }

    /**
     * 设置occupation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RailPassengerOccupationType }
     *     
     */
    public void setOccupation(RailPassengerOccupationType value) {
        this.occupation = value;
    }

    /**
     * Gets the value of the passengerQualifyingInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the passengerQualifyingInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPassengerQualifyingInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo }
     * 
     * 
     */
    public List<RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo> getPassengerQualifyingInfo() {
        if (passengerQualifyingInfo == null) {
            passengerQualifyingInfo = new ArrayList<RailPassengerShopTypeDEPRECATE.PassengerQualifyingInfo>();
        }
        return this.passengerQualifyingInfo;
    }

    /**
     * Gets the value of the adaRequirement property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the adaRequirement property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getADARequirement().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link String }
     * 
     * 
     */
    public List<String> getADARequirement() {
        if (adaRequirement == null) {
            adaRequirement = new ArrayList<String>();
        }
        return this.adaRequirement;
    }

    /**
     * 获取accompaniedByInfantInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAccompaniedByInfantInd() {
        return accompaniedByInfantInd;
    }

    /**
     * 设置accompaniedByInfantInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAccompaniedByInfantInd(Boolean value) {
        this.accompaniedByInfantInd = value;
    }

    /**
     * 获取gender属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getGender() {
        return gender;
    }

    /**
     * 设置gender属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setGender(String value) {
        this.gender = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeGroup"/>
     *       &lt;attribute name="Quantity" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
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
    public static class PassengerQualifyingInfo {

        @XmlAttribute(name = "Quantity")
        @XmlSchemaType(name = "anySimpleType")
        protected String quantity;
        @XmlAttribute(name = "RPH")
        protected String rph;
        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "CodeContext")
        protected String codeContext;

        /**
         * 获取quantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQuantity() {
            return quantity;
        }

        /**
         * 设置quantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQuantity(String value) {
            this.quantity = value;
        }

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
         * 获取codeContext属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCodeContext() {
            return codeContext;
        }

        /**
         * 设置codeContext属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCodeContext(String value) {
            this.codeContext = value;
        }

    }

}
