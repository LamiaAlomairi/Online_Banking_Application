package com.Online_Banking_Application.Online_Banking_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "bankstatement")
public class BankStatement {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long statement_id;

    String start_date;
    String end_date;
    String bankTransaction;
    Double starting_balance;
    Double ending_balance;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    Account account;
}
