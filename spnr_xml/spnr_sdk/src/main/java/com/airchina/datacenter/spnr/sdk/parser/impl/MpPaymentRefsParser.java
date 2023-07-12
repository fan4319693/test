package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PaymentRefsPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPaymentRefsParser </p>
 * <p>Description: MP_PaymentRefsPo 的转换器 </p>
 * <p>Sample:  new MpPaymentRefsParser(new FieldsArrayStrategy(MP_PaymentRefsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPaymentRefsParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpPaymentRefsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_PaymentRefsPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();

        for (ModularProductType mp : spnr.getModularProduct()) {
            ModularProductType.PaymentRefs paymentRefs = mp.getPaymentRefs();
            if (paymentRefs == null) {
                continue;
            }

            Optional.ofNullable(paymentRefs.getPaymentRef())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(refList ->
                            refList.forEach(ref -> {
                                MP_PaymentRefsPo po = new MP_PaymentRefsPo();

                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setSearchId(mp.getSearchID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setPnr(Commons.getMpPnr(mp));
                                po.setPaymentRefsAuditId(Utils.toWrapperLong(paymentRefs.getAuditID()));
                                Utils.consumeOrNull(paymentRefs.getPaymentState(), t -> po.setPaymentState(t.value()));
                                po.setPaymentRefId(Utils.toWrapperLong(ref.getID()));
                                po.setPaymentId(ref.getPaymentID());
                                po.setPaymentRefAuditId(Utils.toWrapperLong(ref.getAuditID()));

                                result.add(po);
                            }));
        }
        return result;
    }
}
