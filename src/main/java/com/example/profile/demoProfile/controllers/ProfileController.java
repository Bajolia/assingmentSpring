package com.example.profile.demoProfile.controllers;

import com.example.profile.demoProfile.model.Profile;
import com.example.profile.demoProfile.services.ProfileService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class ProfileController {

    @Autowired
    private ProfileService profileService;

    @RequestMapping(method = RequestMethod.POST, value = "api/profile")
    public int addProfile(@RequestBody Profile profile){
        return profileService.addProfile(profile);
    }

    @RequestMapping("api/getAllProfiles")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    @RequestMapping("api/getProfile/{id}")
    public Profile getProfile(@PathVariable int id){
        return profileService.getProfile(id);
    }

//    @RequestMapping(method = RequestMethod.PUT, value = "api/profile/{id}")
//    public void updateProfile(@RequestBody Profile profile, @PathVariable int id){
//        profileService.updateProfile(profile,id);
//    }

}
