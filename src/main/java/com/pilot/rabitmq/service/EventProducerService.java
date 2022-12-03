package com.pilot.rabitmq.service;

import com.pilot.rabitmq.controller.request.MessageRequest;
public interface EventProducerService {
	public void send(MessageRequest company);
}
