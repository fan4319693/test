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
 * <p>List_VehChargePurpose_Base的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * <p>
 * <pre>
 * &lt;simpleType name="List_VehChargePurpose_Base">
 *   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *     &lt;enumeration value="AdditionalDay"/>
 *     &lt;enumeration value="AdditionalDistance"/>
 *     &lt;enumeration value="AdditionalDrive"/>
 *     &lt;enumeration value="AdditionalHour"/>
 *     &lt;enumeration value="AdditionalPassengers"/>
 *     &lt;enumeration value="AdditionalWeek"/>
 *     &lt;enumeration value="Adjustment"/>
 *     &lt;enumeration value="AirConditioningSurcharge"/>
 *     &lt;enumeration value="AirportFee"/>
 *     &lt;enumeration value="BaseRate"/>
 *     &lt;enumeration value="CarSeatFee"/>
 *     &lt;enumeration value="CleaningFee"/>
 *     &lt;enumeration value="ContractFee"/>
 *     &lt;enumeration value="Coverage"/>
 *     &lt;enumeration value="CustomerDropOff"/>
 *     &lt;enumeration value="CustomerPickup"/>
 *     &lt;enumeration value="Discount"/>
 *     &lt;enumeration value="DriverWaitTime"/>
 *     &lt;enumeration value="Drop"/>
 *     &lt;enumeration value="EarlyAM_Fee"/>
 *     &lt;enumeration value="Equipment"/>
 *     &lt;enumeration value="ExtraBaggage"/>
 *     &lt;enumeration value="ExtraGratuity"/>
 *     &lt;enumeration value="ExtraStop"/>
 *     &lt;enumeration value="Fee"/>
 *     &lt;enumeration value="Fuel"/>
 *     &lt;enumeration value="FuelSurcharge"/>
 *     &lt;enumeration value="Gratuity"/>
 *     &lt;enumeration value="Greeter"/>
 *     &lt;enumeration value="HolidaySurcharge"/>
 *     &lt;enumeration value="LatePM_Fee"/>
 *     &lt;enumeration value="Mandatory"/>
 *     &lt;enumeration value="MandatoryChargesTotal"/>
 *     &lt;enumeration value="MeetAndGreet"/>
 *     &lt;enumeration value="Optional"/>
 *     &lt;enumeration value="Parking"/>
 *     &lt;enumeration value="ParkingFees"/>
 *     &lt;enumeration value="PayOnArrivalAmount"/>
 *     &lt;enumeration value="PetSurcharge"/>
 *     &lt;enumeration value="Phone"/>
 *     &lt;enumeration value="PrepaidFuel"/>
 *     &lt;enumeration value="PrepayAmount"/>
 *     &lt;enumeration value="PushCart"/>
 *     &lt;enumeration value="RateOverride"/>
 *     &lt;enumeration value="RegistrationFee"/>
 *     &lt;enumeration value="Representative"/>
 *     &lt;enumeration value="Senior"/>
 *     &lt;enumeration value="SpecialRequest"/>
 *     &lt;enumeration value="StandardGratuity"/>
 *     &lt;enumeration value="Stop"/>
 *     &lt;enumeration value="Subtotal"/>
 *     &lt;enumeration value="Surcharge"/>
 *     &lt;enumeration value="SurfaceTransportationCharge(STC)"/>
 *     &lt;enumeration value="Tax"/>
 *     &lt;enumeration value="Tip"/>
 *     &lt;enumeration value="Tolls"/>
 *     &lt;enumeration value="TravelTimeFee"/>
 *     &lt;enumeration value="VehicleCollection"/>
 *     &lt;enumeration value="VehicleDelivery"/>
 *     &lt;enumeration value="VehicleLicenseFee"/>
 *     &lt;enumeration value="VehicleRental"/>
 *     &lt;enumeration value="WaitTime"/>
 *     &lt;enumeration value="WinterServiceCharge"/>
 *     &lt;enumeration value="YoungDriver"/>
 *     &lt;enumeration value="Other_"/>
 *   &lt;/restriction>
 * &lt;/simpleType>
 * </pre>
 * 
 */
@XmlType(name = "List_VehChargePurpose_Base")
@XmlEnum
public enum ListVehChargePurposeBase {

