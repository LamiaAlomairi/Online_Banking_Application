package com.Online_Banking_Application.Online_Banking_Application.Models;

import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;

public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long customer_id;
    String name;
    String email;
    Integer phone;
    String address;

}
