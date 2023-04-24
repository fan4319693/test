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
 * <p>List_SSR_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_SSR_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="BassinetSeatingRequested"/>
 *     &lt;enumeration value="BlindPassenger"/>
 *     &lt;enumeration value="BookingContainsAnInfant"/>
 *     &lt;enumeration value="BulkheadSeatingRequested"/>
 *     &lt;enumeration value="ChildAged2to11Years"/>
 *     &lt;enumeration value="DeafPassenger"/>
 *     &lt;enumeration value="ExtraSeatRequired"/>
 *     &lt;enumeration value="ImpairedMobilityPassenger"/>
 *     &lt;enumeration value="InfantAccompanyingAdultPassenger"/>
 *     &lt;enumeration value="LanguageAssistance"/>
 *     &lt;enumeration value="MedicalCondition"/>
 *     &lt;enumeration value="MeetAndAssist"/>
 *     &lt;enumeration value="OxygenRequired"/>
 *     &lt;enumeration value="PetInCabin"/>
 *     &lt;enumeration value="SpecialDiet_MealRestrictions"/>
 *     &lt;enumeration value="ServiceAnimal"/>
 *     &lt;enumeration value="SpecialLuggage"/>
 *     &lt;enumeration value="UnaccompaniedMinor"/>
 *     &lt;enumeration value="WheelchairRequired"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_SSR_Base")
@XmlEnum
public enum ListSSRBase {

    @XmlEnumValue("BassinetSeatingRequested")
    BASSINET_SEATING_REQUESTED("BassinetSeatingRequested"),
    @XmlEnumValue("BlindPassenger")
    BLIND_PASSENGER("BlindPassenger"),
    @XmlEnumValue("BookingContainsAnInfant")
    BOOKING_CONTAINS_AN_INFANT("BookingContainsAnInfant"),
    @XmlEnumValue("BulkheadSeatingRequested")
    BULKHEAD_SEATING_REQUESTED("BulkheadSeatingRequested"),
    @XmlEnumValue("ChildAged2to11Years")
    CHILD_AGED_2_TO_11_YEARS("ChildAged2to11Years"),
    @XmlEnumValue("DeafPassenger")
    DEAF_PASSENGER("DeafPassenger"),
    @XmlEnumValue("ExtraSeatRequired")
    EXTRA_SEAT_REQUIRED("ExtraSeatRequired"),
    @XmlEnumValue("ImpairedMobilityPassenger")
    IMPAIRED_MOBILITY_PASSENGER("ImpairedMobilityPassenger"),
    @XmlEnumValue("InfantAccompanyingAdultPassenger")
    INFANT_ACCOMPANYING_ADULT_PASSENGER("InfantAccompanyingAdultPassenger"),
    @XmlEnumValue("LanguageAssistance")
    LANGUAGE_ASSISTANCE("LanguageAssistance"),
    @XmlEnumValue("MedicalCondition")
    MEDICAL_CONDITION("MedicalCondition"),
    @XmlEnumValue("MeetAndAssist")
    MEET_AND_ASSIST("MeetAndAssist"),
    @XmlEnumValue("OxygenRequired")
    OXYGEN_REQUIRED("OxygenRequired"),
    @XmlEnumValue("PetInCabin")
    PET_IN_CABIN("PetInCabin"),
    @XmlEnumValue("SpecialDiet_MealRestrictions")
    SPECIAL_DIET_MEAL_RESTRICTIONS("SpecialDiet_MealRestrictions"),
    @XmlEnumValue("ServiceAnimal")
    SERVICE_ANIMAL("ServiceAnimal"),
    @XmlEnumValue("SpecialLuggage")
    SPECIAL_LUGGAGE("SpecialLuggage"),
    @XmlEnumValue("UnaccompaniedMinor")
    UNACCOMPANIED_MINOR("UnaccompaniedMinor"),
    @XmlEnumValue("WheelchairRequired")
    WHEELCHAIR_REQUIRED("WheelchairRequired"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListSSRBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListSSRBase fromValue(String v) {
        for (ListSSRBase c: ListSSRBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
