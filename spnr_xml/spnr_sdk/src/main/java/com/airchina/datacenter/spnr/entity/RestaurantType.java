//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Information associated with a specific restaurant.
 * 
 * <p>RestaurantType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="RestaurantType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="MultimediaDescriptions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
 *                 &lt;attribute name="Attire" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
 *               &lt;/extension>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="RelativePosition" type="{http://www.opentravel.org/OTA/2003/05}RelativePositionType" minOccurs="0"/>
 *         &lt;element name="OperationSchedules" type="{http://www.opentravel.org/OTA/2003/05}OperationSchedulesPlusChargeType" minOccurs="0"/>
 *         &lt;element name="InfoCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="InfoCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attribute name="Name">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
 *                                 &lt;enumeration value="SrvcInfo"/>
 *                                 &lt;enumeration value="Beverage"/>
 *                                 &lt;enumeration value="AvailableMealCategory"/>
 *                                 &lt;enumeration value="RestaurantCategory"/>
 *                                 &lt;enumeration value="RestaurantPolicy"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CuisineCodes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="CuisineCode" maxOccurs="unbounded">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
 *                           &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                           &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                           &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="DescriptiveText" minOccurs="0">
 *           &lt;simpleType>
 *             &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *               &lt;pattern value="[A-Za-z0-9]{1,500}"/>
 *             &lt;/restriction>
 *           &lt;/simpleType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ID_OptionalGroup"/>
 *       &lt;attribute name="RestaurantName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="MaxSeatingCapacity" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MaxSingleParty" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="InvCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="OfferBreakfast" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferLunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferDinner" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="OfferBrunch" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *       &lt;attribute name="ProximityCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="Sort" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "RestaurantType", propOrder = {
    "multimediaDescriptions",
    "relativePosition",
    "operationSchedules",
    "infoCodes",
    "cuisineCodes",
    "descriptiveText"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.RestaurantsType.Restaurant.class
})
public class RestaurantType {

    @XmlElement(name = "MultimediaDescriptions")
    protected RestaurantType.MultimediaDescriptions multimediaDescriptions;
    @XmlElement(name = "RelativePosition")
    protected RelativePositionType relativePosition;
    @XmlElement(name = "OperationSchedules")
    protected OperationSchedulesPlusChargeType operationSchedules;
    @XmlElement(name = "InfoCodes")
    protected RestaurantType.InfoCodes infoCodes;
    @XmlElement(name = "CuisineCodes")
    protected RestaurantType.CuisineCodes cuisineCodes;
    @XmlElement(name = "DescriptiveText")
    protected String descriptiveText;
    @XmlAttribute(name = "RestaurantName")
    protected String restaurantName;
    @XmlAttribute(name = "MaxSeatingCapacity")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSeatingCapacity;
    @XmlAttribute(name = "MaxSingleParty")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger maxSingleParty;
    @XmlAttribute(name = "InvCode")
    protected String invCode;
    @XmlAttribute(name = "OfferBreakfast")
    protected Boolean offerBreakfast;
    @XmlAttribute(name = "OfferLunch")
    protected Boolean offerLunch;
    @XmlAttribute(name = "OfferDinner")
    protected Boolean offerDinner;
    @XmlAttribute(name = "OfferBrunch")
    protected Boolean offerBrunch;
    @XmlAttribute(name = "ProximityCode")
    protected String proximityCode;
    @XmlAttribute(name = "Sort")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger sort;
    @XmlAttribute(name = "ID")
    protected String id;

    /**
     * 获取multimediaDescriptions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public RestaurantType.MultimediaDescriptions getMultimediaDescriptions() {
        return multimediaDescriptions;
    }

    /**
     * 设置multimediaDescriptions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.MultimediaDescriptions }
     *     
     */
    public void setMultimediaDescriptions(RestaurantType.MultimediaDescriptions value) {
        this.multimediaDescriptions = value;
    }

    /**
     * 获取relativePosition属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RelativePositionType }
     *     
     */
    public RelativePositionType getRelativePosition() {
        return relativePosition;
    }

