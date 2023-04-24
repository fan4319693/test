package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_QueuesPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.QueueActionType;
import com.airchina.datacenter.spnr.sdk.entity.SuperPNRType;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrQueuesParser </p>
 * <p>Description: Spnr_QueuesPo 的转换器 </p>
 * <p>Sample:  new SpnrQueuesParser(new FieldsArrayStrategy(Spnr_QueuesPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrQueuesParser extends AbstractParser {

    public SpnrQueuesParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getQueues())
                .map(OJSuperPNR.Queues::getQueue)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(queues -> {
                    for (SuperPNRType.Queues.Queue queue : queues) {
                        List<QueueActionType> actions = queue.getAction();
                        if(CollectionUtils.isEmpty(actions)){
                            continue;
                        }
                        actions.forEach(action -> {
                            Spnr_QueuesPo po = new Spnr_QueuesPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setQueueId(Utils.toWrapperLong(queue.getQueueID()));
                            po.setActive(Utils.boolean2String(queue.isActive()));
                            po.setQueueName(queue.getQueueName());
                            po.setAction(action.getAction());
                            po.setAgent(action.getAgent());
                            po.setOpsDate(xmlDate2StringWithShanghaiTimezone(action.getDate()));
                            po.setSeqNo(Utils.toWrapperLong(action.getSeqNo()));
                            po.setUrgent(action.getUrgent());
                            po.setReason(action.getReason());

                            result.add(po);
                        });
                    }
                });

        return result;
    }
}
