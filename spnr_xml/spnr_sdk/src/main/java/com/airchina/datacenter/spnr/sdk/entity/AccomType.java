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
 * Details of a type of onboard accommodation, or of a specific unit of onboard accommodation.
 * 
 * <p>AccomType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AccomType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Places">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
 *                 &lt;attribute name="AvailableQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                 &lt;attribute name="RequiredQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *                 &lt;attribute name="OccupancyMode" type="{http://www.opentravel.org/OTA/2003/05}OccupancyModeType" />
 *                 &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AccomRef" maxOccurs="999" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="StartAccomID" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="EndAccomID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *                 &lt;attribute name="BerthID" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="RPH" type="{http://www.opentravel.org/OTA/2003/05}RPH_Type" />
 *       &lt;attribute name="Type" type="{http://www.opentravel.org/OTA/2003/05}FerryAccomType" />
 *       &lt;attribute name="AccomCode" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="Description" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *       &lt;attribute name="Occupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric0to99" />
 *       &lt;attribute name="Quality" type="{http://www.opentravel.org/OTA/2003/05}AccomQualityType" />
 *       &lt;attribute name="Sanitary" type="{http://www.opentravel.org/OTA/2003/05}AccomSanitaryType" />
 *       &lt;attribute name="Position" type="{http://www.opentravel.org/OTA/2003/05}AccomPositionType" />
 *       &lt;attribute name="Deck" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
 *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}FerryLocationType" />
 *       &lt;attribute name="Class">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="1"/>
 *             &lt;enumeration value="2"/>
 *             &lt;enumeration value="3"/>
 *             &lt;enumeration value="C"/>
 *             &lt;enumeration value="U"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AccomType", propOrder = {
    "places",
    "accomRef"
})
public class AccomType {

