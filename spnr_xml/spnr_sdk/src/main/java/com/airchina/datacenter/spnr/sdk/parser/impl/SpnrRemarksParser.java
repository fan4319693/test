package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_remarksPo;
import com.airchina.datacenter.spnr.sdk.entity.OJRemarkType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.RefundQualifiersType;
import com.airchina.datacenter.spnr.sdk.entity.SuperPNRType;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrRemarksParser </p>
 * <p>Description: Spnr_remarksPo 的转换器 </p>
 * <p>Sample:  new SpnrRemarksParser(new FieldsArrayStrategy(Spnr_remarksPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrRemarksParser extends AbstractParser {

    public SpnrRemarksParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getRemarks())
                .map(SuperPNRType.Remarks::getRemark)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(remarks -> {
                    for (OJRemarkType rmk : remarks) {
                        Optional.ofNullable(rmk.getRefundQualifiers())
                                .map(RefundQualifiersType::getRefundQualifier)
                                .filter(CollectionUtils::isNotEmpty)
                                .ifPresent(refundQualifiers -> {
                                    refundQualifiers.forEach(qualifier -> {
                                        Spnr_remarksPo po = new Spnr_remarksPo();

                                        po.setSuperPnrId(spnr.getSuperPNRID());
                                        po.setActive(Utils.boolean2String(rmk.isActive()));
                                        po.setAuditId(Utils.toWrapperLong(rmk.getAuditID()));
                                        po.setCode(rmk.getCode());
                                        po.setCodeContext(rmk.getCodeContext());
                                        po.setRemarkDate(xmlDate2StringWithShanghaiTimezone(rmk.getDate()));
                                        po.setHistoryRph(Utils.toWrapperLong(rmk.getHistoryRPH()));
                                        po.setLastModified(xmlDate2StringWithShanghaiTimezone(rmk.getLastModified()));
                                        po.setRph(Utils.toWrapperLong(rmk.getRPH()));
                                        po.setSeqNo(Utils.toWrapperLong(rmk.getSeqNo()));

                                        Optional.ofNullable(rmk.getAgent())
                                                .ifPresent(a -> po.setAgent(a.getAgent()));

                                        po.setQualifierDescription(qualifier.getQualifierDescription());
                                        po.setQualifierValue(qualifier.getQualifierValue());
                                        po.setFlightSegmentRph(Utils.toWrapperLong(qualifier.getFlightSegmentRPH()));
                                        po.setOjSuperPnrRph(Utils.toWrapperLong(qualifier.getOJSuperPNRRPH()));
                                        po.seteTicketNumber(qualifier.getETicketNumber());
                                        po.setPassengerTypeCode(qualifier.getPassengerTypeCode());
                                        po.setHistoryId(Utils.toWrapperLong(qualifier.getHistoryID()));
                                        po.setProductNumber(Utils.toWrapperLong(qualifier.getProductNumber()));

                                        String qualifierItems = Utils.collection2String(qualifier.getQualifierItem(), t ->
                                                        t.getName() + ":" + Strings.nullToEmpty(t.getValue()),
                                                Constants.JoinByPipeNull2Empty);

                                        po.setQualifierItem(qualifierItems);
                                        result.add(po);
                                    });
                                });
                    }
                });

        return result;
    }
}
