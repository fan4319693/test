package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PricingPo;
import com.airchina.datacenter.spnr.sdk.entity.LoyaltyProductType;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductPricingType;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPricingParser </p>
 * <p>Description: MP_PricingPo 的转换器 </p>
 * <p>Sample:  new MpPricingParser(new FieldsArrayStrategy(MP_PricingPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPricingParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpPricingParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_PricingPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductPricingType pricingType = mp.getPricing();
            if (pricingType == null) {
                continue;
            }
            String pnr = Commons.getMpPnr(mp);

            Optional.ofNullable(mp.getPricing())
                    .ifPresent(pricing -> {
                        MP_PricingPo po = new MP_PricingPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
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
                        result.add(po);
                    });
        }

        return result;
    }
}
