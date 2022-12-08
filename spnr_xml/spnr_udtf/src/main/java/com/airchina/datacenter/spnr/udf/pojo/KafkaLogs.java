package com.airchina.datacenter.spnr.udf.pojo;

import java.io.Serializable;
import lombok.Data;

@Data
public class KafkaLogs implements Serializable {

    private String bt;
    private String topic;
    private XmlParserEx xmlParserEx;
}