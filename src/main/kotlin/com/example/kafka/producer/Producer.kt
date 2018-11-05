package com.example.kafka.producer

import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Producer @Autowired constructor(val kafkaTemplate: KafkaTemplate<String, String>) {

    private val logger = LoggerFactory.getLogger(Producer::class.java)
    private val TOPIC = "users"

    fun sendMessage(message: String) {
        logger.info(String.format("#### -> Producing message -> %s", message))
        this.kafkaTemplate.send(TOPIC, message)
    }

}