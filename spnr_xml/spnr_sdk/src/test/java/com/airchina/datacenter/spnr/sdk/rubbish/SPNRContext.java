package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.*;
import java.util.LinkedList;
import java.util.List;

/**
 * SPNR解析结果，
 *
 * @author wgni
 * @since 2022/7/4
 */
public class SPNRContext {

    public String getSPnrID() {
        return this.sPnrPo.getSuperPnrId();
    }

    public SuperPNRPo getSpnrPo() {
        return sPnrPo;
    }

    public void setSpnrPo(SuperPNRPo spnrPo) {
        this.sPnrPo = spnrPo;
    }

    public List<Spnr_MPPo> getSpnrMpList() {
        return spnrMpList;
    }

    public List<MP_AirAirItineraryPo> getMpAirAirItineraryPos() {
        return mpAirAirItineraryPos;
    }

    public List<MP_AirAirItinerary_segmentPo> getMpAirAirItinerarySegmentPos() {
        return mpAirAirItinerarySegmentPos;
    }

    public Spnr_POSPo getsPnrPosPo() {
        return sPnrPosPo;
    }

    public void setSPnrPosPo(Spnr_POSPo sPnrPosPo) {
        this.sPnrPosPo = sPnrPosPo;
    }


    public SuperPNRPo getsPnrPo() {
        return sPnrPo;
    }

    public void setsPnrPo(SuperPNRPo sPnrPo) {
        this.sPnrPo = sPnrPo;
    }

    public List<Spnr_contactPo> getSPnrContactPo() {
        return sPnrContactPo;
    }

    public List<Spnr_passengersPo> getSPnrPassengersPos() {
        return sPnrPassengersPos;
    }

    public List<Spnr_AuditsPo> getSPnrAuditsPos() {
        return sPnrAuditsPos;
    }

    public List<Spnr_QueuesPo> getSPNRQueuesPos() {
        return spnrQueuesPos;
    }

    public Spnr_PricingPo getSPnrPricingPo() {
        return sPnrPricingPo;
    }

    public void setSPnrPricingPo(Spnr_PricingPo sPnrPricingPo) {
        this.sPnrPricingPo = sPnrPricingPo;
    }

    public List<Spnr_PriceAdjustmentPo> getSPnrPriceAdjustmentPos() {
        return sPnrPriceAdjustmentPos;
    }

    public List<Spnr_AmendmentFeePo> getSPnrAmendmentFeePos() {
        return sPnrAmendmentFeePos;
    }

    public Spnr_PaymentDetailsPo getSPnrPaymentDetailsPo() {
        return sPnrPaymentDetailsPo;
    }

    public void setSPnrPaymentDetailsPo(Spnr_PaymentDetailsPo sPnrPaymentDetailsPo) {
        this.sPnrPaymentDetailsPo = sPnrPaymentDetailsPo;
    }

    public List<Spnr_PaymentinfoPo> getSPnrPaymentInfoPos() {
        return sPnrPaymentInfoPos;
    }

    public List<Spnr_remarksPo> getSPnrRemarksPos() {
        return sPnrRemarksPos;
    }

    public List<Spnr_AssociatedBookingPo> getSPnrAssociatedBookingPos() {
        return sPnrAssociatedBookingPos;
    }

    public List<MP_AirAirItinerary_baggagePo> getMpAirAirItineraryBaggagePos() {
        return mpAirAirItineraryBaggagePos;
    }

    public MP_AirPriceInfo_ItinTotalFarePo getMpAirPriceInfoItinTotalFarePos() {
        return mpAirPriceInfoItinTotalFarePos;
    }

    public void setMpAirPriceInfoItinTotalFarePos(MP_AirPriceInfo_ItinTotalFarePo mpAirPriceInfoItinTotalFarePos) {
        this.mpAirPriceInfoItinTotalFarePos = mpAirPriceInfoItinTotalFarePos;
    }

    public List<MP_AirPriceInfo_PTCsPo> getMPAirPriceInfoPtCsPos() {
        return this.mpAirPriceInfoPtCsPos;
    }

    public List<MP_AirPriceInfo_FareInfosPo> getMPAirPriceInfoInfoFareInfosPos() {
        return this.mpAirPriceInfoInfoFareInfosPos;
    }

    public List<MP_AirPriceInfo_farefamilyPo> getMPAirPriceInfoFarefamilyPos() {
        return this.mpAirPriceInfoFarefamilyPos;
    }

    public List<MP_AirTravelerInfoPo> getMPAirTravelerInfoPos() {
        return mpAirTravelerInfoPos;
    }

    public List<MP_AirTicketingPo> getMPAirTicketingPos() {
        return this.mpAirTicketingPos;
    }

    public List<MP_AncillaryProductPo> getMpAncillaryProductPos() {
        return mpAncillaryProductPos;
    }

    public List<MP_BaggagePo> getMpBaggagePos() {
        return mpBaggagePos;
    }

    public List<MP_PricingPo> getMpPricingPos(){
        return mpPricingPos;
    }

    public List<MP_Pricing_PriceAdjustmentsPo> getMPPricingPriceAdjustmentsPos() {
        return mpPricingPriceAdjustmentsPos;
    }

    public List<MP_Pricing_AmendmentFeePo> getMPPricingAmendmentFeePos() {
        return mpPricingAmendmentFeePos;
    }

    public List<MP_Pricing_CancellationFeesPo> getMPPricingCancellationFeesPos() {
        return mpPricingCancellationFeesPos;
    }

    public List<MP_Pricing_CancellationRefundsPo> getMPPricingCancellationRefundsPos() {
        return mpPricingCancellationRefundsPos;
    }

    public List<MP_RemarksPo> getMPRemarksPos() {
        return mpRemarksPos;
    }

