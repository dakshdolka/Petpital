package com.petpital.vet_service.repository;

import java.time.LocalDate;
import java.util.Optional;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petpital.vet_service.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long>{

    Optional<Pet> findByPetNameAndEmail(String petName, String email);

    Optional<Pet> findByPetNameAndEmailAndRegisteredDateBetween(
        String petName,
        String email,
        LocalDate startDate,
        LocalDate endDate
    );

    void deleteById(Long id);
}
