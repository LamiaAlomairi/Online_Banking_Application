package com.Online_Banking_Application.Online_Banking_Application.Services;

import com.Online_Banking_Application.Online_Banking_Application.Models.Credit_card;
import com.Online_Banking_Application.Online_Banking_Application.Repositories.Credit_Card_Repository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;

@Service
public class Credit_Card_Service {
    @Autowired
    Credit_Card_Repository credit_card_repository;
    public List<Credit_card> getAllCredit_cards() {

        return credit_card_repository.findAll();
    }

    public Credit_card getCredit_cardById(Long id) {

        return credit_card_repository.findById(id).get();
    }
}
