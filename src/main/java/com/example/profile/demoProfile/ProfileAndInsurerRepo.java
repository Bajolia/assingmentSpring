package com.example.profile.demoProfile;

import com.example.profile.demoProfile.model.ProfileAndInsurer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface ProfileAndInsurerRepo extends MongoRepository<ProfileAndInsurer, Object> {
    ProfileAndInsurer findByRequestId(String requestId);
}
