package com.example.lesson_2_task_2.entity;

import com.example.lesson_2_task_2.entity.template.AbsEntity;
import jakarta.persistence.Entity;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

@EqualsAndHashCode(callSuper = true)
@Data
@Entity
public class Language extends AbsEntity {

}
