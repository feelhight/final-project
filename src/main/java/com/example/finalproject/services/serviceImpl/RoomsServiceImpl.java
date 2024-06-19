package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.RoomsResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.RoomsService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RoomsServiceImpl implements RoomsService {
    private final RoomsRepo roomsRepo;
    @Override
    public RoomsResponse getRooms(){
        return new RoomsResponse(roomsRepo.findAll().stream()
                .map(u -> u.getRoomsCount())
                .collect(Collectors.toList()));
    }
}
