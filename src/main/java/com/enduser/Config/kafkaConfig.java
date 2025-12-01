package com.enduser.Config;


import org.springframework.context.annotation.Configuration;
import org.springframework.kafka.annotation.KafkaListener;

import static com.enduser.Config.appConstant.GROUP_ID;
import static com.enduser.Config.appConstant.LOCATION_UPDATE_TOPIC;

@Configuration

public class kafkaConfig {

@KafkaListener( topics = LOCATION_UPDATE_TOPIC , groupId = GROUP_ID)


    public void updatedLocation(String value){


      System.out.println(value);
    }
}
