package com.example.lesson_2_task_2.entity;

import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;

import java.util.List;

@Data
@AllArgsConstructor
@NoArgsConstructor
@Entity
public class Payment {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;

    private String customerName;

    private String phoneNumber;

    private String email;

    private String address;

    @OneToMany
    private List<PurchaseDetail> purchaseDetailList;

    @OneToOne
    private Currency currency;

}
