package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Transfer;
import com.Online_Banking_Application.Online_Banking_Application.Services.TransferService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "transfer")
public class TransferController {
    //    http://localhost:8080/transfer/getAll
    @Autowired
    TransferService transferService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Transfer> getAllTransfers() {

        return transferService.getAllTransfers();
    }
    @GetMapping(value = "getById")
    public Transfer getTransferById(@RequestParam Long id) {

        return transferService.getTransferById(id);
    }
}
