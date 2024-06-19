package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.DealTypeResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.DealTypeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class DealTypeServiceImpl implements DealTypeService {
    private final DealTypeRepo dealTypeRepo;
    @Override
    public DealTypeResponse getDealType(){
        List<String> i = dealTypeRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new DealTypeResponse(i);
    }
}
