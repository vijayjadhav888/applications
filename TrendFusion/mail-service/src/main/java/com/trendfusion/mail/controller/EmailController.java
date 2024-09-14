package com.trendfusion.mail.controller;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

import com.trendfusion.mail.service.EmailService;

@RestController
public class EmailController {

	Logger logger = LoggerFactory.getLogger(EmailController.class);
	
    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail(@RequestParam String to, @RequestParam String subject, @RequestParam String body) {
        emailService.sendSimpleMessage(to, subject, body);
        logger.info("Email sent to "+to);
        return "Email sent!";
    }
}