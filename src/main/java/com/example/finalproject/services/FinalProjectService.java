package com.example.finalproject.services;

import com.example.finalproject.models.*;
import com.example.finalproject.repository.*;
import com.example.finalproject.responces.BuildingTypeResponse;
import com.example.finalproject.responces.DealTypeResponse;
import lombok.AllArgsConstructor;
import lombok.NoArgsConstructor;
import org.springframework.http.ResponseEntity;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class FinalProjectService {
    private final BuildingTypeRepo buildingTypeRepo;
    private final DealTypeRepo dealTypeRepo;
    private final EstateRepo estateRepo;
    private final EstateTypeRepo estateTypeRepo;
    private final HeatingRepo heatingRepo;
    private final InstallmentPlanRepo installmentPlanRepo;
    private final MortgageRepo mortgageRepo;
    private final PossibilityOfExchangeRepo possibilityOfExchangeRepo;
    private final RegionRepo regionRepo;
    private final ResidentialComplexRepo residentialComplexRepo;
    private final RoomsRepo roomsRepo;
    private final SeriesRepo seriesRepo;
    private final StateRepo stateRepo;



    public List<EstateType> getEstateType(){
        return estateTypeRepo.findAll();
    }
    public BuildingTypeResponse getBuildingType(){
        List<String> i = buildingTypeRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new  BuildingTypeResponse(i);
    }
    public DealTypeResponse getDealType(){

        List<String> i = dealTypeRepo.findAll().stream()
            .map(u -> u.getName())
            .collect(Collectors.toList());
        return new DealTypeResponse(i);
    }
    public List<Heating> getHeating(){
        return heatingRepo.findAll();
    }
    public List<InstallmentPlan> getInstallmentPlan(){
        return installmentPlanRepo.findAll();
    }
    public List<Mortgage> getMortgage(){
        return mortgageRepo.findAll();
    }
    public List<PossibilityOfExchange> getPossibilityOfExchange(){
        return possibilityOfExchangeRepo.findAll();
    }
    public List<Region> getRegion(){
        return regionRepo.findAll();
    }
    public List<ResidentialComplex> getResidentComplex(){
        return residentialComplexRepo.findAll();
    }
    public List<Rooms> getRooms(){
        return roomsRepo.findAll();
    }
    public List<Series> getSeries(){
        return seriesRepo.findAll();
    }
    public List<State> getState(){
        return stateRepo.findAll();
    }
    public void createEstate(){

    }



}
