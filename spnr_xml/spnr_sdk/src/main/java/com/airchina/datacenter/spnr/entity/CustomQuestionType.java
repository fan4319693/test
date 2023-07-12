//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.07.06 时间 02:50:47 PM CST 
//


package com.airchina.datacenter.spnr.entity;

import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>CustomQuestionType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomQuestionType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="QuestionText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *         &lt;element name="ProvidedAnswerChoices" maxOccurs="10" minOccurs="0">
 *           &lt;complexType>
 *             &lt;simpleContent>
 *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
 *                 &lt;attribute name="AnswerID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *               &lt;/extension>
 *             &lt;/simpleContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="AnswerText" type="{http://www.opentravel.org/OTA/2003/05}FormattedTextTextType" minOccurs="0"/>
 *       &lt;/sequence>
 *       &lt;attribute name="QuestionID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
 *       &lt;attribute name="QuestionTypeCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="QuestionCategoryCode" type="{http://www.opentravel.org/OTA/2003/05}OTA_CodeType" />
 *       &lt;attribute name="AnswerRequiredInd" type="{http://www.w3.org/2001/XMLSchema}boolean" />
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomQuestionType", propOrder = {
    "questionText",
    "providedAnswerChoices",
    "answerText"
})
public class CustomQuestionType {

    @XmlElement(name = "QuestionText")
    protected FormattedTextTextType questionText;
    @XmlElement(name = "ProvidedAnswerChoices")
    protected List<CustomQuestionType.ProvidedAnswerChoices> providedAnswerChoices;
    @XmlElement(name = "AnswerText")
    protected FormattedTextTextType answerText;
    @XmlAttribute(name = "QuestionID")
    protected String questionID;
    @XmlAttribute(name = "QuestionTypeCode")
    protected String questionTypeCode;
    @XmlAttribute(name = "QuestionCategoryCode")
    protected String questionCategoryCode;
    @XmlAttribute(name = "AnswerRequiredInd")
    protected Boolean answerRequiredInd;

    /**
     * 获取questionText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getQuestionText() {
        return questionText;
    }

    /**
     * 设置questionText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setQuestionText(FormattedTextTextType value) {
        this.questionText = value;
    }

    /**
     * Gets the value of the providedAnswerChoices property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the providedAnswerChoices property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getProvidedAnswerChoices().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomQuestionType.ProvidedAnswerChoices }
     * 
     * 
     */
    public List<CustomQuestionType.ProvidedAnswerChoices> getProvidedAnswerChoices() {
        if (providedAnswerChoices == null) {
            providedAnswerChoices = new ArrayList<CustomQuestionType.ProvidedAnswerChoices>();
        }
        return this.providedAnswerChoices;
    }

    /**
     * 获取answerText属性的值。
     * 
     * @return
     *     possible object is
     *     {@link FormattedTextTextType }
     *     
     */
    public FormattedTextTextType getAnswerText() {
        return answerText;
    }

    /**
     * 设置answerText属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link FormattedTextTextType }
     *     
     */
    public void setAnswerText(FormattedTextTextType value) {
        this.answerText = value;
    }

    /**
     * 获取questionID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionID() {
        return questionID;
    }

    /**
     * 设置questionID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionID(String value) {
        this.questionID = value;
    }

    /**
     * 获取questionTypeCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionTypeCode() {
        return questionTypeCode;
    }

    /**
     * 设置questionTypeCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionTypeCode(String value) {
        this.questionTypeCode = value;
    }

    /**
     * 获取questionCategoryCode属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getQuestionCategoryCode() {
        return questionCategoryCode;
    }

    /**
     * 设置questionCategoryCode属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setQuestionCategoryCode(String value) {
        this.questionCategoryCode = value;
    }

    /**
     * 获取answerRequiredInd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link Boolean }
     *     
     */
    public Boolean isAnswerRequiredInd() {
        return answerRequiredInd;
    }

    /**
     * 设置answerRequiredInd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link Boolean }
     *     
     */
    public void setAnswerRequiredInd(Boolean value) {
        this.answerRequiredInd = value;
    }


    /**
     * <p>anonymous complex type的 Java 类。
     * 
     * <p>以下模式片段指定包含在此类中的预期内容。
     * 
     * <pre>
     * &lt;complexType>
     *   &lt;simpleContent>
     *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>FormattedTextTextType">
     *       &lt;attribute name="AnswerID" type="{http://www.opentravel.org/OTA/2003/05}StringLength1to16" />
     *     &lt;/extension>
     *   &lt;/simpleContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class ProvidedAnswerChoices
        extends FormattedTextTextType
    {

        @XmlAttribute(name = "AnswerID")
        protected String answerID;

        /**
         * 获取answerID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getAnswerID() {
            return answerID;
        }

        /**
         * 设置answerID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setAnswerID(String value) {
            this.answerID = value;
        }

    }

}
