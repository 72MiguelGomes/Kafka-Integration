package com.example.kafka.controller

import com.example.kafka.business.producer.Producer
import org.springframework.beans.factory.annotation.Autowired
import org.springframework.http.ResponseEntity
import org.springframework.stereotype.Controller
import org.springframework.web.bind.annotation.PostMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RequestParam

@Controller
@RequestMapping("/kafka")
class KafkaController @Autowired constructor(val producer: Producer) {

    @PostMapping("/publish")
    fun sendMessageToKafkaTopic(@RequestParam("message") message: String) : ResponseEntity<String> {
        this.producer.sendMessage(message)
        return ResponseEntity.ok("")
    }

}