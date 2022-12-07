package com.airchina.datacenter.spnr.udf.processor;

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
import com.airchina.datacenter.spnr.sdk.dao.entity.MP_itineraryreceiptPo;
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
import java.util.Collections;
import java.util.List;
import java.util.Map;

/**
 * Dispatcher 需要初始化两部分：
 * 1. 静态代码块部分初始化 po名到字段信息的映射，后续根据传入的 obj 根据初始化好的字段信息直接拿值。
 * 2. convertContext 初始化 po 名到取值的映射
 */
public class Dispatcher {

    private static final Map<String, XmlProcessor> DISPATCHER = Maps.newHashMap();

    static {
        DISPATCHER.put("SuperPNRPo".toLowerCase(), new XmlProcessor(SuperPNRPo.class));

        DISPATCHER.put("Spnr_POSPo".toLowerCase(), new XmlProcessor(Spnr_POSPo.class));

        DISPATCHER.put("Spnr_remarksPo".toLowerCase(), new XmlProcessor(Spnr_remarksPo.class));

        DISPATCHER.put("Spnr_QueuesPo".toLowerCase(), new XmlProcessor(Spnr_QueuesPo.class));

        DISPATCHER.put("Spnr_PricingPo".toLowerCase(), new XmlProcessor(Spnr_PricingPo.class));

        DISPATCHER.put("Spnr_PriceAdjustmentPo".toLowerCase(), new XmlProcessor(Spnr_PriceAdjustmentPo.class));

        DISPATCHER.put("Spnr_PaymentinfoPo".toLowerCase(), new XmlProcessor(Spnr_PaymentinfoPo.class));

        DISPATCHER.put("Spnr_PaymentDetailsPo".toLowerCase(), new XmlProcessor(Spnr_PaymentDetailsPo.class));

        DISPATCHER.put("Spnr_passengersPo".toLowerCase(), new XmlProcessor(Spnr_passengersPo.class));

        DISPATCHER.put("Spnr_MPPo".toLowerCase(), new XmlProcessor(Spnr_MPPo.class));

        DISPATCHER.put("Spnr_contactPo".toLowerCase(), new XmlProcessor(Spnr_contactPo.class));

        DISPATCHER.put("Spnr_AuditsPo".toLowerCase(), new XmlProcessor(Spnr_AuditsPo.class));

        DISPATCHER.put("Spnr_AssociatedBookingPo".toLowerCase(), new XmlProcessor(Spnr_AssociatedBookingPo.class));

        DISPATCHER.put("Spnr_AmendmentFeePo".toLowerCase(), new XmlProcessor(Spnr_AmendmentFeePo.class));

        DISPATCHER.put("MP_RemarksPo".toLowerCase(), new XmlProcessor(MP_RemarksPo.class));

        DISPATCHER.put("MP_PtcsPo".toLowerCase(), new XmlProcessor(MP_PtcsPo.class));

        DISPATCHER.put("MP_PricingPo".toLowerCase(), new XmlProcessor(MP_PricingPo.class));

        DISPATCHER.put("MP_Pricing_PriceAdjustmentsPo".toLowerCase(),
            new XmlProcessor(MP_Pricing_PriceAdjustmentsPo.class));

        DISPATCHER.put("MP_Pricing_CancellationRefundsPo".toLowerCase(),
            new XmlProcessor(MP_Pricing_CancellationRefundsPo.class));

        DISPATCHER.put("MP_Pricing_CancellationFeesPo".toLowerCase(),
            new XmlProcessor(MP_Pricing_CancellationFeesPo.class));

        DISPATCHER.put("MP_Pricing_AmendmentFeePo".toLowerCase(), new XmlProcessor(MP_Pricing_AmendmentFeePo.class));

        DISPATCHER.put("MP_PaymentRefsPo".toLowerCase(), new XmlProcessor(MP_PaymentRefsPo.class));

        DISPATCHER.put("MP_ModifyTypesPo".toLowerCase(), new XmlProcessor(MP_ModifyTypesPo.class));

        DISPATCHER.put("MP_BaggagePo".toLowerCase(), new XmlProcessor(MP_BaggagePo.class));

        DISPATCHER.put("MP_AuditsPo".toLowerCase(), new XmlProcessor(MP_AuditsPo.class));

        DISPATCHER.put("MP_AncillaryProductPo".toLowerCase(), new XmlProcessor(MP_AncillaryProductPo.class));

        DISPATCHER.put("MP_AirTravelerInfoPo".toLowerCase(), new XmlProcessor(MP_AirTravelerInfoPo.class));

        DISPATCHER.put("MP_AirTicketingPo".toLowerCase(), new XmlProcessor(MP_AirTicketingPo.class));

        DISPATCHER.put("MP_AirPriceInfo_PTCsPo".toLowerCase(), new XmlProcessor(MP_AirPriceInfo_PTCsPo.class));

        DISPATCHER.put("MP_AirPriceInfo_ItinTotalFarePo".toLowerCase(),
            new XmlProcessor(MP_AirPriceInfo_ItinTotalFarePo.class));

        DISPATCHER.put("MP_AirPriceInfo_FareInfosPo".toLowerCase(),
            new XmlProcessor(MP_AirPriceInfo_FareInfosPo.class));

        DISPATCHER.put("MP_AirPriceInfo_farefamilyPo".toLowerCase(),
            new XmlProcessor(MP_AirPriceInfo_farefamilyPo.class));

        DISPATCHER.put("MP_AirAirItineraryPo".toLowerCase(), new XmlProcessor(MP_AirAirItineraryPo.class));

        DISPATCHER.put("MP_AirAirItinerary_baggagePo".toLowerCase(),
            new XmlProcessor(MP_AirAirItinerary_baggagePo.class));

        DISPATCHER.put("MP_AirAirItinerary_segmentPo".toLowerCase(),
            new XmlProcessor(MP_AirAirItinerary_segmentPo.class));

        DISPATCHER.put("MP_itineraryreceiptPo".toLowerCase(), new XmlProcessor(MP_itineraryreceiptPo.class));
    }

