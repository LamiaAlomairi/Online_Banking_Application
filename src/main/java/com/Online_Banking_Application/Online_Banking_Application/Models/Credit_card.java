package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Credit_card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long card_id;
    Long card_number;
    Integer limit;
    Double balance;
    Integer interest_rate;
    String payment_due_date;

}
