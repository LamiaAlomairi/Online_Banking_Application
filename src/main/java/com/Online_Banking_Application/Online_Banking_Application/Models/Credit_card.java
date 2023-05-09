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
public class Credit_card {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    Long card_id;
    Long card_number;
    Integer limit;
    Double balance;
    Integer interest_rate;
    String payment_due_date;

}
