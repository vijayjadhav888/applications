package com.trendfusion.notification.repository;

import org.springframework.data.mongodb.repository.MongoRepository;

import com.trendfusion.notification.model.Notifications;

public interface NotificationRepository extends MongoRepository<Notifications, String> {

}
