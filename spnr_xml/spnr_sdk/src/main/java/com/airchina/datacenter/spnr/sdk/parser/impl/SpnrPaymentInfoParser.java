package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentinfoPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPaymentInfoParser </p>
 * <p>Description: Spnr_PaymentinfoPo 的转换器 </p>
 * <p>Sample:  new SpnrPaymentInfoParser(new FieldsArrayStrategy(Spnr_PaymentinfoPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPaymentInfoParser extends AbstractParser {

    public SpnrPaymentInfoParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();

        Optional.ofNullable(spnr.getPaymentDetails())
                .map(t -> t.getPayments())
                .map(t -> t.getPayment())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(ps -> {
                    ps.forEach(payment -> {
                        Spnr_PaymentinfoPo po = new Spnr_PaymentinfoPo();

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

                        Optional
                                .ofNullable(payment.getPaymentForm())
                                .map(Utils::getFirstNonNull)
                                .map(p -> p.getOther())
                                .ifPresent(t -> {
                                    po.setPaymentFormType(Utils.number2String(t.getType()));
                                    //TODO 这里的原代码与Excel不同,格式为key1:value1|key2:value2
                                    String refCode = Utils.collection2String(t.getRef(),
                                            r -> r.getCode() + ":" + Strings.nullToEmpty(r.getValue()),
                                            Constants.JoinByPipeNull2Empty);
                                    po.setRefCode(refCode);
                                });

                        result.add(po);
                    });
                });

        return result;
    }
}
