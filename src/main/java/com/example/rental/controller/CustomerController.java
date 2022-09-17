package com.example.rental.controller;

import com.example.rental.models.Customer;
import com.example.rental.service.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController()
@RequestMapping("Customer")
public class CustomerController {

    private CustomerService customerService;

    @Autowired
    public CustomerController(CustomerService customerService){
        this.customerService=customerService;
    }

    @GetMapping()
    public List<Customer> getCustomer(){
        return customerService.viewCustomer();

    }

    @PostMapping
    public void addCustomer(@RequestBody Customer customer){
        customerService.addNewCustomer(customer);
    }

    @DeleteMapping
    public void deleteCustomer(@RequestParam Long customerId){
        customerService.deleteCustomer(customerId);
    }
}
