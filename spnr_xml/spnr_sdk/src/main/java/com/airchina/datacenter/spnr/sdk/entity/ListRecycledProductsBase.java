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
 * <p>List_RecycledProducts_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_RecycledProducts_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Aluminum"/>
 *     &lt;enumeration value="Batteries"/>
 *     &lt;enumeration value="ComputerParts"/>
 *     &lt;enumeration value="Glass"/>
 *     &lt;enumeration value="Lightbulbs"/>
 *     &lt;enumeration value="Paper"/>
 *     &lt;enumeration value="Plastic"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_RecycledProducts_Base")
@XmlEnum
public enum ListRecycledProductsBase {

    @XmlEnumValue("Aluminum")
    ALUMINUM("Aluminum"),
    @XmlEnumValue("Batteries")
    BATTERIES("Batteries"),
    @XmlEnumValue("ComputerParts")
    COMPUTER_PARTS("ComputerParts"),
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    @XmlEnumValue("Lightbulbs")
    LIGHTBULBS("Lightbulbs"),
    @XmlEnumValue("Paper")
    PAPER("Paper"),
    @XmlEnumValue("Plastic")
    PLASTIC("Plastic"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListRecycledProductsBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListRecycledProductsBase fromValue(String v) {
        for (ListRecycledProductsBase c: ListRecycledProductsBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
