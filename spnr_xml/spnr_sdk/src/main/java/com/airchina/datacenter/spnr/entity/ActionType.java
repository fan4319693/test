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
 * <p>ActionType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="ActionType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Add-Update"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Add"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Lock"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "ActionType")
@XmlEnum
public enum ActionType {


    /**
     * 
     * 			Typically used to add an item where it does not exist or to update an item where it does exist.
     * 			
     * 
     */
    @XmlEnumValue("Add-Update")
    ADD_UPDATE("Add-Update"),

    /**
     * 
     * 			Typically used to cancel an existing item.
     * 			
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * 
     * 			Typically used to remove specified data.
     * 			
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * 
     * 			Typically used to add data whether data already exists or not.
     * 			
     * 
     */
    @XmlEnumValue("Add")
    ADD("Add"),

    /**
     * 
     * 			Typically used to overlay existing data.
     * 			
     * 
     */
    @XmlEnumValue("Replace")
    REPLACE("Replace"),

    /**
     * Typically used to lock existing data, so it cannot be operated on.
     * 					
     * 
     */
    @XmlEnumValue("Lock")
    LOCK("Lock");
    private final String value;

    ActionType(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ActionType fromValue(String v) {
        for (ActionType c: ActionType.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
