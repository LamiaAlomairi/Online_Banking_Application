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
@Table(name = "transfer")
public class Transfer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long transfer_id;
    Long from_account_id;
    Long to_account_id;
    String date;
    Double amount;
    String description;

//    @ManyToMany(mappedBy = "transfer")
//    @JsonIgnore
//    private List<Account> accounts;

//    @ManyToMany
//    @JoinTable(name = "account_transfer", joinColumns = @JoinColumn(name = "transfer_id"), inverseJoinColumns = @JoinColumn(name = "account_id"))
//    private List<Account> accounts;
}
