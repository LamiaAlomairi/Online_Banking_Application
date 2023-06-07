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
@Table(name = "customer")
public class Customer {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long id;
    String name;
    String email;
    Integer phone;
    String address;

    @OneToMany(mappedBy = "customer")
    @JsonIgnore
    private List<Account> accounts;
}
