package com.example.profile.demoProfile.services;

import com.example.profile.demoProfile.CustomerRepo;
import com.example.profile.demoProfile.model.Customer;
import com.example.profile.demoProfile.model.Profile;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Random;

@Service
public class CustomerService {
    private CustomerRepo customerRepo;

    public CustomerService(CustomerRepo customerRepo) {
        this.customerRepo = customerRepo;
    }

    public String addCustomer(Customer customer) {
        Random temp = new Random();
        String checkoutId = String.valueOf(Math.abs(temp.nextLong()));
        customer.setCustomerCheckoutId(checkoutId);
        customerRepo.save(customer);
        return checkoutId;
    }

    public List<Customer> getAllCustomer() {
        return customerRepo.findAll();
    }

    public Customer getCustomer(String customerId) {
        return customerRepo.findById(customerId).get();
    }

    public void deleteCustomer(String customerId) {
        customerRepo.deleteById(customerId);
    }
}