    @XmlElement(name = "Places", required = true)
    protected AccomType.Places places;
    @XmlElement(name = "AccomRef")
    protected List<AccomType.AccomRef> accomRef;
    @XmlAttribute(name = "RPH")
    protected String rph;
    @XmlAttribute(name = "Type")
    protected FerryAccomType type;
    @XmlAttribute(name = "AccomCode")
    protected String accomCode;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "Occupancy")
    protected Integer occupancy;
    @XmlAttribute(name = "Quality")
    protected AccomQualityType quality;
    @XmlAttribute(name = "Sanitary")
    protected AccomSanitaryType sanitary;
    @XmlAttribute(name = "Position")
    protected AccomPositionType position;
    @XmlAttribute(name = "Deck")
    protected String deck;
    @XmlAttribute(name = "Location")
    protected FerryLocationType location;
    @XmlAttribute(name = "Class")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String clazz;

    /**
     * 获取places属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccomType.Places }
     *     
     */
    public AccomType.Places getPlaces() {
        return places;
    }

    /**
     * 设置places属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccomType.Places }
     *     
     */
    public void setPlaces(AccomType.Places value) {
        this.places = value;
    }

    /**
     * Gets the value of the accomRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the accomRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAccomRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link AccomType.AccomRef }
     * 
     * 
     */
    public List<AccomType.AccomRef> getAccomRef() {
        if (accomRef == null) {
            accomRef = new ArrayList<AccomType.AccomRef>();
        }
        return this.accomRef;
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
     * 获取type属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryAccomType }
     *     
     */
    public FerryAccomType getType() {
        return type;
    }

    /**
     * 设置type属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryAccomType }
     *     
     */
    public void setType(FerryAccomType value) {
        this.type = value;
    }

    /**
     * 获取accomCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAccomCode() {
        return accomCode;
    }

    /**
     * 设置accomCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAccomCode(String value) {
        this.accomCode = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取occupancy属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Integer }
     *     
     */
    public Integer getOccupancy() {
        return occupancy;
    }

    /**
     * 设置occupancy属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Integer }
     *     
     */
    public void setOccupancy(Integer value) {
        this.occupancy = value;
    }

    /**
     * 获取quality属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccomQualityType }
     *     
     */
    public AccomQualityType getQuality() {
        return quality;
    }

    /**
     * 设置quality属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccomQualityType }
     *     
     */
    public void setQuality(AccomQualityType value) {
        this.quality = value;
    }

    /**
     * 获取sanitary属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccomSanitaryType }
     *     
     */
    public AccomSanitaryType getSanitary() {
        return sanitary;
    }

    /**
     * 设置sanitary属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccomSanitaryType }
     *     
     */
    public void setSanitary(AccomSanitaryType value) {
        this.sanitary = value;
    }

    /**
     * 获取position属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AccomPositionType }
     *     
     */
    public AccomPositionType getPosition() {
        return position;
    }

    /**
     * 设置position属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AccomPositionType }
     *     
     */
    public void setPosition(AccomPositionType value) {
        this.position = value;
    }

    /**
     * 获取deck属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDeck() {
        return deck;
    }

    /**
     * 设置deck属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDeck(String value) {
        this.deck = value;
    }

    /**
     * 获取location属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FerryLocationType }
     *     
     */
    public FerryLocationType getLocation() {
        return location;
    }

    /**
     * 设置location属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FerryLocationType }
     *     
     */
    public void setLocation(FerryLocationType value) {
        this.location = value;
    }

    /**
     * 获取clazz属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getClazz() {
        return clazz;
    }

    /**
     * 设置clazz属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setClazz(String value) {
        this.clazz = value;
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
     *       &lt;attribute name="StartAccomID" use="required" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="EndAccomID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
     *       &lt;attribute name="BerthID" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AccomRef {

        @XmlAttribute(name = "StartAccomID", required = true)
        protected String startAccomID;
        @XmlAttribute(name = "EndAccomID")
        protected String endAccomID;
        @XmlAttribute(name = "BerthID")
        protected String berthID;

        /**
         * 获取startAccomID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartAccomID() {
            return startAccomID;
        }

        /**
         * 设置startAccomID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartAccomID(String value) {
            this.startAccomID = value;
        }

        /**
         * 获取endAccomID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEndAccomID() {
            return endAccomID;
        }

        /**
         * 设置endAccomID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEndAccomID(String value) {
            this.endAccomID = value;
        }

        /**
         * 获取berthID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBerthID() {
            return berthID;
        }

        /**
         * 设置berthID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBerthID(String value) {
            this.berthID = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}GenderGroup"/>
     *       &lt;attribute name="AvailableQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *       &lt;attribute name="RequiredQty" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *       &lt;attribute name="OccupancyMode" type="{http://www.opentravel.org/OTA/2003/05}OccupancyModeType" />
     *       &lt;attribute name="Characteristic" type="{http://www.opentravel.org/OTA/2003/05}AlphaLength1" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Places {

        @XmlAttribute(name = "AvailableQty")
        protected Integer availableQty;
        @XmlAttribute(name = "RequiredQty")
        protected Integer requiredQty;
        @XmlAttribute(name = "OccupancyMode")
        protected OccupancyModeType occupancyMode;
        @XmlAttribute(name = "Characteristic")
        protected String characteristic;
        @XmlAttribute(name = "Gender")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String gender;

        /**
         * 获取availableQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getAvailableQty() {
            return availableQty;
        }

        /**
         * 设置availableQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setAvailableQty(Integer value) {
            this.availableQty = value;
        }

        /**
         * 获取requiredQty属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getRequiredQty() {
            return requiredQty;
        }

        /**
         * 设置requiredQty属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setRequiredQty(Integer value) {
            this.requiredQty = value;
        }

        /**
         * 获取occupancyMode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OccupancyModeType }
         *     
         */
        public OccupancyModeType getOccupancyMode() {
            return occupancyMode;
        }

        /**
         * 设置occupancyMode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OccupancyModeType }
         *     
         */
        public void setOccupancyMode(OccupancyModeType value) {
            this.occupancyMode = value;
        }

        /**
         * 获取characteristic属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCharacteristic() {
            return characteristic;
        }

        /**
         * 设置characteristic属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCharacteristic(String value) {
            this.characteristic = value;
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

    }

}
