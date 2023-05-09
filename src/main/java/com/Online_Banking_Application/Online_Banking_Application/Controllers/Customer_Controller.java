package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Customer;
import com.Online_Banking_Application.Online_Banking_Application.Services.Customer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "customer")
public class Customer_Controller {
    //    http://localhost:8080/customer/getAll
    @Autowired
    Customer_Service customer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customer_service.getAllCustomers();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Long id) {

        return customer_service.getCustomerById(id);
    }
}
