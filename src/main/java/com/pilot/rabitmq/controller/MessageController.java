package com.pilot.rabitmq.controller;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import com.pilot.rabitmq.controller.request.MessageRequest;
import com.pilot.rabitmq.service.EventProducerService;

import lombok.RequiredArgsConstructor;

@RestController
@RequestMapping("/messages")
@RequiredArgsConstructor
public class MessageController {
    private final EventProducerService eventProducerService;
    @PostMapping("/send")
    public void sendMessage(@RequestBody MessageRequest messageDto) {
        eventProducerService.send(messageDto);
    }
}
