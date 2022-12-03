package com.pilot.rabitmq.eventhandler;

import org.springframework.amqp.rabbit.annotation.RabbitHandler;
import org.springframework.amqp.rabbit.annotation.RabbitListener;
import org.springframework.stereotype.Component;

import com.pilot.rabitmq.controller.request.MessageRequest;

@Component
@RabbitListener(queues = "${rabbitmq.queue.alarm}")
public class MessageConsumer {

    @RabbitHandler
	public void recievedMessage(MessageRequest request) {
		System.out.println("Recieved Message From RabbitMQ: " + request);
	}
}
