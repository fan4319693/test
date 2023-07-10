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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;


/**
 * Describes an optional service which is not included in the standard package but may be booked in addition.
 * 
 * <p>ExtrasInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ExtrasInfoType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ExtrasCoreType">
 *       &lt;sequence>
 *         &lt;element name="Criteria" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="YearsExperience" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
 *                 &lt;attribute name="DateRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="DurationRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="StockControlledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="MaximumOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Periods" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Period" type="{http://www.opentravel.org/OTA/2003/05}PeriodPriceType" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AdditionalInfoPrompt" maxOccurs="4" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AdditionalInfoText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
 *                 &lt;attribute name="LineNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ParentExtras" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
 *                 &lt;attribute name="ListOfParentRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="ExtraLocationInfo" maxOccurs="5" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *                 &lt;attribute name="Type">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="PickUp"/>
 *                       &lt;enumeration value="DropOff"/>
 *                       &lt;enumeration value="Both"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
 *       &lt;attribute name="ApplyTo">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *             &lt;enumeration value="SelectedPax"/>
 *             &lt;enumeration value="AllPax"/>
 *             &lt;enumeration value="NoPax"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ExtrasInfoType", propOrder = {
    "criteria",
    "periods",
    "additionalInfoPrompt",
    "parentExtras",
    "extraLocationInfo"
})
public class ExtrasInfoType
    extends ExtrasCoreType
{

    @XmlElement(name = "Criteria")
    protected ExtrasInfoType.Criteria criteria;
    @XmlElement(name = "Periods")
    protected ExtrasInfoType.Periods periods;
    @XmlElement(name = "AdditionalInfoPrompt")
    protected List<ExtrasInfoType.AdditionalInfoPrompt> additionalInfoPrompt;
    @XmlElement(name = "ParentExtras")
    protected ExtrasInfoType.ParentExtras parentExtras;
    @XmlElement(name = "ExtraLocationInfo")
    protected List<ExtrasInfoType.ExtraLocationInfo> extraLocationInfo;
    @XmlAttribute(name = "ApplyTo")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String applyTo;
    @XmlAttribute(name = "SelectionType")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String selectionType;
    @XmlAttribute(name = "RuleCode")
    @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
    protected String ruleCode;

    /**
     * 获取criteria属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.Criteria }
     *     
     */
    public ExtrasInfoType.Criteria getCriteria() {
        return criteria;
    }

    /**
     * 设置criteria属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.Criteria }
     *     
     */
    public void setCriteria(ExtrasInfoType.Criteria value) {
        this.criteria = value;
    }

    /**
     * 获取periods属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.Periods }
     *     
     */
    public ExtrasInfoType.Periods getPeriods() {
        return periods;
    }

    /**
     * 设置periods属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.Periods }
     *     
     */
    public void setPeriods(ExtrasInfoType.Periods value) {
        this.periods = value;
    }

    /**
     * Gets the value of the additionalInfoPrompt property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the additionalInfoPrompt property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getAdditionalInfoPrompt().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrasInfoType.AdditionalInfoPrompt }
     * 
     * 
     */
    public List<ExtrasInfoType.AdditionalInfoPrompt> getAdditionalInfoPrompt() {
        if (additionalInfoPrompt == null) {
            additionalInfoPrompt = new ArrayList<ExtrasInfoType.AdditionalInfoPrompt>();
        }
        return this.additionalInfoPrompt;
    }

    /**
     * 获取parentExtras属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ExtrasInfoType.ParentExtras }
     *     
     */
    public ExtrasInfoType.ParentExtras getParentExtras() {
        return parentExtras;
    }

    /**
     * 设置parentExtras属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ExtrasInfoType.ParentExtras }
     *     
     */
    public void setParentExtras(ExtrasInfoType.ParentExtras value) {
        this.parentExtras = value;
    }

    /**
     * Gets the value of the extraLocationInfo property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extraLocationInfo property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtraLocationInfo().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link ExtrasInfoType.ExtraLocationInfo }
     * 
     * 
     */
    public List<ExtrasInfoType.ExtraLocationInfo> getExtraLocationInfo() {
        if (extraLocationInfo == null) {
            extraLocationInfo = new ArrayList<ExtrasInfoType.ExtraLocationInfo>();
        }
        return this.extraLocationInfo;
    }

    /**
     * 获取applyTo属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getApplyTo() {
        return applyTo;
    }

    /**
     * 设置applyTo属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setApplyTo(String value) {
        this.applyTo = value;
    }

    /**
     * 获取selectionType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSelectionType() {
        return selectionType;
    }

    /**
     * 设置selectionType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSelectionType(String value) {
        this.selectionType = value;
    }

    /**
     * 获取ruleCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRuleCode() {
        return ruleCode;
    }

    /**
     * 设置ruleCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRuleCode(String value) {
        this.ruleCode = value;
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
     *       &lt;attribute name="AdditionalInfoText" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to32" />
     *       &lt;attribute name="LineNumber" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to4" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class AdditionalInfoPrompt {

        @XmlAttribute(name = "AdditionalInfoText")
        protected String additionalInfoText;
        @XmlAttribute(name = "LineNumber")
        protected Integer lineNumber;

        /**
         * 获取additionalInfoText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAdditionalInfoText() {
            return additionalInfoText;
        }

        /**
         * 设置additionalInfoText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAdditionalInfoText(String value) {
            this.additionalInfoText = value;
        }

        /**
         * 获取lineNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLineNumber() {
            return lineNumber;
        }

        /**
         * 设置lineNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLineNumber(Integer value) {
            this.lineNumber = value;
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
     *       &lt;attribute name="MinimumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="MaximumAge" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="YearsExperience" type="{http://www.w3.org/2001/XMLSchema}positiveInteger" />
     *       &lt;attribute name="DateRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="DurationRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="StockControlledInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="MaximumOccupancy" type="{http://www.opentravel.org/OTA/2003/05}Numeric1to99" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Criteria {

        @XmlAttribute(name = "MinimumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger minimumAge;
        @XmlAttribute(name = "MaximumAge")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger maximumAge;
        @XmlAttribute(name = "YearsExperience")
        @XmlSchemaType(name = "positiveInteger")
        protected BigInteger yearsExperience;
        @XmlAttribute(name = "DateRequiredInd")
        protected Boolean dateRequiredInd;
        @XmlAttribute(name = "DurationRequiredInd")
        protected Boolean durationRequiredInd;
        @XmlAttribute(name = "StockControlledInd")
        protected Boolean stockControlledInd;
        @XmlAttribute(name = "MaximumOccupancy")
        protected Integer maximumOccupancy;

        /**
         * 获取minimumAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMinimumAge() {
            return minimumAge;
        }

        /**
         * 设置minimumAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMinimumAge(BigInteger value) {
            this.minimumAge = value;
        }

        /**
         * 获取maximumAge属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getMaximumAge() {
            return maximumAge;
        }

        /**
         * 设置maximumAge属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setMaximumAge(BigInteger value) {
            this.maximumAge = value;
        }

        /**
         * 获取yearsExperience属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getYearsExperience() {
            return yearsExperience;
        }

        /**
         * 设置yearsExperience属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setYearsExperience(BigInteger value) {
            this.yearsExperience = value;
        }

        /**
         * 获取dateRequiredInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDateRequiredInd() {
            return dateRequiredInd;
        }

        /**
         * 设置dateRequiredInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDateRequiredInd(Boolean value) {
            this.dateRequiredInd = value;
        }

        /**
         * 获取durationRequiredInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isDurationRequiredInd() {
            return durationRequiredInd;
        }

        /**
         * 设置durationRequiredInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setDurationRequiredInd(Boolean value) {
            this.durationRequiredInd = value;
        }

        /**
         * 获取stockControlledInd属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isStockControlledInd() {
            return stockControlledInd;
        }

        /**
         * 设置stockControlledInd属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setStockControlledInd(Boolean value) {
            this.stockControlledInd = value;
        }

        /**
         * 获取maximumOccupancy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getMaximumOccupancy() {
            return maximumOccupancy;
        }

        /**
         * 设置maximumOccupancy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setMaximumOccupancy(Integer value) {
            this.maximumOccupancy = value;
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
     *       &lt;attribute name="Location" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *       &lt;attribute name="Type">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="PickUp"/>
     *             &lt;enumeration value="DropOff"/>
     *             &lt;enumeration value="Both"/>
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
    @XmlType(name = "")
    public static class ExtraLocationInfo {

        @XmlAttribute(name = "Location")
        protected String location;
        @XmlAttribute(name = "Type")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String type;

        /**
         * 获取location属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getLocation() {
            return location;
        }

        /**
         * 设置location属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setLocation(String value) {
            this.location = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}ExtrasSelectionGroup"/>
     *       &lt;attribute name="ListOfParentRPH" type="{http://www.opentravel.org/OTA/2003/05}ListOfRPH" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ParentExtras {

        @XmlAttribute(name = "ListOfParentRPH")
        protected List<String> listOfParentRPH;
        @XmlAttribute(name = "SelectionType")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String selectionType;
        @XmlAttribute(name = "RuleCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String ruleCode;

        /**
         * Gets the value of the listOfParentRPH property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the listOfParentRPH property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getListOfParentRPH().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getListOfParentRPH() {
            if (listOfParentRPH == null) {
                listOfParentRPH = new ArrayList<String>();
            }
            return this.listOfParentRPH;
        }

        /**
         * 获取selectionType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSelectionType() {
            return selectionType;
        }

        /**
         * 设置selectionType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSelectionType(String value) {
            this.selectionType = value;
        }

        /**
         * 获取ruleCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getRuleCode() {
            return ruleCode;
        }

        /**
         * 设置ruleCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setRuleCode(String value) {
            this.ruleCode = value;
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
     *         &lt;element name="Period" type="{http://www.opentravel.org/OTA/2003/05}PeriodPriceType" maxOccurs="unbounded"/>
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
        "period"
    })
    public static class Periods {

        @XmlElement(name = "Period", required = true)
        protected List<PeriodPriceType> period;

        /**
         * Gets the value of the period property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the period property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getPeriod().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link PeriodPriceType }
         * 
         * 
         */
        public List<PeriodPriceType> getPeriod() {
            if (period == null) {
                period = new ArrayList<PeriodPriceType>();
            }
            return this.period;
        }

    }

}
