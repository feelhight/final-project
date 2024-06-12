package com.example.finalproject.controllers;

import com.example.finalproject.responces.BuildingTypeResponse;
import com.example.finalproject.services.FinalProjectService;
import lombok.AllArgsConstructor;
import org.apache.coyote.Response;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
@AllArgsConstructor
@RestController
@RequestMapping("api/real_estate")
public class Controller {
    private final FinalProjectService finalProjectService;
    @GetMapping("/get_building_type")
    public ResponseEntity<BuildingTypeResponse> createEstate(){
        return ResponseEntity.ok(finalProjectService.getBuildingType());
    }


}
