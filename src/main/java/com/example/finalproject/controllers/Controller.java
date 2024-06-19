package com.example.finalproject.controllers;

import com.example.finalproject.dtos.EstateDto;
import com.example.finalproject.services.serviceImpl.EstateServiceImpl;
import lombok.AllArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/real_estate")
public class Controller {
    private final EstateServiceImpl estateService;
    @PostMapping("/create")
    public ResponseEntity<String> createEstate(@RequestBody EstateDto estateDto){
        estateService.createEstate(estateDto);
        return ResponseEntity.ok("estate created");
    }
}
