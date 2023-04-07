package com.example.encrypt.listener;

import io.micronaut.configuration.kafka.annotation.KafkaKey;
import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;
import io.micronaut.messaging.annotation.SendTo;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class Encryption {

    @Topic("plain-text-data")
    @SendTo("encrypted-data")
    public String receive(@KafkaKey String key, String value) {
        System.out.println("Got Product - " + key + " by " + value);
        return value;
    }
}