package com.Online_Banking_Application.Online_Banking_Application.Controllers;

import com.Online_Banking_Application.Online_Banking_Application.Models.CreditCard;
import com.Online_Banking_Application.Online_Banking_Application.Services.CreditCardService;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping(value = "credit_card")
public class CreditCardController {
    //    http://localhost:8080/credit_card/getAll
    @Autowired
    CreditCardService creditCardService;
    @RequestMapping(value = "getAll", method = RequestMethod.GET)
    public List<CreditCard> getAllCredit_cards() {

        return creditCardService.getAllCredit_cards();
    }
    @GetMapping(value = "getById")
    public CreditCard getCredit_cardById(@RequestParam Long id) {

        return creditCardService.getCredit_cardById(id);
    }
}