    public List<MP_AuditsPo> getMPAuditsPos() {
        return mpAuditsPos;
    }

    public List<MP_PtcsPo> getMpPTCsPos() {
        return mpPTCsPos;
    }


    public List<MP_ModifyTypesPo> getMPModifyTypesPos() {
        return mpModifyTypesPos;
    }

    public List<MP_PaymentRefsPo> getMPPaymentRefsPos() {
        return mpPaymentRefsPos;
    }

    public List<MP_itineraryreceiptPo> getMpItineraryReceiptPos() {
        return mpItineraryReceiptPos;
    }

    public List<MP_AP_TicketingPo> getMpApTicketingPoList() {
        return mpApTicketingPoList;
    }

    public List<MP_AP_LoungePo> getMpApLoungePoList() {
        return mpApLoungePoList;
    }

    public List<MP_AP_GroundTransportPo> getMpApGroundTransportPoList() {
        return mpApGroundTransportPoList;
    }

    public List<MP_AP_SegmentPo> getMpApSegmentList() {
        return mpApSegmentList;
    }

    public List<MP_AP_TravelerPo> getMpApTravelerList() {
        return mpApTravelerList;
    }

    public List<MP_Baggage_SegmentPo> getMpBaggageSegmentList() {
        return mpBaggageSegmentList;
    }

    public List<MP_Baggage_TravelerPo> getMpBaggageTravelerList() {
        return mpBaggageTravelerList;
    }


    private SuperPNRPo sPnrPo;
    private Spnr_POSPo sPnrPosPo;
    private final List<Spnr_MPPo> spnrMpList = new LinkedList<>();
    private final List<Spnr_contactPo> sPnrContactPo = new LinkedList<>();
    private final List<Spnr_passengersPo> sPnrPassengersPos = new LinkedList<>();
    private final List<Spnr_AuditsPo> sPnrAuditsPos = new LinkedList<>();
    private final List<Spnr_QueuesPo> spnrQueuesPos = new LinkedList<>();
    private Spnr_PricingPo sPnrPricingPo;
    private final List<Spnr_PriceAdjustmentPo> sPnrPriceAdjustmentPos = new LinkedList<>();
    private final List<Spnr_AmendmentFeePo> sPnrAmendmentFeePos = new LinkedList<>();
    private Spnr_PaymentDetailsPo sPnrPaymentDetailsPo;
    private final List<Spnr_PaymentinfoPo> sPnrPaymentInfoPos = new LinkedList<>();
    private final List<Spnr_remarksPo> sPnrRemarksPos = new LinkedList<>();
    private final List<Spnr_AssociatedBookingPo> sPnrAssociatedBookingPos = new LinkedList<>();
    private final List<MP_AirAirItineraryPo> mpAirAirItineraryPos = new LinkedList<>();
    private final List<MP_AirAirItinerary_segmentPo> mpAirAirItinerarySegmentPos = new LinkedList<>();
    private final List<MP_AirAirItinerary_baggagePo> mpAirAirItineraryBaggagePos = new LinkedList<>();
    private MP_AirPriceInfo_ItinTotalFarePo mpAirPriceInfoItinTotalFarePos;
    private final List<MP_AirPriceInfo_PTCsPo> mpAirPriceInfoPtCsPos = new LinkedList<>();
    private final List<MP_AirPriceInfo_FareInfosPo> mpAirPriceInfoInfoFareInfosPos = new LinkedList<>();
    private final List<MP_AirPriceInfo_farefamilyPo> mpAirPriceInfoFarefamilyPos = new LinkedList<>();
    private final List<MP_AirTravelerInfoPo> mpAirTravelerInfoPos = new LinkedList<>();
    private final List<MP_AirTicketingPo> mpAirTicketingPos = new LinkedList<>();
    private final List<MP_AncillaryProductPo> mpAncillaryProductPos = new LinkedList<>();
    private final List<MP_BaggagePo> mpBaggagePos = new LinkedList<>();
    private final List<MP_PricingPo> mpPricingPos = new LinkedList<>();
    private final List<MP_Pricing_PriceAdjustmentsPo> mpPricingPriceAdjustmentsPos = new LinkedList<>();
    private final List<MP_Pricing_AmendmentFeePo> mpPricingAmendmentFeePos = new LinkedList<>();
    private final List<MP_Pricing_CancellationFeesPo> mpPricingCancellationFeesPos = new LinkedList<>();
    private final List<MP_Pricing_CancellationRefundsPo> mpPricingCancellationRefundsPos = new LinkedList<>();
    private final List<MP_RemarksPo> mpRemarksPos = new LinkedList<>();
    private final List<MP_AuditsPo> mpAuditsPos = new LinkedList<>();
    private final List<MP_PtcsPo> mpPTCsPos = new LinkedList<>();
    private final List<MP_ModifyTypesPo> mpModifyTypesPos = new LinkedList<>();
    private final List<MP_PaymentRefsPo> mpPaymentRefsPos = new LinkedList<>();

    private final List<MP_itineraryreceiptPo> mpItineraryReceiptPos = new LinkedList<>();

    private final List<MP_AP_TicketingPo> mpApTicketingPoList = new LinkedList<>();

    private final List<MP_AP_LoungePo> mpApLoungePoList = new LinkedList<>();

    private final List<MP_AP_GroundTransportPo> mpApGroundTransportPoList = new LinkedList<>();

    //=====范帅添加====

    private final List<MP_AP_SegmentPo> mpApSegmentList = new LinkedList<>();

    private final List<MP_AP_TravelerPo> mpApTravelerList = new LinkedList<>();

    private final List<MP_Baggage_SegmentPo> mpBaggageSegmentList = new LinkedList<>();

    private final List<MP_Baggage_TravelerPo> mpBaggageTravelerList = new LinkedList<>();
}
