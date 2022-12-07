package com.airchina.datacenter.spnr.sdk.parse;

import com.airchina.datacenter.spnr.sdk.SPNRContext;
import com.airchina.datacenter.spnr.sdk.dao.entity.Spnr_POSPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.POSType;
import com.airchina.datacenter.spnr.sdk.entity.SourceType;
import java.util.Optional;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * @author wgni
 * @since 2022/7/5
 */
public class POSParser {

    private static final Logger LOG = LoggerFactory.getLogger(POSParser.class);

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
}
