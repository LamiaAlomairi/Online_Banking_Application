package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long transaction_id;
    String date;
    Double amount;
    String description;

}
