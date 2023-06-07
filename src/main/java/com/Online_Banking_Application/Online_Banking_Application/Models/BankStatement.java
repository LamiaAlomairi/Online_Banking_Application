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
    Long id;

    String startDate;
    String endDate;
    String bankTransaction;
    Double startingBalance;
    Double endingBalance;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account account;
}
