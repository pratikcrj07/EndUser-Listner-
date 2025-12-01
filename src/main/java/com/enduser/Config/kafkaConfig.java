package com.enduser.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

@Configuration

public class kafkaConfig {

@KafkaListener(topics ="location_update_topic" , groupId = "group-1")
    public void updatedLocation(String value){
    }
}
