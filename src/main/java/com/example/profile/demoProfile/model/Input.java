package com.example.profile.demoProfile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.List;

@Document(collection = "mycollection")
public class Input {
    @Id
    private String requestId;
    private String vertical;
    private String make;
    private String model;
    private List<Insurer> insurerList;

    public Input() {
    }

    public Input(String requestId, String vertical, String make, String model, List<Insurer> insurerList) {
        this.requestId = requestId;
        this.vertical = vertical;
        this.make = make;
        this.model = model;
        this.insurerList = insurerList;
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

    public List<Insurer> getInsurerList() {
        return insurerList;
    }

    public void setInsurerList(List<Insurer> insurerList) {
        this.insurerList = insurerList;
    }
}
