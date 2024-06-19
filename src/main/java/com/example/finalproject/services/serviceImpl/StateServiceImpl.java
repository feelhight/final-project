package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.StateResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.StateService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class StateServiceImpl implements StateService {
    private final StateRepo stateRepo;
    @Override
    public StateResponse getState(){
        return new StateResponse(stateRepo.findAll().stream()
                .map(u -> u.getName()).collect(Collectors.toList()));
    }
}
