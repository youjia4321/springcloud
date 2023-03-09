package com.youjia.web.controller.kafka;

import lombok.SneakyThrows;
import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.apache.kafka.clients.consumer.ConsumerRecords;
import org.apache.kafka.clients.consumer.KafkaConsumer;

import java.time.Duration;
import java.util.Arrays;
import java.util.Properties;
import java.util.concurrent.Callable;
import java.util.concurrent.ExecutionException;
import java.util.concurrent.Future;
import java.util.concurrent.FutureTask;

/**
 * @author youjia
 * @version 1.0
 * @description
 * @className a
 * @date 2023/2/16 17:57
 */
public class KafkaConsumerX {

//    public static void main(String[] args) {
//
//        // 创建 Kafka 消费者配置
//        Properties props = new Properties();
//        props.put("bootstrap.servers", "localhost:9092");
//        props.put("group.id", "test");
//        props.put("enable.auto.commit", "true");
//        props.put("auto.commit.interval.ms", "1000");
//        props.put("key.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//        props.put("value.deserializer", "org.apache.kafka.common.serialization.StringDeserializer");
//
//        // 创建 Kafka 消费者
//        KafkaConsumer<String, String> consumer = new KafkaConsumer<>(props);
//
//        // 订阅 topic
//        consumer.subscribe(Arrays.asList("test","test0"));
//
//        // 消费消息
//        while (true) {
//            ConsumerRecords<String, String> records = consumer.poll(Duration.ofMillis(1000));
//            for (ConsumerRecord<String, String> record : records) {
//                System.out.printf("收到消息：offset = %d, key = %s, value = %s%n", record.offset(), record.key(), record.value());
//            }
//        }
//    }

    public static void main(String[] args) throws InterruptedException, ExecutionException {

        Thread2 t2 = new Thread2();
        Thread1 t1 = new Thread1();
        Thread thread1 = new Thread(t2);
        thread1.start();
        thread1.join();
        FutureTask<String> task = new FutureTask<>(t1);
        Thread thread2 = new Thread(task);

        thread2.start();
//        thread2.join();
        System.out.println(task.get());
        System.out.println("我是主线程");

    }


    static class Thread1 implements Callable<String> {

        @Override
        public String call() throws Exception {
//            notifyAll();
            return "我是线程1";
        }
    }

    static class Thread2 implements Runnable {

        @SneakyThrows
        @Override
        public void run() {
            System.out.println("我是线程2");
        }

    }

}