    @XmlEnumValue("AdditionalDay")
    ADDITIONAL_DAY("AdditionalDay"),
    @XmlEnumValue("AdditionalDistance")
    ADDITIONAL_DISTANCE("AdditionalDistance"),
    @XmlEnumValue("AdditionalDrive")
    ADDITIONAL_DRIVE("AdditionalDrive"),
    @XmlEnumValue("AdditionalHour")
    ADDITIONAL_HOUR("AdditionalHour"),
    @XmlEnumValue("AdditionalPassengers")
    ADDITIONAL_PASSENGERS("AdditionalPassengers"),
    @XmlEnumValue("AdditionalWeek")
    ADDITIONAL_WEEK("AdditionalWeek"),
    @XmlEnumValue("Adjustment")
    ADJUSTMENT("Adjustment"),
    @XmlEnumValue("AirConditioningSurcharge")
    AIR_CONDITIONING_SURCHARGE("AirConditioningSurcharge"),
    @XmlEnumValue("AirportFee")
    AIRPORT_FEE("AirportFee"),
    @XmlEnumValue("BaseRate")
    BASE_RATE("BaseRate"),
    @XmlEnumValue("CarSeatFee")
    CAR_SEAT_FEE("CarSeatFee"),
    @XmlEnumValue("CleaningFee")
    CLEANING_FEE("CleaningFee"),
    @XmlEnumValue("ContractFee")
    CONTRACT_FEE("ContractFee"),
    @XmlEnumValue("Coverage")
    COVERAGE("Coverage"),
    @XmlEnumValue("CustomerDropOff")
    CUSTOMER_DROP_OFF("CustomerDropOff"),
    @XmlEnumValue("CustomerPickup")
    CUSTOMER_PICKUP("CustomerPickup"),
    @XmlEnumValue("Discount")
    DISCOUNT("Discount"),
    @XmlEnumValue("DriverWaitTime")
    DRIVER_WAIT_TIME("DriverWaitTime"),
    @XmlEnumValue("Drop")
    DROP("Drop"),
    @XmlEnumValue("EarlyAM_Fee")
    EARLY_AM_FEE("EarlyAM_Fee"),
    @XmlEnumValue("Equipment")
    EQUIPMENT("Equipment"),
    @XmlEnumValue("ExtraBaggage")
    EXTRA_BAGGAGE("ExtraBaggage"),
    @XmlEnumValue("ExtraGratuity")
    EXTRA_GRATUITY("ExtraGratuity"),
    @XmlEnumValue("ExtraStop")
    EXTRA_STOP("ExtraStop"),
    @XmlEnumValue("Fee")
    FEE("Fee"),
    @XmlEnumValue("Fuel")
    FUEL("Fuel"),
    @XmlEnumValue("FuelSurcharge")
    FUEL_SURCHARGE("FuelSurcharge"),
    @XmlEnumValue("Gratuity")
    GRATUITY("Gratuity"),
    @XmlEnumValue("Greeter")
    GREETER("Greeter"),
    @XmlEnumValue("HolidaySurcharge")
    HOLIDAY_SURCHARGE("HolidaySurcharge"),
    @XmlEnumValue("LatePM_Fee")
    LATE_PM_FEE("LatePM_Fee"),
    @XmlEnumValue("Mandatory")
    MANDATORY("Mandatory"),
    @XmlEnumValue("MandatoryChargesTotal")
    MANDATORY_CHARGES_TOTAL("MandatoryChargesTotal"),
    @XmlEnumValue("MeetAndGreet")
    MEET_AND_GREET("MeetAndGreet"),
    @XmlEnumValue("Optional")
    OPTIONAL("Optional"),
    @XmlEnumValue("Parking")
    PARKING("Parking"),
    @XmlEnumValue("ParkingFees")
    PARKING_FEES("ParkingFees"),
    @XmlEnumValue("PayOnArrivalAmount")
    PAY_ON_ARRIVAL_AMOUNT("PayOnArrivalAmount"),
    @XmlEnumValue("PetSurcharge")
    PET_SURCHARGE("PetSurcharge"),
    @XmlEnumValue("Phone")
    PHONE("Phone"),
    @XmlEnumValue("PrepaidFuel")
    PREPAID_FUEL("PrepaidFuel"),
    @XmlEnumValue("PrepayAmount")
    PREPAY_AMOUNT("PrepayAmount"),
    @XmlEnumValue("PushCart")
    PUSH_CART("PushCart"),
    @XmlEnumValue("RateOverride")
    RATE_OVERRIDE("RateOverride"),
    @XmlEnumValue("RegistrationFee")
    REGISTRATION_FEE("RegistrationFee"),
    @XmlEnumValue("Representative")
    REPRESENTATIVE("Representative"),
    @XmlEnumValue("Senior")
    SENIOR("Senior"),
    @XmlEnumValue("SpecialRequest")
    SPECIAL_REQUEST("SpecialRequest"),
    @XmlEnumValue("StandardGratuity")
    STANDARD_GRATUITY("StandardGratuity"),
    @XmlEnumValue("Stop")
    STOP("Stop"),
    @XmlEnumValue("Subtotal")
    SUBTOTAL("Subtotal"),
    @XmlEnumValue("Surcharge")
    SURCHARGE("Surcharge"),
    @XmlEnumValue("SurfaceTransportationCharge(STC)")
    SURFACE_TRANSPORTATION_CHARGE_STC("SurfaceTransportationCharge(STC)"),
    @XmlEnumValue("Tax")
    TAX("Tax"),
    @XmlEnumValue("Tip")
    TIP("Tip"),
    @XmlEnumValue("Tolls")
    TOLLS("Tolls"),
    @XmlEnumValue("TravelTimeFee")
    TRAVEL_TIME_FEE("TravelTimeFee"),
    @XmlEnumValue("VehicleCollection")
    VEHICLE_COLLECTION("VehicleCollection"),
    @XmlEnumValue("VehicleDelivery")
    VEHICLE_DELIVERY("VehicleDelivery"),
    @XmlEnumValue("VehicleLicenseFee")
    VEHICLE_LICENSE_FEE("VehicleLicenseFee"),
    @XmlEnumValue("VehicleRental")
    VEHICLE_RENTAL("VehicleRental"),
    @XmlEnumValue("WaitTime")
    WAIT_TIME("WaitTime"),
    @XmlEnumValue("WinterServiceCharge")
    WINTER_SERVICE_CHARGE("WinterServiceCharge"),
    @XmlEnumValue("YoungDriver")
    YOUNG_DRIVER("YoungDriver"),

    /**
     * Use: Select this enumeration to exchange a value that is not in the enumerated list by entering the value information in the Code Extension fields.
     * 
     */
    @XmlEnumValue("Other_")
    OTHER("Other_");
    private final String value;

    ListVehChargePurposeBase(String v) {
        value = v;
    }

    public String value() {
        return value;
    }

    public static ListVehChargePurposeBase fromValue(String v) {
        for (ListVehChargePurposeBase c: ListVehChargePurposeBase.values()) {
            if (c.value.equals(v)) {
                return c;
            }
        }
        throw new IllegalArgumentException(v);
    }

}
