package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Account;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.AccountRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class AccountService {
    @Autowired
    AccountRepository accountRepository;
    public List<Account> getAllAccounts() {

        return accountRepository.findAll();
    }

    public Account getAccountById(Long id) {

        return accountRepository.findById(id).get();
    }
}
