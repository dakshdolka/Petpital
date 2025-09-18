package com.petpital.vet_service.model;

import com.fasterxml.jackson.annotation.JsonFormat;
import com.petpital.vet_service.util.SpeciesType;
import jakarta.persistence.*;
import jakarta.validation.constraints.Email;
import jakarta.validation.constraints.NotNull;
import lombok.Data;

import java.time.LocalDate;

import org.springframework.data.annotation.CreatedDate;

@Entity
@EntityListeners(org.springframework.data.jpa.domain.support.AuditingEntityListener.class)
@Data
@Table(name="Pets")
public class Pet {
    @Id
    @GeneratedValue(strategy = GenerationType.AUTO)
    private long id;
    @NotNull
    private String petName;
    @NotNull
    private String ownerName;
    @NotNull
    @Enumerated(EnumType.STRING)
    private SpeciesType species;
    @NotNull
    private String address;

    @CreatedDate
    @JsonFormat(pattern = "yyyy-MM-dd")
    private LocalDate registeredDate;

    private int visits = 0;
    
    @NotNull
    @Email
    private String email;
}