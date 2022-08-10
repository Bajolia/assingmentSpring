package com.example.profile.demoProfile.services;

import com.example.profile.demoProfile.ProfileRepo;
import com.example.profile.demoProfile.model.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class ProfileService {
    private ProfileRepo profileRepo;

    public ProfileService(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    public String addProfile(Profile profile) {
        Random temp = new Random();
        String requestId = String.valueOf(Math.abs(temp.nextLong()));
        System.out.println(requestId);
        profile.setRequestId(requestId);
        profileRepo.save(profile);
        return requestId;
    }

    public List<Profile> getAllProfiles() {
        return profileRepo.findAll();
    }

    public Profile getProfile(String requestId) {
        return profileRepo.findById(requestId).get();
    }

    public String updateProfile(Profile profile, String requestId) {
        Profile profile1 = profileRepo.findByRequestId(requestId);
        profile1.setMake(profile.getMake());
        profile1.setModel(profile.getModel());
        profile1.setVertical(profile.getVertical());
        profileRepo.save(profile1);
        return "Profile Updated Successfully";
    }
}