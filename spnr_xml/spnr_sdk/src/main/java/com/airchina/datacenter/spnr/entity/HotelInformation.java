//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlRootElement;
import javax.xml.bind.annotation.XmlType;


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
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}propertyType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}hotelName"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}locationType"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}roomRating"/>
 *         &lt;element ref="{http://www.opentravel.org/OTA/2003/05}hotelChain"/>
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
    "propertyType",
    "hotelName",
    "locationType",
    "roomRating",
    "hotelChain"
})
@XmlRootElement(name = "HotelInformation")
public class HotelInformation {

    @XmlElement(required = true)
    protected PropertyType propertyType;
    @XmlElement(required = true)
    protected HotelName hotelName;
    @XmlElement(required = true)
    protected LocationTypeFromSearchHotel locationType;
    protected byte roomRating;
    @XmlElement(required = true)
    protected HotelChain hotelChain;

    /**
     * Defines the type of property required. e.g. villa, aoartment, hotel... Allowed values in this field are any configured in the PropertyClassType itemlist used by xHotel.  By Default this will be configured in the "\itemlists\OTACodes" directory in the editor.
     * 
     * @return
     *     possible object is
     *     {@link PropertyType }
     *     
     */
    public PropertyType getPropertyType() {
        return propertyType;
    }

    /**
     * 设置propertyType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link PropertyType }
     *     
     */
    public void setPropertyType(PropertyType value) {
        this.propertyType = value;
    }

    /**
     * The name of the preferred hotel if any.
     * 
     * @return
     *     possible object is
     *     {@link HotelName }
     *     
     */
    public HotelName getHotelName() {
        return hotelName;
    }

    /**
     * 设置hotelName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelName }
     *     
     */
    public void setHotelName(HotelName value) {
        this.hotelName = value;
    }

    /**
     * Defines the type of area that the property is required in.  e.g. Beach, Airport or Lake.  Allowed values in this field are any configured in the LocationCategoryCodes itemlist used by xHotel.  By Default this will be configured in the "\itemlists\OTACodes" directory in the editor.
     * 
     * @return
     *     possible object is
     *     {@link LocationTypeFromSearchHotel }
     *     
     */
    public LocationTypeFromSearchHotel getLocationType() {
        return locationType;
    }

    /**
     * 设置locationType属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link LocationTypeFromSearchHotel }
     *     
     */
    public void setLocationType(LocationTypeFromSearchHotel value) {
        this.locationType = value;
    }

    /**
     * Rate from 0 - 5. 5 means you are very satisfied
     * 
     */
    public byte getRoomRating() {
        return roomRating;
    }

    /**
     * 设置roomRating属性的值。
     * 
     */
    public void setRoomRating(byte value) {
        this.roomRating = value;
    }

    /**
     * If hotel is chain hotel. Will require a chain code to proceed.
     * 
     * @return
     *     possible object is
     *     {@link HotelChain }
     *     
     */
    public HotelChain getHotelChain() {
        return hotelChain;
    }

    /**
     * 设置hotelChain属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link HotelChain }
     *     
     */
    public void setHotelChain(HotelChain value) {
        this.hotelChain = value;
    }

}
