package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.CreditCard;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.CreditCardRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class CreditCardService {
    @Autowired
    CreditCardRepository creditCardRepository;
    public List<CreditCard> getAllCredit_cards() {

        return creditCardRepository.findAll();
    }

    public CreditCard getCredit_cardById(Long id) {

        return creditCardRepository.findById(id).get();
    }
}
