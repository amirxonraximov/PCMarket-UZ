package com.example.lesson_2_task_2.payload;

import jakarta.persistence.OneToMany;
import lombok.Data;

import java.util.List;

@Data
public class OrderDto {

    private String customerName;

    private String phoneNumber;

    private String email;

    private String address;

    @OneToMany
    private List<Integer> productIds;
}
