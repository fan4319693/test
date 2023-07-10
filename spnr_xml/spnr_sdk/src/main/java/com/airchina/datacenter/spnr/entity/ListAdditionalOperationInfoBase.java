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
 * <p>List_AdditionalOperationInfo_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_AdditionalOperationInfo_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AfterHoursAvailable"/>
 *     &lt;enumeration value="AfterHoursConditional"/>
 *     &lt;enumeration value="AfterHoursPickups"/>
 *     &lt;enumeration value="AfterHoursReturns"/>
 *     &lt;enumeration value="LimitedAvailability"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_AdditionalOperationInfo_Base")
@XmlEnum
public enum ListAdditionalOperationInfoBase {

    @XmlEnumValue("AfterHoursAvailable")
    AFTER_HOURS_AVAILABLE("AfterHoursAvailable"),
    @XmlEnumValue("AfterHoursConditional")
    AFTER_HOURS_CONDITIONAL("AfterHoursConditional"),
    @XmlEnumValue("AfterHoursPickups")
    AFTER_HOURS_PICKUPS("AfterHoursPickups"),
    @XmlEnumValue("AfterHoursReturns")
    AFTER_HOURS_RETURNS("AfterHoursReturns"),
    @XmlEnumValue("LimitedAvailability")
    LIMITED_AVAILABILITY("LimitedAvailability"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListAdditionalOperationInfoBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListAdditionalOperationInfoBase fromValue(String v) {
        for (ListAdditionalOperationInfoBase c: ListAdditionalOperationInfoBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
