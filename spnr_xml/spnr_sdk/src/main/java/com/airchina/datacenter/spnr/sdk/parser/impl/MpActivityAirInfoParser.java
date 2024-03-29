package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Mp_Activity_AirInfoPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.HashMap;
import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApGroundTransportBusParser </p>
 * <p>Description: MP_AP_GroundTransport_BusPo 的转换器 </p>
 * <p>Sample:  new MpApGroundTransportBusParser(new FieldsArrayStrategy(MP_AP_GroundTransport_BusPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpActivityAirInfoParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpActivityAirInfoParser(SerdeStrategy strategy) {
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
                    .map(ProductBase.Activity::getAir)
                    .ifPresent( a -> {
                        HashMap<String, TicketingFullInfoType> ticketingMap = new HashMap<>();
                        for (TicketingFullInfoType ticket : a.getTicketing()) {
                            ticketingMap.put(Utils.getFirstNonNullOrDefault(ticket.getFlightSegmentRefNumber(), "")
                                    + Utils.getFirstNonNullOrDefault(ticket.getTravelerRefNumber(), ""), ticket);
                        }

                        Utils.getFirstNonNullOptional(a.getAirItinerary().getOriginDestinationOptions().getOriginDestinationOption())
                                .ifPresent( o -> {
                                    for (OriginDestinationOptionType.FlightSegment seg : o.getFlightSegment()) {

                                        Mp_Activity_AirInfoPo po = new Mp_Activity_AirInfoPo();
                                        po.setSuperPnrId(spnr.getSuperPNRID());
                                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                                        po.setPnr(a.getBookingReferenceIDAttr());
                                        po.setFlightSegmentRph(Utils.toWrapperLong(seg.getRPH()));
                                        po.setInfoSource(seg.getInfoSource());
                                        po.setModType(seg.getModType());
                                        po.setOriginalRph(seg.getOriginalRPH());
                                        Optional.ofNullable(seg.getDepartureAirport())
                                                .ifPresent(d -> {
                                                    po.setDport(d.getLocationCode());
                                                    po.setDportContext(d.getCodeContext());
                                                    po.setDportTerminal(d.getTerminal());
                                                    po.setDcity(d.getTSCityCode());
                                                    po.setDcountry(d.getCountryCode());
                                                });

                                        Optional.ofNullable(seg.getArrivalAirport())
                                                .ifPresent(d -> {
                                                    po.setDport(d.getLocationCode());
                                                    po.setDportContext(d.getCodeContext());
                                                    po.setDportTerminal(d.getTerminal());
                                                    po.setDcity(d.getTSCityCode());
                                                    po.setDcountry(d.getCountryCode());
                                                });

                                        po.setDepartureTimestamp(Utils.xmlDate2StringWithUtcTimezone(seg.getDepartureDateTime()));
                                        po.setOriDepartureTimestamp(seg.getOriginalDepartureDateTime());
                                        po.setArrivalTimestamp(Utils.xmlDate2StringWithUtcTimezone(seg.getArrivalDateTime()));

                                        Optional.ofNullable(seg.getMarketingAirline()).ifPresent(airline -> {
                                            po.setMarketingFlightNo(Commons.getMarketingFlightNo(seg));
                                            po.setSingleVendorInd(airline.getSingleVendorInd());
                                        });

                                        po.setOperatingFlightNo(Commons.getOperatingFlightNo(seg));
                                        po.setCabinCode(seg.getCabinCode());
                                        po.setSubclass(seg.getResBookDesigCode());
                                        po.setMileage(seg.getMileage());
                                        po.setPreCheckin(Utils.boolean2String(seg.isPreCheckin()));
                                        po.setOnlineCheckin(seg.getOnlineCheckin());
                                        Utils.getFirstNonNullConsume(seg.getEquipment(), e -> po.setAirEquipType(e.getAirEquipType()));

                                        Utils.getFirstNonNullConsume(a.getPriceInfo(), p -> {
                                            Optional.ofNullable(p.getItinTotalFare())
                                                    .map(FareType::getBaseFare)
                                                    .ifPresent(f -> {
                                                        po.setBaseAmt(Utils.number2String(f.getAmount()));
                                                        po.setBaseAdjustAmt(Utils.number2String(f.getAdjusted()));
                                                        po.setBaseOriAmt(Utils.number2String(f.getOriginalAmount()));

                                                    });
                                            Optional.ofNullable(p.getItinTotalFare())
                                                    .map(FareType::getTotalFare)
                                                    .ifPresent(f -> {
                                                        po.setAmt(Utils.number2String(f.getAmount()));
                                                        po.setAdjustAmt(f.getAdjusted());
                                                        po.setOriAmt(Utils.number2String(f.getOriginalAmount()));
                                                        po.setCurrencyCode(f.getCurrencyCode());
                                                    });
                                        });

                                        AirReservationTravelerInfo travelerInfo = a.getTravelerInfo();
                                        if (travelerInfo == null) {
                                            TicketingFullInfoType ticketingInfoType = ticketingMap.get(seg.getRPH() + "1");
                                            Optional.ofNullable(ticketingInfoType)
                                                    .ifPresent(
                                                            t -> {
                                                                po.setIssuingAgentId(t.getIssuingAgentID());
                                                                po.setPrinted(Utils.boolean2String(t.isPrinted()));
                                                                po.setTicketTimestamp(xmlDate2StringWithShanghaiTimezone(t.getTicketTime()));
                                                                po.setTicketingStatus(t.getTicketingStatus());
                                                                po.setETicketNumber(t.getETicketNumber());
                                                                po.setTicketTimeLimitTimestamp(xmlDate2StringWithShanghaiTimezone(t.getTicketTimeLimit()));
                                                                po.setExpiryDateTimestamp(xmlDate2StringWithShanghaiTimezone(t.getExpiryDateTime()));
                                                            }
                                                    );
                                            result.add(po.clone());
                                            continue;
                                        }

                                        for (TravelerInfoType.AirTraveler traveler : travelerInfo.getAirTraveler()) {

                                            po.setOjSuperPnrRph(traveler.getOJSuperPNRRPH());
                                            po.setPassengerTypeCode(traveler.getPassengerTypeCode());
                                            po.setPtcSubType(traveler.getPTCSubType());
                                            Optional.ofNullable(traveler.getPersonName())
                                                    .ifPresent(name -> po.setTravelerName(Commons.getName(name)));
                                            po.setTelephone(Utils.collection2String(traveler.getTelephone(), Commons::getTelephone));
                                            Utils.getFirstNonNullConsume(traveler.getDocument(), doc -> {
                                                po.setDocId(doc.getDocID());
                                                po.setDocType(Utils.toWrapperLong(doc.getDocType()));
                                            });
                                            //将这里改为了Value
                                            Utils.getFirstNonNullConsume(traveler.getEmail(), e -> po.setEmail(e.getValue()));


                                            Utils.getFirstNonNullConsume(traveler.getAddress(), addr -> {

                                                po.setCityName(addr.getCityName());
                                                Optional.ofNullable(addr.getStateProv())
                                                        .ifPresent(stateProvType -> {
                                                            //此处原来取得是getValue,Excel为准
                                                            po.setStateCode(stateProvType.getStateCode());
                                                        });
                                                po.setPostalCode(addr.getPostalCode());
                                                Optional.ofNullable(addr.getCountryName())
                                                        .ifPresent(n -> po.setCountryName(n.getCode()));
                                                Utils.getFirstNonNullConsume(traveler.getCustLoyalty(), custLoyalty -> {
                                                    po.setMembershipId(custLoyalty.getMembershipID());
                                                    po.setStatus(custLoyalty.getStatus());
                                                    po.setCustomerValue(custLoyalty.getCustomerValue());
                                                    po.setLoyalLevel(custLoyalty.getLoyalLevel());
                                                });
                                            });

                                            TicketingFullInfoType ticketingInfoType = ticketingMap.get(seg.getRPH() + traveler.getTravelerRefNumber().getRPH());
                                            Optional.ofNullable(ticketingInfoType)
                                                    .ifPresent(
                                                            t -> {
                                                                po.setIssuingAgentId(t.getIssuingAgentID());
                                                                po.setPrinted(Utils.boolean2String(t.isPrinted()));
                                                                po.setTicketTimestamp(xmlDate2StringWithShanghaiTimezone(t.getTicketTime()));
                                                                po.setTicketingStatus(t.getTicketingStatus());
                                                                po.setETicketNumber(t.getETicketNumber());
                                                                po.setTicketTimeLimitTimestamp(xmlDate2StringWithShanghaiTimezone(t.getTicketTimeLimit()));
                                                                po.setExpiryDateTimestamp(xmlDate2StringWithShanghaiTimezone(t.getExpiryDateTime()));
                                                            }
                                                    );
                                            result.add(po.clone());
                                        }

                                    }
                                });
                    });
        }

        return result;
    }
}
