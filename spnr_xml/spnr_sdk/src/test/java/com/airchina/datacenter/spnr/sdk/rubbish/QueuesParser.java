package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_QueuesPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.QueueActionType;
import com.airchina.datacenter.spnr.sdk.entity.SuperPNRType;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class QueuesParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
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

                            po.setSuperPnrId(context.getSPnrID());
                            po.setQueueId(Utils.toWrapperLong(queue.getQueueID()));
                            po.setActive(Utils.boolean2String(queue.isActive()));
                            po.setQueueName(queue.getQueueName());
                            po.setAction(action.getAction());
                            po.setAgent(action.getAgent());
                            po.setOpsDate(xmlDate2StringWithShanghaiTimezone(action.getDate()));
                            po.setSeqNo(Utils.toWrapperLong(action.getSeqNo()));
                            po.setUrgent(action.getUrgent());
                            po.setReason(action.getReason());
                            context.getSPNRQueuesPos().add(po);
                        });
                    }
                });
    }
}
