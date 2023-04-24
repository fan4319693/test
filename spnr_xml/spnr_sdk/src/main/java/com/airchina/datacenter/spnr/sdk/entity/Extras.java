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
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlType;
import javax.xml.datatype.XMLGregorianCalendar;


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
 *         &lt;element name="Extra" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" maxOccurs="unbounded" minOccurs="0"/>
 *                   &lt;element name="Tax" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="SellTax" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                           &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                           &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                   &lt;element name="ChildAmounts" type="{http://www.opentravel.org/OTA/2003/05}ChildAmountType" minOccurs="0"/>
 *                   &lt;element name="Rooms" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                                   &lt;/restriction>
 *                                 &lt;/complexContent>
 *                               &lt;/complexType>
 *                             &lt;/element>
 *                           &lt;/sequence>
 *                         &lt;/restriction>
 *                       &lt;/complexContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/sequence>
 *                 &lt;attribute name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
 *                 &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *                 &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
 *                 &lt;attribute name="SellPrice" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="OriginalSellPrice" type="{http://www.w3.org/2001/XMLSchema}float" />
 *                 &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
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
    "extra"
})
@XmlRootElement(name = "Extras")
public class Extras {

    @XmlElement(name = "Extra", required = true)
    protected List<Extras.Extra> extra;

