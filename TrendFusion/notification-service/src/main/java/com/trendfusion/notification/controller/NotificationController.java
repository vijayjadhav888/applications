package com.trendfusion.notification.controller;

import java.util.Date;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.kafka.annotation.KafkaListener;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendfusion.notification.model.Notifications;
import com.trendfusion.notification.service.NotificationsService;

@RestController
public class NotificationController {

	Logger logger = LoggerFactory.getLogger(NotificationController.class);
	
	@Autowired
	NotificationsService service;
	
	@Value("${msg}")
	String message; 

	public NotificationController() {
		super();
	}

	@GetMapping("/notification/message")
	public String getMessage()
	{
		logger.info("Test Message : notification service "+message);
		return "Test Message : notification service  " + message;
	}
	
    @KafkaListener(topics = "notification-topic", groupId = "notification")
    public void listen(String message) {
    	logger.info("Test Message : notification service "+message);
    	Notifications notification = new Notifications();  
    	notification.setId("1");
    	notification.setMessage(message);
    	notification.setDate(new Date());
    	notification.setStreamId("streamid");
    	
    	service.saveNotifications(notification);
    	
    	System.out.println("Received message: " + message);
    }

}