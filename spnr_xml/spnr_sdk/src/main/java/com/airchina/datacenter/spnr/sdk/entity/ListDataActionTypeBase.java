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
 * <p>List_DataActionType_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_DataActionType_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Create/Add"/>
 *     &lt;enumeration value="Read/Query"/>
 *     &lt;enumeration value="Update/Modify"/>
 *     &lt;enumeration value="Cancel"/>
 *     &lt;enumeration value="Delete"/>
 *     &lt;enumeration value="Replace"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_DataActionType_Base")
@XmlEnum
public enum ListDataActionTypeBase {


    /**
     * Add specified data whether the data already exists or not.
     * 
     */
    @XmlEnumValue("Create/Add")
    CREATE_ADD("Create/Add"),
    @XmlEnumValue("Read/Query")
    READ_QUERY("Read/Query"),

    /**
     * Add specified data if it does not exist or update data where it does exist.	
     * 
     */
    @XmlEnumValue("Update/Modify")
    UPDATE_MODIFY("Update/Modify"),

    /**
     * Cancel an existing item.
     * 
     */
    @XmlEnumValue("Cancel")
    CANCEL("Cancel"),

    /**
     * Remove specified data.
     * 
     */
    @XmlEnumValue("Delete")
    DELETE("Delete"),

    /**
     * Overlay existing data with specified data.
     * 
     */
    @XmlEnumValue("Replace")
    REPLACE("Replace"),
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListDataActionTypeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListDataActionTypeBase fromValue(String v) {
        for (ListDataActionTypeBase c: ListDataActionTypeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
