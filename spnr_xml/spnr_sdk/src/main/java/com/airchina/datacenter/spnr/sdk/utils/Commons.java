package com.airchina.datacenter.spnr.sdk.utils;

import com.airchina.datacenter.spnr.sdk.entity.*;
import com.airchina.datacenter.spnr.sdk.parser.bean.AirMetaInfo;
import com.alibaba.fastjson.JSONArray;
import com.alibaba.fastjson.JSONObject;
import com.google.common.base.Strings;
import com.google.common.collect.Lists;
import org.apache.commons.collections4.CollectionUtils;
import org.apache.commons.lang3.StringUtils;

import java.util.ArrayList;
import java.util.List;
import java.util.Optional;
import java.util.function.Function;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.utils.Commons </p>
 * <p>Description: 本类封装了公共的,固定处理格式的,业务相关的逻辑 </p>
 * <p>Sample: Commons.getName(pName) </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */public class Commons {

    //*********************************公共业务处理************************************

    /**
     * Description: 将Surname、GivenName进行合并
     * Parameter:
     *  @param pName: xml的PersonNameType节点, 不能为null
     * Return: Surname GivenName,不存在GivenName时,只存储Surname
     * Throws: 无
     */
    public static String getName(PersonNameType pName) {
        String surName = null;
        if (pName.getSurname() != null) {
            surName = pName.getSurname().getValue();
        }
        SimplifiedStringType givenNameType = Utils.getFirstNonNull(pName.getGivenName());
        if (givenNameType == null) {
            return surName;
        } else if (StringUtils.isEmpty(surName)) {
            return givenNameType.getValue();
        } else {
            return surName + Constants.SPACE + givenNameType.getValue();
        }
    }

    /**
     * Description: 获取其他证件
     * Parameter:
     *  @param docs: xml的AdditionalDocument节点集合, 可以为null
     * Return: “DocID,DocType”, 若存在多个用“|”分割
     *          例: 9910913372X,14|9910913372Y,20
     * Throws: 无
     */
    public static String getAdditionalDoc(List<DocumentType.AdditionalDocument> docs) {
        return Utils.collection2String(docs, item -> Strings.nullToEmpty(item.getDocID())
                        + Constants.COMMA + Strings.nullToEmpty(item.getDocType()),
                Constants.JoinByPipeNull2Empty);
    }

    /**
     * Description: 获取联系人电话号码
     * Parameter:
     *  @param telephone: xml的AirTravelerType.Telephone节点, 不能为null
     * Return: RPH|index|PhoneLocationType|PhoneTechType|PhoneUseType|CountryAccessCode-PhoneNumber
     *         例: 0|0|6|1|4|86-13811111111
     * Throws: 无
     */
    public static String getTelephone(AirTravelerType.Telephone telephone) {
        ArrayList<String> list = Lists.newArrayList(
                telephone.getRPH(),
                Utils.number2String(telephone.getIndex()),
                telephone.getPhoneLocationType(),
                telephone.getPhoneTechType(),
                telephone.getPhoneUseType(),
                telephone.getCountryAccessCode()
        );
        String part1 = Utils.collection2String(list, Function.identity(),
                Constants.JoinByPipeNull2Empty);
        String part2 = Strings.nullToEmpty(telephone.getPhoneNumberAttr());
        return part1 + Constants.HYPHEN + part2;
    }

    /**
     * Description: 获取联系人电话号码
     * Parameter:
     *  @param telephone: xml的CustomerType.Telephone节点, 不能为null
     * Return: RPH|index|PhoneLocationType|PhoneTechType|PhoneUseType|CountryAccessCode-PhoneNumber
     *         例: 0|0|6|1|4|86-13811111111
     * Throws: 无
     */
    public static String getTelephone(CustomerType.Telephone telephone) {
        ArrayList<String> list = Lists.newArrayList(
                telephone.getRPH(),
                Utils.number2String(telephone.getIndex()),
                telephone.getPhoneLocationType(),
                telephone.getPhoneTechType(),
                telephone.getPhoneUseType(),
                telephone.getCountryAccessCode()
        );
        String part1 = Utils.collection2String(list, Function.identity(),
                Constants.JoinByPipeNull2Empty);
        String part2 = Strings.nullToEmpty(telephone.getPhoneNumberAttr());
        return part1 + Constants.HYPHEN + part2;
    }

    /**
     * Description: 存储当前账号拥有者的联系电话
     * Parameter:
     *  @param tel: xml的TelephoneInfoType节点, 不能为null
     * Return: PhoneLocationType|PhoneTechType|PhoneUseType|CountryAccessCode-PhoneNumber
     *         例: 6|1|4|86-13811111111
     * Throws: 无
     */
    public static String getContactTelephone(TelephoneInfoType tel) {
        String phoneLocationType = tel.getPhoneLocationType();
        String phoneTechType = tel.getPhoneTechType();
        String phoneUseType = tel.getPhoneUseType();
        String countryAccessCode = tel.getCountryAccessCode();
        String phoneNumberAttr = tel.getPhoneNumberAttr();

        String prefix = Utils.joinString(
                Constants.JoinByPipeNull2Empty,
                //以下为字符串参数
                phoneLocationType,
                phoneTechType,
                phoneUseType,
                countryAccessCode);

        return prefix + Constants.HYPHEN + Strings.nullToEmpty(phoneNumberAttr);
    }

    /**
     * Description: 获取行程单收件人电话
     * Parameter:
     *  @param tel: xml的TelephoneInfoType节点, 不能为null
     * Return: CountryAccessCode-PhoneNumber
     *         例: 86-13644962802
     * Throws: 无
     */
    public static String getRecipientTelephone(TelephoneInfoType tel) {
        return Utils.joinString(Constants.JoinByHyphenNull2Empty,
                tel.getCountryAccessCode(),
                tel.getPhoneNumberAttr());
    }

    /**
     * Description: 获取收件人地址
     * Parameter:
     *  @param addr: xml的AddressInfoType节点, 不能为null
     * Return: CountryName，StateProv，CityName，Area，AddressLine，StreetNmbr
     *         例子: 中国，辽宁省，大连市，甘井子区，XXXXX，12
     * Throws: 无
     */
    public static String getRecipientAddress(AddressInfoType addr) {
        return Utils.joinString(
                Constants.JoinByCommaNull2Empty,
                //以下为字符串参数
                Utils.applyOrNull(addr.getCountryName(), t -> t.getValue()),
                Utils.applyOrNull(addr.getStateProv(), t -> t.getValue()),
                addr.getCityName(),
                addr.getArea(),
                Utils.getFirstNonNullApply(addr.getAddressLine(), t -> t.getValue()),
                Utils.applyOrNull(addr.getStreetNmbr(), a -> a.getValue())
        );
    }

    /**
     * Description: 从BookingReferenceID集合获取pnr号, 不对外开放
     * Parameter:
     *  @param refList: xml的AirReservationType.BookingReferenceID的节点集合, 不能为null
     * Return: pnr号, 可以为null
     * Throws: 无
     */
    private static String deriveRawPnr(List<AirReservationType.BookingReferenceID> refList) {
        if (CollectionUtils.isEmpty(refList)) {
            return null;
        }
        AirReservationType.BookingReferenceID pnr = Utils.getFirstNonNull(refList);
        return pnr != null ? pnr.getID() : null;
    }

    /**
     * Description: 提取pnr号, 先从Air中提取, 没有就从Baggage中提取
     * Parameter:
     *  @param mp: xml的ModularProductType节点, 不能为null
     * Return: pnr号, 可以为null
     * Throws: 无
     */
    public static String getMpPnr(ModularProductType mp) {
        Optional<String> var1 = Optional.ofNullable(mp.getAir())
                .map(air -> air.getBookingReferenceID())
                .map(list -> deriveRawPnr(list))
                .filter(StringUtils::isNotEmpty);

        Optional<String> var2 = Optional.ofNullable(mp.getBaggage())
                .map(b -> b.getAir())
                .map(air -> air.getBookingReferenceID())
                .map(list -> deriveRawPnr(list))
                .filter(StringUtils::isNotEmpty);

        return Utils.coalesce(var1, var2);
    }

    /**
     * Description: 拼接Tax的详细信息
     * Parameter:
     *  @param list: xml的AirTaxType节点集合, 不能为null
     * Return: Amount+CurrencyCode,OriginalAmount+OriginalCurrencyCode,TaxCode, 多个tax之间用“|”分隔
     *         例: 50CNY,50CNT,CN|120CNY,120CNY,YQ
     * Throws: 无
     */
    public static String getTaxDetails(List<AirTaxType> list) {
        return Utils.collection2String(list,
                tax -> Utils.joinString(
                        Constants.JoinByEmptyNull2Empty,
                        //以下为字符串参数
                        Utils.number2String(tax.getAmount()),
                        tax.getCurrencyCode(),
                        Constants.COMMA,
                        Utils.number2String(tax.getOriginalAmount()),
                        tax.getOriginalCurrencyCode(),
                        Constants.COMMA,
                        tax.getTaxCode()
                ), Constants.JoinByPipeNull2Empty
        );
    }

    /**
     * Description: 获取承运航班号
     * Parameter:
     *  @param segment: xml的OriginDestinationOptionType.FlightSegment节点, 不能为null
     * Return: 存储格式，将Code和FlightNumber合并存储
     *         例: code=CA，FlightNumber=1835，存储为CA1835
     * Throws: 无
     */
    public static String getOperatingFlightNo(OriginDestinationOptionType.FlightSegment segment) {
        if (segment.getOperatingAirline() == null) {
            return null;
        }
        return Strings.nullToEmpty(segment.getOperatingAirline().getCode()) +
                Strings.nullToEmpty(segment.getFlightNumber());
    }

    /**
     * Description: 获取航班号
     * Parameter:
     *  @param segment: xml的OriginDestinationOptionType.FlightSegment节点, 不能为null
     * Return: 存储格式，将Code和FlightNumber合并存储
     *         例: code=CA，FlightNumber=1835，存储为CA1835
     * Throws: 无
     */
    public static String getMarketingFlightNo(OriginDestinationOptionType.FlightSegment segment) {
        if (segment.getMarketingAirline() == null) {
            return null;
        }
        return Strings.nullToEmpty(segment.getMarketingAirline().getCode()) +
                Strings.nullToEmpty(segment.getFlightNumber());
    }

    //*********************************合并字段为JsonArray************************************

    /**
     * Description: 获取BookingClassAvails信息
     * Parameter:
     *  @param avails: xml下的BookFlightSegmentType.BookingClassAvails节点, 可以为null
     * Return: JsonArray字符串
     * Throws: 无
     */
    public static String getAvInfoJson(BookFlightSegmentType.BookingClassAvails avails) {
        if (avails == null) {
            return null;
        }
        List<BookFlightSegmentType.BookingClassAvails.BookingClassAvail> availList = avails.getBookingClassAvail();
        if (availList == null) {
            return null;
        }
        JSONArray jsonArray = new JSONArray();
        for (BookFlightSegmentType.BookingClassAvails.BookingClassAvail avail : availList) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("av_rph", avail.getRPH());
            jsonObj.put("av_subclass", avail.getResBookDesigSub());
            jsonObj.put("av_subclass_quantity", avail.getResBookDesigQuantity());
            jsonObj.put("av_subclass_status", avail.getResBookDesigStatusCode());
            jsonArray.add(jsonObj);
        }
        return jsonArray.toString();
    }

    /**
     * Description: 获取退款信息
     * Parameter:
     *  @param refundList: xml的RefundInfoType节点集合, 可以为null
     * Return: JsonArray字符串
     * Throws: 无
     */
    public static String getRefundInfoJson(List<RefundInfoType> refundList) {
        if (refundList == null) {
            return null;
        }
        JSONArray jsonArray = new JSONArray();
        for (RefundInfoType refund : refundList) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("refund_auditId", Utils.number2String(refund.getAuditID()));
            jsonObj.put("refund_historic", Utils.boolean2String(refund.isHistoric()));
            jsonObj.put("refund_id", Utils.number2String(refund.getID()));
            jsonObj.put("refund_status", Utils.applyOrNull(refund.getStatus(), t -> t.value()));
            jsonObj.put("refund_e_refund_number", refund.getERefundNumber());
            jsonArray.add(jsonObj);
        }
        return jsonArray.toString();
    }

    /**
     * Description: 获取Remark下的RefundQualifier信息
     * Parameter:
     *  @param qualifiers: xml下的remark下的RefundQualifiersType节点, 可以为null
     * Return: JsonArray字符串
     * Throws: 无
     */
    public static String getQualifierInfo(RefundQualifiersType qualifiers) {
        if (qualifiers == null) {
            return null;
        }
        List<RefundQualifierType> qualifierList = qualifiers.getRefundQualifier();
        if (qualifierList == null) {
            return null;
        }
        JSONArray jsonArray = new JSONArray();
        for (RefundQualifierType qualifier : qualifierList) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("qualifier_description", qualifier.getQualifierDescription());
            jsonObj.put("qualifier_value", qualifier.getQualifierValue());
            jsonObj.put("flight_segment_rph", Utils.toWrapperLong(qualifier.getFlightSegmentRPH()));
            jsonObj.put("oj_super_pnr_rph", Utils.toWrapperLong(qualifier.getOJSuperPNRRPH()));
            jsonObj.put("e_ticket_number", qualifier.getETicketNumber());

            //qualifierItem的name和value以冒号组成一对, 多对kv用竖线分隔, 例如 k1:v1|k2:v2
            String itemKvs = Utils.collection2String(qualifier.getQualifierItem(), item ->
                            Strings.nullToEmpty(item.getName()) + ":" + Strings.nullToEmpty(item.getValue())
                    , Constants.JoinByPipeNull2Empty);

            jsonObj.put("qualifier_item", itemKvs);
            jsonObj.put("passenger_type_code", qualifier.getPassengerTypeCode());
            jsonObj.put("history_id", Utils.toWrapperLong(qualifier.getHistoryID()));
            jsonObj.put("product_no", Utils.toWrapperLong(qualifier.getProductNumber()));
            jsonObj.put("tax_code", qualifier.getTaxCode());
            jsonArray.add(jsonObj);
        }
        return jsonArray.toString();
    }

    /**
     * Description: 获取审计事件信息
     * Parameter:
     *  @param events: xml下的AuditEventsType节点, 可以为null
     * Return: JsonArray字符串
     * Throws: 无
     */
    public static String getEventInfo(AuditEventsType events) {
        if (events == null) {
            return null;
        }
        List<AuditEventType> eventList = events.getEvent();
        if (eventList == null) {
            return null;
        }
        JSONArray jsonArray = new JSONArray();
        for (AuditEventType event : eventList) {
            JSONObject jsonObj = new JSONObject();
            jsonObj.put("event_context", event.getContext());
            jsonObj.put("event_id", event.getID());
            jsonObj.put("event_oj_super_pnr_rph", Utils.toWrapperLong(event.getOJSuperPNRRPH()));
            jsonObj.put("event_orig_value", event.getOrigValue());
            jsonObj.put("event_ref_id", event.getRefId());
            jsonObj.put("event_path", event.getPath());
            jsonObj.put("event_type", event.getType());
            jsonObj.put("flight_segment_rph", Utils.toWrapperLong(event.getFlightSegmentRPH()));
            jsonObj.put("event_ref_path", event.getRefPath());

            jsonArray.add(jsonObj);
        }
        return jsonArray.toString();
    }


    //*********************************解析字段的元信息*********************************

    /**
     * Description: 从Air节点获取AirMetaInfo
     * Parameter:
     *  @param air: xml的Air节点, 可以为null
     * Return: AirMetaInfo, 包含pnr, directionId, docRequired
     * Throws: 无
     */
    public static AirMetaInfo deriveAirMetaInfo(ProductBase.Air air) {
        if (air == null) {
            return null;
        }
        //TODO 这里取pnr的逻辑不是从Commons.getMpPnr取的
        String pnr = Utils.getFirstNonNullApply(air.getBookingReferenceID(), t -> t.getID());

        String directionId = null;
        String docRequired = null;

        AirItineraryType airItinerary = air.getAirItinerary();
        if (airItinerary != null) {
            directionId = Utils.applyOrNull(airItinerary.getDirectionInd(), t -> t.value());
            docRequired = airItinerary.getDocumentationRequired();
        }
        return new AirMetaInfo(pnr, directionId, docRequired);
    }

}
