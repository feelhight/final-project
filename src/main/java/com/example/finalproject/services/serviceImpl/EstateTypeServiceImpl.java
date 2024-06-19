package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.EstateTypeResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.EstateTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class EstateTypeServiceImpl implements EstateTypeService {
    private final EstateTypeRepo estateTypeRepo;
    @Override
    public EstateTypeResponse getEstateType(){
        List<String> i = estateTypeRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new EstateTypeResponse(i);
    }
}
