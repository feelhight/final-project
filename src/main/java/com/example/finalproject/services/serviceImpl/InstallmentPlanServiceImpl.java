package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.responces.InstallmentPlanResponse;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.InstallmentPlanService;
import lombok.AllArgsConstructor;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.stream.Collectors;

@AllArgsConstructor
@Service
public class InstallmentPlanServiceImpl implements InstallmentPlanService {
    private final InstallmentPlanRepo installmentPlanRepo;
    @Override
    public InstallmentPlanResponse getInstallmentPlan(){
        List<String> i = installmentPlanRepo.findAll().stream()
                .map(u -> u.getName())
                .collect(Collectors.toList());
        return new InstallmentPlanResponse(i);
    }
}
