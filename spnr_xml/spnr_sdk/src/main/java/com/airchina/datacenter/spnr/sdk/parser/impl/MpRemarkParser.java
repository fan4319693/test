package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_RemarksPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpRemarkParser </p>
 * <p>Description: MP_RemarksPo 的转换器 </p>
 * <p>Sample:  new MpRemarkParser(new FieldsArrayStrategy(MP_RemarksPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpRemarkParser extends AbstractParser {

    public MpRemarkParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getRemarks())
                    .map(r -> r.getRemark())
                    .ifPresent(rmks -> rmks.forEach(rmk -> {
                        MP_RemarksPo po = new MP_RemarksPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setActive(Utils.boolean2String(rmk.isActive()));
                        po.setAuditId(Utils.toWrapperLong(rmk.getAuditID()));
                        po.setCode(rmk.getCode());
                        po.setCodeContext(rmk.getCodeContext());
                        po.setOpsDate(xmlDate2StringWithShanghaiTimezone(rmk.getDate()));
                        po.setLastModified(xmlDate2StringWithShanghaiTimezone(rmk.getLastModified()));
                        po.setRph(Utils.toWrapperLong(rmk.getRPH()));

                        Utils.consumeOrNull(rmk.getAgent(), a -> {
                            po.setAgent(a.getAgent());
                            po.setAgentSourceAddress(a.getSourceAddress());
                            po.setInTimestamp(a.getTimestamp());
                        });

                        po.setQualifierInfo(Commons.getQualifierInfo(rmk.getRefundQualifiers()));
                        result.add(po);
                    }));
        }
        return result;
    }
}
