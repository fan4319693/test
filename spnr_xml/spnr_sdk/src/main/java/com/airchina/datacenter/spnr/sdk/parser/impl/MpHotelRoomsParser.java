package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Hotel_RoomPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

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
public class MpHotelRoomsParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpHotelRoomsParser(SerdeStrategy strategy) {
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
                                MP_Hotel_RoomPo po = new MP_Hotel_RoomPo();
                                po.setSuperPnrId(spnr.getSuperPNRID());
                                po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                                po.setSearchId(mp.getSearchID());
                                po.setRoomStayRph(Utils.toWrapperLong(roomStay.getIndexNumber()));
                                po.setSourceOfBusiness(roomStay.getSourceOfBusiness());

                                po.setAllocatedUnits(roomRate.getAllocatedUnits());
                                po.setMode(roomRate.getMode());
                                po.setNumberOfGuests(roomRate.getNumberOfGuests());
                                po.setNumberOfUnits(roomRate.getNumberOfUnits());
                                po.setRatePlanCode(roomRate.getRatePlanCode());
                                po.setRemainingUnits(roomRate.getRemainingUnits());

                                po.setRoomRph(Utils.toWrapperLong(roomRate.getRoomRPH()));
                                po.setRoomTypeCode(roomRate.getRoomTypeCode());

                                Utils.getFirstNonNullConsume(roomStay.getTimeSpan(), t -> {
                                    po.setStart(t.getStart());
                                    po.setEnd(t.getEnd());
                                    po.setDuration(Utils.toWrapperLong(t.getDuration()));
                                });



                                Optional.of(roomRate)
                                        .ifPresent(rate -> {
                                            po.setMealCode(rate.getMealPlanCode());
                                            Utils.getFirstNonNullOptional(rate.getRates().getRate())
                                                    .ifPresent(r -> {
                                               Optional.ofNullable(r.getTotal())
                                                               .ifPresent(t -> {
                                                                   po.setAmountBeforeTax(Utils.number2String(t.getAmountBeforeTax()));
                                                                   po.setAmountAfterTax(Utils.number2String(t.getAmountAfterTax()));
                                                                   po.setCurrencyCode(t.getCurrencyCode());
                                                                   po.setMealPriceAfterTax(Utils.number2String(t.getMealPriceAfterTax()));
                                                                   po.setMealPriceBeforeTax(Utils.number2String(t.getMealPriceBeforeTax()));
                                                                   po.setMealSupplierPrice(Utils.number2String(t.getMealSupplierPrice()));
                                                                   po.setMealCurrencyCode(t.getOriginalCurrencyCode());
                                                                   po.setSupplierAmount(Utils.number2String(t.getSupplierAmount()));
                                                               });

                                                Optional.ofNullable(r.getNightlyRates())
                                                        .map(AmountType.NightlyRates::getNightlyRate)
                                                        .ifPresent(n -> Utils.getFirstNonNullConsume(n, u -> {
                                                            po.setNightNumber(u.getNightNumber());
                                                            po.setNightRatePlanCode(u.getRatePlanCode());
                                                            po.setNightSupplierAmt(Utils.number2String(u.getSupplierAmount()));
                                                        }));
                                            });
                                        });


                                Optional.ofNullable(roomStay.getBasicPropertyInfo())
                                    .ifPresent(b -> {
                                        po.setHotelCode(b.getHotelCode());
                                        po.setHotelName(b.getHotelName());
                                        po.setStayType(b.getStayType());
                                        po.setTimeZone(b.getTimeZone());

                                        Utils.getFirstNonNullOptional(b.getPolicies().getPolicy()).flatMap(p -> Utils.getFirstNonNullOptional(p.getPolicyInfo())).ifPresent(policyInfo -> {
                                            po.setCheckInTime(policyInfo.getCheckInTime());
                                            po.setCheckOutTime(policyInfo.getCheckOutTime());
                                        });
                                        Utils.getFirstNonNullOptional(b.getPhones().getPhone())
                                                .ifPresent(p -> {
                                                    po.setHotelTelephone(Commons.getHotelTelephone(p));
                                                });
                                        Optional.ofNullable(b.getAddress())
                                                .ifPresent(p -> {
                                                    po.setHotelCityName(po.getHotelCityName());
                                                    po.setHotelAddress(po.getHotelAddress());
                                                });
                                    });

                                Optional.ofNullable(mp.getHotel())
                                    .map(HotelReservationType::getResGlobalInfo)
                                    .ifPresent(t -> {
                                        if (po.getStart() == null) {
                                            Optional.ofNullable(t.getTimeSpan())
                                                    .ifPresent(span -> {
                                                        po.setStart(span.getStart());
                                                        po.setEnd(span.getEnd());
                                                        po.setDuration(Utils.toWrapperLong(span.getDuration()));
                                                    });
                                        }
                                        Utils.getFirstNonNullConsume(t.getHotelReservationIDs(),
                                                r -> Utils.getFirstNonNullConsume(r.getHotelReservationID(), id -> {
                                                    po.setResId(id.getResIDValue());
                                                }));
                                        Optional.ofNullable(t.getResGuestRPHs())
                                                .map(ResGuestRPHsType::getResGuestRPH)
                                                .ifPresent(r -> po.setGuestIds(Utils.collection2String(r, ResGuestRPHsType.ResGuestRPH::getRPH)));
                                    });
                                result.add(po);
                            }
                        }
                    });
        }

        return result;
    }
}
