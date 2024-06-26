package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.Heating;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface HeatingRepo extends JpaRepository<Heating,Integer> {
    @Override
    List<Heating> findAll();
}
