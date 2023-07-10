package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirTravelerInfoPo;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.entity.ProductBase;
import com.airchina.datacenter.spnr.sdk.entity.TravelerInfoType;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpAirTravelerInfoParser </p>
 * <p>Description: MP_AirTravelerInfoPo 的转换器 </p>
 * <p>Sample:  new MpAirTravelerInfoParser(new FieldsArrayStrategy(MP_AirTravelerInfoPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpAirTravelerInfoParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpAirTravelerInfoParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AirTravelerInfoPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.Air air = mp.getAir();
            if (air == null) {
                continue;
            }


            String pnr = Commons.getMpPnr(mp);
            Optional.ofNullable(air.getTravelerInfo())
                    .map(TravelerInfoType::getAirTraveler)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(travelerList -> {
                        travelerList.forEach(airTraveler -> {
                            MP_AirTravelerInfoPo po = new MP_AirTravelerInfoPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setPnr(pnr);
                            po.setOjSuperPnrRph(Utils.toWrapperLong(airTraveler.getOJSuperPNRRPH()));
                            Utils.consumeOrNull(airTraveler.getTravelerRefNumber(), t -> {
                                po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH()));
                            });
                            po.setPassengerTypeCode(airTraveler.getPassengerTypeCode());
                            po.setAge(airTraveler.getAge());
                            po.setGender(airTraveler.getGender());
                            po.setBirthDate(xmlDate2StringWithShanghaiTimezone(airTraveler.getBirthDate()));
                            po.setPtcsubType(airTraveler.getPTCSubType());
                            po.setVerifyAdtAccompanierAge(Utils.boolean2String(airTraveler.isVerifyADTAccompanierAge()));
                            po.setGroupInd(Utils.boolean2String(airTraveler.isGroupInd()));

                            Utils.consumeOrNull(airTraveler.getPersonName(), pName -> {
                                po.setTravelerName(Commons.getName(pName));
                                po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                            });

                            po.setTelephone(Utils.collection2String(airTraveler.getTelephone(), Commons::getTelephone));

                            Utils.getFirstNonNullConsume(airTraveler.getDocument(), doc -> {
                                po.setDocId(doc.getDocID());
                                po.setDocType(doc.getDocType() == null ? "" : doc.getDocType());
                                po.setDocNationality(doc.getDocHolderNationality());
                                po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(doc.getExpireDate()));
                                po.setBirthCountry(doc.getBirthCountry());
                                po.setDocIssueCountry(doc.getDocIssueCountry());
                                po.setAdditionalDoc(Commons.getAdditionalDoc(doc.getAdditionalDocument()));
                            });
                            //此处可疑
                            Optional.ofNullable(airTraveler.getAPISInformation())
                                    .ifPresent(t -> po.setDocRequired(t.getDocumentationRequired()));

                            //将这里改为了Value
                            Utils.getFirstNonNullConsume(airTraveler.getEmail(), e -> po.setEmail(e.getValue()));

                            Utils.getFirstNonNullConsume(airTraveler.getAddress(), addr -> {
                                po.setAddressFormattedInd(Utils.boolean2String(addr.isFormattedInd()));
                                Utils.getFirstNonNullConsume(addr.getAddressLine(), t -> {
                                    po.setAddressLineindex(Utils.number2String(t.getIndex()));
                                });
                                po.setCityName(addr.getCityName());
                                Optional.ofNullable(addr.getStateProv())
                                        .ifPresent(stateProvType -> {
                                            //此处原来取得是getValue,Excel为准
                                            po.setStateProv(stateProvType.getStateCode());
                                        });
                                po.setPostalCode(addr.getPostalCode());
                                Optional.ofNullable(addr.getCountryName())
                                        .ifPresent(n -> po.setCountryName(n.getCode()));
                            });

                            Utils.getFirstNonNullConsume(airTraveler.getCustLoyalty(), custLoyalty -> {
                                po.setMembershipId(custLoyalty.getMembershipID());
                                po.setStatus(custLoyalty.getStatus());
                                po.setCustomerValue(custLoyalty.getCustomerValue());
                                po.setLoyalLevel(custLoyalty.getLoyalLevel());
                                po.setSignupDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getSignupDate()));
                                po.setEffectiveDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getEffectiveDate()));
                                po.setExpireDate(xmlDate2StringWithShanghaiTimezone(custLoyalty.getExpireDate()));
                                po.setSingleVendorInd(custLoyalty.getSingleVendorInd());
                            });
                            result.add(po);
                        });
                    });
        }

        return result;
    }
}
