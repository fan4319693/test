//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlType;


/**
 * Voucher import history type.
 * 
 * <p>OJVoucherImportHistoryType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OJVoucherImportHistoryType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;attribute name="ImportId" use="required" type="{http://www.w3.org/2001/XMLSchema}long" />
 *       &lt;attribute name="FileName" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *       &lt;attribute name="Imported" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Failed" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *       &lt;attribute name="Duplicated" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OJVoucherImportHistoryType")
public class OJVoucherImportHistoryType {

    @XmlAttribute(name = "ImportId", required = true)
    protected long importId;
    @XmlAttribute(name = "FileName", required = true)
    protected String fileName;
    @XmlAttribute(name = "Imported", required = true)
    protected int imported;
    @XmlAttribute(name = "Failed", required = true)
    protected int failed;
    @XmlAttribute(name = "Duplicated", required = true)
    protected int duplicated;

    /**
     * 获取importId属性的值。
     * 
     */
    public long getImportId() {
        return importId;
    }

    /**
     * 设置importId属性的值。
     * 
     */
    public void setImportId(long value) {
        this.importId = value;
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
     * 获取imported属性的值。
     * 
     */
    public int getImported() {
        return imported;
    }

    /**
     * 设置imported属性的值。
     * 
     */
    public void setImported(int value) {
        this.imported = value;
    }

    /**
     * 获取failed属性的值。
     * 
     */
    public int getFailed() {
        return failed;
    }

    /**
     * 设置failed属性的值。
     * 
     */
    public void setFailed(int value) {
        this.failed = value;
    }

    /**
     * 获取duplicated属性的值。
     * 
     */
    public int getDuplicated() {
        return duplicated;
    }

    /**
     * 设置duplicated属性的值。
     * 
     */
    public void setDuplicated(int value) {
        this.duplicated = value;
    }

}
