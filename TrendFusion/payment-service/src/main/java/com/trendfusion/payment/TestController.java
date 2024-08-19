package com.trendfusion.payment;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {

	@Value("${msg}")
	String message; 
	
	public TestController() {
		super();
	}

	@GetMapping("/payment/message")
	public String getMessage()
	{
		return "Test Message :  " + message;
	}
	
}