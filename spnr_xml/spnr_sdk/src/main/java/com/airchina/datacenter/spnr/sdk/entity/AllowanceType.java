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
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;


/**
 * <p>AllowanceType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="AllowanceType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}CoreBagAllowanceType">
 *       &lt;sequence>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}TravelerIDRef" maxOccurs="unbounded"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}SegmentIDRef" maxOccurs="unbounded"/>
 *         &lt;element name="TicketBox" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>BagAllowType">
 *                 &lt;attribute name="Concept" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="BookingInstructions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
 *                   &lt;element name="UpgradeMethod" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
 *                           &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Piece" type="{http://www.opentravel.org/OTA/2003/05}BaggagePieceType" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Attributes" minOccurs="0"/>
 *         &lt;element name="S5" type="{http://www.opentravel.org/OTA/2003/05}S5Type" minOccurs="0"/>
 *         &lt;element name="S7" type="{http://www.opentravel.org/OTA/2003/05}S7Type" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}Diagnostics" minOccurs="0"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}FlightSegmentNumber" maxOccurs="unbounded" minOccurs="0"/>
 *         &lt;element name="MaxDimensions" type="{http://www.opentravel.org/OTA/2003/05}SPNRBaggageDimensionsType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}AllowanceAttributes"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "AllowanceType", propOrder = {
    "travelerIDRef",
    "segmentIDRef",
    "ticketBox",
    "bookingInstructions",
    "piece",
    "attributes",
    "s5",
    "s7",
    "diagnostics",
    "flightSegmentNumber",
    "maxDimensions"
})
public class AllowanceType
    extends CoreBagAllowanceType
{

    @XmlElement(name = "TravelerIDRef", required = true)
    protected List<TravelerIDRefType> travelerIDRef;
    @XmlElement(name = "SegmentIDRef", required = true)
    protected List<SegmentIDRefType> segmentIDRef;
    @XmlElement(name = "TicketBox")
    protected AllowanceType.TicketBox ticketBox;
    @XmlElement(name = "BookingInstructions")
    protected AllowanceType.BookingInstructions bookingInstructions;
    @XmlElement(name = "Piece")
    protected List<BaggagePieceType> piece;
    @XmlElement(name = "Attributes")
    protected AttributesType attributes;
    @XmlElement(name = "S5")
    protected S5Type s5;
    @XmlElement(name = "S7")
    protected S7Type s7;
    @XmlElement(name = "Diagnostics")
    protected DiagnosticsType diagnostics;
    @XmlElement(name = "FlightSegmentNumber")
    protected List<FlightNumberNodeType> flightSegmentNumber;
    @XmlElement(name = "MaxDimensions")
    protected SPNRBaggageDimensionsType maxDimensions;
    @XmlAttribute(name = "BookingChannel")
    protected String bookingChannel;
    @XmlAttribute(name = "ServiceType")
    protected String serviceType;
    @XmlAttribute(name = "ServiceCode")
    protected String serviceCode;
    @XmlAttribute(name = "SubCode")
    protected String subCode;
    @XmlAttribute(name = "FQTVNumber")
    protected String fqtvNumber;
    @XmlAttribute(name = "FQTVStatus")
    protected String fqtvStatus;
    @XmlAttribute(name = "FlightNumber")
    protected String flightNumber;

    /**
     * Gets the value of the travelerIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the travelerIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getTravelerIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link TravelerIDRefType }
     * 
     * 
     */
    public List<TravelerIDRefType> getTravelerIDRef() {
        if (travelerIDRef == null) {
            travelerIDRef = new ArrayList<TravelerIDRefType>();
        }
        return this.travelerIDRef;
    }

    /**
     * Gets the value of the segmentIDRef property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the segmentIDRef property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getSegmentIDRef().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link SegmentIDRefType }
     * 
     * 
     */
    public List<SegmentIDRefType> getSegmentIDRef() {
        if (segmentIDRef == null) {
            segmentIDRef = new ArrayList<SegmentIDRefType>();
        }
        return this.segmentIDRef;
    }

    /**
     * 获取ticketBox属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AllowanceType.TicketBox }
     *     
     */
    public AllowanceType.TicketBox getTicketBox() {
        return ticketBox;
    }

    /**
     * 设置ticketBox属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceType.TicketBox }
     *     
     */
    public void setTicketBox(AllowanceType.TicketBox value) {
        this.ticketBox = value;
    }

    /**
     * 获取bookingInstructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AllowanceType.BookingInstructions }
     *     
     */
    public AllowanceType.BookingInstructions getBookingInstructions() {
        return bookingInstructions;
    }

    /**
     * 设置bookingInstructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AllowanceType.BookingInstructions }
     *     
     */
    public void setBookingInstructions(AllowanceType.BookingInstructions value) {
        this.bookingInstructions = value;
    }

    /**
     * Gets the value of the piece property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the piece property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getPiece().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link BaggagePieceType }
     * 
     * 
     */
    public List<BaggagePieceType> getPiece() {
        if (piece == null) {
            piece = new ArrayList<BaggagePieceType>();
        }
        return this.piece;
    }

    /**
     * 获取attributes属性的值。
     * 
     * @return
     *     possible object is
     *     {@link AttributesType }
     *     
     */
    public AttributesType getAttributes() {
        return attributes;
    }

    /**
     * 设置attributes属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link AttributesType }
     *     
     */
    public void setAttributes(AttributesType value) {
        this.attributes = value;
    }

    /**
     * 获取s5属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S5Type }
     *     
     */
    public S5Type getS5() {
        return s5;
    }

    /**
     * 设置s5属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S5Type }
     *     
     */
    public void setS5(S5Type value) {
        this.s5 = value;
    }

    /**
     * 获取s7属性的值。
     * 
     * @return
     *     possible object is
     *     {@link S7Type }
     *     
     */
    public S7Type getS7() {
        return s7;
    }

    /**
     * 设置s7属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link S7Type }
     *     
     */
    public void setS7(S7Type value) {
        this.s7 = value;
    }

    /**
     * 获取diagnostics属性的值。
     * 
     * @return
     *     possible object is
     *     {@link DiagnosticsType }
     *     
     */
    public DiagnosticsType getDiagnostics() {
        return diagnostics;
    }

    /**
     * 设置diagnostics属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link DiagnosticsType }
     *     
     */
    public void setDiagnostics(DiagnosticsType value) {
        this.diagnostics = value;
    }

    /**
     * Gets the value of the flightSegmentNumber property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the flightSegmentNumber property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getFlightSegmentNumber().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link FlightNumberNodeType }
     * 
     * 
     */
    public List<FlightNumberNodeType> getFlightSegmentNumber() {
        if (flightSegmentNumber == null) {
            flightSegmentNumber = new ArrayList<FlightNumberNodeType>();
        }
        return this.flightSegmentNumber;
    }

    /**
     * 获取maxDimensions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link SPNRBaggageDimensionsType }
     *     
     */
    public SPNRBaggageDimensionsType getMaxDimensions() {
        return maxDimensions;
    }

    /**
     * 设置maxDimensions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link SPNRBaggageDimensionsType }
     *     
     */
    public void setMaxDimensions(SPNRBaggageDimensionsType value) {
        this.maxDimensions = value;
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
     * 获取serviceType属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceType() {
        return serviceType;
    }

    /**
     * 设置serviceType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceType(String value) {
        this.serviceType = value;
    }

    /**
     * 获取serviceCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getServiceCode() {
        return serviceCode;
    }

    /**
     * 设置serviceCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setServiceCode(String value) {
        this.serviceCode = value;
    }

    /**
     * 获取subCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getSubCode() {
        return subCode;
    }

    /**
     * 设置subCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setSubCode(String value) {
        this.subCode = value;
    }

    /**
     * 获取fqtvNumber属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQTVNumber() {
        return fqtvNumber;
    }

    /**
     * 设置fqtvNumber属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQTVNumber(String value) {
        this.fqtvNumber = value;
    }

    /**
     * 获取fqtvStatus属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFQTVStatus() {
        return fqtvStatus;
    }

    /**
     * 设置fqtvStatus属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFQTVStatus(String value) {
        this.fqtvStatus = value;
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
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;complexContent>
     *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *       &lt;sequence>
     *         &lt;element name="SSRCode" type="{http://www.opentravel.org/OTA/2003/05}SSRCodeType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="OSIText" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Method" type="{http://www.w3.org/2001/XMLSchema}string" minOccurs="0"/>
     *         &lt;element name="UpgradeMethod" minOccurs="0">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
     *                 &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="Text" type="{http://www.opentravel.org/OTA/2003/05}FreeFormTextType" maxOccurs="unbounded" minOccurs="0"/>
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
        "ssrCode",
        "osiText",
        "method",
        "upgradeMethod",
        "text"
    })
    public static class BookingInstructions {

        @XmlElement(name = "SSRCode")
        protected List<String> ssrCode;
        @XmlElement(name = "OSIText")
        protected List<String> osiText;
        @XmlElement(name = "Method")
        protected String method;
        @XmlElement(name = "UpgradeMethod")
        protected AllowanceType.BookingInstructions.UpgradeMethod upgradeMethod;
        @XmlElement(name = "Text")
        protected List<String> text;

        /**
         * Gets the value of the ssrCode property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the ssrCode property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getSSRCode().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getSSRCode() {
            if (ssrCode == null) {
                ssrCode = new ArrayList<String>();
            }
            return this.ssrCode;
        }

        /**
         * Gets the value of the osiText property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the osiText property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getOSIText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getOSIText() {
            if (osiText == null) {
                osiText = new ArrayList<String>();
            }
            return this.osiText;
        }

        /**
         * 获取method属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMethod() {
            return method;
        }

        /**
         * 设置method属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMethod(String value) {
            this.method = value;
        }

        /**
         * 获取upgradeMethod属性的值。
         * 
         * @return
         *     possible object is
         *     {@link AllowanceType.BookingInstructions.UpgradeMethod }
         *     
         */
        public AllowanceType.BookingInstructions.UpgradeMethod getUpgradeMethod() {
            return upgradeMethod;
        }

        /**
         * 设置upgradeMethod属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link AllowanceType.BookingInstructions.UpgradeMethod }
         *     
         */
        public void setUpgradeMethod(AllowanceType.BookingInstructions.UpgradeMethod value) {
            this.upgradeMethod = value;
        }

        /**
         * Gets the value of the text property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the text property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getText().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getText() {
            if (text == null) {
                text = new ArrayList<String>();
            }
            return this.text;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.w3.org/2001/XMLSchema>string">
         *       &lt;attribute name="NewClass" type="{http://www.opentravel.org/OTA/2003/05}FlightCOSType" />
         *     &lt;/extension>
         *   &lt;/simpleContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "", propOrder = {
            "value"
        })
        public static class UpgradeMethod {

            @XmlValue
            protected String value;
            @XmlAttribute(name = "NewClass")
            protected String newClass;

            /**
             * 获取value属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setValue(String value) {
                this.value = value;
            }

            /**
             * 获取newClass属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getNewClass() {
                return newClass;
            }

            /**
             * 设置newClass属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setNewClass(String value) {
                this.newClass = value;
            }

        }

    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>BagAllowType">
     *       &lt;attribute name="Concept" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class TicketBox {

        @XmlValue
        protected String value;
        @XmlAttribute(name = "Concept")
        protected String concept;

        /**
         * Select a value from the enumerated list or enter a BAGGAGE WEIGHT LIMIT string value.
         *  =enumerated values=
         * PC = PER PIECE
         *  1PC = 1 PEICE
         *  2PC = 2 PIECES
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValue() {
            return value;
        }

        /**
         * 设置value属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValue(String value) {
            this.value = value;
        }

        /**
         * 获取concept属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getConcept() {
            return concept;
        }

        /**
         * 设置concept属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setConcept(String value) {
            this.concept = value;
        }

    }

}
