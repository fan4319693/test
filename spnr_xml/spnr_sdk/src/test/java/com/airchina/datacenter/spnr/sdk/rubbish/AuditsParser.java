package com.airchina.datacenter.spnr.sdk.rubbish;


import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AuditsPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Optional;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class AuditsParser {

    /**
     * 范帅2023-04-06修改
     *
     * @param spnr
     * @param context
     */
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getAudits())
                .map(a -> a.getAudit())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(audits ->
                        audits.forEach(audit -> {
                            Optional
                                    .ofNullable(audit.getEvents())
                                    .map(a -> a.getEvent())
                                    .ifPresent(events -> events.forEach(event -> {
                                        Spnr_AuditsPo po = new Spnr_AuditsPo();
                                        po.setSuperPnrId(spnr.getSuperPNRID());
                                        po.setAuditId(Utils.toWrapperLong(audit.getID()));
                                        po.setRequestorId(audit.getRequestorID());
                                        po.setChannel(audit.getChannel());
                                        po.setVersion(audit.getVersion());
                                        po.setOpsTimestamp(audit.getTimestamp());
                                        po.setSourceAddress(audit.getSourceAddress());
                                        po.setAction(audit.getAction());
                                        Utils.consumeOrNull(audit.getAgent(), agent -> {
                                            po.setAgent(agent.getAgent());
                                            po.setAgentUrl(agent.getURL());
                                            po.setAgency(agent.getAgency());
                                            po.setAgentId(agent.getID());
                                            po.setAgentFunctionalGroup(agent.getFunctionalGroup());
                                            po.setAgentAdministrativeGroup(agent.getAdministrativeGroup());
                                        });
                                        po.setEventContext(event.getContext());
                                        po.setEventId(Utils.toWrapperLong(event.getID()));
                                        po.setEventOjSuperPnrRph(Utils.toWrapperLong(event.getOJSuperPNRRPH()));
                                        po.setEventOrigValue(event.getOrigValue());
                                        po.setEventRefId(event.getRefId());
                                        po.setEventPath(event.getPath());
                                        po.setEventType(event.getType());
                                        po.setEventFltSegRph(Utils.toWrapperLong(event.getFlightSegmentRPH()));
                                        po.setEventRefPath(event.getRefPath());
                                        
                                        context.getSPnrAuditsPos().add(po);
                                    }));
                        })
                );
    }
}
