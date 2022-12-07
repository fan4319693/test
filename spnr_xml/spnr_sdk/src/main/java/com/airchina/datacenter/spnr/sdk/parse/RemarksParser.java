package com.airchina.datacenter.spnr.sdk.parse;


import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_remarksPo;
import com.airchina.datacenter.spnr.sdk.entity.OJRemarkType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.RefundQualifierType;
import com.airchina.datacenter.spnr.sdk.entity.RefundQualifiersType;
import java.util.List;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/6
 */
public class RemarksParser {

    public static void process(OJSuperPNR sPnr, SPNRContext context) {
        if (sPnr.getRemarks() == null) {
            return;
        }
        List<OJRemarkType> remark = sPnr.getRemarks().getRemark();
        if (CollectionUtils.isEmpty(remark)) {
            return;
        }

        remark.forEach(rmk -> {


            RefundQualifiersType refundQualifiers = rmk.getRefundQualifiers();
            if (refundQualifiers == null) {
                return;
            }

            List<RefundQualifierType> refundQualifier = refundQualifiers.getRefundQualifier();
            if (CollectionUtils.isEmpty(refundQualifier)) {
                return;
            }

            refundQualifier.forEach(qualifier -> {
                Spnr_remarksPo po = new Spnr_remarksPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setActive(String.valueOf(rmk.isActive()));
                po.setAuditId(String.valueOf(rmk.getAuditID()));
                po.setCode(rmk.getCode());
                po.setCodeContext(rmk.getCodeContext());
                po.setRemarkDate(xmlDate2String(rmk.getDate()));
                po.setHistoryRph(String.valueOf(rmk.getHistoryRPH()));
                po.setLastModified(xmlDate2String(rmk.getLastModified()));
                po.setSeqNo(String.valueOf(rmk.getSeqNo()));
                Optional.ofNullable(rmk.getAgent()).ifPresent(a -> po.setAgent(a.getAgent()));
                po.setQualifierDescription(qualifier.getQualifierDescription());
                po.setQualifierValue(qualifier.getQualifierValue());


                po.setFlightSegmentRph(qualifier.getFlightSegmentRPH());
                po.setOjSuperPnrRph(qualifier.getOJSuperPNRRPH());
                po.seteTicketNumber(qualifier.getETicketNumber());
                po.setPassengerTypeCode(qualifier.getPassengerTypeCode());
                po.setHistoryId(String.valueOf(Utils.toInt(qualifier.getHistoryID())));
                po.setProductNumber(String.valueOf(Utils.toInt(qualifier.getProductNumber())));
                context.getSPnrRemarksPos().add(po);
            });


        });
    }
}
