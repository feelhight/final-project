package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.InstallmentPlan;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface InstallmentPlanRepo extends JpaRepository<InstallmentPlan,Integer> {
    @Override
    List<InstallmentPlan> findAll();
}
