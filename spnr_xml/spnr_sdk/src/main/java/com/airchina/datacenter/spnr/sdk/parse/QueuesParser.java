package com.airchina.datacenter.spnr.sdk.parse;

import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_QueuesPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import java.util.Optional;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class QueuesParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        Optional
                .ofNullable(spnr.getQueues())
                .map(OJSuperPNR.Queues::getQueue)
                .ifPresent(queues -> queues.forEach(queue -> {
                    if (CollectionUtils.isEmpty(queue.getAction())) {
                        return;
                    }
                    queue.getAction().forEach(action -> {
                        Spnr_QueuesPo po = new Spnr_QueuesPo();
                        po.setSuperPnrId(context.getSPnrID());
                        po.setQueueId(Utils.tyrParseInt(queue.getQueueID()));
                        po.setActive(String.valueOf(queue.isActive()));
                        po.setQueueName(queue.getQueueName());
                        po.setAction(action.getAction());
                        po.setAgent(action.getAgent());
                        po.setOpsDate(xmlDate2String(action.getDate()));
                        po.setSeqNo(action.getSeqNo().longValue());
                        po.setUrgent(action.getUrgent());
                        po.setReason(action.getReason());
                        context.getSPNRQueuesPos().add(po);
                    });
                }));
    }
}
