package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_POSPo;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.POSType;
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

    /**
     * Description: 有参构造器
     * Parameter:
     *
     * @param strategy: 实体对象解析策略
     *                  Throws: 无
     */
    public SpnrPOSParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_POSPo
     * Parameter:
     *
     * @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     *              Return: 解析的实体对象集合, 不会为null, 可能为空集合
     *              Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getPOS())
                .map(POSType::getSource)
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

                    Optional.ofNullable(spnr.getPOS())
                            .map(t -> t.getAgent())
                            .ifPresent(a -> {
                                //2023-06-21添加
                                po.setCallSeatUid(a.getAgency());
                                po.setCallSeatCid(a.getID());
                                po.setCallSkillTeam(a.getFunctionalGroup());
                                po.setCallAdsTeam(a.getAdministrativeGroup());
                            });

                    result.add(po);
                });

        return result;
    }
}
