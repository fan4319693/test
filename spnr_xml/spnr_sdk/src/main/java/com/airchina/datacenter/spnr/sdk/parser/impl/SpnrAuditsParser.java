package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AuditsPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrAuditsParser </p>
 * <p>Description: Spnr_AuditsPo 的转换器 </p>
 * <p>Sample:  new SpnrAuditsParser(new FieldsArrayStrategy(Spnr_AuditsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrAuditsParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrAuditsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_AuditsPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();

        Optional
                .ofNullable(spnr.getAudits())
                .map(a -> a.getAudit())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(audits ->
                        audits.forEach(audit -> {
                            Optional
                                    .ofNullable(audit.getEvents())
                                    .map(a -> a.getEvent())
                                    .ifPresent(events ->
                                    {
                                        AtomicInteger ref = new AtomicInteger();
                                        events.forEach(event -> {
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
                                            po.setEventRph(ref.getAndIncrement());
                                            result.add(po);});
                                    });
                        })
                );

        return result;
    }
}
