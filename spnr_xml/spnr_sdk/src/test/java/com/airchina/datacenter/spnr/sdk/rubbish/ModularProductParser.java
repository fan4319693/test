package com.airchina.datacenter.spnr.sdk.rubbish;

/**
 * @author wgni
 * @since 2022/7/5
 */
//@SuppressWarnings("all")
public class ModularProductParser {

    /*
    public static void process(OJSuperPNR ojSuperPNR, SPNRContext context) {
        for (ModularProductType mp : ojSuperPNR.getModularProduct()) {
            Spnr_MPPo spnr_mpPo = parseModularProduct(mp, context);
            context.getSpnrMpList().add(spnr_mpPo);
            processAirItinerary(mp, spnr_mpPo, context);
            processPriceInfo(mp, spnr_mpPo, context);
            processTicketing(mp, spnr_mpPo, context);
            processAncillaryProduct(mp, spnr_mpPo, context);
            processBaggage(mp, spnr_mpPo, context);
            processPricing(mp, spnr_mpPo, context);
            processPriceAdjustments(mp, spnr_mpPo, context);
            processPricingAmendmentFee(mp, spnr_mpPo, context);
            processCancellationFee(mp, spnr_mpPo, context);
            processCancellationRefunds(mp, spnr_mpPo, context);
            processRemark(mp, spnr_mpPo, context);
            processAudits(mp, spnr_mpPo, context);
            processPTCs(mp, spnr_mpPo, context);
            processModifyType(mp, spnr_mpPo, context);
            processPaymentRefs(mp, spnr_mpPo, context);
            processItineraryReceipt(mp, spnr_mpPo, context);
        }
    }

    private static void processItineraryReceipt(ModularProductType mp,
                                                Spnr_MPPo mpPo,
                                                SPNRContext context) {
        ItineraryReceiptProductType itineraryReceipt = mp.getItineraryReceipt();
        // 不存在itineraryReceipt节点
        if (itineraryReceipt == null) {
            return;
        }
        // 如果不存在ItineraryProduct节点
        if (CollectionUtils.isEmpty(itineraryReceipt.getItineraryProduct())) {
            return;
        }

        itineraryReceipt.getItineraryProduct().forEach(itineraryReceiptProduct -> {
            MP_itineraryreceiptPo po = new MP_itineraryreceiptPo();
            po.setSuperPnrId(context.getSPnrID());
            po.setSearchId(mpPo.getSearchId());
            po.setProductNumber(mpPo.getProductNumber());
            po.setChannel(itineraryReceipt.getChannel());
            po.setItineraryReceiptId(itineraryReceipt.getID());
            po.setLogisticsId(itineraryReceipt.getLogisticsID());
            po.setStatus(itineraryReceipt.getStatus());
            po.setProductArrivalDateTime(xmlDate2String(itineraryReceiptProduct.getArrivalDateTime()));
            po.setProductProductNumber(DateHelper.xmlBigIntegerToStr(itineraryReceiptProduct.getProductNumber()));
            Optional.ofNullable(itineraryReceipt.getDeliveryInfo()).ifPresent(deliveryInfo -> {
                po.setTrackingNumber(deliveryInfo.getTrackingNumber());
                Utils.getFirstOptional(deliveryInfo.getRecipient()).ifPresent(r -> {
                    po.setRecipientPersonName(Utils.getName(r.getPersonName()));
                    Utils.getFirstOptional(r.getTelephone()).ifPresent(tel -> {
                        po.setRecipientTelephone(tel.getCountryAccessCode() + "-" + tel.getPhoneNumberAttr());
                    });

                    Utils.getFirstOptional(r.getAddress()).ifPresent(addr -> {
                        po.setRecipientAddress(Utils.getValue(addr.getCountryName(), CountryNameType::getValue) + ","
                                + Utils.getValue(addr.getStateProv(), StateProvType::getValue) + ","
                                + addr.getCityName() + ","
                                + addr.getArea() + ","
                                + Utils.getFirstOptional(addr.getAddressLine()).map(AddressType.AddressLine::getValue).orElse("") + ","
                                + Utils.getValue(addr.getStreetNmbr(), AddressType.StreetNmbr::getValue));
                    });
                    Optional.ofNullable(deliveryInfo.getEstimatedPrice())
                            .ifPresent(estimatedPrice -> {
                                po.setEstimatedPrice(String.valueOf(estimatedPrice.getAmount()));
                                po.setRecipientCurrencyCode(estimatedPrice.getCurrencyCode());
                            });
                });
            });


            po.setProductChannel(itineraryReceiptProduct.getChannel());
            po.setProductGeoIndicator(itineraryReceiptProduct.getGeoIndicator());
            po.setProductHistoryId(Utils.toString(itineraryReceiptProduct.getHistoryID()));
            po.setProductProductType(itineraryReceiptProduct.getProductType());
            Utils.getFirstOptional(itineraryReceiptProduct.getTicketing()).ifPresent(t -> {
                po.setProductETicketNumber(t.getETicketNumber());
                Optional.ofNullable(t.getTicketPrice()).ifPresent(tPrice -> {
                    po.setProductTicketPrice(String.valueOf(tPrice.getAmount()));
                    po.setProductCurrencyCode(tPrice.getCurrencyCode());
                });
                Utils.getFirstOptional(t.getPassengerInfo()).ifPresent(p -> {
                    po.setProductPassengerName(Utils.getName(p.getPassengerName()));
                });

            });
            context.getMpItineraryReceiptPos().add(po);
        });
    }

    private static void processPaymentRefs(ModularProductType mp,
                                           Spnr_MPPo mpPo,
                                           SPNRContext context) {
        Optional
                .ofNullable(mp.getPaymentRefs())
                .filter(refs -> CollectionUtils.isNotEmpty(refs.getPaymentRef()))
                .ifPresent(paymentRefs ->
                        paymentRefs.getPaymentRef().forEach(ref -> {
                            MP_PaymentRefsPo po = new MP_PaymentRefsPo();
                            po.setSuperPnrId(context.getSPnrID());
                            po.setSearchId(mpPo.getSearchId());
                            po.setProductNumber(mpPo.getProductNumber());
                            po.setPnr(getPNR(mp));
                            po.setPaymentState(paymentRefs.getPaymentState().value());
                            po.setPaymentRefId(String.valueOf(ref.getID()));
                            po.setPaymentId(String.valueOf(ref.getPaymentID()));
                            po.setPaymentRefAuditId(String.valueOf(ref.getAuditID()));
                            context.getMPPaymentRefsPos().add(po);
                        }));

    }

    private static void processModifyType(ModularProductType mp,
                                          Spnr_MPPo mpPo,
                                          SPNRContext context) {
        Optional
                .ofNullable(mp.getModifyTypes())
                .map(modifyTypes -> modifyTypes.getModifyType())
                .ifPresent(mType -> mType.forEach(modifyType -> {
                    MP_ModifyTypesPo po = new MP_ModifyTypesPo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setSearchId(mpPo.getSearchId());
                    po.setProductNumber(mpPo.getProductNumber());
                    po.setPnr(getPNR(mp));
                    po.setAuditId(String.valueOf(modifyType.getAuditID()));
                    po.setOriginalHistoryId(String.valueOf(modifyType.getOriginalHistoryID()));
                    po.setRph(String.valueOf(modifyType.getRPH()));
                    po.setType(modifyType.getType());
                    po.setFreeDateChange(modifyType.getFreeDateChange());
                    po.setOldMpNum(String.valueOf(modifyType.getOldMPNum()));
                    po.setSplitRequired(modifyType.getSplitRequired());
                    po.setNeedCancel(String.valueOf(modifyType.isNeedCancel()));
                    po.setOldPnr(modifyType.getOldPNR());
                    po.setReshopId(String.valueOf(modifyType.getReshopID()));
                    context.getMPModifyTypesPos().add(po);
                }));
    }

    private static void processPTCs(ModularProductType mp,
                                    Spnr_MPPo mpPo,
                                    SPNRContext context) {
        Optional.ofNullable(mp.getPTCs()).map(ptcs -> ptcs.getPTC()).ifPresent(ptcs -> ptcs.forEach(ptc -> {
            MP_PtcsPo po = new MP_PtcsPo();
            po.setSuperPnrId(context.getSPnrID());
            po.setSearchId(mpPo.getSearchId());
            po.setProductNumber(mpPo.getProductNumber());
            po.setPnr(getPNR(mp));
            po.setPtcCode(ptc.getCode());
            po.setPtcQuantity(Utils.toInt(ptc.getQuantity()));
            po.setRphList(String.valueOf(ptc.getRPHList()));

            context.getMpPTCsPos().add(po);
        }));
    }

    private static void processAudits(ModularProductType mp,
                                      Spnr_MPPo mpPo,
                                      SPNRContext context) {

        Function<AuditType, MP_AuditsPo> mappingPo = (audit) -> {
            MP_AuditsPo po = new MP_AuditsPo();
            po.setSuperPnrId(context.getSPnrID());
            po.setSearchId(mpPo.getSearchId());
            po.setProductNumber(mpPo.getProductNumber());
            po.setPnr(getPNR(mp));
            po.setAuditId(String.valueOf(audit.getID()));
            po.setRequestorId(audit.getRequestorID());
            po.setChannel(audit.getChannel());
            po.setVersion(audit.getVersion());
            po.setInTimestamp(audit.getTimestamp());
            po.setSourceAddress(audit.getSourceAddress());
            po.setAction(audit.getAction());
            Optional.ofNullable(audit.getAgent()).ifPresent(a -> {
                po.setAgent(a.getAgent());
                po.setAgentUrl(a.getURL());
                po.setAgency(a.getAgency());
            });
            return po;
        };

        Optional.ofNullable(mp.getAudits()).map(a -> a.getAudit()).ifPresent(audits -> audits.forEach(audit -> {
            MP_AuditsPo po = mappingPo.apply(audit);
            context.getMPAuditsPos().add(po);
            Optional.ofNullable(audit.getEvents()).map(e -> e.getEvent()).ifPresent(events -> events.forEach(event -> {
                MP_AuditsPo po1 = mappingPo.apply(audit);
                po1.setEventContext(event.getContext());
                po1.setEventId(String.valueOf(event.getID()));
                po1.setEventOjSuperPnrRph(String.valueOf(event.getOJSuperPNRRPH()));
                po1.setEventOrigValue(event.getOrigValue());
                po1.setEventRefId(event.getRefId());
                po1.setEventPath(event.getPath());
                po1.setEventType(event.getType());
                po1.setEventFltSegRph(String.valueOf(event.getFlightSegmentRPH()));
                po1.setEventRefPath(event.getRefPath());
                context.getMPAuditsPos().add(po1);
            }));
        }));
    }

    private static void processRemark(ModularProductType mp,
                                      Spnr_MPPo mpPo,
                                      SPNRContext context) {
        Optional.ofNullable(mp.getRemarks()).map(r -> r.getRemark()).ifPresent(rmks -> rmks.forEach(rmk -> {
            RefundQualifiersType refundQualifiers = rmk.getRefundQualifiers();
            if (refundQualifiers == null) {
                return;
            }

            List<RefundQualifierType> refundQualifier = refundQualifiers.getRefundQualifier();
            if (CollectionUtils.isEmpty(refundQualifier)) {
                return;
            }

            refundQualifier.forEach(qualifier -> {
                MP_RemarksPo po = new MP_RemarksPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setSearchId(mpPo.getSearchId());
                po.setProductNumber(mpPo.getProductNumber());
                po.setActive(String.valueOf(rmk.isActive()));
                po.setAuditId(String.valueOf(rmk.getAuditID()));
                po.setCode(rmk.getCode());
                po.setCodeContext(rmk.getCodeContext());
                po.setOpsDate(xmlDate2String(rmk.getDate()));
                po.setLastModified(xmlDate2String(rmk.getLastModified()));
                po.setRph(String.valueOf(rmk.getRPH()));
                Optional.ofNullable(rmk.getAgent()).ifPresent(a -> {
                    po.setAgent(a.getAgent());
                    po.setAgentSourceAddress(a.getSourceAddress());
                    po.setInTimestamp(a.getTimestamp());
                });


                po.setQualifierDescription(qualifier.getQualifierDescription());
                po.setQualifierValue(qualifier.getQualifierValue());
                po.setFlightSegmentRph(qualifier.getFlightSegmentRPH());
                po.setOjSuperPnrRph(qualifier.getOJSuperPNRRPH());
                po.seteTicketNumber(qualifier.getETicketNumber());

                Optional.ofNullable(qualifier.getQualifierItem()).filter(CollectionUtils::isNotEmpty).ifPresent(item -> {
                    po.setQualifierItemName(item.stream().map(i -> i.getName()).collect(Collectors.joining(",")));

                    po.setQualifierItemValue(item.stream().map(i -> Utils.getValue(i, RefundQualifierType.QualifierItem::getValue)).collect(Collectors.joining(",")));
                });
                po.setPassengerTypeCode(qualifier.getPassengerTypeCode());
                po.setHistoryId(Utils.toString(qualifier.getHistoryID()));
                po.setProductNo(Utils.toString(qualifier.getProductNumber()));

                po.setTaxCode(qualifier.getTaxCode());
                context.getMPRemarksPos().add(po);
            });
        }));
    }

    private static void processCancellationRefunds(ModularProductType mp,
                                                   Spnr_MPPo mpPo,
                                                   SPNRContext context) {
        Optional
                .ofNullable(mp.getPricing())
                .map(p -> p.getCancellationRefunds())
                .map(r -> r.getCancellationRefund()).ifPresent(refunds -> refunds.forEach(refund -> {
                    MP_Pricing_CancellationRefundsPo po = new MP_Pricing_CancellationRefundsPo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setSearchId(mpPo.getSearchId());
                    po.setProductNumber(mpPo.getProductNumber());

                    po.setAllowAuto(refund.getAllowAuto());
                    po.setAmt(String.valueOf(refund.getAmount()));
                    po.setCurrencyCode(refund.getCurrencyCode());
                    po.setAuditId(String.valueOf(refund.getAuditID()));
                    po.setFlightSegmentRph(String.valueOf(refund.getFlightSegmentRPH()));
                    po.setMasterProductNumber(String.valueOf(refund.getMasterProductNumber()));
                    po.setOjSuperPnrRph(refund.getOJSuperPNRRPH());
                    po.setCancelRfdProductNumber(String.valueOf(refund.getProductNumber()));
                    po.setProductType(refund.getProductType());
                    Optional.ofNullable(refund.getTicketing()).map(Utils::getFirstOrNull).ifPresent(ticket -> {
                        po.seteTicketNumber(ticket.getETicketNumber());
                        Optional.ofNullable(ticket.getPricingInfo()).map(p -> p.getBaseFare()).ifPresent(fare -> {
                            po.setBaseFareAmt(String.valueOf(fare.getAmount()));
                            po.setBaseFareRefundAmt(String.valueOf(fare.getRefundAmount()));

                        });
                        Optional.ofNullable(ticket.getPricingInfo())
                                .map(p -> p.getTaxes())
                                .map(t -> t.getTax())
                                .ifPresent(taxes -> po
                                        .setTaxesRefund(taxes.stream()
                                                .map(t -> t.getAmount() + "," + t.getRefundAmount() + "," + t.getTaxCode())
                                                .collect(Collectors.joining(Utils.PIPE))));
                    });
                    Optional.ofNullable(refund.getAgent()).ifPresent(agent -> {
                        po.setAgent(agent.getAgent());
                        po.setAgentUrl(agent.getURL());
                        po.setAgency(agent.getAgency());
                    });
                    context.getMPPricingCancellationRefundsPos().add(po);
                }));
    }

    private static void processCancellationFee(ModularProductType mp,
                                               Spnr_MPPo mpPo,
                                               SPNRContext context) {
        Optional
                .ofNullable(mp.getPricing())
                .map(p -> p.getCancellationFees())
                .map(a -> a.getCancellationFee()).ifPresent(fees -> fees.forEach(fee -> {
                    MP_Pricing_CancellationFeesPo po = new MP_Pricing_CancellationFeesPo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setSearchId(mpPo.getSearchId());
                    po.setProductNumber(mpPo.getProductNumber());
                    po.setOjSuperPnrRph(fee.getOJSuperPNRRPH());
                    po.setAmt(Double.valueOf(fee.getAmount()));
                    po.setCurrencyCode(fee.getCurrencyCode());
                    po.setAuditId(String.valueOf(fee.getAuditID()));
                    po.setFlightSegmentRph(fee.getFlightSegmentRPH());
                    po.setAddedDate(xmlDate2String(fee.getDate()));
                    po.setMasterProductNumber(String.valueOf(fee.getMasterProductNumber()));
                    po.setPercentage(String.valueOf(fee.getPercentage()));
                    po.setCancelProductNumber(String.valueOf(fee.getProductNumber()));
                    po.setProductType(fee.getProductType());
                    Optional.ofNullable(fee.getAgent()).ifPresent(agent -> {
                        po.setAgency(agent.getAgent());
                        po.setAgentUrl(agent.getURL());
                        po.setAgency(agent.getAgency());
                    });
                    context.getMPPricingCancellationFeesPos().add(po);
                }));
    }

    private static void processPricingAmendmentFee(ModularProductType mp,
                                                   Spnr_MPPo mpPo,
                                                   SPNRContext context) {
        Optional
                .ofNullable(mp.getPricing())
                .map(p -> p.getAmendmentFees())
                .map(a -> a.getAmendmentFee()).ifPresent(fees -> fees.forEach(fee -> {
                    MP_Pricing_AmendmentFeePo po = new MP_Pricing_AmendmentFeePo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setSearchId(mpPo.getSearchId());
                    po.setProductNumber(mpPo.getProductNumber());
                    po.setPnr(getPNR(mp));
                    po.setAmt(Double.valueOf(fee.getAmount()));
                    po.setCurrencyCode(fee.getCurrencyCode());
                    po.setDate(xmlDate2String(fee.getDate()));
                    context.getMPPricingAmendmentFeePos().add(po);
                }));
    }

    private static void processPriceAdjustments(ModularProductType mp,
                                                Spnr_MPPo mpPo,
                                                SPNRContext context) {
        Optional
                .ofNullable(mp.getPricing())
                .map(p -> p.getPriceAdjustments())
                .map(p -> p.getPriceAdjustment())
                .ifPresent(adjs -> adjs.forEach(adj -> {
                    MP_Pricing_PriceAdjustmentsPo po = new MP_Pricing_PriceAdjustmentsPo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setSearchId(mpPo.getSearchId());
                    po.setProductNumber(mpPo.getProductNumber());
                    po.setPnr(getPNR(mp));
                    po.setAdjustDate(xmlDate2String(adj.getDate()));
                    po.setCode(adj.getCode());
                    po.setProductType(adj.getProductType());
                    po.setDescription(adj.getDescription());
                    po.setAmt(Double.valueOf(adj.getAmount()));
                    po.setCurrencyCode(adj.getCurrencyCode());
                    po.setUnitAmt(Objects.isNull(adj.getUnitAmount()) ? null : Double.valueOf(adj.getUnitAmount()));
                    po.setAuditId(String.valueOf(adj.getAuditID()));
                    po.setPassengerTypeCode(adj.getPassengerTypeCode());
                    po.setFlightSegmentRph(adj.getFlightSegmentRPH());

                    Optional.ofNullable(adj.getAgent()).ifPresent(agent -> {
                        po.setAgency(agent.getAgent());
                        po.setAgentUrl(agent.getURL());
                        po.setAgency(agent.getAgency());
                    });
                    context.getMPPricingPriceAdjustmentsPos().add(po);
                }));
    }

    private static void processPricing(ModularProductType mp,
                                       Spnr_MPPo mpPo,
                                       SPNRContext context) {
        ProductPricingType pricing = mp.getPricing();
        if (pricing == null) {
            return;
        }
        MP_PricingPo po = new MP_PricingPo();

        po.setSuperPnrId(context.getSPnrID());
        po.setSearchId(mpPo.getSearchId());
        po.setProductNumber(mpPo.getProductNumber());
        po.setPnr(getPNR(mp));
        Optional.ofNullable(pricing.getPrePayTotal()).ifPresent(preTotal -> {
            po.setPreAmt(preTotal.getAmount() + preTotal.getCurrencyCode());
            po.setPrePayInd(String.valueOf(preTotal.isPrePayInd()));
            po.setTotalAmt(preTotal.getAmount() + preTotal.getCurrencyCode());
        });
        Optional.ofNullable(pricing.getLoyalty())
                .map(LoyaltyProductType::getRedemption)
                .map(LoyaltyProductType.Redemption::getRedeem)
                .ifPresent(redeem -> {
                    po.setRedeemQuantity(redeem.getQuantity());
                    po.setAmountRedeemed(redeem.getAmountRedeemed() + redeem.getCurrencyCode());
                });

        Optional.ofNullable(pricing.getPriceAdjustments()).ifPresent(prc ->
                po.setAdjustmentsAmt(prc.getAmount() + prc.getCurrencyCode()));
        Optional.ofNullable(pricing.getCancellationFees()).ifPresent(prc ->
                po.setCancellationFees(prc.getAmount() + prc.getCurrencyCode()));
        Optional.ofNullable(pricing.getCancellationRefunds()).ifPresent(prc ->
                po.setCancellationRefunds(prc.getAmount() + prc.getCurrencyCode()));

        context.getMpPricingPos().add(po);
    }

    private static void processBaggage(ModularProductType mp,
                                       Spnr_MPPo mpPo,
                                       SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if (baggage == null) {
            return;
        }

        MP_BaggagePo po = new MP_BaggagePo();

        po.setSuperPnrId(context.getSPnrID());
        po.setSearchId(mpPo.getSearchId());
        po.setProductNumber(mpPo.getProductNumber());
        Optional.ofNullable(baggage.getAir()).ifPresent(air -> {
            if (CollectionUtils.isNotEmpty(air.getBookingReferenceID())) {
                po.setPnr(Utils.getPNR(air.getBookingReferenceID()));
            } else {
                po.setPnr(air.getBookingReferenceIDAttr());
            }

        });
        po.setCancelable(String.valueOf(baggage.isCancelable()));
        po.setQuantity(baggage.getQuantity());
        po.setRefundable(String.valueOf(baggage.isRefundable()));
        po.setIsSegBind(String.valueOf(baggage.isIsSegBind()));
        Optional.ofNullable(baggage.getOriginDestination()).ifPresent(od -> {
            po.setDepartureCode(od.getDepartureCode());
            po.setArrivalCode(od.getArrivalCode());
            Optional.ofNullable(od.getService()).ifPresent(service -> {
                Optional.ofNullable(service.getBaggage()).ifPresent(bag -> {
                    po.setMaxWeightUnit(bag.getMaxWeight().get(0).getUnit().value());
                    po.setMaxDimensionslCm(bag.getMaxDimensions().get(0).getLCM().toString());
                    po.setMaxDimensionsUnits(bag.getMaxDimensions().get(0).getUnits().value());
                });
                Optional.ofNullable(service.getTotalAmount()).ifPresent(totalAmount -> {
                    po.setAdjusted(String.valueOf(totalAmount.getAdjusted()));
                    po.setAmt(String.valueOf(totalAmount.getAmount()));
                    po.setAmtBeforeTax(String.valueOf(totalAmount.getAmountBeforeTax()));
                    po.setCurrencyCode(totalAmount.getCurrencyCode());
                    po.setDecimalPlaces(String.valueOf(totalAmount.getDecimalPlaces()));
                    po.setOriAmtAfterTax(String.valueOf(totalAmount.getOriginalAmountAfterTax()));
                    po.setOriCurrencyCode(totalAmount.getOriginalCurrencyCode());
                });
                po.setFlightSegmentNumber(String.valueOf(service.getFlightSegmentNumber()));
                po.setSegmentIdRef(String.valueOf(service.getSegmentIDRef()));
                po.setTravelerIdRef(Utils.getFirstOrDefault(service.getTravelerIDRef(), 0).toString());
            });
        });

        Optional.ofNullable(baggage.getCancellationPenalties())
                .map(p -> Utils.getFirstOrNull(p.getCancelPenalty()))
                .map(p -> p.getAmountPercent())
                .map(p -> p.getAmount())
                .ifPresent(a -> po.setCancelAmount(String.valueOf(a)));

        Optional.ofNullable(baggage.getTicketing()).ifPresent(ticketingInfoTypes -> ticketingInfoTypes.forEach(
                ticketing -> {
                    // TODO: 这里虽然是数组但是xds上显示的确实attribute，取第一条，而且观察数据，如果一个票对应多个航段会生成多条数据相同的
                    po.setFlightSegmentRefNumber(Utils.getFirstOrDefault(ticketing.getFlightSegmentRefNumber(), ""));
                    po.setGeoIndicator(ticketing.getGeoIndicator());
                    po.setSaleModel(ticketing.getSaleModel());
                    po.setTicketTime(xmlDate2String(ticketing.getTicketTime()));
                    po.setTicketingStatus(ticketing.getTicketingStatus());
                    po.seteTicketNumber(ticketing.getETicketNumber());
                    po.setTicketAdvisory(Utils.streamNullable(ticketing.getTicketAdvisory()).map(FreeTextType::getValue)
                            .collect(Collectors.joining(",")));
                    System.out.println(ticketing.getTravelerRefNumber());
                    context.getMpBaggagePos().add(po);
                }
        ));

        //范帅添加
        processMpBaggageSegment(mp, mpPo, context);

        processMpBaggageTraveler(mp, mpPo, context);

    }

    private static void processAncillaryProduct(ModularProductType mp,
                                                Spnr_MPPo mpPo,
                                                SPNRContext context) {
        ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
        if (ancillaryProduct == null) {
            return;
        }

        MP_AncillaryProductPo po = new MP_AncillaryProductPo();

        po.setSuperPnrId(context.getSPnrID());
        po.setSearchId(mpPo.getSearchId());
        po.setProductNumber(mpPo.getProductNumber());
        po.setPnr(ancillaryProduct.getBookingReferenceID());
        po.setCancelable(String.valueOf(ancillaryProduct.isCancelable()));
        po.setCategory(Objects.isNull(ancillaryProduct.getCategory()) ? StringUtils.EMPTY
                : ancillaryProduct.getCategory().value());
        po.setCode(ancillaryProduct.getCode());
        po.setBookDate(xmlDate2String(ancillaryProduct.getDate()));
        po.setOrigin(ancillaryProduct.getOrigin());
        po.setDestination(ancillaryProduct.getDestination());
        po.setFlightNumber(ancillaryProduct.getFlightNumber());
        po.setFlightSegmentRph(ancillaryProduct.getFlightSegmentRPH());


        po.setMarketingAirline(ancillaryProduct.getCarrier());
        po.setQuantity(ancillaryProduct.getQuantity());
        po.setRefundable(String.valueOf(ancillaryProduct.isRefundable()));
        po.setSeatNumber(ancillaryProduct.getSeatNumber());
        po.setType(ancillaryProduct.getType());
        po.setIsSegBind(String.valueOf(ancillaryProduct.isIsSegBind()));
        Optional
                .ofNullable(ancillaryProduct.getTravelerInfo())
                .ifPresent(t ->
                        po.setTravelerRefNumberRph(Utils
                                .streamNullable(t.getAirTraveler())
                                .map(tt -> Optional.ofNullable(tt.getTravelerRefNumber()).map(AirTravelerType.TravelerRefNumber::getRPH).orElse(""))
                                .collect(Collectors.joining(",")))
                );
        Optional
                .ofNullable(ancillaryProduct.getTicketing())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ticketingInfoTypes -> {
                    po.seteTicketNumber(ticketingInfoTypes.stream().map(TicketingInfoType::getETicketNumber).collect(Collectors.joining(",")));
                    po.setTicketAdvisory(ticketingInfoTypes
                            .stream()
                            .flatMap(ticketing -> Utils.streamNullable(ticketing.getTicketAdvisory()))
                            .filter(Objects::nonNull)
                            .map(FreeTextType::getValue)
                            .collect(Collectors.joining(",")));
                });
        Optional
                .ofNullable(ancillaryProduct.getContact())
                .map(ContactPersonType::getPersonName)
                .ifPresent(pName -> po.setContactPersonName(Utils.getName(pName)));

        po.setAirport(ancillaryProduct.getAirport());
        po.setBookingChannel(ancillaryProduct.getBookingChannel());
        po.setBookingReferenceId(ancillaryProduct.getBookingReferenceID());
        po.setBookingStatus(ancillaryProduct.getBookingStatus());
        po.setCabinClass(ancillaryProduct.getCabinClass());
        po.setCarrier(ancillaryProduct.getCarrier());
        po.setName(ancillaryProduct.getName());
        po.setOriginDestinationRph(ancillaryProduct.getOriginDestinationRPH());
        po.setPoolId(ancillaryProduct.getPoolID());
        po.setProductSequence(ancillaryProduct.getProductSequence());
        po.setQuantity(ancillaryProduct.getQuantity());
        po.setRef(ancillaryProduct.getREF());
        po.setRefundable(String.valueOf(ancillaryProduct.isRefundable()));
        po.setSellingProposition(ancillaryProduct.getSellingProposition());
        po.setSubType(ancillaryProduct.getSubType());
        po.setSupplierCode(ancillaryProduct.getSupplierCode());
        po.setSupplierProductCode(ancillaryProduct.getSupplierProductCode());
        Optional.ofNullable(ancillaryProduct.getSupplierDescriptiveContent()).ifPresent(sdc ->  {
            po.setSupplierName(sdc.getSupplierName());
            Optional.ofNullable(sdc.getBookingOffices())
                    .map(b ->  Utils.getFirstOrNull(b.getBookingOffice()))
                    .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice::getPhones)
                    .map(SupplierDescriptiveContentType.BookingOffices.BookingOffice.Phones::getPhone)
                    .ifPresent(phones -> {
                            po.setSupplierPhoneNumber(phones.stream()
                                    .map(Phone::getPhoneNumber)
                                    .filter(StringUtils::isNotBlank).collect(Collectors.joining("/")));
                    });
        });
        Optional.ofNullable(ancillaryProduct.getQRData())
                .map(qrDataType -> Utils.getFirstOrNull(qrDataType.getQRCode()))
                .ifPresent(qrCode -> {
                    po.setQRConsumedDateTime(xmlDate2String(qrCode.getConsumedDateTime()));
                });
        po.setTag(ancillaryProduct.getTag());
        po.setTerminal(ancillaryProduct.getTerminal());
        Optional
                .ofNullable(ancillaryProduct.getPrices())
                .map(prices -> Utils.getFirstOrNull(prices.getPrice()))
                .ifPresent(priceType -> {
                    po.setLoyaltyLevel(priceType.getLoyaltyLevel());
                    po.setPassengerTypeCode(priceType.getPassengerTypeCode());
                    Optional.ofNullable(priceType.getBase())
                            .ifPresent(base -> {
                                po.setBaseAmount(base.getAmount() + base.getCurrencyCode());
                                po.setUnitPrice(String.valueOf(base.getUnitPrice()));
                            });
                    Optional.ofNullable(priceType.getPriceAdjustments())
                            .ifPresent(adj -> {
                                if (Objects.isNull(adj.getAmount())) {
                                    Optional.ofNullable(adj.getPriceAdjustment())
                                            .map(prices -> Utils.getFirstOrNull(adj.getPriceAdjustment()))
                                            .ifPresent(priceAdjustments -> {
                                                po.setPriceAdjustmentsAmount(priceAdjustments.getAmount() + priceAdjustments.getCurrencyCode());
                                            });
                                } else {
                                    po.setPriceAdjustmentsAmount(adj.getAmount() + adj.getCurrencyCode());
                                }
                            });
                    Optional.ofNullable(priceType.getTotal())
                            .ifPresent(total -> {
                                po.setTotalAdjusted(total.getAdjusted() + total.getCurrencyCode());
                                po.setTotalAmount(total.getAmount() + total.getCurrencyCode());
                            });
                });
        Optional.ofNullable(ancillaryProduct.getLounge()).ifPresent(lounge -> {
            Optional.ofNullable(lounge.getCheckInTime()).ifPresent(checkIn -> {
                po.setCheckinOffsetDropTime(checkIn.getOffsetDropTime());
                po.setCheckinOffsetTimeUnit(checkIn.getOffsetTimeUnit());
                po.setCheckinOffsetUnitMultiplier(String.valueOf(checkIn.getOffsetUnitMultiplier()));
            });
            Optional
                    .ofNullable(lounge.getRooms())
                    .map(rooms -> Utils.getFirstOrNull(rooms.getRoom()))
                    .ifPresent(room -> {
                        po.setAreaSubType(room.getAreaSubType());
                        po.setAreaType(room.getAreaType());
                        po.setCapacity(room.getCapacity());
                        po.setRoomCode(room.getCode());
                        Optional.ofNullable(room.getOpenTimes()).map(AirAncillaryLoungeRoomType.OpenTimes::getOpenTime).ifPresent(o -> {
                            po.setRoomLanguage(o.getLanguage());
                            po.setDescriptiveText(o.getDescriptiveText());
                            po.setRoomOpentimeLanguage(o.getLanguage());
                        });
                        Optional.ofNullable(room.getGates()).ifPresent(g -> po.setGate(Utils.list2String(g.getGate())));
                        Optional.ofNullable(room.getContent()).ifPresent(content -> {
                            po.setRoomLanguage(content.getLanguage());
                            po.setDisplayName(content.getDisplayName());
                            po.setAirportName(content.getAirportName());
                            po.setShortContent(content.getShortContent());
                            po.setLocationDescription(content.getLocationDescription());
                            po.setOfficialName(content.getOfficialName());
                            po.setImageUrl(Utils.streamNullable(content.getImage()).map(AncillaryImage::getImageURL).collect(Collectors.joining(",")));
                        });

                    });

        });

        processMpApTicketing(ancillaryProduct, mpPo, context, po);
        processMpApLounge(ancillaryProduct, mpPo, context);
        processGroundTransport(ancillaryProduct, mpPo, context, po);

        //===============范帅===============
        processMpApSegment(ancillaryProduct, mpPo, context);
        processMpApTraveler(ancillaryProduct, mpPo, context);

        //===============范帅===============

        Optional
                .ofNullable(ancillaryProduct.getCancellationPenalties())
                .ifPresent(cancelPenaltiesType -> {
                    cancelPenaltiesType.getCancelPenalty().forEach(cancelPenalty -> {
                        processCancelPenalty(cancelPenalty, po);
                    });
                });

        context.getMpAncillaryProductPos().add(po);
    }

    private static void processCancelPenalty(CancelPenaltyType cancelPenalty, MP_AncillaryProductPo po) {
        Optional.of(cancelPenalty)
                .map(CancelPenaltyType::getDeadline)
                .ifPresent(deadline -> {
                    po.setCancelPenaltyDeadlineOffsetTimeUnit(deadline.getOffsetTimeUnit());
                    po.setCancelPenaltyDeadlineOffsetUnitMultiplier(String.valueOf(deadline.getOffsetUnitMultiplier()));
                });
        Optional.of(cancelPenalty)
                .map(CancelPenaltyType::getAmountPercent)
                .ifPresent(amt ->
                        po.setAmountPercent(String.valueOf(amt.getAmount())));
    }

    private static void processTicketing(ModularProductType mp,
                                         Spnr_MPPo mpPo,
                                         SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        List<TicketingFullInfoType> ticketing = air.getTicketing();
        if (CollectionUtils.isEmpty(ticketing)) {
            return;
        }
        ticketing.forEach(ticket -> {
            MP_AirTicketingPo po = new MP_AirTicketingPo();
            po.setSuperPnrId(context.getSPnrID());
            po.setSearchId(mpPo.getSearchId());
            po.setProductNumber(mpPo.getProductNumber());
            po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());
            po.setFlightSegmentRefNumber(Integer.parseInt(Utils.getFirstOrDefault(ticket.getFlightSegmentRefNumber(), "0")));
            po.setIrr(ticket.getIRRReason());
            po.setIrrReason(ticket.getIRRReason());
            po.setIssuingAgentId(String.valueOf(ticket.getIssuingAgentID()));
            po.setItemNumber(String.valueOf(ticket.getItemNumber()));
            po.setPrinted(String.valueOf(ticket.isPrinted()));
            po.setTicketTime(xmlDate2String(ticket.getTicketTime()));
            po.setTicketingStatus(ticket.getTicketingStatus());
            po.setTravelerRefNumber(Utils.getFirstOrDefault(ticket.getTravelerRefNumber(), ""));
            po.seteTicketNumber(ticket.getETicketNumber());
            po.setTicketTimeLimit(xmlDate2String(ticket.getTicketTimeLimit()));
            po.setExpiryDateTime(xmlDate2String(ticket.getExpiryDateTime()));
            po.setWaitlistStatus(ticket.getWaitlistStatus());


            List<RefundInfoType> refundInfoList = ticket.getRefundInfo();
            if (CollectionUtils.isNotEmpty(refundInfoList)) {
                po.setRefundAuditId(refundInfoList
                        .stream()
                        .map(s -> String.valueOf(s.getAuditID()))
                        .collect(Collectors.joining(",")));
                po.setRefundHistoryId(refundInfoList
                        .stream()
                        .map(s -> Utils.toString(s.getHistoryID()))
                        .collect(Collectors.joining(",")));
                po.setRefundHistoric(refundInfoList
                        .stream()
                        .map(s -> Utils.boolToString(s.isHistoric()))
                        .collect(Collectors.joining(",")));
                po.setRefundId(refundInfoList
                        .stream()
                        .map(s -> Utils.toString(s.getID()))
                        .collect(Collectors.joining(",")));

                po.setRefundStatus(refundInfoList
                        .stream()
                        .map(s -> Utils.getValue(s.getStatus(), RefundInfoStatusType::value))
                        .collect(Collectors.joining(",")));
                po.setRefundERefundNumber(refundInfoList
                        .stream()
                        .map(s -> s.getERefundNumber())
                        .collect(Collectors.joining(",")));
            }


//            Refund_eRefundNumber	OJ_SuperPNR/ModularProduct/Air/Ticketing/RefundInfo@eRefundNumber


            context.getMPAirTicketingPos().add(po);
        });

    }

    private static void processPriceInfo(ModularProductType mp,
                                         Spnr_MPPo mpPo,
                                         SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        List<BookingPriceInfoType> priceInfo = air.getPriceInfo();
        if (priceInfo == null) {
            return;
        }
        processAirPriceInfo(mp, mpPo, context);

        processAirPriceInfoPTCs(mp, mpPo, context);

        processAirAirPriceInfoFareInfos(mp, mpPo, context);

        processAirPriceInfoFarefamily(mp, mpPo, context);

        processAirTravelerInfo(mp, mpPo, context);
    }

    private static void processAirTravelerInfo(ModularProductType mp,
                                               Spnr_MPPo mpPo,
                                               SPNRContext context) {
        Optional.ofNullable(mp.getAir().getTravelerInfo()).map(TravelerInfoType::getAirTraveler).ifPresent(airTravelers -> {
            airTravelers.forEach(airTraveler -> {
                MP_AirTravelerInfoPo po = new MP_AirTravelerInfoPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setSearchId(mpPo.getSearchId());
                po.setProductNumber(mpPo.getProductNumber());
                po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());
                po.setOjSuperPnrRph(String.valueOf(airTraveler.getOJSuperPNRRPH()));
                Optional.ofNullable(airTraveler.getTravelerRefNumber()).ifPresent(tRef -> {
                    po.setTravelerRefNumberRph(String.valueOf(tRef.getRPH()));
                });
                po.setPassengerTypeCode(airTraveler.getPassengerTypeCode());
                po.setAge(airTraveler.getAge());
                po.setGender(airTraveler.getGender());
                po.setBirthDate(xmlDate2String(airTraveler.getBirthDate()));
                po.setPtcsubType(airTraveler.getPTCSubType());
                po.setVerifyAdtAccompanierAge(DateHelper.xmlBooltToStr(airTraveler.isVerifyADTAccompanierAge()));
                Optional.ofNullable(airTraveler.getPersonName())
                        .ifPresent(pName -> {
                            po.setTravelerName(Utils.getName(pName));
                            po.setNamePrefix(Utils.list2String(pName.getNamePrefix()));
                        });

                po.setTelephone(Utils.streamNullable(airTraveler.getTelephone())
                        //TODO 此处范帅做了修改
                        .map(ModularProductParser::fanshuaiGetTelV2).collect(Collectors.joining(",")));
                        //.map(ModularProductParser::getTelV2).collect(Collectors.joining(",")));
                Optional.ofNullable(airTraveler.getDocument()).map(Utils::getFirstOrNull).ifPresent(doc -> {
                    po.setDocId(doc.getDocID());
                    po.setDocType(Utils.tyrParseInt(doc.getDocType()));
                    po.setDocNationality(doc.getDocHolderNationality());
                    po.setBirthCountry(doc.getBirthCountry());
                    po.setDocIssueCountry(doc.getDocIssueCountry());
                    po.setDocExpireDate(xmlDate2String(doc.getExpireDate()));
                    Optional.ofNullable(doc.getAdditionalDocument()).ifPresent(addDocs ->
                            po.setAdditionalDoc(Utils.streamNullable(addDocs)
                                    .map(addDoc -> addDoc.getDocID() + "," + addDoc.getDocType())
                                    .collect(Collectors.joining(Utils.PIPE))));
                });

                Optional.ofNullable(airTraveler.getEmail()).map(Utils::getFirstOrNull).ifPresent(e -> po.setEmail(Utils.getValue(e, EmailType::getValue)));
                Optional.ofNullable(airTraveler.getAddress()).map(Utils::getFirstOrNull).ifPresent(addr -> {
                    po.setAddressFormattedInd(String.valueOf(addr.isFormattedInd()));
                    po.setAddressLineindex(String.valueOf(addr.getAddressLine().get(0).getIndex()));
                    po.setCityName(addr.getCityName());
                    po.setPostalCode(String.valueOf(addr.getPostalCode()));
                    Optional.ofNullable(addr.getStateProv()).ifPresent(stateProvType -> {
                        po.setStateProv(stateProvType.getValue());
                    });
                    Optional.ofNullable(addr.getCountryName()).ifPresent(n -> po.setCountryName(n.getCode()));
                });
                Optional.ofNullable(airTraveler.getCustLoyalty()).map(Utils::getFirstOrNull).ifPresent(custLoyalty -> {
                    po.setMembershipId(custLoyalty.getMembershipID());
                    po.setStatus(custLoyalty.getStatus());
                    po.setCustomerValue(custLoyalty.getCustomerValue());
                    po.setLoyalLevel(custLoyalty.getLoyalLevel());
                    po.setSignupDate(DateHelper.xmlDate2String(custLoyalty.getSignupDate()));
                    po.setEffectiveDate(DateHelper.xmlDate2String(custLoyalty.getEffectiveDate()));
                    po.setExpireDate(DateHelper.xmlDate2String(custLoyalty.getExpireDate()));
                    po.setSingleVendorInd(custLoyalty.getSingleVendorInd());
                    po.setMembershipId(custLoyalty.getMembershipID());
                });


                Optional
                        .of(mp.getAir().getTravelerInfo())
                        .flatMap(t -> Utils.getFirstOptional(t.getAirTraveler()))
                        .map(AirTravelerType::getAPISInformation)
                        .ifPresent(t -> po.setDocRequired(t.getDocumentationRequired()));
                po.setGroupInd(airTraveler.isGroupInd());
                context.getMPAirTravelerInfoPos().add(po);
            });
        });
    }

    private static void processAirPriceInfoFarefamily(ModularProductType mp,
                                                      Spnr_MPPo mpPo,
                                                      SPNRContext context) {
        Optional
                .ofNullable(mp.getAir().getPriceInfo())
                .map(Utils::getFirstOrNull)
                .map(p -> p.getFareInfos())
                .map(p -> p.getFareInfo())
                .ifPresent(fareInfos -> {
                    fareInfos.forEach(fareInfo -> {
                        TPAExtensionsType tpa = fareInfo.getTPAExtensions();
                        if (tpa == null) {
                            return;
                        }
                        MP_AirPriceInfo_farefamilyPo po = new MP_AirPriceInfo_farefamilyPo();
                        po.setSuperPnrId(context.getSPnrID());
                        po.setSearchId(mpPo.getSearchId());
                        po.setProductNumber(mpPo.getProductNumber());
                        po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());

                        Utils
                                .streamNullable(tpa.getAny())
                                .filter(e -> "FareFamilyInfo".equalsIgnoreCase(e.getNodeName()))
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
                                        List<Element> elemetList = new LinkedList<>();
                                        for (int dIndex = 0; dIndex < datechange.getLength(); dIndex++) {
                                            elemetList.add((Element) datechange.item(dIndex));
                                        }

                                        po.setChangeAftDeptRate(elemetList.stream().map(c -> c.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                        po.setChangeBefDeptRate(elemetList.stream().map(c -> c.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                        po.setChangeCurrency(elemetList.stream().map(c -> c.getAttribute("Currency")).collect(Collectors.joining(",")));
                                        po.setChangePsgType(elemetList.stream().map(c -> c.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                        po.setChangeTimeThreshold(elemetList.stream().map(c -> c.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                        po.setChangeType(elemetList.stream().map(c -> c.getAttribute("Type")).collect(Collectors.joining(",")));
                                        po.setChangeVoluntary(elemetList.stream().map(c -> c.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                        po.setChangePolicyCabin(elemetList.stream().map(c -> c.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                        po.setChangeStarttime(elemetList.stream().map(c -> c.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                        po.setChangeEndtime(elemetList.stream().map(c -> c.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                        po.setChangePolicyRbd(elemetList.stream().map(c -> c.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                        po.setChangeLimit(elemetList.stream().map(c -> c.getAttribute("Limit")).collect(Collectors.joining(",")));
                                    }


                                    NodeList refund = element.getElementsByTagName("Refund");
                                    if (refund.getLength() > 0) {
                                        List<Element> elemetList = new LinkedList<>();
                                        for (int rIndex = 0; rIndex < refund.getLength(); rIndex++) {
                                            elemetList.add((Element) refund.item(rIndex));
                                        }

                                        po.setRefundAftDeptRate(elemetList.stream().map(r -> r.getAttribute("AfterDepartureRate")).collect(Collectors.joining(",")));
                                        po.setRefundBefDeptRate(elemetList.stream().map(r -> r.getAttribute("BeforeDepartureRate")).collect(Collectors.joining(",")));
                                        po.setRefundCurrency(elemetList.stream().map(r -> r.getAttribute("Currency")).collect(Collectors.joining(",")));
                                        po.setRefundPsgType(elemetList.stream().map(r -> r.getAttribute("PassengerTypeCode")).collect(Collectors.joining(",")));
                                        po.setRefundTimeThreshold(elemetList.stream().map(r -> r.getAttribute("TimeThreshold")).collect(Collectors.joining(",")));
                                        po.setRefundType(elemetList.stream().map(r -> r.getAttribute("Type")).collect(Collectors.joining(",")));
                                        po.setRefundVoluntary(elemetList.stream().map(r -> r.getAttribute("Voluntary")).collect(Collectors.joining(",")));
                                        po.setRefundPolicyCabin(elemetList.stream().map(r -> r.getAttribute("PolicyCabin")).collect(Collectors.joining(",")));
                                        po.setRefundLimit(elemetList.stream().map(r -> r.getAttribute("Limit")).collect(Collectors.joining(",")));
                                        po.setRefundEligible(elemetList.stream().map(r -> r.getAttribute("Eligible")).collect(Collectors.joining(",")));
                                        po.setRefundLoyaltyRefundRuleId(elemetList.stream().map(r -> r.getAttribute("LoyaltyRefundRuleID")).collect(Collectors.joining(",")));
                                        po.setRefundEndtime(elemetList.stream().map(r -> r.getAttribute("EndTime")).collect(Collectors.joining(",")));
                                        po.setRefundStarttime(elemetList.stream().map(r -> r.getAttribute("StartTime")).collect(Collectors.joining(",")));
                                        po.setRefundPolicyRbd(elemetList.stream().map(r -> r.getAttribute("PolicyRbd")).collect(Collectors.joining(",")));
                                    }
                                });

                        context.getMPAirPriceInfoFarefamilyPos().add(po);

                    });
                });
    }

    private static void processAirAirPriceInfoFareInfos(ModularProductType mp,
                                                        Spnr_MPPo mpPo,
                                                        SPNRContext context) {
        Optional
                .ofNullable(Utils.getFirstOrNull(mp.getAir().getPriceInfo()).getFareInfos())
                .map(AirItineraryPricingInfoType.FareInfos::getFareInfo)
                .ifPresent(fareInfos ->
                        fareInfos.forEach(fareInfo -> {
                            MP_AirPriceInfo_FareInfosPo po = new MP_AirPriceInfo_FareInfosPo();
                            po.setSuperPnrId(context.getSPnrID());
                            po.setSearchId(mpPo.getSearchId());
                            po.setProductNumber(mpPo.getProductNumber());
                            po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());
                            po.setFlightSegmentRph(String.valueOf(fareInfo.getFlightSegmentRPH()));
                            po.setOdRph(String.valueOf(fareInfo.getOriginDestinationRPH()));
                            Optional.ofNullable(fareInfo.getFareReference())
                                    .filter(CollectionUtils::isNotEmpty).ifPresent(fareRef -> {
                                        po.setCabinCode(fareRef.get(0).getCabinCode());
                                        po.setSubclass(fareRef.get(0).getResBookDesigCode());
                                    });
                            Optional.ofNullable(fareInfo.getFilingAirline())
                                    .ifPresent(filingAirline -> po.setFilingAirlineCode(filingAirline.getCode()));

                            Optional.ofNullable(fareInfo.getDepartureAirport()).ifPresent(port -> po.setDport(port.getLocationCode()));
                            Optional.ofNullable(fareInfo.getArrivalAirport()).ifPresent(port -> po.setAport(port.getLocationCode()));

                            if (fareInfo.getTPAExtensions() != null) {
                                Utils
                                        .streamNullable(fareInfo.getTPAExtensions().getAny()).forEach(element -> {
                                            String nodeName = element.getNodeName();
                                            if ("MarketingData".equalsIgnoreCase(nodeName)) {
                                                NodeList lowestFare = element.getElementsByTagName("LowestFare");
                                                if (lowestFare.getLength() > 0) {
                                                    Element item = (Element) lowestFare.item(0);
                                                    po.setLowestFare(item.getAttribute("Amount"));
                                                    po.setLowestFareSubclass(item.getAttribute("Cabin"));
                                                }
                                            }
                                        });
                            }
                            Optional.ofNullable(fareInfo.getFareFamily()).ifPresent(fareFamily -> {
                                po.setFareFamilyCode(fareFamily.getCode());
                                po.setFareFamilyName(fareFamily.getName());
                                Optional.ofNullable(fareFamily.getAddOns())
                                        .map(AddOnsType::getAddOn)
                                        .ifPresent(addOn -> {
                                            po.setAddOnSort(addOn.stream().map(s -> String.valueOf(s.getSort())).collect(Collectors.joining(",")));
                                            po.setAddOnSortName(addOn
                                                    .stream()
                                                    .flatMap(s -> Utils.streamNullable(s.getDescription()))
                                                    .map(s -> s.getName())
                                                    .collect(Collectors.joining(",")));
                                            String charSet = addOn
                                                    .stream()
                                                    .flatMap(s -> Utils.streamNullable(s.getDescription()))
                                                    .flatMap(d -> Utils.streamNullable(d.getText()))
                                                    .map(t -> t.getCharSet())
                                                    .collect(Collectors.joining(","));
                                            po.setAddOnCharSet(charSet);
                                        });
                            });
                            if (CollectionUtils.size(fareInfo.getFareInfo()) > 2) {
                                fareInfo.getFareInfo().forEach(fInfo -> {
                                    MP_AirPriceInfo_FareInfosPo co = po.clone();
                                    processFare(co, fInfo);
                                    context.getMPAirPriceInfoInfoFareInfosPos().add(co);
                                });
                            } else {
                                Optional.ofNullable(fareInfo.getFareInfo())
                                        .filter(CollectionUtils::isNotEmpty)
                                        .map(list -> list.get(0))
                                        .ifPresent(fInfo -> processFare(po, fInfo));
                                context.getMPAirPriceInfoInfoFareInfosPos().add(po);
                            }
                        })
                );
    }


    private static void processFare(MP_AirPriceInfo_FareInfosPo po, FareInfoType.FareInfo fInfo) {
        po.setFareBasis(fInfo.getFareBasis());
        Optional.ofNullable(fInfo.getDisCount()).map(Double::valueOf).ifPresent(po::setDisCount);


        po.setFcPriceInd(String.valueOf(fInfo.isFCPriceInd()));
        po.setFcRph(String.valueOf(fInfo.getFCRPH()));

        FareInfoType.FareInfo.Fare fare = fInfo.getFare();

        po.setOrigPubAmt(Utils.toInt(fare.getOrigPubAmount()) + fare.getCurrencyCode());
        po.setFareBasisCode(fInfo.getFareBasisCode());
        Optional.of(fare).ifPresent(f -> {
            po.setBaseAmt(f.getBaseAmount() + f.getCurrencyCode());

            po.setDifferFare(Utils.tryParseDouble(f.getDifferFare()));
            po.setPriceType(f.getPriceType());
            po.setReissueAmt(Utils.tryParseDouble(f.getReissueAmt()));
            po.setReissueFee(Utils.tryParseDouble(f.getReissueFee()));
            po.setTaxesAmt(Utils.tryParseDouble(f.getTaxAmount()));
            po.setTotalFare(Utils.tryParseDouble(f.getTotalFare()));
            Optional.ofNullable(f.getTaxes()).map(FareInfoType.FareInfo.Fare.Taxes::getTax).ifPresent(taxes ->
                    po.setTaxDeatils(Utils.streamNullable(taxes).map(t ->
                            t.getAmount() + t.getCurrencyCode() + "," +
                                    t.getOriginalAmount() + t.getOriginalCurrencyCode() + ","
                                    + t.getTaxCode()
                    ).collect(Collectors.joining("|")))
            );
        });
        Optional.ofNullable(Utils.getFirstOrNull(fInfo.getPTC())).ifPresent(ptc -> {
            po.setPtcSubType(ptc.getPTCSubType());
            po.setPtcPsgType(ptc.getPassengerTypeCode());
            po.setPtcQuantity(ptc.getQuantity());
        });
        Optional.ofNullable(fInfo.getLoyalty())
                .map(LoyaltyPricingType::getCombinations)
                .map(LoyaltyPricingType.Combinations::getCombination)
                .map(Utils::getFirstOrNull)
                .map(LoyaltyPricingType.Combinations.Combination::getEarn)
                .map(LoyaltyBaseType::getQuantity)
                .ifPresent(qty -> po.setEarnQuantity(String.valueOf(qty)));


    }

    private static void processAirPriceInfoPTCs(ModularProductType mp,
                                                Spnr_MPPo mpPo,
                                                SPNRContext context) {
        Optional
                .ofNullable(mp.getAir().getPriceInfo().get(0))
                .map(AirItineraryPricingInfoType::getPTCFareBreakdowns)
                .map(AirItineraryPricingInfoType.PTCFareBreakdowns::getPTCFareBreakdown)
                .ifPresent(ptcs -> {
                    ptcs.forEach(ptcFareBreakdown -> {
                        MP_AirPriceInfo_PTCsPo po = new MP_AirPriceInfo_PTCsPo();
                        po.setSuperPnrId(context.getSPnrID());
                        po.setSearchId(mpPo.getSearchId());
                        po.setProductNumber(mpPo.getProductNumber());
                        po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());
                        Optional.ofNullable(ptcFareBreakdown.getPassengerTypeQuantity()).ifPresent(ptq -> {
                            po.setPassengerTypeCode(ptq.getCode());
                            po.setPtcSubType(ptq.getPTCSubType());
                            po.setQuantity(String.valueOf(ptq.getQuantity()));
                        });
                        Optional.ofNullable(ptcFareBreakdown.getPassengerFare()).ifPresent(passengerFare -> {

                            Optional.ofNullable(passengerFare.getBaseFare()).ifPresent(baseFare -> {
                                po.setBaseFareAdjusted(String.valueOf(baseFare.getAdjusted()));
                                po.setBaseFareAmt(baseFare.getAmount() + baseFare.getCurrencyCode());
                                po.setBaseFareOriAmt(baseFare.getOriginalAmount() + baseFare.getOriginalCurrencyCode());
                            });
                            Optional.ofNullable(passengerFare.getTaxes())
                                    .map(FareType.Taxes::getTax).map(Utils::streamNullable)
                                    .ifPresent(taxes ->
                                            po.setTaxDeatils(taxes.map(tax ->
                                                    tax.getAmount() + tax.getCurrencyCode() + "," +
                                                            tax.getOriginalAmount() + tax.getOriginalCurrencyCode() + "," +
                                                            tax.getTaxCode()
                                            ).collect(Collectors.joining(Utils.PIPE))));
                            Optional.ofNullable(passengerFare.getPriceAdjustments())
                                    .ifPresent(adj -> po.setPriceAdjustmentsAmt(adj.getAmount() + adj.getCurrencyCode()));
                            Optional.ofNullable(passengerFare.getTotalFare()).ifPresent(totalFare -> {
                                po.setTotalFareAdjusted(String.valueOf(totalFare.getAdjusted()));
                                po.setTotalFareAmt(totalFare.getAmount() + totalFare.getCurrencyCode());
                                po.setTotalFareOriAmt(totalFare.getOriginalAmount() + totalFare.getOriginalCurrencyCode());
                            });

                            Optional
                                    .ofNullable(passengerFare.getTPAExtensions())
                                    .map(TPAExtensionsType::getAny)
                                    .map(Utils::streamNullable)
                                    .ifPresent(stream -> {
                                        stream.forEach(element -> {
                                            String eName = element.getNodeName();
                                            String value = element.getTextContent();
                                            switch (element.getNodeName()) {
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

                        Optional.ofNullable(ptcFareBreakdown.getEndorsements())
                                .map(e -> e.getEndorsement())
                                .map(e -> e.get(0).getCharSet())
                                .ifPresent(po::setCharSet);
                        context.getMPAirPriceInfoPtCsPos().add(po);
                    });
                });
    }

    private static void processAirPriceInfo(ModularProductType mp,
                                            Spnr_MPPo mpPo,
                                            SPNRContext context) {
        MP_AirPriceInfo_ItinTotalFarePo po = new MP_AirPriceInfo_ItinTotalFarePo();
        po.setSuperPnrId(context.getSPnrID());
        po.setSearchId(mpPo.getSearchId());
        po.setProductNumber(mpPo.getProductNumber());
        po.setPnr(mp.getAir().getBookingReferenceID().get(0).getID());
        BookingPriceInfoType priceInfo = Utils.getFirstOrNull(mp.getAir().getPriceInfo());
        if (priceInfo == null) {
            context.setMpAirPriceInfoItinTotalFarePos(po);
            return;
        }


        po.setPricingSource(priceInfo.getPricingSource().value());
        po.setFareFamilyCode(priceInfo.getFareFamilyCode());
        po.setFarefamilyName(priceInfo.getFareFamilyName());
        po.setPriceQuoteDate(priceInfo.getPriceQuoteDate());
        Optional.ofNullable(priceInfo.getItinTotalFare()).ifPresent(itinTotalFare -> {
            Optional.ofNullable(itinTotalFare.getBaseFare()).ifPresent(baseFare -> {
                po.setBaseFareAdjusted(String.valueOf(baseFare.getAdjusted()));
                po.setBaseFareAmt(baseFare.getAmount() + baseFare.getCurrencyCode());
                po.setBaseFareOriAmt(baseFare.getOriginalAmount() + baseFare.getOriginalCurrencyCode());
            });
            Optional
                    .ofNullable(itinTotalFare.getTaxes())
                    .map(taxes -> Utils.streamNullable(taxes.getTax()).map(tax ->
                                    tax.getAmount() + tax.getCurrencyCode() + ","
                                            + tax.getOriginalAmount() + tax.getOriginalCurrencyCode() + ","
                                            + tax.getTaxCode())
                            .collect(Collectors.joining(Utils.PIPE))
                    ).ifPresent(po::setTaxDeatils);
            Optional.ofNullable(itinTotalFare.getTotalFare()).ifPresent(totalFare -> {
                po.setTotalFareAdjusted(String.valueOf(totalFare.getAdjusted()));
                po.setTotalFareAmt(totalFare.getAmount() + totalFare.getCurrencyCode());
                po.setTotalFareOriAmt(totalFare.getOriginalAmount() + totalFare.getOriginalCurrencyCode());
            });
        });
        context.setMpAirPriceInfoItinTotalFarePos(po);
    }

    private static void processAirItinerary(ModularProductType mp,
                                            Spnr_MPPo mpPo,
                                            SPNRContext context) {
        ProductBase.Air air = mp.getAir();
        if (air == null) {
            return;
        }
        AirItineraryType airItinerary = air.getAirItinerary();
        if (airItinerary == null) {
            return;
        }
        // OriginDestinationOption
        Optional
                .of(airItinerary)
                .map(AirItineraryType::getOriginDestinationOptions)
                .map(AirItineraryType.OriginDestinationOptions::getOriginDestinationOption)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(odList -> {
                    odList.forEach(od -> {
                        // MP_AirAirItineraryPo
                        MP_AirAirItineraryPo mp_airAirItineraryPo = parseMPAirAirItinerary(od, mpPo.getSuperPnrId(), mpPo.getSearchId(), mpPo.getProductNumber(), air);
                        context.getMpAirAirItineraryPos().add(mp_airAirItineraryPo);
                        // MP_AirAirItinerary_segmentPo
                        List<MP_AirAirItinerary_segmentPo> mpAirAirItinerarySegmentPos = parseMPAirAirItinerarySegmentPo(od, mpPo.getSuperPnrId(), mpPo.getSearchId(), mpPo.getProductNumber(), air);
                        context.getMpAirAirItinerarySegmentPos().addAll(mpAirAirItinerarySegmentPos);
                        // MP_AirAirItinerary_baggagePo
                        List<MP_AirAirItinerary_baggagePo> mpAirAirItineraryBaggagePos = parseBaggage(od, mpPo.getSuperPnrId(), mpPo.getSearchId(), mpPo.getProductNumber(), air);
                        context.getMpAirAirItineraryBaggagePos().addAll(mpAirAirItineraryBaggagePos);
                    });
                });
    }

    private static List<MP_AirAirItinerary_baggagePo> parseBaggage(AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
                                                                   String spnrID,
                                                                   String searchId,
                                                                   String productNumber,
                                                                   ProductBase.Air air) {
        List<MP_AirAirItinerary_baggagePo> results = new LinkedList<>();
        if (CollectionUtils.isEmpty(od.getBaggage())) {
            return Collections.emptyList();
        }
        od.getBaggage().forEach(baggage -> {
            MP_AirAirItinerary_baggagePo po = new MP_AirAirItinerary_baggagePo();
            po.setSuperPnrId(spnrID);
            po.setProductNumber(productNumber);
            po.setPnr(air.getBookingReferenceID().get(0).getID());
            po.setSearchId(searchId);
            po.setOdRph(od.getRPH());
            po.setBaggageRph(baggage.getBaggageRPH());
            po.setFlighSegmentRph(String.valueOf(baggage.getFlightSegmentRPH()));
            po.setPieces(Utils.toInt(baggage.getPieces()));
            po.setTravelerRph(String.valueOf(baggage.getTravelerRPH()));
            po.setPricingRph(String.valueOf(baggage.getPricingRPH()));
            Optional.ofNullable(baggage.getWeight()).ifPresent(weight -> {
                Optional.ofNullable(weight.getValue()).ifPresent(w -> po.setWeight(w.toString()));
                po.setWeightCount(Utils.toInt(weight.getWeight()));
                po.setWeightUnit(Utils.getValue(weight.getUnit(), WeightUnitType::value));
            });
            Optional.ofNullable(baggage.getSize()).ifPresent(size -> {
                po.setSizeCode(size.getCode());
                po.setSizeDescription(size.getDescription());
                po.setSizeHeight(xmlBigDecimalToStr(size.getHeight()));
                po.setSizeLength(xmlBigDecimalToStr(size.getLength()));
                po.setWidth(xmlBigDecimalToStr(size.getWidth()));
            });
            Optional.ofNullable(baggage.getSpecialItem()).ifPresent(specialItem -> {
                po.setSpecialItemCode(specialItem.getCode());
                po.setSpecialItemContext(specialItem.getCodeContext());
                po.setSpecialItemUri(specialItem.getURI());
            });
            Optional.ofNullable(baggage.getTPAExtensions())
                    .map(TPAExtensionsType::getAny)
                    .ifPresent(elementList -> {
                        Utils.streamNullable(elementList).filter(e -> "isFPC".equalsIgnoreCase(e.getNodeName())).findAny()
                                .ifPresent(e ->
                                        po.setIsFpc(e.getNodeValue()));
                        Utils.streamNullable(elementList).filter(e -> "PassageType".equalsIgnoreCase(e.getNodeName())).findAny()
                                .ifPresent(e ->
                                        po.setPassageTypeCode(e.getAttribute("Code")));
                    });
            results.add(po);
        });
        return results;
    }

    private static List<MP_AirAirItinerary_segmentPo> parseMPAirAirItinerarySegmentPo(AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
                                                                                      String spnrID,
                                                                                      String searchId,
                                                                                      String productNumber,
                                                                                      ProductBase.Air air) {
        List<MP_AirAirItinerary_segmentPo> result = new LinkedList<>();
        if (CollectionUtils.isEmpty(od.getFlightSegment())) {
            return Collections.emptyList();
        }
        od.getFlightSegment().forEach(seg -> {
            MP_AirAirItinerary_segmentPo po = new MP_AirAirItinerary_segmentPo();
            po.setSuperPnrId(spnrID);
            po.setSearchId(searchId);
            po.setProductNumber(productNumber);
            po.setPnr(air.getBookingReferenceID().get(0).getID());
            po.setOdRph(od.getRPH());
            po.setFlightSegmentRph(seg.getRPH());
            po.setInfoSource(seg.getInfoSource());
            po.setModType(seg.getModType());
            po.setOriginalRph(seg.getOriginalRPH());
            Optional.of(seg).map(s -> s.getDepartureAirport()).map(a -> a.getLocationCode()).ifPresent(po::setDport);
            Optional.of(seg).map(s -> s.getDepartureAirport()).map(a -> a.getCodeContext()).ifPresent(po::setDportContext);
            Optional.of(seg).map(s -> s.getDepartureAirport()).map(a -> a.getTerminal()).ifPresent(po::setDportTerminal);
            Optional.of(seg).map(s -> s.getDepartureAirport()).map(a -> a.getTSCityCode()).ifPresent(po::setDcity);
            Optional.of(seg).map(s -> s.getDepartureAirport()).map(a -> a.getCountryCode()).ifPresent(po::setDcountry);
            Optional.of(seg).map(s -> s.getArrivalAirport()).map(a -> a.getLocationCode()).ifPresent(po::setAport);
            Optional.of(seg).map(s -> s.getArrivalAirport()).map(a -> a.getCodeContext()).ifPresent(po::setAportContext);
            Optional.of(seg).map(s -> s.getArrivalAirport()).map(a -> a.getTerminal()).ifPresent(po::setAportTerminal);
            Optional.of(seg).map(s -> s.getArrivalAirport()).map(a -> a.getTSCityCode()).ifPresent(po::setAcity);
            Optional.of(seg).map(s -> s.getArrivalAirport()).map(a -> a.getCountryCode()).ifPresent(po::setAcountry);
            po.setDepartureTime(xmlDate2String(seg.getDepartureDateTime()));
            po.setOriDepartureTime(seg.getOriginalDepartureDateTime());
            po.setArrivalTime(xmlDate2String(seg.getArrivalDateTime()));
            Optional.ofNullable(seg.getMarketingAirline()).ifPresent(a -> {
                po.setMarketingFlightNo(a.getCode() + seg.getFlightNumber());
                po.setSingleVendorInd(a.getSingleVendorInd());
            });

            Optional.ofNullable(seg.getOperatingAirline()).ifPresent(a -> po.setOperatingFlightNo(a.getCode() + seg.getFlightNumber()));
            po.setCabinCode(seg.getCabinCode());
            po.setSubclass(seg.getResBookDesigCode());
            po.setStatus(seg.getStatus());
            po.setDuration(seg.getDuration());
            po.setInfantAvailQuantity(seg.getInfantAvailQuantity());
            po.setMealCode(seg.getMealCode());
            po.setSegmentType(seg.getSegmentType());
            po.setInvControl(seg.getInvControl());
            po.setMileage(seg.getMileage());
            po.setStopQuantity(seg.getStopQuantity().toString());
            po.setPreCheckin(xmlBooltToStr(seg.isPreCheckin()));
            po.setOnlineCheckin(seg.getOnlineCheckin());
            Utils.getFirstOptional(seg.getEquipment()).ifPresent(e -> po.setAirEquipType(e.getAirEquipType()));
            po.setStopOver(seg.getStopOver());
            Utils.getFirstOptional(seg.getStopLocation()).ifPresent(stopLocation -> {
                po.setStoppoint(stopLocation.getLocationCode());
                po.setStopTime(stopLocation.getStopTime().toString());
                po.setStopContext(stopLocation.getCodeContext());
            });
            Optional
                    .ofNullable(seg.getBookingClassAvails())
                    .map(a -> a.getBookingClassAvail())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(rbdList -> {
                        List<String> rph = new LinkedList<>();
                        List<String> rbd = new LinkedList<>();
                        List<String> quantity = new LinkedList<>();
                        List<String> desigQuantity = new LinkedList<>();
                        rbdList.forEach(rbdNode -> {
                            rph.add(rbdNode.getRPH());
                            rbd.add(rbdNode.getResBookDesigCode());
                            quantity.add(rbdNode.getResBookDesigQuantity());
                            desigQuantity.add(rbdNode.getResBookDesigQuantity());
                        });

                        po.setAvRph(String.join(",", rph));
                        po.setAvSubclass(String.join(",", rbd));
                        po.setAvSubclassQuantity(String.join(",", quantity));
                        po.setAvSubclassStatus(String.join(",", desigQuantity));
                    });
            result.add(po);
        });
        return result;
    }

    private static Spnr_MPPo parseModularProduct(ModularProductType mp, SPNRContext context) {
        // Spnr_mp
        Spnr_MPPo mpPo = new Spnr_MPPo();
        mpPo.setSuperPnrId(context.getSpnrPo().getSuperPnrId());
        mpPo.setSearchId(mp.getSearchID());
        mpPo.setProductNumber(String.valueOf(mp.getProductNumber()));
        mpPo.setBookedWith(Utils.list2String(mp.getBookedWith()));
        mpPo.setBookingChannel(mp.getBookingChannel());
        mpPo.setBookingDate(xmlDate2String(mp.getBookingDate()));
        mpPo.setBookingStatus(mp.getBookingStatus());
        mpPo.setCancellationDate(xmlDate2String(mp.getCancellationDate()));
        mpPo.setEndDate(xmlDate2String(mp.getEndDate()));
        mpPo.setHistoric(String.valueOf(mp.isHistoric()));
        mpPo.setHistoricId(String.valueOf(mp.getHistoryID()));
        mpPo.setLastModified(xmlDate2String(mp.getLastModified()));
        mpPo.setMasterProductNumber(mp.getMasterProductNumber().toString());
        mpPo.setPrimaryLangId(mp.getPrimaryLangID());
        mpPo.setProductId(mp.getProductID().toString());
        mpPo.setProductType(mp.getProductType());
        mpPo.setProductTypeCode(mp.getProductTypeCode());
        mpPo.setStartDate(xmlDate2String(mp.getStartDate()));
        mpPo.setSynchronised(String.valueOf(mp.isSynchronised()));
        mpPo.setTsbookingStatus(mp.getTSBookingStatus().value());
        mpPo.setLiveId(String.valueOf(mp.getLiveID()));
        mpPo.setRefundable(String.valueOf(mp.isRefundable()));
        mpPo.setReplacedBy(Utils.list2String(mp.getReplacedBy()));
        Optional.ofNullable(mp.getSource()).ifPresent(source -> {
            mpPo.setAgentDutyCode(source.getAgentDutyCode());
            mpPo.setChannel(source.getChannel());
            Optional.ofNullable(source.getConfig()).ifPresent(sourceConfigType -> {
                mpPo.setOfficecode(sourceConfigType.getOfficeCode());
                mpPo.setIataNumber(sourceConfigType.getIATANumber());
            });
            mpPo.setErspUserId(String.valueOf(source.getERSPUserID()));
            mpPo.setTerminalId(source.getTerminalID());
            Optional.ofNullable(source.getRequestorID()).ifPresent(requestorId -> {
                mpPo.setRequestorId(String.valueOf(requestorId.getID()));
                if (requestorId.getCompanyName() != null) {
                    mpPo.setCompanyCode(requestorId.getCompanyName().getCode());
                    mpPo.setCompanyCodeContext(requestorId.getCompanyName().getCodeContext());
                }
            });
        });
        Optional
                .ofNullable(mp.getAir())
                .map(a -> Utils.getFirstOrNull(a.getBookingReferenceID()))
                .map(r -> r.getCompanyName())
                .map(c -> c.getCode())
                .ifPresent(mpPo::setCompanyName);

        Optional
                .ofNullable(mp.getAir())
                .map(a -> a.getSupplierNotes())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(sNotes ->
                        mpPo.setSupplierNotes(sNotes.stream()
                                .flatMap(supplierNotes -> supplierNotes.getNote().stream())
                                .map(AirReservationType.SupplierNotes.Note::getType)
                                .collect(Collectors.joining("@")))
                );
        return mpPo;
    }

    private static MP_AirAirItineraryPo parseMPAirAirItinerary(AirItineraryType.OriginDestinationOptions.OriginDestinationOption od,
                                                               String spnrID,
                                                               String searchId,
                                                               String productNumber,
                                                               ProductBase.Air air) {
        MP_AirAirItineraryPo po = new MP_AirAirItineraryPo();
        po.setSuperPnrId(spnrID);
        po.setSearchId(searchId);
        po.setProductNumber(productNumber);
        po.setPnr(air.getBookingReferenceID().get(0).getID());
        po.setDirectionInd(air.getAirItinerary().getDirectionInd().value());
        po.setDocRequired(air.getAirItinerary().getDocumentationRequired());
        po.setOdRph(od.getRPH());
        po.setOdMajorityCarrier(od.getMajorityCarrier());
        po.setBookingChannel(od.getBookingChannel());
        po.setOdOpenjaw(od.getOpenjaw());
        po.setOdDuration(od.getDuration());
        po.setInfantAvailQuantity(od.getInfantAvailQuantity());
        po.setMarketingFlightNum(od.getMarketingFlightNum());
        return po;
    }


    private static String getTel(AirTravelerType.Telephone telephone) {
        String telString = telephone.getPhoneLocationType() + Utils.PIPE
                + telephone.getPhoneTechType() + Utils.PIPE
                + telephone.getPhoneUseType() + Utils.PIPE
                + telephone.getCountryAccessCode() + Utils.BAR + telephone.getPhoneNumberAttr();
        return telString;
    }

    //=================范帅添加====================
    private static void processMpApSegment(ProductBase.AncillaryProduct ancillaryProduct, Spnr_MPPo mpPo, SPNRContext context) {
        AirReservationType air = ancillaryProduct.getAir();
        if(air == null){
            return;
        }
        String sPnrID = context.getSPnrID();
        String searchId = mpPo.getSearchId();
        String productNumber = mpPo.getProductNumber();
        //取referenceId的逻辑
        String pnr = CollectionUtils.isEmpty(air.getBookingReferenceID()) ? "" : air.getBookingReferenceID().get(0).getID();
        AirItineraryType airItinerary = air.getAirItinerary();
        if(airItinerary == null){
            return;
        }

        AirItineraryType.OriginDestinationOptions options = airItinerary.getOriginDestinationOptions();
        List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> optionList;
        if (options == null || CollectionUtils.isEmpty(optionList = options.getOriginDestinationOption())){
            return;
        }

        for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption option : optionList) {
            List<OriginDestinationOptionType.FlightSegment> segments = option.getFlightSegment();
            if(CollectionUtils.isEmpty(segments)){
                continue;
            }
            String od_rph = option.getRPH();
            //构建POJO
            MP_AP_SegmentPo segmentPo = new MP_AP_SegmentPo();
            for (OriginDestinationOptionType.FlightSegment item : segments) {
                segmentPo.setSuper_pnr_id(sPnrID);
                segmentPo.setSearch_id(searchId);
                segmentPo.setProduct_number(productNumber);
                segmentPo.setPnr(pnr);
                segmentPo.setOd_rph(od_rph);
                segmentPo.setFlight_segment_rph(item.getRPH());

                segmentPo.setInfo_source(item.getInfoSource());
                segmentPo.setMod_type(item.getModType());
                segmentPo.setFlight_number(item.getFlightNumber());
                segmentPo.setOriginal_rph(item.getOriginalRPH());
                Optional.of(item.getDepartureAirport()).ifPresent(t -> segmentPo.setDport(t.getLocationCode()));
                Optional.of(item.getArrivalAirport()).ifPresent(t -> segmentPo.setAport(t.getLocationCode()));
                segmentPo.setDeparture_time(xmlDate2String(item.getDepartureDateTime()));
                segmentPo.setOri_departure_time(item.getOriginalDepartureDateTime());
                segmentPo.setArrival_time(xmlDate2String(item.getArrivalDateTime()));
                Optional.of(item.getMarketingAirline())
                        .ifPresent(t -> {
                            segmentPo.setMarketing_flight_no(Strings.nullToEmpty(t.getCode()) + Strings.nullToEmpty(item.getFlightNumber()));
                            segmentPo.setSingleVendorInd(t.getSingleVendorInd());
                        });
                Optional.of(item.getOperatingAirline())
                        .ifPresent(t -> {
                            segmentPo.setOperating_flight_no(Strings.nullToEmpty(t.getCode()) + Strings.nullToEmpty(item.getFlightNumber()));
                        });

                segmentPo.setCabin_code(item.getCabinCode());
                segmentPo.setSubclass(item.getResBookDesigCode());
                segmentPo.setStatus(item.getStatus());
                segmentPo.setDuration(item.getDuration());
                segmentPo.setInfant_avail_quantity(item.getInfantAvailQuantity());
                segmentPo.setMeal_code(item.getMealCode());
                segmentPo.setSegment_type(item.getSegmentType());

                segmentPo.setInv_control(item.getInvControl());
                segmentPo.setMileage(item.getMileage());
                segmentPo.setStop_quantity(xmlBigIntegerToStr(item.getStopQuantity()));
                segmentPo.setPre_checkin(xmlBooltToStr(item.isPreCheckin()));
                segmentPo.setOnline_checkin(item.getOnlineCheckin());

                Utils.getFirstOptional(item.getEquipment()).ifPresent(e -> segmentPo.setAir_equip_type(e.getAirEquipType()));
                segmentPo.setStop_over(item.getStopOver());
                Utils.getFirstOptional(item.getStopLocation()).ifPresent(t -> {
                    segmentPo.setStoppoint(t.getLocationCode());
                    segmentPo.setStop_context(t.getCodeContext());
                    segmentPo.setStop_time(xmlBigIntegerToStr(t.getStopTime()));
                });
                Optional.of(item.getBookingClassAvails())
                        .ifPresent(avails -> {
                            List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> bookingClassAvailList = avails.getBookingClassAvail();
                            if(CollectionUtils.isNotEmpty(bookingClassAvailList)){
                                segmentPo.setAv_rph(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getRPH())));
                                segmentPo.setAv_subclass(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigCode())));
                                segmentPo.setAv_subclass_quantity(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigQuantity())));
                                segmentPo.setAv_subclass_status(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigStatusCode())));
                            }
                        });
                context.getMpApSegmentList().add(segmentPo);
            }
        }
    }

    private static void processMpApTraveler(ProductBase.AncillaryProduct ancillaryProduct, Spnr_MPPo mpPo, SPNRContext context) {
        if(ancillaryProduct.getTravelerInfo() == null){
            return;
        }
        List<TravelerInfoType.AirTraveler> airTraveler = ancillaryProduct.getTravelerInfo().getAirTraveler();
        if(CollectionUtils.isEmpty(airTraveler)){
            return;
        }
        for (TravelerInfoType.AirTraveler traveler : airTraveler) {
            MP_AP_TravelerPo po = new MP_AP_TravelerPo();
            //===三个元数据====
            po.setSuper_pnr_id(context.getSPnrID());
            po.setSearch_id(mpPo.getSearchId());
            po.setProduct_number(mpPo.getProductNumber());
            //=====业务数据====
            po.setOj_super_pnr_rph(traveler.getOJSuperPNRRPH());
            Optional.of(traveler.getTravelerRefNumber()).ifPresent(t -> po.setTraveler_ref_number_rph(t.getRPH()));
            po.setPassenger_type_code(traveler.getPassengerTypeCode());
            po.setAge(traveler.getAge());
            po.setGender(traveler.getGender());
            po.setBirth_date(xmlDate2String(traveler.getBirthDate()));
            po.setPtcsub_type(traveler.getPTCSubType());
            po.setVerify_adt_accompanier_age(xmlBooltToStr(traveler.isVerifyADTAccompanierAge()));
            po.setGroupInd(xmlBooltToStr(traveler.isGroupInd()));
            Optional.ofNullable(traveler.getPersonName())
                    .ifPresent(pName -> {
                        po.setTraveler_name(Utils.getName(pName));
                        po.setName_prefix(Utils.list2String(pName.getNamePrefix()));
                    });

            Optional.of(traveler.getTelephone()).ifPresent(list ->{
                Iterable<String> transform = Iterables.transform(list, t -> fanshuaiGetTelV2(t));
                String tel = JOINER_COMMA_SkipNull.join(transform);
                po.setTelephone(tel);
            });

            Optional.of(traveler.getDocument()).map(Utils::getFirstOrNull)
                    .ifPresent(t -> {
                        po.setDoc_id(t.getDocID());
                        po.setDoc_type(t.getDocType());
                        po.setDoc_nationality(t.getDocHolderNationality());
                        po.setDoc_expire_date(xmlDate2String(t.getExpireDate()));
                        po.setBirth_country(t.getBirthCountry());
                        po.setDoc_issue_country(t.getDocIssueCountry());
                        Optional.of(t.getAdditionalDocument()).ifPresent(d ->{
                            Iterable<String> transform = Iterables.transform(d, item ->
                                    Strings.nullToEmpty(item.getDocID()) + COMMA + Strings.nullToEmpty(item.getDocType()));
                            po.setAdditional_doc(JOINER_PIPE_Null2Empty.join(transform));
                        });
                    });

            Utils.getFirstOptional(airTraveler).ifPresent(t -> {
                AirTravelerType.APISInformation apisInformation = t.getAPISInformation();
                if(apisInformation != null){
                    po.setDoc_required(apisInformation.getDocumentationRequired());
                }
            });

            Optional.of(traveler.getCustLoyalty()).map(Utils::getFirstOrNull).ifPresent(t ->{
                po.setMembership_id(t.getMembershipID());
                po.setStatus(t.getStatus());
                po.setCustomer_value(t.getCustomerValue());
                po.setLoyal_level(t.getLoyalLevel());
                po.setSingle_vendor_ind(t.getSingleVendorInd());
            });
            context.getMpApTravelerList().add(po);
        }

    }

    private static void processMpBaggageTraveler(ModularProductType mp, Spnr_MPPo mpPo, SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if(baggage == null){
            return;
        }
        TravelerInfoType travelerInfo = baggage.getTravelerInfo();
        if(travelerInfo == null){
            return;
        }
        List<TravelerInfoType.AirTraveler> airTravelerList = travelerInfo.getAirTraveler();
        if(CollectionUtils.isEmpty(airTravelerList)){
            return;
        }
        for (TravelerInfoType.AirTraveler traveler : airTravelerList) {
            //构建PO
            MP_Baggage_TravelerPo po = new MP_Baggage_TravelerPo();
            //元数据
            po.setSuper_pnr_id(context.getSPnrID());
            po.setSearch_id(mpPo.getSearchId());
            po.setProduct_number(mpPo.getProductNumber());
            //业务数据
            po.setOj_super_pnr_rph(traveler.getOJSuperPNRRPH());
            Optional.of(traveler.getTravelerRefNumber()).ifPresent(t -> po.setTraveler_ref_number_rph(t.getRPH()));
            po.setPassenger_type_code(traveler.getPassengerTypeCode());
            po.setAge(traveler.getAge());
            po.setGender(traveler.getGender());
            po.setBirth_date(xmlDate2String(traveler.getBirthDate()));
            po.setPtcsub_type(traveler.getPTCSubType());
            po.setVerify_adt_accompanier_age(xmlBooltToStr(traveler.isVerifyADTAccompanierAge()));
            po.setGroupInd(xmlBooltToStr(traveler.isGroupInd()));
            Optional.ofNullable(traveler.getPersonName())
                    .ifPresent(pName -> {
                        po.setTraveler_name(Utils.getName(pName));
                        po.setName_prefix(Utils.list2String(pName.getNamePrefix()));
                    });

            Optional.of(traveler.getTelephone()).ifPresent(list ->{
                Iterable<String> transform = Iterables.transform(list, t -> fanshuaiGetTelV2(t));
                String tel = JOINER_COMMA_SkipNull.join(transform);
                po.setTelephone(tel);
            });
            Optional.of(traveler.getDocument()).map(Utils::getFirstOrNull)
                    .ifPresent(t -> {
                        po.setDoc_id(t.getDocID());
                        po.setDoc_type(t.getDocType());
                        po.setDoc_nationality(t.getDocHolderNationality());
                        po.setDoc_expire_date(xmlDate2String(t.getExpireDate()));
                        po.setBirth_country(t.getBirthCountry());
                        po.setDoc_issue_country(t.getDocIssueCountry());
                        Optional.of(t.getAdditionalDocument()).ifPresent(d ->{
                            Iterable<String> transform = Iterables.transform(d, item ->
                                    Strings.nullToEmpty(item.getDocID()) + COMMA + Strings.nullToEmpty(item.getDocType()));
                            po.setAdditional_doc(JOINER_PIPE_Null2Empty.join(transform));
                        });
                    });

            Utils.getFirstOptional(airTravelerList).ifPresent(t -> {
                AirTravelerType.APISInformation apisInformation = t.getAPISInformation();
                if(apisInformation != null){
                    po.setDoc_required(apisInformation.getDocumentationRequired());
                }
            });

            Optional.of(traveler.getCustLoyalty()).map(Utils::getFirstOrNull).ifPresent(t ->{
                po.setMembership_id(t.getMembershipID());
                po.setStatus(t.getStatus());
                po.setCustomer_value(t.getCustomerValue());
                po.setLoyal_level(t.getLoyalLevel());
                po.setSingle_vendor_ind(t.getSingleVendorInd());
            });
            context.getMpBaggageTravelerList().add(po);
        }
    }

    private static void processMpBaggageSegment(ModularProductType mp, Spnr_MPPo mpPo, SPNRContext context) {
        ProductBase.ProductBaseBaggage baggage = mp.getBaggage();
        if(baggage == null){
            return;
        }
        AirReservationType air = baggage.getAir();
        if(air == null){
            return;
        }
        AirItineraryType airItinerary = air.getAirItinerary();
        AirItineraryType.OriginDestinationOptions options = airItinerary.getOriginDestinationOptions();
        List<AirItineraryType.OriginDestinationOptions.OriginDestinationOption> originDestinationOption;
        if(options == null || CollectionUtils.isEmpty(originDestinationOption = options.getOriginDestinationOption())){
            return;
        }
        for (AirItineraryType.OriginDestinationOptions.OriginDestinationOption option : originDestinationOption) {

            List<OriginDestinationOptionType.FlightSegment> flightSegment = option.getFlightSegment();
            if(CollectionUtils.isEmpty(flightSegment)){
                continue;
            }
            for (OriginDestinationOptionType.FlightSegment segment : flightSegment) {
                //构建PO
                MP_Baggage_SegmentPo po = new MP_Baggage_SegmentPo();
                po.setSuper_pnr_id(context.getSPnrID());
                po.setSearch_id(mpPo.getSearchId());
                po.setProduct_number(mpPo.getProductNumber());
                //取referenceId
                String pnr = CollectionUtils.isEmpty(air.getBookingReferenceID()) ? "" : air.getBookingReferenceID().get(0).getID();
                po.setPnr(pnr);
                po.setOd_rph(option.getRPH());
                po.setFlight_segment_rph(segment.getRPH());
                po.setInfo_source(segment.getInfoSource());
                po.setMod_type(segment.getModType());
                po.setFlight_number(segment.getFlightNumber());
                po.setOriginal_rph(segment.getOriginalRPH());
                Optional.of(segment.getDepartureAirport()).ifPresent(t -> po.setDport(t.getLocationCode()));
                Optional.of(segment.getArrivalAirport()).ifPresent(t -> po.setAport(t.getLocationCode()));
                po.setDeparture_time(xmlDate2String(segment.getDepartureDateTime()));
                po.setOri_departure_time(segment.getOriginalDepartureDateTime());
                po.setArrival_time(xmlDate2String(segment.getArrivalDateTime()));
                Optional.of(segment.getMarketingAirline()).ifPresent(t -> {
                    po.setMarketing_flight_no(Strings.nullToEmpty(t.getCode()) + Strings.nullToEmpty(segment.getFlightNumber()));
                    po.setSingleVendorInd(t.getSingleVendorInd());
                });
                Optional.of(segment.getOperatingAirline()).ifPresent(t -> {
                    po.setOperating_flight_no(Strings.nullToEmpty(t.getCode()) + Strings.nullToEmpty(segment.getFlightNumber()));
                });
                po.setCabin_code(segment.getCabinCode());
                po.setSubclass(segment.getResBookDesigCode());
                po.setStatus(segment.getStatus());
                po.setDuration(segment.getDuration());
                po.setInfant_avail_quantity(segment.getInfantAvailQuantity());
                po.setMeal_code(segment.getMealCode());
                po.setSegment_type(segment.getSegmentType());
                po.setInv_control(segment.getInvControl());
                po.setMileage(segment.getMileage());
                po.setStop_quantity(xmlBigIntegerToStr(segment.getStopQuantity()));
                po.setPre_checkin(xmlBooltToStr(segment.isPreCheckin()));
                po.setOnline_checkin(segment.getOnlineCheckin());
                Utils.getFirstOptional(segment.getEquipment()).ifPresent(t -> po.setAir_equip_type(t.getAirEquipType()));
                po.setStop_over(segment.getStopOver());
                Utils.getFirstOptional(segment.getStopLocation()).ifPresent(t ->{
                    po.setStoppoint(t.getLocationCode());
                    po.setStop_context(t.getCodeContext());
                    po.setStop_time(xmlBigIntegerToStr(t.getStopTime()));
                });
                Optional.of(segment.getBookingClassAvails())
                        .ifPresent(avails -> {
                            List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> bookingClassAvailList = avails.getBookingClassAvail();
                            if(CollectionUtils.isNotEmpty(bookingClassAvailList)){
                                po.setAv_rph(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getRPH())));
                                po.setAv_subclass(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigCode())));
                                po.setAv_subclass_quantity(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigQuantity())));
                                po.setAv_subclass_status(JOINER_COMMA_SkipNull.join(Iterables.transform(bookingClassAvailList, t -> t.getResBookDesigStatusCode())));
                            }
                        });

                context.getMpBaggageSegmentList().add(po);
            }
        }
    }

    private static final String COMMA = ",";
    private static final String PIPE = "|";
    private static final String BAR = "-";
    private static final String EMPTY_STR = "";

    private static final Joiner JOINER_COMMA_SkipNull = Joiner.on(COMMA).skipNulls();

    private static final Joiner JOINER_PIPE_Null2Empty = Joiner.on(PIPE).useForNull(EMPTY_STR);

    private static String fanshuaiGetTelV2(AirTravelerType.Telephone telephone) {
        ArrayList<? extends Serializable> list = Lists.newArrayList(
                telephone.getRPH(),
                telephone.getIndex(),
                telephone.getPhoneLocationType(),
                telephone.getPhoneTechType(),
                telephone.getPhoneUseType(),
                telephone.getCountryAccessCode()
        );
        String part1 = JOINER_PIPE_Null2Empty.join(list);
        String part2 = Strings.nullToEmpty(telephone.getPhoneNumberAttr());
        return part1 + BAR + part2;
    }

    //===================================范帅添加======================================

    private static String getTelV2(AirTravelerType.Telephone telephone) {
        String telString = telephone.getRPH() + Utils.PIPE + telephone.getIndex() + Utils.PIPE +
                telephone.getPhoneLocationType() + Utils.PIPE + telephone.getPhoneTechType() + Utils.PIPE
                + telephone.getPhoneUseType() + Utils.PIPE + telephone.getCountryAccessCode() + Utils.BAR +
                telephone.getPhoneNumberAttr();
        return telString;
    }

    private static String getPNR(ModularProductType mp) {
        return Optional
                .ofNullable(mp.getAir())
                .map(a -> Utils.getPNR(a.getBookingReferenceID()))
                .filter(StringUtils::isNotEmpty)
                .orElseGet(() ->
                        Optional
                                .ofNullable(mp.getBaggage())
                                .map(b -> b.getAir())
                                .map(a -> Utils.getPNR(a.getBookingReferenceID()))
                                .orElse(""));
    }

    private static void processMpApTicketing(ProductBase.AncillaryProduct ancillaryProduct,
                                             Spnr_MPPo mpPo,
                                             SPNRContext context, MP_AncillaryProductPo ancillaryProductPo) {
        Utils.streamNullable(ancillaryProduct.getTicketing()).forEach(ticketing -> {
            MP_AP_TicketingPo po = new MP_AP_TicketingPo();
            po.setSuperPnrId(context.getSPnrID());
            po.setSearchId(mpPo.getSearchId());
            po.setProductNumber(mpPo.getProductNumber());
            po.seteTicketNumber(ticketing.getETicketNumber());
            po.setFlightSegmentRefNumber(ancillaryProduct.getFlightSegmentRPH());
            po.setTravelerRefNumber(ancillaryProductPo.getTravelerRefNumberRph());

            po.setTicketAdvisory(Utils.streamNullable(ticketing.getTicketAdvisory())
                    .map(FreeTextType::getValue).collect(Collectors.joining("&")));
            Optional.ofNullable(Utils.getFirstOrNull(ticketing.getCheckInInfo())).ifPresent(checkInInfo -> {
                po.setBoardingTime(checkInInfo.getBoardingTime());
            });
            po.setTicketingStatus(ticketing.getTicketingStatus());
            po.setTicketTime(xmlDate2String(ticketing.getTicketTime()));
            context.getMpApTicketingPoList().add(po);
        });
    }

    private static void convertAirAncillaryLoungeRoomType(AirAncillaryLoungeRoomType room,  MP_AP_LoungePo po) {
        po.setAreaSubType(room.getAreaSubType());
        po.setAreaType(room.getAreaType());
        po.setCapacity(room.getCapacity());
        po.setRoomCode(room.getCode());
        Optional.ofNullable(room.getOpenTimes()).map(AirAncillaryLoungeRoomType.OpenTimes::getOpenTime).ifPresent(o -> {
            po.setDescriptiveText(o.getDescriptiveText());
            po.setRoomOpentimeLanguage(o.getLanguage());
        });
        Optional.ofNullable(room.getGates()).ifPresent(g -> po.setGate(Utils.list2String(g.getGate())));
        Optional.ofNullable(room.getContent()).ifPresent(content -> {
            po.setRoomLanguage(content.getLanguage());
            po.setDisplayName(content.getDisplayName());
            po.setAirportName(content.getAirportName());
            po.setShortContent(content.getShortContent());
            po.setLocationDescription(content.getLocationDescription());
            po.setOfficialName(content.getOfficialName());
            po.setImageUrl(Utils.streamNullable(content.getImage()).map(AncillaryImage::getImageURL)
                    .collect(Collectors.joining(",")));
        });

    }


    private static void processMpApLounge(ProductBase.AncillaryProduct ancillaryProduct,
                                             Spnr_MPPo mpPo,
                                             SPNRContext context) {
        Optional.ofNullable(ancillaryProduct.getLounge()).ifPresent(lounge -> {
            Optional.ofNullable(lounge.getRooms())
                    .map(AirAncillaryLoungeProductType.Rooms::getRoom)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(roomList -> {
                        roomList.forEach(room -> {
                            MP_AP_LoungePo po = new MP_AP_LoungePo();
                            po.setSuperPnrId(context.getSPnrID());
                            po.setSearchId(mpPo.getSearchId());
                            po.setFlightSegmetRph(ancillaryProduct.getFlightSegmentRPH());
                            po.setProductNumber(mpPo.getProductNumber());
                            Optional.ofNullable(lounge.getCheckInTime()).ifPresent(checkInTime -> {
                                po.setCheckinOffsetDropTime(checkInTime.getOffsetDropTime());
                                po.setCheckinOffsetTimeUnit(checkInTime.getOffsetTimeUnit());
                                po.setCheckinOffsetUnitMultiplier(checkInTime.getOffsetUnitMultiplier());
                            });
                            convertAirAncillaryLoungeRoomType(room, po);
                            context.getMpApLoungePoList().add(po);
                        });
                    });
        });
    }

    private static void processGroundTransport(ProductBase.AncillaryProduct ancillaryProduct,
                                          Spnr_MPPo mpPo,
                                          SPNRContext context, MP_AncillaryProductPo ancillaryProductPo) {
        Optional.ofNullable(ancillaryProduct.getGroundTransportService()).ifPresent(group -> {
            group.getJourneySegment().forEach(journeySegmentType -> {
                MP_AP_GroundTransportPo po = new MP_AP_GroundTransportPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setSearchId(mpPo.getSearchId());
                po.setProductNumber(mpPo.getProductNumber());
                po.setFlightSegmentRph(ancillaryProduct.getFlightSegmentRPH());
                po.setTravelerRefNumberRph(ancillaryProductPo.getTravelerRefNumberRph());
                po.setRph(journeySegmentType.getRPH());
                Optional.ofNullable(journeySegmentType.getTrainSegment())
                        .ifPresent(trainSegment -> {
                            parseTrainSegment(trainSegment, po);
                        });
                parseFareOption(journeySegmentType.getFareOption(), po);
                context.getMpApGroundTransportPoList().add(po);
            });
        });

    }

    private static void parseFareOption(List<JourneySegmentType.FareOption> fareOptionList, MP_AP_GroundTransportPo po) {
        Optional.ofNullable(Utils.getFirstOrNull(fareOptionList)).ifPresent(fareOption -> {
            po.setBasicFareAmount(fareOption.getPriceDetail().stream()
                    .map(JourneySegmentType.FareOption.PriceDetail::getPriceBreakdown)
                    .filter(Objects::nonNull)
                    .map(RailPriceBreakdownType::getBasicFare)
                    .filter(Objects::nonNull)
                    .map(basicFare -> basicFare.getAmount() + basicFare.getCurrencyCode())
                    .collect(Collectors.joining("&")));
            Optional.ofNullable(fareOption.getAccommodation()).ifPresent(accommodationType -> {
                if (Objects.nonNull(accommodationType.getSeat())) {
                    po.setSeatType(accommodationType.getSeat().value());
                }
                Optional.ofNullable(accommodationType.getClazz())
                        .map(AccommodationClass::getValue)
                        .ifPresent(accommodationClassEnum -> {
                            po.setAccommodationClass(accommodationClassEnum.value());
                        });

            });
        });

    }

    private static void parseTrainSegment(JourneySegmentType.TrainSegment trainSegment, MP_AP_GroundTransportPo po) {
        Optional.ofNullable(trainSegment.getDepartureStation())
                .map(StationDetailsType::getDetails)
                .ifPresent(stationType -> {
                    po.setdStationCode(stationType.getLocationCode());
                    po.setdStationName(stationType.getName());
                    po.setdStationType(stationType.getLocationCategory());
                });
        Optional.ofNullable(trainSegment.getArrivalStation())
                .map(StationDetailsType::getDetails)
                .ifPresent(stationType -> {
                    po.setaStationCode(stationType.getLocationCode());
                    po.setaStationName(stationType.getName());
                    po.setaStationType(stationType.getLocationCategory());
                });
        Optional.ofNullable(trainSegment.getTrainInfo())
                .map(TrainInfoType::getValidDate)
                .ifPresent(validDate -> {
                    po.setStartPeriod(validDate.getStartPeriod());
                    po.setEndPeriod(validDate.getEndPeriod());
                });
    }

    */

}
