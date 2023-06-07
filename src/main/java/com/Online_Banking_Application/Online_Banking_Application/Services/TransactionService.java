package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankTransaction;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.TransactionRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransactionService {
    @Autowired
    TransactionRepository transactionRepository;
    public List<BankTransaction> getAllTransactions() {

        return transactionRepository.findAll();
    }

    public BankTransaction getTransactionById(Long id) {

        return transactionRepository.findById(id).get();
    }
}
