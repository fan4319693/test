package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_HotelPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Hotel_GuestPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpHotelParser </p>
 * <p>Description: MpHotelParser 的转换器 </p>
 * <p>Sample:  new MpHotelParser(new FieldsArrayStrategy(MP_HotelPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpHotelGuestParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpHotelGuestParser(SerdeStrategy strategy) {
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
            Optional.ofNullable(mp.getHotel())
                .map(HotelReservationType::getResGuests)
                .ifPresent(guestsType -> {
                    for (ResGuestsType.ResGuest resGuest : guestsType.getResGuest()) {
                        MP_Hotel_GuestPo guestPo = new MP_Hotel_GuestPo();
                        guestPo.setSuperPnrId(spnr.getSuperPNRID());
                        guestPo.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        guestPo.setRph(Utils.toWrapperLong(resGuest.getResGuestRPH()));
                        guestPo.setAgeCode(resGuest.getAgeQualifyingCode());
                        guestPo.setOjSuperPnrRph(Utils.toWrapperLong(resGuest.getOJSuperPNRRPH()));
                        guestPo.setArrivalTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(resGuest.getArrivalTime()));
                        guestPo.setDepartmentTimestamp(Utils.xmlDate2StringWithShanghaiTimezone(resGuest.getDepartureTime()));
                    }
                });
        }
        return result;
    }
}
