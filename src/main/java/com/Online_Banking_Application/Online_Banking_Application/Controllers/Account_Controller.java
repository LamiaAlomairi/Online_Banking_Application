package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Account;
import com.Online_Banking_Application.Online_Banking_Application.Services.Account_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "account")
public class Account_Controller {
    //    http://localhost:8080/account/getAll
    @Autowired
    Account_Service account_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {

        return account_service.getAllAccounts();
    }
    @GetMapping(value = "getById")
    public Account getAccountById(@RequestParam Long id) {

        return account_service.getAccountById(id);
    }
}
