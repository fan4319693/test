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
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlSchemaType;
import javax.xml.bind.annotation.XmlSeeAlso;
import javax.xml.bind.annotation.XmlType;
import javax.xml.bind.annotation.XmlValue;
import javax.xml.datatype.XMLGregorianCalendar;


/**
 * Start and end date/ time with ontology reference.
 * 
 * <p>OntologyTimeDurationType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="OntologyTimeDurationType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;choice>
 *         &lt;element name="StartAndEnd">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;choice>
 *                   &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *                   &lt;element name="Duration">
 *                     &lt;complexType>
 *                       &lt;simpleContent>
 *                         &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
 *                           &lt;attribute name="OtherType">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                           &lt;attribute name="OntologyRefID">
 *                             &lt;simpleType>
 *                               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *                                 &lt;pattern value="[0-9]{1,8}"/>
 *                               &lt;/restriction>
 *                             &lt;/simpleType>
 *                           &lt;/attribute>
 *                         &lt;/extension>
 *                       &lt;/simpleContent>
 *                     &lt;/complexType>
 *                   &lt;/element>
 *                 &lt;/choice>
 *                 &lt;attribute name="StartDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
 *               &lt;/restriction>
 *             &lt;/complexContent>
 *           &lt;/complexType>
 *         &lt;/element>
 *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
 *       &lt;/choice>
 *       &lt;attribute name="OntologyRefID">
 *         &lt;simpleType>
 *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
 *             &lt;pattern value="[0-9]{1,8}"/>
 *           &lt;/restriction>
 *         &lt;/simpleType>
 *       &lt;/attribute>
 *     &lt;/restriction>
 *   &lt;/complexContent>
 * &lt;/complexType>
 * </pre>
 * 
 * 
 */
@XmlAccessorType(XmlAccessType.FIELD)
@XmlType(name = "OntologyTimeDurationType", propOrder = {
    "startAndEnd",
    "end"
})
@XmlSeeAlso({
    com.airchina.datacenter.spnr.entity.MultiModalOfferType.TripCharacteristics.DateTimeDuration.class
})
public class OntologyTimeDurationType {

    @XmlElement(name = "StartAndEnd")
    protected OntologyTimeDurationType.StartAndEnd startAndEnd;
    @XmlElement(name = "End")
    @XmlSchemaType(name = "dateTime")
    protected XMLGregorianCalendar end;
    @XmlAttribute(name = "OntologyRefID")
    protected String ontologyRefID;

    /**
     * 获取startAndEnd属性的值。
     * 
     * @return
     *     possible object is
     *     {@link OntologyTimeDurationType.StartAndEnd }
     *     
     */
    public OntologyTimeDurationType.StartAndEnd getStartAndEnd() {
        return startAndEnd;
    }

    /**
     * 设置startAndEnd属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link OntologyTimeDurationType.StartAndEnd }
     *     
     */
    public void setStartAndEnd(OntologyTimeDurationType.StartAndEnd value) {
        this.startAndEnd = value;
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
     * 获取ontologyRefID属性的值。
     * 
     * @return
     *     possible object is
     *     {@link String }
     *     
     */
    public String getOntologyRefID() {
        return ontologyRefID;
    }

    /**
     * 设置ontologyRefID属性的值。
     * 
     * @param value
     *     allowed object is
     *     {@link String }
     *     
     */
    public void setOntologyRefID(String value) {
        this.ontologyRefID = value;
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
     *       &lt;choice>
     *         &lt;element name="End" type="{http://www.w3.org/2001/XMLSchema}dateTime"/>
     *         &lt;element name="Duration">
     *           &lt;complexType>
     *             &lt;simpleContent>
     *               &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
     *                 &lt;attribute name="OtherType">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *                 &lt;attribute name="OntologyRefID">
     *                   &lt;simpleType>
     *                     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
     *                       &lt;pattern value="[0-9]{1,8}"/>
     *                     &lt;/restriction>
     *                   &lt;/simpleType>
     *                 &lt;/attribute>
     *               &lt;/extension>
     *             &lt;/simpleContent>
     *           &lt;/complexType>
     *         &lt;/element>
     *       &lt;/choice>
     *       &lt;attribute name="StartDateTime" use="required" type="{http://www.w3.org/2001/XMLSchema}dateTime" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "end",
        "duration"
    })
    public static class StartAndEnd {

        @XmlElement(name = "End")
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar end;
        @XmlElement(name = "Duration")
        protected OntologyTimeDurationType.StartAndEnd.Duration duration;
        @XmlAttribute(name = "StartDateTime", required = true)
        @XmlSchemaType(name = "dateTime")
        protected XMLGregorianCalendar startDateTime;

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
         * 获取duration属性的值。
         * 
         * @return
         *     possible object is
         *     {@link OntologyTimeDurationType.StartAndEnd.Duration }
         *     
         */
        public OntologyTimeDurationType.StartAndEnd.Duration getDuration() {
            return duration;
        }

        /**
         * 设置duration属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link OntologyTimeDurationType.StartAndEnd.Duration }
         *     
         */
        public void setDuration(OntologyTimeDurationType.StartAndEnd.Duration value) {
            this.duration = value;
        }

        /**
         * 获取startDateTime属性的值。
         * 
         * @return
         *     possible object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public XMLGregorianCalendar getStartDateTime() {
            return startDateTime;
        }

        /**
         * 设置startDateTime属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link XMLGregorianCalendar }
         *     
         */
        public void setStartDateTime(XMLGregorianCalendar value) {
            this.startDateTime = value;
        }


        /**
         * <p>anonymous complex type的 Java 类。
         * 
         * <p>以下模式片段指定包含在此类中的预期内容。
         * 
         * <pre>
         * &lt;complexType>
         *   &lt;simpleContent>
         *     &lt;extension base="&lt;http://www.opentravel.org/OTA/2003/05>List_OfferDurationUOM">
         *       &lt;attribute name="OtherType">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[a-zA-Z0-9]{1,64}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
         *       &lt;attribute name="OntologyRefID">
         *         &lt;simpleType>
         *           &lt;restriction base="{http://www.w3.org/2001/XMLSchema}string">
         *             &lt;pattern value="[0-9]{1,8}"/>
         *           &lt;/restriction>
         *         &lt;/simpleType>
         *       &lt;/attribute>
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
        public static class Duration {

            @XmlValue
            protected ListOfferDurationUOM value;
            @XmlAttribute(name = "OtherType")
            protected String otherType;
            @XmlAttribute(name = "OntologyRefID")
            protected String ontologyRefID;

            /**
             * Source: Unit of Measure (UOM) OpenTravel codelist.
             * 
             * @return
             *     possible object is
             *     {@link ListOfferDurationUOM }
             *     
             */
            public ListOfferDurationUOM getValue() {
                return value;
            }

            /**
             * 设置value属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link ListOfferDurationUOM }
             *     
             */
            public void setValue(ListOfferDurationUOM value) {
                this.value = value;
            }

            /**
             * 获取otherType属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOtherType() {
                return otherType;
            }

            /**
             * 设置otherType属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOtherType(String value) {
                this.otherType = value;
            }

            /**
             * 获取ontologyRefID属性的值。
             * 
             * @return
             *     possible object is
             *     {@link String }
             *     
             */
            public String getOntologyRefID() {
                return ontologyRefID;
            }

            /**
             * 设置ontologyRefID属性的值。
             * 
             * @param value
             *     allowed object is
             *     {@link String }
             *     
             */
            public void setOntologyRefID(String value) {
                this.ontologyRefID = value;
            }

        }

    }

}
