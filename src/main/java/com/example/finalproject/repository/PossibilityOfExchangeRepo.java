package com.example.finalproject.repository;

import com.example.finalproject.models.PossibilityOfExchange;
import org.springframework.data.jpa.repository.JpaRepository;

import java.util.List;

public interface PossibilityOfExchangeRepo extends JpaRepository<PossibilityOfExchange,Integer> {
    @Override
    List<PossibilityOfExchange> findAll();
}
