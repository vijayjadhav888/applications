package com.trendfusion.mail.controller;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.trendfusion.mail.service.EmailService;

@RestController
public class EmailController {

    @Autowired
    private EmailService emailService;

    @GetMapping("/send-email")
    public String sendEmail() {
    	String to = "vijayjadhav888@gmail.com";
    	String subject = "test subject";
    	String body = "Test body";
        emailService.sendSimpleMessage(to, subject, body);
        return "Email sent!";
    }
}
