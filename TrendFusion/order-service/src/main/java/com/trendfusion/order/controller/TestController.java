package com.trendfusion.order.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendfusion.order.service.ProducerService;

@RestController
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);

	@Autowired
	private ProducerService producerService;

	
	@Value("${msg}")
	String message; 
	
	public TestController() {
		super();
	}

	@GetMapping("/order/message")
	public String getMessage()
	{
		producerService.sendMessage("notification-topic", message);
		logger.info("Test Message : Order service "+message);
		return "Test Message : Order service : " + message;
	}
	
}