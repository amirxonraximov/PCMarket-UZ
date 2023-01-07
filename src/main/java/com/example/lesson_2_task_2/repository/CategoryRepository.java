package com.example.lesson_2_task_2.repository;

import com.example.lesson_2_task_2.entity.Category;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

import java.util.List;

@RepositoryRestResource(path = "category")
public interface CategoryRepository extends JpaRepository<Category, Integer> {

    List<Category> getCategoriesByActive(Boolean active);

}