    /**
     * 设置relativePosition属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RelativePositionType }
     *     
     */
    public void setRelativePosition(RelativePositionType value) {
        this.relativePosition = value;
    }

    /**
     * 获取operationSchedules属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OperationSchedulesPlusChargeType }
     *     
     */
    public OperationSchedulesPlusChargeType getOperationSchedules() {
        return operationSchedules;
    }

    /**
     * 设置operationSchedules属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OperationSchedulesPlusChargeType }
     *     
     */
    public void setOperationSchedules(OperationSchedulesPlusChargeType value) {
        this.operationSchedules = value;
    }

    /**
     * 获取infoCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.InfoCodes }
     *     
     */
    public RestaurantType.InfoCodes getInfoCodes() {
        return infoCodes;
    }

    /**
     * 设置infoCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.InfoCodes }
     *     
     */
    public void setInfoCodes(RestaurantType.InfoCodes value) {
        this.infoCodes = value;
    }

    /**
     * 获取cuisineCodes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RestaurantType.CuisineCodes }
     *     
     */
    public RestaurantType.CuisineCodes getCuisineCodes() {
        return cuisineCodes;
    }

    /**
     * 设置cuisineCodes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RestaurantType.CuisineCodes }
     *     
     */
    public void setCuisineCodes(RestaurantType.CuisineCodes value) {
        this.cuisineCodes = value;
    }

    /**
     * 获取descriptiveText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescriptiveText() {
        return descriptiveText;
    }

    /**
     * 设置descriptiveText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescriptiveText(String value) {
        this.descriptiveText = value;
    }

    /**
     * 获取restaurantName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRestaurantName() {
        return restaurantName;
    }

    /**
     * 设置restaurantName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRestaurantName(String value) {
        this.restaurantName = value;
    }

    /**
     * 获取maxSeatingCapacity属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSeatingCapacity() {
        return maxSeatingCapacity;
    }

    /**
     * 设置maxSeatingCapacity属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSeatingCapacity(BigInteger value) {
        this.maxSeatingCapacity = value;
    }

    /**
     * 获取maxSingleParty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMaxSingleParty() {
        return maxSingleParty;
    }

    /**
     * 设置maxSingleParty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMaxSingleParty(BigInteger value) {
        this.maxSingleParty = value;
    }

    /**
     * 获取invCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getInvCode() {
        return invCode;
    }

    /**
     * 设置invCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setInvCode(String value) {
        this.invCode = value;
    }

    /**
     * 获取offerBreakfast属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBreakfast() {
        return offerBreakfast;
    }

    /**
     * 设置offerBreakfast属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBreakfast(Boolean value) {
        this.offerBreakfast = value;
    }

    /**
     * 获取offerLunch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferLunch() {
        return offerLunch;
    }

    /**
     * 设置offerLunch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferLunch(Boolean value) {
        this.offerLunch = value;
    }

    /**
     * 获取offerDinner属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferDinner() {
        return offerDinner;
    }

    /**
     * 设置offerDinner属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferDinner(Boolean value) {
        this.offerDinner = value;
    }

    /**
     * 获取offerBrunch属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isOfferBrunch() {
        return offerBrunch;
    }

    /**
     * 设置offerBrunch属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setOfferBrunch(Boolean value) {
        this.offerBrunch = value;
    }

    /**
     * 获取proximityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getProximityCode() {
        return proximityCode;
    }

    /**
     * 设置proximityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setProximityCode(String value) {
        this.proximityCode = value;
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

    /**
     * 获取id属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getID() {
        return id;
    }

    /**
     * 设置id属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setID(String value) {
        this.id = value;
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
     *         &lt;element name="CuisineCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *                 &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *                 &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "cuisineCode"
    })
    public static class CuisineCodes {

        @XmlElement(name = "CuisineCode", required = true)
        protected List<RestaurantType.CuisineCodes.CuisineCode> cuisineCode;

        /**
         * Gets the value of the cuisineCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the cuisineCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getCuisineCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestaurantType.CuisineCodes.CuisineCode }
         * 
         * 
         */
        public List<RestaurantType.CuisineCodes.CuisineCode> getCuisineCode() {
            if (cuisineCode == null) {
                cuisineCode = new ArrayList<RestaurantType.CuisineCodes.CuisineCode>();
            }
            return this.cuisineCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *       &lt;attribute name="IsMain" type="{http://www.w3.org/2001/XMLSchema}boolean" />
         *       &lt;attribute name="ExistsCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class CuisineCode {

            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "IsMain")
            protected Boolean isMain;
            @XmlAttribute(name = "ExistsCode")
            protected String existsCode;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

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
             * 获取isMain属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public Boolean isIsMain() {
                return isMain;
            }

