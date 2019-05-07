package com.kafka.demo.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.kafka.annotation.KafkaListener;

public class Listener {
    protected final Logger logger = LoggerFactory.getLogger(this.getClass());


    @KafkaListener(topics = {"test"},groupId = "test")
    public void test(ConsumerRecord<?, ?> record) {
        logger.info("test-kafka的key: " + record.key());
        logger.info("test-kafka的value: " + record.value().toString());
    }

    @KafkaListener(topics = {"test"},groupId = "test")
    public void test1(ConsumerRecord<?, ?> record) {
        logger.info("test1-kafka的key: " + record.key());
        logger.info("test1-kafka的value: " + record.value().toString());
    }
}
