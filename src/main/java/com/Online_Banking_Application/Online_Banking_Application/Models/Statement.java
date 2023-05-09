package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Statement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long statement_id;
    String start_date;
    String end_date;
    String transaction;
    Double starting_balance;
    Double ending_balance;
}
