package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AirAirItinerary_baggagePo </p>
 * <p>Description: 存储了MP的免费行李信息 </p>
 * <p>Sample: new MP_AirAirItinerary_baggagePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AirAirItinerary_baggagePo {

    /**
     * 功能说明: SPNR ID,唯一标识
     * 最后修改时间: 2023/04/20
     */
    private String superPnrId;

    /**
     * 功能说明: 最终用户进行的搜索的 ID的唯一标识。
     * 最后修改时间: 2023/04/20
     */
    private String searchId;

    /**
     * 功能说明: 该SPNR内MP唯一序号
     * 最后修改时间: 2023/04/20
     */
    private Long productNumber;

    /**
     * 功能说明: PNR号
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: OD在该MP内的唯一序列号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 行李额序号
     * 最后修改时间: 2023/04/20
     */
    private Long baggageRph;

    /**
     * 功能说明: 行李额对应的FlightSegment RPH
     * 最后修改时间: 2023/04/20
     */
    private Long flighSegmentRph;

    /**
     * 功能说明: 行李件数
     * 最后修改时间: 2023/04/20
     */
    private Long pieces;

    /**
     * 功能说明: 行李对应的Traveler序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRph;

    /**
     * 功能说明: 行李对应的运价RPH
     * 最后修改时间: 2023/04/20
     */
    private Long pricingRph;

    /**
     * 功能说明: 行李重量
     * 最后修改时间: 2023/04/20
     */
    private String weight;

    /**
     * 功能说明: 行李重量单位
     * 最后修改时间: 2023/04/20
     */
    private String weightUnit;

    /**
     * 功能说明: 行李尺寸单位
     * 最后修改时间: 2023/04/20
     */
    private String sizeCode;

    /**
     * 功能说明: 行李尺寸描述
     * 最后修改时间: 2023/04/20
     */
    private String sizeDescription;

    /**
     * 功能说明: 行李高度
     * 最后修改时间: 2023/04/20
     */
    private String sizeHeight;

    /**
     * 功能说明: 行李长度
     * 最后修改时间: 2023/04/20
     */
    private String sizeLength;

    /**
     * 功能说明: 行李宽度
     * 最后修改时间: 2023/04/20
     */
    private String sizeWidth;

    /**
     * 功能说明: 特殊服务项:计件制,计重制
     * 最后修改时间: 2023/04/20
     */
    private String specialItemCode;

    /**
     * 功能说明: 特殊服务项来源
     * 最后修改时间: 2023/04/20
     */
    private String specialItemContext;

    /**
     * 功能说明: 特殊服务项URI
     * 最后修改时间: 2023/04/20
     */
    private String specialItemUri;

    /**
     * 功能说明: XSD中已无此节点
     * 最后修改时间: 2023/04/20
     */
    private String isFpc;

    /**
     * 功能说明: 乘客资质
     * 最后修改时间: 2023/04/20
     */
    private String passageTypeCode;

    //============================Getter and Setter===============================

    public String getSuperPnrId() {
        return superPnrId;
    }

    public void setSuperPnrId(String superPnrId) {
        this.superPnrId = superPnrId;
    }

    public String getSearchId() {
        return searchId;
    }

    public void setSearchId(String searchId) {
        this.searchId = searchId;
    }

    public Long getProductNumber() {
        return productNumber;
    }

    public void setProductNumber(Long productNumber) {
        this.productNumber = productNumber;
    }

    public String getPnr() {
        return pnr;
    }

    public void setPnr(String pnr) {
        this.pnr = pnr;
    }

    public Long getOdRph() {
        return odRph;
    }

    public void setOdRph(Long odRph) {
        this.odRph = odRph;
    }

    public Long getBaggageRph() {
        return baggageRph;
    }

    public void setBaggageRph(Long baggageRph) {
        this.baggageRph = baggageRph;
    }

    public Long getFlighSegmentRph() {
        return flighSegmentRph;
    }

    public void setFlighSegmentRph(Long flighSegmentRph) {
        this.flighSegmentRph = flighSegmentRph;
    }

    public Long getPieces() {
        return pieces;
    }

    public void setPieces(Long pieces) {
        this.pieces = pieces;
    }

    public Long getTravelerRph() {
        return travelerRph;
    }

    public void setTravelerRph(Long travelerRph) {
        this.travelerRph = travelerRph;
    }

    public Long getPricingRph() {
        return pricingRph;
    }

    public void setPricingRph(Long pricingRph) {
        this.pricingRph = pricingRph;
    }

    public String getWeight() {
        return weight;
    }

    public void setWeight(String weight) {
        this.weight = weight;
    }

    public String getWeightUnit() {
        return weightUnit;
    }

    public void setWeightUnit(String weightUnit) {
        this.weightUnit = weightUnit;
    }

    public String getSizeCode() {
        return sizeCode;
    }

    public void setSizeCode(String sizeCode) {
        this.sizeCode = sizeCode;
    }

    public String getSizeDescription() {
        return sizeDescription;
    }

    public void setSizeDescription(String sizeDescription) {
        this.sizeDescription = sizeDescription;
    }

    public String getSizeHeight() {
        return sizeHeight;
    }

    public void setSizeHeight(String sizeHeight) {
        this.sizeHeight = sizeHeight;
    }

    public String getSizeLength() {
        return sizeLength;
    }

    public void setSizeLength(String sizeLength) {
        this.sizeLength = sizeLength;
    }

    public String getSizeWidth() {
        return sizeWidth;
    }

    public void setSizeWidth(String sizeWidth) {
        this.sizeWidth = sizeWidth;
    }

    public String getSpecialItemCode() {
        return specialItemCode;
    }

    public void setSpecialItemCode(String specialItemCode) {
        this.specialItemCode = specialItemCode;
    }

    public String getSpecialItemContext() {
        return specialItemContext;
    }

    public void setSpecialItemContext(String specialItemContext) {
        this.specialItemContext = specialItemContext;
    }

    public String getSpecialItemUri() {
        return specialItemUri;
    }

    public void setSpecialItemUri(String specialItemUri) {
        this.specialItemUri = specialItemUri;
    }

    public String getIsFpc() {
        return isFpc;
    }

    public void setIsFpc(String isFpc) {
        this.isFpc = isFpc;
    }

    public String getPassageTypeCode() {
        return passageTypeCode;
    }

    public void setPassageTypeCode(String passageTypeCode) {
        this.passageTypeCode = passageTypeCode;
    }
}