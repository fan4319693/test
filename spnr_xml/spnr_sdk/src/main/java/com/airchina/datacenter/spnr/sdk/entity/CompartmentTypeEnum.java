//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CompartmentTypeEnum的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="CompartmentTypeEnum">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="NotSignificant"/>
 *     &lt;enumeration value="Family"/>
 *     &lt;enumeration value="Quite"/>
 *     &lt;enumeration value="Conference"/>
 *     &lt;enumeration value="CompartmentWithoutAnimals"/>
 *     &lt;enumeration value="Complete"/>
 *     &lt;enumeration value="Video"/>
 *     &lt;enumeration value="Pram"/>
 *     &lt;enumeration value="WomanAndChild"/>
 *     &lt;enumeration value="EasyAccess"/>
 *     &lt;enumeration value="T2"/>
 *     &lt;enumeration value="T3"/>
 *     &lt;enumeration value="T4"/>
 *     &lt;enumeration value="T6"/>
 *     &lt;enumeration value="C2"/>
 *     &lt;enumeration value="C4"/>
 *     &lt;enumeration value="C5"/>
 *     &lt;enumeration value="C6"/>
 *     &lt;enumeration value="Single"/>
 *     &lt;enumeration value="Double"/>
 *     &lt;enumeration value="SingleSuite"/>
 *     &lt;enumeration value="DoubleSuite"/>
 *     &lt;enumeration value="Special"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "CompartmentTypeEnum")
@XmlEnum
public enum CompartmentTypeEnum {

    @XmlEnumValue("NotSignificant")
    NOT_SIGNIFICANT("NotSignificant"),
    @XmlEnumValue("Family")
    FAMILY("Family"),
    @XmlEnumValue("Quite")
    QUITE("Quite"),
    @XmlEnumValue("Conference")
    CONFERENCE("Conference"),

    /**
     * Compartment without animals
     * 
     */
    @XmlEnumValue("CompartmentWithoutAnimals")
    COMPARTMENT_WITHOUT_ANIMALS("CompartmentWithoutAnimals"),
    @XmlEnumValue("Complete")
    COMPLETE("Complete"),

    /**
     * Video compartment
     * 
     */
    @XmlEnumValue("Video")
    VIDEO("Video"),
    @XmlEnumValue("Pram")
    PRAM("Pram"),

    /**
     * Woman and Child compartment
     * 
     */
    @XmlEnumValue("WomanAndChild")
    WOMAN_AND_CHILD("WomanAndChild"),

    /**
     * Placess with easy access - PRMS
     * 
     */
    @XmlEnumValue("EasyAccess")
    EASY_ACCESS("EasyAccess"),

    /**
     * Two-berth compartment
     * 
     */
    @XmlEnumValue("T2")
    T_2("T2"),

    /**
     * Three-berth compartment
     * 
     */
    @XmlEnumValue("T3")
    T_3("T3"),

    /**
     * Four-berth compartment
     * 
     */
    @XmlEnumValue("T4")
    T_4("T4"),

    /**
     * Six-berth compartment
     * 
     */
    @XmlEnumValue("T6")
    T_6("T6"),

    /**
     * compartment with 2 couchettes
     * 
     */
    @XmlEnumValue("C2")
    C_2("C2"),

    /**
     * compartment with 4 couchettes
     * 
     */
    @XmlEnumValue("C4")
    C_4("C4"),

    /**
     * compartment with 5 couchettes
     * 
     */
    @XmlEnumValue("C5")
    C_5("C5"),

    /**
     * compartment with 6 couchettes
     * 
     */
    @XmlEnumValue("C6")
    C_6("C6"),

    /**
     * Single-berth compartment
     * 
     */
    @XmlEnumValue("Single")
    SINGLE("Single"),

    /**
     * Double-berth compartment
     * 
     */
    @XmlEnumValue("Double")
    DOUBLE("Double"),

    /**
     * Single suite compartment
     * 
     */
    @XmlEnumValue("SingleSuite")
    SINGLE_SUITE("SingleSuite"),

    /**
     * Double suite compartment
     * 
     */
    @XmlEnumValue("DoubleSuite")
    DOUBLE_SUITE("DoubleSuite"),

    /**
     * Special-berth compartment
     * 
     */
    @XmlEnumValue("Special")
    SPECIAL("Special"),

    /**
     * OpenTravel Reserved words, "Other_" as enumerated value for  open enumeration support to support additional compartment type. The Value corresponding to "Other_" will be specified in the  "Value" attribute. See CompartmentType.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    CompartmentTypeEnum(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static CompartmentTypeEnum fromValue(String v) {
        for (CompartmentTypeEnum c: CompartmentTypeEnum.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
