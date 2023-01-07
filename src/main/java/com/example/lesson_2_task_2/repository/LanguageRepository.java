package com.example.lesson_2_task_2.repository;

import com.example.lesson_2_task_2.entity.Language;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;

@RepositoryRestResource(path = "language")
public interface LanguageRepository extends JpaRepository<Language, Integer> {
}
