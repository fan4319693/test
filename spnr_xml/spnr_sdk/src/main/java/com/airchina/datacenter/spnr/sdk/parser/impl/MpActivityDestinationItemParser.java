package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_Destination_ItemPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApGroundTransportBusParser </p>
 * <p>Description: MP_AP_GroundTransport_BusPo 的转换器 </p>
 * <p>Sample:  new MpApGroundTransportBusParser(new FieldsArrayStrategy(MP_AP_GroundTransport_BusPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpActivityDestinationItemParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpActivityDestinationItemParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_GroundTransport_BusPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getActivity())
                    .map(ProductBase.Activity::getDestActivityItems)
                    .ifPresent( items -> {
                        for (DestActivityItemsType.Item item : items.getItem()) {
                            Mp_Activity_Destination_ItemPo po = new Mp_Activity_Destination_ItemPo();
                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setServiceCode(mp.getServiceCode());
                            po.setFlightSegmentRph(Utils.toWrapperLong(mp.getActivity().getFlightSegmentRPH()));
                            po.setOdRph(Utils.toWrapperLong(mp.getActivity().getOriginDestinationRPH()));
                            po.setResStatus(mp.getActivity().getResStatus());
                            Optional.ofNullable(mp.getActivity().getUniqueID())
                                    .ifPresent(u -> {
                                        po.setUniqueId(u.getID());
                                        po.setUniqueContext(u.getIDContext());
                                        po.setUniqueType(u.getType());
                                    });

                            po.setItemCode(item.getItemCode());
                            po.setOptionCode(item.getOptionCode());
                            po.setQuantity(Utils.toWrapperLong(item.getQuantity()));

                            po.setSelectedDate(Utils.xmlDate2StringWithUtcTimezone(item.getSelectedDate()));
                            po.setSelectedTime(Utils.xmlDate2StringWithShanghaiTimezone(item.getSelectedTime()));
                            Optional.ofNullable(item.getSellingPrice())
                                            .ifPresent(p -> {
                                                po.setAmountAfterTax(Utils.number2String(p.getAmountAfterTax()));
                                                po.setCurrencyCode(p.getCurrencyCode());
                                            });
                            Optional.ofNullable(mp.getActivity().getBookingReferenceID())
                                            .ifPresent(b -> po.setBookingReferenceId(b.getID()));

                            Optional.ofNullable(item.getReservationItemReferences())
                                            .map(ReservationItemReferencesType::getReservationItemReference)
                                                    .ifPresent(t -> {

                                                    });

                            result.add(po);
                        }
                    });
        }
        return result;
    }
}
