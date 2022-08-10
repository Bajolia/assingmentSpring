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
    public String addProfile(@RequestBody Profile profile){
        return profileService.addProfile(profile);
    }

    @RequestMapping("api/getAllProfiles")
    public List<Profile> getAllProfiles(){
        return profileService.getAllProfiles();
    }

    @RequestMapping("api/getProfile/{requestId}")
    public Profile getProfile(@PathVariable String requestId){
        return profileService.getProfile(requestId);
    }

    @RequestMapping(method = RequestMethod.PUT, value = "api/profile/{requestId}")
    public String updateProfile(@RequestBody Profile profile, @PathVariable String requestId){
        return profileService.updateProfile(profile,requestId);
    }

}