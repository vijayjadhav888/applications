package com.trendfusion.payment.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trendfusion.payment.service.ProducerService;

@RestController
public class TestController {

	Logger logger = LoggerFactory.getLogger(TestController.class);
    
	@Autowired
	private ProducerService producerService;
	
	@Value("${msg}")
	String message; 
	
	public TestController() {
	}

	/*
	 * @GetMapping("/send") public String sendMessage(@RequestParam String message1)
	 * { producerService.sendMessage("quickstart-events", message1);
	 * logger.info("Test Message : Order service "+message1); return
	 * "Test Message :  " + message1;
	 * 
	 * }
	 */
	
	@GetMapping("/payment/message")
	public String getMessage()
	{
		producerService.sendMessage("notification-topic", message);
		logger.info("Test Message : payment service "+message);
		return "Test Message :  " + message;
	}	
}