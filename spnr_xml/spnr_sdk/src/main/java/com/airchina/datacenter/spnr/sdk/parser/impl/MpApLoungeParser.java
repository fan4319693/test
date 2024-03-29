package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_LoungePo;
import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.MpApLoungeParser </p>
 * <p>Description: MP_AP_LoungePo 的转换器 </p>
 * <p>Sample:  new MpApLoungeParser(new FieldsArrayStrategy(MP_AP_LoungePo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MpApLoungeParser extends AbstractParser {

    /**
     * Description: 有参构造器
     * Parameter:
     *  @param strategy: 实体对象解析策略
     * Throws: 无
     */
    public MpApLoungeParser(SerdeStrategy strategy) {
        super(strategy);
    }

    /**
     * Description: 将xml的OJSuperPNR解析为MP_AP_LoungePo
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

            AirAncillaryLoungeProductType lounge = ancillaryProduct.getLounge();
            if (lounge == null) {
                continue;
            }
            Optional.ofNullable(lounge.getRooms())
                    .map(AirAncillaryLoungeProductType.Rooms::getRoom)
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(roomList -> {
                        roomList.forEach(room -> {
                            MP_AP_LoungePo po = new MP_AP_LoungePo();

                            po.setSuperPnrId(spnr.getSuperPNRID());
                            po.setSearchId(mp.getSearchID());
                            po.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));

                            Utils.consumeOrNull(lounge.getCheckInTime(), t -> {
                                po.setCheckinOffsetDropTime(t.getOffsetDropTime());
                                po.setCheckinOffsetTimeUnit(t.getOffsetTimeUnit());
                                po.setCheckinOffsetUnitMultiplier(Utils.number2String(t.getOffsetUnitMultiplier()));
                            });

                            po.setAreaSubType(room.getAreaSubType());
                            po.setAreaType(room.getAreaType());
                            po.setCapacity(Utils.toWrapperLong(room.getCapacity()));
                            po.setRoomCode(room.getCode());

                            Optional.ofNullable(room.getOpenTimes())
                                    .map(AirAncillaryLoungeRoomType.OpenTimes::getOpenTime)
                                    .ifPresent(o -> {
                                        po.setRoomOpentimeLanguage(o.getLanguage());
                                        po.setDescriptiveText(o.getDescriptiveText());
                                    });

                            Utils.consumeOrNull(room.getGates(), g -> po.setGate(
                                    Utils.collection2String(g.getGate()))
                            );

                            Utils.consumeOrNull(room.getContent(), content -> {
                                po.setRoomLanguage(content.getLanguage());
                                po.setDisplayName(content.getDisplayName());
                                po.setAirportName(content.getAirportName());
                                po.setShortContent(content.getShortContent());
                                po.setLocationDescription(content.getLocationDescription());
                                po.setOfficialName(content.getOfficialName());
                                po.setImageUrl(Utils.collection2String(content.getImage(), AncillaryImage::getImageURL)
                                );
                            });

                            result.add(po);
                        });
                    });
        }
        return result;
    }
}
