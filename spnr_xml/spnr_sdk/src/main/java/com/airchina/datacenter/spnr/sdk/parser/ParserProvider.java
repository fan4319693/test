package com.airchina.datacenter.spnr.sdk.parser;

import com.airchina.datacenter.spnr.sdk.dao.pojo.*;
import com.airchina.datacenter.spnr.sdk.parser.impl.*;
import com.airchina.datacenter.spnr.sdk.serde.impl.FieldsArrayStrategy;
import com.google.common.collect.ImmutableMap;
import com.google.common.collect.Sets;

import java.util.Map;
import java.util.Set;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.ParserProvider </p>
 * <p>Description: Parser转换器的容器 </p>
 * <p>Sample: ParserProvider.provide("SuperPNRPo") </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class ParserProvider {

    /**
     * Description: 注册转换器时对名称作的规范化统一处理
     * Parameter:
     *  @param key: 转换器的名称, 不能为null
     * Return: 规范化的名称
     * Throws: 无
     */
    private static String formalizeKey(String key){
        return key.toUpperCase();
    }

    /**
     * 功能说明: 转换器的容器, key为名称, value为转换器
     * 最后修改时间: 2023/04/20
     */
    private static final Map<String, AbstractParser> parserMap = ImmutableMap.<String, AbstractParser>builder()
            .put(formalizeKey("SuperPNRPo"), new SuperPnrParser(new FieldsArrayStrategy(SuperPNRPo.class)))
            .put(formalizeKey("Spnr_POSPo"), new SpnrPOSParser(new FieldsArrayStrategy(Spnr_POSPo.class)))
            .put(formalizeKey("Spnr_RemarksPo"), new SpnrRemarksParser(new FieldsArrayStrategy(Spnr_RemarksPo.class)))
            .put(formalizeKey("Spnr_QueuesPo"), new SpnrQueuesParser(new FieldsArrayStrategy(Spnr_QueuesPo.class)))
            .put(formalizeKey("Spnr_AuditsPo"), new SpnrAuditsParser(new FieldsArrayStrategy(Spnr_AuditsPo.class)))
            .put(formalizeKey("Spnr_AssociatedBookingPo"), new SpnrAssociatedBookingParser(new FieldsArrayStrategy(Spnr_AssociatedBookingPo.class)))
            .put(formalizeKey("Spnr_ContactPo"), new SpnrContactParser(new FieldsArrayStrategy(Spnr_ContactPo.class)))
            .put(formalizeKey("Spnr_PassengersPo"), new SpnrPassengersParser(new FieldsArrayStrategy(Spnr_PassengersPo.class)))
            .put(formalizeKey("Spnr_PricingPo"), new SpnrPricingParser(new FieldsArrayStrategy(Spnr_PricingPo.class)))
            .put(formalizeKey("Spnr_PriceAdjustmentPo"), new SpnrPriceAdjustmentParser(new FieldsArrayStrategy(Spnr_PriceAdjustmentPo.class)))
            .put(formalizeKey("Spnr_AmendmentFeePo"), new SpnrAmendmentFeeParser(new FieldsArrayStrategy(Spnr_AmendmentFeePo.class)))
            .put(formalizeKey("Spnr_PaymentDetailsPo"), new SpnrPaymentDetailsParser(new FieldsArrayStrategy(Spnr_PaymentDetailsPo.class)))
            .put(formalizeKey("Spnr_PaymentInfoPo"), new SpnrPaymentInfoParser(new FieldsArrayStrategy(Spnr_PaymentInfoPo.class)))
            .put(formalizeKey("Spnr_MPPo"), new SpnrMpParser(new FieldsArrayStrategy(Spnr_MPPo.class)))
            .put(formalizeKey("MP_RemarksPo"), new MpRemarkParser(new FieldsArrayStrategy(MP_RemarksPo.class)))
            .put(formalizeKey("MP_PTCsPo"), new MpPTCsParser(new FieldsArrayStrategy(MP_PTCsPo.class)))
            .put(formalizeKey("MP_PricingPo"), new MpPricingParser(new FieldsArrayStrategy(MP_PricingPo.class)))
            .put(formalizeKey("MP_Pricing_PriceAdjustmentsPo"), new MpPricingPriceAdjustmentsParser(new FieldsArrayStrategy(MP_Pricing_PriceAdjustmentsPo.class)))
            .put(formalizeKey("MP_Pricing_CancellationRefundsPo"), new MpPricingCancellationRefundsParser(new FieldsArrayStrategy(MP_Pricing_CancellationRefundsPo.class)))
            .put(formalizeKey("MP_Pricing_CancellationFeesPo"), new MpPricingCancellationFeesParser(new FieldsArrayStrategy(MP_Pricing_CancellationFeesPo.class)))
            .put(formalizeKey("MP_Pricing_AmendmentFeePo"), new MpPricingAmendmentFeeParser(new FieldsArrayStrategy(MP_Pricing_AmendmentFeePo.class)))
            .put(formalizeKey("MP_PaymentRefsPo"), new MpPaymentRefsParser(new FieldsArrayStrategy(MP_PaymentRefsPo.class)))
            .put(formalizeKey("MP_ModifyTypesPo"), new MpModifyTypesParser(new FieldsArrayStrategy(MP_ModifyTypesPo.class)))
            .put(formalizeKey("MP_BaggagePo"), new MpBaggageParser(new FieldsArrayStrategy(MP_BaggagePo.class)))
            .put(formalizeKey("MP_Baggage_SegmentPo"), new MpBaggageSegmentParser(new FieldsArrayStrategy(MP_Baggage_SegmentPo.class)))
            .put(formalizeKey("MP_Baggage_TravelerPo"), new MpBaggageTravelerParser(new FieldsArrayStrategy(MP_Baggage_TravelerPo.class)))
            .put(formalizeKey("MP_AuditsPo"), new MpAuditsParser(new FieldsArrayStrategy(MP_AuditsPo.class)))
            .put(formalizeKey("MP_AncillaryProductPo"), new MpAncillaryProductParser(new FieldsArrayStrategy(MP_AncillaryProductPo.class)))
            .put(formalizeKey("MP_AirTravelerInfoPo"), new MpAirTravelerInfoParser(new FieldsArrayStrategy(MP_AirTravelerInfoPo.class)))
            .put(formalizeKey("MP_AirTicketingPo"), new MpAirTicketingParser(new FieldsArrayStrategy(MP_AirTicketingPo.class)))
            .put(formalizeKey("MP_AirPriceInfo_PTCsPo"), new MpAirPriceInfoPTCsParser(new FieldsArrayStrategy(MP_AirPriceInfo_PTCsPo.class)))
            .put(formalizeKey("MP_AirPriceInfo_ItinTotalFarePo"), new MpAirPriceInfoItinTotalFareParser(new FieldsArrayStrategy(MP_AirPriceInfo_ItinTotalFarePo.class)))
            .put(formalizeKey("MP_AirPriceInfo_FareInfosPo"), new MpAirPriceInfoFareInfosParser(new FieldsArrayStrategy(MP_AirPriceInfo_FareInfosPo.class)))
            .put(formalizeKey("MP_AirPriceInfo_FareFamilyPo"), new MpAirPriceInfoFareFamilyParser(new FieldsArrayStrategy(MP_AirPriceInfo_FareFamilyPo.class)))
            .put(formalizeKey("MP_AirAirItineraryPo"), new MpAirAirItineraryParser(new FieldsArrayStrategy(MP_AirAirItineraryPo.class)))
            .put(formalizeKey("MP_AirAirItinerary_BaggagePo"), new MpAirAirItineraryBaggageParser(new FieldsArrayStrategy(MP_AirAirItinerary_BaggagePo.class)))
            .put(formalizeKey("MP_AirAirItinerary_SegmentPo"), new MpAirAirItinerarySegmentParser(new FieldsArrayStrategy(MP_AirAirItinerary_SegmentPo.class)))
            .put(formalizeKey("MP_ItineraryReceiptPo"), new MpItineraryReceiptParser(new FieldsArrayStrategy(MP_ItineraryReceiptPo.class)))
            .put(formalizeKey("MP_AP_GroundTransportPo"), new MpApGroundTransportParser(new FieldsArrayStrategy(new MP_AP_GroundTransportPo().getClass())))
            .put(formalizeKey("MP_AP_LoungePo"), new MpApLoungeParser(new FieldsArrayStrategy(MP_AP_LoungePo.class)))
            .put(formalizeKey("MP_AP_TicketingPo"), new MpApTicketingParser(new FieldsArrayStrategy(MP_AP_TicketingPo.class)))
            .put(formalizeKey("MP_AP_SegmentPo"), new MpApSegmentParser(new FieldsArrayStrategy(MP_AP_SegmentPo.class)))
            .put(formalizeKey("MP_AP_TravelerPo"), new MpApTravelerParser(new FieldsArrayStrategy(MP_AP_TravelerPo.class)))
            //如果要解析新的Hive表,在这里注册

            .put(formalizeKey("MP_AP_Carbon_OffsetPo"), new MpApCarbonOffsetParser(new FieldsArrayStrategy(MP_AP_Carbon_OffsetPo.class)))
            .put(formalizeKey("MP_AP_GroundTransport_BusPo"), new MpApGroundTransportBusParser(new FieldsArrayStrategy(MP_AP_GroundTransport_BusPo.class)))
            .put(formalizeKey("MP_AP_Original_SegmentPo"), new MpApOrignalSegmentParser(new FieldsArrayStrategy(MP_AP_Original_SegmentPo.class)))
            .put(formalizeKey("MP_CouplesPo"), new MpCouplesParser(new FieldsArrayStrategy(MP_CouplesPo.class)))
            .put(formalizeKey("Mp_Hotel_Air_TicketingPo"), new MpHotelAirTicketingParser(new FieldsArrayStrategy(Mp_Hotel_Air_TicketingPo.class)))
            .put(formalizeKey("MP_Hotel_GuestPo"), new MpHotelGuestParser(new FieldsArrayStrategy(MP_Hotel_GuestPo.class)))
            .put(formalizeKey("MP_Hotel_RatesPo"), new MpHotelRatesParser(new FieldsArrayStrategy(MP_Hotel_RatesPo.class)))
            .put(formalizeKey("MP_Hotel_RoomTypePo"), new MpHotelRoomTypeParser(new FieldsArrayStrategy(MP_Hotel_RoomTypePo.class)))
            .put(formalizeKey("MP_HotelPo"), new MpHotelParser(new FieldsArrayStrategy(MP_HotelPo.class)))

            .build();

    /**
     * Description: 根据名称获取转换器
     * Parameter:
     *  @param name: 转换器名称, 不能为null
     * Return: 目标转换器
     * Throws: 若不存在则抛出非法参数异常
     */
    public static AbstractParser provide(final String name){
        String key = formalizeKey(name);
        AbstractParser parser = parserMap.get(key);
        if(parser == null){
            throw new IllegalArgumentException("The tableName " + name + " not found");
        }
        return parser;
    }

    /**
     * Description: 获取所有转换器的名称
     * Parameter: 无
     * Return: 转换器的名称集合
     * Throws: 无
     */
    public static Set<String> getAllTableNames(){
        return Sets.newHashSet(parserMap.keySet());
    }
}
