package com.airchina.datacenter.spnr.sdk.parse;

import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.DateHelper;
import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AmendmentFeePo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PriceAdjustmentPo;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_PricingPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductPricingType;
import com.airchina.datacenter.spnr.sdk.entity.SPNRPriceAdjustmentsType;
import java.util.Optional;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class PricingParser {
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        if (spnr.getPricing() == null) {
            return;
        }
        processPricing(spnr, context);
        processPriceAdjustment(spnr, context);
        processAmendmentFees(spnr, context);
    }

    private static void processPricing(OJSuperPNR spnr, SPNRContext context) {
        ProductPricingType pricing = spnr.getPricing();
        Spnr_PricingPo po = new Spnr_PricingPo();
        po.setSuperPnrId(context.getSPnrID());
        Optional.ofNullable(pricing.getPostPayTotal())
                .ifPresent(payTotal ->
                        po.setPostAmt(payTotal.getAmount()
                                + payTotal.getCurrencyCode()));
        Optional.ofNullable(pricing.getPrePayTotal())
                .ifPresent(prePay ->
                        po.setPreAmt(prePay.getAmount()
                                + prePay.getCurrencyCode()));
        Optional.ofNullable(pricing.getPrePayTotal())
                .ifPresent(prePayTotal ->
                        po.setPreOriAmt(prePayTotal.getAmount()
                                + prePayTotal.getCurrencyCode()));
        Optional.ofNullable(pricing.getPriceAdjustments())
                .ifPresent(ajd ->
                        po.setAdjustmentsAmt(ajd.getAmount()
                                + ajd.getCurrencyCode()));
        Optional.ofNullable(pricing.getAmendmentFees())
                .ifPresent(amend ->
                        po.setAmendmentsAmt(amend.getAmount()
                                + amend.getCurrencyCode()));
        Optional.ofNullable(pricing.getTotalPrice())
                .ifPresent(total ->
                        po.setTotalAmt(total.getAmount()
                                + total.getCurrencyCode()));
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
                            po.setAmt(Double.valueOf(adj.getAmount()));
                            po.setCurrencyCode(adj.getCurrencyCode());
                            po.setUnitAmt(Double.valueOf(adj.getUnitAmount()));
                            po.setAuditId(String.valueOf(adj.getAuditID()));
                            po.setPassengerTypeCode(adj.getPassengerTypeCode());
                            po.setFlightSegmentRph(adj.getFlightSegmentRPH());
                            Optional.ofNullable(adj.getAgent()).ifPresent(agent -> {
                                po.setAgent(agent.getAgent());
                                po.setAgentUrl(agent.getURL());
                                po.setAgency(agent.getAgency());
                            });
                            context.getSPnrPriceAdjustmentPos().add(po);
                        }));

    }

    private static void processAmendmentFees(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getPricing().getAmendmentFees())
                .map(f->f.getAmendmentFee())
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
}
