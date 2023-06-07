package com.Online_Banking_Application.Online_Banking_Application.Repositories;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transfer;
import org.springframework.data.jpa.repository.JpaRepository;

public interface TransferRepository extends JpaRepository<Transfer, Long> {
}
