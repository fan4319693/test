package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AuditsPo;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAuditsParser </p>
 * <p>Description: MP_AuditsPo 的转换器 </p>
 * <p>Sample:  new MpAuditsParser(new FieldsArrayStrategy(MP_AuditsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAuditsParser extends AbstractParser {

    public MpAuditsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getAudits())
                    .map(a -> a.getAudit())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(audits -> audits.forEach(audit -> {
                        MP_AuditsPo po = new MP_AuditsPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setAuditId(Utils.toWrapperLong(audit.getID()));
                        po.setRequestorId(audit.getRequestorID());
                        po.setChannel(audit.getChannel());
                        po.setVersion(audit.getVersion());
                        po.setInTimestamp(audit.getTimestamp());
                        po.setSourceAddress(audit.getSourceAddress());
                        po.setAction(audit.getAction());
                        Optional.ofNullable(audit.getAgent())
                                .ifPresent(a -> {
                                    po.setAgent(a.getAgent());
                                    po.setAgentUrl(a.getURL());
                                    po.setAgency(a.getAgency());
                                    po.setAgentId(a.getID());
                                    po.setAgentFunctionalGroup(a.getFunctionalGroup());
                                    po.setAgentAdministrativeGroup(a.getAdministrativeGroup());
                                });

                        po.setEventInfo(Commons.getEventInfo(audit.getEvents()));

                        result.add(po);
                    }));
        }
        return result;
    }
}
