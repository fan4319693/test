package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AmendmentFeePo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PriceAdjustmentPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PricingPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class PricingParser {
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (spnr.getPricing() == null) {
            return;
        }
//        processPricing(spnr, context);
//        processPriceAdjustment(spnr, context);
//        processAmendmentFees(spnr, context);

        fanshuaiProcessPricing(spnr, context);
        fanshuaiProcessPriceAdjustment(spnr, context);
        fanshuaiProcessAmendmentFees(spnr, context);
    }

    /*
    private static void processPricing(OJSuperPNR spnr, SPNRContext context) {
        ProductPricingType pricing = spnr.getPricing();
        Spnr_PricingPo po = new Spnr_PricingPo();
        po.setSuperPnrId(context.getSPnrID());
        Optional.ofNullable(pricing.getPostPayTotal())
                .ifPresent(payTotal ->
                        po.setPostAmt(DateHelper.bulidAmount(payTotal.getAmount()
                                , payTotal.getCurrencyCode())));
        Optional.ofNullable(pricing.getPrePayTotal())
                .ifPresent(prePay ->
                        po.setPreAmt(DateHelper.bulidAmount(prePay.getAmount()
                                , prePay.getCurrencyCode())));
        Optional.ofNullable(pricing.getPrePayTotal())
                .ifPresent(prePayTotal ->
                        po.setPreOriAmt(DateHelper.bulidAmount(prePayTotal.getOriginalAmount()
                                , prePayTotal.getOriginalCurrencyCode())));
        Optional.ofNullable(pricing.getPriceAdjustments())
                .ifPresent(ajd ->
                        po.setAdjustmentsAmt(DateHelper.bulidAmount(ajd.getAmount()
                                , ajd.getCurrencyCode())));
        Optional.ofNullable(pricing.getAmendmentFees())
                .ifPresent(amend ->
                        po.setAmendmentsAmt(DateHelper.bulidAmount(amend.getAmount()
                                , amend.getCurrencyCode())));
        Optional.ofNullable(pricing.getTotalPrice())
                .ifPresent(total ->
                        po.setTotalAmt(DateHelper.bulidAmount(total.getAmount()
                                , total.getCurrencyCode())));
        Optional.ofNullable(pricing.getLoyalty())
                .map(LoyaltyProductType::getRedemption)
                .map(LoyaltyProductType.Redemption::getRedeem)
                .ifPresent(redeem -> {
                    po.setRedeemQuantity(redeem.getQuantity());
                    po.setAmountRedeemed(DateHelper.bulidAmount(redeem.getAmount(), redeem.getCurrencyCode()));
                });
        Optional.ofNullable(pricing.getTotalPrice())
                .ifPresent(total ->
                        po.setTotalOriAmt(total.getAmount()
                                + total.getCurrencyCode()));
        Optional.ofNullable(pricing.getTotalPrice())
                .ifPresent(total -> {
                    if (total.getOriginalAmount() != null) {
                        po.setTotalOriAmt(total.getOriginalAmount() + total.getOriginalCurrencyCode());
                    }
                });
        context.setSPnrPricingPo(po);
    }
    */
    private static void fanshuaiProcessPricing(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPricing())
                .ifPresent(pricing -> {
                    Spnr_PricingPo po = new Spnr_PricingPo();
                    po.setSuperPnrId(context.getSPnrID());

                    Optional.ofNullable(pricing.getPostPayTotal())
                            .ifPresent(postPayTotal -> {
                                po.setPostAmt(Utils.number2String(postPayTotal.getAmount()));
                                po.setPostCurrencyCode(postPayTotal.getCurrencyCode());
                            });

                    Optional.ofNullable(pricing.getPrePayTotal())
                            .ifPresent(prePayTotal -> {
                                po.setPreAmt(Utils.number2String(prePayTotal.getAmount()));
                                po.setPreCurrencyCode(prePayTotal.getCurrencyCode());
                                po.setPreOriAmt(Utils.number2String(prePayTotal.getOriginalAmount()));
                                po.setPreOriCurrencyCode(prePayTotal.getOriginalCurrencyCode());
                            });

                    Optional.ofNullable(pricing.getPriceAdjustments())
                            .ifPresent(ad -> {
                                po.setAdjustmentsAmt(Utils.number2String(ad.getAmount()));
                                po.setAdjustmentsCurrencyCode(ad.getCurrencyCode());
                            });

                    Optional.ofNullable(pricing.getAmendmentFees())
                            .ifPresent(fees -> {
                                po.setAmendmentsAmt(Utils.number2String(fees.getAmount()));
                                po.setAmendmentsCurrencyCode(fees.getCurrencyCode());
                            });

                    Optional.ofNullable(pricing.getTotalPrice())
                            .ifPresent(price -> {
                                po.setTotalAmt(Utils.number2String(price.getAmount()));
                                po.setTotalCurrencyCode(price.getCurrencyCode());
                                po.setTotalOriAmt(Utils.number2String(price.getOriginalAmount()));
                                po.setTotalOriCurrencyCode(price.getCurrencyCode());
                            });

                    Optional.ofNullable(pricing.getLoyalty())
                            .map(l -> l.getRedemption())
                            .map(r -> r.getRedeem())
                            .ifPresent(t -> {
                                po.setRedeemQuantity(Utils.number2String(t.getQuantity()));
                                po.setAmountRedeemed(Utils.number2String(t.getAmountRedeemed()));
                                po.setAmountRedeemedCurrencyCode(t.getCurrencyCode());
                            });

                    context.setSPnrPricingPo(po);
                });
    }

    private static void fanshuaiProcessPriceAdjustment(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPricing())
                .map(t -> t.getPriceAdjustments())
                .map(t -> t.getPriceAdjustment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(adjs -> {
                    adjs.forEach(adj -> {
                        Spnr_PriceAdjustmentPo po = new Spnr_PriceAdjustmentPo();

                        po.setSuperPnrId(context.getSPnrID());
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
                        context.getSPnrPriceAdjustmentPos().add(po);
                    });
                });

    }

    /*
    private static void processPriceAdjustment(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPricing().getPriceAdjustments())
                .map(SPNRPriceAdjustmentsType::getPriceAdjustment)
                .ifPresent(adjList ->
                        adjList.forEach(adj -> {
                            Spnr_PriceAdjustmentPo po = new Spnr_PriceAdjustmentPo();

                            po.setSuperPnrId(context.getSPnrID());
                            po.setAdjustDate(DateHelper.xmlDate2String(adj.getDate()));
                            po.setCode(adj.getCode());
                            po.setProductType(adj.getProductType());
                            po.setDescription(adj.getDescription());
                            po.setAmt(Utils.toBigDecimal(adj.getAmount()));
                            po.setCurrencyCode(adj.getCurrencyCode());
                            po.setUnitAmt(Utils.toBigDecimal(adj.getUnitAmount()));
                            po.setAuditId(Utils.toWrapperLong(adj.getAuditID()));
                            po.setPassengerTypeCode(adj.getPassengerTypeCode());
                            po.setFlightSegmentRph(Utils.toWrapperLong(adj.getFlightSegmentRPH()));
                            Optional.ofNullable(adj.getAgent()).ifPresent(agent -> {
                                po.setAgent(agent.getAgent());
                                po.setAgentUrl(agent.getURL());
                                po.setAgency(agent.getAgency());
                            });
                            context.getSPnrPriceAdjustmentPos().add(po);
                        }));

    }*/

    private static void fanshuaiProcessAmendmentFees(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPricing())
                .map(t -> t.getAmendmentFees())
                .map(t -> t.getAmendmentFee())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(feeList -> {
                    feeList.forEach(fee -> {
                        Spnr_AmendmentFeePo po = new Spnr_AmendmentFeePo();
                        po.setSuperPnrId(context.getSPnrID());
                        po.setProductNumber(Utils.toWrapperLong(fee.getProductNumber()));
                        po.setAmt(Utils.number2String(fee.getAmount()));
                        po.setCurrencyCode(fee.getCurrencyCode());
                        po.setOpsDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));
                        po.setAuditId(Utils.toWrapperLong(fee.getAuditID()));
                        po.setManual(Utils.boolean2String(fee.isManual()));
                        po.setMasterProductNumber(Utils.toWrapperLong(fee.getMasterProductNumber()));
                        po.setReplacedBy(fee.getReplacedBy());

                        context.getSPnrAmendmentFeePos().add(po);
                    });
                });
    }

    /*
    private static void processAmendmentFees(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getPricing().getAmendmentFees())
                .map(f -> f.getAmendmentFee())
                .ifPresent(amendmentFees -> amendmentFees.forEach(amendmentFee -> {
                    Spnr_AmendmentFeePo po = new Spnr_AmendmentFeePo();
                    po.setSuperPnrId(context.getSPnrID());
                    po.setProductNumber(String.valueOf(amendmentFee.getProductNumber()));
                    po.setAmt(Double.valueOf(amendmentFee.getAmount()));
                    po.setCurrencyCode(amendmentFee.getCurrencyCode());
                    po.setOpsDate(xmlDate2String(amendmentFee.getDate()));
                    po.setAuditId(String.valueOf(amendmentFee.getAuditID()));
                    po.setManual(String.valueOf(amendmentFee.isManual()));
                    po.setMasterProductNumber(String.valueOf(amendmentFee.getMasterProductNumber()));
                    po.setReplacedBy(String.valueOf(amendmentFee.getReplacedBy()));
                    context.getSPnrAmendmentFeePos().add(po);
                }));
    }
    */

}
