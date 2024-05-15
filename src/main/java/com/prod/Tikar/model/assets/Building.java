package com.prod.Tikar.model.assets;

import java.util.List;

import com.prod.Tikar.model.Asset;
import com.prod.Tikar.model.Lessor;
import com.prod.Tikar.model.Staff;

import jakarta.persistence.*;
import lombok.Getter;
import lombok.Setter;

@Entity

@Setter
@Getter
public class Building extends Asset {
    public Building(Lessor lessor, Staff staff, int matricule, String name, String address, String description,
            long surfaceArea, long estimatedValue, Byte[] image, long numberOfFloors,
            boolean isActive) {
        super(lessor, staff, matricule, name, address, description, surfaceArea, estimatedValue, image, isActive);
        // this.basement = basement;
        this.numberOfFloors = numberOfFloors;
    }

    // @Id
    // @GeneratedValue(strategy = GenerationType.IDENTITY)
    // long id;

    @OneToMany(mappedBy = "building")
    List<Basement> basement;

    long numberOfFloors;

    // @Override
    // public String getAssetType() {
    // return "building";
    // }
}