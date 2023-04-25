package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PricingPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPricingParser </p>
 * <p>Description: Spnr_PricingPo 的转换器 </p>
 * <p>Sample:  new SpnrPricingParser(new FieldsArrayStrategy(Spnr_PricingPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPricingParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrPricingParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_PricingPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getPricing())
                .ifPresent(pricing -> {
                    Spnr_PricingPo po = new Spnr_PricingPo();

                    po.setSuperPnrId(spnr.getSuperPNRID());

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

                   result.add(po);
                });

        return result;
    }
}
