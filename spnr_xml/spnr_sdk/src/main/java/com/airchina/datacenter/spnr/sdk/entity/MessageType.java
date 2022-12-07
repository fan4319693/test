//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigDecimal;
import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.adapters.CollapsedStringAdapter;
import javax.xml.bind.annotation.adapters.XmlJavaTypeAdapter;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * If StartSeqNmbr and EndSeqNmbr are not sent, the request will be assumed to be for the last sequence number.
 * 
 * <p>MessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="OriginalPayloadStdAttributes" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="MessageContent" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}DateTimeSpanGroup"/>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}HotelReferenceGroup"/>
 *       &lt;attribute name="StartSeqNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="EndSeqNmbr" type="{http://www.w3.org/2001/XMLSchema}nonNegativeInteger" />
 *       &lt;attribute name="MessageType" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="ResponseValue" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to8" />
 *       &lt;attribute name="RequestCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReasonForRequest" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="RatePlanCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ConfirmationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="ReservationID" type="{http://www.w3.org/2001/XMLSchema}string" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MessageType", propOrder = {
    "originalPayloadStdAttributes",
    "messageContent"
})
public class MessageType {

    @XmlElement(name = "OriginalPayloadStdAttributes")
    protected MessageType.OriginalPayloadStdAttributes originalPayloadStdAttributes;
    @XmlElement(name = "MessageContent")
    protected String messageContent;
    @XmlAttribute(name = "StartSeqNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger startSeqNmbr;
    @XmlAttribute(name = "EndSeqNmbr")
    @XmlSchemaType(name = "nonNegativeInteger")
    protected BigInteger endSeqNmbr;
    @XmlAttribute(name = "MessageType")
    protected String messageType;
    @XmlAttribute(name = "ResponseValue")
    protected String responseValue;
    @XmlAttribute(name = "RequestCode")
    protected String requestCode;
    @XmlAttribute(name = "ReasonForRequest")
    protected String reasonForRequest;
    @XmlAttribute(name = "UserName")
    protected String userName;
    @XmlAttribute(name = "RatePlanCode")
    protected String ratePlanCode;
    @XmlAttribute(name = "ConfirmationID")
    protected String confirmationID;
    @XmlAttribute(name = "ReservationID")
    protected String reservationID;
    @XmlAttribute(name = "Start")
    protected String start;
    @XmlAttribute(name = "Duration")
    protected BigInteger duration;
    @XmlAttribute(name = "End")
    protected String end;
    @XmlAttribute(name = "RangeNum")
    protected BigInteger rangeNum;
    @XmlAttribute(name = "SearchTimeZone")
    protected String searchTimeZone;
    @XmlAttribute(name = "BookingOfficeCode")
    protected String bookingOfficeCode;
    @XmlAttribute(name = "ChainCode")
    protected String chainCode;
    @XmlAttribute(name = "BrandCode")
    protected String brandCode;
    @XmlAttribute(name = "HotelCode")
    protected String hotelCode;
    @XmlAttribute(name = "HotelCityCode")
    protected String hotelCityCode;
    @XmlAttribute(name = "HotelName")
    protected String hotelName;
    @XmlAttribute(name = "HotelCodeContext")
    protected String hotelCodeContext;
    @XmlAttribute(name = "ChainName")
    protected String chainName;
    @XmlAttribute(name = "BrandName")
    protected String brandName;
    @XmlAttribute(name = "AreaID")
    protected String areaID;

    /**
     * 获取originalPayloadStdAttributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageType.OriginalPayloadStdAttributes }
     *     
     */
    public MessageType.OriginalPayloadStdAttributes getOriginalPayloadStdAttributes() {
        return originalPayloadStdAttributes;
    }

    /**
     * 设置originalPayloadStdAttributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageType.OriginalPayloadStdAttributes }
     *     
     */
    public void setOriginalPayloadStdAttributes(MessageType.OriginalPayloadStdAttributes value) {
        this.originalPayloadStdAttributes = value;
    }

    /**
     * 获取messageContent属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageContent() {
        return messageContent;
    }

    /**
     * 设置messageContent属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageContent(String value) {
        this.messageContent = value;
    }

    /**
     * 获取startSeqNmbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getStartSeqNmbr() {
        return startSeqNmbr;
    }

    /**
     * 设置startSeqNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setStartSeqNmbr(BigInteger value) {
        this.startSeqNmbr = value;
    }

    /**
     * 获取endSeqNmbr属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getEndSeqNmbr() {
        return endSeqNmbr;
    }

    /**
     * 设置endSeqNmbr属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setEndSeqNmbr(BigInteger value) {
        this.endSeqNmbr = value;
    }

    /**
     * 获取messageType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getMessageType() {
        return messageType;
    }

    /**
     * 设置messageType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setMessageType(String value) {
        this.messageType = value;
    }

    /**
     * 获取responseValue属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getResponseValue() {
        return responseValue;
    }

    /**
     * 设置responseValue属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setResponseValue(String value) {
        this.responseValue = value;
    }

    /**
     * 获取requestCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRequestCode() {
        return requestCode;
    }

    /**
     * 设置requestCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRequestCode(String value) {
        this.requestCode = value;
    }

    /**
     * 获取reasonForRequest属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReasonForRequest() {
        return reasonForRequest;
    }

    /**
     * 设置reasonForRequest属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReasonForRequest(String value) {
        this.reasonForRequest = value;
    }

    /**
     * 获取userName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUserName() {
        return userName;
    }

    /**
     * 设置userName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUserName(String value) {
        this.userName = value;
    }

    /**
     * 获取ratePlanCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRatePlanCode() {
        return ratePlanCode;
    }

    /**
     * 设置ratePlanCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRatePlanCode(String value) {
        this.ratePlanCode = value;
    }

    /**
     * 获取confirmationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getConfirmationID() {
        return confirmationID;
    }

    /**
     * 设置confirmationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setConfirmationID(String value) {
        this.confirmationID = value;
    }

    /**
     * 获取reservationID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getReservationID() {
        return reservationID;
    }

    /**
     * 设置reservationID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setReservationID(String value) {
        this.reservationID = value;
    }

    /**
     * 获取start属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getStart() {
        return start;
    }

    /**
     * 设置start属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setStart(String value) {
        this.start = value;
    }

    /**
     * 获取duration属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getDuration() {
        return duration;
    }

    /**
     * 设置duration属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setDuration(BigInteger value) {
        this.duration = value;
    }

    /**
     * 获取end属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getEnd() {
        return end;
    }

    /**
     * 设置end属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setEnd(String value) {
        this.end = value;
    }

    /**
     * 获取rangeNum属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getRangeNum() {
        return rangeNum;
    }

    /**
     * 设置rangeNum属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setRangeNum(BigInteger value) {
        this.rangeNum = value;
    }

    /**
     * 获取searchTimeZone属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSearchTimeZone() {
        return searchTimeZone;
    }

    /**
     * 设置searchTimeZone属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSearchTimeZone(String value) {
        this.searchTimeZone = value;
    }

    /**
     * 获取bookingOfficeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBookingOfficeCode() {
        return bookingOfficeCode;
    }

    /**
     * 设置bookingOfficeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBookingOfficeCode(String value) {
        this.bookingOfficeCode = value;
    }

    /**
     * 获取chainCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainCode() {
        return chainCode;
    }

    /**
     * 设置chainCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainCode(String value) {
        this.chainCode = value;
    }

    /**
     * 获取brandCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandCode() {
        return brandCode;
    }

    /**
     * 设置brandCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandCode(String value) {
        this.brandCode = value;
    }

    /**
     * 获取hotelCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCode() {
        return hotelCode;
    }

    /**
     * 设置hotelCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCode(String value) {
        this.hotelCode = value;
    }

    /**
     * 获取hotelCityCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCityCode() {
        return hotelCityCode;
    }

    /**
     * 设置hotelCityCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCityCode(String value) {
        this.hotelCityCode = value;
    }

    /**
     * 获取hotelName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelName(String value) {
        this.hotelName = value;
    }

    /**
     * 获取hotelCodeContext属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getHotelCodeContext() {
        return hotelCodeContext;
    }

    /**
     * 设置hotelCodeContext属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setHotelCodeContext(String value) {
        this.hotelCodeContext = value;
    }

    /**
     * 获取chainName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getChainName() {
        return chainName;
    }

    /**
     * 设置chainName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setChainName(String value) {
        this.chainName = value;
    }

    /**
     * 获取brandName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getBrandName() {
        return brandName;
    }

    /**
     * 设置brandName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setBrandName(String value) {
        this.brandName = value;
    }

    /**
     * 获取areaID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAreaID() {
        return areaID;
    }

    /**
     * 设置areaID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAreaID(String value) {
        this.areaID = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}OTA_PayloadStdAttributes"/>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class OriginalPayloadStdAttributes {

        @XmlAttribute(name = "EchoToken")
        protected String echoToken;
        @XmlAttribute(name = "SessionID")
        protected String sessionID;
        @XmlAttribute(name = "DeviceID")
        protected String deviceID;
        @XmlAttribute(name = "AgentID")
        protected String agentID;
        @XmlAttribute(name = "MessageID")
        protected String messageID;
        @XmlAttribute(name = "ParentMessageID")
        protected String parentMessageID;
        @XmlAttribute(name = "TimeStamp")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar timeStamp;
        @XmlAttribute(name = "Target")
        protected String target;
        @XmlAttribute(name = "Sequence")
        protected BigInteger sequence;
        @XmlAttribute(name = "CurrentPhase")
        protected String currentPhase;
        @XmlAttribute(name = "PackageType")
        protected String packageType;
        @XmlAttribute(name = "CrossSell")
        protected Boolean crossSell;
        @XmlAttribute(name = "Version")
        protected BigDecimal version;
        @XmlAttribute(name = "TransactionIdentifier")
        protected String transactionIdentifier;
        @XmlAttribute(name = "SequenceNmbr")
        protected String sequenceNmbr;
        @XmlAttribute(name = "TransactionStatusCode")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        protected String transactionStatusCode;
        @XmlAttribute(name = "RetransmissionIndicator")
        protected Boolean retransmissionIndicator;
        @XmlAttribute(name = "xPromotionId")
        protected String xPromotionId;
        @XmlAttribute(name = "xPromotionProfileId")
        protected String xPromotionProfileId;
        @XmlAttribute(name = "xPromotionTripProfileId")
        protected String xPromotionTripProfileId;
        @XmlAttribute(name = "Test")
        protected String test;
        @XmlAttribute(name = "CachedTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar cachedTime;
        @XmlAttribute(name = "PaymentOptionStage")
        protected PaymentOptionStageType paymentOptionStage;
        @XmlAttribute(name = "InputRequired")
        protected Boolean inputRequired;
        @XmlAttribute(name = "PrimaryLangID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String primaryLangID;
        @XmlAttribute(name = "CorrelationID")
        protected String correlationID;
        @XmlAttribute(name = "BookingChannel")
        protected String bookingChannel;
        @XmlAttribute(name = "SPNR_ProductID")
        protected String spnrProductID;
        @XmlAttribute(name = "productID")
        protected String productID;
        @XmlAttribute(name = "LandingPageProfileID")
        protected Integer landingPageProfileID;
        @XmlAttribute(name = "IsLoggedIn")
        protected Boolean isLoggedIn;
        @XmlAttribute(name = "SuperPNR_ID")
        protected String superPNRID;
        @XmlAttribute(name = "AltLangID")
        @XmlJavaTypeAdapter(CollapsedStringAdapter.class)
        @XmlSchemaType(name = "language")
        protected String altLangID;

        /**
         * 获取echoToken属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getEchoToken() {
            return echoToken;
        }

        /**
         * 设置echoToken属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setEchoToken(String value) {
            this.echoToken = value;
        }

        /**
         * 获取sessionID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSessionID() {
            return sessionID;
        }

        /**
         * 设置sessionID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSessionID(String value) {
            this.sessionID = value;
        }

        /**
         * 获取deviceID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getDeviceID() {
            return deviceID;
        }

        /**
         * 设置deviceID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setDeviceID(String value) {
            this.deviceID = value;
        }

        /**
         * 获取agentID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAgentID() {
            return agentID;
        }

        /**
         * 设置agentID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAgentID(String value) {
            this.agentID = value;
        }

        /**
         * 获取messageID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMessageID() {
            return messageID;
        }

        /**
         * 设置messageID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMessageID(String value) {
            this.messageID = value;
        }

        /**
         * 获取parentMessageID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getParentMessageID() {
            return parentMessageID;
        }

        /**
         * 设置parentMessageID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setParentMessageID(String value) {
            this.parentMessageID = value;
        }

        /**
         * 获取timeStamp属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getTimeStamp() {
            return timeStamp;
        }

        /**
         * 设置timeStamp属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setTimeStamp(XMLGregorianCalendar value) {
            this.timeStamp = value;
        }

        /**
         * 获取target属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTarget() {
            if (target == null) {
                return "Production";
            } else {
                return target;
            }
        }

        /**
         * 设置target属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTarget(String value) {
            this.target = value;
        }

        /**
         * 获取sequence属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getSequence() {
            return sequence;
        }

        /**
         * 设置sequence属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setSequence(BigInteger value) {
            this.sequence = value;
        }

        /**
         * 获取currentPhase属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrentPhase() {
            return currentPhase;
        }

        /**
         * 设置currentPhase属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrentPhase(String value) {
            this.currentPhase = value;
        }

        /**
         * 获取packageType属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPackageType() {
            return packageType;
        }

        /**
         * 设置packageType属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPackageType(String value) {
            this.packageType = value;
        }

        /**
         * 获取crossSell属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isCrossSell() {
            return crossSell;
        }

        /**
         * 设置crossSell属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setCrossSell(Boolean value) {
            this.crossSell = value;
        }

        /**
         * 获取version属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigDecimal }
         *     
         */
        public BigDecimal getVersion() {
            return version;
        }

        /**
         * 设置version属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigDecimal }
         *     
         */
        public void setVersion(BigDecimal value) {
            this.version = value;
        }

        /**
         * 获取transactionIdentifier属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionIdentifier() {
            return transactionIdentifier;
        }

        /**
         * 设置transactionIdentifier属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionIdentifier(String value) {
            this.transactionIdentifier = value;
        }

        /**
         * 获取sequenceNmbr属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSequenceNmbr() {
            return sequenceNmbr;
        }

        /**
         * 设置sequenceNmbr属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSequenceNmbr(String value) {
            this.sequenceNmbr = value;
        }

        /**
         * 获取transactionStatusCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTransactionStatusCode() {
            return transactionStatusCode;
        }

        /**
         * 设置transactionStatusCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTransactionStatusCode(String value) {
            this.transactionStatusCode = value;
        }

        /**
         * 获取retransmissionIndicator属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isRetransmissionIndicator() {
            return retransmissionIndicator;
        }

        /**
         * 设置retransmissionIndicator属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setRetransmissionIndicator(Boolean value) {
            this.retransmissionIndicator = value;
        }

        /**
         * 获取xPromotionId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPromotionId() {
            return xPromotionId;
        }

        /**
         * 设置xPromotionId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPromotionId(String value) {
            this.xPromotionId = value;
        }

        /**
         * 获取xPromotionProfileId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPromotionProfileId() {
            return xPromotionProfileId;
        }

        /**
         * 设置xPromotionProfileId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPromotionProfileId(String value) {
            this.xPromotionProfileId = value;
        }

        /**
         * 获取xPromotionTripProfileId属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getXPromotionTripProfileId() {
            return xPromotionTripProfileId;
        }

        /**
         * 设置xPromotionTripProfileId属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setXPromotionTripProfileId(String value) {
            this.xPromotionTripProfileId = value;
        }

        /**
         * 获取test属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getTest() {
            return test;
        }

        /**
         * 设置test属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setTest(String value) {
            this.test = value;
        }

        /**
         * 获取cachedTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getCachedTime() {
            return cachedTime;
        }

        /**
         * 设置cachedTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setCachedTime(XMLGregorianCalendar value) {
            this.cachedTime = value;
        }

        /**
         * 获取paymentOptionStage属性的值。
         * 
         * @return
         *     possible object is
         *     {@link PaymentOptionStageType }
         *     
         */
        public PaymentOptionStageType getPaymentOptionStage() {
            return paymentOptionStage;
        }

        /**
         * 设置paymentOptionStage属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link PaymentOptionStageType }
         *     
         */
        public void setPaymentOptionStage(PaymentOptionStageType value) {
            this.paymentOptionStage = value;
        }

        /**
         * 获取inputRequired属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isInputRequired() {
            return inputRequired;
        }

        /**
         * 设置inputRequired属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setInputRequired(Boolean value) {
            this.inputRequired = value;
        }

        /**
         * 获取primaryLangID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPrimaryLangID() {
            return primaryLangID;
        }

        /**
         * 设置primaryLangID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPrimaryLangID(String value) {
            this.primaryLangID = value;
        }

        /**
         * 获取correlationID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCorrelationID() {
            return correlationID;
        }

        /**
         * 设置correlationID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCorrelationID(String value) {
            this.correlationID = value;
        }

        /**
         * 获取bookingChannel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBookingChannel() {
            return bookingChannel;
        }

        /**
         * 设置bookingChannel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBookingChannel(String value) {
            this.bookingChannel = value;
        }

        /**
         * 获取spnrProductID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSPNRProductID() {
            return spnrProductID;
        }

        /**
         * 设置spnrProductID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSPNRProductID(String value) {
            this.spnrProductID = value;
        }

        /**
         * 获取productID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getProductID() {
            return productID;
        }

        /**
         * 设置productID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setProductID(String value) {
            this.productID = value;
        }

        /**
         * 获取landingPageProfileID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Integer }
         *     
         */
        public Integer getLandingPageProfileID() {
            return landingPageProfileID;
        }

        /**
         * 设置landingPageProfileID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Integer }
         *     
         */
        public void setLandingPageProfileID(Integer value) {
            this.landingPageProfileID = value;
        }

        /**
         * 获取isLoggedIn属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isIsLoggedIn() {
            return isLoggedIn;
        }

        /**
         * 设置isLoggedIn属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setIsLoggedIn(Boolean value) {
            this.isLoggedIn = value;
        }

        /**
         * 获取superPNRID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSuperPNRID() {
            return superPNRID;
        }

        /**
         * 设置superPNRID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSuperPNRID(String value) {
            this.superPNRID = value;
        }

        /**
         * 获取altLangID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAltLangID() {
            return altLangID;
        }

        /**
         * 设置altLangID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAltLangID(String value) {
            this.altLangID = value;
        }

    }

}
