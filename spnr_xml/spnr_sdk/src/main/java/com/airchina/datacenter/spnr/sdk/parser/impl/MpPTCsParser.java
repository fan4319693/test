package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_PtcsPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Commons;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPTCsParser </p>
 * <p>Description: MP_PtcsPo 的转换器 </p>
 * <p>Sample:  new MpPTCsParser(new FieldsArrayStrategy(MP_PtcsPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPTCsParser extends AbstractParser {

    public MpPTCsParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getPTCs())
                    .map(ptcs -> ptcs.getPTC())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(ptcs -> ptcs.forEach(ptc -> {
                        MP_PtcsPo po = new MP_PtcsPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setPtcCode(ptc.getCode());
                        po.setPtcQuantity(Utils.toWrapperLong(ptc.getQuantity()));
                        po.setRphList(Utils.collection2String(ptc.getRPHList()));

                        result.add(po);
                    }));
        }
        return result;
    }
}
