package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Account;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Account_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Account_Service {
    @Autowired
    Account_Repository account_repository;
    public List<Account> getAllAccounts() {

        return account_repository.findAll();
    }

    public Account getAccountById(Long id) {

        return account_repository.findById(id).get();
    }
}
