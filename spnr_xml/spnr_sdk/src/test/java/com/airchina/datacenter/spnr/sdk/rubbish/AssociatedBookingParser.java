package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_AssociatedBookingPo;
import com.airchina.datacenter.spnr.sdk.entity.AssociatedBookingProductType;
import com.airchina.datacenter.spnr.sdk.entity.AssociatedBookingsType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.utils.Constants;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import org.apache.commons.collections4.CollectionUtils;

import java.util.Optional;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.*;


/**
 * @author wgni
 * @since 2022/7/6
 */
public class AssociatedBookingParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {

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
                            po.setSuperPnrId(context.getSPnrID());
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
                                    t -> t.getRPH()));
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

                            po.seteTicketNumber(Utils.collection2String(product.getFlightTicketing(),
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

                            Optional
                                    .ofNullable(booking.getCustomer())
                                    .map(AssociatedBookingsType.Booking.Customer::getPrimary)
                                    .map(AssociatedBookingsType.Booking.Customer.Primary::getProfile)
                                    .ifPresent(profile -> {
                                        po.setProfileId(profile.getID());
                                        po.setProfileType(profile.getType());
                                    });
                            context.getSPnrAssociatedBookingPos().add(po);
                        });
                    }
                });

    }
}
