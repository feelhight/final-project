package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.Rooms;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RoomsRepo extends JpaRepository<Rooms,Integer> {
    @Override
    List<Rooms> findAll();
}
