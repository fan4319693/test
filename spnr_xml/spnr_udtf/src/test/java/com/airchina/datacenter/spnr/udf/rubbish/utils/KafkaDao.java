package com.airchina.datacenter.spnr.udf.rubbish.utils;

import com.airchina.datacenter.spnr.udf.rubbish.pojo.KafkaLogs;
import com.google.common.collect.Maps;
import java.io.IOException;
import java.util.Map;
import java.util.Properties;
import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.Producer;
import org.apache.kafka.clients.producer.ProducerRecord;
import org.apache.log4j.Logger;
import org.codehaus.jackson.map.ObjectMapper;

public class KafkaDao {

    public static final Logger LOG = Logger.getLogger(KafkaDao.class);

    private static final Map<String, Producer<String, String>> CACHE = Maps.newHashMap();

    private static void init(KafkaLogs kafkaLogs) {
        Properties props = new Properties();
        props.put("bootstrap.servers", kafkaLogs.getBt());
        props.put("acks", "all");
        props.put("retries", 0);
        props.put("linger.ms", 1);
        props.put("enable.idompotence", "true");
        props.put("key.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        props.put("value.serializer", "org.apache.kafka.common.serialization.StringSerializer");
        KafkaProducer<String, String> producer = new KafkaProducer<>(props);
        CACHE.put(kafkaLogs.getTopic(), producer);
    }

    public static void insert(KafkaLogs kafkaLogs) {
        Producer<String, String> producer = null;
        try {
            if (!CACHE.containsKey(kafkaLogs.getTopic())) {
                init(kafkaLogs);

            }
            producer = CACHE.get(kafkaLogs.getTopic());
            producer.send(
                new ProducerRecord<>(kafkaLogs.getTopic(), null,
                    new ObjectMapper().writeValueAsString(kafkaLogs.getXmlParserEx()))
                , (metadata, exception) -> {
                    if (exception != null) {
                        // if ack error then do nothing
                    }
                }
            );
        } catch (IOException e) {
            // if SerDe error then do nothing
        }
    }

    public static void close(KafkaLogs kafkaLogs) {
        Producer<String, String> producer = CACHE.get(kafkaLogs.getTopic());
        if (producer != null) {
           // producer.close();
        }
    }
}
