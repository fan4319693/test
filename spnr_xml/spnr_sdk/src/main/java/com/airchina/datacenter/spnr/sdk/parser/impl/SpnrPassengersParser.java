package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_PassengersPo;
import com.airchina.datacenter.spnr.sdk.entity.OJCustomerPrimaryAdditionalType;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrPassengersParser </p>
 * <p>Description: Spnr_PassengersPo 的转换器 </p>
 * <p>Sample:  new SpnrPassengersParser(new FieldsArrayStrategy(Spnr_PassengersPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrPassengersParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrPassengersParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_PassengersPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        Optional.ofNullable(spnr.getCustomer())
                .filter(CollectionUtils::isNotEmpty)
                .ifPresent(cs -> {
                    for (OJCustomerPrimaryAdditionalType customer : cs) {
                        List<OJCustomerPrimaryAdditionalType.Additional> additionals = customer.getAdditional();
                        if (CollectionUtils.isEmpty(additionals)) {
                            continue;
                        }
                        additionals.forEach(additional -> {
                            Spnr_PassengersPo po = new Spnr_PassengersPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setAuditId(Utils.toWrapperLong(customer.getAuditID()));
                            po.setCustomerId(Utils.toWrapperLong(customer.getCustomerID()));
                            po.setSeqNo(Utils.toWrapperLong(customer.getSeqNo()));

                            po.setAge(Utils.number2String(additional.getAge()));
                            po.setBirthDate(xmlDate2StringWithShanghaiTimezone(additional.getBirthDate()));
                            po.setOjSuperPnrRph(Utils.toWrapperLong((additional.getOJSuperPNRRPH())));
                            po.setPassengerTypeCode(additional.getPassengerTypeCode());

                            Utils.consumeOrNull(additional.getPersonName(), pName -> {
                                po.setTravelerName(Commons.getName(pName));
                                //拼接称谓, 如: Mr,Mrs
                                po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                            });

                            Utils.getFirstNonNullConsume(additional.getTelephone(), t -> {
                                po.setTelephone(Commons.getTelephone(t));
                            });

                            Utils.getFirstNonNullConsume(additional.getCitizenCountryName(), t -> {
                                po.setCitizenCountryCode(t.getCode());
                            });

                            Utils.getFirstNonNullConsume(additional.getDocument(), d -> {
                                po.setDocId(d.getDocID());
                                po.setDocType(Utils.toWrapperLong(d.getDocType()));
                                po.setDocNationality(d.getDocHolderNationality());
                                po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(d.getExpireDate()));
                            });

                            result.add(po);
                        });
                    }
                });

        return result;
    }
}
