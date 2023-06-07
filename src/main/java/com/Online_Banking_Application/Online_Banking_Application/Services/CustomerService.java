package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Customer;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.CustomerRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CustomerService {
    @Autowired
    CustomerRepository customerRepository;
    public List<Customer> getAllCustomers() {

        return customerRepository.findAll();
    }

    public Customer getCustomerById(Long id) {

        return customerRepository.findById(id).get();
    }
}
