package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_POSPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPOSParser </p>
 * <p>Description: Spnr_POSPo 的转换器 </p>
 * <p>Sample:  new SpnrPOSParser(new FieldsArrayStrategy(Spnr_POSPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPOSParser extends AbstractParser {

    public SpnrPOSParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
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

                    result.add(po);
                });

        return result;
    }
}