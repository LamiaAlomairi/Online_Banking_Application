package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankTransaction;
import com.Online_Banking_Application.Online_Banking_Application.Services.TransactionService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;
@RestController
@RequestMapping(value = "transaction")
public class TransactionController {
    //    http://localhost:8080/transaction/getAll
    @Autowired
    TransactionService transactionService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<BankTransaction> getAllTransactions() {

        return transactionService.getAllTransactions();
    }
    @GetMapping(value = "getById")
    public BankTransaction getTransactionById(@RequestParam Long id) {

        return transactionService.getTransactionById(id);
    }
}
