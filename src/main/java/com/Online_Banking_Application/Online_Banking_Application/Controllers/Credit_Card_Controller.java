package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.Credit_card;
import com.Online_Banking_Application.Online_Banking_Application.Services.Credit_Card_Service;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "credit_card")
public class Credit_Card_Controller {
    //    http://localhost:8080/credit_card/getAll
    @Autowired
    Credit_Card_Service credit_card_service;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<Credit_card> getAllCredit_cards() {

        return credit_card_service.getAllCredit_cards();
    }
    @GetMapping(value = "getById")
    public Credit_card getCredit_cardById(@RequestParam Long id) {

        return credit_card_service.getCredit_cardById(id);
    }
}
