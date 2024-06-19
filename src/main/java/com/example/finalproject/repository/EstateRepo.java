package com.example.finalproject.repository;

import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.Estate;
import org.hibernate.query.Page;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import java.awt.print.Pageable;
import java.util.List;

@Repository
public interface EstateRepo extends JpaRepository<Estate,Integer> {
    @Override
    List<Estate> findAll();

    org.springframework.data.domain.Page<Estate> findAll(Specification<Estate> spec, org.springframework.data.domain.Pageable pageable);

}
