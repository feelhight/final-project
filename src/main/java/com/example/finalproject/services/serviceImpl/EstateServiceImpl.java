package com.example.finalproject.services.serviceImpl;

import com.example.finalproject.dtos.EstateDto;
import com.example.finalproject.dtos.EstateDtoForResponse;
import com.example.finalproject.dtos.responces.EstateResponse;
import com.example.finalproject.models.*;
import com.example.finalproject.repository.*;
import com.example.finalproject.services.EstateService;
import lombok.AllArgsConstructor;
import jakarta.persistence.criteria.*;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.PageRequest;
import org.springframework.data.domain.Pageable;
import org.springframework.data.domain.Sort;
import org.springframework.data.jpa.domain.Specification;
import org.springframework.stereotype.Service;

import java.util.ArrayList;
import java.util.List;
import java.util.Objects;


@AllArgsConstructor
@Service
public class EstateServiceImpl implements EstateService {
    private final EstateRepo estateRepo;
    private RegionServiceImpl regionService;


    @Override
    public void createEstate(EstateDto estateDto){
        Objects.requireNonNull(estateDto.buildingYear(), "Building year cannot be null");
        Objects.requireNonNull(estateDto.floor(), "Floor cannot be null");
        Objects.requireNonNull(estateDto.houseNum(), "House number cannot be null");
        Objects.requireNonNull(estateDto.price(), "Price cannot be null");
        Objects.requireNonNull(estateDto.priceType(), "Price type cannot be null");
        Objects.requireNonNull(estateDto.buildingType(), "Building type cannot be null");
        Objects.requireNonNull(estateDto.dealType(), "Deal type cannot be null");
        Objects.requireNonNull(estateDto.estateType(), "Estate type cannot be null");
        Objects.requireNonNull(estateDto.heating(), "Heating cannot be null");
        Objects.requireNonNull(estateDto.installmentPlan(), "Installment plan cannot be null");
        Objects.requireNonNull(estateDto.mortgage(), "Mortgage cannot be null");
        Objects.requireNonNull(estateDto.possibilityOfExchange(), "Possibility of exchange cannot be null");
        Objects.requireNonNull(estateDto.region(), "Region cannot be null");
        Objects.requireNonNull(estateDto.residentialComplex(), "Residential complex cannot be null");
        Objects.requireNonNull(estateDto.roomsCount(), "Rooms count cannot be null");
        Objects.requireNonNull(estateDto.series(), "Series cannot be null");
        Objects.requireNonNull(estateDto.state(), "State cannot be null");

        Estate estate = new Estate(
                estateDto.buildingYear(),
                estateDto.floor(),
                estateDto.houseNum(),
                estateDto.price(),
                estateDto.priceType(),
                new BuildingType(estateDto.buildingType()),
                new DealType(estateDto.dealType()),
                new EstateType(estateDto.estateType()),
                new Heating(estateDto.heating()),
                new InstallmentPlan(estateDto.installmentPlan()),
                new Mortgage(estateDto.mortgage()),
                new PossibilityOfExchange(estateDto.possibilityOfExchange()),
                regionService.findRegionByIdAndEditCity(estateDto.region(),estateDto.street()),
                new ResidentialComplex(estateDto.residentialComplex()),
                new Rooms(estateDto.roomsCount()),
                new Series(estateDto.series()),
                new State(estateDto.state())
        );
        estateRepo.save(estate);
    }
    public Page<Estate> findEstatesByCriteria(EstateDtoForResponse estateDtoForResponse) {
        Specification<Estate> spec = createSpecification(estateDtoForResponse);
        Pageable pageable = PageRequest.of(estateDtoForResponse.page() - 1, estateDtoForResponse.pageSize(), Sort.by("id").descending());

        return estateRepo.findAll(spec, pageable);
    }

