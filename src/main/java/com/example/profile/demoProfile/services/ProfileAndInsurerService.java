package com.example.profile.demoProfile.services;

import com.example.profile.demoProfile.InputRepo;
import com.example.profile.demoProfile.ProfileAndInsurerRepo;
import com.example.profile.demoProfile.ProfileRepo;
import com.example.profile.demoProfile.model.Input;
import com.example.profile.demoProfile.model.Insurer;
import com.example.profile.demoProfile.model.Profile;
import com.example.profile.demoProfile.model.ProfileAndInsurer;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.mongodb.core.aggregation.ArrayOperators;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;

@Service
public class ProfileAndInsurerService {

    private ProfileAndInsurerRepo profileAndInsurerRepo;

    @Autowired
    public ProfileRepo profileRepo;

    public Input input;

    public ProfileAndInsurerService(ProfileAndInsurerRepo profileAndInsurerRepo) {
        this.profileAndInsurerRepo = profileAndInsurerRepo;
    }


    public void addProfileAndInsurer(ProfileAndInsurer profileAndInsurer) {
        profileAndInsurerRepo.save(profileAndInsurer);
    }

    public List<Insurer> getAllInsurer(String requestId) {
//        List<Profile,List<Insurer>> =new ArrayList<>();
        ProfileAndInsurer profileAndInsurer = profileAndInsurerRepo.findByRequestId(requestId);
        List<Insurer> insurers = profileAndInsurer.getSupportedInsurer();
        return insurers;

    }
    public Input getAll(String requestId) {
        Profile profile = profileRepo.findByRequestId(requestId);
        String vertical = profile.getVertical();
        String make = profile.getMake();
        String model = profile.getModel();

        ProfileAndInsurer profileAndInsurer = profileAndInsurerRepo.findByRequestId(requestId);
        List<Insurer> insurers = profileAndInsurer.getSupportedInsurer();

        Input inputs = new Input();
        inputs.setRequestId(requestId);
        inputs.setMake(make);
        inputs.setMake(model);
        inputs.setInsurerList(insurers);
        inputs.setVertical(vertical);
        return inputs;
    }
}
//        String uri = "http://localhost:8082/api/getProfile/4431515784493769248";
//        RestTemplate restTemplate = new RestTemplate();
//        String result = restTemplate.getForObject(uri,String.class);
//        System.out.println(result);
//        System.out.println(result.charAt(1));
//        ProfileAndInsurer a = new ProfileAndInsurer();

//        JSONParser parser = new JSONParser();
//        JSONObject json = (JSONObject) parser.parse(stringToParse);
//        JSONObject jsonObj = new JSONObject("your string");
//        return profileAndInsurerRepo.findAll();
