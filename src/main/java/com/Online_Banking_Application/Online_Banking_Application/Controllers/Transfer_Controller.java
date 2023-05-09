package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transfer;
import com.Online_Banking_Application.Online_Banking_Application.Services.Transfer_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "transfer")
public class Transfer_Controller {
    //    http://localhost:8080/transfer/getAll
    @Autowired
    Transfer_Service transfer_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Transfer> getAllTransfers() {

        return transfer_service.getAllTransfers();
    }
    @GetMapping(value = "getById")
    public Transfer getTransferById(@RequestParam Long id) {

        return transfer_service.getTransferById(id);
    }
}
