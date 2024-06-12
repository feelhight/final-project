package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.ResidentialComplex;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface ResidentialComplexRepo extends JpaRepository<ResidentialComplex,Integer> {
    @Override
    List<ResidentialComplex> findAll();
}
