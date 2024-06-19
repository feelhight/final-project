package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.MortgageResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.MortgageService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class MortgageServiceImpl implements MortgageService {
    private final MortgageRepo mortgageRepo;
    @Override
    public MortgageResponse getMortgage(){
        List<String> i = mortgageRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new MortgageResponse(i);
    }
}
