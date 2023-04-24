package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_ModifyTypesPo;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpModifyTypesParser </p>
 * <p>Description: MP_ModifyTypesPo 的转换器 </p>
 * <p>Sample:  new MpModifyTypesParser(new FieldsArrayStrategy(MP_ModifyTypesPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpModifyTypesParser extends AbstractParser {

    public MpModifyTypesParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Optional.ofNullable(mp.getModifyTypes())
                    .map(modifyTypes -> modifyTypes.getModifyType())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(mType -> mType.forEach(modifyType -> {
                        MP_ModifyTypesPo po = new MP_ModifyTypesPo();

                        po.setSuperPnrId(spnr.getSuperPNRID());
                        po.setSearchId(mp.getSearchID());
                        po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                        po.setPnr(Commons.getMpPnr(mp));
                        po.setAuditId(Utils.toWrapperLong(modifyType.getAuditID()));
                        po.setOriginalHistoryId(Utils.number2String(modifyType.getOriginalHistoryID()));
                        po.setRph(Utils.toWrapperLong(modifyType.getRPH()));
                        po.setType(modifyType.getType());
                        po.setFreeDateChange(modifyType.getFreeDateChange());
                        po.setOldMpNum(Utils.toWrapperLong(modifyType.getOldMPNum()));
                        po.setSplitRequired(modifyType.getSplitRequired());
                        po.setNeedCancel(Utils.boolean2String(modifyType.isNeedCancel()));
                        po.setOldPnr(modifyType.getOldPNR());
                        po.setReshopId(modifyType.getReshopID());

                        result.add(po);
                    }));
        }

        return result;
    }
}
