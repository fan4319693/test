package com.airchina.datacenter.spnr.udf.rubbish.pojo;

import lombok.Data;

@Data
public class XmlParserEx {

    private Long tsMs = System.currentTimeMillis();
    private String log;
    private String xml;
    private String fullStack;
}
