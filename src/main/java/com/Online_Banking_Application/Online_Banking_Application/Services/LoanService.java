package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Loan;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.LoanRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class LoanService {
    @Autowired
    LoanRepository loanRepository;
    public List<Loan> getAllLoans() {

        return loanRepository.findAll();
    }

    public Loan getLoanById(Long id) {

        return loanRepository.findById(id).get();
    }
}
