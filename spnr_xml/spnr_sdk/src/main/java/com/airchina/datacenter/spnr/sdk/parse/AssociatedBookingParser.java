package com.airchina.datacenter.spnr.sdk.parse;

import static com.airchina.datacenter.spnr.sdk.DateHelper.xmlDate2String;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_AssociatedBookingPo;
import com.airchina.datacenter.spnr.sdk.entity.AssociatedBookingsType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import java.util.Optional;
import java.util.stream.Collectors;
import org.apache.commons.collections4.CollectionUtils;

/**
 * @author wgni
 * @since 2022/7/6
 */
public class AssociatedBookingParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        AssociatedBookingsType associatedBookings = spnr.getAssociatedBookings();
        if (associatedBookings == null) {
            return;
        }
        if (CollectionUtils.isEmpty(associatedBookings.getBooking())) {
            return;
        }
        associatedBookings.getBooking().forEach(booking -> {
            if (CollectionUtils.isEmpty(booking.getProduct())) {
                Spnr_AssociatedBookingPo po = new Spnr_AssociatedBookingPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setAssociateSuperPnrId(String.valueOf(booking.getSuperPNRID()));
                po.setBookingStatus(booking.getBookingStatus());
                po.setAssociationType(booking.getAssociationType());
                context.getSPnrAssociatedBookingPos().add(po);
                return;
            }
            booking.getProduct().forEach(product -> {
                Spnr_AssociatedBookingPo po = new Spnr_AssociatedBookingPo();
                po.setSuperPnrId(context.getSPnrID());
                po.setAssociateSuperPnrId(String.valueOf(booking.getSuperPNRID()));
                po.setBookingStatus(booking.getBookingStatus());
                po.setAssociationType(booking.getAssociationType());
                po.setHistoryId(String.valueOf(product.getHistoryID()));
                po.setProductId(String.valueOf(product.getProductID()));
                po.setRefundApplyId(String.valueOf(product.getRefundApplicationID()));
                po.setStatus(product.getStatus());
                po.setType(product.getType());

                po.setReshopId(product.getReshopID());
                po.setRefundApplyTime(xmlDate2String(product.getRefundApplicationDateTime()));
                po.setRph(Utils.streamNullable(product.getFlightSegment()).map(f->String.valueOf(f.getRPH())).collect(Collectors.joining(",")));
                po.setDepartureDate(Utils.streamNullable(product.getFlightSegment()).map(f->xmlDate2String(f.getDepartureDate())).collect(Collectors.joining(",")));
                po.setFlightNumber(Utils.streamNullable(product.getFlightSegment()).map(f->String.valueOf(f.getFlightNumber())).collect(Collectors.joining(",")));
                po.setOriginDestination(Utils.streamNullable(product.getFlightSegment()).map(f->String.valueOf(f.getOriginDestination())).collect(Collectors.joining(",")));
                po.setFlightSegmentRph(Utils.streamNullable(product.getFlightTicketing()).map(t->String.valueOf(t.getFlightSegmentRPH())).collect(Collectors.joining(",")));
                po.setTicketingStatus(Utils.streamNullable(product.getFlightTicketing()).map(t->t.getTicketingStatus()).collect(Collectors.joining(",")));
                po.seteTicketNumber(Utils.streamNullable(product.getFlightTicketing()).map(t->String.valueOf(t.getETicketNumber())).collect(Collectors.joining(",")));
                po.setTravelerRph(Utils.streamNullable(product.getFlightTicketing()).map(t->String.valueOf(t.getTravelerRPH())).collect(Collectors.joining(",")));
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
        });
    }
}
