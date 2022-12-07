//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlEnumValue;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>PreferLevelType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="PreferLevelType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}NMTOKEN">
 *     &lt;enumeration value="Only"/>
 *     &lt;enumeration value="Unacceptable"/>
 *     &lt;enumeration value="Preferred"/>
 *     &lt;enumeration value="Required"/>
 *     &lt;enumeration value="NoPreference"/>
 *     &lt;enumeration value="Allowed"/>
 *     &lt;enumeration value="Forbidden"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "PreferLevelType")
@XmlEnum
public enum PreferLevelType {


    /**
     * Preference level that indicates request is only for a specific criterion.
     * 
     */
    @XmlEnumValue("Only")
    ONLY("Only"),

    /**
     * Preference level that indicates request is unnacceptable for a specific criterion.
     * 
     * 
     */
    @XmlEnumValue("Unacceptable")
    UNACCEPTABLE("Unacceptable"),

    /**
     * Preference level that indicates request is preferred for a specific criterion.
     * 
     * 
     */
    @XmlEnumValue("Preferred")
    PREFERRED("Preferred"),

    /**
     * Preference level that indicates request is required for a specific criterion.
     * 
     * 
     */
    @XmlEnumValue("Required")
    REQUIRED("Required"),

    /**
     * Preference level that indicates there is no preference.
     * 
     * 
     */
    @XmlEnumValue("NoPreference")
    NO_PREFERENCE("NoPreference"),

    /**
     * Preference level that indicates request is allowed for a specific criterion.
     * 
     * 
     */
    @XmlEnumValue("Allowed")
    ALLOWED("Allowed"),

    /**
     * Preference level that indicates request is forbidden for a specific criterion.
     * 
     * 
     */
    @XmlEnumValue("Forbidden")
    FORBIDDEN("Forbidden");
    private final String value;

    PreferLevelType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static PreferLevelType fromValue(String v) {
        for (PreferLevelType c: PreferLevelType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
