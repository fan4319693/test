/*
 * File Name: MP_AP_Lounge
 * Version: 1.0
 * Last Modified Time: 2023-03-07 15:56
 */
/*
 * Copyright @ 2013 Airchina.
 * All right reserved.
 */
package com.airchina.datacenter.spnr.sdk.dao.pojo;

/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AP_LoungePo </p>
 * <p>Description: 存储辅营休息室信息 </p>
 * <p>Sample: new MP_AP_LoungePo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AP_LoungePo {

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
     * 功能说明: 一个枚举类型,指示办理登机截止时间何时生效
     * 最后修改时间: 2023/04/20
     */
    private String checkinOffsetDropTime;

    /**
     * 功能说明: 办理登机截止时间单位,如days,hours等,适用于截止日期
     * 最后修改时间: 2023/04/20
     */
    private String checkinOffsetTimeUnit;

    /**
     * 功能说明: 时间单位对应的数量
     * 最后修改时间: 2023/04/20
     */
    private String checkinOffsetUnitMultiplier;

    /**
     * 功能说明: 房间区域子类型
     * 最后修改时间: 2023/04/20
     */
    private String areaSubType;

    /**
     * 功能说明: 房间区域类型
     * 最后修改时间: 2023/04/20
     */
    private String areaType;

    /**
     * 功能说明: 容客量
     * 最后修改时间: 2023/04/20
     */
    private Long capacity;

    /**
     * 功能说明: 休息室
     * 最后修改时间: 2023/04/20
     */
    private String roomCode;

    /**
     * 功能说明: 文本的语言类型代号
     * 最后修改时间: 2023/04/20
     */
    private String roomOpentimeLanguage;

    /**
     * 功能说明: 休息室的描述性文本
     * 最后修改时间: 2023/04/20
     */
    private String descriptiveText;

    /**
     * 功能说明: 休息室附近登机口名
     * 最后修改时间: 2023/04/20
     */
    private String gate;

    /**
     * 功能说明: 语言代号
     * 最后修改时间: 2023/04/20
     */
    private String roomLanguage;

    /**
     * 功能说明: 展示名称
     * 最后修改时间: 2023/04/20
     */
    private String displayName;

    /**
     * 功能说明: 机场名
     * 最后修改时间: 2023/04/20
     */
    private String airportName;

    /**
     * 功能说明: 产品简单描述
     * 最后修改时间: 2023/04/20
     */
    private String shortContent;

    /**
     * 功能说明: 产品的位置描述
     * 最后修改时间: 2023/04/20
     */
    private String locationDescription;

    /**
     * 功能说明: 官方名称
     * 最后修改时间: 2023/04/20
     */
    private String officialName;

    /**
     * 功能说明: 辅营产品全尺寸图像URL,可能是本地或外部的URL
     * 最后修改时间: 2023/04/20
     */
    private String imageUrl;

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

    public String getCheckinOffsetDropTime() {
        return checkinOffsetDropTime;
    }

    public void setCheckinOffsetDropTime(String checkinOffsetDropTime) {
        this.checkinOffsetDropTime = checkinOffsetDropTime;
    }

    public String getCheckinOffsetTimeUnit() {
        return checkinOffsetTimeUnit;
    }

    public void setCheckinOffsetTimeUnit(String checkinOffsetTimeUnit) {
        this.checkinOffsetTimeUnit = checkinOffsetTimeUnit;
    }

    public String getCheckinOffsetUnitMultiplier() {
        return checkinOffsetUnitMultiplier;
    }

    public void setCheckinOffsetUnitMultiplier(String checkinOffsetUnitMultiplier) {
        this.checkinOffsetUnitMultiplier = checkinOffsetUnitMultiplier;
    }

    public String getAreaSubType() {
        return areaSubType;
    }

    public void setAreaSubType(String areaSubType) {
        this.areaSubType = areaSubType;
    }

    public String getAreaType() {
        return areaType;
    }

    public void setAreaType(String areaType) {
        this.areaType = areaType;
    }

    public Long getCapacity() {
        return capacity;
    }

    public void setCapacity(Long capacity) {
        this.capacity = capacity;
    }

    public String getRoomCode() {
        return roomCode;
    }

    public void setRoomCode(String roomCode) {
        this.roomCode = roomCode;
    }

    public String getRoomOpentimeLanguage() {
        return roomOpentimeLanguage;
    }

    public void setRoomOpentimeLanguage(String roomOpentimeLanguage) {
        this.roomOpentimeLanguage = roomOpentimeLanguage;
    }

    public String getDescriptiveText() {
        return descriptiveText;
    }

    public void setDescriptiveText(String descriptiveText) {
        this.descriptiveText = descriptiveText;
    }

    public String getGate() {
        return gate;
    }

    public void setGate(String gate) {
        this.gate = gate;
    }

    public String getRoomLanguage() {
        return roomLanguage;
    }

    public void setRoomLanguage(String roomLanguage) {
        this.roomLanguage = roomLanguage;
    }

    public String getDisplayName() {
        return displayName;
    }

    public void setDisplayName(String displayName) {
        this.displayName = displayName;
    }

    public String getAirportName() {
        return airportName;
    }

    public void setAirportName(String airportName) {
        this.airportName = airportName;
    }

    public String getShortContent() {
        return shortContent;
    }

    public void setShortContent(String shortContent) {
        this.shortContent = shortContent;
    }

    public String getLocationDescription() {
        return locationDescription;
    }

    public void setLocationDescription(String locationDescription) {
        this.locationDescription = locationDescription;
    }

    public String getOfficialName() {
        return officialName;
    }

    public void setOfficialName(String officialName) {
        this.officialName = officialName;
    }

    public String getImageUrl() {
        return imageUrl;
    }

    public void setImageUrl(String imageUrl) {
        this.imageUrl = imageUrl;
    }
}
