package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AssociatedBookingPo;
import com.airchina.datacenter.spnr.sdk.entity.AssociatedBookingProductType;
import com.airchina.datacenter.spnr.sdk.entity.AssociatedBookingsType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;
import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithUtcTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrAssociatedBookingParser </p>
 * <p>Description: Spnr_AssociatedBookingPo 的转换器 </p>
 * <p>Sample:  new SpnrAssociatedBookingParser(new FieldsArrayStrategy(Spnr_AssociatedBookingPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrAssociatedBookingParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrAssociatedBookingParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_AssociatedBookingPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getAssociatedBookings())
                .map(AssociatedBookingsType::getBooking)
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(bookings -> {
                    for (AssociatedBookingsType.Booking booking : bookings) {
                        if (CollectionUtils.isEmpty(booking.getProduct())) {
                            continue;
                        }
                        booking.getProduct().forEach(product -> {
                            Spnr_AssociatedBookingPo po = new Spnr_AssociatedBookingPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setAssociateSuperPnrId(booking.getSuperPNRID());
                            po.setBookingStatus(booking.getBookingStatus());
                            po.setAssociationType(booking.getAssociationType());
                            po.setHistoryId(Utils.toWrapperLong(product.getHistoryID()));
                            po.setProductId(Utils.toWrapperLong(product.getProductID()));
                            po.setRefundApplyId(product.getRefundApplicationID());
                            po.setStatus(product.getStatus());
                            po.setType(product.getType());
                            po.setReshopId(product.getReshopID());
                            po.setRefundApplyTime(xmlDate2StringWithShanghaiTimezone(product.getRefundApplicationDateTime()));

                            po.setRph(Utils.collection2String(product.getFlightSegment(),
                                    AssociatedBookingProductType.FlightSegment::getRPH));
                            po.setDepartureDate(Utils.collection2String(product.getFlightSegment(),
                                    t -> xmlDate2StringWithUtcTimezone(t.getDepartureDate())
                            ));
                            po.setFlightNumber(Utils.collection2String(product.getFlightSegment(),
                                    AssociatedBookingProductType.FlightSegment::getFlightNumber));
                            po.setOriginDestination(Utils.collection2String(product.getFlightSegment(),
                                    AssociatedBookingProductType.FlightSegment::getOriginDestination));

                            //TODO 原来将List<String>转化为String,格式如: [1,2,3],[4,5,6],[7,8,9]
//                            po.setFlightSegmentRph(Utils.collection2String(product.getFlightTicketing(),
//                                    t -> String.valueOf(t.getFlightSegmentRPH()))
//                            );
                            //范帅将其改为外层竖线分隔,内层逗号分隔,例如: 1,2,3|4,5,6|7,8,9
                            po.setFlightSegmentRph(Utils.collection2String(product.getFlightTicketing(),
                                    t -> Utils.collection2String(t.getFlightSegmentRPH()),
                                    Constants.JoinByPipeNull2Empty));

                            po.setTicketingStatus(Utils.collection2String(product.getFlightTicketing(),
                                    AssociatedBookingProductType.FlightTicketing::getTicketingStatus));

                            po.setETicketNumber(Utils.collection2String(product.getFlightTicketing(),
                                    AssociatedBookingProductType.FlightTicketing::getETicketNumber));

                            //TODO 原来将List<String>转化为String,格式如: [1,2,3],[4,5,6],[7,8,9]
                            //范帅将其改为外层竖线分隔,内层逗号分隔,例如: 1,2,3|4,5,6|7,8,9
//                            po.setTravelerRph(Utils.collection2String(product.getFlightTicketing(),
//                                    t -> String.valueOf(t.getTravelerRPH()))
//                            );
                            po.setTravelerRph(Utils.collection2String(product.getFlightTicketing(),
                                    t -> Utils.collection2String(t.getTravelerRPH()),
                                    Constants.JoinByPipeNull2Empty)
                            );

                            Optional.ofNullable(booking.getCustomer())
                                    .map(AssociatedBookingsType.Booking.Customer::getPrimary)
                                    .map(AssociatedBookingsType.Booking.Customer.Primary::getProfile)
                                    .ifPresent(profile -> {
                                        po.setProfileId(profile.getID());
                                        po.setProfileType(profile.getType());
                                    });
                            result.add(po);
                        });
                    }
                });

        return result;
    }
}
