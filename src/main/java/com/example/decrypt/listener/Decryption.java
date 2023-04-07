package com.example.decrypt.listener;

import io.micronaut.configuration.kafka.annotation.KafkaListener;
import io.micronaut.configuration.kafka.annotation.OffsetReset;
import io.micronaut.configuration.kafka.annotation.Topic;

@KafkaListener(offsetReset = OffsetReset.EARLIEST)
public class Decryption {

    @Topic("encrypted-data")
    public void receive(String name) {
        System.out.println(name);
    }
}
