//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
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
 * Provides detailed information regarding weather.
 * 
 * <p>WeatherInfoType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WeatherInfoType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Precipitation" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
 *                 &lt;attribute name="UnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Temperature" maxOccurs="2" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="TempUnit">
 *                   &lt;simpleType>
 *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *                       &lt;enumeration value="Celsius"/>
 *                       &lt;enumeration value="Fahrenheit"/>
 *                     &lt;/restriction>
 *                   &lt;/simpleType>
 *                 &lt;/attribute>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="Period" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeatherInfoType", propOrder = {
    "precipitation",
    "temperature"
})
public class WeatherInfoType {

    @XmlElement(name = "Precipitation")
    protected List<WeatherInfoType.Precipitation> precipitation;
    @XmlElement(name = "Temperature")
    protected List<WeatherInfoType.Temperature> temperature;
    @XmlAttribute(name = "Period")
    protected String period;

    /**
     * Gets the value of the precipitation property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the precipitation property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPrecipitation().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Precipitation }
     * 
     * 
     */
    public List<WeatherInfoType.Precipitation> getPrecipitation() {
        if (precipitation == null) {
            precipitation = new ArrayList<WeatherInfoType.Precipitation>();
        }
        return this.precipitation;
    }

    /**
     * Gets the value of the temperature property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the temperature property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTemperature().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link WeatherInfoType.Temperature }
     * 
     * 
     */
    public List<WeatherInfoType.Temperature> getTemperature() {
        if (temperature == null) {
            temperature = new ArrayList<WeatherInfoType.Temperature>();
        }
        return this.temperature;
    }

    /**
     * 获取period属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPeriod() {
        return period;
    }

    /**
     * 设置period属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPeriod(String value) {
        this.period = value;
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
     *       &lt;attribute name="AveragePrecipitation" type="{http://www.w3.org/2001/XMLSchema}decimal" />
     *       &lt;attribute name="UnitOfMeasure" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Precipitation {

        @XmlAttribute(name = "AveragePrecipitation")
        protected BigDecimal averagePrecipitation;
        @XmlAttribute(name = "UnitOfMeasure")
        protected String unitOfMeasure;

        /**
         * 获取averagePrecipitation属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getAveragePrecipitation() {
            return averagePrecipitation;
        }

        /**
         * 设置averagePrecipitation属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setAveragePrecipitation(BigDecimal value) {
            this.averagePrecipitation = value;
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
     *       &lt;attribute name="AverageHighTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="AverageLowTemp" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="TempUnit">
     *         &lt;simpleType>
     *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
     *             &lt;enumeration value="Celsius"/>
     *             &lt;enumeration value="Fahrenheit"/>
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
    public static class Temperature {

        @XmlAttribute(name = "AverageHighTemp")
        protected BigInteger averageHighTemp;
        @XmlAttribute(name = "AverageLowTemp")
        protected BigInteger averageLowTemp;
        @XmlAttribute(name = "TempUnit")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String tempUnit;

        /**
         * 获取averageHighTemp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAverageHighTemp() {
            return averageHighTemp;
        }

        /**
         * 设置averageHighTemp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAverageHighTemp(BigInteger value) {
            this.averageHighTemp = value;
        }

        /**
         * 获取averageLowTemp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getAverageLowTemp() {
            return averageLowTemp;
        }

        /**
         * 设置averageLowTemp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setAverageLowTemp(BigInteger value) {
            this.averageLowTemp = value;
        }

        /**
         * 获取tempUnit属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTempUnit() {
            return tempUnit;
        }

        /**
         * 设置tempUnit属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTempUnit(String value) {
            this.tempUnit = value;
        }

    }

}
