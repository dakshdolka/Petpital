package com.petpital.vet_service.repository;

import org.springframework.data.jpa.repository.JpaRepository;
import org.springframework.stereotype.Repository;

import com.petpital.vet_service.model.Pet;

@Repository
public interface PetRepository extends JpaRepository<Pet,Long>{
    
}
