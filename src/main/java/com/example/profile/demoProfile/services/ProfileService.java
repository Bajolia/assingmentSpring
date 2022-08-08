package com.example.profile.demoProfile.services;

import com.example.profile.demoProfile.ProfileRepo;
import com.example.profile.demoProfile.model.Profile;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class ProfileService {
    private ProfileRepo profileRepo;

    public ProfileService(ProfileRepo profileRepo) {
        this.profileRepo = profileRepo;
    }

    public int addProfile(Profile profile) {
        int min = 1,max = 10000000;
        int randomId = (int)Math.random()*(max-min+1)+min;
        System.out.println(randomId);
        profile.setRequestId(randomId);
        profileRepo.save(profile);
        return randomId;
    }
    public List<Profile> getAllProfiles() {
        return profileRepo.findAll();
    }

    public Profile getProfile(int id) {
        List<Profile> repoProfile = profileRepo.findAll();
        for(int i=0;i<repoProfile.size();++i){
            if(repoProfile.get(i).getRequestId()==id)return repoProfile.get(i);
        }
        return null;
    }

//    public void updateProfile(Profile profile, int id) {
//        List<Profile> repoProfile = profileRepo.findAll();
//        for(int i=0;i<repoProfile.size();++i){
//            if(repoProfile.get(i).getRequestId()==id){
//
//            }
//                repoProfile.set(i,profile);
//            repoProfile.
//        }
//    }
}