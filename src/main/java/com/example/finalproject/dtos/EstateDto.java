package com.example.finalproject.dtos;

public record EstateDto(
        Integer dealType,
        Integer estateType,
        Integer roomsCount,
        Integer residentialComplex,
        Integer series,
        Integer buildingType,
        Integer buildingYear,
        Integer floor,
        Integer heating,
        Integer state,
        Integer region,
        String street,
        String houseNum,
        String priceType,
        double price,
        Integer installmentPlan,
        Integer mortgage,
        Integer possibilityOfExchange) { }
