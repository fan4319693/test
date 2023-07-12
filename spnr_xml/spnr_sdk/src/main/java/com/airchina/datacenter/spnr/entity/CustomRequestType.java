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
 *  =notes=
 * 				1. Multiple sources may return a separate 'Error' node with their own CustomRequest request.
 * 				2. The UI must display one screen at a time and respond to each with a separate message.
 * 
 * <p>CustomRequestType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="CustomRequestType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="DialogTitle" type="{http://www.w3.org/2001/XMLSchema}string"/>
 *         &lt;element name="Instructions" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
 *                 &lt;/sequence>
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Control" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
 *                 &lt;/sequence>
 *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="GUILabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="PNRLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MouseOverText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Mandatory" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="SameLine" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
 *                 &lt;attribute name="Pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MinChar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="MaxChar" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="Button" maxOccurs="unbounded">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;attribute name="ButtonLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Validate" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
 *                 &lt;attribute name="MouseOverText" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="OrigMsg" type="{http://www.opentravel.org/OTA/2003/05}MessageStructureType"/>
 *         &lt;element name="Reference" type="{http://www.opentravel.org/OTA/2003/05}MessageStructureType" minOccurs="0"/>
 *       &lt;/sequence>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "CustomRequestType", propOrder = {
    "dialogTitle",
    "instructions",
    "control",
    "button",
    "origMsg",
    "reference"
})
public class CustomRequestType {

    @XmlElement(name = "DialogTitle", required = true)
    protected String dialogTitle;
    @XmlElement(name = "Instructions")
    protected CustomRequestType.Instructions instructions;
    @XmlElement(name = "Control", required = true)
    protected List<CustomRequestType.Control> control;
    @XmlElement(name = "Button", required = true)
    protected List<CustomRequestType.Button> button;
    @XmlElement(name = "OrigMsg", required = true)
    protected MessageStructureType origMsg;
    @XmlElement(name = "Reference")
    protected MessageStructureType reference;

    /**
     * 获取dialogTitle属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getDialogTitle() {
        return dialogTitle;
    }

    /**
     * 设置dialogTitle属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setDialogTitle(String value) {
        this.dialogTitle = value;
    }

    /**
     * 获取instructions属性的值。
     * 
     * @return
     *     possible object is
     *     {@link CustomRequestType.Instructions }
     *     
     */
    public CustomRequestType.Instructions getInstructions() {
        return instructions;
    }

    /**
     * 设置instructions属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link CustomRequestType.Instructions }
     *     
     */
    public void setInstructions(CustomRequestType.Instructions value) {
        this.instructions = value;
    }

    /**
     * Gets the value of the control property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the control property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getControl().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomRequestType.Control }
     * 
     * 
     */
    public List<CustomRequestType.Control> getControl() {
        if (control == null) {
            control = new ArrayList<CustomRequestType.Control>();
        }
        return this.control;
    }

    /**
     * Gets the value of the button property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the button property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getButton().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link CustomRequestType.Button }
     * 
     * 
     */
    public List<CustomRequestType.Button> getButton() {
        if (button == null) {
            button = new ArrayList<CustomRequestType.Button>();
        }
        return this.button;
    }

    /**
     * 获取origMsg属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageStructureType }
     *     
     */
    public MessageStructureType getOrigMsg() {
        return origMsg;
    }

    /**
     * 设置origMsg属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStructureType }
     *     
     */
    public void setOrigMsg(MessageStructureType value) {
        this.origMsg = value;
    }

    /**
     * 获取reference属性的值。
     * 
     * @return
     *     possible object is
     *     {@link MessageStructureType }
     *     
     */
    public MessageStructureType getReference() {
        return reference;
    }

