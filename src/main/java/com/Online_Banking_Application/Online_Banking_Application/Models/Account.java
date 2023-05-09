package com.Online_Banking_Application.Online_Banking_Application.Models;

import com.fasterxml.jackson.annotation.JsonIgnore;
import lombok.Data;
import lombok.Getter;
import lombok.Setter;

import javax.persistence.*;
import java.util.List;

@Getter
@Setter
@Data
@Entity
@Table(name = "account")
public class Account {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long account_id;
    Long account_number;
    Double balance;

    @ManyToOne
    @JoinColumn(name = "customer_id", referencedColumnName = "customer_id")
    Customer customer;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Transaction> transactions;

    @ManyToMany
    @JoinTable(name = "event_attendees", joinColumns = @JoinColumn(name = "account_id"), inverseJoinColumns = @JoinColumn(name = "transfer_id"))
    private List<Transfer> transfers;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Loan> loans;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Credit_card> credit_cards;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Investment> investments;

    @OneToMany(mappedBy = "account")
    @JsonIgnore
    private List<Statement> statements;
}
