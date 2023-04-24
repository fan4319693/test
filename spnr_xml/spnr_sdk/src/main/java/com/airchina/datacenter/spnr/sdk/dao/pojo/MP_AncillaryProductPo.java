package com.airchina.datacenter.spnr.sdk.dao.pojo;


/**
 * <p>Class Name: com.airchina.datacenter.spnr.sdk.dao.pojo.MP_AncillaryProductPo </p>
 * <p>Description: 存储MP附加产品：预付费选座、预付费餐食 </p>
 * <p>Sample: new MP_AncillaryProductPo() </p>
 * <p>Author: FanShuai </p>
 * <p>Date: 2023/4/20 </p>
 * <p>Modified History: 修改记录，格式(Name) (Version) (Date) (Reason & Contents) </p>
 */
public class MP_AncillaryProductPo implements Cloneable{

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
     * 功能说明: 该产品关联的机票PNR
     * 最后修改时间: 2023/04/20
     */
    private String pnr;

    /**
     * 功能说明: 该产品是否能单独取消
     * 最后修改时间: 2023/04/20
     */
    private String cancelable;

    /**
     * 功能说明: 辅助类别,如分段、机场、捆绑等
     * 最后修改时间: 2023/04/20
     */
    private String category;

    /**
     * 功能说明: 对应此次调价的业务配置的CODE值
     * 最后修改时间: 2023/04/20
     */
    private String code;

    /**
     * 功能说明: 辅营产品是行程时间
     * 最后修改时间: 2023/04/20
     */
    private String bookDate;

    /**
     * 功能说明: 辅营产品对应航段的出发地
     * 最后修改时间: 2023/04/20
     */
    private String origin;

    /**
     * 功能说明: 辅营产品对应航段的目的地
     * 最后修改时间: 2023/04/20
     */
    private String destination;

    /**
     * 功能说明: 辅营产品对应航段的航班号
     * 最后修改时间: 2023/04/20
     */
    private String flightNumber;

    /**
     * 功能说明: 辅营产品对应机票的航段序号
     * 最后修改时间: 2023/04/20
     */
    private Long flightSegmentRph;

    /**
     * 功能说明: 该产品对应航段的航班市场方
     * 最后修改时间: 2023/04/20
     */
    private String marketingAirline;

    /**
     * 功能说明: 产品数量
     * 最后修改时间: 2023/04/20
     */
    private Long quantity;

    /**
     * 功能说明: 辅营产品是否可退
     * 最后修改时间: 2023/04/20
     */
    private String refundable;

    /**
     * 功能说明: 预付费座位特有,预定的座位号
     * 最后修改时间: 2023/04/20
     */
    private String seatNumber;

    /**
     * 功能说明: 辅营产品类型
     * 最后修改时间: 2023/04/20
     */
    private String type;

    /**
     * 功能说明: 该产品是否与机票航段绑定,如果否,机票航段变更时无需更改辅营产品
     * 最后修改时间: 2023/04/20
     */
    private String isSegBind;

    /**
     * 功能说明: 旅客在SPNR内唯一标识序号
     * 最后修改时间: 2023/04/20
     */
    private Long travelerRefNumberRph;

    /**
     * 功能说明: 联系人姓名
     * 最后修改时间: 2023/04/20
     */
    private String contactPersonName;

    /**
     * 功能说明: 机场
     * 最后修改时间: 2023/04/20
     */
    private String airport;

    /**
     * 功能说明: 预订渠道
     * 最后修改时间: 2023/04/20
     */
    private String bookingChannel;

    /**
     * 功能说明: PNR
     * 最后修改时间: 2023/04/20
     */
    private String bookingReferenceId;

    /**
     * 功能说明: 预订状态
     * 最后修改时间: 2023/04/20
     */
    private String bookingStatus;

    /**
     * 功能说明: 舱位
     * 最后修改时间: 2023/04/20
     */
    private String cabinClass;

    /**
     * 功能说明: 航司
     * 最后修改时间: 2023/04/20
     */
    private String carrier;

    /**
     * 功能说明: 辅营产品名称
     * 最后修改时间: 2023/04/20
     */
    private String name;

    /**
     * 功能说明: 辅营产品对应机票的OD序号
     * 最后修改时间: 2023/04/20
     */
    private Long odRph;

