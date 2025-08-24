package com.petpital.vet_service.util;

import com.petpital.vet_service.dto.PetDTO;
import com.petpital.vet_service.model.Pet;

public class PetMapper {

    public static PetDTO toDTO(Pet pet){
        PetDTO petDTO = new PetDTO();
        petDTO.setId(String.valueOf(pet.getId()));
        petDTO.setName(pet.getPetName());
        petDTO.setOwnerName(pet.getOwnerName());
        petDTO.setSpecies(pet.getSpecies().name());
        petDTO.setAddress(pet.getAddress());
        petDTO.setVisitDate(pet.getVisitDate().toString());
        return petDTO;
    }
    
}
