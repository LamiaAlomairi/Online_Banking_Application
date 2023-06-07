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
    Long id;
    Long fromAccountId;
    Long toAccountId;
    String date;
    Double amount;
    String description;

    @ManyToMany(mappedBy = "transfers")
    @JsonIgnore
    private List<Account> accounts;
}
