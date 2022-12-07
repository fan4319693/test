package com.airchina.datacenter.spnr.udf.utils;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirAirItineraryPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirAirItinerary_baggagePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirAirItinerary_segmentPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirPriceInfo_FareInfosPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirPriceInfo_ItinTotalFarePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirPriceInfo_PTCsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirPriceInfo_farefamilyPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirTicketingPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AirTravelerInfoPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AncillaryProductPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_AuditsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_BaggagePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_ModifyTypesPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_PaymentRefsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_PricingPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_Pricing_AmendmentFeePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_Pricing_CancellationFeesPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_Pricing_CancellationRefundsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_Pricing_PriceAdjustmentsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_PtcsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_RemarksPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AmendmentFeePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AssociatedBookingPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AuditsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_MPPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_POSPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PaymentDetailsPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PaymentinfoPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PriceAdjustmentPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PricingPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_QueuesPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_contactPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_passengersPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_remarksPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.SuperPNRPo;
import com.google.common.collect.Maps;
import java.io.Serializable;
import java.lang.reflect.Field;
import java.util.Collections;
import java.util.List;
import java.util.Map;
import java.util.function.BiFunction;
import java.util.stream.Collectors;

public class XmlTables implements Serializable {

    @SuppressWarnings({"unchecked", "rawtypes"})
    private static final BiFunction<Object, ClassMapper, List> FUNC = (javaObj, mapper) -> {
        // we can not apply BiFunc with Func because mapper not initialized
        // BiFunc.apply(Func.apply())
        if (javaObj instanceof List) {
            return (List) ((List) javaObj).stream().map(row -> processOneRow(mapper, row)).collect(Collectors.toList());
        }
        return javaObj == null ? Collections.EMPTY_LIST : Collections.singletonList(processOneRow(mapper, javaObj));
    };

    private static Object[] processOneRow(ClassMapper mapper, Object obj) {
        Object[] row = new Object[mapper.getJavaFieldNum()];
        try {
            Field[] javaFields = mapper.getJavaFields();
            for (int i = 0; i < mapper.getJavaFieldNum(); i++) {
                javaFields[i].setAccessible(true);
                row[i] = javaFields[i].get(obj);
            }
        } catch (IllegalAccessException e) {
            e.printStackTrace();
        }
        return row;
    }

    public static final Map<String, ClassMapper> TABLE_CLASSES;

