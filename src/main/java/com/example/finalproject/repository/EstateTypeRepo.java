package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.EstateType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface EstateTypeRepo extends JpaRepository<EstateType,Integer> {
    @Override
    List<EstateType> findAll();
}
