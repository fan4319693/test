package com.airchina.datacenter.spnr.sdk.parser.impl;

import com.airchina.datacenter.spnr.sdk.dao.pojo.Spnr_MPPo;
import com.airchina.datacenter.spnr.sdk.entity.AirReservationType;
import com.airchina.datacenter.spnr.sdk.entity.ModularProductType;
import com.airchina.datacenter.spnr.sdk.entity.OJSuperPNR;
import com.airchina.datacenter.spnr.sdk.parser.AbstractParser;
import com.airchina.datacenter.spnr.sdk.serde.SerdeStrategy;
import com.airchina.datacenter.spnr.sdk.utils.Utils;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;

import java.util.List;
import java.util.Optional;
import java.util.stream.Collectors;

import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithShanghaiTimezone;
import static com.airchina.datacenter.spnr.sdk.utils.Utils.xmlDate2StringWithUtcTimezone;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.parser.impl.SpnrMpParser </p>
 * <p>Description: Spnr_MPPo 的转换器 </p>
 * <p>Sample:  new SpnrMpParser(new FieldsArrayStrategy(Spnr_MPPo.class)) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class SpnrMpParser extends AbstractParser {

    public SpnrMpParser(SerdeStrategy strategy) {
        super(strategy);
    }

    @Override
    public List<? extends Object> parse(OJSuperPNR spnr) {
        List<Object> result = Lists.newLinkedList();
        for (ModularProductType mp : spnr.getModularProduct()) {
            Spnr_MPPo mpPo = new Spnr_MPPo();

            mpPo.setSuperPnrId(spnr.getSuperPNRID());
            mpPo.setSearchId(mp.getSearchID());
            mpPo.setProductNumber(Utils.toWrapperLong(mp.getProductNumber()));
            mpPo.setBookedWith(Utils.collection2String(mp.getBookedWith()));
            mpPo.setBookingChannel(mp.getBookingChannel());
            mpPo.setBookingDate(xmlDate2StringWithShanghaiTimezone(mp.getBookingDate()));
            mpPo.setBookingStatus(mp.getBookingStatus());
            mpPo.setCancellationDate(xmlDate2StringWithShanghaiTimezone(mp.getCancellationDate()));
            mpPo.setEndDate(xmlDate2StringWithUtcTimezone(mp.getEndDate()));
            mpPo.setHistoric(Utils.boolean2String(mp.isHistoric()));
            mpPo.setHistoricId(Utils.toWrapperLong(mp.getHistoryID()));
            mpPo.setLastModified(xmlDate2StringWithShanghaiTimezone(mp.getLastModified()));
            mpPo.setMasterProductNumber(Utils.toWrapperLong(mp.getMasterProductNumber()));
            mpPo.setPrimaryLangId(mp.getPrimaryLangID());
            mpPo.setProductId(Utils.toWrapperLong(mp.getProductID()));
            mpPo.setProductType(mp.getProductType());
            mpPo.setProductTypeCode(mp.getProductTypeCode());
            mpPo.setStartDate(xmlDate2StringWithUtcTimezone(mp.getStartDate()));
            mpPo.setSynchronised(Utils.boolean2String(mp.isSynchronised()));
            mpPo.setTsbookingStatus(Utils.applyOrNull(mp.getTSBookingStatus(), t -> t.value()));
            mpPo.setLiveId(Utils.toWrapperLong(mp.getLiveID()));
            mpPo.setRefundable(Utils.boolean2String(mp.isRefundable()));
            mpPo.setReplacedBy(Utils.collection2String(mp.getReplacedBy()));

            Optional.ofNullable(mp.getSource())
                    .ifPresent(source -> {
                        mpPo.setAgentDutyCode(source.getAgentDutyCode());
                        mpPo.setErspUserId(source.getERSPUserID());
                        mpPo.setTerminalId(source.getTerminalID());
                        mpPo.setChannel(source.getChannel());

                        Optional.ofNullable(source.getRequestorID())
                                .ifPresent(t -> {
                                    mpPo.setRequestorId(t.getID());
                                    Optional.ofNullable(t.getCompanyName())
                                            .ifPresent(e -> {
                                                mpPo.setCompanyCode(e.getCode());
                                                mpPo.setCompanyCodeContext(e.getCodeContext());
                                                mpPo.setCompanyDivision(e.getDivision());
                                            });
                                });

                        Optional.ofNullable(source.getConfig())
                                .ifPresent(sourceConfigType -> {
                                    mpPo.setOfficecode(sourceConfigType.getOfficeCode());
                                    mpPo.setIataNumber(sourceConfigType.getIATANumber());
                                });
                    });

            Optional
                    .ofNullable(mp.getAir())
                    .map(a -> Utils.getFirstNonNull(a.getBookingReferenceID()))
                    .map(r -> r.getCompanyName())
                    .ifPresent(t -> {
                        mpPo.setCompanyName(t.getCode());
                    });

            //TODO 这里抄的原代码
            Optional
                    .ofNullable(mp.getAir())
                    .map(a -> a.getSupplierNotes())
                    .filter(CollectionUtils::isNotEmpty)
                    .ifPresent(sNotes ->
                            mpPo.setSupplierNotes(
                                    sNotes.stream()
                                            .flatMap(supplierNotes -> supplierNotes.getNote().stream())
                                            .map(AirReservationType.SupplierNotes.Note::getType)
                                            .collect(Collectors.joining("@"))
                            )
                    );

            mpPo.setServiceCode(mp.getServiceCode());
            result.add(mpPo);
        }
        return result;
    }
}
