package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transfer;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.TransferRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class TransferService {
    @Autowired
    TransferRepository transferRepository;
    public List<Transfer> getAllTransfers() {

        return transferRepository.findAll();
    }

    public Transfer getTransferById(Long id) {

        return transferRepository.findById(id).get();
    }
}
