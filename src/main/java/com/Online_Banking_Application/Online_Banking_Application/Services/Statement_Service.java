package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Statement;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Statement_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Statement_Service {
    @Autowired
    Statement_Repository statement_repository;
    public List<Statement> getAllStatements() {

        return statement_repository.findAll();
    }

    public Statement getStatementById(Long id) {

        return statement_repository.findById(id).get();
    }
}
