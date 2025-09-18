package com.petpital.vet_service.dto;

import java.time.LocalDate;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetResponseDTO {
    private String id;

    private String name;

    private String ownerName;

    private String species;

    private String address;

    private String email;

    private LocalDate registeredDate;

    private int visits;

}
