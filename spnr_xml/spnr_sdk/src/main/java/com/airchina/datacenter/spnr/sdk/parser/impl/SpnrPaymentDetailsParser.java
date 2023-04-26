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

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrPaymentDetailsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_PaymentDetailsPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
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
