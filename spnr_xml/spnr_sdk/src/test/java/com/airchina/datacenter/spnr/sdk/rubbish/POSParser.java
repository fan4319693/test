package com.airchina.datacenter.spnr.sdk.rubbish;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_POSPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;

import java.util.Optional;

import com.airchina.datacenter.spnr.sdk.utils.Utils;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class POSParser {

    public static void process(OJSuperPNR spnr, SPNRContext context) {
        Optional.ofNullable(spnr.getPOS())
                .map(t -> t.getSource())
                //TODO 使用了getFirst, 不知为何
                .map(Utils::getFirstNonNull)
                .ifPresent(source -> {
                    Spnr_POSPo po = new Spnr_POSPo();

                    po.setSuperPnrId(spnr.getSuperPNRID());
                    po.setAirlineVendorId(source.getAirlineVendorID());
                    po.setChannel(source.getChannel());
                    po.setIsoCountry(source.getISOCountry());
                    po.setIsoCurrency(source.getISOCurrency());
                    po.setLocale(source.getLocale());
                    po.setEntryPoint(source.getEntryPoint());
                    Utils.consumeOrNull(source.getRequestorID(), r -> {
                        po.setRequestorId(r.getID());

                        Utils.consumeOrNull(r.getCompanyName(), c -> {
                            po.setCompanyShortName(c.getCompanyShortName());
                            po.setCompanyNameCode(c.getCode());
                            po.setCompanyDivision(c.getDivision());
                        });
                    });

                    context.setSPnrPosPo(po);
                });
    }

    /*
    public static void process(OJSuperPNR spnr, SPNRContext context) {
        Spnr_POSPo po = new Spnr_POSPo();
        po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
        Optional
                .of(spnr.getPOS())
                .map(POSType::getSource)
                .map(Utils::getFirstOrNull)
                .ifPresent(source -> {
                    po.setSuperPnrId(String.valueOf(spnr.getSuperPNRID()));
                    po.setAirlineVendorId(source.getAirlineVendorID());
                    po.setChannel(source.getChannel());
                    po.setIsoCountry(source.getISOCountry());
                    po.setIsoCurrency(source.getISOCurrency());
                    po.setLocale(source.getLocale());
                    po.setEntryPoint(source.getEntryPoint());
                    Optional
                            .of(source)
                            .map(SourceType::getRequestorID)
                            .ifPresent(r -> {
                                po.setRequestorId(r.getID());
                                Optional.ofNullable(r.getCompanyName()).ifPresent(c -> {
                                    po.setCompanyShortName(c.getCompanyShortName());
                                    po.setCompanyNameCode(c.getCode());
                                });
                            });
                    context.setSPnrPosPo(po);
                });

    }
    */
}