    public static Map<String, List> convertContext(SPNRContext spnrContext) {
        Map<String, List> ans = Maps.newHashMap();
        if (spnrContext.getSpnrPo() != null) {
            ans.put("SuperPNRPo".toLowerCase(), Collections.singletonList(spnrContext.getSpnrPo()));
        }

        if (spnrContext.getsPnrPosPo() != null) {
            ans.put("Spnr_POSPo".toLowerCase(), Collections.singletonList(spnrContext.getsPnrPosPo()));
        }

        if (spnrContext.getSPnrRemarksPos() != null) {
            ans.put("Spnr_remarksPo".toLowerCase(), spnrContext.getSPnrRemarksPos());
        }

        if (spnrContext.getSPnrPricingPo() != null) {
            ans.put("Spnr_PricingPo".toLowerCase(), Collections.singletonList(spnrContext.getSPnrPricingPo()));
        }

        if (spnrContext.getSPNRQueuesPos() != null) {
            ans.put("Spnr_QueuesPo".toLowerCase(), spnrContext.getSPNRQueuesPos());
        }

        if (spnrContext.getSPnrPriceAdjustmentPos() != null) {
            ans.put("Spnr_PriceAdjustmentPo".toLowerCase(), spnrContext.getSPnrPriceAdjustmentPos());
        }

        if (spnrContext.getSPnrPaymentInfoPos() != null) {
            ans.put("Spnr_PaymentinfoPo".toLowerCase(), spnrContext.getSPnrPaymentInfoPos());
        }

        if (spnrContext.getSPnrPaymentDetailsPo() != null) {
            ans.put("Spnr_PaymentDetailsPo".toLowerCase(),
                Collections.singletonList(spnrContext.getSPnrPaymentDetailsPo()));
        }

        if (spnrContext.getSPnrPassengersPos() != null) {
            ans.put("Spnr_passengersPo".toLowerCase(), spnrContext.getSPnrPassengersPos());
        }

        if (spnrContext.getSpnrMpList() != null) {
            ans.put("Spnr_MPPo".toLowerCase(), spnrContext.getSpnrMpList());
        }

        if (spnrContext.getSPnrContactPo() != null) {
            ans.put("Spnr_contactPo".toLowerCase(), spnrContext.getSPnrContactPo());
        }

        if (spnrContext.getSPnrAuditsPos() != null) {
            ans.put("Spnr_AuditsPo".toLowerCase(), spnrContext.getSPnrAuditsPos());
        }

        if (spnrContext.getSPnrAssociatedBookingPos() != null) {
            ans.put("Spnr_AssociatedBookingPo".toLowerCase(), spnrContext.getSPnrAssociatedBookingPos());
        }

        if (spnrContext.getSPnrAmendmentFeePos() != null) {
            ans.put("Spnr_AmendmentFeePo".toLowerCase(), spnrContext.getSPnrAmendmentFeePos());
        }

        if (spnrContext.getMPRemarksPos() != null) {
            ans.put("MP_RemarksPo".toLowerCase(), spnrContext.getMPRemarksPos());
        }

        if (spnrContext.getMpPTCsPos() != null) {
            ans.put("MP_PtcsPo".toLowerCase(), spnrContext.getMpPTCsPos());
        }

        if (spnrContext.getMpPricingPos() != null) {
            ans.put("MP_PricingPo".toLowerCase(), spnrContext.getMpPricingPos());
        }

        if (spnrContext.getMPPricingPriceAdjustmentsPos() != null) {
            ans.put("MP_Pricing_PriceAdjustmentsPo".toLowerCase(), spnrContext.getMPPricingPriceAdjustmentsPos());
        }

        if (spnrContext.getMPPricingCancellationRefundsPos() != null) {
            ans.put("MP_Pricing_CancellationRefundsPo".toLowerCase(), spnrContext.getMPPricingCancellationRefundsPos());
        }

        if (spnrContext.getMPPricingCancellationFeesPos() != null) {
            ans.put("MP_Pricing_CancellationFeesPo".toLowerCase(), spnrContext.getMPPricingCancellationFeesPos());
        }

        if (spnrContext.getMPPricingAmendmentFeePos() != null) {
            ans.put("MP_Pricing_AmendmentFeePo".toLowerCase(), spnrContext.getMPPricingAmendmentFeePos());
        }

        if (spnrContext.getMPPaymentRefsPos() != null) {
            ans.put("MP_PaymentRefsPo".toLowerCase(), spnrContext.getMPPaymentRefsPos());
        }

        if (spnrContext.getMPModifyTypesPos() != null) {
            ans.put("MP_ModifyTypesPo".toLowerCase(), spnrContext.getMPModifyTypesPos());
        }

        if (spnrContext.getMpBaggagePos() != null) {
            ans.put("MP_BaggagePo".toLowerCase(), spnrContext.getMpBaggagePos());
        }

        if (spnrContext.getMPAuditsPos() != null) {
            ans.put("MP_AuditsPo".toLowerCase(), spnrContext.getMPAuditsPos());
        }

        if (spnrContext.getMpAncillaryProductPos() != null) {
            ans.put("MP_AncillaryProductPo".toLowerCase(), spnrContext.getMpAncillaryProductPos());
        }

        if (spnrContext.getMPAirTravelerInfoPos() != null) {
            ans.put("MP_AirTravelerInfoPo".toLowerCase(), spnrContext.getMPAirTravelerInfoPos());
        }

        if (spnrContext.getMPAirTicketingPos() != null) {
            ans.put("MP_AirTicketingPo".toLowerCase(), spnrContext.getMPAirTicketingPos());
        }

        if (spnrContext.getMPAirPriceInfoPtCsPos() != null) {
            ans.put("MP_AirPriceInfo_PTCsPo".toLowerCase(), spnrContext.getMPAirPriceInfoPtCsPos());
        }

        if (spnrContext.getMpAirPriceInfoItinTotalFarePos() != null) {
            ans.put("MP_AirPriceInfo_ItinTotalFarePo".toLowerCase(),
                Collections.singletonList(spnrContext.getMpAirPriceInfoItinTotalFarePos()));
        }

        if (spnrContext.getMPAirPriceInfoInfoFareInfosPos() != null) {
            ans.put("MP_AirPriceInfo_FareInfosPo".toLowerCase(), spnrContext.getMPAirPriceInfoInfoFareInfosPos());
        }

        if (spnrContext.getMPAirPriceInfoFarefamilyPos() != null) {
            ans.put("MP_AirPriceInfo_farefamilyPo".toLowerCase(), spnrContext.getMPAirPriceInfoFarefamilyPos());
        }

        if (spnrContext.getMpAirAirItineraryPos() != null) {
            ans.put("MP_AirAirItineraryPo".toLowerCase(), spnrContext.getMpAirAirItineraryPos());
        }
        if (spnrContext.getMpAirAirItineraryBaggagePos() != null) {
            ans.put("MP_AirAirItinerary_baggagePo".toLowerCase(), spnrContext.getMpAirAirItineraryBaggagePos());
        }
        if (spnrContext.getMpAirAirItinerarySegmentPos() != null) {
            ans.put("MP_AirAirItinerary_segmentPo".toLowerCase(), spnrContext.getMpAirAirItinerarySegmentPos());
        }
        if (spnrContext.getMpItineraryReceiptPos() != null) {
            ans.put("MP_itineraryreceiptPo".toLowerCase(), spnrContext.getMpItineraryReceiptPos());
        }
        return ans;
    }

    public static XmlProcessor getProcessor(String tableNameLower) {
        return DISPATCHER.get(tableNameLower);
    }

    public static boolean contains(String tableNameLower) {
        return DISPATCHER.containsKey(tableNameLower);
    }
}
