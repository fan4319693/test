package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_CouplesPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.alibaba.fastjson.JSONObject;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApGroundTransportBusParser </p>
 * <p>Description: MP_AP_GroundTransport_BusPo 的转换器 </p>
 * <p>Sample:  new MpApGroundTransportBusParser(new FieldsArrayStrategy(MP_AP_GroundTransport_BusPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpCouplesParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpCouplesParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_GroundTransport_BusPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {

            Optional.ofNullable(mp.getCoupons())
                    .ifPresent(coupons -> {
                        for (CouponType coupon: coupons.getCoupon()) {
                            MP_CouplesPo po = new MP_CouplesPo();
                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                            po.setCouponTypeCode(coupons.getProductCode());
                            po.setCouponQuantity(Utils.number2String(coupons.getQuantity()));
                            po.setBookingReferenceId(coupons.getBookingReferenceID().getID());

                            Optional.ofNullable(coupons.getPricing())
                                    .map(CouponsType.Pricing::getPrice)
                                    .ifPresent(t ->
                                    {
                                        po.setOriginalAmt(Utils.number2String(t.getOriginalAmount()));
                                        po.setOriginalCurrencyCode(t.getOriginalCurrencyCode());
                                        po.setTotalAmt(Utils.number2String(t.getAmount()));
                                        po.setTotalCurrencyCode(t.getCurrencyCode());
                                    });

                            Optional.ofNullable(coupons.getPricing())
                                    .map(CouponsType.Pricing::getLoyalty)
                                    .map(t -> t.getRedemption().getRedeem())
                                    .ifPresent(t ->
                                    {
                                        po.setRedeemQuantity(Utils.number2String(t.getQuantity()));
                                        po.setAmountRedeemed(Utils.number2String(t.getAmountRedeemed()));
                                        po.setAmountRedeemedCurrencyCode(t.getCurrencyCode());
                                    });

                            Optional.ofNullable(coupons.getPricing())
                                    .map(CouponsType.Pricing::getDiscount)
                                    .ifPresent(t ->
                                    {
                                        po.setDiscountQuantity(Utils.number2String(t.getQuantity()));
                                        po.setDiscountAmount(Utils.number2String(t.getAmount()));
                                        po.setDiscountCurrencyCode(t.getCurrencyCode());
                                    });

                            po.setActivateDateTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(coupon.getActivateDate()));
                            po.setExpiryDateTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(coupon.getExpiryDate()));
                            po.setCouponCategory(coupon.getCategory());
                            po.setCouponCode(coupon.getCode());
                            po.setCouponName(coupon.getName());
                            po.setCouponNumber(coupon.getNumber());
                            po.setCouponStatus(coupon.getStatus());
                            Optional.ofNullable(coupon.getValue())
                                    .ifPresent(v -> {
                                        po.setCouponAmt(Utils.number2String(v.getAmount()));
                                        po.setCouponCurrencyCode(v.getCurrencyCode());
                                    });

                            JSONObject purchaseRuleObject = new JSONObject();
                            Optional.ofNullable(coupon.getPurchaseRules())
                                    .map(CouponPurchaseRulesType::getPurchaseRule)
                                    .ifPresent(purchaseRule -> purchaseRule.forEach(u -> {
                                        purchaseRuleObject.put(u.getCode(), u.getRule());
                                    }));

                            JSONObject usageRuleObject = new JSONObject();
                            Optional.ofNullable(coupon.getUsageRules())
                                    .map(CouponUsageRulesType::getUsageRule)
                                    .ifPresent(usageRule -> usageRule.forEach(u -> {
                                        usageRuleObject.put(u.getCode(), u.getRule());
                                    }));

                            po.setUsageRules(usageRuleObject.toString());
                            po.setPurchaseRules(purchaseRuleObject.toString());

                            Optional.ofNullable(coupon.getTicketing())
                                    .ifPresent(t -> {
                                        po.setETicketNumber(t.getETicketNumber());
                                        po.setTicketingStatus(t.getTicketingStatus());
                                        po.setTicketTime(Utils.xmlDate2StringWithShanghaiTimezone(t.getTicketTime()));
                                    });

                            result.add(po);
                        }
                    });
        }

        return result;
    }
}
