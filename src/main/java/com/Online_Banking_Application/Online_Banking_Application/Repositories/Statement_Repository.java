package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.BankStatement;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Statement_Repository extends JpaRepository<BankStatement, Long> {
}
