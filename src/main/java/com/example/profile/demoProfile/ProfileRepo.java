package com.example.profile.demoProfile;

import com.example.profile.demoProfile.model.Profile;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileRepo extends MongoRepository<Profile,String> {

    Profile findByRequestId(String requestId);
}