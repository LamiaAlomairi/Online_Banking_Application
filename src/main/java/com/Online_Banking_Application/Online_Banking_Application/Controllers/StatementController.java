package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankStatement;
import com.Online_Banking_Application.Online_Banking_Application.Services.StatementService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "statement")
public class StatementController {
    //    http://localhost:8080/statement/getAll
    @Autowired
    StatementService statementService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<BankStatement> getAllStatements() {

        return statementService.getAllStatements();
    }
    @GetMapping(value = "getById")
    public BankStatement getStatementById(@RequestParam Long id) {

        return statementService.getStatementById(id);
    }
}
