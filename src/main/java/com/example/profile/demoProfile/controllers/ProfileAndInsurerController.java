package com.example.profile.demoProfile.controllers;

import com.example.profile.demoProfile.ProfileRepo;
import com.example.profile.demoProfile.model.Input;
import com.example.profile.demoProfile.model.Insurer;
import com.example.profile.demoProfile.model.Profile;
import com.example.profile.demoProfile.model.ProfileAndInsurer;
//import com.example.profile.demoProfile.services.InsurerService;
import com.example.profile.demoProfile.services.ProfileAndInsurerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;
import org.springframework.web.client.RestTemplate;

import java.util.List;

@RestController
public class ProfileAndInsurerController {

    @Autowired
    private ProfileAndInsurerService profileAndInsurerService;


    @RequestMapping(method = RequestMethod.POST, value = "api/profileAndInsurer")
    public void addProfileAndInsurer(@RequestBody ProfileAndInsurer profileAndInsurer){
        profileAndInsurerService.addProfileAndInsurer(profileAndInsurer);
    }

    @RequestMapping("api/getAllInsurer/{requestId}")
    public List<Insurer> getAllInsurer(@PathVariable String requestId){
        return profileAndInsurerService.getAllInsurer(requestId);
    }

    @RequestMapping("api/getAll/{requestId}")
    public Input getAll(@PathVariable String requestId){
        return profileAndInsurerService.getAll(requestId);
    }

//    @RequestMapping (method = RequestMethod.GET, value = "api/getPremium")
//    public Profile getAllPremimum(@PathVariable int requestId){
//////        String url = "http://localhost:8080/api/hello";
////        RestTemplate restTemplate = new RestTemplate();
////
////        String result = restTemplate.getForObject(url,String.class);
//////        Object premiums = restTemplate.getForObject(url,Object.class);
////        System.out.println(result);
////        return result;
////        return profileAndInsurerService.getAllPremium();
//
//        Profile profile1 = profileRepo.findByRequestId(requestId);
//        return  profile1;
//    }
}
