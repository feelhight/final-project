package com.example.finalproject.controllers;

import com.example.finalproject.dtos.EstateDtoForResponse;
import com.example.finalproject.dtos.responces.*;
import com.example.finalproject.models.Estate;
import com.example.finalproject.services.serviceImpl.*;
import lombok.AllArgsConstructor;
import org.springframework.data.domain.Page;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@AllArgsConstructor
@RestController
@RequestMapping("api/v1/get_real_estate")
public class GetController {
    private final BuildingTypeServiceImpl buildingTypeService;
    private final DealTypeServiceImpl dealTypeService;
    private final EstateServiceImpl estateService;
    private final EstateTypeServiceImpl estateTypeService;
    private final HeatingServiceImpl heatingService;
    private final InstallmentPlanServiceImpl installmentPlanService;
    private final MortgageServiceImpl mortgageService;
    private final PossibilityOfExchangeServiceImpl possibilityOfExchangeService;
    private final RegionServiceImpl regionService;
    private final ResidentialComplexServiceImpl residentialComplexService;
    private final RoomsServiceImpl roomsService;
    private final SeriesServiceImpl seriesService;
    private final StateServiceImpl stateService;




    @GetMapping("/get_building_type")
    public ResponseEntity<BuildingTypeResponse> getBuildingType(){
        return ResponseEntity.ok(buildingTypeService.getBuildingType());
    }
    @GetMapping("/get_heating")
    public ResponseEntity<HeatingResponse> getHeating(){
        return ResponseEntity.ok(heatingService.getHeating());
    }
    @GetMapping("/get_installmentPlan")
    public ResponseEntity<InstallmentPlanResponse> getInstallmentPlan(){
        return ResponseEntity.ok(installmentPlanService.getInstallmentPlan());
    }
    @GetMapping("/get_mortgage")
    public ResponseEntity<MortgageResponse> getMortgage(){
        return ResponseEntity.ok(mortgageService.getMortgage());
    }
    @GetMapping("/get_estate_type")
    public ResponseEntity<EstateTypeResponse> getEstateType() {
        return ResponseEntity.ok(estateTypeService.getEstateType());
    }
    @GetMapping("/get_possibility_of_exchange")
    public ResponseEntity<PossibilityOfExchangeResponse> getPossibilityOfExchange() {
        return ResponseEntity.ok(possibilityOfExchangeService.getPossibilityOfExchange());
    }
    @GetMapping("/get_rooms")
    public ResponseEntity<RoomsResponse> getRooms() {
        return ResponseEntity.ok(roomsService.getRooms());
    }
    @GetMapping("/get_series")
    public ResponseEntity<SeriesResponse> getSeries() {
        return ResponseEntity.ok(seriesService.getSeries());
    }

    @GetMapping("/get_state")
    public ResponseEntity<StateResponse> getState() {
        return ResponseEntity.ok(stateService.getState());
    }
    @GetMapping("/get_resident_complex")
    public ResponseEntity<ResidentialComplexResponse> getResidentComplex() {
        return ResponseEntity.ok(residentialComplexService.getResidentComplex());
    }

    @GetMapping("/get_deal_type")
    public ResponseEntity<DealTypeResponse> getDealType() {
        return ResponseEntity.ok(dealTypeService.getDealType());
    }
    @GetMapping("/get_region")
    public ResponseEntity<List<RegionResponse>> getRegion() {
        return ResponseEntity.ok(regionService.getRegion());
    }

    @GetMapping("/get_estate")
    public ResponseEntity<Page<Estate>> getEstateListings(@RequestBody EstateDtoForResponse estateDtoForResponse) {
        Page<Estate> estates = estateService.findEstatesByCriteria(estateDtoForResponse);
        return ResponseEntity.ok().body(estates);
    }

}
