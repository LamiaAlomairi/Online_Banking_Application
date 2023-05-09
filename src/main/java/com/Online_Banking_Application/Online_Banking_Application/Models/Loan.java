package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long loan_id;
    Double principal_amount;
    Integer interest_rate;
    Integer term;
    Long payment_amount;

}
