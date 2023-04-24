//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Specifies cabin option info.
 * 
 * <p>CabinOptionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CabinOptionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="CabinConfiguration" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="BedConfigurationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MeasurementInfo" maxOccurs="9" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Remark" type="{http://www.opentravel.org/OTA/2003/05}FreeTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}CruiseCabinGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DeckGroup"/>
 *       &lt;attribute name="Status" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="CategoryLocation" type="{http://www.opentravel.org/OTA/2003/05}CategoryLocationType" />
 *       &lt;attribute name="ShipSide">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Starboard"/>
 *             &lt;enumeration value="Port"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="PositionInShip">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="Aft"/>
 *             &lt;enumeration value="Forward"/>
 *             &lt;enumeration value="Midship"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *       &lt;attribute name="BedType" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="ReleaseDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CabinOptionType", propOrder = {
    "cabinConfiguration",
    "measurementInfo",
    "remark"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.SailingCategoryInfoType.SelectedCategory.SelectedCabin.class
})
public class CabinOptionType {

    @XmlElement(name = "CabinConfiguration")
    protected List<CabinOptionType.CabinConfiguration> cabinConfiguration;
    @XmlElement(name = "MeasurementInfo")
    protected List<CabinOptionType.MeasurementInfo> measurementInfo;
    @XmlElement(name = "Remark")
    protected FreeTextType remark;
    @XmlAttribute(name = "Status", required = true)
    protected String status;
    @XmlAttribute(name = "CategoryLocation")
    protected CategoryLocationType categoryLocation;
    @XmlAttribute(name = "ShipSide")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String shipSide;
    @XmlAttribute(name = "PositionInShip")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String positionInShip;
    @XmlAttribute(name = "BedType")
    protected String bedType;
    @XmlAttribute(name = "ReleaseDateTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar releaseDateTime;
    @XmlAttribute(name = "CabinNumber", required = true)
    protected String cabinNumber;
    @XmlAttribute(name = "MaxOccupancy")
    protected Integer maxOccupancy;
    @XmlAttribute(name = "DeclineIndicator")
    protected Boolean declineIndicator;
    @XmlAttribute(name = "HeldIndicator")
    protected Boolean heldIndicator;
    @XmlAttribute(name = "DeckNumber")
    protected String deckNumber;
    @XmlAttribute(name = "DeckName")
    protected String deckName;

    /**
     * Gets the value of the cabinConfiguration property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the cabinConfiguration property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getCabinConfiguration().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.CabinConfiguration }
     * 
     * 
     */
    public List<CabinOptionType.CabinConfiguration> getCabinConfiguration() {
        if (cabinConfiguration == null) {
            cabinConfiguration = new ArrayList<CabinOptionType.CabinConfiguration>();
        }
        return this.cabinConfiguration;
    }

    /**
     * Gets the value of the measurementInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the measurementInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getMeasurementInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CabinOptionType.MeasurementInfo }
     * 
     * 
     */
    public List<CabinOptionType.MeasurementInfo> getMeasurementInfo() {
        if (measurementInfo == null) {
            measurementInfo = new ArrayList<CabinOptionType.MeasurementInfo>();
        }
        return this.measurementInfo;
    }

    /**
     * 获取remark属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FreeTextType }
     *     
     */
    public FreeTextType getRemark() {
        return remark;
    }

    /**
     * 设置remark属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FreeTextType }
     *     
     */
    public void setRemark(FreeTextType value) {
        this.remark = value;
    }

    /**
     * 获取status属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStatus() {
        return status;
    }

    /**
     * 设置status属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStatus(String value) {
        this.status = value;
    }

    /**
     * 获取categoryLocation属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CategoryLocationType }
     *     
     */
    public CategoryLocationType getCategoryLocation() {
        return categoryLocation;
    }

    /**
     * 设置categoryLocation属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CategoryLocationType }
     *     
     */
    public void setCategoryLocation(CategoryLocationType value) {
        this.categoryLocation = value;
    }

    /**
     * 获取shipSide属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getShipSide() {
        return shipSide;
    }

    /**
     * 设置shipSide属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setShipSide(String value) {
        this.shipSide = value;
    }

    /**
     * 获取positionInShip属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPositionInShip() {
        return positionInShip;
    }

    /**
     * 设置positionInShip属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPositionInShip(String value) {
        this.positionInShip = value;
    }

    /**
     * 获取bedType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBedType() {
        return bedType;
    }

    /**
     * 设置bedType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBedType(String value) {
        this.bedType = value;
    }

    /**
     * 获取releaseDateTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getReleaseDateTime() {
        return releaseDateTime;
    }

    /**
     * 设置releaseDateTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setReleaseDateTime(XMLGregorianCalendar value) {
        this.releaseDateTime = value;
    }

    /**
     * 获取cabinNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCabinNumber() {
        return cabinNumber;
    }

    /**
     * 设置cabinNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCabinNumber(String value) {
        this.cabinNumber = value;
    }

    /**
     * 获取maxOccupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getMaxOccupancy() {
        return maxOccupancy;
    }

    /**
     * 设置maxOccupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setMaxOccupancy(Integer value) {
        this.maxOccupancy = value;
    }

    /**
     * 获取declineIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isDeclineIndicator() {
        return declineIndicator;
    }

    /**
     * 设置declineIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setDeclineIndicator(Boolean value) {
        this.declineIndicator = value;
    }

    /**
     * 获取heldIndicator属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isHeldIndicator() {
        return heldIndicator;
    }

    /**
     * 设置heldIndicator属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setHeldIndicator(Boolean value) {
        this.heldIndicator = value;
    }

    /**
     * 获取deckNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckNumber() {
        return deckNumber;
    }

    /**
     * 设置deckNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckNumber(String value) {
        this.deckNumber = value;
    }

    /**
     * 获取deckName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeckName() {
        return deckName;
    }

    /**
     * 设置deckName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeckName(String value) {
        this.deckName = value;
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
     *       &lt;attribute name="BedConfigurationCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class CabinConfiguration {

        @XmlAttribute(name = "BedConfigurationCode")
        protected String bedConfigurationCode;

        /**
         * 获取bedConfigurationCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBedConfigurationCode() {
            return bedConfigurationCode;
        }

        /**
         * 设置bedConfigurationCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBedConfigurationCode(String value) {
            this.bedConfigurationCode = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OptionalCodeOptionalNameGroup"/>
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}UnitsOfMeasureGroup"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class MeasurementInfo {

        @XmlAttribute(name = "Code")
        protected String code;
        @XmlAttribute(name = "Name")
        protected String name;
        @XmlAttribute(name = "UnitOfMeasureQuantity")
        protected BigDecimal unitOfMeasureQuantity;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;
        @XmlAttribute(name = "UnitOfMeasureCode")
        protected String unitOfMeasureCode;

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
         * 获取unitOfMeasureQuantity属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getUnitOfMeasureQuantity() {
            return unitOfMeasureQuantity;
        }

        /**
         * 设置unitOfMeasureQuantity属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setUnitOfMeasureQuantity(BigDecimal value) {
            this.unitOfMeasureQuantity = value;
        }

        /**
         * 获取unitOfMeasure属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasure() {
            return unitOfMeasure;
        }

        /**
         * 设置unitOfMeasure属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasure(String value) {
            this.unitOfMeasure = value;
        }

        /**
         * 获取unitOfMeasureCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getUnitOfMeasureCode() {
            return unitOfMeasureCode;
        }

        /**
         * 设置unitOfMeasureCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setUnitOfMeasureCode(String value) {
            this.unitOfMeasureCode = value;
        }

    }

}
