package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.SeriesResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.SeriesService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class SeriesServiceImpl implements SeriesService {
    private final SeriesRepo seriesRepo;
    @Override
    public SeriesResponse getSeries(){
        return new SeriesResponse(seriesRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList()));
    }
}