    /**
     * 功能说明: 这是AAM库存池id？
     * 最后修改时间: 2023/04/20
     */
    private String poolId;

    /**
     * 功能说明: 仅用于Meal辅营产品,用于记录飞机餐的顺序
     * 最后修改时间: 2023/04/20
     */
    private String productSequence;

    /**
     * 功能说明: 辅营产品的参考形式
     * 最后修改时间: 2023/04/20
     */
    private String ref;

    /**
     * 功能说明: 销售建议
     * 最后修改时间: 2023/04/20
     */
    private String sellingProposition;

    /**
     * 功能说明: 仅用于餐食类产品的子类型标记
     * 最后修改时间: 2023/04/20
     */
    private String subType;

    /**
     * 功能说明: 供应商代号
     * 最后修改时间: 2023/04/20
     */
    private String supplierCode;

    /**
     * 功能说明: 供应商系统中的辅营产品代号
     * 最后修改时间: 2023/04/20
     */
    private String supplierProductCode;

    /**
     * 功能说明: 供应商名称
     * 最后修改时间: 2023/04/20
     */
    private String supplierName;

    /**
     * 功能说明: 供应商联系电话
     * 最后修改时间: 2023/04/20
     */
    private String supplierPhoneNumber;

    /**
     * 功能说明: 辅助产品标签
     * 最后修改时间: 2023/04/20
     */
    private String tag;

    /**
     * 功能说明: 机场航站楼,只适用于辅助类别是“机场”类别的辅营产品
     * 最后修改时间: 2023/04/20
     */
    private String terminal;

    /**
     * 功能说明: QR使用日期
     * 最后修改时间: 2023/04/20
     */
    private String qrConsumedDateTime;

    /**
     * 功能说明: 酒店取消截止时间单位,如days,hours等,适用于截止日期
     * 最后修改时间: 2023/04/20
     */
    private String cancelPenaltyDeadlineOffsetTimeUnit;

    /**
     * 功能说明: 酒店取消时间单位对应的数量
     * 最后修改时间: 2023/04/20
     */
    private String cancelPenaltyDeadlineOffsetUnitMultiplier;

    /**
     * 功能说明: 定于酒店取消费是固定定额还是百分比
     * 最后修改时间: 2023/04/20
     */
    private String amountPercent;

    /**
     * 功能说明: 价格对应的乘客会员等级
     * 最后修改时间: 2023/04/20
     */
    private String loyaltyLevel;

    /**
     * 功能说明: 价格对应的乘客类型
     * 最后修改时间: 2023/04/20
     */
    private String passengerTypeCode;

    /**
     * 功能说明: 辅营产品的成本金额及货币
     * 最后修改时间: 2023/04/20
     */
    private String baseAmount;

    /**
     * 功能说明: 辅营产品的成本金额及货币的单位
     * 最后修改时间: 2023/04/20
     */
    private String baseCurrencyCode;

    /**
     * 功能说明: 单品价格,一般用在MoudularProduct/AncillaryProduct/@quantity 大于1时
     * 最后修改时间: 2023/04/20
     */
    private String unitPrice;

    /**
     * 功能说明: 在成本价格的基础上进行调整,这些调整可由航空辅助经理或分销商规则应用
     * 最后修改时间: 2023/04/20
     */
    private String priceAdjustmentsAmount;

    /**
     * 功能说明: 在成本价格的基础上进行调整,这些调整可由航空辅助经理或分销商规则应用的单位
     * 最后修改时间: 2023/04/20
     */
    private String priceAdjustmentsCurrencyCode;

    /**
     * 功能说明: 辅营产品的调整金额
     * 最后修改时间: 2023/04/20
     */
    private String totalAdjusted;

    /**
     * 功能说明: 辅营产品的货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalAdjustedCurrencyCode;

    /**
     * 功能说明: 辅营产品的总金额
     * 最后修改时间: 2023/04/20
     */
    private String totalAmount;

    /**
     * 功能说明: 辅营产品的货币单位
     * 最后修改时间: 2023/04/20
     */
    private String totalCurrencyCode;

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

    public String getCancelable() {
        return cancelable;
    }

    public void setCancelable(String cancelable) {
        this.cancelable = cancelable;
    }

