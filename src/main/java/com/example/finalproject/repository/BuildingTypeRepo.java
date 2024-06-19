package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface BuildingTypeRepo extends JpaRepository<BuildingType,Integer> {
    @Override
    List<BuildingType> findAll();

}
