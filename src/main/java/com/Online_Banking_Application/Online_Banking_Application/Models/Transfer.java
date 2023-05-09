package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long transfer_id;
    Long from_account_id;
    Long to_account_id;
    String date;
    Double amount;
    String description;

}
