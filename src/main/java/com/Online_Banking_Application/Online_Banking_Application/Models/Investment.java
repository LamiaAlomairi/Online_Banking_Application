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
    Long id;
    Double amount;
    String datePurchased;
    String currentValue;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account account;
}
