package com.trendfusion.notification.service;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import com.trendfusion.notification.model.Notifications;
import com.trendfusion.notification.repository.NotificationRepository;

@Service
public class NotificationsService {

    @Autowired
    private NotificationRepository repository;

    public List<Notifications> getAllNotifications() {
        return repository.findAll();
    }
    
    public Notifications saveNotifications(Notifications notifications) {
        return repository.save(notifications);
    }

}