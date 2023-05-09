package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transaction;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Transaction_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Transaction_Service {
    @Autowired
    Transaction_Repository transaction_repository;
    public List<Transaction> getAllTransactions() {

        return transaction_repository.findAll();
    }

    public Transaction getTransactionById(Long id) {

        return transaction_repository.findById(id).get();
    }
}
