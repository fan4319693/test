package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PaymentDetailsPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPaymentDetailsParser </p>
 * <p>Description: Spnr_PaymentDetailsPo 的转换器 </p>
 * <p>Sample:  new SpnrPaymentDetailsParser(new FieldsArrayStrategy(Spnr_PaymentDetailsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPaymentDetailsParser extends AbstractParser {

    public SpnrPaymentDetailsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getPaymentDetails())
                .ifPresent(details -> {
                    Spnr_PaymentDetailsPo po = new Spnr_PaymentDetailsPo();

                    po.setSuperPnrId(spnr.getSuperPNRID());

                    Utils.consumeOrNull(details.getBalance(), b -> {
                        po.setBalanceAmt(Utils.number2String(b.getAmount()));
                        po.setBalanceCurrency(b.getCurrencyCode());
                    });

                    Utils.consumeOrNull(details.getPayments(), p -> {
                        po.setPaymentsAmt(Utils.number2String(p.getAmount()));
                        po.setPaymentsCurrency(p.getCurrencyCode());
                        po.setActualAmt(Utils.number2String(p.getActualPayment()));
                        po.setLastModified(xmlDate2StringWithShanghaiTimezone(p.getLastModified()));
                    });

                    result.add(po);
                });

        return result;
    }
}
