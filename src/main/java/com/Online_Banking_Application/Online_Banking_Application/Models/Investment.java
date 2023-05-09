package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long investment_id;
    Double amount;
    String date_purchased;
    String current_value;

}
