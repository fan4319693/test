//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>List_QuestionCategory_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_QuestionCategory_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="OverallRating"/>
 *     &lt;enumeration value="All"/>
 *     &lt;enumeration value="Accessibility"/>
 *     &lt;enumeration value="Ambiance"/>
 *     &lt;enumeration value="Beach"/>
 *     &lt;enumeration value="BedComfort"/>
 *     &lt;enumeration value="Cleanliness"/>
 *     &lt;enumeration value="Cons"/>
 *     &lt;enumeration value="FamilyFriendly"/>
 *     &lt;enumeration value="FoodAndBeverage"/>
 *     &lt;enumeration value="Location"/>
 *     &lt;enumeration value="Pool"/>
 *     &lt;enumeration value="Pros"/>
 *     &lt;enumeration value="RecreationalFacilties"/>
 *     &lt;enumeration value="Restaurants"/>
 *     &lt;enumeration value="RoomQuality"/>
 *     &lt;enumeration value="Services"/>
 *     &lt;enumeration value="Staff"/>
 *     &lt;enumeration value="Transportation"/>
 *     &lt;enumeration value="TravelerQuestion"/>
 *     &lt;enumeration value="TravelerStory"/>
 *     &lt;enumeration value="Value"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_QuestionCategory_Base")
@XmlEnum
public enum ListQuestionCategoryBase {

    @XmlEnumValue("OverallRating")
    OVERALL_RATING("OverallRating"),
    @XmlEnumValue("All")
    ALL("All"),
    @XmlEnumValue("Accessibility")
    ACCESSIBILITY("Accessibility"),
    @XmlEnumValue("Ambiance")
    AMBIANCE("Ambiance"),
    @XmlEnumValue("Beach")
    BEACH("Beach"),
    @XmlEnumValue("BedComfort")
    BED_COMFORT("BedComfort"),
    @XmlEnumValue("Cleanliness")
    CLEANLINESS("Cleanliness"),
    @XmlEnumValue("Cons")
    CONS("Cons"),
    @XmlEnumValue("FamilyFriendly")
    FAMILY_FRIENDLY("FamilyFriendly"),
    @XmlEnumValue("FoodAndBeverage")
    FOOD_AND_BEVERAGE("FoodAndBeverage"),
    @XmlEnumValue("Location")
    LOCATION("Location"),
    @XmlEnumValue("Pool")
    POOL("Pool"),
    @XmlEnumValue("Pros")
    PROS("Pros"),
    @XmlEnumValue("RecreationalFacilties")
    RECREATIONAL_FACILTIES("RecreationalFacilties"),
    @XmlEnumValue("Restaurants")
    RESTAURANTS("Restaurants"),
    @XmlEnumValue("RoomQuality")
    ROOM_QUALITY("RoomQuality"),
    @XmlEnumValue("Services")
    SERVICES("Services"),
    @XmlEnumValue("Staff")
    STAFF("Staff"),
    @XmlEnumValue("Transportation")
    TRANSPORTATION("Transportation"),
    @XmlEnumValue("TravelerQuestion")
    TRAVELER_QUESTION("TravelerQuestion"),
    @XmlEnumValue("TravelerStory")
    TRAVELER_STORY("TravelerStory"),
    @XmlEnumValue("Value")
    VALUE("Value"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListQuestionCategoryBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListQuestionCategoryBase fromValue(String v) {
        for (ListQuestionCategoryBase c: ListQuestionCategoryBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
