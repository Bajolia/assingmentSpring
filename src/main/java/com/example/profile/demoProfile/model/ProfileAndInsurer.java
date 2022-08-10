package com.example.profile.demoProfile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

import java.util.ArrayList;
import java.util.List;

@Document(collection = "profileAndInsurer")
public class ProfileAndInsurer {
    @Id
    private String requestId;

    private List<Insurer> supportedInsurer= new ArrayList<Insurer>();

    public ProfileAndInsurer(String requestId, List<Insurer> supportedInsurer) {
        this.requestId = requestId;
        this.supportedInsurer = supportedInsurer;
    }

    public String getRequestId() {
        return requestId;
    }

    public void setRequestId(String requestId) {
        this.requestId = requestId;
    }

    public List<Insurer> getSupportedInsurer() {
        return supportedInsurer;
    }

    public void setSupportedInsurer(List<Insurer> supportedInsurer) {
        this.supportedInsurer = supportedInsurer;
    }
}
