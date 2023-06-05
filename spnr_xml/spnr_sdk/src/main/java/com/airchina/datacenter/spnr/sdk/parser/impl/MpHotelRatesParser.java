package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_HotelPo;
import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Hotel_RatesPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Objects;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpHotelParser </p>
 * <p>Description: MpHotelParser 的转换器 </p>
 * <p>Sample:  new MpHotelParser(new FieldsArrayStrategy(MP_HotelPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpHotelRatesParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpHotelRatesParser(SerdeStrategy strategy) {
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
                    .map(HotelReservationType::getRoomStays)
                    .ifPresent(stay -> {
                        for (RoomStaysType.RoomStay roomStay : stay.getRoomStay()) {
                            for (RoomStayType.RoomRates.RoomRate roomRate : roomStay.getRoomRates().getRoomRate()) {
                                MP_Hotel_RatesPo po = new MP_Hotel_RatesPo();
                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setSearchId(mp.getSearchID());
                                po.setRoomStayRph(Utils.toWrapperLong(roomStay.getIndexNumber()));
                                po.setSourceOfBusiness(roomStay.getSourceOfBusiness());
                                po.setRoomRph(Utils.toWrapperLong(roomRate.getRoomRPH()));
                                po.setRoomTypeCode(roomRate.getRoomTypeCode());

                                Optional.ofNullable(roomRate)
                                        .ifPresent(rate -> {
                                            po.setMealCode(rate.getMealPlanCode());
                                            Utils.getFirstNonNullOptional(rate.getRates().getRate())
                                                    .ifPresent(r -> {
                                                        Optional.ofNullable(r.getTotal()).ifPresent(t -> {
                                                            po.setAmountBeforeTax(Utils.number2String(t.getAmountBeforeTax()));
                                                            po.setAmountAfterTax(Utils.number2String(t.getAmountAfterTax()));
                                                            po.setCurrencyCode(t.getCurrencyCode());
                                                            po.setMealPriceAfterTax(Utils.number2String(t.getMealPriceAfterTax()));
                                                            po.setMealPriceBeforeTax(Utils.number2String(t.getMealPriceBeforeTax()));
                                                            po.setMealSupplierPrice(Utils.number2String(t.getMealSupplierPrice()));
                                                            po.setMealCurrencyCode(t.getOriginalCurrencyCode());
                                                            po.setSupplierAmount(Utils.number2String(t.getSupplierAmount()));
                                                        });
                                                    });
                                        });
                                result.add(po);
                            }
                        }
                    });
        }

        return result;
    }
}
