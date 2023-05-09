package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Investment;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Investment_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Investment_Service {
    @Autowired
    Investment_Repository investment_repository;
    public List<Investment> getAllInvestments() {

        return investment_repository.findAll();
    }

    public Investment getInvestmentById(Long id) {

        return investment_repository.findById(id).get();
    }
}
