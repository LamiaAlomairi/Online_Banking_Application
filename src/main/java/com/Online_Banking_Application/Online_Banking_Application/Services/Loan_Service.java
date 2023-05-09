package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Loan;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Loan_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Loan_Service {
    @Autowired
    Loan_Repository loan_repository;
    public List<Loan> getAllLoans() {

        return loan_repository.findAll();
    }

    public Loan getLoanById(Long id) {

        return loan_repository.findById(id).get();
    }
}
