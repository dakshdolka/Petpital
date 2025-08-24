package com.petpital.vet_service.dto;

import lombok.Getter;
import lombok.Setter;

@Getter
@Setter
public class PetDTO {
    private String id;

    private String name;

    private String ownerName;

    private String species;

    private String address;

    private String visitDate;
}
