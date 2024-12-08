package com.management.ovp.config;

import org.apache.kafka.clients.consumer.ConsumerRecord;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.stereotype.Service;

@Service
public class NotificationServiceConsumer {
    //@KafkaListener(topics = "${spring.kafka.topics.event-notification}", groupId = "${spring.kafka.consumer.group-id}")
    @KafkaListener(topics = "event-notification", groupId = "event-notification-ops")
    public void listen(ConsumerRecord<String, String> record) {
        System.out.println("Received message: " + record.value());
    }
}
