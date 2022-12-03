package com.pilot.rabitmq.service.impl;


import com.pilot.rabitmq.constant.Constant;
import com.pilot.rabitmq.controller.request.MessageRequest;
import com.pilot.rabitmq.service.EventProducerService;

import lombok.RequiredArgsConstructor;

import org.springframework.amqp.core.AmqpTemplate;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;


@Service
@RequiredArgsConstructor
public class EventProducerServiceImpl implements EventProducerService{
	private final AmqpTemplate amqpTemplate;
	
	@Value("${rabbitmq.exchange.alarm}")
	private String exchange;
	
	@Value("${rabbitmq.routingkey.alarm}")
	private String routingkey;	
	
	public void send(MessageRequest company) {
		amqpTemplate.convertAndSend(exchange, Constant.ALARM, company);
		System.out.println("Send msg = " + company);
	    
	}
}
