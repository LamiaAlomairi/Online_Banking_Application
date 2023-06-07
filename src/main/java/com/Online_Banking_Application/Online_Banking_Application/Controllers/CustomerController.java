package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Customer;
import com.Online_Banking_Application.Online_Banking_Application.Services.CustomerService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "customer")
public class CustomerController {
    //    http://localhost:8080/customer/getAll
    @Autowired
    CustomerService customerService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Customer> getAllCustomers() {

        return customerService.getAllCustomers();
    }
    @GetMapping(value = "getById")
    public Customer getCustomerById(@RequestParam Long id) {

        return customerService.getCustomerById(id);
    }
}
