package com.example.finalproject.Heating;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

@Entity(name = "Property")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Estate {
    @Id
    Integer id;
    Integer rooms;
    String series;
    String structureType;
    Integer yearBuild;
    Integer floor;
    String region;
    String condition;
    String settlement;
    String district;
    String streetName;
    String houseName;
    Integer priceMin;
    Integer priceMax;
    String currency;
    String priceType;
    String installmentPlan;
    String mortgage;
    String exchangeOption;


}
