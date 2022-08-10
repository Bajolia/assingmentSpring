package com.example.profile.demoProfile;

import com.example.profile.demoProfile.model.Input;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InputRepo extends MongoRepository<Input,Object> {
    Input findByRequestId(String requestId);
}