    /**
     * Gets the value of the extra property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the extra property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getExtra().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link Extras.Extra }
     * 
     * 
     */
    public List<Extras.Extra> getExtra() {
        if (extra == null) {
            extra = new ArrayList<Extras.Extra>();
        }
        return this.extra;
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
     *         &lt;element name="Description" type="{http://www.opentravel.org/OTA/2003/05}MultimediaDescriptionsType" maxOccurs="unbounded" minOccurs="0"/>
     *         &lt;element name="Tax" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="SellTax" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                 &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                 &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *         &lt;element name="ChildAmounts" type="{http://www.opentravel.org/OTA/2003/05}ChildAmountType" minOccurs="0"/>
     *         &lt;element name="Rooms" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *                         &lt;/restriction>
     *                       &lt;/complexContent>
     *                     &lt;/complexType>
     *                   &lt;/element>
     *                 &lt;/sequence>
     *               &lt;/restriction>
     *             &lt;/complexContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/sequence>
     *       &lt;attribute name="OriginalPrice" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="OriginalCurrencyCode" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="Code" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="CurrencyCode" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="End" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Start" use="required" type="{http://www.w3.org/2001/XMLSchema}date" />
     *       &lt;attribute name="Name" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Prepaid" type="{http://www.w3.org/2001/XMLSchema}boolean" />
     *       &lt;attribute name="Price" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="Type" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
     *       &lt;attribute name="SellPrice" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="OriginalSellPrice" type="{http://www.w3.org/2001/XMLSchema}float" />
     *       &lt;attribute name="SupplierAmount" type="{http://www.w3.org/2001/XMLSchema}float" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "description",
        "tax",
        "sellTax",
        "childAmounts",
        "rooms"
    })
    public static class Extra {

        @XmlElement(name = "Description")
        protected List<MultimediaDescriptionsType> description;
        @XmlElement(name = "Tax")
        protected Extras.Extra.Tax tax;
        @XmlElement(name = "SellTax")
        protected Extras.Extra.SellTax sellTax;
        @XmlElement(name = "ChildAmounts")
        protected ChildAmountType childAmounts;
        @XmlElement(name = "Rooms")
        protected Extras.Extra.Rooms rooms;
        @XmlAttribute(name = "OriginalPrice")
        @XmlSchemaType(name = "anySimpleType")
        protected String originalPrice;
        @XmlAttribute(name = "OriginalCurrencyCode")
        @XmlSchemaType(name = "anySimpleType")
        protected String originalCurrencyCode;
        @XmlAttribute(name = "Code", required = true)
        protected String code;
        @XmlAttribute(name = "CurrencyCode")
        protected String currencyCode;
        @XmlAttribute(name = "End", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar end;
        @XmlAttribute(name = "Start", required = true)
        @XmlSchemaType(name = "date")
        protected XMLGregorianCalendar start;
        @XmlAttribute(name = "Name", required = true)
        protected String name;
        @XmlAttribute(name = "Prepaid")
        protected Boolean prepaid;
        @XmlAttribute(name = "Price")
        protected Float price;
        @XmlAttribute(name = "Type")
        @XmlSchemaType(name = "anySimpleType")
        protected String type;
        @XmlAttribute(name = "SellPrice")
        protected Float sellPrice;
        @XmlAttribute(name = "OriginalSellPrice")
        protected Float originalSellPrice;
        @XmlAttribute(name = "SupplierAmount")
        protected Float supplierAmount;

        /**
         * Gets the value of the description property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the description property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getDescription().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link MultimediaDescriptionsType }
         * 
         * 
         */
        public List<MultimediaDescriptionsType> getDescription() {
            if (description == null) {
                description = new ArrayList<MultimediaDescriptionsType>();
            }
            return this.description;
        }

        /**
         * 获取tax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Extras.Extra.Tax }
         *     
         */
        public Extras.Extra.Tax getTax() {
            return tax;
        }

        /**
         * 设置tax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Extras.Extra.Tax }
         *     
         */
        public void setTax(Extras.Extra.Tax value) {
            this.tax = value;
        }

        /**
         * 获取sellTax属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Extras.Extra.SellTax }
         *     
         */
        public Extras.Extra.SellTax getSellTax() {
            return sellTax;
        }

        /**
         * 设置sellTax属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Extras.Extra.SellTax }
         *     
         */
        public void setSellTax(Extras.Extra.SellTax value) {
            this.sellTax = value;
        }

        /**
         * 获取childAmounts属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ChildAmountType }
         *     
         */
        public ChildAmountType getChildAmounts() {
            return childAmounts;
        }

        /**
         * 设置childAmounts属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ChildAmountType }
         *     
         */
        public void setChildAmounts(ChildAmountType value) {
            this.childAmounts = value;
        }

        /**
         * 获取rooms属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Extras.Extra.Rooms }
         *     
         */
        public Extras.Extra.Rooms getRooms() {
            return rooms;
        }

        /**
         * 设置rooms属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Extras.Extra.Rooms }
         *     
         */
        public void setRooms(Extras.Extra.Rooms value) {
            this.rooms = value;
        }

        /**
         * 获取originalPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalPrice() {
            return originalPrice;
        }

        /**
         * 设置originalPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalPrice(String value) {
            this.originalPrice = value;
        }

        /**
         * 获取originalCurrencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOriginalCurrencyCode() {
            return originalCurrencyCode;
        }

        /**
         * 设置originalCurrencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOriginalCurrencyCode(String value) {
            this.originalCurrencyCode = value;
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

        /**
         * 获取currencyCode属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getCurrencyCode() {
            return currencyCode;
        }

        /**
         * 设置currencyCode属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setCurrencyCode(String value) {
            this.currencyCode = value;
        }

        /**
         * 获取end属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getEnd() {
            return end;
        }

        /**
         * 设置end属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setEnd(XMLGregorianCalendar value) {
            this.end = value;
        }

        /**
         * 获取start属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStart() {
            return start;
        }

        /**
         * 设置start属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStart(XMLGregorianCalendar value) {
            this.start = value;
        }

        /**
         * 获取name属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getName() {
            return name;
        }

        /**
         * 设置name属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setName(String value) {
            this.name = value;
        }

        /**
         * 获取prepaid属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isPrepaid() {
            return prepaid;
        }

        /**
         * 设置prepaid属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setPrepaid(Boolean value) {
            this.prepaid = value;
        }

        /**
         * 获取price属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getPrice() {
            return price;
        }

        /**
         * 设置price属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setPrice(Float value) {
            this.price = value;
        }

        /**
         * 获取type属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getType() {
            return type;
        }

        /**
         * 设置type属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setType(String value) {
            this.type = value;
        }

        /**
         * 获取sellPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSellPrice() {
            return sellPrice;
        }

        /**
         * 设置sellPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSellPrice(Float value) {
            this.sellPrice = value;
        }

        /**
         * 获取originalSellPrice属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getOriginalSellPrice() {
            return originalSellPrice;
        }

        /**
         * 设置originalSellPrice属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setOriginalSellPrice(Float value) {
            this.originalSellPrice = value;
        }

        /**
         * 获取supplierAmount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Float }
         *     
         */
        public Float getSupplierAmount() {
            return supplierAmount;
        }

        /**
         * 设置supplierAmount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Float }
         *     
         */
        public void setSupplierAmount(Float value) {
            this.supplierAmount = value;
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
         *         &lt;element name="Room" maxOccurs="unbounded" minOccurs="0">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *               &lt;/restriction>
         *             &lt;/complexContent>
         *           &lt;/complexType>
         *         &lt;/element>
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
            "room"
        })
        public static class Rooms {

            @XmlElement(name = "Room")
            protected List<Extras.Extra.Rooms.Room> room;

            /**
             * Gets the value of the room property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the room property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getRoom().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link Extras.Extra.Rooms.Room }
             * 
             * 
             */
            public List<Extras.Extra.Rooms.Room> getRoom() {
                if (room == null) {
                    room = new ArrayList<Extras.Extra.Rooms.Room>();
                }
                return this.room;
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
             *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Room {

                @XmlAttribute(name = "Code")
                @XmlSchemaType(name = "anySimpleType")
                protected String code;

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


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;complexContent>
         *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *       &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class SellTax {

            @XmlAttribute(name = "OriginalAmount")
            @XmlSchemaType(name = "anySimpleType")
            protected String originalAmount;
            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "Code")
            protected Integer code;
            @XmlAttribute(name = "TaxOption")
            protected Integer taxOption;

            /**
             * 获取originalAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalAmount() {
                return originalAmount;
            }

            /**
             * 设置originalAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalAmount(String value) {
                this.originalAmount = value;
            }

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmount(Float value) {
                this.amount = value;
            }

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCode(Integer value) {
                this.code = value;
            }

            /**
             * 获取taxOption属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTaxOption() {
                return taxOption;
            }

            /**
             * 设置taxOption属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTaxOption(Integer value) {
                this.taxOption = value;
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
         *       &lt;attribute name="OriginalAmount" type="{http://www.w3.org/2001/XMLSchema}anySimpleType" />
         *       &lt;attribute name="Amount" type="{http://www.w3.org/2001/XMLSchema}float" />
         *       &lt;attribute name="Code" type="{http://www.w3.org/2001/XMLSchema}int" />
         *       &lt;attribute name="TaxOption" type="{http://www.w3.org/2001/XMLSchema}int" />
         *     &lt;/restriction>
         *   &lt;/complexContent>
         * &lt;/complexType>
         * </pre>
         * 
         * 
         */
        @XmlAccessorType(XmlAccessType.FIELD)
        @XmlType(name = "")
        public static class Tax {

            @XmlAttribute(name = "OriginalAmount")
            @XmlSchemaType(name = "anySimpleType")
            protected String originalAmount;
            @XmlAttribute(name = "Amount")
            protected Float amount;
            @XmlAttribute(name = "Code")
            protected Integer code;
            @XmlAttribute(name = "TaxOption")
            protected Integer taxOption;

            /**
             * 获取originalAmount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOriginalAmount() {
                return originalAmount;
            }

            /**
             * 设置originalAmount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOriginalAmount(String value) {
                this.originalAmount = value;
            }

            /**
             * 获取amount属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Float }
             *     
             */
            public Float getAmount() {
                return amount;
            }

            /**
             * 设置amount属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Float }
             *     
             */
            public void setAmount(Float value) {
                this.amount = value;
            }

            /**
             * 获取code属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getCode() {
                return code;
            }

            /**
             * 设置code属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setCode(Integer value) {
                this.code = value;
            }

            /**
             * 获取taxOption属性的值。
             * 
             * @return
             *     possible object is
             *     {@link Integer }
             *     
             */
            public Integer getTaxOption() {
                return taxOption;
            }

            /**
             * 设置taxOption属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link Integer }
             *     
             */
            public void setTaxOption(Integer value) {
                this.taxOption = value;
            }

        }

    }

}
