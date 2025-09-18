package com.petpital.vet_service.util;
import com.petpital.vet_service.dto.PetRequestDTO;
import com.petpital.vet_service.dto.PetResponseDTO;
import com.petpital.vet_service.model.Pet;

public class PetMapper {

    public static PetResponseDTO toDTO(Pet pet){
        PetResponseDTO petDTO = new PetResponseDTO();
        petDTO.setId(String.valueOf(pet.getId()));
        petDTO.setName(pet.getPetName());
        petDTO.setOwnerName(pet.getOwnerName());
        petDTO.setSpecies(pet.getSpecies().name());
        petDTO.setAddress(pet.getAddress());
        petDTO.setEmail(pet.getEmail());
        petDTO.setRegisteredDate(pet.getRegisteredDate());
        petDTO.setVisits(pet.getVisits());
        return petDTO;
    }

    public static Pet toModel(PetRequestDTO petRequestDTO) {
        Pet pet = new Pet();
        pet.setPetName(petRequestDTO.getPetName());
        pet.setOwnerName(petRequestDTO.getOwnerName());
        pet.setSpecies(petRequestDTO.getSpecies());
        pet.setAddress(petRequestDTO.getAddress());
        pet.setEmail(petRequestDTO.getEmail());
        return pet;
    }

    public static void updateModel(Pet pet, PetRequestDTO petRequestDTO) {
        pet.setPetName(petRequestDTO.getPetName());
        pet.setOwnerName(petRequestDTO.getOwnerName());
        pet.setSpecies(petRequestDTO.getSpecies());
        pet.setAddress(petRequestDTO.getAddress());
        pet.setEmail(petRequestDTO.getEmail());
    }

}
