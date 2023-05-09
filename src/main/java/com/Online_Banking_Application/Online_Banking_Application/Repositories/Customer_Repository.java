package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Customer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface Customer_Repository extends JpaRepository<Customer, Long> {
}
