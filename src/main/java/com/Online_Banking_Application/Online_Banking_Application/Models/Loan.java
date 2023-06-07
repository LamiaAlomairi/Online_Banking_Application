package com.Online_Banking_Application.Online_Banking_Application.Models;

import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;

@Getter
@Setter
@Data
@Entity
@Table(name = "loan")
public class Loan {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    Double principalAmount;
    Integer interestRate;
    Integer term;
    Long paymentAmount;

    @ManyToOne
    @JoinColumn(name = "account_id", referencedColumnName = "id")
    Account account;
}