    public String getCategory() {
        return category;
    }

    public void setCategory(String category) {
        this.category = category;
    }

    public String getCode() {
        return code;
    }

    public void setCode(String code) {
        this.code = code;
    }

    public String getBookDate() {
        return bookDate;
    }

    public void setBookDate(String bookDate) {
        this.bookDate = bookDate;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }

    public String getDestination() {
        return destination;
    }

    public void setDestination(String destination) {
        this.destination = destination;
    }

    public String getFlightNumber() {
        return flightNumber;
    }

    public void setFlightNumber(String flightNumber) {
        this.flightNumber = flightNumber;
    }

    public Long getFlightSegmentRph() {
        return flightSegmentRph;
    }

    public void setFlightSegmentRph(Long flightSegmentRph) {
        this.flightSegmentRph = flightSegmentRph;
    }

    public String getMarketingAirline() {
        return marketingAirline;
    }

    public void setMarketingAirline(String marketingAirline) {
        this.marketingAirline = marketingAirline;
    }

    public Long getQuantity() {
        return quantity;
    }

    public void setQuantity(Long quantity) {
        this.quantity = quantity;
    }

    public String getRefundable() {
        return refundable;
    }

    public void setRefundable(String refundable) {
        this.refundable = refundable;
    }

    public String getSeatNumber() {
        return seatNumber;
    }

    public void setSeatNumber(String seatNumber) {
        this.seatNumber = seatNumber;
    }

    public String getType() {
        return type;
    }

    public void setType(String type) {
        this.type = type;
    }

    public String getIsSegBind() {
        return isSegBind;
    }

    public void setIsSegBind(String isSegBind) {
        this.isSegBind = isSegBind;
    }

    public Long getTravelerRefNumberRph() {
        return travelerRefNumberRph;
    }

    public void setTravelerRefNumberRph(Long travelerRefNumberRph) {
        this.travelerRefNumberRph = travelerRefNumberRph;
    }

    public String getContactPersonName() {
        return contactPersonName;
    }

    public void setContactPersonName(String contactPersonName) {
        this.contactPersonName = contactPersonName;
    }

    public String getAirport() {
        return airport;
    }

    public void setAirport(String airport) {
        this.airport = airport;
    }

    public String getBookingChannel() {
        return bookingChannel;
    }

    public void setBookingChannel(String bookingChannel) {
        this.bookingChannel = bookingChannel;
    }

    public String getBookingReferenceId() {
        return bookingReferenceId;
    }

    public void setBookingReferenceId(String bookingReferenceId) {
        this.bookingReferenceId = bookingReferenceId;
    }

    public String getBookingStatus() {
        return bookingStatus;
    }

    public void setBookingStatus(String bookingStatus) {
        this.bookingStatus = bookingStatus;
    }

    public String getCabinClass() {
        return cabinClass;
    }

    public void setCabinClass(String cabinClass) {
        this.cabinClass = cabinClass;
    }

    public String getCarrier() {
        return carrier;
    }

