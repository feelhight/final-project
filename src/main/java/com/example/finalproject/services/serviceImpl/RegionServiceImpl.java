package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.RegionResponse;
import com.example.finalproject.mappers.RegionMapper;
import com.example.finalproject.models.Region;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.RegionService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;
import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class RegionServiceImpl implements RegionService {
    private final RegionRepo regionRepo;
    @Override
    public List<RegionResponse> getRegion(){
        List<RegionResponse>  a = regionRepo.allRegion().stream()
                .map(RegionMapper.INSTANCE::regionToRegionResponse)
                .collect(Collectors.toList());
        return a;
    }



    @Override
    public Region findRegionByIdAndEditCity(Integer id, String street){
        Region region = regionRepo.findRegionById(id);
        region.setStreet(street);
        regionRepo.save(region);
        return region;
    }


}
