//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2022.11.30 时间 04:39:33 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;


/**
 * Used to pass a multimedia object such as an image, and the associated details .
 * 
 * <p>MultimediaObjectType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="MultimediaObjectType">
 *   &lt;complexContent>
 *     &lt;extension base="{http://www.opentravel.org/OTA/2003/05}ParagraphType">
 *       &lt;sequence minOccurs="0">
 *         &lt;element name="ImageData">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="Format" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *       &lt;/sequence>
 *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}FileAttachmentGroup"/>
 *     &lt;/extension>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "MultimediaObjectType", propOrder = {
    "imageData"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.sdk.entity.MultimediaObjectsType.MultimediaObject.class,
    com.airchina.datacenter.spnr.sdk.entity.HotelInfoType.Descriptions.Description.class
})
public class MultimediaObjectType
    extends ParagraphType
{

    @XmlElement(name = "ImageData")
    protected MultimediaObjectType.ImageData imageData;
    @XmlAttribute(name = "ContentData")
    protected String contentData;
    @XmlAttribute(name = "Description")
    protected String description;
    @XmlAttribute(name = "PictureCategoryCode")
    protected String pictureCategoryCode;
    @XmlAttribute(name = "Version")
    protected String version;
    @XmlAttribute(name = "ContentTitle")
    protected String contentTitle;
    @XmlAttribute(name = "ContentCaption")
    protected String contentCaption;
    @XmlAttribute(name = "CopyrightNotice")
    protected String copyrightNotice;
    @XmlAttribute(name = "FileName")
    protected String fileName;
    @XmlAttribute(name = "FileSize")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger fileSize;
    @XmlAttribute(name = "MultimediaObjectHeight")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger multimediaObjectHeight;
    @XmlAttribute(name = "MultimediaObjectWidth")
    @XmlSchemaType(name = "positiveInteger")
    protected BigInteger multimediaObjectWidth;
    @XmlAttribute(name = "UnitOfMeasureCode")
    protected String unitOfMeasureCode;
    @XmlAttribute(name = "ContentID")
    protected String contentID;
    @XmlAttribute(name = "ContentCode")
    protected String contentCode;
    @XmlAttribute(name = "ContentFormatCode")
    protected String contentFormatCode;
    @XmlAttribute(name = "RecordId")
    protected String recordId;
    @XmlAttribute(name = "CodeDetail")
    protected String codeDetail;
    @XmlAttribute(name = "Removal")
    protected Boolean removal;

    /**
     * 获取imageData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MultimediaObjectType.ImageData }
     *     
     */
    public MultimediaObjectType.ImageData getImageData() {
        return imageData;
    }

    /**
     * 设置imageData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MultimediaObjectType.ImageData }
     *     
     */
    public void setImageData(MultimediaObjectType.ImageData value) {
        this.imageData = value;
    }

    /**
     * 获取contentData属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentData() {
        return contentData;
    }

    /**
     * 设置contentData属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentData(String value) {
        this.contentData = value;
    }

    /**
     * 获取description属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDescription() {
        return description;
    }

    /**
     * 设置description属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDescription(String value) {
        this.description = value;
    }

    /**
     * 获取pictureCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getPictureCategoryCode() {
        return pictureCategoryCode;
    }

    /**
     * 设置pictureCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setPictureCategoryCode(String value) {
        this.pictureCategoryCode = value;
    }

    /**
     * 获取version属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getVersion() {
        return version;
    }

    /**
     * 设置version属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setVersion(String value) {
        this.version = value;
    }

    /**
     * 获取contentTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentTitle() {
        return contentTitle;
    }

    /**
     * 设置contentTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentTitle(String value) {
        this.contentTitle = value;
    }

    /**
     * 获取contentCaption属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCaption() {
        return contentCaption;
    }

    /**
     * 设置contentCaption属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCaption(String value) {
        this.contentCaption = value;
    }

    /**
     * 获取copyrightNotice属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCopyrightNotice() {
        return copyrightNotice;
    }

    /**
     * 设置copyrightNotice属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCopyrightNotice(String value) {
        this.copyrightNotice = value;
    }

    /**
     * 获取fileName属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getFileName() {
        return fileName;
    }

    /**
     * 设置fileName属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setFileName(String value) {
        this.fileName = value;
    }

    /**
     * 获取fileSize属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getFileSize() {
        return fileSize;
    }

    /**
     * 设置fileSize属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setFileSize(BigInteger value) {
        this.fileSize = value;
    }

    /**
     * 获取multimediaObjectHeight属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultimediaObjectHeight() {
        return multimediaObjectHeight;
    }

    /**
     * 设置multimediaObjectHeight属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultimediaObjectHeight(BigInteger value) {
        this.multimediaObjectHeight = value;
    }

    /**
     * 获取multimediaObjectWidth属性的值。
     * 
     * @return
     *     possible object is
     *     {@link BigInteger }
     *     
     */
    public BigInteger getMultimediaObjectWidth() {
        return multimediaObjectWidth;
    }

    /**
     * 设置multimediaObjectWidth属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link BigInteger }
     *     
     */
    public void setMultimediaObjectWidth(BigInteger value) {
        this.multimediaObjectWidth = value;
    }

    /**
     * 获取unitOfMeasureCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getUnitOfMeasureCode() {
        return unitOfMeasureCode;
    }

    /**
     * 设置unitOfMeasureCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setUnitOfMeasureCode(String value) {
        this.unitOfMeasureCode = value;
    }

    /**
     * 获取contentID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentID() {
        return contentID;
    }

    /**
     * 设置contentID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentID(String value) {
        this.contentID = value;
    }

    /**
     * 获取contentCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentCode() {
        return contentCode;
    }

    /**
     * 设置contentCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentCode(String value) {
        this.contentCode = value;
    }

    /**
     * 获取contentFormatCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getContentFormatCode() {
        return contentFormatCode;
    }

    /**
     * 设置contentFormatCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setContentFormatCode(String value) {
        this.contentFormatCode = value;
    }

    /**
     * 获取recordId属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getRecordId() {
        return recordId;
    }

    /**
     * 设置recordId属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setRecordId(String value) {
        this.recordId = value;
    }

    /**
     * 获取codeDetail属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getCodeDetail() {
        return codeDetail;
    }

    /**
     * 设置codeDetail属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setCodeDetail(String value) {
        this.codeDetail = value;
    }

    /**
     * 获取removal属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public boolean isRemoval() {
        if (removal == null) {
            return false;
        } else {
            return removal;
        }
    }

    /**
     * 设置removal属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setRemoval(Boolean value) {
        this.removal = value;
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
     *       &lt;attribute name="Format" use="required" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ImageData {

        @XmlAttribute(name = "Format", required = true)
        protected String format;

        /**
         * 获取format属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getFormat() {
            return format;
        }

        /**
         * 设置format属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setFormat(String value) {
            this.format = value;
        }

    }

}
