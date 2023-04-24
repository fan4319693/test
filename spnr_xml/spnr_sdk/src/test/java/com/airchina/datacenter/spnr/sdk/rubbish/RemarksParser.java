package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_remarksPo;
import com.airchina.datacenter.spnr.sdk.entity.OJRemarkType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.RefundQualifiersType;
import com.airchina.datacenter.spnr.sdk.entity.SuperPNRType;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.base.Strings;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * @author wgni
 * @since 2022/7/6
 */
public class RemarksParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {

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
                                        po.setSuperPnrId(context.getSPnrID());
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
                                                .ifPresent(a -> po.setAgent(a.getAgent())
                                        );
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
                                        context.getSPnrRemarksPos().add(po);
                                    });
                                });

                    }
                });


    }
}
