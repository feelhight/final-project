package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.ResidentialComplexResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.ResidentialComplexService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class ResidentialComplexServiceImpl implements ResidentialComplexService {
    private final ResidentialComplexRepo residentialComplexRepo;
    @Override
    public ResidentialComplexResponse getResidentComplex(){
        List<String> i = residentialComplexRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new ResidentialComplexResponse(i);
    }
}
