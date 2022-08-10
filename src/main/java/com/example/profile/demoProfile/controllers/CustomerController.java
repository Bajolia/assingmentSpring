package com.example.profile.demoProfile.controllers;

import com.example.profile.demoProfile.model.Customer;
import com.example.profile.demoProfile.services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
public class CustomerController {
    @Autowired
    private CustomerService customerService;

    @RequestMapping(method = RequestMethod.POST,value = "api/addCustomer")
    public String addCustomer(@RequestBody Customer customer){
        return customerService.addCustomer(customer);
    }
    @RequestMapping(method = RequestMethod.GET,value = "/api/allCustomer")
    public List<Customer> getAllCustomer(){
        return customerService.getAllCustomer();
    }

    @RequestMapping("api/customer/{customerId}")
    public Customer getCustomer(@PathVariable String customerId){
        return customerService.getCustomer(customerId);
    }

    @RequestMapping(method = RequestMethod.DELETE,value = "api/deleteCustomer/{customerId}")
    public String deleteCustomer(@PathVariable String customerId){
        customerService.deleteCustomer(customerId);
        return "Customer Removed";
    }
}
