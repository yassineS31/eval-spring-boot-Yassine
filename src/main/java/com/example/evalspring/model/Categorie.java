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

    // Constructeurs
    public Categorie() {}
    public Categorie(String libele) {
        this.libele = libele;
    }
    // Getters et Setters :

    public String getLibele() {
        return libele;
    }

    public void setLibele(String libele) {
        this.libele = libele;
    }

    public Integer getId() {
        return id;
    }

    public void setId(Integer id) {
        this.id = id;
    }
}
