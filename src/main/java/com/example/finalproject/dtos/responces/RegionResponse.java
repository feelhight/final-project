package com.example.finalproject.dtos.responces;

import com.example.finalproject.models.Region;
import jakarta.persistence.UniqueConstraint;
import org.springframework.data.jpa.repository.Query;

import java.util.List;

public record RegionResponse(Integer id, String city,String region) {

}
