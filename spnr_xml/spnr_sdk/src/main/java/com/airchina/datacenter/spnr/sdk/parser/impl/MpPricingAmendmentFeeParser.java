package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_Pricing_AmendmentFeePo;
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

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpPricingAmendmentFeeParser </p>
 * <p>Description: MP_Pricing_AmendmentFeePo 的转换器 </p>
 * <p>Sample:  new MpPricingAmendmentFeeParser(new FieldsArrayStrategy(MP_Pricing_AmendmentFeePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpPricingAmendmentFeeParser extends AbstractParser {

    public MpPricingAmendmentFeeParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional
                    .ofNullable(mp.getPricing())
                    .map(p -> p.getAmendmentFees())
                    .map(a -> a.getAmendmentFee())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(fees -> fees.forEach(fee -> {
                        MP_Pricing_AmendmentFeePo po = new MP_Pricing_AmendmentFeePo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setAmt(Utils.number2String(fee.getAmount()));
                        po.setCurrencyCode(fee.getCurrencyCode());
                        po.setDate(xmlDate2StringWithShanghaiTimezone(fee.getDate()));

                        result.add(po);
                    }));
        }
        return result;
    }
}
