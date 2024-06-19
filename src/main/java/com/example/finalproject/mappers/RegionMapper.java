package com.example.finalproject.mappers;

import com.example.finalproject.models.Region;
import com.example.finalproject.dtos.responces.RegionResponse;
import org.mapstruct.Mapper;
import org.mapstruct.Mapping;
import org.mapstruct.factory.Mappers;

@Mapper
public interface RegionMapper {
    RegionMapper INSTANCE = Mappers.getMapper(RegionMapper.class);
    @Mapping(target = "id", source = "id")
    @Mapping(target = "region", source = "name")
    @Mapping(target = "city", source = "city")
    RegionResponse regionToRegionResponse(Region region);
}
