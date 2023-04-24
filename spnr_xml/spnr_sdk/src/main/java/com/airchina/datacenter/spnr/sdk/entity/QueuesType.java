//
// 此文件是由 JavaTM Architecture for XML Binding (JAXB) 引用实现 v2.2.8-b130911.1802 生成的
// 请访问 <a href="http://java.sun.com/xml/jaxb">http://java.sun.com/xml/jaxb</a> 
// 在重新编译源模式时, 对此文件的所有修改都将丢失。
// 生成时间: 2023.02.28 时间 04:16:54 PM CST 
//


package com.airchina.datacenter.spnr.sdk.entity;

import java.math.BigInteger;
import java.util.ArrayList;
import java.util.List;
import javax.xml.bind.annotation.XmlAccessType;
import javax.xml.bind.annotation.XmlAccessorType;
import javax.xml.bind.annotation.XmlAttribute;
import javax.xml.bind.annotation.XmlElement;
import javax.xml.bind.annotation.XmlType;


/**
 * <p>QueuesType complex type的 Java 类。
 * 
 * <p>以下模式片段指定包含在此类中的预期内容。
 * 
 * <pre>
 * &lt;complexType name="QueuesType">
 *   &lt;complexContent>
 *     &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *       &lt;sequence>
 *         &lt;element name="Queue" maxOccurs="unbounded" minOccurs="0">
 *           &lt;complexType>
 *             &lt;complexContent>
 *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                 &lt;sequence>
 *                   &lt;element name="Items" type="{http://www.opentravel.org/OTA/2003/05}ItemsType"/>
 *                   &lt;element name="Action" type="{http://www.opentravel.org/OTA/2003/05}QueueActionType" minOccurs="0"/>
 *                   &lt;element name="Summary" minOccurs="0">
 *                     &lt;complexType>
 *                       &lt;complexContent>
 *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                           &lt;sequence>
 *                             &lt;element name="Status" maxOccurs="unbounded">
 *                               &lt;complexType>
 *                                 &lt;complexContent>
 *                                   &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
 *                                     &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
 *                                     &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
 *                 &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueBase"/>
 *                 &lt;attribute name="SystemStatus" type="{http://www.opentravel.org/OTA/2003/05}SystemQueueStatus" />
 *                 &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
 *                 &lt;attribute name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
 *                 &lt;attribute name="OrderBy" type="{http://www.w3.org/2001/XMLSchema}string" />
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
@XmlType(name = "QueuesType", propOrder = {
    "queue"
})
public class QueuesType {

    @XmlElement(name = "Queue")
    protected List<QueuesType.Queue> queue;

    /**
     * Gets the value of the queue property.
     * 
     * <p>
     * This accessor method returns a reference to the live list,
     * not a snapshot. Therefore any modification you make to the
     * returned list will be present inside the JAXB object.
     * This is why there is not a <CODE>set</CODE> method for the queue property.
     * 
     * <p>
     * For example, to add a new item, do as follows:
     * <pre>
     *    getQueue().add(newItem);
     * </pre>
     * 
     * 
     * <p>
     * Objects of the following type(s) are allowed in the list
     * {@link QueuesType.Queue }
     * 
     * 
     */
    public List<QueuesType.Queue> getQueue() {
        if (queue == null) {
            queue = new ArrayList<QueuesType.Queue>();
        }
        return this.queue;
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
     *         &lt;element name="Items" type="{http://www.opentravel.org/OTA/2003/05}ItemsType"/>
     *         &lt;element name="Action" type="{http://www.opentravel.org/OTA/2003/05}QueueActionType" minOccurs="0"/>
     *         &lt;element name="Summary" minOccurs="0">
     *           &lt;complexType>
     *             &lt;complexContent>
     *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                 &lt;sequence>
     *                   &lt;element name="Status" maxOccurs="unbounded">
     *                     &lt;complexType>
     *                       &lt;complexContent>
     *                         &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
     *                           &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
     *                           &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
     *       &lt;attGroup ref="{http://www.opentravel.org/OTA/2003/05}QueueBase"/>
     *       &lt;attribute name="SystemStatus" type="{http://www.opentravel.org/OTA/2003/05}SystemQueueStatus" />
     *       &lt;attribute name="Owner" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="Description" type="{http://www.w3.org/2001/XMLSchema}string" />
     *       &lt;attribute name="ItemCount" type="{http://www.w3.org/2001/XMLSchema}integer" />
     *       &lt;attribute name="OrderBy" type="{http://www.w3.org/2001/XMLSchema}string" />
     *     &lt;/restriction>
     *   &lt;/complexContent>
     * &lt;/complexType>
     * </pre>
     * 
     * 
     */
    @XmlAccessorType(XmlAccessType.FIELD)
    @XmlType(name = "", propOrder = {
        "items",
        "action",
        "summary"
    })
    public static class Queue {

        @XmlElement(name = "Items", required = true)
        protected ItemsType items;
        @XmlElement(name = "Action")
        protected QueueActionType action;
        @XmlElement(name = "Summary")
        protected QueuesType.Queue.Summary summary;
        @XmlAttribute(name = "SystemStatus")
        protected SystemQueueStatus systemStatus;
        @XmlAttribute(name = "Owner")
        protected String owner;
        @XmlAttribute(name = "Description")
        protected String description;
        @XmlAttribute(name = "ItemCount")
        protected BigInteger itemCount;
        @XmlAttribute(name = "OrderBy")
        protected String orderBy;
        @XmlAttribute(name = "QueueID", required = true)
        protected String queueID;
        @XmlAttribute(name = "QueueName")
        protected String queueName;
        @XmlAttribute(name = "Active")
        protected Boolean active;

        /**
         * 获取items属性的值。
         * 
         * @return
         *     possible object is
         *     {@link ItemsType }
         *     
         */
        public ItemsType getItems() {
            return items;
        }

        /**
         * 设置items属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link ItemsType }
         *     
         */
        public void setItems(ItemsType value) {
            this.items = value;
        }

        /**
         * 获取action属性的值。
         * 
         * @return
         *     possible object is
         *     {@link QueueActionType }
         *     
         */
        public QueueActionType getAction() {
            return action;
        }

        /**
         * 设置action属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link QueueActionType }
         *     
         */
        public void setAction(QueueActionType value) {
            this.action = value;
        }

        /**
         * 获取summary属性的值。
         * 
         * @return
         *     possible object is
         *     {@link QueuesType.Queue.Summary }
         *     
         */
        public QueuesType.Queue.Summary getSummary() {
            return summary;
        }

        /**
         * 设置summary属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link QueuesType.Queue.Summary }
         *     
         */
        public void setSummary(QueuesType.Queue.Summary value) {
            this.summary = value;
        }

        /**
         * 获取systemStatus属性的值。
         * 
         * @return
         *     possible object is
         *     {@link SystemQueueStatus }
         *     
         */
        public SystemQueueStatus getSystemStatus() {
            return systemStatus;
        }

        /**
         * 设置systemStatus属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link SystemQueueStatus }
         *     
         */
        public void setSystemStatus(SystemQueueStatus value) {
            this.systemStatus = value;
        }

        /**
         * 获取owner属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOwner() {
            return owner;
        }

        /**
         * 设置owner属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOwner(String value) {
            this.owner = value;
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
         * 获取itemCount属性的值。
         * 
         * @return
         *     possible object is
         *     {@link BigInteger }
         *     
         */
        public BigInteger getItemCount() {
            return itemCount;
        }

        /**
         * 设置itemCount属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link BigInteger }
         *     
         */
        public void setItemCount(BigInteger value) {
            this.itemCount = value;
        }

        /**
         * 获取orderBy属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getOrderBy() {
            return orderBy;
        }

        /**
         * 设置orderBy属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setOrderBy(String value) {
            this.orderBy = value;
        }

        /**
         * 获取queueID属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueID() {
            return queueID;
        }

        /**
         * 设置queueID属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueID(String value) {
            this.queueID = value;
        }

        /**
         * 获取queueName属性的值。
         * 
         * @return
         *     possible object is
         *     {@link String }
         *     
         */
        public String getQueueName() {
            return queueName;
        }

        /**
         * 设置queueName属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link String }
         *     
         */
        public void setQueueName(String value) {
            this.queueName = value;
        }

        /**
         * 获取active属性的值。
         * 
         * @return
         *     possible object is
         *     {@link Boolean }
         *     
         */
        public Boolean isActive() {
            return active;
        }

        /**
         * 设置active属性的值。
         * 
         * @param value
         *     allowed object is
         *     {@link Boolean }
         *     
         */
        public void setActive(Boolean value) {
            this.active = value;
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
         *         &lt;element name="Status" maxOccurs="unbounded">
         *           &lt;complexType>
         *             &lt;complexContent>
         *               &lt;restriction base="{http://www.w3.org/2001/XMLSchema}anyType">
         *                 &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
         *                 &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
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
            "status"
        })
        public static class Summary {

            @XmlElement(name = "Status", required = true)
            protected List<QueuesType.Queue.Summary.Status> status;

            /**
             * Gets the value of the status property.
             * 
             * <p>
             * This accessor method returns a reference to the live list,
             * not a snapshot. Therefore any modification you make to the
             * returned list will be present inside the JAXB object.
             * This is why there is not a <CODE>set</CODE> method for the status property.
             * 
             * <p>
             * For example, to add a new item, do as follows:
             * <pre>
             *    getStatus().add(newItem);
             * </pre>
             * 
             * 
             * <p>
             * Objects of the following type(s) are allowed in the list
             * {@link QueuesType.Queue.Summary.Status }
             * 
             * 
             */
            public List<QueuesType.Queue.Summary.Status> getStatus() {
                if (status == null) {
                    status = new ArrayList<QueuesType.Queue.Summary.Status>();
                }
                return this.status;
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
             *       &lt;attribute name="Count" use="required" type="{http://www.w3.org/2001/XMLSchema}int" />
             *       &lt;attribute name="Type" use="required" type="{http://www.w3.org/2001/XMLSchema}string" />
             *     &lt;/restriction>
             *   &lt;/complexContent>
             * &lt;/complexType>
             * </pre>
             * 
             * 
             */
            @XmlAccessorType(XmlAccessType.FIELD)
            @XmlType(name = "")
            public static class Status {

                @XmlAttribute(name = "Count", required = true)
                protected int count;
                @XmlAttribute(name = "Type", required = true)
                protected String type;

                /**
                 * 获取count属性的值。
                 * 
                 */
                public int getCount() {
                    return count;
                }

                /**
                 * 设置count属性的值。
                 * 
                 */
                public void setCount(int value) {
                    this.count = value;
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

            }

        }

    }

}
