package com.example.lesson_2_task_2.payload;

import lombok.Data;

@Data
public class PurchaseDetailDto {

    private Integer productId;

    private Integer productAmount;
}
