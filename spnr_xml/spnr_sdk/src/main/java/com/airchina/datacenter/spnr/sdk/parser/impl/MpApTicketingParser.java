package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_TicketingPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.entity.TicketingInfoType;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApTicketingParser </p>
 * <p>Description: MP_AP_TicketingPo 的转换器 </p>
 * <p>Sample:  new MpApTicketingParser(new FieldsArrayStrategy(MP_AP_TicketingPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApTicketingParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApTicketingParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_TicketingPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
            if (ancillaryProduct == null) {
                continue;
            }
            List<TicketingInfoType> ticketingList = ancillaryProduct.getTicketing();
            if (CollectionUtils.isEmpty(ticketingList)) {
                continue;
            }
            ticketingList.forEach(ticketing -> {
                MP_AP_TicketingPo po = new MP_AP_TicketingPo();

                po.setSuperPnrId(spnr.getSuperPNRID());
                po.setSearchId(mp.getSearchID());
                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                po.setETicketNumber(ticketing.getETicketNumber());
                //TODO 集合，未决定取哪个，取首个
                po.setTravelerRph(Utils.getFirstNonNullApply(ticketing.getTravelerRefNumber(), Utils::toWrapperLong));
                po.setFlightSegmentRph(Utils.collection2String(ticketing.getFlightSegmentRefNumber()));

                po.setTicketAdvisory(Utils.collection2String(ticketing.getTicketAdvisory(), t -> t.getValue()));
                Utils.getFirstNonNullConsume(ticketing.getCheckInInfo(), checkInInfo -> {
                    po.setBoardingTime(checkInInfo.getBoardingTime());
                });
                po.setTicketingStatus(ticketing.getTicketingStatus());
                po.setTicketTime(xmlDate2StringWithShanghaiTimezone(ticketing.getTicketTime()));

                result.add(po);
            });
        }

        return result;
    }
}
