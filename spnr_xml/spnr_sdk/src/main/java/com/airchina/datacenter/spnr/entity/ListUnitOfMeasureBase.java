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
 * <p>List_UnitOfMeasure_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_UnitOfMeasure_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="Acre(s)"/>
 *     &lt;enumeration value="Ampere(s)"/>
 *     &lt;enumeration value="Arpent(s)"/>
 *     &lt;enumeration value="Bi-Week(s)"/>
 *     &lt;enumeration value="Bottle"/>
 *     &lt;enumeration value="Celsius"/>
 *     &lt;enumeration value="Centare(s)"/>
 *     &lt;enumeration value="Centigram(s)"/>
 *     &lt;enumeration value="Centiliter(s)"/>
 *     &lt;enumeration value="Centimeter(s)"/>
 *     &lt;enumeration value="Column(s)"/>
 *     &lt;enumeration value="CubicFeet"/>
 *     &lt;enumeration value="CubicFoot"/>
 *     &lt;enumeration value="CubicInch(es)"/>
 *     &lt;enumeration value="CubicKilometer(s)"/>
 *     &lt;enumeration value="CubicMeter(s)"/>
 *     &lt;enumeration value="CubicYard(s)"/>
 *     &lt;enumeration value="Day(s)"/>
 *     &lt;enumeration value="Degree(s)"/>
 *     &lt;enumeration value="Dozen"/>
 *     &lt;enumeration value="dpi-DotsPerInch"/>
 *     &lt;enumeration value="Each"/>
 *     &lt;enumeration value="Fahrenheit"/>
 *     &lt;enumeration value="Feet"/>
 *     &lt;enumeration value="FluidOunce(s)"/>
 *     &lt;enumeration value="Foot"/>
 *     &lt;enumeration value="FullDuration"/>
 *     &lt;enumeration value="Gallon(s)"/>
 *     &lt;enumeration value="GB-Gigabyte"/>
 *     &lt;enumeration value="Gbps-GigabitsPerSecond"/>
 *     &lt;enumeration value="GBps-GigabytesPerSecond"/>
 *     &lt;enumeration value="GHz-Gigahertz"/>
 *     &lt;enumeration value="Glass"/>
 *     &lt;enumeration value="Gram(s)"/>
 *     &lt;enumeration value="Hectare(s)"/>
 *     &lt;enumeration value="HorsePower"/>
 *     &lt;enumeration value="Hour(s)"/>
 *     &lt;enumeration value="Inch(es)"/>
 *     &lt;enumeration value="KB-Kilobyte"/>
 *     &lt;enumeration value="Kbps-KilobitsPerSecond"/>
 *     &lt;enumeration value="kHz-Kilohertz"/>
 *     &lt;enumeration value="Kilogram(s)"/>
 *     &lt;enumeration value="Kiloliter(s)"/>
 *     &lt;enumeration value="Kilometer(s)"/>
 *     &lt;enumeration value="KilometersPerHour"/>
 *     &lt;enumeration value="Kilowatt(s)"/>
 *     &lt;enumeration value="Knot(s)"/>
 *     &lt;enumeration value="Litre(s)"/>
 *     &lt;enumeration value="Magnum"/>
 *     &lt;enumeration value="MB-Megabyte"/>
 *     &lt;enumeration value="Mbps-MegabitsPerSecond"/>
 *     &lt;enumeration value="MBps-MegabytesPerSecond"/>
 *     &lt;enumeration value="Metre(s)"/>
 *     &lt;enumeration value="MHz-Megahertz"/>
 *     &lt;enumeration value="Microgram(s)"/>
 *     &lt;enumeration value="Mile(s)"/>
 *     &lt;enumeration value="MilesPerGallon"/>
 *     &lt;enumeration value="MilesPerHour"/>
 *     &lt;enumeration value="Milligram(s)"/>
 *     &lt;enumeration value="Milliliter(s)"/>
 *     &lt;enumeration value="Millimeter(s)"/>
 *     &lt;enumeration value="Million(s)"/>
 *     &lt;enumeration value="Minute(s)"/>
 *     &lt;enumeration value="Month(s)"/>
 *     &lt;enumeration value="Morgan(s)"/>
 *     &lt;enumeration value="Nanogram(s)"/>
 *     &lt;enumeration value="Nanometer(s)"/>
 *     &lt;enumeration value="Ohm(s)"/>
 *     &lt;enumeration value="Ounce(s)"/>
 *     &lt;enumeration value="Pica(s)"/>
 *     &lt;enumeration value="Piece(s)"/>
 *     &lt;enumeration value="Pint(s)"/>
 *     &lt;enumeration value="Pixel(s)"/>
 *     &lt;enumeration value="Pixels/CM"/>
 *     &lt;enumeration value="Pixels/Inch"/>
 *     &lt;enumeration value="Point(s)"/>
 *     &lt;enumeration value="Pound(s)"/>
 *     &lt;enumeration value="Quart(s)"/>
 *     &lt;enumeration value="Resolution"/>
 *     &lt;enumeration value="Rod(s)"/>
 *     &lt;enumeration value="Second(s)"/>
 *     &lt;enumeration value="SquareAcre(s)"/>
 *     &lt;enumeration value="SquareFeet"/>
 *     &lt;enumeration value="SquareFoot"/>
 *     &lt;enumeration value="SquareInch(es)"/>
 *     &lt;enumeration value="SquareKilometer(s)"/>
 *     &lt;enumeration value="SquareMetre(s)"/>
 *     &lt;enumeration value="SquareMile(s)"/>
 *     &lt;enumeration value="SquareYard(s)"/>
 *     &lt;enumeration value="TB-Terabyte"/>
 *     &lt;enumeration value="Volt(s)"/>
 *     &lt;enumeration value="Watt(s)"/>
 *     &lt;enumeration value="Week(s)"/>
 *     &lt;enumeration value="Yard(s)"/>
 *     &lt;enumeration value="Year(s)"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_UnitOfMeasure_Base")
