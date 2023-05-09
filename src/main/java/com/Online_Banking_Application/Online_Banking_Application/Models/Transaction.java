package com.Online_Banking_Application.Online_Banking_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "transaction")
public class Transaction {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long transaction_id;
    String date;
    Double amount;
    String description;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "account_id")
    Account account;


}
