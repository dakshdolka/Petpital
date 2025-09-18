package com.petpital.vet_service.dto;

import com.petpital.vet_service.util.SpeciesType;

import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotBlank;
import jakarta.validation.constraints.NotNull;
import jakarta.validation.constraints.Size;
import lombok.Data;

@Data
public class PetRequestDTO {
    @NotBlank(message = "Pet name is mandatory")
    @Size(max = 100, message = "Pet name must be less than 100 characters")
    private String petName;

    @NotBlank(message = "Owner name is mandatory")
    @Size(max = 100, message = "Owner name must be less than 100 characters")
    private String ownerName;
    @NotNull
    private SpeciesType species;

    @NotBlank(message = "Address is mandatory")
    @Size(max = 200, message = "Address must be less than 200 characters")
    private String address;


    @NotNull
    @Email(message = "Email should be valid")
    private String email;

}
