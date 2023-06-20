package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_TravelerPo;
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
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApTravelerParser </p>
 * <p>Description: MP_AP_TravelerPo 的转换器 </p>
 * <p>Sample:  new MpApTravelerParser(new FieldsArrayStrategy(MP_AP_TravelerPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApTravelerParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApTravelerParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_TravelerPo
     * Parameter:
     *  @param spnr: 待解析的xml的OJSuperPNR节点, 不能为null
     * Return: 解析的实体对象集合, 不会为null, 可能为空集合
     * Throws: 无
     */
    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            ProductBase.AncillaryProduct ancillaryProduct = mp.getAncillaryProduct();
            if (ancillaryProduct == null) {
                continue;
            }
            TravelerInfoType travelerInfo = ancillaryProduct.getTravelerInfo();
            if (travelerInfo == null) {
                continue;
            }

            Optional.ofNullable(travelerInfo.getAirTraveler())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(travelerList -> {
                        travelerList.forEach(traveler -> {
                            MP_AP_TravelerPo po = new MP_AP_TravelerPo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
                            po.setOjSuperPnrRph(Utils.toWrapperLong(traveler.getOJSuperPNRRPH()));
                            Optional.ofNullable(traveler.getTravelerRefNumber())
                                    .ifPresent(t -> {
                                        po.setTravelerRefNumberRph(Utils.toWrapperLong(t.getRPH()));
                                    });

                            po.setPassengerTypeCode(traveler.getPassengerTypeCode());
                            po.setAge(traveler.getAge());
                            po.setGender(traveler.getGender());
                            po.setBirthDate(xmlDate2StringWithShanghaiTimezone(traveler.getBirthDate()));
                            po.setPtcsubType(traveler.getPTCSubType());
                            po.setVerifyAdtAccompanierAge(Utils.boolean2String(traveler.isVerifyADTAccompanierAge()));
                            po.setGroupInd(Utils.boolean2String(traveler.isGroupInd()));
                            Optional.ofNullable(traveler.getPersonName())
                                    .ifPresent(pName -> {
                                        po.setTravelerName(Commons.getName(pName));
                                        po.setNamePrefix(Utils.collection2String(pName.getNamePrefix()));
                                    });

                            Optional.ofNullable(traveler.getTelephone())
                                    .ifPresent(list -> {
                                        po.setTelephone(Utils.collection2String(list, t -> Commons.getTelephone(t)));
                                    });

                            Utils.getFirstNonNullConsume(traveler.getDocument(), t -> {
                                po.setDocId(t.getDocID());
                                po.setDocType(Utils.toWrapperLong(t.getDocType()));
                                po.setDocNationality(t.getDocHolderNationality());
                                po.setDocExpireDate(xmlDate2StringWithShanghaiTimezone(t.getExpireDate()));
                                po.setDocBirthCountry(t.getBirthCountry());
                                po.setDocIssueCountry(t.getDocIssueCountry());
                                po.setAdditionalDoc(Commons.getAdditionalDoc(t.getAdditionalDocument()));
                            });

                            Optional.ofNullable(Utils.getFirstNonNull(travelerInfo.getAirTraveler()))
                                    .map(t -> t.getAPISInformation())
                                    .ifPresent(t -> {
                                        po.setDocRequired(t.getDocumentationRequired());
                                    });

                            Utils.getFirstNonNullConsume(traveler.getCustLoyalty(), t -> {
                                po.setMembershipId(t.getMembershipID());
                                po.setStatus(t.getStatus());
                                po.setCustomerValue(t.getCustomerValue());
                                po.setLoyalLevel(t.getLoyalLevel());
                                po.setSingleVendorInd(t.getSingleVendorInd());
                            });


                            Utils.getFirstNonNullConsume(traveler.getAddress(), addr -> {
                                po.setCityName(addr.getCityName());
                                Optional.ofNullable(addr.getStateProv())
                                        .ifPresent(stateProvType -> {
                                            //此处原来取得是getValue,Excel为准
                                            po.setStateProv(stateProvType.getValue());
                                        });
                                Optional.ofNullable(addr.getCountryName())
                                        .ifPresent(n -> po.setCountryName(n.getCode()));
                            });

                            result.add(po);
                        });
                    });
        }
        return result;
    }
}