@XmlEnum
public enum ListUnitOfMeasureBase {

    @XmlEnumValue("Acre(s)")
    ACRE_S("Acre(s)"),
    @XmlEnumValue("Ampere(s)")
    AMPERE_S("Ampere(s)"),
    @XmlEnumValue("Arpent(s)")
    ARPENT_S("Arpent(s)"),
    @XmlEnumValue("Bi-Week(s)")
    BI_WEEK_S("Bi-Week(s)"),
    @XmlEnumValue("Bottle")
    BOTTLE("Bottle"),
    @XmlEnumValue("Celsius")
    CELSIUS("Celsius"),
    @XmlEnumValue("Centare(s)")
    CENTARE_S("Centare(s)"),
    @XmlEnumValue("Centigram(s)")
    CENTIGRAM_S("Centigram(s)"),
    @XmlEnumValue("Centiliter(s)")
    CENTILITER_S("Centiliter(s)"),
    @XmlEnumValue("Centimeter(s)")
    CENTIMETER_S("Centimeter(s)"),
    @XmlEnumValue("Column(s)")
    COLUMN_S("Column(s)"),
    @XmlEnumValue("CubicFeet")
    CUBIC_FEET("CubicFeet"),
    @XmlEnumValue("CubicFoot")
    CUBIC_FOOT("CubicFoot"),
    @XmlEnumValue("CubicInch(es)")
    CUBIC_INCH_ES("CubicInch(es)"),
    @XmlEnumValue("CubicKilometer(s)")
    CUBIC_KILOMETER_S("CubicKilometer(s)"),
    @XmlEnumValue("CubicMeter(s)")
    CUBIC_METER_S("CubicMeter(s)"),
    @XmlEnumValue("CubicYard(s)")
    CUBIC_YARD_S("CubicYard(s)"),
    @XmlEnumValue("Day(s)")
    DAY_S("Day(s)"),
    @XmlEnumValue("Degree(s)")
    DEGREE_S("Degree(s)"),
    @XmlEnumValue("Dozen")
    DOZEN("Dozen"),
    @XmlEnumValue("dpi-DotsPerInch")
    DPI_DOTS_PER_INCH("dpi-DotsPerInch"),
    @XmlEnumValue("Each")
    EACH("Each"),
    @XmlEnumValue("Fahrenheit")
    FAHRENHEIT("Fahrenheit"),
    @XmlEnumValue("Feet")
    FEET("Feet"),
    @XmlEnumValue("FluidOunce(s)")
    FLUID_OUNCE_S("FluidOunce(s)"),
    @XmlEnumValue("Foot")
    FOOT("Foot"),
    @XmlEnumValue("FullDuration")
    FULL_DURATION("FullDuration"),
    @XmlEnumValue("Gallon(s)")
    GALLON_S("Gallon(s)"),
    @XmlEnumValue("GB-Gigabyte")
    GB_GIGABYTE("GB-Gigabyte"),
    @XmlEnumValue("Gbps-GigabitsPerSecond")
    GBPS_GIGABITS_PER_SECOND("Gbps-GigabitsPerSecond"),
    @XmlEnumValue("GBps-GigabytesPerSecond")
    G_BPS_GIGABYTES_PER_SECOND("GBps-GigabytesPerSecond"),
    @XmlEnumValue("GHz-Gigahertz")
    G_HZ_GIGAHERTZ("GHz-Gigahertz"),
    @XmlEnumValue("Glass")
    GLASS("Glass"),
    @XmlEnumValue("Gram(s)")
    GRAM_S("Gram(s)"),
    @XmlEnumValue("Hectare(s)")
    HECTARE_S("Hectare(s)"),
    @XmlEnumValue("HorsePower")
    HORSE_POWER("HorsePower"),
    @XmlEnumValue("Hour(s)")
    HOUR_S("Hour(s)"),
    @XmlEnumValue("Inch(es)")
    INCH_ES("Inch(es)"),
    @XmlEnumValue("KB-Kilobyte")
    KB_KILOBYTE("KB-Kilobyte"),
    @XmlEnumValue("Kbps-KilobitsPerSecond")
    KBPS_KILOBITS_PER_SECOND("Kbps-KilobitsPerSecond"),
    @XmlEnumValue("kHz-Kilohertz")
    K_HZ_KILOHERTZ("kHz-Kilohertz"),
    @XmlEnumValue("Kilogram(s)")
    KILOGRAM_S("Kilogram(s)"),
    @XmlEnumValue("Kiloliter(s)")
    KILOLITER_S("Kiloliter(s)"),
    @XmlEnumValue("Kilometer(s)")
    KILOMETER_S("Kilometer(s)"),
    @XmlEnumValue("KilometersPerHour")
    KILOMETERS_PER_HOUR("KilometersPerHour"),
    @XmlEnumValue("Kilowatt(s)")
    KILOWATT_S("Kilowatt(s)"),
    @XmlEnumValue("Knot(s)")
    KNOT_S("Knot(s)"),
    @XmlEnumValue("Litre(s)")
    LITRE_S("Litre(s)"),
    @XmlEnumValue("Magnum")
    MAGNUM("Magnum"),
    @XmlEnumValue("MB-Megabyte")
    MB_MEGABYTE("MB-Megabyte"),
    @XmlEnumValue("Mbps-MegabitsPerSecond")
    MBPS_MEGABITS_PER_SECOND("Mbps-MegabitsPerSecond"),
    @XmlEnumValue("MBps-MegabytesPerSecond")
    M_BPS_MEGABYTES_PER_SECOND("MBps-MegabytesPerSecond"),
    @XmlEnumValue("Metre(s)")
    METRE_S("Metre(s)"),
    @XmlEnumValue("MHz-Megahertz")
    M_HZ_MEGAHERTZ("MHz-Megahertz"),
    @XmlEnumValue("Microgram(s)")
    MICROGRAM_S("Microgram(s)"),
    @XmlEnumValue("Mile(s)")
    MILE_S("Mile(s)"),
    @XmlEnumValue("MilesPerGallon")
    MILES_PER_GALLON("MilesPerGallon"),
    @XmlEnumValue("MilesPerHour")
    MILES_PER_HOUR("MilesPerHour"),
    @XmlEnumValue("Milligram(s)")
    MILLIGRAM_S("Milligram(s)"),
    @XmlEnumValue("Milliliter(s)")
    MILLILITER_S("Milliliter(s)"),
    @XmlEnumValue("Millimeter(s)")
    MILLIMETER_S("Millimeter(s)"),
    @XmlEnumValue("Million(s)")
    MILLION_S("Million(s)"),
    @XmlEnumValue("Minute(s)")
    MINUTE_S("Minute(s)"),
    @XmlEnumValue("Month(s)")
    MONTH_S("Month(s)"),
    @XmlEnumValue("Morgan(s)")
    MORGAN_S("Morgan(s)"),
    @XmlEnumValue("Nanogram(s)")
    NANOGRAM_S("Nanogram(s)"),
    @XmlEnumValue("Nanometer(s)")
    NANOMETER_S("Nanometer(s)"),
    @XmlEnumValue("Ohm(s)")
    OHM_S("Ohm(s)"),
    @XmlEnumValue("Ounce(s)")
    OUNCE_S("Ounce(s)"),
    @XmlEnumValue("Pica(s)")
    PICA_S("Pica(s)"),
    @XmlEnumValue("Piece(s)")
    PIECE_S("Piece(s)"),
    @XmlEnumValue("Pint(s)")
    PINT_S("Pint(s)"),
    @XmlEnumValue("Pixel(s)")
    PIXEL_S("Pixel(s)"),
    @XmlEnumValue("Pixels/CM")
    PIXELS_CM("Pixels/CM"),
    @XmlEnumValue("Pixels/Inch")
    PIXELS_INCH("Pixels/Inch"),
    @XmlEnumValue("Point(s)")
    POINT_S("Point(s)"),
    @XmlEnumValue("Pound(s)")
    POUND_S("Pound(s)"),
    @XmlEnumValue("Quart(s)")
    QUART_S("Quart(s)"),
    @XmlEnumValue("Resolution")
    RESOLUTION("Resolution"),
    @XmlEnumValue("Rod(s)")
    ROD_S("Rod(s)"),
    @XmlEnumValue("Second(s)")
    SECOND_S("Second(s)"),
    @XmlEnumValue("SquareAcre(s)")
    SQUARE_ACRE_S("SquareAcre(s)"),
    @XmlEnumValue("SquareFeet")
    SQUARE_FEET("SquareFeet"),
    @XmlEnumValue("SquareFoot")
    SQUARE_FOOT("SquareFoot"),
    @XmlEnumValue("SquareInch(es)")
    SQUARE_INCH_ES("SquareInch(es)"),
    @XmlEnumValue("SquareKilometer(s)")
    SQUARE_KILOMETER_S("SquareKilometer(s)"),
    @XmlEnumValue("SquareMetre(s)")
    SQUARE_METRE_S("SquareMetre(s)"),
    @XmlEnumValue("SquareMile(s)")
    SQUARE_MILE_S("SquareMile(s)"),
    @XmlEnumValue("SquareYard(s)")
    SQUARE_YARD_S("SquareYard(s)"),
    @XmlEnumValue("TB-Terabyte")
    TB_TERABYTE("TB-Terabyte"),
    @XmlEnumValue("Volt(s)")
    VOLT_S("Volt(s)"),
    @XmlEnumValue("Watt(s)")
    WATT_S("Watt(s)"),
    @XmlEnumValue("Week(s)")
    WEEK_S("Week(s)"),
    @XmlEnumValue("Yard(s)")
    YARD_S("Yard(s)"),
    @XmlEnumValue("Year(s)")
    YEAR_S("Year(s)"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListUnitOfMeasureBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListUnitOfMeasureBase fromValue(String v) {
        for (ListUnitOfMeasureBase c: ListUnitOfMeasureBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
