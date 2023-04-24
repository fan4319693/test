package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.*;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;
import org.w3c.dom.Element;
import org.w3c.dom.NodeList;

import java.util.Collections;
import java.util.LinkedList;
import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;
import java.util.stream.Stream;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.*;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class FanshuaiModularProductParser {

    public static void process(OJSuperPNR ojSuperPNR, SPNRContext context) {

        String spnrId = ojSuperPNR.getSuperPNRID();
        for (ModularProductType mp : ojSuperPNR.getModularProduct()) {

            Spnr_MPPo spnr_mpPo = parseModularProduct(mp, spnrId);

            context.getSpnrMpList().add(spnr_mpPo);

            ModularProductMetaInfo mpMetaInfo = new ModularProductMetaInfo(
                    spnr_mpPo.getSuperPnrId(),
                    spnr_mpPo.getSearchId(),
                    spnr_mpPo.getProductNumber()
            );

            //1processAirAirItinerary(mp, mpMetaInfo, context);

            //processPriceInfo(mp, mpMetaInfo, context);
            //范帅将其移到此处
            //1processAirPriceItinTotalFares(mp, mpMetaInfo, context);

            //1processAirPriceInfoPTCs(mp, mpMetaInfo, context);

            //1processAirAirPriceInfoFareInfos(mp, mpMetaInfo, context);

            //1processAirPriceInfoFarefamily(mp, mpMetaInfo, context);

            //1processAirTravelerInfo(mp, mpMetaInfo, context);

            //1processAirTicketing(mp, mpMetaInfo, context);

            //1processAncillaryProduct(mp, mpMetaInfo, context);

            //===范帅将代码移到此处
            //1processMpApTicketing(mp, mpMetaInfo, context);

            //1processMpApLounge(mp, mpMetaInfo, context);

            //1processMpApSegment(mp, mpMetaInfo, context);

            //1processMpApTraveler(mp, mpMetaInfo, context);

            //1processGroundTransport(mp, mpMetaInfo, context);
            //===范帅将代码移到此处

            //1processBaggage(mp, mpMetaInfo, context);

            //范帅添加
            //1processMpBaggageSegment(mp, mpMetaInfo, context);

            //1processMpBaggageTraveler(mp, mpMetaInfo, context);

            //1processPricing(mp, mpMetaInfo, context);
            //1processPriceAdjustments(mp, mpMetaInfo, context);
            //1processPricingAmendmentFee(mp, mpMetaInfo, context);


            //1processCancellationFee(mp, mpMetaInfo, context);
            //1processCancellationRefunds(mp, mpMetaInfo, context);

            //1processRemark(mp, mpMetaInfo, context);
            //1processAudits(mp, mpMetaInfo, context);
            //1processPTCs(mp, mpMetaInfo, context);
            //1processModifyType(mp, mpMetaInfo, context);
            //1processPaymentRefs(mp, mpMetaInfo, context);
            processItineraryReceipt(mp, mpMetaInfo, context);
        }
    }

    /**
     * 获取AirMetaInfo
     *
     * @param air
     * @return
     */
    private static AirMetaInfo deriveAirMetaInfo(ProductBase.Air air) {
        if (air == null) {
            return null;
        }
        String pnr = null;
        String directionId = null;
        String docRequired = null;
        //TODO 这里取pnr的逻辑不是从Commons.getMpPnr取的
        AirReservationType.BookingReferenceID bookingReferenceID =
                Utils.getFirstNonNull(air.getBookingReferenceID());
        if (bookingReferenceID != null) {
            pnr = bookingReferenceID.getID();
        }
        AirItineraryType airItinerary = air.getAirItinerary();
        if (airItinerary != null) {
            directionId = Utils.applyOrNull(airItinerary.getDirectionInd(), t -> t.value());
            docRequired = airItinerary.getDocumentationRequired();
        }
        return new AirMetaInfo(pnr, directionId, docRequired);
    }

    /**
     * Mp元信息的JavaBean
     * 三个字段: pnrId, directionId, docRequired
     */
    private static class AirMetaInfo {
        private String pnr;
        private String directionId;
        private String docRequired;

        public AirMetaInfo(String pnr, String directionId, String docRequired) {
            this.pnr = pnr;
            this.directionId = directionId;
            this.docRequired = docRequired;
        }

        public String getPnr() {
            return pnr;
        }

        public String getDirectionId() {
            return directionId;
        }

        public String getDocRequired() {
            return docRequired;
        }
    }

    /**
     * Mp元信息的JavaBean
     * 三个字段: spnrId, searchId, productNumber
     */
    private static class ModularProductMetaInfo {
        private String spnrId;
        private String searchId;
        private Long productNumber;

        public ModularProductMetaInfo(String spnrId, String searchId, Long productNumber) {
            this.spnrId = spnrId;
            this.searchId = searchId;
            this.productNumber = productNumber;
        }

        public String getSpnrId() {
            return spnrId;
        }

        public String getSearchId() {
            return searchId;
        }

        public Long getProductNumber() {
            return productNumber;
        }
    }

    /**
     * 解析Spnr_MP
     *
     * @param mp
     * @param spnrId
     * @return
     */
    private static Spnr_MPPo parseModularProduct(ModularProductType mp, String spnrId) {
        Spnr_MPPo mpPo = new Spnr_MPPo();

        mpPo.setSuperPnrId(spnrId);
        mpPo.setSearchId(mp.getSearchID());
        mpPo.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
        mpPo.setBookedWith(Utils.collection2String(mp.getBookedWith()));
        mpPo.setBookingChannel(mp.getBookingChannel());
        mpPo.setBookingDate(xmlDate2StringWithShanghaiTimezone(mp.getBookingDate()));
        mpPo.setBookingStatus(mp.getBookingStatus());
        mpPo.setCancellationDate(xmlDate2StringWithShanghaiTimezone(mp.getCancellationDate()));
        mpPo.setEndDate(xmlDate2StringWithUtcTimezone(mp.getEndDate()));
        mpPo.setHistoric(Utils.boolean2String(mp.isHistoric()));
        mpPo.setHistoricId(Utils.toWrapperLong(mp.getHistoryID()));
        mpPo.setLastModified(xmlDate2StringWithShanghaiTimezone(mp.getLastModified()));
        mpPo.setMasterProductNumber(Utils.toWrapperLong(mp.getMasterProductNumber()));
        mpPo.setPrimaryLangId(mp.getPrimaryLangID());
        mpPo.setProductId(Utils.toWrapperLong(mp.getProductID()));
        mpPo.setProductType(mp.getProductType());
        mpPo.setProductTypeCode(mp.getProductTypeCode());
        mpPo.setStartDate(xmlDate2StringWithUtcTimezone(mp.getStartDate()));
        mpPo.setSynchronised(Utils.boolean2String(mp.isSynchronised()));
        mpPo.setTsbookingStatus(Utils.applyOrNull(mp.getTSBookingStatus(), t -> t.value()));
        mpPo.setLiveId(Utils.toWrapperLong(mp.getLiveID()));
        mpPo.setRefundable(Utils.boolean2String(mp.isRefundable()));
        mpPo.setReplacedBy(Utils.collection2String(mp.getReplacedBy()));

        Optional.ofNullable(mp.getSource())
                .ifPresent(source -> {
                    mpPo.setAgentDutyCode(source.getAgentDutyCode());
                    mpPo.setErspUserId(source.getERSPUserID());
                    mpPo.setTerminalId(source.getTerminalID());
                    mpPo.setChannel(source.getChannel());

                    Optional.ofNullable(source.getRequestorID())
                            .ifPresent(t -> {
                                mpPo.setRequestorId(t.getID());
                                Optional.ofNullable(t.getCompanyName())
                                        .ifPresent(e -> {
                                            mpPo.setCompanyCode(e.getCode());
                                            mpPo.setCompanyCodeContext(e.getCodeContext());
                                            mpPo.setCompanyDivision(e.getDivision());
                                        });
                            });

                    Optional.ofNullable(source.getConfig())
                            .ifPresent(sourceConfigType -> {
                                mpPo.setOfficecode(sourceConfigType.getOfficeCode());
                                mpPo.setIataNumber(sourceConfigType.getIATANumber());
                            });
                });

        Optional
                .ofNullable(mp.getAir())
                .map(a -> Utils.getFirstNonNull(a.getBookingReferenceID()))
                .map(r -> r.getCompanyName())
                .ifPresent(t -> {
                    mpPo.setCompanyName(t.getCode());
                });

        //TODO 这里抄的原代码
        Optional
                .ofNullable(mp.getAir())
                .map(a -> a.getSupplierNotes())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(sNotes ->
                        mpPo.setSupplierNotes(
                                sNotes.stream()
                                        .flatMap(supplierNotes -> supplierNotes.getNote().stream())
                                        .map(AirReservationType.SupplierNotes.Note::getType)
                                        .collect(Collectors.joining("@"))
                        )
                );

        mpPo.setServiceCode(mp.getServiceCode());
        return mpPo;
    }

    private static void processAirAirItinerary(ModularProductType mp,
                                               final ModularProductMetaInfo mpMetaInfo,
                                               SPNRContext context) {

        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }

        final AirMetaInfo airMetaInfo = deriveAirMetaInfo(air);

        Optional.ofNullable(air.getAirItinerary())
                .map(AirItineraryType::getOriginDestinationOptions)
                .map(AirItineraryType.OriginDestinationOptions::getOriginDestinationOption)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(odList -> {
                    odList.forEach(od -> {
                        // 解析MP_AirAirItineraryPo
                        MP_AirAirItineraryPo mp_airAirItineraryPo = parseMPAirAirItinerary(od, mpMetaInfo, airMetaInfo);
                        context.getMpAirAirItineraryPos().add(mp_airAirItineraryPo);

                        // 解析MP_AirAirItinerary_segmentPo
                        List<MP_AirAirItinerary_segmentPo> mpAirAirItinerarySegmentPos = parseMPAirAirItinerarySegmentPo(od, mpMetaInfo, airMetaInfo);
                        context.getMpAirAirItinerarySegmentPos().addAll(mpAirAirItinerarySegmentPos);

                        // 解析MP_AirAirItinerary_baggagePo
                        List<MP_AirAirItinerary_baggagePo> mpAirAirItineraryBaggagePos = parseBaggage(od, mpMetaInfo, airMetaInfo);
                        context.getMpAirAirItineraryBaggagePos().addAll(mpAirAirItineraryBaggagePos);
                    });
                });
    }

    /**
     * 解析 MP_itineraryreceiptPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processItineraryReceipt(ModularProductType mp,
                                                final ModularProductMetaInfo mpMetaInfo,
                                                SPNRContext context) {
        ItineraryReceiptProductType receipt = mp.getItineraryReceipt();
        if (receipt == null) {
            return;
        }
        Optional.ofNullable(receipt.getItineraryProduct())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(productList -> {
                    productList.forEach(product -> {
                        MP_itineraryreceiptPo po = new MP_itineraryreceiptPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setChannel(receipt.getChannel());
                        po.setItineraryReceiptId(receipt.getID());
                        po.setLogisticsId(receipt.getLogisticsID());
                        po.setStatus(receipt.getStatus());
                        po.setTrackingNumber(Utils.applyOrNull(receipt.getDeliveryInfo(), d -> d.getTrackingNumber()));
                        Optional.ofNullable(receipt.getDeliveryInfo())
                                .ifPresent(deliveryInfo -> {
                                    Utils.getFirstNonNullConsume(deliveryInfo.getRecipient(), t -> {
                                        po.setRecipientPersonName(Commons.getName(t.getPersonName()));
                                        po.setRecipientTelephone(Commons.getRecipientTelephone(Utils.getFirstNonNull(t.getTelephone())));
                                        po.setRecipientAddress(Commons.getRecipientAddress(Utils.getFirstNonNull(t.getAddress())));
                                    });

                                    Optional.ofNullable(deliveryInfo.getEstimatedPrice())
                                            .ifPresent(p -> {
                                                po.setEstimatedPrice(Utils.number2String(p.getAmount()));
                                                po.setRecipientCurrencyCode(p.getCurrencyCode());
                                            });
                                });

                        po.setProductArrivalDateTime(xmlDate2StringWithShanghaiTimezone(product.getArrivalDateTime()));
                        po.setProductChannel(product.getChannel());
                        po.setProductGeoIndicator(product.getGeoIndicator());
                        po.setProductHistoryId(Utils.toWrapperLong(product.getHistoryID()));
                        po.setProductProductNumber(Utils.toWrapperLong(product.getProductNumber()));
                        po.setProductProductType(product.getProductType());
                        Utils.getFirstNonNullConsume(product.getTicketing(), t -> {
                            po.setProductETicketNumber(t.getETicketNumber());
                            Optional.ofNullable(t.getTicketPrice())
                                    .ifPresent(p -> {
                                        po.setProductTicketPrice(Utils.number2String(p.getAmount()));
                                        po.setProductCurrencyCode(p.getCurrencyCode());
                                    });

                            Optional.ofNullable(Utils.getFirstNonNull(t.getPassengerInfo()))
                                    .map(info -> info.getPassengerName())
                                    .ifPresent(a -> {
                                        po.setProductPassengerName(Commons.getName(a));
                                    });
                        });

                        context.getMpItineraryReceiptPos().add(po);
                    });
                });
    }

    /**
     * 解析 MP_PaymentRefsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processPaymentRefs(ModularProductType mp,
                                           final ModularProductMetaInfo mpMetaInfo,
                                           SPNRContext context) {
        ModularProductType.PaymentRefs paymentRefs = mp.getPaymentRefs();
        if (paymentRefs == null) {
            return;
        }

        Optional.ofNullable(paymentRefs.getPaymentRef())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(refList ->
                        refList.forEach(ref -> {
                            MP_PaymentRefsPo po = new MP_PaymentRefsPo();

                            po.setSuperPnrId(mpMetaInfo.getSpnrId());
                            po.setSearchId(mpMetaInfo.getSearchId());
                            po.setProductNumber(mpMetaInfo.getProductNumber());
                            po.setPnr(Commons.getMpPnr(mp));
                            po.setPaymentRefsAuditId(Utils.toWrapperLong(paymentRefs.getAuditID()));
                            Utils.consumeOrNull(paymentRefs.getPaymentState(), t -> po.setPaymentState(t.value()));
                            po.setPaymentRefId(Utils.toWrapperLong(ref.getID()));
                            po.setPaymentId(Utils.toWrapperLong(ref.getPaymentID()));
                            po.setPaymentRefAuditId(Utils.toWrapperLong(ref.getAuditID()));

                            context.getMPPaymentRefsPos().add(po);
                        }));
    }

    /**
     * 解析 MP_ModifyTypesPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processModifyType(ModularProductType mp,
                                          final ModularProductMetaInfo mpMetaInfo,
                                          SPNRContext context) {
        Optional.ofNullable(mp.getModifyTypes())
                .map(modifyTypes -> modifyTypes.getModifyType())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(mType -> mType.forEach(modifyType -> {
                    MP_ModifyTypesPo po = new MP_ModifyTypesPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setPnr(Commons.getMpPnr(mp));
                    po.setAuditId(Utils.toWrapperLong(modifyType.getAuditID()));
                    po.setOriginalHistoryId(Utils.number2String(modifyType.getOriginalHistoryID()));
                    po.setRph(Utils.toWrapperLong(modifyType.getRPH()));
                    po.setType(modifyType.getType());
                    po.setFreeDateChange(modifyType.getFreeDateChange());
                    po.setOldMpNum(Utils.toWrapperLong(modifyType.getOldMPNum()));
                    po.setSplitRequired(modifyType.getSplitRequired());
                    po.setNeedCancel(Utils.boolean2String(modifyType.isNeedCancel()));
                    po.setOldPnr(modifyType.getOldPNR());
                    po.setReshopId(modifyType.getReshopID());

                    context.getMPModifyTypesPos().add(po);
                }));
    }

    /**
     * 解析 MP_PtcsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processPTCs(ModularProductType mp,
                                    final ModularProductMetaInfo mpMetaInfo,
                                    SPNRContext context) {
        Optional.ofNullable(mp.getPTCs())
                .map(ptcs -> ptcs.getPTC())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ptcs -> ptcs.forEach(ptc -> {
                    MP_PtcsPo po = new MP_PtcsPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setPnr(Commons.getMpPnr(mp));
                    po.setPtcCode(ptc.getCode());
                    po.setPtcQuantity(Utils.toWrapperLong(ptc.getQuantity()));
                    //此处用的空格, 去掉Null值
                    //TODO 原来是空格分隔, 改为了逗号分隔
                    //po.setRphList(Utils.collection2String(ptc.getRPHList(), Function.identity(), Constants.JoinByEmptyNull2Empty));
                    po.setRphList(Utils.collection2String(ptc.getRPHList()));

                    context.getMpPTCsPos().add(po);
                }));
    }

    /**
     * 解析MP_AuditsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAudits(ModularProductType mp,
                                      final ModularProductMetaInfo mpMetaInfo,
                                      SPNRContext context) {

        Optional.ofNullable(mp.getAudits())
                .map(a -> a.getAudit())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(audits -> audits.forEach(audit -> {
                    MP_AuditsPo po = new MP_AuditsPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setPnr(Commons.getMpPnr(mp));
                    po.setAuditId(Utils.toWrapperLong(audit.getID()));
                    po.setRequestorId(audit.getRequestorID());
                    po.setChannel(audit.getChannel());
                    po.setVersion(audit.getVersion());
                    po.setInTimestamp(audit.getTimestamp());
                    po.setSourceAddress(audit.getSourceAddress());
                    po.setAction(audit.getAction());
                    Optional.ofNullable(audit.getAgent())
                            .ifPresent(a -> {
                                po.setAgent(a.getAgent());
                                po.setAgentUrl(a.getURL());
                                po.setAgency(a.getAgency());
                                po.setAgentId(a.getID());
                                po.setAgentFunctionalGroup(a.getFunctionalGroup());
                                po.setAgentAdministrativeGroup(a.getAdministrativeGroup());
                            });

//                    JSONArray jsonArray = new JSONArray();
//
//                    Optional.ofNullable(audit.getEvents())
//                            .map(t -> t.getEvent())
//                            .filter(CollectionUtils::isNotEmpty)
//                            .ifPresent(eventList -> {
//                                eventList.forEach(event -> {
//                                    JSONObject jsonObj = new JSONObject();
//                                    jsonObj.put("event_context", event.getContext());
//                                    jsonObj.put("event_id", event.getID());
//                                    jsonObj.put("event_oj_super_pnr_rph", Utils.toWrapperLong(event.getOJSuperPNRRPH()));
//                                    jsonObj.put("event_orig_value", event.getOrigValue());
//                                    jsonObj.put("event_ref_id", event.getRefId());
//                                    jsonObj.put("event_path", event.getPath());
//                                    jsonObj.put("event_type", event.getType());
//                                    jsonObj.put("flight_segment_rph", Utils.toWrapperLong(event.getFlightSegmentRPH()));
//                                    jsonObj.put("event_ref_path", event.getRefPath());
//
//                                    jsonArray.add(jsonObj);
//                                });
//                            });

                    po.setEventInfo(Commons.getEventInfo(audit.getEvents()));

                    context.getMPAuditsPos().add(po);
                }));
    }

    /**
     * 解析MP_RemarksPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processRemark(ModularProductType mp,
                                      final ModularProductMetaInfo mpMetaInfo,
                                      SPNRContext context) {
        Optional.ofNullable(mp.getRemarks())
                .map(r -> r.getRemark())
                .ifPresent(rmks -> rmks.forEach(rmk -> {
                    MP_RemarksPo po = new MP_RemarksPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setActive(Utils.boolean2String(rmk.isActive()));
                    po.setAuditId(Utils.toWrapperLong(rmk.getAuditID()));
                    po.setCode(rmk.getCode());
                    po.setCodeContext(rmk.getCodeContext());
                    po.setOpsDate(xmlDate2StringWithShanghaiTimezone(rmk.getDate()));
                    po.setLastModified(xmlDate2StringWithShanghaiTimezone(rmk.getLastModified()));
                    po.setRph(Utils.toWrapperLong(rmk.getRPH()));

                    Utils.consumeOrNull(rmk.getAgent(), a -> {
                        po.setAgent(a.getAgent());
                        po.setAgentSourceAddress(a.getSourceAddress());
                        po.setInTimestamp(a.getTimestamp());
                    });

                    //TODO 此处存疑, 将其改为了json数组, 待确认
                    /*Optional.ofNullable(rmk.getRefundQualifiers())
                            .map(t -> t.getRefundQualifier())
                            .filter(CollectionUtils::isNotEmpty)
                            .ifPresent(qualifierList -> {
                                qualifierList.forEach(qualifier -> {
                                    //
                                    jsonObj.put("qualifier_description", qualifier.getQualifierDescription());
                                    jsonObj.put("qualifier_value", qualifier.getQualifierValue());
                                    jsonObj.put("flight_segment_rph", Utils.toWrapperLong(qualifier.getFlightSegmentRPH()));
                                    jsonObj.put("oj_super_pnr_rph", Utils.toWrapperLong(qualifier.getOJSuperPNRRPH()));
                                    jsonObj.put("e_ticket_number", qualifier.getETicketNumber());
                                    Optional.ofNullable(qualifier.getQualifierItem())
                                            .filter(CollectionUtils::isNotEmpty)
                                            .ifPresent(itemList -> {
                                                String names = Utils.collection2String(itemList, i -> i.getName());
                                                jsonObj.put("qualifier_item_name", names);
                                                String values = Utils.collection2String(itemList, i -> i.getValue());
                                                jsonObj.put("qualifier_item_value", values);
                                            });
                                    jsonObj.put("passenger_type_code", qualifier.getPassengerTypeCode());
                                    jsonObj.put("history_id", Utils.toWrapperLong(qualifier.getHistoryID()));
                                    jsonObj.put("product_no", Utils.toWrapperLong(qualifier.getProductNumber()));
                                    jsonObj.put("tax_code", qualifier.getTaxCode());
                                });
                            });*/
                    po.setQualifierInfo(Commons.getQualifierInfo(rmk.getRefundQualifiers()));
                    context.getMPRemarksPos().add(po);
                }));
    }

    /**
     * 解析 MP_Pricing_CancellationRefundsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processCancellationRefunds(ModularProductType mp,
                                                   final ModularProductMetaInfo mpMetaInfo,
                                                   SPNRContext context) {
        Optional.ofNullable(mp.getPricing())
                .map(p -> p.getCancellationRefunds())
                .map(r -> r.getCancellationRefund())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(refundList -> refundList.forEach(
                        refund -> {
                            MP_Pricing_CancellationRefundsPo po = new MP_Pricing_CancellationRefundsPo();

                            po.setSuperPnrId(mpMetaInfo.getSpnrId());
                            po.setSearchId(mpMetaInfo.getSearchId());
                            po.setProductNumber(mpMetaInfo.getProductNumber());
                            po.setAllowAuto(refund.getAllowAuto());
                            po.setAmt(Utils.number2String(refund.getAmount()));
                            po.setCurrencyCode(refund.getCurrencyCode());
                            po.setAuditId(Utils.toWrapperLong(refund.getAuditID()));
                            po.setFlightSegmentRph(Utils.toWrapperLong(refund.getFlightSegmentRPH()));
                            po.setMasterProductNumber(Utils.toWrapperLong(refund.getMasterProductNumber()));
                            po.setOjSuperPnrRph(Utils.toWrapperLong(refund.getOJSuperPNRRPH()));
                            po.setCancelRefundProductNumber(Utils.toWrapperLong(refund.getProductNumber()));
                            po.setProductType(refund.getProductType());
                            Utils.getFirstNonNullConsume(refund.getTicketing(), ticket -> {
                                po.seteTicketNumber(ticket.getETicketNumber());
                                Optional.ofNullable(ticket.getPricingInfo())
                                        .map(p -> p.getBaseFare())
                                        .ifPresent(fare -> {
                                            po.setBaseFareAmt(Utils.number2String(fare.getAmount()));
                                            po.setBaseFareRefundAmt(Utils.number2String(fare.getRefundAmount()));
                                        });

                                Optional.ofNullable(ticket.getPricingInfo())
                                        .map(p -> p.getTaxes())
                                        .map(t -> t.getTax())
                                        .ifPresent(taxes ->
                                                po.setTaxesRefund(Commons.getTaxDetails(taxes))
                                        );
                            });

                            Utils.consumeOrNull(refund.getAgent(), agent -> {
                                po.setAgent(agent.getAgent());
                                po.setAgentUrl(agent.getURL());
                                po.setAgency(agent.getAgency());
                                po.setAgentId(agent.getID());
                                po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                                po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                            });

                            context.getMPPricingCancellationRefundsPos().add(po);
                        }));
    }

    /**
     * 解析 MP_Pricing_CancellationFeesPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processCancellationFee(ModularProductType mp,
                                               final ModularProductMetaInfo mpMetaInfo,
                                               SPNRContext context) {
        Optional.ofNullable(mp.getPricing())
                .map(p -> p.getCancellationFees())
                .map(a -> a.getCancellationFee())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(feeList -> feeList.forEach(fee -> {
                    MP_Pricing_CancellationFeesPo po = new MP_Pricing_CancellationFeesPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setOjSuperPnrRph(Utils.toWrapperLong(fee.getOJSuperPNRRPH()));
                    po.setAmt(Utils.number2String(fee.getAmount()));
                    po.setCurrencyCode(fee.getCurrencyCode());
                    po.setAuditId(Utils.toWrapperLong(fee.getAuditID()));
                    po.setFlightSegmentRph(Utils.toWrapperLong(fee.getFlightSegmentRPH()));
                    po.setAddedDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));
                    po.setMasterProductNumber(Utils.toWrapperLong(fee.getMasterProductNumber()));
                    po.setPercentage(Utils.number2String(fee.getPercentage()));
                    po.setCancelProductNumber(Utils.toWrapperLong(fee.getProductNumber()));
                    po.setProductType(fee.getProductType());
                    Utils.consumeOrNull(fee.getAgent(), agent -> {
                        po.setAgent(agent.getAgent());
                        po.setAgentUrl(agent.getURL());
                        po.setAgency(agent.getAgency());
                        po.setAgentId(agent.getID());
                        po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                        po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                    });
                    context.getMPPricingCancellationFeesPos().add(po);
                }));
    }

    /**
     * 解析MP_Pricing_AmendmentFeePo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processPricingAmendmentFee(ModularProductType mp,
                                                   final ModularProductMetaInfo mpMetaInfo,
                                                   SPNRContext context) {
        Optional
                .ofNullable(mp.getPricing())
                .map(p -> p.getAmendmentFees())
                .map(a -> a.getAmendmentFee())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(fees -> fees.forEach(fee -> {
                    MP_Pricing_AmendmentFeePo po = new MP_Pricing_AmendmentFeePo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setPnr(Commons.getMpPnr(mp));
                    po.setAmt(Utils.number2String(fee.getAmount()));
                    po.setCurrencyCode(fee.getCurrencyCode());
                    po.setDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));
                    context.getMPPricingAmendmentFeePos().add(po);
                }));
    }

    /**
     * 解析MP_Pricing_PriceAdjustmentsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processPriceAdjustments(ModularProductType mp,
                                                final ModularProductMetaInfo mpMetaInfo,
                                                SPNRContext context) {
        Optional.ofNullable(mp.getPricing())
                .map(p -> p.getPriceAdjustments())
                .map(p -> p.getPriceAdjustment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(adjList -> {
                    adjList.forEach(adj -> {
                        MP_Pricing_PriceAdjustmentsPo po = new MP_Pricing_PriceAdjustmentsPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setAdjustDate(xmlDate2StringWithShanghaiTimezone(adj.getDate()));
                        po.setCode(adj.getCode());
                        po.setProductType(adj.getProductType());
                        po.setDescription(adj.getDescription());
                        po.setAmt(Utils.number2String(adj.getAmount()));
                        po.setCurrencyCode(adj.getCurrencyCode());
                        po.setUnitAmt(Utils.number2String(adj.getUnitAmount()));
                        po.setAuditId(Utils.toWrapperLong(adj.getAuditID()));
                        po.setPassengerTypeCode(adj.getPassengerTypeCode());
                        po.setFlightSegmentRph(Utils.toWrapperLong(adj.getFlightSegmentRPH()));

                        Utils.consumeOrNull(adj.getAgent(), agent -> {
                            po.setAgent(agent.getAgent());
                            po.setAgentUrl(agent.getURL());
                            po.setAgency(agent.getAgency());
                            po.setAgentId(agent.getID());
                            po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                            po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                        });
                        context.getMPPricingPriceAdjustmentsPos().add(po);
                    });
                });
    }

    /**
     * 解析 MP_PricingPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processPricing(ModularProductType mp,
                                       final ModularProductMetaInfo mpMetaInfo,
                                       SPNRContext context) {
        ProductPricingType pricingType = mp.getPricing();
        if (pricingType == null) {
            return;
        }
        String pnr = Commons.getMpPnr(mp);

        Optional.ofNullable(mp.getPricing())
                .ifPresent(pricing -> {
                    MP_PricingPo po = new MP_PricingPo();

                    po.setSuperPnrId(mpMetaInfo.getSpnrId());
                    po.setSearchId(mpMetaInfo.getSearchId());
                    po.setProductNumber(mpMetaInfo.getProductNumber());
                    po.setPnr(pnr);
                    Utils.consumeOrNull(pricing.getPrePayTotal(), preTotal -> {
                        po.setPreAmt(Utils.number2String(preTotal.getAmount()));
                        po.setPreCurrencyCode(preTotal.getCurrencyCode());
                        po.setPrePayInd(Utils.boolean2String(preTotal.isPrePayInd()));
                    });

                    Utils.consumeOrNull(pricing.getPriceAdjustments(), prc -> {
                        po.setAdjustmentsAmt(Utils.number2String(prc.getAmount()));
                        po.setAdjustmentsCurrencyCode(prc.getCurrencyCode());
                    });

                    Utils.consumeOrNull(pricing.getTotalPrice(), total -> {
                        po.setTotalAmt(Utils.number2String(total.getAmount()));
                        po.setTotalCurrencyCode(total.getCurrencyCode());
                    });

                    Utils.consumeOrNull(pricing.getCancellationFees(), prc -> {
                        po.setCancellationFees(Utils.number2String(prc.getAmount()));
                        po.setCancellationFeesCurrencyCode(prc.getCurrencyCode());
                    });

                    Utils.consumeOrNull(pricing.getCancellationRefunds(), prc -> {
                        po.setCancellationRefunds(Utils.number2String(prc.getAmount()));
                        po.setCancellationRefundsCurrencyCode(prc.getCurrencyCode());
                    });

                    Optional.ofNullable(pricing.getLoyalty())
                            .map(LoyaltyProductType::getRedemption)
                            .map(LoyaltyProductType.Redemption::getRedeem)
                            .ifPresent(redeem -> {
                                po.setAmountRedeemQuantity(Utils.number2String(redeem.getQuantity()));
                                po.setAmountRedeemed(Utils.number2String(redeem.getAmountRedeemed()));
                                po.setAmountRedeemedCurrencyCode(redeem.getCurrencyCode());
                            });
                    context.getMpPricingPos().add(po);
                });
    }

    /**
     * 解析 MP_BaggagePo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processBaggage(ModularProductType mp,
                                       final ModularProductMetaInfo mpMetaInfo,
                                       SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if (baggage == null) {
            return;
        }
        MP_BaggagePo po = new MP_BaggagePo();

        po.setSuperPnrId(mpMetaInfo.getSpnrId());
        po.setSearchId(mpMetaInfo.getSearchId());
        po.setProductNumber(mpMetaInfo.getProductNumber());
        //与Excel不同
        po.setPnr(Commons.getMpPnr(mp));

        po.setCancelable(Utils.boolean2String(baggage.isCancelable()));
        po.setQuantity(Utils.toWrapperLong(baggage.getQuantity()));
        po.setRefundable(Utils.boolean2String(baggage.isRefundable()));
        po.setIsSegBind(Utils.boolean2String(baggage.isIsSegBind()));

        Optional.ofNullable(baggage.getOriginDestination())
                .ifPresent(od -> {
                    po.setDepartureCode(od.getDepartureCode());
                    po.setArrivalCode(od.getArrivalCode());

                    Optional.ofNullable(od.getService())
                            .ifPresent(service -> {
                                Optional.ofNullable(service.getBaggage())
                                        .ifPresent(bag -> {
                                            Utils.getFirstNonNullConsume(bag.getMaxWeight(), t -> {
                                                po.setMaxWeight(Utils.number2String(t.getValue()));
                                                po.setMaxWeightUnit(Utils.applyOrNull(t.getUnit(), a -> a.value()));
                                            });
                                            Utils.getFirstNonNullConsume(bag.getMaxDimensions(), t -> {
                                                po.setMaxDimensionslCm(Utils.number2String(t.getLCM()));
                                                po.setMaxDimensionsUnits(Utils.applyOrNull(t.getUnits(), a -> a.value()));
                                            });
                                        });

                                Utils.consumeOrNull(service.getTotalAmount(), totalAmount -> {
                                    po.setAdjusted(Utils.number2String(totalAmount.getAdjusted()));
                                    po.setAmt(Utils.number2String(totalAmount.getAmount()));
                                    po.setAmtBeforeTax(Utils.number2String(totalAmount.getAmountBeforeTax()));
                                    po.setCurrencyCode(totalAmount.getCurrencyCode());
                                    po.setDecimalPlaces(Utils.number2String(totalAmount.getDecimalPlaces()));
                                    po.setOriAmtAfterTax(Utils.number2String(totalAmount.getOriginalAmountAfterTax()));
                                    po.setOriCurrencyCode(totalAmount.getOriginalCurrencyCode());
                                });
                                //TODO 改为逗号拼接,原来是String.valueOf(List<String>)
                                po.setFlightSegmentNumber(Utils.collection2String(service.getFlightSegmentNumber()));
                            });
                });

        Optional.ofNullable(baggage.getTicketing())
                .ifPresent(ticketingInfoTypes -> ticketingInfoTypes.forEach(
                        ticketing -> {
                            // TODO: 这里虽然是数组但是xds上显示的确实attribute，取第一条，而且观察数据，如果一个票对应多个航段会生成多条数据相同的
                            Utils.getFirstNonNullConsume(ticketing.getTravelerRefNumber(), num -> {
                                po.setTravelerRph(Utils.toWrapperLong(num));
                            });
                            Utils.getFirstNonNullConsume(ticketing.getFlightSegmentRefNumber(), num -> {
                                po.setFlightSegmentRph(Utils.toWrapperLong(num));
                            });
                            po.setGeoIndicator(ticketing.getGeoIndicator());
                            po.setSaleModel(ticketing.getSaleModel());
                            po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticketing.getTicketTime()));
                            po.setTicketingStatus(ticketing.getTicketingStatus());
                            po.seteTicketNumber(ticketing.getETicketNumber());

                            String advisory = Utils.collection2String(ticketing.getTicketAdvisory(),
                                    t -> t.getValue());
                            po.setTicketAdvisory(advisory);

                            Optional.ofNullable(baggage.getCancellationPenalties())
                                    .map(p -> Utils.getFirstNonNull(p.getCancelPenalty()))
                                    .map(p -> p.getAmountPercent())
                                    .map(p -> p.getAmount())
                                    .ifPresent(a -> po.setCancelAmount(Utils.number2String(a)));

                            context.getMpBaggagePos().add(po);
                        }
                ));
    }

    /**
     * 解析 MP_AncillaryProductPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAncillaryProduct(ModularProductType mp,
                                                final ModularProductMetaInfo mpMetaInfo,
                                                SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }
        MP_AncillaryProductPo po = new MP_AncillaryProductPo();

        po.setSuperPnrId(mpMetaInfo.getSpnrId());
        po.setSearchId(mpMetaInfo.getSearchId());
        po.setProductNumber(mpMetaInfo.getProductNumber());
        po.setPnr(ancillaryProduct.getBookingReferenceID());
        po.setCancelable(Utils.boolean2String(ancillaryProduct.isCancelable()));
        po.setCategory(Utils.applyOrNull(ancillaryProduct.getCategory(), t -> t.value()));
        po.setCode(ancillaryProduct.getCode());
        po.setBookDate(xmlDate2StringWithShanghaiTimezone(ancillaryProduct.getDate()));
        po.setOrigin(ancillaryProduct.getOrigin());
        po.setDestination(ancillaryProduct.getDestination());
        po.setFlightNumber(ancillaryProduct.getFlightNumber());
        po.setFlightSegmentRph(Utils.toWrapperLong(ancillaryProduct.getFlightSegmentRPH()));
        //TODO 没有该节点,先用carrier代替
        po.setMarketingAirline(ancillaryProduct.getCarrier());
        po.setQuantity(Utils.toWrapperLong(ancillaryProduct.getQuantity()));
        po.setRefundable(Utils.boolean2String(ancillaryProduct.isRefundable()));
        po.setSeatNumber(ancillaryProduct.getSeatNumber());
        po.setType(ancillaryProduct.getType());
        po.setIsSegBind(Utils.boolean2String(ancillaryProduct.isIsSegBind()));

        //TODO 此处原来是逗号拼接,改为了取首个乘客,否则类型不兼容
        Optional.ofNullable(ancillaryProduct.getTravelerInfo())
                .map(t -> Utils.getFirstNonNull(t.getAirTraveler()))
                .map(t -> t.getTravelerRefNumber())
                .ifPresent(t -> po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH())));

        Optional.ofNullable(ancillaryProduct.getContact())
                .map(ContactPersonType::getPersonName)
                .ifPresent(pName -> po.setContactPersonName(Commons.getName(pName)));

        po.setAirport(ancillaryProduct.getAirport());
        po.setBookingChannel(ancillaryProduct.getBookingChannel());
        po.setBookingReferenceId(ancillaryProduct.getBookingReferenceID());
        po.setBookingStatus(ancillaryProduct.getBookingStatus());
        po.setCabinClass(ancillaryProduct.getCabinClass());
        po.setCarrier(ancillaryProduct.getCarrier());
        po.setName(ancillaryProduct.getName());
        po.setOdRph(Utils.toWrapperLong(ancillaryProduct.getOriginDestinationRPH()));
        po.setPoolId(ancillaryProduct.getPoolID());
        po.setProductSequence(ancillaryProduct.getProductSequence());
        po.setRef(ancillaryProduct.getREF());
        po.setSellingProposition(ancillaryProduct.getSellingProposition());
        po.setSubType(ancillaryProduct.getSubType());
        po.setSupplierCode(ancillaryProduct.getSupplierCode());
        po.setSupplierProductCode(ancillaryProduct.getSupplierProductCode());

        Optional.ofNullable(ancillaryProduct.getSupplierDescriptiveContent())
                .ifPresent(sdc -> {
                    po.setSupplierName(sdc.getSupplierName());
                    Optional.ofNullable(sdc.getBookingOffices())
                            .map(b -> Utils.getFirstNonNull(b.getBookingOffice()))
                            .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice::getPhones)
                            .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones::getPhone)
                            .filter(CollectionUtils::isNotEmpty)
                            .ifPresent(phones -> {
                                //TODO 此处以斜杠拼接,只此一见
                                po.setSupplierPhoneNumber(Utils.collection2String(phones, p -> p.getPhoneNumber(),
                                        Constants.JoinBySlashNull2Empty)
                                );
                            });
                });

        po.setTag(ancillaryProduct.getTag());
        po.setTerminal(ancillaryProduct.getTerminal());

        Optional.ofNullable(ancillaryProduct.getQRData())
                .map(qrDataType -> Utils.getFirstNonNull(qrDataType.getQRCode()))
                .ifPresent(qrCode -> {
                    po.setQrConsumedDateTime(xmlDate2StringWithShanghaiTimezone(qrCode.getConsumedDateTime()));
                });

        Optional.ofNullable(ancillaryProduct.getCancellationPenalties())
                .map(t -> t.getCancelPenalty())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(penaltyList -> {
                    penaltyList.forEach(penalty -> {
                        Optional.ofNullable(penalty.getDeadline())
                                .ifPresent(d -> {
                                    po.setCancelPenaltyDeadlineOffsetTimeUnit(d.getOffsetTimeUnit());
                                    po.setCancelPenaltyDeadlineOffsetUnitMultiplier(Utils.number2String(d.getOffsetUnitMultiplier()));
                                });

                        Optional.ofNullable(penalty.getAmountPercent())
                                .ifPresent(a -> po.setAmountPercent(Utils.number2String(a.getAmount())));
                    });
                });

        Optional.ofNullable(ancillaryProduct.getPrices())
                .map(prices -> Utils.getFirstNonNull(prices.getPrice()))
                .ifPresent(priceType -> {
                    po.setLoyaltyLevel(priceType.getLoyaltyLevel());
                    po.setPassengerTypeCode(priceType.getPassengerTypeCode());

                    Optional.ofNullable(priceType.getBase())
                            .ifPresent(base -> {
                                po.setBaseAmount(Utils.number2String(base.getAmount()));
                                po.setBaseCurrencyCode(base.getCurrencyCode());
                                po.setUnitPrice(Utils.number2String(base.getUnitPrice()));
                            });

                    Optional.ofNullable(priceType.getPriceAdjustments())
                            .ifPresent(adj -> {
                                //TODO 这里的代码与原代码一致，但业务逻辑不太理解
                                Float amt = Optional.ofNullable(adj.getAmount())
                                        .orElse(Utils.getFirstNonNullApply(adj.getPriceAdjustment(), t -> t.getAmount()));

                                po.setPriceAdjustmentsAmount(Utils.number2String(amt));
                                //TODO 这里的代码与原代码一致，但业务逻辑不太理解
                                String currencyCode = Optional.ofNullable(adj.getCurrencyCode())
                                        .orElse(Utils.getFirstNonNullApply(adj.getPriceAdjustment(), t -> t.getCurrencyCode()));

                                po.setPriceAdjustmentsCurrencyCode(currencyCode);
                            });

                    Optional.ofNullable(priceType.getTotal())
                            .ifPresent(total -> {
                                po.setTotalAdjusted(Utils.number2String(total.getAdjusted()));
                                po.setTotalAdjustedCurrencyCode(total.getCurrencyCode());
                                po.setTotalAmount(Utils.number2String(total.getAmount()));
                                po.setTotalCurrencyCode(total.getCurrencyCode());
                            });
                });

        context.getMpAncillaryProductPos().add(po);
    }

    /**
     * 解析MP_AirTicketingPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirTicketing(ModularProductType mp,
                                            final ModularProductMetaInfo mpMetaInfo,
                                            SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        List<TicketingFullInfoType> ticketing = air.getTicketing();
        if (CollectionUtils.isEmpty(ticketing)) {
            return;
        }

        String pnr = Commons.getMpPnr(mp);
        ticketing.forEach(ticket -> {
            MP_AirTicketingPo po = new MP_AirTicketingPo();

            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.setPnr(pnr);
            //TODO 这里使用了默认值，改为Null
            Long flightSegmentRefNumber = Utils.getFirstNonNullApply(ticket.getFlightSegmentRefNumber(), Utils::toWrapperLong);
            po.setFlightSegmentRefNumber(flightSegmentRefNumber);
            po.setIrr(Utils.boolean2String(ticket.isIRR()));
            po.setIrrReason(ticket.getIRRReason());
            po.setIssuingAgentId(ticket.getIssuingAgentID());
            po.setItemNumber(ticket.getItemNumber());
            po.setPrinted(Utils.boolean2String(ticket.isPrinted()));
            po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticket.getTicketTime()));
            po.setTicketingStatus(ticket.getTicketingStatus());
            //TODO 本来有默认值, 改掉
            Long travelerRefNumber = Utils.getFirstNonNullApply(ticket.getTravelerRefNumber(), Utils::toWrapperLong);
            po.setTravelerRefNumber(travelerRefNumber);
            po.seteTicketNumber(ticket.getETicketNumber());
            po.setTicketTimeLimit(xmlDate2StringWithShanghaiTimezone(ticket.getTicketTimeLimit()));
            po.setExpiryDateTime(xmlDate2StringWithShanghaiTimezone(ticket.getExpiryDateTime()));
            po.setWaitlistStatus(ticket.getWaitlistStatus());
            po.setRefundInfo(Commons.getRefundInfoJson(ticket.getRefundInfo()));

//            Optional.ofNullable(ticket.getRefundInfo())
//                    .filter(CollectionUtils::isNotEmpty)
//                    .ifPresent(refundList -> {
//                        //TODO 改为JSON数组,合并为数组,字段合并
//                        po.setRefundAuditId(Utils.collection2String(refundList, t -> Utils.number2String(t.getAuditID())));
//                        po.setRefundHistoric(Utils.collection2String(refundList, t -> Utils.boolean2String(t.isHistoric())));
//                        po.setRefundHistoryId(Utils.collection2String(refundList, t -> Utils.number2String(t.getHistoryID())));
//                        po.setRefundId(Utils.collection2String(refundList, t -> Utils.number2String(t.getID())));
//                        po.setRefundStatus(Utils.collection2String(refundList, t -> t.getStatus().value()));
//                        po.setRefundERefundNumber(Utils.collection2String(refundList, t -> t.getERefundNumber()));
//                    });
            context.getMPAirTicketingPos().add(po);
        });
    }

    /**
     * 解析price相关
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
//    private static void processPriceInfo(ModularProductType mp,
//                                         final ModularProductMetaInfo mpMetaInfo,
//                                         SPNRContext context) {
//        ProductBase.Air air = mp.getAir();
//        if (air == null) {
//            return;
//        }
//        List<BookingPriceInfoType> priceInfo = air.getPriceInfo();
//        if (priceInfo == null) {
//            return;
//        }
//        processAirPriceInfo(mp, mpMetaInfo, context);
//
//        processAirPriceInfoPTCs(mp, mpMetaInfo, context);
//
//        processAirAirPriceInfoFareInfos(mp, mpMetaInfo, context);
//
//        processAirPriceInfoFarefamily(mp, mpMetaInfo, context);
//    }

    /**
     * MP_AirTravelerInfoPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirTravelerInfo(ModularProductType mp,
                                               final ModularProductMetaInfo mpMetaInfo,
                                               SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        String pnr = Commons.getMpPnr(mp);
        Optional.ofNullable(air.getTravelerInfo())
                .map(t -> t.getAirTraveler())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(travelerList -> {
                    travelerList.forEach(airTraveler -> {
                        MP_AirTravelerInfoPo po = new MP_AirTravelerInfoPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setPnr(pnr);
                        po.setOjSuperPnrRph(Utils.toWrapperLong(airTraveler.getOJSuperPNRRPH()));
                        Utils.consumeOrNull(airTraveler.getTravelerRefNumber(), t -> {
                            po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH()));
                        });
                        po.setPassengerTypeCode(airTraveler.getPassengerTypeCode());
                        po.setAge(airTraveler.getAge());
                        po.setGender(airTraveler.getGender());
                        po.setBirthDate(xmlDate2StringWithShanghaiTimezone(airTraveler.getBirthDate()));
                        po.setPtcsubType(airTraveler.getPTCSubType());
                        po.setVerifyAdtAccompanierAge(Utils.boolean2String(airTraveler.isVerifyADTAccompanierAge()));
                        po.setGroupInd(Utils.boolean2String(airTraveler.isGroupInd()));

                        Utils.consumeOrNull(airTraveler.getPersonName(), pName -> {
                            po.setTravelerName(Commons.getName(pName));
                            po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                        });

                        po.setTelephone(Utils.collection2String(airTraveler.getTelephone(), t -> Commons.getTelephone(t)));

                        Utils.getFirstNonNullConsume(airTraveler.getDocument(), doc -> {
                            po.setDocId(doc.getDocID());
                            po.setDocType(Utils.toWrapperLong(doc.getDocType()));
                            po.setDocNationality(doc.getDocHolderNationality());
                            po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(doc.getExpireDate()));
                            po.setBirthCountry(doc.getBirthCountry());
                            po.setDocIssueCountry(doc.getDocIssueCountry());
                            po.setAdditionalDoc(Commons.getAdditionalDoc(doc.getAdditionalDocument()));
                        });
                        //TODO 此处可疑
                        Optional.ofNullable(airTraveler.getAPISInformation())
                                .ifPresent(t -> po.setDocRequired(t.getDocumentationRequired()));

                        //将这里改为了Value
                        Utils.getFirstNonNullConsume(airTraveler.getEmail(), e -> po.setEmail(e.getValue()));

                        Utils.getFirstNonNullConsume(airTraveler.getAddress(), addr -> {
                            po.setAddressFormattedInd(Utils.boolean2String(addr.isFormattedInd()));
                            Utils.getFirstNonNullConsume(addr.getAddressLine(), t -> {
                                po.setAddressLineindex(Utils.number2String(t.getIndex()));
                            });
                            po.setCityName(addr.getCityName());
                            Optional.ofNullable(addr.getStateProv())
                                    .ifPresent(stateProvType -> {
                                        //TODO 此处原来取得是getValue,Excel为准
                                        po.setStateProv(stateProvType.getStateCode());
                                    });
                            po.setPostalCode(addr.getPostalCode());
                            Optional.ofNullable(addr.getCountryName())
                                    .ifPresent(n -> po.setCountryName(n.getCode()));
                        });

                        Utils.getFirstNonNullConsume(airTraveler.getCustLoyalty(), custLoyalty -> {
                            po.setMembershipId(custLoyalty.getMembershipID());
                            po.setStatus(custLoyalty.getStatus());
                            po.setCustomerValue(custLoyalty.getCustomerValue());
                            po.setLoyalLevel(custLoyalty.getLoyalLevel());
                            po.setSignupDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getSignupDate()));
                            po.setEffectiveDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getEffectiveDate()));
                            po.setExpireDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getExpireDate()));
                            po.setSingleVendorInd(custLoyalty.getSingleVendorInd());
                        });
                        context.getMPAirTravelerInfoPos().add(po);
                    });
                });
    }

    /**
     * 解析 MP_AirPriceInfo_farefamilyPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirPriceInfoFarefamily(ModularProductType mp,
                                                      final ModularProductMetaInfo mpMetaInfo,
                                                      SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        Utils.getFirstNonNullOptional(air.getPriceInfo())
                .map(p -> p.getFareInfos())
                .map(infos -> infos.getFareInfo())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(fareInfoList -> {
                    fareInfoList.forEach(fareInfo -> {
                        TPAExtensionsType tpa = fareInfo.getTPAExtensions();
                        if (tpa == null) {
                            return;
                        }
                        MP_AirPriceInfo_farefamilyPo po = new MP_AirPriceInfo_farefamilyPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setPnr(Commons.getMpPnr(mp));
                        //逗号拼接
                        po.setTicketDesignatorCode(Utils.collection2String(fareInfo.getFareReference(),
                                t -> t.getTicketDesignatorCode())
                        );

                        //以下为原代码
                        Utils.streamNullable(tpa.getAny())
                                .filter(ele -> "FareFamilyInfo".equalsIgnoreCase(ele.getNodeName()))
                                .findAny()
                                .ifPresent(element -> {
                                    po.setFareFamilyCode(element.getAttribute("FareFamilyCode"));
                                    po.setFareFamilyName(element.getAttribute("FareFamilyName"));
                                    po.setChdRuleAsYfare(element.getAttribute("CHDRuleAsYFare"));
                                    po.setCabinName(element.getAttribute("CabinName"));
                                    po.setChangeToOpen(element.getAttribute("ChangeToOpen"));
                                    po.setDescription(element.getAttribute("Description"));
                                    po.setDomesticSelfCheckin(element.getAttribute("DomesticSelfCheckin"));
                                    po.setFareBasis(element.getAttribute("FareBasis"));
                                    po.setInfRuleAsYFare(element.getAttribute("INFRuleAsYFare"));
                                    po.setIntlSelfCheckin(element.getAttribute("InternationalSelfCheckin"));
                                    po.setUpgradable(element.getAttribute("Upgradable"));
                                    po.setUserType(element.getAttribute("UserType"));
                                    po.setUsername(element.getAttribute("Username"));

                                    NodeList datechange = element.getElementsByTagName("Datechange");
                                    if (datechange.getLength() > 0) {
                                        List<Element> elementList = Utils.nodeList2Element(datechange);
                                        //TODO 未决定取哪个, 字段类型改为String
                                        po.setChangeAftDeptRate(elementList.stream().map(c -> c.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                        po.setChangeBefDeptRate(elementList.stream().map(c -> c.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                        po.setChangeCurrency(elementList.stream().map(c -> c.getAttribute("Currency")).collect(Collectors.joining(",")));
                                        po.setChangePsgType(elementList.stream().map(c -> c.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                        po.setChangeTimeThreshold(elementList.stream().map(c -> c.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                        po.setChangeType(elementList.stream().map(c -> c.getAttribute("Type")).collect(Collectors.joining(",")));
                                        po.setChangeVoluntary(elementList.stream().map(c -> c.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                        po.setChangePolicyCabin(elementList.stream().map(c -> c.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                        po.setChangeStarttime(elementList.stream().map(c -> c.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                        po.setChangeEndtime(elementList.stream().map(c -> c.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                        po.setChangePolicyRbd(elementList.stream().map(c -> c.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                        po.setChangeLimit(elementList.stream().map(c -> c.getAttribute("Limit")).collect(Collectors.joining(",")));
                                    }

                                    NodeList refund = element.getElementsByTagName("Refund");
                                    if (refund.getLength() > 0) {
                                        List<Element> elementList = Utils.nodeList2Element(refund);
                                        po.setRefundAftDeptRate(elementList.stream().map(r -> r.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                        po.setRefundBefDeptRate(elementList.stream().map(r -> r.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                        po.setRefundCurrency(elementList.stream().map(r -> r.getAttribute("Currency")).collect(Collectors.joining(",")));
                                        po.setRefundPsgType(elementList.stream().map(r -> r.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                        po.setRefundTimeThreshold(elementList.stream().map(r -> r.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                        po.setRefundType(elementList.stream().map(r -> r.getAttribute("Type")).collect(Collectors.joining(",")));
                                        po.setRefundVoluntary(elementList.stream().map(r -> r.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                        po.setRefundPolicyCabin(elementList.stream().map(r -> r.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                        po.setRefundLimit(elementList.stream().map(r -> r.getAttribute("Limit")).collect(Collectors.joining(",")));
                                        po.setRefundEligible(elementList.stream().map(r -> r.getAttribute("Eligible")).collect(Collectors.joining(",")));
                                        po.setRefundLoyaltyRefundRuleId(elementList.stream().map(r -> r.getAttribute("LoyaltyRefundRuleID")).collect(Collectors.joining(",")));
                                        po.setRefundEndtime(elementList.stream().map(r -> r.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                        po.setRefundStarttime(elementList.stream().map(r -> r.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                        po.setRefundPolicyRbd(elementList.stream().map(r -> r.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                    }
                                });

                        context.getMPAirPriceInfoFarefamilyPos().add(po);
                    });
                });
    }

    /**
     * 解析 MP_AirPriceInfo_FareInfosPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirAirPriceInfoFareInfos(ModularProductType mp,
                                                        final ModularProductMetaInfo mpMetaInfo,
                                                        SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        Utils.getFirstNonNullOptional(air.getPriceInfo())
                .map(t -> t.getFareInfos())
                .map(infos -> infos.getFareInfo())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(fareInfoList -> {
                    for (AirItineraryPricingInfoType.FareInfos.FareInfo fareInfo : fareInfoList) {
                        List<FareInfoType.FareInfo> infos = fareInfo.getFareInfo();
                        if (CollectionUtils.isEmpty(infos)) {
                            continue;
                        }
                        infos.forEach(info -> {
                            MP_AirPriceInfo_FareInfosPo po = new MP_AirPriceInfo_FareInfosPo();

                            po.setSuperPnrId(mpMetaInfo.getSpnrId());
                            po.setSearchId(mpMetaInfo.getSearchId());
                            po.setProductNumber(mpMetaInfo.getProductNumber());
                            po.setPnr(Commons.getMpPnr(mp));

                            //TODO 尚未确定取首个还是拼接, 逗号拼接
                            po.setTicketDesignatorCode(Utils.collection2String(fareInfo.getFareReference(),
                                    t -> t.getTicketDesignatorCode())
                            );
                            po.setFlightSegmentRph(Utils.toWrapperLong(fareInfo.getFlightSegmentRPH()));
                            po.setOdRph(Utils.toWrapperLong(fareInfo.getOriginDestinationRPH()));

                            //这里是首个,与上面的逻辑不通
                            Utils.getFirstNonNullConsume(fareInfo.getFareReference(),
                                    ref -> {
                                        po.setCabinCode(ref.getCabinCode());
                                        po.setSubclass(ref.getResBookDesigCode());
                                    });

                            Optional.ofNullable(fareInfo.getFilingAirline())
                                    .ifPresent(filingAirline -> po.setFilingAirlineCode(filingAirline.getCode()));

                            Optional.ofNullable(fareInfo.getDepartureAirport())
                                    .ifPresent(port -> po.setDport(port.getLocationCode()));

                            Optional.ofNullable(fareInfo.getArrivalAirport())
                                    .ifPresent(port -> po.setAport(port.getLocationCode()));

                            po.setFareBasis(info.getFareBasis());
                            po.setDisCount(info.getDisCount());
                            po.setFcPriceInd(Utils.boolean2String(info.isFCPriceInd()));
                            po.setFcRph(Utils.toWrapperLong(info.getFCRPH()));

                            Optional.ofNullable(info.getFare())
                                    .ifPresent(f -> {
                                        po.setOrigPubAmt(Utils.number2String(f.getOrigPubAmount()));
                                        po.setOrigPubCurrencyCode(f.getOrigPubCurrencyCode());
                                        po.setBaseAmt(Utils.number2String(f.getBaseAmount()));
                                        po.setBaseCurrencyCode(f.getCurrencyCode());
                                        po.setDifferFare(Utils.number2String(f.getDifferFare()));
                                        po.setPriceType(f.getPriceType());
                                        po.setReissueAmt(Utils.number2String(f.getReissueAmt()));
                                        po.setReissueFee(Utils.number2String(f.getReissueFee()));
                                        po.setTaxesAmt(Utils.number2String(f.getTaxAmount()));
                                        po.setTotalFare(Utils.number2String(f.getTotalFare()));
                                        Optional.ofNullable(f.getTaxes())
                                                .ifPresent(t -> po.setTaxDetails(Commons.getTaxDetails(t.getTax())));
                                    });

                            po.setFareBasisCode(info.getFareBasisCode());

                            Utils.getFirstNonNullConsume(info.getPTC(), p -> {
                                po.setPtcSubType(p.getPTCSubType());
                                po.setPtcPsgType(p.getPassengerTypeCode());
                                po.setPtcQuantity(Utils.toWrapperLong(p.getQuantity()));
                            });

                            //原文
                            Optional.ofNullable(fareInfo.getTPAExtensions())
                                    .map(t -> t.getAny())
                                    .filter(CollectionUtils::isNotEmpty)
                                    .ifPresent(eleList -> {
                                        eleList.forEach(ele -> {
                                            String nodeName = ele.getNodeName();
                                            if ("MarketingData".equalsIgnoreCase(nodeName)) {
                                                NodeList lowestFare = ele.getElementsByTagName("LowestFare");
                                                if (lowestFare.getLength() > 0) {
                                                    Element item = (Element) lowestFare.item(0);
                                                    po.setLowestFare(item.getAttribute("Amount"));
                                                    po.setLowestFareSubclass(item.getAttribute("Cabin"));
                                                }
                                            }
                                        });
                                    });

                            Optional.ofNullable(info.getLoyalty())
                                    .map(l -> l.getCombinations())
                                    .map(l -> Utils.getFirstNonNull(l.getCombination()))
                                    .map(c -> c.getEarn())
                                    .ifPresent(e -> {
                                        po.setEarnQuantity(Utils.number2String(e.getQuantity()));
                                    });

                            Optional.ofNullable(fareInfo.getFareFamily())
                                    .ifPresent(family -> {
                                        po.setFareFamilyCode(family.getCode());
                                        po.setFareFamilyName(family.getName());
                                        Optional.ofNullable(family.getAddOns())
                                                .map(a -> a.getAddOn())
                                                .filter(CollectionUtils::isNotEmpty)
                                                .ifPresent(addOnList -> {
                                                    po.setAddOnSort(Utils.collection2String(addOnList, t -> Utils.number2String(t.getSort())));
                                                    //此处用的flatMap
                                                    po.setAddOnSortName(Utils.collectionFlatmap2String(addOnList, t ->
                                                                    Utils.streamNullable(t.getDescription()).map(a -> a.getName()),
                                                            Constants.JoinByCommaNull2Empty));
                                                    //此处用的flatMap
                                                    po.setAddOnCharSet(Utils.collectionFlatmap2String(addOnList, t -> Utils
                                                            .streamNullable(t.getDescription())
                                                            .flatMap(d -> d.getText().stream())
                                                            .map(i -> i.getCharSet()), Constants.JoinByCommaNull2Empty));
                                                });
                                    });

                            context.getMPAirPriceInfoInfoFareInfosPos().add(po);
                        });
                    }
                });
    }

    /**
     * 解析 MP_AirPriceInfo_PTCsPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirPriceInfoPTCs(ModularProductType mp,
                                                final ModularProductMetaInfo mpMetaInfo,
                                                SPNRContext context) {

        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        Utils.getFirstNonNullOptional(air.getPriceInfo())
                .map(priceInfo -> priceInfo.getPTCFareBreakdowns())
                .map(b -> b.getPTCFareBreakdown())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ptcs -> {
                    ptcs.forEach(ptc -> {
                        MP_AirPriceInfo_PTCsPo po = new MP_AirPriceInfo_PTCsPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setPnr(Commons.getMpPnr(mp));

                        Optional.ofNullable(ptc.getPassengerTypeQuantity())
                                .ifPresent(q -> {
                                    po.setPassengerTypeCode(q.getCode());
                                    po.setPtcSubType(q.getPTCSubType());
                                    po.setQuantity(Utils.toWrapperLong(q.getQuantity()));
                                });

                        Optional.ofNullable(ptc.getPassengerFare())
                                .ifPresent(pf -> {
                                    Optional.ofNullable(pf.getBaseFare())
                                            .ifPresent(bf -> {
                                                po.setBaseFareAdjusted(Utils.number2String(bf.getAdjusted()));
                                                po.setBaseFareAmt(Utils.number2String(bf.getAmount()));
                                                po.setBaseFareCurrencyCode(bf.getCurrencyCode());
                                                po.setBaseFareOriAmt(Utils.number2String(bf.getOriginalAmount()));
                                                po.setBaseFareOriCurrencyCode(bf.getOriginalCurrencyCode());
                                            });
                                    Optional.ofNullable(pf.getTaxes()).ifPresent(t -> {
                                        po.setTaxDetails(Commons.getTaxDetails(t.getTax()));
                                    });

                                    Optional.ofNullable(pf.getPriceAdjustments())
                                            .ifPresent(a -> {
                                                po.setPriceAdjustmentsAmt(Utils.number2String(a.getAmount()));
                                                po.setPriceAdjustmentsCurrencyCode(a.getCurrencyCode());
                                            });

                                    Optional.ofNullable(pf.getTotalFare())
                                            .ifPresent(t -> {
                                                po.setTotalFareAdjusted(t.getAdjusted());
                                                po.setTotalFareAmt(Utils.number2String(t.getAmount()));
                                                po.setTotalFareCurrencyCode(t.getCurrencyCode());
                                                po.setTotalFareOriAmt(Utils.number2String(t.getOriginalAmount()));
                                                po.setTotalFareOriCurrencyCode(t.getOriginalCurrencyCode());
                                            });

                                    //原文
                                    Optional.ofNullable(pf.getTPAExtensions())
                                            .map(t -> t.getAny())
                                            .ifPresent(eleList -> {
                                                eleList.forEach(element -> {
                                                    String eName = element.getNodeName();
                                                    String value = element.getTextContent();
                                                    switch (eName) {
                                                        case "FcPNRString":
                                                            po.setFcPnrString(value);
                                                            break;
                                                        case "FcString":
                                                            po.setFcString(value);
                                                            break;
                                                        case "FnString":
                                                            po.setFnString(value);
                                                            break;
                                                        case "FcAVString":
                                                            po.setFcAvstring(value);
                                                            break;
                                                        default:
                                                            break;
                                                    }
                                                });
                                            });
                                });

                        Optional.ofNullable(ptc.getEndorsements())
                                .map(e -> Utils.getFirstNonNull(e.getEndorsement()))
                                .ifPresent(e -> {
                                    po.setCharSet(e.getCharSet());
                                });

                        context.getMPAirPriceInfoPtCsPos().add(po);
                    });
                });
    }


    /**
     * 解析 MP_AirPriceInfo_ItinTotalFarePo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processAirPriceItinTotalFares(ModularProductType mp,
                                                      final ModularProductMetaInfo mpMetaInfo,
                                                      SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        //TODO 此处与原来粒度不同,原为priceInfo粒度,1->1 itinTotalFare粒度,可以
        Utils.getFirstNonNullConsume(air.getPriceInfo(), priceInfo -> {
            Optional.ofNullable(priceInfo.getItinTotalFare())
                    .ifPresent(itinTotalFare -> {
                        MP_AirPriceInfo_ItinTotalFarePo po = new MP_AirPriceInfo_ItinTotalFarePo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setPricingSource(Utils.applyOrNull(priceInfo.getPricingSource(), t -> t.value()));
                        po.setFareFamilyCode(priceInfo.getFareFamilyCode());
                        po.setFareFamilyName(priceInfo.getFareFamilyName());
                        po.setPriceQuoteDate(priceInfo.getPriceQuoteDate());

                        Optional.ofNullable(itinTotalFare.getBaseFare())
                                .ifPresent(fare -> {
                                    po.setBaseFareAdjusted(Utils.number2String(fare.getAdjusted()));
                                    po.setBaseFareAmt(Utils.number2String(fare.getAmount()));
                                    po.setBaseFareCurrencyCode(fare.getCurrencyCode());
                                    po.setBaseFareOriAmt(Utils.number2String(fare.getOriginalAmount()));
                                    po.setBaseFareOriCurrencyCode(fare.getOriginalCurrencyCode());
                                });

                        Optional.ofNullable(itinTotalFare.getTaxes())
                                .ifPresent(t -> {
                                    po.setTaxDetails(Commons.getTaxDetails(t.getTax()));
                                });

                        Optional.ofNullable(itinTotalFare.getTotalFare())
                                .ifPresent(fare -> {
                                    po.setTotalFareAdjusted(fare.getAdjusted());
                                    po.setTotalFareAmt(Utils.number2String(fare.getAmount()));
                                    po.setTotalFareCurrencyCode(fare.getCurrencyCode());
                                    po.setTotalFareOriAmt(Utils.number2String(fare.getOriginalAmount()));
                                    po.setTotalFareOriCurrencyCode(fare.getOriginalCurrencyCode());
                                });

                        context.setMpAirPriceInfoItinTotalFarePos(po);
                    });
        });
    }

    /**
     * 解析MP_AirAirItinerary_baggagePo
     *
     * @param od
     * @param mpMetaInfo
     * @param airMetaInfo
     * @return
     */
    private static List<MP_AirAirItinerary_baggagePo> parseBaggage(
            AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            final AirMetaInfo airMetaInfo) {

        if (CollectionUtils.isEmpty(od.getBaggage())) {
            return Collections.emptyList();
        }
        List<MP_AirAirItinerary_baggagePo> results = new LinkedList<>();
        od.getBaggage().forEach(baggage -> {
            MP_AirAirItinerary_baggagePo po = new MP_AirAirItinerary_baggagePo();
            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.setPnr(airMetaInfo.getPnr());
            po.setOdRph(Utils.toWrapperLong(od.getRPH()));
            po.setBaggageRph(Utils.toWrapperLong(baggage.getBaggageRPH()));
            po.setFlighSegmentRph(Utils.toWrapperLong(baggage.getFlightSegmentRPH()));
            po.setPieces(Utils.toWrapperLong(baggage.getPieces()));
            po.setTravelerRph(Utils.toWrapperLong(baggage.getTravelerRPH()));
            po.setPricingRph(Utils.toWrapperLong(baggage.getPricingRPH()));

            Optional.ofNullable(baggage.getWeight())
                    .ifPresent(weight -> {
                        po.setWeight(Utils.number2String(weight.getWeight()));
                        Utils.consumeOrNull(weight.getUnit(), u -> {
                            po.setWeightUnit(u.value());
                        });
                    });

            Optional.ofNullable(baggage.getSize()).ifPresent(size -> {
                po.setSizeCode(size.getCode());
                po.setSizeDescription(size.getDescription());
                po.setSizeHeight(Utils.number2String(size.getHeight()));
                po.setSizeLength(Utils.number2String(size.getLength()));
                po.setSizeWidth(Utils.number2String(size.getWidth()));
            });

            Optional.ofNullable(baggage.getSpecialItem()).ifPresent(specialItem -> {
                po.setSpecialItemCode(specialItem.getCode());
                po.setSpecialItemContext(specialItem.getCodeContext());
                po.setSpecialItemUri(specialItem.getURI());
            });
            //抄的原文
            Optional.ofNullable(baggage.getTPAExtensions())
                    .map(TPAExtensionsType::getAny)
                    .ifPresent(elementList -> {
                        Utils.streamNullable(elementList)
                                .filter(e -> "isFPC".equalsIgnoreCase(e.getNodeName()))
                                .findAny()
                                .ifPresent(e -> po.setIsFpc(e.getNodeValue()));

                        Utils.streamNullable(elementList)
                                .filter(e -> "PassageType".equalsIgnoreCase(e.getNodeName()))
                                .findAny()
                                .ifPresent(e -> po.setPassageTypeCode(e.getAttribute("Code")));
                    });

            results.add(po);
        });
        return results;
    }

    /**
     * 解析MP_AirAirItinerary_segmentPo
     *
     * @param od
     * @param mpMetaInfo
     * @param airMetaInfo
     * @return
     */
    private static List<MP_AirAirItinerary_segmentPo> parseMPAirAirItinerarySegmentPo(
            AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            final AirMetaInfo airMetaInfo) {
        if (CollectionUtils.isEmpty(od.getFlightSegment())) {
            return Collections.emptyList();
        }
        List<MP_AirAirItinerary_segmentPo> result = new LinkedList<>();

        od.getFlightSegment().forEach(seg -> {
            MP_AirAirItinerary_segmentPo po = new MP_AirAirItinerary_segmentPo();
            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.setPnr(airMetaInfo.getPnr());
            po.setOdRph(Utils.toWrapperLong(od.getRPH()));
            po.setFlightSegmentRph(Utils.toWrapperLong(seg.getRPH()));
            po.setInfoSource(seg.getInfoSource());
            po.setModType(seg.getModType());
            po.setOriginalRph(Utils.toWrapperLong(seg.getOriginalRPH()));

            Optional.ofNullable(seg.getDepartureAirport())
                    .ifPresent(d -> {
                        po.setDport(d.getLocationCode());
                        po.setDportContext(d.getCodeContext());
                        po.setDportTerminal(d.getTerminal());
                        po.setDcity(d.getTSCityCode());
                        po.setDcountry(d.getCountryCode());
                    });

            Optional.ofNullable(seg.getArrivalAirport())
                    .ifPresent(a -> {
                        po.setAport(a.getLocationCode());
                        po.setAportContext(a.getCodeContext());
                        po.setAportTerminal(a.getTerminal());
                        po.setAcity(a.getTSCityCode());
                        po.setAcountry(a.getCountryCode());
                    });

            po.setDepartureTime(xmlDate2StringWithUtcTimezone(seg.getDepartureDateTime()));
            po.setOriDepartureTime(seg.getOriginalDepartureDateTime());
            po.setArrivalTime(xmlDate2StringWithUtcTimezone(seg.getArrivalDateTime()));

            Optional.ofNullable(seg.getMarketingAirline()).ifPresent(a -> {
                po.setMarketingFlightNo(Commons.getMarketingFlightNo(seg));
                po.setSingleVendorInd(a.getSingleVendorInd());
            });

            po.setOperatingFlightNo(Commons.getOperatingFlightNo(seg));
            po.setCabinCode(seg.getCabinCode());
            po.setSubclass(seg.getResBookDesigCode());
            po.setStatus(seg.getStatus());
            po.setDuration(seg.getDuration());
            po.setInfantAvailQuantity(Utils.toWrapperLong(seg.getInfantAvailQuantity()));
            po.setMealCode(seg.getMealCode());
            po.setSegmentType(seg.getSegmentType());
            po.setInvControl(seg.getInvControl());
            po.setMileage(seg.getMileage());
            po.setStopQuantity(Utils.toWrapperLong(seg.getStopQuantity()));
            po.setPreCheckin(Utils.boolean2String(seg.isPreCheckin()));
            po.setOnlineCheckin(seg.getOnlineCheckin());

            Utils.getFirstNonNullConsume(seg.getEquipment(), e -> po.setAirEquipType(e.getAirEquipType()));
            po.setStopOver(seg.getStopOver());

            Utils.getFirstNonNullConsume(seg.getStopLocation(), stopLocation -> {
                po.setStoppoint(stopLocation.getLocationCode());
                po.setStopTime(Utils.number2String(stopLocation.getStopTime()));
                po.setStopContext(stopLocation.getCodeContext());
            });

            po.setAvInfo(Commons.getAvInfoJson(seg.getBookingClassAvails()));
            result.add(po);
        });
        return result;
    }


    /**
     * 解析MP_AirAirItineraryPo
     *
     * @param od
     * @param mpMetaInfo
     * @param airMetaInfo
     * @return
     */
    private static MP_AirAirItineraryPo parseMPAirAirItinerary(
            final AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
            final ModularProductMetaInfo mpMetaInfo,
            AirMetaInfo airMetaInfo) {

        MP_AirAirItineraryPo po = new MP_AirAirItineraryPo();

        po.setSuperPnrId(mpMetaInfo.getSpnrId());
        po.setSearchId(mpMetaInfo.getSearchId());
        po.setProductNumber(mpMetaInfo.getProductNumber());
        po.setPnr(airMetaInfo.getPnr());
        po.setDirectionInd(airMetaInfo.getDirectionId());
        po.setDocRequired(airMetaInfo.getDocRequired());
        po.setOdRph(Utils.toWrapperLong(od.getRPH()));
        po.setOdMajorityCarrier(od.getMajorityCarrier());
        po.setBookingChannel(od.getBookingChannel());
        po.setOdOpenjaw(od.getOpenjaw());
        po.setOdDuration(od.getDuration());
        po.setInfantAvailQuantity(Utils.toWrapperLong(od.getInfantAvailQuantity()));
        po.setMarketingFlightNum(od.getMarketingFlightNum());
        return po;
    }


    /**
     * 解析MP_AP_TravelerPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpApTraveler(ModularProductType mp,
                                            ModularProductMetaInfo mpMetaInfo,
                                            SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }
        TravelerInfoType travelerInfo = ancillaryProduct.getTravelerInfo();
        if (travelerInfo == null) {
            return;
        }

        Optional.ofNullable(travelerInfo.getAirTraveler())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(travelerList -> {
                    travelerList.forEach(traveler -> {
                        MP_AP_TravelerPo po = new MP_AP_TravelerPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setOjSuperPnrRph(Utils.toWrapperLong(traveler.getOJSuperPNRRPH()));
                        Optional.ofNullable(traveler.getTravelerRefNumber())
                                .ifPresent(t -> {
                                    po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH()));
                                });
                        po.setPassengerTypeCode(traveler.getPassengerTypeCode());
                        po.setAge(traveler.getAge());
                        po.setGender(traveler.getGender());
                        po.setBirthDate(xmlDate2StringWithShanghaiTimezone(traveler.getBirthDate()));
                        po.setPtcsubType(traveler.getPTCSubType());
                        po.setVerifyAdtAccompanierAge(Utils.boolean2String(traveler.isVerifyADTAccompanierAge()));
                        po.setGroupInd(Utils.boolean2String(traveler.isGroupInd()));
                        Optional.ofNullable(traveler.getPersonName())
                                .ifPresent(pName -> {
                                    po.setTravelerName(Commons.getName(pName));
                                    po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                                });

                        Optional.ofNullable(traveler.getTelephone())
                                .ifPresent(list -> {
                                    po.setTelephone(Utils.collection2String(list, t -> Commons.getTelephone(t)));
                                });

                        Utils.getFirstNonNullConsume(traveler.getDocument(), t -> {
                            po.setDocId(t.getDocID());
                            po.setDocType(Utils.toWrapperLong(t.getDocType()));
                            po.setDocNationality(t.getDocHolderNationality());
                            po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(t.getExpireDate()));
                            po.setDocBirthCountry(t.getBirthCountry());
                            po.setDocIssueCountry(t.getDocIssueCountry());
                            po.setAdditionalDoc(Commons.getAdditionalDoc(t.getAdditionalDocument()));
                        });

                        Optional.ofNullable(Utils.getFirstNonNull(travelerInfo.getAirTraveler()))
                                .map(t -> t.getAPISInformation())
                                .ifPresent(t -> {
                                    po.setDocRequired(t.getDocumentationRequired());
                                });

                        Utils.getFirstNonNullConsume(traveler.getCustLoyalty(), t -> {
                            po.setMembershipId(t.getMembershipID());
                            po.setStatus(t.getStatus());
                            po.setCustomerValue(t.getCustomerValue());
                            po.setLoyalLevel(t.getLoyalLevel());
                            po.setSingleVendorInd(t.getSingleVendorInd());
                        });
                        context.getMpApTravelerList().add(po);
                    });
                });
    }

    /**
     * 解析MP_Baggage_TravelerPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpBaggageTraveler(ModularProductType mp,
                                                 ModularProductMetaInfo mpMetaInfo,
                                                 SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if (baggage == null) {
            return;
        }

        Optional.ofNullable(baggage.getTravelerInfo())
                .map(t -> t.getAirTraveler())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(travelerList -> {
                    travelerList.forEach(traveler -> {
                        MP_Baggage_TravelerPo po = new MP_Baggage_TravelerPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setOjSuperPnrRph(Utils.toWrapperLong(traveler.getOJSuperPNRRPH()));
                        Optional.ofNullable(traveler.getTravelerRefNumber())
                                .ifPresent(t -> po.setTravelerRph(Utils.toWrapperLong(t.getRPH())));
                        po.setPassengerTypeCode(traveler.getPassengerTypeCode());
                        po.setAge(traveler.getAge());
                        po.setGender(traveler.getGender());
                        po.setBirthDate(xmlDate2StringWithShanghaiTimezone(traveler.getBirthDate()));
                        po.setPtcsubType(traveler.getPTCSubType());
                        po.setVerifyAdtAccompanierAge(Utils.boolean2String(traveler.isVerifyADTAccompanierAge()));
                        po.setGroupInd(Utils.boolean2String(traveler.isGroupInd()));
                        Optional.ofNullable(traveler.getPersonName())
                                .ifPresent(pName -> {
                                    po.setTravelerName(Commons.getName(pName));
                                    po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                                });

                        Optional.ofNullable(traveler.getTelephone())
                                .ifPresent(list -> {
                                    po.setTelephone(Utils.collection2String(list, t -> Commons.getTelephone(t)));
                                });

                        Utils.getFirstNonNullConsume(traveler.getDocument(), t -> {
                            po.setDocId(t.getDocID());
                            po.setDocType(Utils.toWrapperLong(t.getDocType()));
                            po.setDocNationality(t.getDocHolderNationality());
                            po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(t.getExpireDate()));
                            po.setBirthCountry(t.getBirthCountry());
                            po.setDocIssueCountry(t.getDocIssueCountry());
                            po.setAdditionalDoc(Commons.getAdditionalDoc(t.getAdditionalDocument()));
                        });

                        Optional.ofNullable((baggage.getTravelerInfo()))
                                .map(t -> Utils.getFirstNonNull(t.getAirTraveler()))
                                .map(t -> t.getAPISInformation())
                                .ifPresent(t -> {
                                    po.setDocRequired(t.getDocumentationRequired());
                                });

                        Utils.getFirstNonNullConsume(traveler.getCustLoyalty(), t -> {
                            po.setMembershipId(t.getMembershipID());
                            po.setStatus(t.getStatus());
                            po.setCustomerValue(t.getCustomerValue());
                            po.setLoyalLevel(t.getLoyalLevel());
                            po.setSingleVendorInd(t.getSingleVendorInd());
                        });
                        context.getMpBaggageTravelerList().add(po);
                    });
                });
    }

    /**
     * 解析MP_AP_SegmentPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpApSegment(ModularProductType mp,
                                           ModularProductMetaInfo mpMetaInfo,
                                           SPNRContext context) {

        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }
        AirReservationType air = ancillaryProduct.getAir();
        if (air == null) {
            return;
        }
        String pnr = Commons.getMpPnr(mp);

        AirItineraryType airItinerary = air.getAirItinerary();
        if (airItinerary == null) {
            return;
        }

        Optional.ofNullable(air.getAirItinerary())
                .map(t -> t.getOriginDestinationOptions())
                .map(t -> t.getOriginDestinationOption())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(optionList -> {
                    for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption option : optionList) {
                        List<OriginDestinationOptionType.FlightSegment> segments = option.getFlightSegment();
                        if (CollectionUtils.isEmpty(segments)) {
                            continue;
                        }
                        Long odRph = Utils.toWrapperLong(option.getRPH());
                        segments.forEach(segment -> {
                            MP_AP_SegmentPo po = new MP_AP_SegmentPo();

                            po.setSuperPnrId(mpMetaInfo.getSpnrId());
                            po.setSearchId(mpMetaInfo.getSearchId());
                            po.setProductNumber(mpMetaInfo.getProductNumber());
                            po.setPnr(pnr);
                            po.setOdRph(odRph);
                            po.setFlightSegmentRph(Utils.toWrapperLong(segment.getRPH()));
                            po.setInfoSource(segment.getInfoSource());
                            po.setModType(segment.getModType());
                            po.setFlightNumber(segment.getFlightNumber());
                            po.setOriginalRph(Utils.toWrapperLong(segment.getOriginalRPH()));
                            Utils.consumeOrNull(segment.getDepartureAirport(), t -> po.setDport(t.getLocationCode()));
                            Utils.consumeOrNull(segment.getArrivalAirport(), t -> po.setAport(t.getLocationCode()));
                            po.setDepartureTime(xmlDate2StringWithUtcTimezone(segment.getDepartureDateTime()));
                            po.setOriDepartureTime(segment.getOriginalDepartureDateTime());
                            po.setArrivalTime(xmlDate2StringWithUtcTimezone(segment.getArrivalDateTime()));

                            Utils.consumeOrNull(segment.getMarketingAirline(), t -> {
                                po.setMarketingFlightNo(Commons.getMarketingFlightNo(segment));
                                po.setSingleVendorInd(t.getSingleVendorInd());
                            });

                            po.setOperatingFlightNo(Commons.getOperatingFlightNo(segment));
                            po.setCabinCode(segment.getCabinCode());
                            po.setSubclass(segment.getResBookDesigCode());
                            po.setStatus(segment.getStatus());
                            po.setDuration(segment.getDuration());
                            po.setInfantAvailQuantity(Utils.toWrapperLong(segment.getInfantAvailQuantity()));
                            po.setMealCode(segment.getMealCode());
                            po.setSegmentType(segment.getSegmentType());
                            po.setInvControl(segment.getInvControl());
                            po.setMileage(segment.getMileage());
                            po.setStopQuantity(Utils.toWrapperLong(segment.getStopQuantity()));
                            po.setPreCheckin(Utils.boolean2String(segment.isPreCheckin()));
                            po.setOnlineCheckin(segment.getOnlineCheckin());

                            Utils.getFirstNonNullConsume(segment.getEquipment(), e -> po.setAirEquipType(e.getAirEquipType()));
                            po.setStopOver(segment.getStopOver());

                            Utils.getFirstNonNullConsume(segment.getStopLocation(), t -> {
                                po.setStoppoint(t.getLocationCode());
                                po.setStopContext(t.getCodeContext());
                                po.setStopTime(Utils.number2String(t.getStopTime()));
                            });
                            po.setAvInfo(Commons.getAvInfoJson(segment.getBookingClassAvails()));
                            context.getMpApSegmentList().add(po);
                        });
                    }
                });
    }


    /**
     * 解析MP_Baggage_SegmentPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpBaggageSegment(ModularProductType mp,
                                                ModularProductMetaInfo mpMetaInfo,
                                                SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if (baggage == null) {
            return;
        }
        AirReservationType air = baggage.getAir();
        if (air == null) {
            return;
        }
        String pnr = Commons.getMpPnr(mp);

        Optional.ofNullable(air.getAirItinerary())
                .map(t -> t.getOriginDestinationOptions())
                .map(t -> t.getOriginDestinationOption())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(optionList -> {
                    for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption option : optionList) {
                        List<OriginDestinationOptionType.FlightSegment> segmentList = option.getFlightSegment();
                        if (CollectionUtils.isEmpty(segmentList)) {
                            continue;
                        }
                        segmentList.forEach(segment -> {
                            MP_Baggage_SegmentPo po = new MP_Baggage_SegmentPo();

                            po.setSuperPnrId(mpMetaInfo.getSpnrId());
                            po.setSearchId(mpMetaInfo.getSearchId());
                            po.setProductNumber(mpMetaInfo.getProductNumber());
                            po.setPnr(pnr);
                            po.setOdRph(Utils.toWrapperLong(option.getRPH()));
                            po.setFlightSegmentRph(Utils.toWrapperLong(segment.getRPH()));
                            po.setInfoSource(segment.getInfoSource());
                            po.setModType(segment.getModType());
                            po.setFlightNumber(segment.getFlightNumber());
                            po.setOriginalRph(Utils.toWrapperLong(segment.getOriginalRPH()));
                            Utils.consumeOrNull(segment.getDepartureAirport(), t -> po.setDport(t.getLocationCode()));
                            Utils.consumeOrNull(segment.getArrivalAirport(), t -> po.setAport(t.getLocationCode()));
                            po.setDepartureTime(xmlDate2StringWithUtcTimezone(segment.getDepartureDateTime()));
                            po.setOriDepartureTime(segment.getOriginalDepartureDateTime());
                            po.setArrivalTime(xmlDate2StringWithUtcTimezone(segment.getArrivalDateTime()));

                            Utils.consumeOrNull(segment.getMarketingAirline(), t -> {
                                po.setMarketingFlightNo(Commons.getMarketingFlightNo(segment));
                                po.setSingleVendorInd(t.getSingleVendorInd());
                            });
                            po.setOperatingFlightNo(Commons.getOperatingFlightNo(segment));

                            po.setCabinCode(segment.getCabinCode());
                            po.setSubclass(segment.getResBookDesigCode());
                            po.setStatus(segment.getStatus());
                            po.setDuration(segment.getDuration());
                            po.setInfantAvailQuantity(Utils.toWrapperLong(segment.getInfantAvailQuantity()));
                            po.setMealCode(segment.getMealCode());
                            po.setSegmentType(segment.getSegmentType());
                            po.setInvControl(segment.getInvControl());
                            po.setMileage(segment.getMileage());
                            po.setStopQuantity(Utils.toWrapperLong(segment.getStopQuantity()));
                            po.setPreCheckin(Utils.boolean2String(segment.isPreCheckin()));
                            po.setOnlineCheckin(segment.getOnlineCheckin());
                            Utils.getFirstNonNullConsume(segment.getEquipment(), t -> po.setAirEquipType(t.getAirEquipType()));
                            po.setStopOver(segment.getStopOver());
                            Utils.getFirstNonNullConsume(segment.getStopLocation(), t -> {
                                po.setStopPoint(t.getLocationCode());
                                po.setStopContext(t.getCodeContext());
                                po.setStopTime(Utils.number2String(t.getStopTime()));
                            });
//                            Optional.ofNullable(segment.getBookingClassAvails())
//                                    .map(t -> t.getBookingClassAvail())
//                                    .filter(CollectionUtils::isNotEmpty)
//                                    .ifPresent(availList -> {
//                                        po.setAvRph(Utils.collection2String(availList, avail -> avail.getRPH()));
//                                        po.setAvSubclass(Utils.collection2String(availList, avail -> avail.getResBookDesigSub()));
//                                        po.setAvSubclassQuantity(Utils.collection2String(availList, avail -> avail.getResBookDesigQuantity()));
//                                        po.setAvSubclassStatus(Utils.collection2String(availList, avail -> avail.getResBookDesigStatusCode()));
//                                    });
                            po.setAvInfo(Commons.getAvInfoJson(segment.getBookingClassAvails()));

                            context.getMpBaggageSegmentList().add(po);
                        });
                    }
                });
    }

    /**
     * 解析MP_AP_TicketingPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpApTicketing(ModularProductType mp,
                                             ModularProductMetaInfo mpMetaInfo,
                                             SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }
        List<TicketingInfoType> ticketingList = ancillaryProduct.getTicketing();
        if (CollectionUtils.isEmpty(ticketingList)) {
            return;
        }
        ticketingList.forEach(ticketing -> {
            MP_AP_TicketingPo po = new MP_AP_TicketingPo();

            po.setSuperPnrId(mpMetaInfo.getSpnrId());
            po.setSearchId(mpMetaInfo.getSearchId());
            po.setProductNumber(mpMetaInfo.getProductNumber());
            po.seteTicketNumber(ticketing.getETicketNumber());
            //TODO 集合，未决定取哪个，取首个
            po.setTravelerRph(Utils.getFirstNonNullApply(ticketing.getTravelerRefNumber(), Utils::toWrapperLong));
            //逗号分隔
            po.setFlightSegmentRph(Utils.collection2String(ticketing.getFlightSegmentRefNumber()));

            po.setTicketAdvisory(Utils.collection2String(ticketing.getTicketAdvisory(), t -> t.getValue()));
            Utils.getFirstNonNullConsume(ticketing.getCheckInInfo(), checkInInfo -> {
                po.setBoardingTime(checkInInfo.getBoardingTime());
            });
            po.setTicketingStatus(ticketing.getTicketingStatus());
            po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticketing.getTicketTime()));
            context.getMpApTicketingPoList().add(po);
        });
    }

    /**
     * 解析MP_AP_LoungePo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processMpApLounge(ModularProductType mp,
                                          ModularProductMetaInfo mpMetaInfo,
                                          SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }

        AirAncillaryLoungeProductType lounge = ancillaryProduct.getLounge();
        if (lounge == null) {
            return;
        }
        Optional.ofNullable(lounge.getRooms())
                .map(t -> t.getRoom())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(roomList -> {
                    roomList.forEach(room -> {
                        MP_AP_LoungePo po = new MP_AP_LoungePo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());

                        Utils.consumeOrNull(lounge.getCheckInTime(), t -> {
                            po.setCheckinOffsetDropTime(t.getOffsetDropTime());
                            po.setCheckinOffsetTimeUnit(t.getOffsetTimeUnit());
                            po.setCheckinOffsetUnitMultiplier(Utils.number2String(t.getOffsetUnitMultiplier()));
                        });

                        po.setAreaSubType(room.getAreaSubType());
                        po.setAreaType(room.getAreaType());
                        po.setCapacity(Utils.toWrapperLong(room.getCapacity()));
                        po.setRoomCode(room.getCode());
                        Optional.ofNullable(room.getOpenTimes())
                                .map(t -> t.getOpenTime())
                                .ifPresent(o -> {
                                    po.setRoomOpentimeLanguage(o.getLanguage());
                                    po.setDescriptiveText(o.getDescriptiveText());
                                });
                        Utils.consumeOrNull(room.getGates(), g -> po.setGate(
                                Utils.collection2String(g.getGate()))
                        );
                        Utils.consumeOrNull(room.getContent(), content -> {
                            po.setRoomLanguage(content.getLanguage());
                            po.setDisplayName(content.getDisplayName());
                            po.setAirportName(content.getAirportName());
                            po.setShortContent(content.getShortContent());
                            po.setLocationDescription(content.getLocationDescription());
                            po.setOfficialName(content.getOfficialName());
                            po.setImageUrl(Utils.collection2String(content.getImage(), t ->
                                    t.getImageURL())
                            );
                        });

                        context.getMpApLoungePoList().add(po);
                    });
                });
    }

    /**
     * 解析 MP_AP_GroundTransportPo
     *
     * @param mp
     * @param mpMetaInfo
     * @param context
     */
    private static void processGroundTransport(ModularProductType mp,
                                               final ModularProductMetaInfo mpMetaInfo,
                                               SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }
        Optional.ofNullable(ancillaryProduct.getGroundTransportService())
                .map(t -> t.getJourneySegment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(segmentList -> {
                    segmentList.forEach(segment -> {
                        MP_AP_GroundTransportPo po = new MP_AP_GroundTransportPo();

                        po.setSuperPnrId(mpMetaInfo.getSpnrId());
                        po.setSearchId(mpMetaInfo.getSearchId());
                        po.setProductNumber(mpMetaInfo.getProductNumber());
                        po.setFlightSegmentRph(Utils.toWrapperLong(ancillaryProduct.getFlightSegmentRPH()));
                        //TODO 此处逻辑不明,先取首个,尚未决定
                        Optional.ofNullable(ancillaryProduct.getTravelerInfo())
                                .map(t -> Utils.getFirstNonNullApply(t.getAirTraveler(), a -> a.getTravelerRefNumber()))
                                .map(t -> t.getRPH())
                                .ifPresent(t -> po.setTravelerRph(Utils.toWrapperLong(t)));

                        po.setRph(Utils.toWrapperLong(segment.getRPH()));
                        Utils.consumeOrNull(segment.getTrainSegment(), trainSegment -> {
                            Optional.ofNullable(trainSegment.getDepartureStation())
                                    .map(t -> t.getDetails())
                                    .ifPresent(t -> {
                                        po.setdStationType(t.getLocationCategory());
                                        po.setdStationCode(t.getLocationCode());
                                        po.setdStationName(t.getName());
                                    });

                            Optional.ofNullable(trainSegment.getArrivalStation())
                                    .map(t -> t.getDetails())
                                    .ifPresent(t -> {
                                        po.setaStationType(t.getLocationCategory());
                                        po.setaStationCode(t.getLocationCode());
                                        po.setaStationName(t.getName());
                                    });

                            Optional.ofNullable(trainSegment.getTrainInfo())
                                    .map(t -> t.getValidDate())
                                    .ifPresent(t -> {
                                        po.setStartPeriod(t.getStartPeriod());
                                        po.setEndPeriod(t.getEndPeriod());
                                    });
                        });

                        Utils.getFirstNonNullConsume(segment.getFareOption(), fareOption -> {
                            Optional.ofNullable(fareOption.getAccommodation())
                                    .ifPresent(t -> {
                                        Optional.ofNullable(t.getSeat()).ifPresent(s -> po.setSeatType(s.value()));
                                        Optional.ofNullable(t.getClazz())
                                                .map(c -> c.getValue())
                                                .ifPresent(c -> po.setClazz(c.value()));
                                    });


                            //TODO 取数逻辑不明,先用逗号分隔,待确定
                            Stream<RailFareType.BasicFare> stream = Utils.streamNullable(fareOption.getPriceDetail())
                                    .map(t -> t.getPriceBreakdown())
                                    .map(t -> t.getBasicFare());

                            po.setBasicFareAmount(Utils.stream2String(stream, t ->
                                    Utils.number2String(t.getAmount()), Constants.JoinByCommaNull2Empty));

                            po.setBasicFareCurrencyCode(Utils.stream2String(stream, t ->
                                    t.getCurrencyCode(), Constants.JoinByCommaNull2Empty));
                        });

                        context.getMpApGroundTransportPoList().add(po);
                    });
                });
    }


}
