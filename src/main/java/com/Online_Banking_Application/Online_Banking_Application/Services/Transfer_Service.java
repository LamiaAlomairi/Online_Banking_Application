package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transfer;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Transfer_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Transfer_Service {
    @Autowired
    Transfer_Repository transfer_repository;
    public List<Transfer> getAllTransfers() {

        return transfer_repository.findAll();
    }

    public Transfer getTransferById(Long id) {

        return transfer_repository.findById(id).get();
    }
}
