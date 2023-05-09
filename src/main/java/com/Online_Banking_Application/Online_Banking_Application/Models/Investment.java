package com.Online_Banking_Application.Online_Banking_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "investment")
public class Investment {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long investment_id;
    Double amount;
    String date_purchased;
    String current_value;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    Account account;
}
