package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Account;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Account_Repository extends JpaRepository<Account, Long> {
}
