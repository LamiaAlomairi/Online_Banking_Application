package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transaction;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Transaction_Repository extends JpaRepository<Transaction, Long> {
}
