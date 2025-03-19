package com.example.evalspring.model;

import jakarta.persistence.*;
import jakarta.validation.constraints.Min;
import jakarta.validation.constraints.NotBlank;

@Entity
@Table(name = "categorie")
public class Categorie {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Integer id;
    @Column(name ="libele",nullable = false)
    @NotBlank
    @Min(value = 2,message = "Le libele doit avoir au minimum 2 caractères")
    private String libele;
}
