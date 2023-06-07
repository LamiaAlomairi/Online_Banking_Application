package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Loan;
import com.Online_Banking_Application.Online_Banking_Application.Services.LoanService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "loan")
public class LoanController {
    //    http://localhost:8080/loan/getAll
    @Autowired
    LoanService loanService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Loan> getAllLoans() {

        return loanService.getAllLoans();
    }
    @GetMapping(value = "getById")
    public Loan getLoanById(@RequestParam Long id) {

        return loanService.getLoanById(id);
    }
}
