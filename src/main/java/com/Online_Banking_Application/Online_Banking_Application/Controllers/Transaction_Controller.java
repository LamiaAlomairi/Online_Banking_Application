package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankTransaction;
import com.Online_Banking_Application.Online_Banking_Application.Services.Transaction_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "transaction")
public class Transaction_Controller {
    //    http://localhost:8080/transaction/getAll
    @Autowired
    Transaction_Service transaction_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<BankTransaction> getAllTransactions() {

        return transaction_service.getAllTransactions();
    }
    @GetMapping(value = "getById")
    public BankTransaction getTransactionById(@RequestParam Long id) {

        return transaction_service.getTransactionById(id);
    }
}
