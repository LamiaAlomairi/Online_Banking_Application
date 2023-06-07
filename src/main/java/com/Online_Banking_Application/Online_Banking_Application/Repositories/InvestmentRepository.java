package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Investment;
import org.springframework.data.jpa.repository.JpaRepository;

public interface InvestmentRepository extends JpaRepository<Investment, Long> {
}
