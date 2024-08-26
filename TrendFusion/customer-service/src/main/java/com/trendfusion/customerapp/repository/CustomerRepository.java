package com.trendfusion.customerapp.repository;

import org.springframework.data.mongodb.repository.MongoRepository;
import com.trendfusion.customerapp.model.Customer;

public interface CustomerRepository extends MongoRepository<Customer, String> {
}
