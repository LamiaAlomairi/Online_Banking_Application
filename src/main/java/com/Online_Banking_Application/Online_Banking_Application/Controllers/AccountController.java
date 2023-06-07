package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Account;
import com.Online_Banking_Application.Online_Banking_Application.Services.AccountService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "account")
public class AccountController {
    //    http://localhost:8080/account/getAll
    @Autowired
    AccountService accountService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Account> getAllAccounts() {

        return accountService.getAllAccounts();
    }
    @GetMapping(value = "getById")
    public Account getAccountById(@RequestParam Long id) {

        return accountService.getAccountById(id);
    }
}
