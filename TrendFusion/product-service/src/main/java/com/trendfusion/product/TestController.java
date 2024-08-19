package com.trendfusion.product;

import org.springframework.beans.factory.annotation.Value;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/product")
public class TestController {

	@Value("${msg}")
	String message; 
	
	/*
	@Value("${my-app.message}")
	String message1; 
	
	
	 * @Value("${my-app-git.message}") String message2;
	 */
	
	public TestController() {
		super();
	}

	@GetMapping("/message")
	public String getMessage()
	{
		return "Test Message :  " + message;
	}
	
	/*
	@GetMapping("/message1")
	public String getMessage1()
	{
		return "Test Message  : " + message1;
	}
	
	
	 * @GetMapping("/message2") public String getMessage2() { return
	 * "Test Message  : " + message2; }
	 */
	
}