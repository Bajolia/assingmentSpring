package com.example.profile.demoProfile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "FWRequest")
public class Profile {
    @Id
    private String requestId;
    private String vertical;
    private String make;
    private String model;
    //private List<Integer> insurer =new ArrayList<>();

    public Profile(String vertical, String make, String model,String requestId) {
        this.vertical = vertical;
        this.make = make;
        this.model = model;
        this.requestId = requestId;
        //this.insurer = insurer;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public String getVertical() {
        return vertical;
    }

    public void setVertical(String vertical) {
        this.vertical = vertical;
    }

    public String getMake() {
        return make;
    }

    public void setMake(String make) {
        this.make = make;
    }

    public String getModel() {
        return model;
    }

    public void setModel(String model) {
        this.model = model;
    }

//    public List<Integer> getInsurer() {
//        return insurer;
//    }
//
//    public void setInsurer(List<Integer> insurer) {
//        this.insurer = insurer;
//    }
}