    public void setCarrier(String carrier) {
        this.carrier = carrier;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Long getOdRph() {
        return odRph;
    }

    public void setOdRph(Long odRph) {
        this.odRph = odRph;
    }

    public String getPoolId() {
        return poolId;
    }

    public void setPoolId(String poolId) {
        this.poolId = poolId;
    }

    public String getProductSequence() {
        return productSequence;
    }

    public void setProductSequence(String productSequence) {
        this.productSequence = productSequence;
    }

    public String getRef() {
        return ref;
    }

    public void setRef(String ref) {
        this.ref = ref;
    }

    public String getSellingProposition() {
        return sellingProposition;
    }

    public void setSellingProposition(String sellingProposition) {
        this.sellingProposition = sellingProposition;
    }

    public String getSubType() {
        return subType;
    }

    public void setSubType(String subType) {
        this.subType = subType;
    }

    public String getSupplierCode() {
        return supplierCode;
    }

    public void setSupplierCode(String supplierCode) {
        this.supplierCode = supplierCode;
    }

    public String getSupplierProductCode() {
        return supplierProductCode;
    }

    public void setSupplierProductCode(String supplierProductCode) {
        this.supplierProductCode = supplierProductCode;
    }

    public String getSupplierName() {
        return supplierName;
    }

    public void setSupplierName(String supplierName) {
        this.supplierName = supplierName;
    }

    public String getSupplierPhoneNumber() {
        return supplierPhoneNumber;
    }

    public void setSupplierPhoneNumber(String supplierPhoneNumber) {
        this.supplierPhoneNumber = supplierPhoneNumber;
    }

    public String getTag() {
        return tag;
    }

    public void setTag(String tag) {
        this.tag = tag;
    }

    public String getTerminal() {
        return terminal;
    }

    public void setTerminal(String terminal) {
        this.terminal = terminal;
    }

    public String getQrConsumedDateTime() {
        return qrConsumedDateTime;
    }

    public void setQrConsumedDateTime(String qrConsumedDateTime) {
        this.qrConsumedDateTime = qrConsumedDateTime;
    }

    public String getCancelPenaltyDeadlineOffsetTimeUnit() {
        return cancelPenaltyDeadlineOffsetTimeUnit;
    }

    public void setCancelPenaltyDeadlineOffsetTimeUnit(String cancelPenaltyDeadlineOffsetTimeUnit) {
        this.cancelPenaltyDeadlineOffsetTimeUnit = cancelPenaltyDeadlineOffsetTimeUnit;
    }

    public String getCancelPenaltyDeadlineOffsetUnitMultiplier() {
        return cancelPenaltyDeadlineOffsetUnitMultiplier;
    }

    public void setCancelPenaltyDeadlineOffsetUnitMultiplier(String cancelPenaltyDeadlineOffsetUnitMultiplier) {
        this.cancelPenaltyDeadlineOffsetUnitMultiplier = cancelPenaltyDeadlineOffsetUnitMultiplier;
    }

    public String getAmountPercent() {
        return amountPercent;
    }

    public void setAmountPercent(String amountPercent) {
        this.amountPercent = amountPercent;
    }

    public String getLoyaltyLevel() {
        return loyaltyLevel;
    }

    public void setLoyaltyLevel(String loyaltyLevel) {
        this.loyaltyLevel = loyaltyLevel;
    }

    public String getPassengerTypeCode() {
        return passengerTypeCode;
    }

    public void setPassengerTypeCode(String passengerTypeCode) {
        this.passengerTypeCode = passengerTypeCode;
    }

    public String getBaseAmount() {
        return baseAmount;
    }

    public void setBaseAmount(String baseAmount) {
        this.baseAmount = baseAmount;
    }

    public String getBaseCurrencyCode() {
        return baseCurrencyCode;
    }

    public void setBaseCurrencyCode(String baseCurrencyCode) {
        this.baseCurrencyCode = baseCurrencyCode;
    }

    public String getUnitPrice() {
        return unitPrice;
    }

    public void setUnitPrice(String unitPrice) {
        this.unitPrice = unitPrice;
    }

    public String getPriceAdjustmentsAmount() {
        return priceAdjustmentsAmount;
    }

    public void setPriceAdjustmentsAmount(String priceAdjustmentsAmount) {
        this.priceAdjustmentsAmount = priceAdjustmentsAmount;
    }

    public String getPriceAdjustmentsCurrencyCode() {
        return priceAdjustmentsCurrencyCode;
    }

    public void setPriceAdjustmentsCurrencyCode(String priceAdjustmentsCurrencyCode) {
        this.priceAdjustmentsCurrencyCode = priceAdjustmentsCurrencyCode;
    }

    public String getTotalAdjusted() {
        return totalAdjusted;
    }

    public void setTotalAdjusted(String totalAdjusted) {
        this.totalAdjusted = totalAdjusted;
    }

    public String getTotalAdjustedCurrencyCode() {
        return totalAdjustedCurrencyCode;
    }

    public void setTotalAdjustedCurrencyCode(String totalAdjustedCurrencyCode) {
        this.totalAdjustedCurrencyCode = totalAdjustedCurrencyCode;
    }

    public String getTotalAmount() {
        return totalAmount;
    }

    public void setTotalAmount(String totalAmount) {
        this.totalAmount = totalAmount;
    }

    public String getTotalCurrencyCode() {
        return totalCurrencyCode;
    }

    public void setTotalCurrencyCode(String totalCurrencyCode) {
        this.totalCurrencyCode = totalCurrencyCode;
    }
}