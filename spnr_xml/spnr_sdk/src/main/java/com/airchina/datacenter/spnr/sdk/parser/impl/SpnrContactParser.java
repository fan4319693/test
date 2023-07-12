package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_ContactPo;
import com.airchina.datacenter.spnr.sdk.entity.*;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrContactParser </p>
 * <p>Description: Spnr_ContactPo 的转换器 </p>
 * <p>Sample:  new SpnrContactParser(new FieldsArrayStrategy(Spnr_ContactPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrContactParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public SpnrContactParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为Spnr_ContactPo
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
                .ifPresent(customers -> {
                    customers.forEach(c -> {
                        OJCustomerPrimaryAdditionalType.Primary primary = c.getPrimary();
                        Optional.ofNullable(primary)
                                .ifPresent(p -> {
                                    Spnr_ContactPo po = new Spnr_ContactPo();

                                    po.setSuperPnrId(spnr.getSuperPNRID());
                                    po.setAuditId(Utils.toWrapperLong(c.getAuditID()));
                                    po.setCustomerId(Utils.toWrapperLong(c.getCustomerID()));
                                    po.setSeqNo(Utils.toWrapperLong(c.getSeqNo()));
                                    po.setHistoric(Utils.boolean2String(c.isHistoric()));
                                    po.setAccountType(p.getAccountType());
                                    po.setOjSuperPnrRph(Utils.toWrapperLong(p.getOJSuperPNRRPH()));
                                    po.setPassengerTypeCode(p.getPassengerTypeCode());
                                    po.setName(Commons.getName(p.getPersonName()));
                                    Utils.getFirstNonNullConsume(p.getTelephone(), t -> {
                                        po.setTelephone(Commons.getTelephone(t));
                                    });

                                    po.setEmail(Utils.getFirstNonNullApply(p.getEmail(), EmailType::getValue));

                                    Utils.getFirstNonNullConsume(p.getAddress(), t -> {
                                        po.setAddressFormattedInd(Utils.boolean2String(t.isFormattedInd()));
                                        Integer index = Utils.getFirstNonNullApply(t.getAddressLine(), AddressType.AddressLine::getIndex);
                                        po.setAddressLineindex(Utils.number2String(index));
                                        po.setCityName(t.getCityName());
                                        po.setPostalCode(t.getPostalCode());
                                        Optional.ofNullable(t.getCountryName())
                                                .ifPresent(n -> {
                                                    po.setCountryName(n.getCode());
                                                });
                                    });

                                    Utils.getFirstNonNullConsume(p.getContactPerson(), person -> {
                                        Utils.consumeOrNull(person.getPersonName(), name -> {
                                            po.setContactname(Commons.getName(name));
                                            po.setContactPrefix(Utils.collection2String(name.getNamePrefix()));
                                        });
                                        //TODO 联系人手机号使用了第一个联系人的第一个手机号
                                        Utils.getFirstNonNullConsume(person.getTelephone(), t -> {
                                            po.setContactTel(Commons.getContactTelephone(t));
                                        });

                                        Utils.getFirstNonNullConsume(person.getEmail(), t -> {
                                            po.setContactEmail(t.getValue());
                                        });

                                        Utils.getFirstNonNullConsume(person.getDocument(), t -> {
                                            po.setContactDocId(t.getDocID());
                                            po.setContactDocType(Utils.toWrapperLong(t.getDocType()));
                                            po.setContactDocNationality(t.getDocHolderNationality());
                                            po.setContactDocExpireDate(xmlDate2StringWithShanghaiTimezone(t.getExpireDate()));
                                        });
                                    });

                                    Utils.consumeOrNull(p.getUniqueID(), t -> {
                                        po.setUniqueId(t.getID());
                                        po.setUniqueIdContext(t.getIDContext());

                                    });
                                    //后加的字段
                                    po.setMembershipId(Utils.collection2String(p.getCustLoyalty(), CustomerType.CustLoyalty::getMembershipID));

                                    result.add(po);
                                });
                    });
                });
        return result;
    }
}