    private Specification<Estate> createSpecification(EstateDtoForResponse estateDtoForResponse) {
        return (root, query, criteriaBuilder) -> {
            List<Predicate> predicates = new ArrayList<>();

            if (estateDtoForResponse.dealType() != null) {
                predicates.add(criteriaBuilder.equal(root.get("dealType").get("name"), estateDtoForResponse.dealType()));
            }
            if (estateDtoForResponse.propertyType() != null) {
                predicates.add(criteriaBuilder.equal(root.get("estateType").get("name"), estateDtoForResponse.propertyType()));
            }
            if (estateDtoForResponse.roomCount() != null) {
                predicates.add(criteriaBuilder.equal(root.get("rooms").get("count"), estateDtoForResponse.roomCount()));
            }
            if (estateDtoForResponse.housingComplex() != null) {
                predicates.add(criteriaBuilder.equal(root.get("residentialComplex").get("name"), estateDtoForResponse.housingComplex()));
            }
            if (estateDtoForResponse.series() != null) {
                predicates.add(criteriaBuilder.equal(root.get("series").get("name"), estateDtoForResponse.series()));
            }
            if (estateDtoForResponse.buildingType() != null) {
                predicates.add(criteriaBuilder.equal(root.get("buildingType").get("name"), estateDtoForResponse.buildingType()));
            }
            if (estateDtoForResponse.yearBuilt() != null) {
                predicates.add(criteriaBuilder.equal(root.get("buildingYear"), estateDtoForResponse.yearBuilt()));
            }
            if (estateDtoForResponse.floor() != null) {
                predicates.add(criteriaBuilder.equal(root.get("floor"), estateDtoForResponse.floor()));
            }
            if (estateDtoForResponse.heating() != null) {
                predicates.add(criteriaBuilder.equal(root.get("heating").get("name"), estateDtoForResponse.heating()));
            }
            if (estateDtoForResponse.condition() != null) {
                predicates.add(criteriaBuilder.equal(root.get("state").get("name"), estateDtoForResponse.condition()));
            }
            if (estateDtoForResponse.region() != null) {
                predicates.add(criteriaBuilder.equal(root.get("region").get("name"), estateDtoForResponse.region()));
            }
            if (estateDtoForResponse.settlement() != null) {
                predicates.add(criteriaBuilder.equal(root.get("region").get("settlement"), estateDtoForResponse.settlement()));
            }
            if (estateDtoForResponse.district() != null) {
                predicates.add(criteriaBuilder.equal(root.get("region").get("district"), estateDtoForResponse.district()));
            }
            if (estateDtoForResponse.streetName() != null) {
                predicates.add(criteriaBuilder.equal(root.get("region").get("streetName"), estateDtoForResponse.streetName()));
            }
            if (estateDtoForResponse.houseNumber() != null) {
                predicates.add(criteriaBuilder.equal(root.get("houseNum"), estateDtoForResponse.houseNumber()));
            }
            if (estateDtoForResponse.priceMin() != null && estateDtoForResponse.priceMax() != null) {
                predicates.add(criteriaBuilder.between(root.get("price"), estateDtoForResponse.priceMin(), estateDtoForResponse.priceMax()));
            } else if (estateDtoForResponse.priceMin() != null) {
                predicates.add(criteriaBuilder.greaterThanOrEqualTo(root.get("price"), estateDtoForResponse.priceMin()));
            } else if (estateDtoForResponse.priceMax() != null) {
                predicates.add(criteriaBuilder.lessThanOrEqualTo(root.get("price"), estateDtoForResponse.priceMax()));
            }
            if (estateDtoForResponse.currency() != null) {
                predicates.add(criteriaBuilder.equal(root.get("priceType"), estateDtoForResponse.currency()));
            }
            if (estateDtoForResponse.propertyType() != null) {
                predicates.add(criteriaBuilder.equal(root.get("priceType"), estateDtoForResponse.priceType()));
            }
            if (estateDtoForResponse.installmentPlan() != null) {
                predicates.add(criteriaBuilder.equal(root.get("installmentPlan").get("name"), estateDtoForResponse.installmentPlan()));
            }
            if (estateDtoForResponse.mortgage() != null) {
                predicates.add(criteriaBuilder.equal(root.get("mortgage").get("name"), estateDtoForResponse.mortgage()));
            }
            if (estateDtoForResponse.exchangeOption() != null) {
                predicates.add(criteriaBuilder.equal(root.get("possibilityOfExchange").get("name"), estateDtoForResponse.exchangeOption()));
            }

            return criteriaBuilder.and(predicates.toArray(new Predicate[0]));
        };
    }
}
