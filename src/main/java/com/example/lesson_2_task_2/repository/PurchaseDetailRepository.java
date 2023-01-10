package com.example.lesson_2_task_2.repository;

import com.example.lesson_2_task_2.entity.PurchaseDetail;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.rest.core.annotation.RepositoryRestResource;


public interface PurchaseDetailRepository extends JpaRepository<PurchaseDetail, Integer> {

}
