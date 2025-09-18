package com.petpital.vet_service.service;

import java.time.LocalDate;
import java.util.List;

import org.springframework.stereotype.Service;

import com.petpital.vet_service.dto.PetRequestDTO;
import com.petpital.vet_service.dto.PetResponseDTO;
import com.petpital.vet_service.exception.RecordAlreadyExistsException;
import com.petpital.vet_service.model.Pet;
import com.petpital.vet_service.repository.PetRepository;
import com.petpital.vet_service.util.PetMapper;

@Service
public class PetService {

    private PetRepository petRepository;

    // Constructor injection for PetRepository
    public PetService(PetRepository petRepository) {
        this.petRepository = petRepository;
    }

    public List<PetResponseDTO> getAllPets() {
        List<Pet> pets = petRepository.findAll();
        return pets.stream().map(pet-> PetMapper.toDTO(pet)).toList();
    }

    public PetResponseDTO createPetRecord(PetRequestDTO petRequestDTO){
        if(petRecordExists(petRequestDTO.getPetName(), petRequestDTO.getEmail())){
            throw new RecordAlreadyExistsException("A pet registration already exists for this email: " + petRequestDTO.getEmail() + " within last week.");
        }
        Pet savedPet = petRepository.save(PetMapper.toModel(petRequestDTO));
        return PetMapper.toDTO(savedPet);
    }

    private boolean petRecordExists(String petName, String email) {
        return petRepository.findByPetNameAndEmailAndRegisteredDateBetween(petName, email, LocalDate.now().minusWeeks(1), LocalDate.now()).isPresent();
    }

    public PetResponseDTO updatePetRecord(Long petId, PetRequestDTO petRequestDTO) {
        Pet petToUpdate = petRepository.findById(petId)
                .orElseThrow(() -> new PetNotFoundException("Pet not found with id: " + petId));
        Pet otherPetRecord = petRepository.findByPetNameAndEmailAndRegisteredDateBetween(petRequestDTO.getPetName(), petRequestDTO.getEmail(), LocalDate.now().minusWeeks(1), LocalDate.now())
                .orElse(null);
        if(otherPetRecord != null && !otherPetRecord.getId().equals(petId)) {
            throw new RecordAlreadyExistsException("A pet registration already exists for this email: " + petRequestDTO.getEmail());
        }
        PetMapper.updateModel(petToUpdate, petRequestDTO);
        Pet updatedPet = petRepository.save(petToUpdate);
        return PetMapper.toDTO(updatedPet);
    }

    public void deletePetRecord(Long petId) {
        if(!petRepository.existsById(petId)) {
            throw new PetNotFoundException("Pet not found with id: " + petId);
        }
        petRepository.deleteById(petId);
    }

}
