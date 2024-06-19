package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.BuildingTypeResponse;
import com.example.finalproject.repository.BuildingTypeRepo;
import com.example.finalproject.services.BuildingTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class BuildingTypeServiceImpl implements BuildingTypeService {
    private final BuildingTypeRepo buildingTypeRepo;
    @Override
    public BuildingTypeResponse getBuildingType(){
        List<String> i = buildingTypeRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new BuildingTypeResponse(i);
    }
}
