package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Loan;
import com.Online_Banking_Application.Online_Banking_Application.Services.Loan_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "loan")
public class Loan_Controller {
    //    http://localhost:8080/attendee/getAll
    @Autowired
    Loan_Service loan_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Loan> getAllLoans() {

        return loan_service.getAllLoans();
    }
    @GetMapping(value = "getById")
    public Loan getLoanById(@RequestParam Long id) {

        return loan_service.getLoanById(id);
    }
}
