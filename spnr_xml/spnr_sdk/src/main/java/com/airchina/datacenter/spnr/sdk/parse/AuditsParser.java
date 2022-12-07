package com.airchina.datacenter.spnr.sdk.parse;


import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AuditsPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class AuditsParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getAudits())
                .map(a->a.getAudit())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(audits ->
                        audits.forEach(audit -> {
                            Optional
                                    .ofNullable(audit.getEvents())
                                    .map(a->a.getEvent())
                                    .ifPresent(events -> events.forEach(event -> {
                                        Spnr_AuditsPo po = new Spnr_AuditsPo();
                                        po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
                                        po.setAuditId(audit.getID());
                                        po.setRequestorId(audit.getRequestorID());
                                        po.setChannel(audit.getChannel());
                                        po.setVersion(audit.getVersion());
                                        po.setOpsTimestamp(audit.getTimestamp());
                                        po.setSourceAddress(audit.getSourceAddress());
                                        po.setAction(audit.getAction());
                                        Optional.ofNullable(audit.getAgent())
                                                .ifPresent(agent -> {
                                                    po.setAgent(agent.getAgent());
                                                    po.setAgentUrl(agent.getURL());
                                                    po.setAgency(agent.getAgency());
                                                });
                                        po.setEventContext(event.getContext());
                                        po.setEventId(Utils.tyrParseInt(event.getID()));
                                        po.setEventOjSuperPnrRph(String.valueOf(event.getOJSuperPNRRPH()));
                                        po.setEventOrigValue(event.getOrigValue());
                                        po.setEventRefId(event.getRefId());
                                        po.setEventPath(event.getPath());
                                        po.setEventType(event.getType());
                                        po.setEventFltSegRph(String.valueOf(event.getFlightSegmentRPH()));
                                        po.setEventRefPath(event.getRefPath());
                                        context.getSPnrAuditsPos().add(po);
                                    }));
                        })
                );
    }
}
