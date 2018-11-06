package com.example.kafka.business.producer

import com.example.kafka.business.model.User
import org.slf4j.LoggerFactory
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.kafka.core.KafkaTemplate
import org.springframework.stereotype.Service

@Service
class Producer @Autowired constructor(val kafkaTemplate: KafkaTemplate<String, User>) {

    private val logger = LoggerFactory.getLogger(Producer::class.java)
    private val TOPIC = "users"

    fun sendMessage(user: User) {
        logger.info(String.format("#### -> Producing message -> %s", user.name))
        this.kafkaTemplate.send(TOPIC, user)
    }

}