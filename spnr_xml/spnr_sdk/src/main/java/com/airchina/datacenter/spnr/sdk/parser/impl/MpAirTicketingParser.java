package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirTicketingPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.entity.TicketingFullInfoType;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirTicketingParser </p>
 * <p>Description: MP_AirTicketingPo 的转换器 </p>
 * <p>Sample:  new MpAirTicketingParser(new FieldsArrayStrategy(MP_AirTicketingPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirTicketingParser extends AbstractParser {

    public MpAirTicketingParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.Air air = mp.getAir();
            if (air == null) {
                continue;
            }
            List<TicketingFullInfoType> ticketing = air.getTicketing();
            if (CollectionUtils.isEmpty(ticketing)) {
                continue;
            }

            String pnr = Commons.getMpPnr(mp);
            ticketing.forEach(ticket -> {
                MP_AirTicketingPo po = new MP_AirTicketingPo();

                po.setSuperPnrId(spnr.getSuperPNRID());
                po.setSearchId(mp.getSearchID());
                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                po.setPnr(pnr);
                Long flightSegmentRefNumber = Utils.getFirstNonNullApply(ticket.getFlightSegmentRefNumber(), Utils::toWrapperLong);
                po.setFlightSegmentRefNumber(flightSegmentRefNumber);
                po.setIrr(Utils.boolean2String(ticket.isIRR()));
                po.setIrrReason(ticket.getIRRReason());
                po.setIssuingAgentId(ticket.getIssuingAgentID());
                po.setItemNumber(ticket.getItemNumber());
                po.setPrinted(Utils.boolean2String(ticket.isPrinted()));
                po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticket.getTicketTime()));
                po.setTicketingStatus(ticket.getTicketingStatus());
                Long travelerRefNumber = Utils.getFirstNonNullApply(ticket.getTravelerRefNumber(), Utils::toWrapperLong);
                po.setTravelerRefNumber(travelerRefNumber);
                po.seteTicketNumber(ticket.getETicketNumber());
                po.setTicketTimeLimit(xmlDate2StringWithShanghaiTimezone(ticket.getTicketTimeLimit()));
                po.setExpiryDateTime(xmlDate2StringWithShanghaiTimezone(ticket.getExpiryDateTime()));
                po.setWaitlistStatus(ticket.getWaitlistStatus());
                po.setRefundInfo(Commons.getRefundInfoJson(ticket.getRefundInfo()));

                result.add(po);
            });
        }
        return result;
    }
}
