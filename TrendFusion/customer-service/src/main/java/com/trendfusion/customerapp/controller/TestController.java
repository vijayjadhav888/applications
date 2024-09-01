package com.trendfusion.customerapp.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	Logger logger = LoggerFactory.getLogger(CustomerController.class);
	
	@Value("${msg}")
	String message; 
	
	public TestController() {
		super();
	}

	@GetMapping("/customers/message")
	public String getMessage()
	{
		logger.info("Test Message : Customer service  " + message);
		return "Test Message : Customer service  " + message;
	}
	
}