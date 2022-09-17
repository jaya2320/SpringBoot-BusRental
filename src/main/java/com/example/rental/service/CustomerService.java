package com.example.rental.service;


import com.example.rental.models.Customer;
import com.example.rental.repository.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CustomerService {

    private CustomerRepository customerRepository;

    @Autowired
    public CustomerService(CustomerRepository customerRepository){
        this.customerRepository=customerRepository;
    }

    public List<Customer> viewCustomer() {
        return customerRepository.findAll();

    }

    public void addNewCustomer(Customer customer){
        customerRepository.save(customer);
    }

    public void deleteCustomer(Long customerId) {
        try{
            Customer customer = customerRepository.getReferenceById(customerId);
            customerRepository.delete(customer);

        }
        catch(Exception e){
            System.out.println("OOPS! Invalid Customer");
        }
    }
}
