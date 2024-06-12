package com.example.finalproject.models;
import com.fasterxml.jackson.databind.deser.std.DateDeserializers;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.time.LocalDate;

@Entity(name = "installment_plan")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class ExchangeRates {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    double rate;
    LocalDate startDate;
    LocalDate endDate;
}
