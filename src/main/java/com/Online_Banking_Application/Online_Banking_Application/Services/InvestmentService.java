package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Investment;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.InvestmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class InvestmentService {
    @Autowired
    InvestmentRepository investmentRepository;
    public List<Investment> getAllInvestments() {

        return investmentRepository.findAll();
    }

    public Investment getInvestmentById(Long id) {

        return investmentRepository.findById(id).get();
    }
}
