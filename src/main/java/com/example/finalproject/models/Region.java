package com.example.finalproject.models;

import com.fasterxml.jackson.annotation.JsonValue;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;

import java.util.List;

@Entity(name = "region")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Region {

    @Id
    Integer id;

    public Region(Integer id, String name, String city) {
        this.id = id;
        this.name = name;
        this.city = city;
    }
    String name;
    String city;
    String street;
    Integer cityId;
    Integer regionId;
    boolean active = true;

    public Region(int id,String street) {
        this.id = id;
        this.street = street;
    }
}
