package com.petpital.vet_service.model;

import com.petpital.vet_service.util.SpeciesType;
import jakarta.persistence.*;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

@Entity
@Data
@Table(name="Pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String petName;
    @NotNull
    private String ownerName;
    @NotNull
    private SpeciesType species;
    @NotNull
    private String address;
    @NotNull
    private LocalDate visitDate;
}