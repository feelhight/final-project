package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.PossibilityOfExchangeResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.PossibilityOfExchangeService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class PossibilityOfExchangeServiceImpl implements PossibilityOfExchangeService {
    private final PossibilityOfExchangeRepo possibilityOfExchangeRepo;
    @Override
    public PossibilityOfExchangeResponse getPossibilityOfExchange(){
        List<String> i = possibilityOfExchangeRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new PossibilityOfExchangeResponse(i);
    }
}
