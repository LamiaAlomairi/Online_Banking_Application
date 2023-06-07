package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Loan;
import org.springframework.data.jpa.repository.JpaRepository;

public interface LoanRepository extends JpaRepository<Loan, Long> {
}
