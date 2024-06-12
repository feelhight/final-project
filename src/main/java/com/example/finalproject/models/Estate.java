package com.example.finalproject.models;
import jakarta.persistence.*;
import lombok.*;
import lombok.experimental.Accessors;
import lombok.experimental.FieldDefaults;
import org.hibernate.procedure.internal.ProcedureParamBindings;

@Entity(name = "estate")
@Setter
@Getter
@NoArgsConstructor
@AllArgsConstructor
@Accessors(chain = true)
@FieldDefaults(level = AccessLevel.PRIVATE)
public class Estate {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    Integer id;
    Integer buildingYear;
    Integer floor;
    String houseNum;
    boolean active = true;
    boolean price;
    String price_type;
    @ManyToOne
    @JoinColumn(name = "building_type_id")
    BuildingType buildingType;
    @ManyToOne
    @JoinColumn(name = "deal_type_id")
    DealType dealType;
    @ManyToOne
    @JoinColumn(name = "estate_type_id")
    EstateType estateType;
    @ManyToOne
    @JoinColumn(name = "heating_id")
    Heating heating;
    @ManyToOne
    @JoinColumn(name = "installment_plan_id")
    InstallmentPlan installmentPlan;
    @ManyToOne
    @JoinColumn(name = "mortgage_id")
    Mortgage mortgage;
    @ManyToOne
    @JoinColumn(name = "Possibility_of_exchange_id")
    PossibilityOfExchange possibilityOfExchange;
    @ManyToOne
    @JoinColumn(name = "region_id")
    Region region;
    @ManyToOne
    @JoinColumn(name = "residential_complex_id")
    ResidentialComplex residentialComplex;
    @ManyToOne
    @JoinColumn(name = "rooms_id")
    Rooms rooms;
    @ManyToOne
    @JoinColumn(name = "series_id")
    Series series;
    @ManyToOne
    @JoinColumn(name = "state_id")
    State state;

}
