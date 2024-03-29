//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * WeChat message related info.
 * 
 * <p>WeChatMessageType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="WeChatMessageType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="AppID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="OpenID" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Template" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="StartText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="BodyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="ClosingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FlightRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
 *                   &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="FlightSegmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="CustLoyalty" type="{http://www.opentravel.org/OTA/2003/05}CustLoyaltyType" minOccurs="0"/>
 *         &lt;element name="Documents" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Document" type="{http://www.opentravel.org/OTA/2003/05}WeChatDocType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attribute name="SendTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "WeChatMessageType", propOrder = {
    "appID",
    "openID",
    "template",
    "custLoyalty",
    "documents"
})
public class WeChatMessageType {

    @XmlElement(name = "AppID", required = true)
    protected String appID;
    @XmlElement(name = "OpenID", required = true)
    protected String openID;
    @XmlElement(name = "Template")
    protected WeChatMessageType.Template template;
    @XmlElement(name = "CustLoyalty")
    protected CustLoyaltyType custLoyalty;
    @XmlElement(name = "Documents")
    protected WeChatMessageType.Documents documents;
    @XmlAttribute(name = "SendTime")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar sendTime;

    /**
     * 获取appID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getAppID() {
        return appID;
    }

    /**
     * 设置appID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setAppID(String value) {
        this.appID = value;
    }

    /**
     * 获取openID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOpenID() {
        return openID;
    }

    /**
     * 设置openID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOpenID(String value) {
        this.openID = value;
    }

    /**
     * 获取template属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeChatMessageType.Template }
     *     
     */
    public WeChatMessageType.Template getTemplate() {
        return template;
    }

    /**
     * 设置template属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeChatMessageType.Template }
     *     
     */
    public void setTemplate(WeChatMessageType.Template value) {
        this.template = value;
    }

    /**
     * 获取custLoyalty属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustLoyaltyType }
     *     
     */
    public CustLoyaltyType getCustLoyalty() {
        return custLoyalty;
    }

    /**
     * 设置custLoyalty属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustLoyaltyType }
     *     
     */
    public void setCustLoyalty(CustLoyaltyType value) {
        this.custLoyalty = value;
    }

    /**
     * 获取documents属性的值。
     * 
     * @return
     *     possible object is
     *     {@link WeChatMessageType.Documents }
     *     
     */
    public WeChatMessageType.Documents getDocuments() {
        return documents;
    }

    /**
     * 设置documents属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link WeChatMessageType.Documents }
     *     
     */
    public void setDocuments(WeChatMessageType.Documents value) {
        this.documents = value;
    }

    /**
     * 获取sendTime属性的值。
     * 
     * @return
     *     possible object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public XMLGregorianCalendar getSendTime() {
        return sendTime;
    }

    /**
     * 设置sendTime属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link XMLGregorianCalendar }
     *     
     */
    public void setSendTime(XMLGregorianCalendar value) {
        this.sendTime = value;
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
     *       &lt;sequence>
     *         &lt;element name="Document" type="{http://www.opentravel.org/OTA/2003/05}WeChatDocType" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "document"
    })
    public static class Documents {

        @XmlElement(name = "Document")
        protected List<WeChatDocType> document;

        /**
         * Gets the value of the document property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the document property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDocument().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link WeChatDocType }
         * 
         * 
         */
        public List<WeChatDocType> getDocument() {
            if (document == null) {
                document = new ArrayList<WeChatDocType>();
            }
            return this.document;
        }

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
     *       &lt;sequence>
     *         &lt;element name="StartText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="BodyText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="ClosingText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UserName" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="SeatNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FlightNumber" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FlightRoute" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="DepartureDateTime" type="{http://www.w3.org/2001/XMLSchema}dateTime" minOccurs="0"/>
     *         &lt;element name="OrderStatus" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="OrderID" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="FlightSegmentsText" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "startText",
        "bodyText",
        "closingText",
        "userName",
        "seatNumber",
        "flightNumber",
        "flightRoute",
        "departureDateTime",
        "orderStatus",
        "orderID",
        "flightSegmentsText"
    })
    public static class Template {

        @XmlElement(name = "StartText")
        protected String startText;
        @XmlElement(name = "BodyText")
        protected String bodyText;
        @XmlElement(name = "ClosingText")
        protected String closingText;
        @XmlElement(name = "UserName")
        protected String userName;
        @XmlElement(name = "SeatNumber")
        protected String seatNumber;
        @XmlElement(name = "FlightNumber")
        protected String flightNumber;
        @XmlElement(name = "FlightRoute")
        protected String flightRoute;
        @XmlElement(name = "DepartureDateTime")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar departureDateTime;
        @XmlElement(name = "OrderStatus")
        protected String orderStatus;
        @XmlElement(name = "OrderID")
        protected String orderID;
        @XmlElement(name = "FlightSegmentsText")
        protected String flightSegmentsText;
        @XmlAttribute(name = "Code")
        protected String code;

        /**
         * 获取startText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getStartText() {
            return startText;
        }

        /**
         * 设置startText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setStartText(String value) {
            this.startText = value;
        }

        /**
         * 获取bodyText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getBodyText() {
            return bodyText;
        }

        /**
         * 设置bodyText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setBodyText(String value) {
            this.bodyText = value;
        }

        /**
         * 获取closingText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getClosingText() {
            return closingText;
        }

        /**
         * 设置closingText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setClosingText(String value) {
            this.closingText = value;
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
         * 获取seatNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSeatNumber() {
            return seatNumber;
        }

        /**
         * 设置seatNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSeatNumber(String value) {
            this.seatNumber = value;
        }

        /**
         * 获取flightNumber属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightNumber() {
            return flightNumber;
        }

        /**
         * 设置flightNumber属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightNumber(String value) {
            this.flightNumber = value;
        }

        /**
         * 获取flightRoute属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightRoute() {
            return flightRoute;
        }

        /**
         * 设置flightRoute属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightRoute(String value) {
            this.flightRoute = value;
        }

        /**
         * 获取departureDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getDepartureDateTime() {
            return departureDateTime;
        }

        /**
         * 设置departureDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setDepartureDateTime(XMLGregorianCalendar value) {
            this.departureDateTime = value;
        }

        /**
         * 获取orderStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderStatus() {
            return orderStatus;
        }

        /**
         * 设置orderStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderStatus(String value) {
            this.orderStatus = value;
        }

        /**
         * 获取orderID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderID() {
            return orderID;
        }

        /**
         * 设置orderID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderID(String value) {
            this.orderID = value;
        }

        /**
         * 获取flightSegmentsText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFlightSegmentsText() {
            return flightSegmentsText;
        }

        /**
         * 设置flightSegmentsText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFlightSegmentsText(String value) {
            this.flightSegmentsText = value;
        }

        /**
         * 获取code属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCode() {
            return code;
        }

        /**
         * 设置code属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCode(String value) {
            this.code = value;
        }

    }

}
