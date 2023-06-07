package com.Online_Banking_Application.Online_Banking_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "credit_card")
public class CreditCard {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Long cardNumber;
    Integer limit;
    Double balance;
    Integer interestRate;
    String paymentDueDate;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account account;
}
