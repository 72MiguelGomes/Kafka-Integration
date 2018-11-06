package com.example.kafka.business.consumer

import com.example.kafka.business.model.User
import org.slf4j.LoggerFactory
import org.springframework.kafka.annotation.KafkaListener
import org.springframework.stereotype.Service

@Service
class Consumer {

    private val logger = LoggerFactory.getLogger(Consumer::class.java)

    @KafkaListener(topics = ["users"], groupId = "group_id")
    fun consume(user: User) {
        logger.info(String.format("#### -> Consumed message -> %s", user.name))
    }

}