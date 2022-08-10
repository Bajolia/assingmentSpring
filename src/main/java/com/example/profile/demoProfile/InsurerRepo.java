package com.example.profile.demoProfile;

import com.example.profile.demoProfile.model.Insurer;
import org.springframework.data.mongodb.repository.MongoRepository;

public interface InsurerRepo extends MongoRepository<Insurer,Object> {
}
