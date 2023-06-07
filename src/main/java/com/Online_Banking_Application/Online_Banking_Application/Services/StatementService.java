package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankStatement;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.StatementRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class StatementService {
    @Autowired
    StatementRepository statementRepository;
    public List<BankStatement> getAllStatements() {

        return statementRepository.findAll();
    }

    public BankStatement getStatementById(Long id) {

        return statementRepository.findById(id).get();
    }
}
