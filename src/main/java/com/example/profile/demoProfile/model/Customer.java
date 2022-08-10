package com.example.profile.demoProfile.model;

import org.springframework.data.annotation.Id;
import org.springframework.data.mongodb.core.mapping.Document;

@Document(collection = "customer")
public class Customer {
    @Id
    private String customerCheckoutId;
    private String customerRequestId;
    private String customerName;
    private String customerEmail;
    private String customerPhone;
    private String insurer;

    public Customer(String customerRequestId, String customerCheckoutId, String customerName, String customerEmail, String customerPhone, String insurer) {
        this.customerRequestId = customerRequestId;
        this.customerCheckoutId = customerCheckoutId;
        this.customerName = customerName;
        this.customerEmail = customerEmail;
        this.customerPhone = customerPhone;
        this.insurer = insurer;
    }

    public String getCustomerRequestId() {
        return customerRequestId;
    }

    public void setCustomerRequestId(String customerRequestId) {
        this.customerRequestId = customerRequestId;
    }

    public String getCustomerCheckoutId() {
        return customerCheckoutId;
    }

    public void setCustomerCheckoutId(String customerCheckoutId) {
        this.customerCheckoutId = customerCheckoutId;
    }

    public String getCustomerName() {
        return customerName;
    }

    public void setCustomerName(String customerName) {
        this.customerName = customerName;
    }

    public String getCustomerEmail() {
        return customerEmail;
    }

    public void setCustomerEmail(String customerEmail) {
        this.customerEmail = customerEmail;
    }

    public String getCustomerPhone() {
        return customerPhone;
    }

    public void setCustomerPhone(String customerPhone) {
        this.customerPhone = customerPhone;
    }

    public String getInsurer() {
        return insurer;
    }

    public void setInsurer(String insurer) {
        this.insurer = insurer;
    }

}
