package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Investment;
import com.Online_Banking_Application.Online_Banking_Application.Services.InvestmentService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "investment")
public class InvestmentController {
    //    http://localhost:8080/investment/getAll
    @Autowired
    InvestmentService investmentService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Investment> getAllInvestments() {

        return investmentService.getAllInvestments();
    }
    @GetMapping(value = "getById")
    public Investment getInvestmentById(@RequestParam Long id) {

        return investmentService.getInvestmentById(id);
    }
}
