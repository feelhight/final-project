package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.DealType;
import com.example.finalproject.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Query;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface DealTypeRepo extends JpaRepository<DealType,Integer> {
    @Override
    List<DealType> findAll();


}
