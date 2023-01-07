package com.example.lesson_2_task_2.payload;

import jakarta.persistence.OneToOne;
import lombok.Data;

@Data
public class ProductDto {

    private String name;

    @OneToOne
    private Integer photoId;

    private Double price;

    private Integer categoryId;
}
