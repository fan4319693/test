//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlEnum;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>MealType的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="MealType">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AVML"/>
 *     &lt;enumeration value="BBML"/>
 *     &lt;enumeration value="BLML"/>
 *     &lt;enumeration value="CHML"/>
 *     &lt;enumeration value="DBML"/>
 *     &lt;enumeration value="FPML"/>
 *     &lt;enumeration value="GFML"/>
 *     &lt;enumeration value="HFML"/>
 *     &lt;enumeration value="HNML"/>
 *     &lt;enumeration value="KSML"/>
 *     &lt;enumeration value="LCML"/>
 *     &lt;enumeration value="LFML"/>
 *     &lt;enumeration value="LPML"/>
 *     &lt;enumeration value="LSML"/>
 *     &lt;enumeration value="MOML"/>
 *     &lt;enumeration value="NLML"/>
 *     &lt;enumeration value="ORML"/>
 *     &lt;enumeration value="PRML"/>
 *     &lt;enumeration value="RVML"/>
 *     &lt;enumeration value="SFML"/>
 *     &lt;enumeration value="SPML"/>
 *     &lt;enumeration value="VGML"/>
 *     &lt;enumeration value="VLML"/>
 *     &lt;enumeration value="RGML"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "MealType")
@XmlEnum
public enum MealType {


    /**
     * 
     * 			AVML - Asian Veg
     * 			
     * 
     */
    AVML,

    /**
     * 
     * 			BBML - Baby/Infant Food
     * 			
     * 
     */
    BBML,

    /**
     * 
     * 			BLML - Bland Meal
     * 			
     * 
     */
    BLML,

    /**
     * 
     * 			CHML - Child Meal
     * 			
     * 
     */
    CHML,

    /**
     * 
     * 			DBML - Diabetic
     * 			
     * 
     */
    DBML,

    /**
     * 
     * 			FPML - Fruit Meal
     * 			
     * 
     */
    FPML,

    /**
     * 
     * 			GFML - Gluten Free
     * 			
     * 
     */
    GFML,

    /**
     * 
     * 			HFML - High Fiber
     * 			
     * 
     */
    HFML,

    /**
     * 
     * 			HNML - Hindu Meal
     * 			
     * 
     */
    HNML,

    /**
     * 
     * 			KSML - Kosher
     * 			
     * 
     */
    KSML,

    /**
     * 
     * 			LCML - Low Calorie
     * 					
     * 
     */
    LCML,

    /**
     * 
     * 			LFML - Low Cholesterol
     * 			
     * 
     */
    LFML,

    /**
     * 
     * 			LPML - Low Protein
     * 			
     * 
     */
    LPML,

    /**
     * 
     * 							LSML - Low Sodium/No Salt
     * 			
     * 
     */
    LSML,

    /**
     * 
     * 			MOML - Moslem
     * 				
     * 
     */
    MOML,

    /**
     * 
     * 				NLML - Non-Lactose
     * 				
     * 
     */
    NLML,

    /**
     * 
     * 				ORML - Oriental
     * 					
     * 
     */
    ORML,

    /**
     * 
     * 			PRML - Low Purin
     * 					
     * 
     */
    PRML,

    /**
     * 
     * 			RVML - Raw Vegetarian
     * 				
     * 
     */
    RVML,

    /**
     * 
     * 				SFML - Seafood
     * 					
     * 
     */
    SFML,

    /**
     * 
     * 			SPML - Special/Specify
     * 			
     * 
     */
    SPML,

    /**
     * 
     * 			VGML - Vegetarian/Non Dairy
     * 			
     * 
     */
    VGML,

    /**
     * 
     * 			VLML - Vegetarian/Milk/Eggs
     * 			
     * 
     */
    VLML,

    /**
     * Designates a regular meal.
     * 
     */
    RGML;

    public String value() {
        return name();
    }

    public static MealType fromValue(String v) {
        return valueOf(v);
    }

}