    static {
        TABLE_CLASSES = Maps.newHashMap();

        TABLE_CLASSES.put("MP_AirAirItinerary_segmentPo".toLowerCase(),
            new ClassMapper(MP_AirAirItinerary_segmentPo.class, SPNRContext::getMpAirAirItinerarySegmentPos, FUNC));

        TABLE_CLASSES.put("MP_AirAirItinerary_baggagePo".toLowerCase(),
            new ClassMapper(MP_AirAirItinerary_baggagePo.class, SPNRContext::getMpAirAirItineraryBaggagePos, FUNC));

        TABLE_CLASSES.put("MP_AirAirItineraryPo".toLowerCase(),
            new ClassMapper(MP_AirAirItineraryPo.class, SPNRContext::getMpAirAirItineraryPos, FUNC));

        TABLE_CLASSES.put("MP_AirPriceInfo_farefamilyPo".toLowerCase(),
            new ClassMapper(MP_AirPriceInfo_farefamilyPo.class, SPNRContext::getMPAirPriceInfoFarefamilyPos, FUNC));

        TABLE_CLASSES.put("MP_AirPriceInfo_FareInfosPo".toLowerCase(),
            new ClassMapper(MP_AirPriceInfo_FareInfosPo.class, SPNRContext::getMPAirPriceInfoInfoFareInfosPos, FUNC));

        TABLE_CLASSES.put("MP_AirPriceInfo_ItinTotalFarePo".toLowerCase(),
            new ClassMapper(MP_AirPriceInfo_ItinTotalFarePo.class, SPNRContext::getMpAirPriceInfoItinTotalFarePos,
                FUNC));

        TABLE_CLASSES.put("MP_AirPriceInfo_PTCsPo".toLowerCase(),
            new ClassMapper(MP_AirPriceInfo_PTCsPo.class, SPNRContext::getMPAirPriceInfoPtCsPos, FUNC));

        TABLE_CLASSES.put("MP_AirTicketingPo".toLowerCase(),
            new ClassMapper(MP_AirTicketingPo.class, SPNRContext::getMPAirTicketingPos, FUNC));

        TABLE_CLASSES.put("MP_AirTravelerInfoPo".toLowerCase(),
            new ClassMapper(MP_AirTravelerInfoPo.class, SPNRContext::getMPAirTravelerInfoPos, FUNC));

        TABLE_CLASSES.put("MP_AncillaryProductPo".toLowerCase(),
            new ClassMapper(MP_AncillaryProductPo.class, SPNRContext::getMpAncillaryProductPos, FUNC));

        TABLE_CLASSES.put("MP_AuditsPo".toLowerCase(),
            new ClassMapper(MP_AuditsPo.class, SPNRContext::getMPAuditsPos, FUNC));

        TABLE_CLASSES.put("MP_BaggagePo".toLowerCase(),
            new ClassMapper(MP_BaggagePo.class, SPNRContext::getMpBaggagePos, FUNC));

        TABLE_CLASSES.put("MP_ModifyTypesPo".toLowerCase(),
            new ClassMapper(MP_ModifyTypesPo.class, SPNRContext::getMPModifyTypesPos, FUNC));

        TABLE_CLASSES.put("MP_PaymentRefsPo".toLowerCase(),
            new ClassMapper(MP_PaymentRefsPo.class, SPNRContext::getMPPaymentRefsPos, FUNC));

        TABLE_CLASSES.put("MP_Pricing_AmendmentFeePo".toLowerCase(),
            new ClassMapper(MP_Pricing_AmendmentFeePo.class, SPNRContext::getMPPricingAmendmentFeePos, FUNC));

        TABLE_CLASSES.put("MP_Pricing_CancellationFeesPo".toLowerCase(),
            new ClassMapper(MP_Pricing_CancellationFeesPo.class, SPNRContext::getMPPricingCancellationFeesPos, FUNC));

        TABLE_CLASSES.put("MP_Pricing_CancellationRefundsPo".toLowerCase(),
            new ClassMapper(MP_Pricing_CancellationRefundsPo.class, SPNRContext::getMPPricingCancellationRefundsPos,
                FUNC));

        TABLE_CLASSES.put("MP_Pricing_PriceAdjustmentsPo".toLowerCase(),
            new ClassMapper(MP_Pricing_PriceAdjustmentsPo.class, SPNRContext::getMPPricingPriceAdjustmentsPos, FUNC));

        TABLE_CLASSES.put("MP_PricingPo".toLowerCase(),
            new ClassMapper(MP_PricingPo.class, SPNRContext::getMpPricingPos, FUNC));

        TABLE_CLASSES.put("MP_PtcsPo".toLowerCase(), new ClassMapper(MP_PtcsPo.class, SPNRContext::getMpPTCsPos, FUNC));

        TABLE_CLASSES.put("MP_RemarksPo".toLowerCase(),
            new ClassMapper(MP_RemarksPo.class, SPNRContext::getMPRemarksPos, FUNC));

        TABLE_CLASSES.put("Spnr_AmendmentFeePo".toLowerCase(),
            new ClassMapper(Spnr_AmendmentFeePo.class, SPNRContext::getSPnrAmendmentFeePos, FUNC));

        TABLE_CLASSES.put("Spnr_AssociatedBookingPo".toLowerCase(),
            new ClassMapper(Spnr_AssociatedBookingPo.class, SPNRContext::getSPnrAssociatedBookingPos, FUNC));

        TABLE_CLASSES.put("Spnr_AuditsPo".toLowerCase(),
            new ClassMapper(Spnr_AuditsPo.class, SPNRContext::getSPnrAuditsPos, FUNC));

        TABLE_CLASSES.put("Spnr_contactPo".toLowerCase(),
            new ClassMapper(Spnr_contactPo.class, SPNRContext::getSPnrContactPo, FUNC));

        TABLE_CLASSES.put("Spnr_MPPo".toLowerCase(),
            new ClassMapper(Spnr_MPPo.class, SPNRContext::getSpnrMpList, FUNC));

        TABLE_CLASSES.put("Spnr_passengersPo".toLowerCase(),
            new ClassMapper(Spnr_passengersPo.class, SPNRContext::getSPnrPassengersPos, FUNC));

        TABLE_CLASSES.put("Spnr_PaymentDetailsPo".toLowerCase(),
            new ClassMapper(Spnr_PaymentDetailsPo.class, SPNRContext::getSPnrPaymentDetailsPo, FUNC));

        TABLE_CLASSES.put("Spnr_PaymentinfoPo".toLowerCase(),
            new ClassMapper(Spnr_PaymentinfoPo.class, SPNRContext::getSPnrPaymentInfoPos, FUNC));

        TABLE_CLASSES.put("Spnr_POSPo".toLowerCase(),
            new ClassMapper(Spnr_POSPo.class, SPNRContext::getsPnrPosPo, FUNC));

        TABLE_CLASSES.put("Spnr_PriceAdjustmentPo".toLowerCase(),
            new ClassMapper(Spnr_PriceAdjustmentPo.class, SPNRContext::getSPnrPriceAdjustmentPos, FUNC));

        TABLE_CLASSES.put("Spnr_PricingPo".toLowerCase(),
            new ClassMapper(Spnr_PricingPo.class, SPNRContext::getSPnrPricingPo, FUNC));

        TABLE_CLASSES.put("Spnr_QueuesPo".toLowerCase(),
            new ClassMapper(Spnr_QueuesPo.class, SPNRContext::getSPNRQueuesPos, FUNC));

        TABLE_CLASSES.put("Spnr_remarksPo".toLowerCase(),
            new ClassMapper(Spnr_remarksPo.class, SPNRContext::getSPnrRemarksPos, FUNC));

        TABLE_CLASSES.put("SuperPNRPo".toLowerCase(), new ClassMapper(SuperPNRPo.class, SPNRContext::getsPnrPo, FUNC));
    }

    public static ClassMapper get(String tableName_lc) {
        return TABLE_CLASSES.get(tableName_lc);
    }
}
