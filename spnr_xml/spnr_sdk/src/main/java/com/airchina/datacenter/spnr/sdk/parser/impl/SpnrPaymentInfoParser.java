package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentInfoPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.kerby.util.OSUtil;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPaymentInfoParser </p>
 * <p>Description: Spnr_PaymentInfoPo 的转换器 </p>
 * <p>Sample:  new SpnrPaymentInfoParser(new FieldsArrayStrategy(Spnr_PaymentInfoPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPaymentInfoParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrPaymentInfoParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_PaymentInfoPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();

        Optional.ofNullable(spnr.getPaymentDetails())
                .map(PaymentDetailsType::getPayments)
                .map(PaymentsType::getPayment)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ps -> {
                    ps.forEach(payment -> {
                        Spnr_PaymentInfoPo po = new Spnr_PaymentInfoPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setId(Utils.toWrapperLong(payment.getID()));
                        po.setSeqNo(Utils.toWrapperLong(payment.getSeqNo()));
                        po.setAmt(Utils.number2String(payment.getAmount()));
                        po.setAuditId(Utils.toWrapperLong(payment.getAuditID()));
                        po.setCurrencyCode(payment.getCurrencyCode());
                        po.setHistoric(Utils.boolean2String(payment.isHistoric()));
                        po.setHistoryId(Utils.toWrapperLong(payment.getHistoryID()));
                        po.setPaymentDate(xmlDate2StringWithShanghaiTimezone(payment.getPaymentDate()));
                        po.setProductList(Utils.collection2String(payment.getProductList()));
                        po.setStatus(payment.getStatus());

                        Optional.ofNullable(payment.getTransactionType())
                                .ifPresent(t -> po.setTransactionType(t.value()));

                        po.setPrePayInd(Utils.boolean2String(payment.isPrePayInd()));

                        Optional.ofNullable(payment.getAgent())
                                .ifPresent(agent -> {
                                    po.setAgent(agent.getAgent());
                                    po.setAgentUrl(agent.getURL());
                                    po.setAgency(agent.getAgency());
                                    po.setAgentId(agent.getID());
                                    po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                                    po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                                });

                        Optional.ofNullable(payment.getPaymentForm())
                                .map(Utils::getFirstNonNull)
                                .ifPresent(t -> {
                                    //防止空指针, 将其定义在外
                                    JSONObject voucherJson = new JSONObject();

                                    Utils.consumeOrNull(t.getVoucher(), v -> {
                                        voucherJson.put("applicableChannel", v.getApplicableChannel());
                                        voucherJson.put("createDate", Utils.xmlDate2StringWithShanghaiTimezone(v.getCreateDate()));
                                        voucherJson.put("createdBy", v.getCreatedBy());
                                        voucherJson.put("effectiveDate", Utils.xmlDate2StringWithShanghaiTimezone(v.getEffectiveDate()));
                                        voucherJson.put("expireDate", Utils.xmlDate2StringWithShanghaiTimezone(v.getExpireDate()));
                                        voucherJson.put("faceValue", v.getFaceValue());
                                        voucherJson.put("origin", v.getOrigin());
                                        voucherJson.put("owner", v.getOwner());
                                        voucherJson.put("scope", v.getScope());
                                        voucherJson.put("seriesCode", v.getSeriesCode());
                                        voucherJson.put("status", v.getStatus());
                                        voucherJson.put("type", v.getType());

                                        //TODO 以下两个节点结构较复杂, 暂不解析, 待以后需求
                                        //List<CouponRuleType> changeRule = changeRules.getChangeRule();
                                        //CouponRefundRulesType refundRules = v.getRefundRules();
                                    });
                                    po.setVoucher(voucherJson.toJSONString());

                                    Utils.consumeOrNull(t.getOther(), o -> {
                                        po.setPaymentFormType(Utils.number2String(o.getType()));
                                        //TODO 这里的原代码与Excel不同,格式为key1:value1|key2:value2
                                        String refCode = Utils.collection2String(o.getRef(),
                                                r -> r.getCode() + ":" + Strings.nullToEmpty(r.getValue()),
                                                Constants.JoinByPipeNull2Empty);
                                        po.setRefCode(refCode);
                                    });
                                });

                        JSONObject paymentQualifierJson = new JSONObject();
                        Optional.ofNullable(payment.getPaymentQualifiers())
                                .map(PaymentType.PaymentQualifiers::getPaymentQualifier)
                                .ifPresent(t -> {
                                    t.forEach(item -> {
                                        String flightSegmentRPH = item.getFlightSegmentRPH();
                                        if (flightSegmentRPH != null) {
                                            paymentQualifierJson.put("OJSuperPNRRPH", item.getOJSuperPNRRPH());
                                            paymentQualifierJson.put("flightSegmentRPH", flightSegmentRPH);
                                        }
                                        String desc = item.getQualifierDescription();
                                        String value = item.getQualifierValue();
                                        //TODO 暂不需要referProductNumber
                                        if (desc != null && !desc.equalsIgnoreCase("referProductNumber")) {
                                            paymentQualifierJson.put(desc, value);
                                        }
                                    });
                                });

                        po.setPaymentQualifier(paymentQualifierJson.toJSONString());
                        po.setQuantity(payment.getQuantity());

                        result.add(po);
                    });
                });

        return result;
    }
}
