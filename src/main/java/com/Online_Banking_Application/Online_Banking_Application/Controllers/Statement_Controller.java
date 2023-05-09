package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankStatement;
import com.Online_Banking_Application.Online_Banking_Application.Services.Statement_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "statement")
public class Statement_Controller {
    //    http://localhost:8080/statement/getAll
    @Autowired
    Statement_Service statement_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<BankStatement> getAllStatements() {

        return statement_service.getAllStatements();
    }
    @GetMapping(value = "getById")
    public BankStatement getStatementById(@RequestParam Long id) {

        return statement_service.getStatementById(id);
    }
}
