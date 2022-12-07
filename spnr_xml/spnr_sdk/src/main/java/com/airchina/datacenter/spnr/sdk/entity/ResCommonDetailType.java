//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * A grouping of elements including Guest Counts, Time Span, pointers to Res Guests, guest Memberships, Comments and Special Requests and finally finacial information including Guarantee, Deposit and Payyment and Cancellation Penalties.
 * 
 * <p>ResCommonDetailType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="ResCommonDetailType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="GuestCounts" type="{http://www.opentravel.org/OTA/2003/05}GuestCountType" minOccurs="0"/>
 *         &lt;element name="TimeSpan" type="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanType" minOccurs="0"/>
 *         &lt;element name="ResGuestRPHs" type="{http://www.opentravel.org/OTA/2003/05}ResGuestRPHsType" minOccurs="0"/>
 *         &lt;element name="Memberships" type="{http://www.opentravel.org/OTA/2003/05}MembershipType" minOccurs="0"/>
 *         &lt;element name="Comments" type="{http://www.opentravel.org/OTA/2003/05}CommentType" minOccurs="0"/>
 *         &lt;element name="SpecialRequests" type="{http://www.opentravel.org/OTA/2003/05}SpecialRequestType" minOccurs="0"/>
 *         &lt;element name="Guarantee" type="{http://www.opentravel.org/OTA/2003/05}GuaranteeType" minOccurs="0"/>
 *         &lt;element name="DepositPayments" type="{http://www.opentravel.org/OTA/2003/05}RequiredPaymentsType" minOccurs="0"/>
 *         &lt;element name="CancelPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="CancellationPenalties" type="{http://www.opentravel.org/OTA/2003/05}CancelPenaltiesType" minOccurs="0"/>
 *         &lt;element name="Fees" type="{http://www.opentravel.org/OTA/2003/05}FeesType" minOccurs="0"/>
 *         &lt;element name="Total" type="{http://www.opentravel.org/OTA/2003/05}TotalType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "ResCommonDetailType", propOrder = {
    "guestCounts",
    "timeSpan",
    "resGuestRPHs",
    "memberships",
    "comments",
    "specialRequests",
    "guarantee",
    "depositPayments",
    "cancelPenalties",
    "cancellationPenalties",
    "fees",
    "total"
})
@XmlSeeAlso({
    ResGlobalInfoType.class
})
public class ResCommonDetailType {

    @XmlElement(name = "GuestCounts")
    protected GuestCountType guestCounts;
    @XmlElement(name = "TimeSpan")
    protected DateTimeSpanType timeSpan;
    @XmlElement(name = "ResGuestRPHs")
    protected ResGuestRPHsType resGuestRPHs;
    @XmlElement(name = "Memberships")
    protected MembershipType memberships;
    @XmlElement(name = "Comments")
    protected CommentType comments;
    @XmlElement(name = "SpecialRequests")
    protected SpecialRequestType specialRequests;
    @XmlElement(name = "Guarantee")
    protected GuaranteeType guarantee;
    @XmlElement(name = "DepositPayments")
    protected RequiredPaymentsType depositPayments;
    @XmlElement(name = "CancelPenalties")
    protected CancelPenaltiesType cancelPenalties;
    @XmlElement(name = "CancellationPenalties")
    protected CancelPenaltiesType cancellationPenalties;
    @XmlElement(name = "Fees")
    protected FeesType fees;
    @XmlElement(name = "Total")
    protected TotalType total;

    /**
     * 获取guestCounts属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuestCountType }
     *     
     */
    public GuestCountType getGuestCounts() {
        return guestCounts;
    }

    /**
     * 设置guestCounts属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuestCountType }
     *     
     */
    public void setGuestCounts(GuestCountType value) {
        this.guestCounts = value;
    }

    /**
     * 获取timeSpan属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DateTimeSpanType }
     *     
     */
    public DateTimeSpanType getTimeSpan() {
        return timeSpan;
    }

    /**
     * 设置timeSpan属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DateTimeSpanType }
     *     
     */
    public void setTimeSpan(DateTimeSpanType value) {
        this.timeSpan = value;
    }

    /**
     * 获取resGuestRPHs属性的值。
     * 
     * @return
     *     possible object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public ResGuestRPHsType getResGuestRPHs() {
        return resGuestRPHs;
    }

    /**
     * 设置resGuestRPHs属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link ResGuestRPHsType }
     *     
     */
    public void setResGuestRPHs(ResGuestRPHsType value) {
        this.resGuestRPHs = value;
    }

    /**
     * 获取memberships属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MembershipType }
     *     
     */
    public MembershipType getMemberships() {
        return memberships;
    }

    /**
     * 设置memberships属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MembershipType }
     *     
     */
    public void setMemberships(MembershipType value) {
        this.memberships = value;
    }

    /**
     * 获取comments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CommentType }
     *     
     */
    public CommentType getComments() {
        return comments;
    }

    /**
     * 设置comments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CommentType }
     *     
     */
    public void setComments(CommentType value) {
        this.comments = value;
    }

    /**
     * 获取specialRequests属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SpecialRequestType }
     *     
     */
    public SpecialRequestType getSpecialRequests() {
        return specialRequests;
    }

    /**
     * 设置specialRequests属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SpecialRequestType }
     *     
     */
    public void setSpecialRequests(SpecialRequestType value) {
        this.specialRequests = value;
    }

    /**
     * 获取guarantee属性的值。
     * 
     * @return
     *     possible object is
     *     {@link GuaranteeType }
     *     
     */
    public GuaranteeType getGuarantee() {
        return guarantee;
    }

    /**
     * 设置guarantee属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link GuaranteeType }
     *     
     */
    public void setGuarantee(GuaranteeType value) {
        this.guarantee = value;
    }

    /**
     * 获取depositPayments属性的值。
     * 
     * @return
     *     possible object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public RequiredPaymentsType getDepositPayments() {
        return depositPayments;
    }

    /**
     * 设置depositPayments属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link RequiredPaymentsType }
     *     
     */
    public void setDepositPayments(RequiredPaymentsType value) {
        this.depositPayments = value;
    }

    /**
     * 获取cancelPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancelPenalties() {
        return cancelPenalties;
    }

    /**
     * 设置cancelPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancelPenalties(CancelPenaltiesType value) {
        this.cancelPenalties = value;
    }

    /**
     * 获取cancellationPenalties属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public CancelPenaltiesType getCancellationPenalties() {
        return cancellationPenalties;
    }

    /**
     * 设置cancellationPenalties属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CancelPenaltiesType }
     *     
     */
    public void setCancellationPenalties(CancelPenaltiesType value) {
        this.cancellationPenalties = value;
    }

    /**
     * 获取fees属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FeesType }
     *     
     */
    public FeesType getFees() {
        return fees;
    }

    /**
     * 设置fees属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FeesType }
     *     
     */
    public void setFees(FeesType value) {
        this.fees = value;
    }

    /**
     * 获取total属性的值。
     * 
     * @return
     *     possible object is
     *     {@link TotalType }
     *     
     */
    public TotalType getTotal() {
        return total;
    }

    /**
     * 设置total属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link TotalType }
     *     
     */
    public void setTotal(TotalType value) {
        this.total = value;
    }

}