    /**
     * 设置reference属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link MessageStructureType }
     *     
     */
    public void setReference(MessageStructureType value) {
        this.reference = value;
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
     *       &lt;attribute name="ButtonLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Validate" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" default="N" />
     *       &lt;attribute name="MouseOverText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "")
    public static class Button {

        @XmlAttribute(name = "ButtonLabel", required = true)
        protected String buttonLabel;
        @XmlAttribute(name = "Validate")
        protected String validate;
        @XmlAttribute(name = "MouseOverText")
        protected String mouseOverText;
        @XmlAttribute(name = "Width")
        protected String width;

        /**
         * 获取buttonLabel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getButtonLabel() {
            return buttonLabel;
        }

        /**
         * 设置buttonLabel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setButtonLabel(String value) {
            this.buttonLabel = value;
        }

        /**
         * 获取validate属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getValidate() {
            if (validate == null) {
                return "N";
            } else {
                return validate;
            }
        }

        /**
         * 设置validate属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setValidate(String value) {
            this.validate = value;
        }

        /**
         * 获取mouseOverText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMouseOverText() {
            return mouseOverText;
        }

        /**
         * 设置mouseOverText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMouseOverText(String value) {
            this.mouseOverText = value;
        }

        /**
         * 获取width属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidth() {
            return width;
        }

        /**
         * 设置width属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidth(String value) {
            this.width = value;
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
     *         &lt;element name="Value" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded" minOccurs="0"/>
     *       &lt;/sequence>
     *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="GUILabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="PNRLabel" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MouseOverText" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Mandatory" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *       &lt;attribute name="Width" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="SameLine" type="{http://www.opentravel.org/OTA/2003/05}ChoiceType" />
     *       &lt;attribute name="Pattern" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MinChar" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="MaxChar" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "value"
    })
    public static class Control {

        @XmlElement(name = "Value")
        protected List<String> value;
        @XmlAttribute(name = "Type", required = true)
        protected String type;
        @XmlAttribute(name = "GUILabel", required = true)
        protected String guiLabel;
        @XmlAttribute(name = "PNRLabel", required = true)
        protected String pnrLabel;
        @XmlAttribute(name = "MouseOverText")
        protected String mouseOverText;
        @XmlAttribute(name = "Mandatory")
        protected String mandatory;
        @XmlAttribute(name = "Width")
        protected String width;
        @XmlAttribute(name = "SameLine")
        protected String sameLine;
        @XmlAttribute(name = "Pattern")
        protected String pattern;
        @XmlAttribute(name = "MinChar")
        protected String minChar;
        @XmlAttribute(name = "MaxChar")
        protected String maxChar;

        /**
         * Gets the value of the value property.
         * 
         * <p>
         * This accessor method returns a reference to the live list,
         * not a snapshot. Therefore any modification you make to the
         * returned list will be present inside the JAXB object.
         * This is why there is not a <CODE>set</CODE> method for the value property.
         * 
         * <p>
         * For example, to add a new item, do as follows:
         * <pre>
         *    getValue().add(newItem);
         * </pre>
         * 
         * 
         * <p>
         * Objects of the following type(s) are allowed in the list
         * {@link String }
         * 
         * 
         */
        public List<String> getValue() {
            if (value == null) {
                value = new ArrayList<String>();
            }
            return this.value;
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
         * 获取guiLabel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getGUILabel() {
            return guiLabel;
        }

        /**
         * 设置guiLabel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setGUILabel(String value) {
            this.guiLabel = value;
        }

        /**
         * 获取pnrLabel属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPNRLabel() {
            return pnrLabel;
        }

        /**
         * 设置pnrLabel属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPNRLabel(String value) {
            this.pnrLabel = value;
        }

        /**
         * 获取mouseOverText属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMouseOverText() {
            return mouseOverText;
        }

        /**
         * 设置mouseOverText属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMouseOverText(String value) {
            this.mouseOverText = value;
        }

        /**
         * 获取mandatory属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMandatory() {
            return mandatory;
        }

        /**
         * 设置mandatory属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMandatory(String value) {
            this.mandatory = value;
        }

        /**
         * 获取width属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getWidth() {
            return width;
        }

        /**
         * 设置width属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setWidth(String value) {
            this.width = value;
        }

        /**
         * 获取sameLine属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getSameLine() {
            return sameLine;
        }

        /**
         * 设置sameLine属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setSameLine(String value) {
            this.sameLine = value;
        }

        /**
         * 获取pattern属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getPattern() {
            return pattern;
        }

        /**
         * 设置pattern属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setPattern(String value) {
            this.pattern = value;
        }

        /**
         * 获取minChar属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMinChar() {
            return minChar;
        }

        /**
         * 设置minChar属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMinChar(String value) {
            this.minChar = value;
        }

        /**
         * 获取maxChar属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getMaxChar() {
            return maxChar;
        }

        /**
         * 设置maxChar属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setMaxChar(String value) {
            this.maxChar = value;
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
     *         &lt;element name="Text" type="{http://www.w3.org/2001/XMLSchema}string" maxOccurs="unbounded"/>
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
        "text"
    })
    public static class Instructions {

        @XmlElement(name = "Text", required = true)
        protected List<String> text;

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

    }

}
