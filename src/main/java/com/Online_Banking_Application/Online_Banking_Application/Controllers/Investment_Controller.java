package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Investment;
import com.Online_Banking_Application.Online_Banking_Application.Services.Investment_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "investment")
public class Investment_Controller {
    //    http://localhost:8080/investment/getAll
    @Autowired
    Investment_Service investment_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Investment> getAllInvestments() {

        return investment_service.getAllInvestments();
    }
    @GetMapping(value = "getById")
    public Investment getInvestmentById(@RequestParam Long id) {

        return investment_service.getInvestmentById(id);
    }
}
