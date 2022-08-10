package com.example.profile.demoProfile;

import com.example.profile.demoProfile.model.Customer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface CustomerRepo extends MongoRepository<Customer,String> {

}
