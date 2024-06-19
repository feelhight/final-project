package com.example.finalproject.dtos.responces;

public record EstateResponse(String dealType,
                             String propertyType,
                             Integer roomCount,
                             String housingComplex,
                             String series,
                             String buildingType,
                             Integer yearBuilt,
                             Integer floor,
                             String heating,
                             String condition,
                             String region,
                             String settlement,
                             String district,
                             String streetName,
                             String houseNumber,
                             Integer priceMin,
                             Integer priceMax,
                             String currency,
                             String priceType,
                             String installmentPlan,
                             String mortgage,
                             String exchangeOption,
                             Integer page,
                             Integer pageSize)  {
    }

