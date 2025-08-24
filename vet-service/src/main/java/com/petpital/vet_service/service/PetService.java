package com.petpital.vet_service.service;

import java.util.List;
import java.util.stream.Collectors;

import org.springframework.stereotype.Service;

import com.petpital.vet_service.dto.PetDTO;
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

    public List<PetDTO> getAllPets() {
        List<Pet> pets = petRepository.findAll();
        return pets.stream().map(pet-> PetMapper.toDTO(pet)).toList();
    }


}
