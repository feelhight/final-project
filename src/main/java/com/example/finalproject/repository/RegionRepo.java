package com.example.finalproject.repository;

import com.example.finalproject.dtos.responces.RegionResponse;
import com.example.finalproject.models.BuildingType;
import com.example.finalproject.models.Region;
import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.data.jpa.repository.Modifying;
import org.springframework.data.jpa.repository.Query;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Repository;

import java.util.List;

@Repository
public interface RegionRepo extends JpaRepository<Region,Integer> {

    @Query("select distinct new com.example.finalproject.models.Region( r1.cityId, r2.name, r1.city) FROM region r1 JOIN region r2 ON r1.regionId = r2.id order by r1.cityId")
    List<Region> allRegion();

    @Query("SELECT new com.example.finalproject.models.Region(r1.cityId, r2.name, r1.city) FROM region r1 JOIN region r2 ON r1.regionId = r2.id WHERE r1.cityId = :id" )
    Region findRegionById(@Param("id") Integer id);
}