            /**
             * 设置isMain属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setIsMain(Boolean value) {
                this.isMain = value;
            }

            /**
             * 获取existsCode属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getExistsCode() {
                return existsCode;
            }

            /**
             * 设置existsCode属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setExistsCode(String value) {
                this.existsCode = value;
            }

            /**
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
     *         &lt;element name="InfoCode" maxOccurs="unbounded">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
     *                 &lt;attribute name="Name">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
     *                       &lt;enumeration value="SrvcInfo"/>
     *                       &lt;enumeration value="Beverage"/>
     *                       &lt;enumeration value="AvailableMealCategory"/>
     *                       &lt;enumeration value="RestaurantCategory"/>
     *                       &lt;enumeration value="RestaurantPolicy"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
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
        "infoCode"
    })
    public static class InfoCodes {

        @XmlElement(name = "InfoCode", required = true)
        protected List<RestaurantType.InfoCodes.InfoCode> infoCode;

        /**
         * Gets the value of the infoCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the infoCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getInfoCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link RestaurantType.InfoCodes.InfoCode }
         * 
         * 
         */
        public List<RestaurantType.InfoCodes.InfoCode> getInfoCode() {
            if (infoCode == null) {
                infoCode = new ArrayList<RestaurantType.InfoCodes.InfoCode>();
            }
            return this.infoCode;
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
         *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CodeInfoGroup"/>
         *       &lt;attribute name="Name">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.opentravel.org/OTA/2003/05}StringLength1to32">
         *             &lt;enumeration value="SrvcInfo"/>
         *             &lt;enumeration value="Beverage"/>
         *             &lt;enumeration value="AvailableMealCategory"/>
         *             &lt;enumeration value="RestaurantCategory"/>
         *             &lt;enumeration value="RestaurantPolicy"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="Code" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class InfoCode {

            @XmlAttribute(name = "Name")
            protected String name;
            @XmlAttribute(name = "Code")
            protected String code;
            @XmlAttribute(name = "CodeDetail")
            protected String codeDetail;
            @XmlAttribute(name = "Removal")
            protected Boolean removal;

            /**
             * 获取name属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getName() {
                return name;
            }

            /**
             * 设置name属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setName(String value) {
                this.name = value;
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
             * 获取codeDetail属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getCodeDetail() {
                return codeDetail;
            }

            /**
             * 设置codeDetail属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setCodeDetail(String value) {
                this.codeDetail = value;
            }

            /**
             * 获取removal属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Boolean }
             *     
             */
            public boolean isRemoval() {
                if (removal == null) {
                    return false;
                } else {
                    return removal;
                }
            }

            /**
             * 设置removal属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Boolean }
             *     
             */
            public void setRemoval(Boolean value) {
                this.removal = value;
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
     *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType">
     *       &lt;attribute name="Attire" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to64" />
     *     &lt;/extension>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MultimediaDescriptions
        extends MultimediaDescriptionsType
    {

        @XmlAttribute(name = "Attire")
        protected String attire;

        /**
         * 获取attire属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAttire() {
            return attire;
        }

        /**
         * 设置attire属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAttire(String value) {
            this.attire = value;
        }

    }

}
