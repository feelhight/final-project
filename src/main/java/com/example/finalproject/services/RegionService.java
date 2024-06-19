package com.example.finalproject.services;

import com.example.finalproject.dtos.responces.RegionResponse;
import com.example.finalproject.models.Region;

import java.util.List;

public interface RegionService {
    List<RegionResponse> getRegion();

    Region findRegionByIdAndEditCity(Integer id, String city);
}
