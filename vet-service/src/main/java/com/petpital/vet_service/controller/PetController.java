package com.petpital.vet_service.controller;

import java.util.List;

import jakarta.validation.groups.Default;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.petpital.vet_service.dto.PetRequestDTO;
import com.petpital.vet_service.dto.PetResponseDTO;
import com.petpital.vet_service.service.PetService;

import jakarta.validation.Valid;

import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.PathVariable;



@RestController
@RequestMapping("/pets")
public class PetController {

    private PetService petService;

    public PetController(PetService petService) {
        this.petService = petService;
    }

    @GetMapping
    public ResponseEntity<List<PetResponseDTO>> getAllPets() {
        return ResponseEntity.ok(petService.getAllPets());
    }

    @PostMapping
    public ResponseEntity<PetResponseDTO> createPetDetails(@Valid @RequestBody PetRequestDTO petRequestDTO) {
        return ResponseEntity.ok(petService.createPetRecord(petRequestDTO));
    }

    @PutMapping("/{id}")
    public ResponseEntity<PetResponseDTO> updatePetDetails(@PathVariable Long id, @Valid @RequestBody PetRequestDTO petRequestDTO) {
        return ResponseEntity.ok(petService.updatePetRecord(id, petRequestDTO));
    }

    @DeleteMapping("/{id}")
    public ResponseEntity<Void> deletePetDetails(@PathVariable Long id) {
        petService.deletePetRecord(id);
        return ResponseEntity.noContent().build();
    }

}
