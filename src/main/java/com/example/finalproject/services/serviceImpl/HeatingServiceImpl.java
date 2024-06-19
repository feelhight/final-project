package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.HeatingResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.HeatingService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class HeatingServiceImpl implements HeatingService {
    private final HeatingRepo heatingRepo;
    @Override
    public HeatingResponse getHeating(){
        List<String> i = heatingRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new HeatingResponse(i);
    }
}
