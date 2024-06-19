package com.example.finalproject.models;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.Entity;
import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Id;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.beans.ConstructorProperties;

@Entity(name = "estate_type")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class EstateType {

    @Id
    Integer id;
    @JsonValue
    String name;
    boolean active = true;

    public EstateType(Integer id) {
        this.id = id;
    }
}
