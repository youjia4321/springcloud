package com.youjia.web.controller.kafka;

import org.apache.kafka.clients.producer.KafkaProducer;
import org.apache.kafka.clients.producer.ProducerConfig;
import org.apache.kafka.clients.producer.ProducerRecord;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className KafkaDemo
 * @date 2023/2/16 14:58
 */




import java.util.Properties;

public class KafkaProducerDemo {

    public static void main(String[] args) {

        //1.创建Kafka生产者的配置信息
        Properties properties = new Properties();
        //Kafka集群
        properties.put(ProducerConfig.BOOTSTRAP_SERVERS_CONFIG, "localhost:9092");
        //ACK应答级别
        properties.put(ProducerConfig.ACKS_CONFIG, "all");
        //重试次数
        properties.put(ProducerConfig.RETRIES_CONFIG, 1);
        //批次大小
        properties.put(ProducerConfig.BATCH_SIZE_CONFIG, 16384);
        //等待时间
        properties.put(ProducerConfig.LINGER_MS_CONFIG, 100);
        //RecordAccumulator缓冲区大小
        properties.put(ProducerConfig.BUFFER_MEMORY_CONFIG, 33554432);
        //key value的序列化类
        properties.put(ProducerConfig.KEY_SERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringSerializer");
        properties.put(ProducerConfig.VALUE_SERIALIZER_CLASS_CONFIG,
                "org.apache.kafka.common.serialization.StringSerializer");

        //2.实例化KafkaProducer
        KafkaProducer<String, String> producer = new KafkaProducer<>(properties);

        //3.发送消息
        for (int i = 0; i < 20; i++) {
            ProducerRecord<String, String> record = new ProducerRecord<>("test0",
                    "test","This is log message " + i);
            producer.send(record);
        }

        //4.关闭资源
        producer.close();

    }
}